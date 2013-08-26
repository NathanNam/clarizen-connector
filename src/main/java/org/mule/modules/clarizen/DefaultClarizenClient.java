/**
 * Mule Clarizen Cloud Connector
 *
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */

package org.mule.modules.clarizen;

import java.lang.reflect.InvocationTargetException;
import java.util.*;

import javax.xml.bind.JAXBException;
import javax.xml.namespace.QName;
import javax.xml.ws.BindingProvider;

import com.clarizen.api.*;
import com.clarizen.api.files.*;
import org.apache.commons.beanutils.BeanMap;
import org.apache.commons.beanutils.BeanUtilsBean;
import org.apache.commons.beanutils.ConvertUtilsBean;
import org.apache.commons.beanutils.PropertyUtilsBean;
import org.apache.commons.lang.StringUtils;
import org.apache.cxf.headers.Header;
import org.apache.cxf.jaxb.JAXBDataBinding;
import org.apache.log4j.Logger;
import org.mule.modules.clarizen.api.ClarizenClient;
import org.mule.modules.clarizen.api.ClarizenClientHelper;
import org.mule.modules.clarizen.api.ClarizenServiceProvider;
import org.mule.modules.clarizen.api.ClarizenDateConverter;
import org.mule.modules.clarizen.api.model.AllIssueType;
import org.mule.modules.clarizen.api.model.BaseClarizenEntity;
import org.mule.modules.clarizen.api.model.Login;
import org.mule.modules.clarizen.api.model.WorkItemFilter;
import org.mule.modules.clarizen.api.model.WorkItemState;
import org.mule.modules.clarizen.api.model.WorkItemType;

import com.clarizen.api.files.DownloadMessage;
import com.clarizen.api.files.DownloadResult;
import com.clarizen.api.files.FileInformation;
import com.clarizen.api.metadata.DescribeEntitiesMessage;
import com.clarizen.api.metadata.DescribeEntitiesResult;
import com.clarizen.api.metadata.EntityDescription;
import com.clarizen.api.metadata.GetSystemSettingsValuesMessage;
import com.clarizen.api.metadata.GetSystemSettingsValuesResult;
import com.clarizen.api.metadata.ListEntitiesMessage;
import com.clarizen.api.metadata.ListEntitiesResult;
import com.clarizen.api.projectmanagement.MyWorkItemsQuery;
import com.clarizen.api.projectmanagement.WorkItemsQuery;
import com.clarizen.api.queries.Condition;
import com.clarizen.api.queries.EntityQuery;
import com.clarizen.api.queries.Paging;
import com.clarizen.api.queries.Query;
import com.clarizen.api.queries.QueryResult;

public class DefaultClarizenClient implements ClarizenClient {

    private ClarizenClientHelper helper;
    private IClarizen service;
    private ClarizenServiceProvider serviceProvider;
    private String sessionId;
    private ConvertUtilsBean convertUtilsBean;
    private ClarizenDateConverter clarizenDateConverter;
    private BeanUtilsBean beanUtilsBean;
    private static Logger logger = Logger.getLogger(DefaultClarizenClient.class);
    private static final String DEFAULT_DATE_CONVERTER_PATTERN = "yyyy-MM-dd'T'HH:mm:ssZ";
    private static final String DEFAULT_PACKAGE_MODEL = "org.mule.modules.clarizen.api.model.";
    
    
    /**
     * Package used for model classes containing only EntityId references
     */
    private static final String DEFAULT_PACKAGE_MODEL_FLAT = "org.mule.modules.clarizen.api.model.flat.";
    
    /**
     * Suffix for flat classes
     */
    private static final String SUFFIX_FLAT_CLASSES = "Flat";
    
    public DefaultClarizenClient(ClarizenServiceProvider provider) {
        helper = new ClarizenClientHelper();
        serviceProvider = provider;
        convertUtilsBean = new ConvertUtilsBean();
        clarizenDateConverter = new ClarizenDateConverter();
        clarizenDateConverter.setPattern(DEFAULT_DATE_CONVERTER_PATTERN);
        convertUtilsBean.register(clarizenDateConverter, java.util.Date.class);
        beanUtilsBean = new BeanUtilsBean(convertUtilsBean, new PropertyUtilsBean());        
    }
    
    @SuppressWarnings("unchecked")
    @Override
    public <T extends BaseClarizenEntity> List<T> createEntityQuery(List<String> fieldsToRetrieve,
            String queryTypeName, Condition condition, 
            Integer pageSize, Integer maxNumberOfPages, boolean useFlatClasses) {
        
        EntityQuery query = new EntityQuery();
        query.setTypeName(queryTypeName);

        if (condition != null) {
            query.setWhere(condition);
        }

        List<GenericEntity> results = createQuery(query, fieldsToRetrieve, pageSize, maxNumberOfPages);

        return (List<T>) listBaseClarizenEntityFromGenericEntity(results, 
                    ((EntityQuery) query).getTypeName(), useFlatClasses);
    }
    
    @SuppressWarnings("unchecked")
    @Override
    public <T extends BaseClarizenEntity> List<T> createIssuesQuery(List<String> fieldsToRetrieve,
            AllIssueType issueType, Condition condition, 
            Integer pageSize, Integer maxNumberOfPages, boolean useFlatClasses) {

        EntityQuery query = new EntityQuery();
        query.setTypeName(issueType.value());

        if (condition != null) {
            query.setWhere(condition);
        }

        List<GenericEntity> results = createQuery(query, fieldsToRetrieve, pageSize, maxNumberOfPages);
        
        return (List<T>) listBaseClarizenEntityFromGenericEntity(results, 
                ((EntityQuery) query).getTypeName(), useFlatClasses);
    }

    @Override
    public List<EntityDescription> describeEntities(List<String> typeNames) {

        DescribeEntitiesMessage describeEntityMsg = new DescribeEntitiesMessage();
        StringList types = new StringList();
        types.getString().addAll(typeNames);
        describeEntityMsg.setTypeNames(types);
        
        DescribeEntitiesResult result;
        try {
            result = ((DescribeEntitiesResult) getService().metadata(describeEntityMsg));
            
            if (!result.isSuccess()) {
                throw new ClarizenRuntimeException(result.getError().getErrorCode(), 
                        result.getError().getMessage());
            }
            
        } catch (IClarizenMetadataSessionTimeoutFailureFaultFaultMessage e) {
            throw new ClarizenSessionTimeoutException(e.getMessage());
        }
        
        return result.getEntityDescriptions().getEntityDescription();
    }

    @SuppressWarnings("unchecked")
    @Override
    public <T extends BaseClarizenEntity> List<T> getMyWorkItems(List<String> fieldsToRetrieve,
            WorkItemState workItemState, WorkItemType workItemType,
            WorkItemFilter workItemFilter, Integer pageSize, Integer maxNumberOfPages,
            Boolean useFlatClasses) {
        
        MyWorkItemsQuery query = new MyWorkItemsQuery();
        query.setItemsState(helper.createWorkItemState(workItemState.value()));
        query.setItemsFilter(helper.createWorkItemFilter(workItemFilter.value()));
        query.setItemsType(helper.createWorkItemType(workItemType.value()));
        
        List<GenericEntity> results = createQuery(query, fieldsToRetrieve, pageSize, maxNumberOfPages);
        String classToRetrieve = "WorkItem";
        
        if (workItemType != WorkItemType.ALL) {
            classToRetrieve = workItemType.value();
        }
        
        return (List<T>) listBaseClarizenEntityFromGenericEntity(results, 
                classToRetrieve, useFlatClasses);
    }

    public BaseClarizenEntity getWorkItemById(WorkItemType type, String workItemId, 
            List<String> fieldsToRetrieve, boolean useFlatClasses) {
        
        RetrieveMessage retrieveMsg = new RetrieveMessage();
        retrieveMsg.setId(helper.createBaseEntityId(type.value(), workItemId));

        // Fields to be retrieved
        StringList fields = new StringList();
        if (fieldsToRetrieve != null) {
            fields.getString().addAll(fieldsToRetrieve);
        }

        if (fields != null) {
            retrieveMsg.setFields(fields);
        }

        ArrayOfBaseMessage messages = helper.createMessage(retrieveMsg);

        RetrieveResult result;
        try {
            result = (RetrieveResult) getService().execute(messages).getResult().get(0);
            if (!result.isSuccess()) {
                throw new ClarizenRuntimeException(result.getError().getErrorCode(), 
                        result.getError().getMessage());
            }
        } catch (IClarizenExecuteSessionTimeoutFailureFaultFaultMessage e) {
            throw new ClarizenSessionTimeoutException(e.getMessage());
        }
        
        //Creates a non-flat ClarizenEntity
        BaseClarizenEntity baseClarizenEntity = createBaseClarizenEntity(type.value(), false);
        return toBaseClarizenEntity((GenericEntity) result.getEntity(), baseClarizenEntity, 
                type.value(), useFlatClasses);
    }

    @Override
    public List<String> listEntities() {

        ListEntitiesMessage listEntityMsg = new ListEntitiesMessage();
        
        ListEntitiesResult result;
        try {
            result = ((ListEntitiesResult) getService().metadata(listEntityMsg));
            
            if (!result.isSuccess()) {
                throw new ClarizenRuntimeException(result.getError().getErrorCode(), 
                        result.getError().getMessage());
            }
            
        } catch (IClarizenMetadataSessionTimeoutFailureFaultFaultMessage e) {
            throw new ClarizenSessionTimeoutException(e.getMessage());
        }
        
        return result.getTypeNames().getString();
    }
    
    @Override
    public Login login(String username, String password, String applicationId, String partnerId) {
        
        LoginOptions opts = new LoginOptions();
        opts.setApplicationId(applicationId);
        opts.setPartnerId(partnerId);
        
        LoginResult login;
        try {
            GetServerDefinitionResult response = getService().getServerDefinition(username, password, null);
            String clarizenClientUrl = response.getServerLocation();
            System.out.println("Clarizen client URL: " + clarizenClientUrl);
            login = getService(clarizenClientUrl).login(username, password, opts);
        } catch (IClarizenLoginLoginFailureFaultFaultMessage e) {
            throw new ClarizenRuntimeException(e);
        }
        
        SessionHeader sessionHeader = new SessionHeader();
        sessionHeader.setID(login.getSessionId());
        
        setSessionId(login.getSessionId());
                
        try {
            ((BindingProvider) getService()).getRequestContext().put(
                    Header.HEADER_LIST,
                    Arrays.asList(new Header(new QName(
                            Clarizen.SERVICE.getNamespaceURI(), "Session"), 
                            helper.createSessionHeader(getSessionId()),
                            new JAXBDataBinding(SessionHeader.class))));
        } catch (JAXBException e1) {
            throw new RuntimeException(e1);
        }
        
        return new Login(login);
    }

    @Override
    public void logout() {
        if (this.service != null) {
            this.service.logout();
            this.service = null;
        }
    }

    @SuppressWarnings("unchecked")
    @Override
    public <T extends BaseClarizenEntity> List<T> workItemsQuery(List<String> fieldsToRetrieve, 
                                        WorkItemState workItemState, WorkItemType workItemType, 
                                        WorkItemFilter workItemFilter, Integer pageSize, 
                                        Integer maxNumberOfPages, Boolean useFlatClasses) {

        WorkItemsQuery query = new WorkItemsQuery();
        query.setItemsState(helper.createWorkItemState(workItemState.value()));
        query.setItemsFilter(helper.createWorkItemFilter(workItemFilter.value()));
        query.setItemsType(helper.createWorkItemType(workItemType.value()));
        
        List<GenericEntity> results = createQuery(query, fieldsToRetrieve, pageSize, maxNumberOfPages);
        String classToRetrieve = "WorkItem";
        
        if (workItemType != WorkItemType.ALL) {
            classToRetrieve = workItemType.value();
        }
        
        return (List<T>) listBaseClarizenEntityFromGenericEntity(results, 
                classToRetrieve, useFlatClasses);
        
    }
    
    @SuppressWarnings({ "unchecked", "rawtypes" })
    private List<GenericEntity> createQuery(Query query, List<String> fieldsToRetrieve, 
                                      Integer pageSize, Integer maxNumberOfPages) {
        
        int pageNumber = 0;
        List<GenericEntity> listResults = new ArrayList<GenericEntity>();

        /* Default value for pageSize */
        if (pageSize > 1000 || pageSize < 100) {
           pageSize = 100;
        }

        // Fields to be retrieved
        StringList fields = new StringList();
        if (fieldsToRetrieve != null) {
            fields.getString().addAll(fieldsToRetrieve);
        }

        if (fields != null) {
            try {
                query.getClass().getMethod("setFields", StringList.class).invoke(query, fields);
            } catch (IllegalArgumentException e) {
                throw new ClarizenRuntimeException(e);
            } catch (SecurityException e) {
                throw new ClarizenRuntimeException(e);
            } catch (IllegalAccessException e) {
                throw new ClarizenRuntimeException(e);
            } catch (InvocationTargetException e) {
                throw new ClarizenRuntimeException(e);
            } catch (NoSuchMethodException e) {
                throw new ClarizenRuntimeException(e);
            }            
        }

        QueryResult queryResult;
        query.setPaging(new Paging());
        try {
            do {
                query.getPaging().setPageNumber(pageNumber);
                query.getPaging().setPageSize(pageSize);
                queryResult = getService().query(query);
                
                if (!queryResult.isSuccess()) {
                    throw new ClarizenRuntimeException(queryResult.getError().getErrorCode(), 
                            queryResult.getError().getMessage());
                }
                
                pageNumber++;
                listResults.addAll((List) queryResult.getEntities().getBaseEntity());
                
            } while (queryResult.getPaging().isHasMore() && pageNumber != maxNumberOfPages);

        } catch (IClarizenQuerySessionTimeoutFailureFaultFaultMessage e) {
            throw new ClarizenSessionTimeoutException(e.getMessage());
        }
        
        return listResults;
    }

    @SuppressWarnings({ "unchecked", "rawtypes" })
    @Override
    public Boolean lifecycleChange(List<EntityId> entityIdList, 
            String operation, Boolean recursive) {
        
        LifecycleMessage lifecycleMessage = new LifecycleMessage();
        lifecycleMessage.setIds(helper.createArrayOfEntityId(entityIdList));
        lifecycleMessage.setOperation(operation);
        lifecycleMessage.setRecursive(recursive);
        
        ArrayOfBaseMessage messages = new ArrayOfBaseMessage();
        messages.getBaseMessage().add(lifecycleMessage);
        
        List<Result> results;
        try {
            results = (List) getService().execute(messages).getResult();
            
            for (Result result: results) {
                if (!result.isSuccess()) {
                    throw new ClarizenRuntimeException(result.getError().getErrorCode(), 
                            result.getError().getMessage());
                }
            }
            
        } catch (IClarizenExecuteSessionTimeoutFailureFaultFaultMessage e) {
            throw new ClarizenSessionTimeoutException(e.getMessage());
        }
        
        return true;
    }

    @SuppressWarnings({ "unchecked", "rawtypes" })
    @Override
    public BaseClarizenEntity createEntity(BaseClarizenEntity entity) {

        GenericEntity genericEntity = toGenericEntity(entity);
        
        CreateMessage entityMessage = new CreateMessage();
        entityMessage.setEntity(genericEntity);
        
        ArrayOfBaseMessage messages = new ArrayOfBaseMessage();
        messages.getBaseMessage().add(entityMessage);
        
        List<CreateResult> results;
        try {
            results = (List) getService().execute(messages).getResult();
            
            for (Result result: results) {
                if (!result.isSuccess()) {
                    throw new ClarizenRuntimeException(result.getError().getErrorCode(), 
                            result.getError().getMessage());
                }
            }
            
        } catch (IClarizenExecuteSessionTimeoutFailureFaultFaultMessage e) {
            throw new ClarizenSessionTimeoutException(e.getMessage());
        }
        
        if(results.get(0).getId() != null) {
            entity.setId(results.get(0).getId());
        }
        
        return entity;
    }

    @Override
    public BaseClarizenEntity updateEntity(BaseClarizenEntity entity) {
        
        GenericEntity genericEntity = toGenericEntity(entity);
        
        UpdateMessage updateMsg = new UpdateMessage();
        updateMsg.setEntity(genericEntity);

        ArrayOfBaseMessage messages = helper.createMessage(updateMsg);

        try {
            Result result = getService().execute(messages).getResult().get(0);
            
            if (!result.isSuccess()) {
                throw new ClarizenRuntimeException(result.getError().getErrorCode(), 
                        result.getError().getMessage());
            }
            
        } catch (IClarizenExecuteSessionTimeoutFailureFaultFaultMessage e) {
            throw new ClarizenSessionTimeoutException(e.getMessage());
        }
        
        return entity;        
    }
    
    @Override
    public Boolean deleteEntity(BaseClarizenEntity entity) {
        
        DeleteMessage deleteMsg = new DeleteMessage();
        deleteMsg.setId(entity.getId());

        ArrayOfBaseMessage messages = helper.createMessage(deleteMsg);

        try {
            Result result = getService().execute(messages).getResult().get(0);
            
            if (!result.isSuccess()) {
                throw new ClarizenRuntimeException(result.getError().getErrorCode(), 
                        result.getError().getMessage());
            }
            
        } catch (IClarizenExecuteSessionTimeoutFailureFaultFaultMessage e) {
            throw new ClarizenSessionTimeoutException(e.getMessage());
        }
        
        return true;
    }
    
    /**
     * Converts a GenericEntity into a model class.
     * This is useful for obtaining the java classes from the Clarizen WebService responses
     * 
     * @param genericEntity to be converted
     * @param newEntity if it's null the method will create a new class depending on useFlatClasses parameters
     * @param clarizenType type to be created
     * @param useFlatClasses defines if the method will use flatClasses
     * @return the created entity extending BaseClarizenEntity
     */
    private BaseClarizenEntity toBaseClarizenEntity(GenericEntity genericEntity, 
            BaseClarizenEntity newEntity, String clarizenType, boolean useFlatClasses) {
        
        BaseClarizenEntity baseEntity = null;
        
        if (newEntity != null) {
            baseEntity = newEntity;
        }
        else {
            baseEntity = createBaseClarizenEntity(clarizenType, useFlatClasses);
        }

        //Assigns entity id
        try {
            EntityId entityId = (EntityId) genericEntity.getClass().getMethod("getId").invoke(genericEntity);
            if (entityId == null) {
                baseEntity.setId(helper.createBaseEntityId(genericEntity.getClass().getSimpleName(), null));
            }
            else {
                baseEntity.setId(entityId);
            }
        } catch (IllegalArgumentException e) {
            throw new ClarizenRuntimeException(e);
        } catch (SecurityException e) {
            throw new ClarizenRuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new ClarizenRuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new ClarizenRuntimeException(e);
        } catch (NoSuchMethodException e) {
            throw new ClarizenRuntimeException(e);
        }

        List<FieldValue> entityFields = genericEntity.getValues().getFieldValue();
        Map<String, Object> entityFieldsMap = getFieldsFromGenericEntity(entityFields, useFlatClasses);
        
        try {
            beanUtilsBean.populate(baseEntity, entityFieldsMap);
        } catch (IllegalAccessException e) {
            throw new ClarizenRuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new ClarizenRuntimeException(e);
        }  
        
        return baseEntity;       
    }

    /**
     * Creates a new BaseClarizenEntity
     * @param clarizenType
     * @param useFlatClasses
     * @return
     */
    private BaseClarizenEntity createBaseClarizenEntity(String clarizenType,
            boolean useFlatClasses) {
        String defaultPackageModel;
        String clarizenClassName;
        if (useFlatClasses) {
            defaultPackageModel = DEFAULT_PACKAGE_MODEL_FLAT;
            clarizenClassName = defaultPackageModel + 
            StringUtils.capitalize(clarizenType) + SUFFIX_FLAT_CLASSES;
        } 
        else {
            defaultPackageModel = DEFAULT_PACKAGE_MODEL;
            clarizenClassName = defaultPackageModel + 
                    StringUtils.capitalize(clarizenType);
        }
   
        try {
            return (BaseClarizenEntity) Class.forName(clarizenClassName).newInstance();
        } catch (InstantiationException e1) {
            throw new ClarizenRuntimeException(e1);
        } catch (IllegalAccessException e1) {
            throw new ClarizenRuntimeException(e1);
        } catch (ClassNotFoundException e1) {
            throw new ClarizenRuntimeException(e1);
        }
    }

    /**
     * Extracts the attributes from a GenericEntity using Clarizen model classes
     * 
     * @param entity
     * @return map of entity fields 
     */
    private Map<String, Object> getFieldsFromGenericEntity(List<FieldValue> entityFields,
            boolean useFlatClasses) {

        Map<String, Object> entityMap = new HashMap<String, Object>();
        
        Object fieldValue;
        String fieldName;
        List<FieldValue> customFields = new ArrayList<FieldValue>();

        for (FieldValue field : entityFields) {
        	if(field == null) {
        		logger.warn("Unavailable field requested. Check your clarizen fields to retrieve.");
        		continue;
        	} else {
        		if (field.getValue() == null) {
        			continue;
        		}
        		
        		fieldName = StringUtils.uncapitalize(field.getFieldName());
        		//Custom fields starts with c_
        		if (fieldName.startsWith("c_")) {
        			customFields.add(field);
        		} else {
        			if (field.getValue() instanceof GenericEntity) {
        				fieldValue = toBaseClarizenEntity((GenericEntity) field.getValue(), null,
        						((GenericEntity) field.getValue()).getId().getTypeName(), useFlatClasses);
        			}
        			else {
        				fieldValue = field.getValue();
        			}
        			entityMap.put(fieldName, fieldValue);
        		}
        		//if it's a GenericEntity it must be converted into a model class
        	}
        }
        
        //adds customFields
        if (customFields != null && customFields.size() > 0) {
            entityMap.put("customFields", customFields);
        }
        
        return entityMap;
    }
    
    /**
     * Converts a general entity into a GenericEntity.
     * This is useful for obtaining the objects needed from the Clarizen WebService.
     * 
     * @param entity
     * @return the created GenericEntity
     */
    private GenericEntity toGenericEntity(Object entity) {
        
        GenericEntity newGenericEntity = new GenericEntity();

        //For flat classes (only references to EntityIds)
        if (isAnEntityId(entity.getClass(), null)) {
            newGenericEntity.setId((EntityId) entity);
            return newGenericEntity;
        }
        
        //Assigns entity id
        try {
            EntityId entityId = (EntityId) entity.getClass().getMethod("getId").invoke(entity);
            if (entityId == null) {
                newGenericEntity.setId(helper.createBaseEntityId(extractFlatName(entity.getClass().getSimpleName()), null));
            }
            else {
                newGenericEntity.setId(entityId);
            }
        } catch (IllegalArgumentException e) {
            throw new ClarizenRuntimeException(e);
        } catch (SecurityException e) {
            throw new ClarizenRuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new ClarizenRuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new ClarizenRuntimeException(e);
        } catch (NoSuchMethodException e) {
            throw new ClarizenRuntimeException(e);
        }

        List<FieldValue> entityFields = getFieldValuesFromBean(entity);
        
        if (entityFields != null) {
            newGenericEntity.setValues(helper.createGenericEntityArrayOfFieldValue(entityFields));
        }
        
        return newGenericEntity;       
    }
    
    /**
     * Extracts the attributes from a bean
     * 
     * @param entity
     * @return a list of FieldValue objects 
     */
    @SuppressWarnings({ "rawtypes", "unchecked" })
    private List<FieldValue> getFieldValuesFromBean(Object entity) {
        List<FieldValue> fields = new ArrayList<FieldValue>();

        //Gets the Bean properties
        BeanMap beanMap = new BeanMap(entity);
        String propertyName;
        Object fieldValue;
        Iterator keyIterator = beanMap.keySet().iterator();

        while (keyIterator.hasNext()) {
           propertyName = (String) keyIterator.next();
           fieldValue = beanMap.get(propertyName);
           
           if (fieldValue == null) {
               continue;
           }
           
           //adds customFields
           if (propertyName.equalsIgnoreCase("customFields")) {
               fields.addAll((List<FieldValue>) fieldValue);
               continue;
           }

           //Convert attributes into GenericEntity
           if (isAttributeAnEntity(fieldValue.getClass()) 
                   || isAnEntityId(fieldValue.getClass(), propertyName)) {
               fieldValue = toGenericEntity(fieldValue);
           }
           
           if (!propertyName.equalsIgnoreCase("class") && !propertyName.equalsIgnoreCase("id")) {
               fields.add(helper.createFieldValue(propertyName, fieldValue));
           }
        }
            
        return fields;
    }

    /**
     * Checks if the class extends from the Clarizen Connector model classes.
     * It's used for creating the recursive GenericEntity's needed from the
     * Clarizen WebService.
     * 
     * @param clazz
     * @return true if the attribute has to be converted into a GenericEntity
     */
    private boolean isAttributeAnEntity(Class<? extends Object> clazz) {
        return org.mule.modules.clarizen.api.model.BaseClarizenEntity.class.isAssignableFrom(clazz);
    }
    
    /**
     * Checks if the attribute is an EntityId. This is useful for flat model classes.
     * It ignores entityType and id, two fields used by Clarizen for sending EntityIds
     * @param clazz
     * @return true if the attribute is an EntityId class
     */
    private boolean isAnEntityId(Class<? extends Object> clazz, String entityName) {
        return EntityId.class.isAssignableFrom(clazz) && 
                !StringUtils.equals(entityName, "entityType") && 
                !StringUtils.equals(entityName, "id");
    }
    
    /**
     * Extracts Flat from classNames
     * @param className
     * @return class name without Flat
     */
    private String extractFlatName(String className) {
        return StringUtils.removeEnd(className, "Flat");
    }
    
    /**
     * Converts a List of GenericEntity's into a List of model classes.
     * This is useful for obtaining the java classes from the Clarizen WebService responses
     * 
     * @param entity to be converted
     * @param clarizenType type to be created
     * @return the created entity extending BaseClarizenEntity
     */
    private List<BaseClarizenEntity> listBaseClarizenEntityFromGenericEntity(List<GenericEntity> listGenericEntity, 
            String clarizenType, boolean useFlatClasses) {
    
        List<BaseClarizenEntity> list = new ArrayList<BaseClarizenEntity>();
        
        for (GenericEntity genericEntity : listGenericEntity) {
            //Creates a non-flat ClarizenEntity
            BaseClarizenEntity newEntity = createBaseClarizenEntity(clarizenType, false);
            list.add(toBaseClarizenEntity(genericEntity, newEntity, clarizenType, useFlatClasses));
        }
        
        return list;
    }
    
    public ClarizenClientHelper getHelper() {
        return helper;
    }
    
    public void setHelper(ClarizenClientHelper helper) {
        this.helper = helper;
    }

    public void setService(IClarizen service) {
        this.service = service;
    }

    public void setServiceProvider(ClarizenServiceProvider serviceProvider) {
        this.serviceProvider = serviceProvider;
    }
    
    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }
    
    protected IClarizen getService() {
        if (service == null) {
            service = serviceProvider.getService();
        }

        return service;
    }

    protected IClarizen getService(String address) {
        if (service == null) {
            service = serviceProvider.getService(address);
        }

        return service;
    }
    
    public ClarizenServiceProvider getServiceProvider() {
        return serviceProvider;
    }

    public String getSessionId() {
        return sessionId;
    }

    
    @SuppressWarnings({ "unchecked", "rawtypes" })
    @Override
    public GetCalendarInfoResult getCalendarInfo(EntityId userId) {
        GetCalendarInfoMessage getCalendarInfoMsg = new GetCalendarInfoMessage();
        getCalendarInfoMsg.setUserId(userId);
        
        ArrayOfBaseMessage messages = new ArrayOfBaseMessage();
        messages.getBaseMessage().add(getCalendarInfoMsg);
        
        List<Result> results;
        try {
            results = (List) getService().execute(messages).getResult();
            
            for (Result result: results) {
                if (!result.isSuccess()) {
                    throw new ClarizenRuntimeException(result.getError().getErrorCode(), 
                            result.getError().getMessage());
                }
            }
            
        } catch (IClarizenExecuteSessionTimeoutFailureFaultFaultMessage e) {
            throw new ClarizenSessionTimeoutException(e.getMessage());
        }
        
        return (GetCalendarInfoResult) results.get(0);
    }
    
    @SuppressWarnings({ "unchecked", "rawtypes" })
    @Override
    public List<Object> getSystemSettings(List<String> settingList) {
        GetSystemSettingsValuesMessage getSystemSettingsInfoMsg = new GetSystemSettingsValuesMessage();
        getSystemSettingsInfoMsg.setSettings(helper.createStringList(settingList));
        
        ArrayOfBaseMessage messages = new ArrayOfBaseMessage();
        messages.getBaseMessage().add(getSystemSettingsInfoMsg);
        
        List<Object> listOfResults = new ArrayList<Object>();
        
        List<Result> results;
        try {
            results = (List) getService().execute(messages).getResult();
            
            for (Result result: results) {
                if (!result.isSuccess()) {
                    throw new ClarizenRuntimeException(result.getError().getErrorCode(), 
                            result.getError().getMessage());
                }
                
                listOfResults.addAll(((GetSystemSettingsValuesResult) result).getValues().getAnyType());
            }
            
        } catch (IClarizenExecuteSessionTimeoutFailureFaultFaultMessage e) {
            throw new ClarizenSessionTimeoutException(e.getMessage());
        }
        
        return listOfResults;
    }

    @SuppressWarnings({ "unchecked", "rawtypes" })
    @Override
    public BaseClarizenEntity createFromTemplate(String templateName, BaseClarizenEntity entity) {
        
        CreateFromTemplateMessage createFromTemplateMsg = new CreateFromTemplateMessage();
        createFromTemplateMsg.setTemplateName(templateName);
        createFromTemplateMsg.setEntity(toGenericEntity(entity));
        
        ArrayOfBaseMessage messages = new ArrayOfBaseMessage();
        messages.getBaseMessage().add(createFromTemplateMsg);
        
        List<CreateResult> results;
        try {
            results = (List) getService().execute(messages).getResult();
            
            for (Result result: results) {
                if (!result.isSuccess()) {
                    throw new ClarizenRuntimeException(result.getError().getErrorCode(), 
                            result.getError().getMessage());
                }
            }
            
        } catch (IClarizenExecuteSessionTimeoutFailureFaultFaultMessage e) {
            throw new ClarizenSessionTimeoutException(e.getMessage());
        }
        
        if (results.get(0).getId() != null) {
            entity.setId(results.get(0).getId());
        }
        
        return entity;
    }
    
    @SuppressWarnings({ "unchecked", "rawtypes" })
    @Override
    public FileInformation downloadFileInformation(BaseClarizenEntity entity) {
        
        DownloadMessage downloadMessage = new DownloadMessage();
        downloadMessage.setDocumentId(entity.getId());
        
        ArrayOfBaseMessage messages = new ArrayOfBaseMessage();
        messages.getBaseMessage().add(downloadMessage);
        
        List<DownloadResult> results;
        try {
            results = (List) getService().execute(messages).getResult();
            
            for (Result result: results) {
                if (!result.isSuccess()) {
                    throw new ClarizenRuntimeException(result.getError().getErrorCode(), 
                            result.getError().getMessage());
                }
            }

        } catch (IClarizenExecuteSessionTimeoutFailureFaultFaultMessage e) {
            throw new ClarizenSessionTimeoutException(e.getMessage());
        }
        
        return results.get(0).getFileInformation();
    }

    @SuppressWarnings({ "unchecked", "rawtypes" })
    @Override
    public Boolean sendEmail(AccessType accessType, String body, String subject,
            List<Recipient> recipients, BaseClarizenEntity relatedEntity) {
        
        SendEMailMessage sendEmailMessage = new SendEMailMessage();
        sendEmailMessage.setAccessType(accessType);
        sendEmailMessage.setBody(body);
        sendEmailMessage.setSubject(subject);

        if (recipients != null) {
            sendEmailMessage.setRecipients(helper.createArrayOfRecipients(recipients));
        }
        
        if (relatedEntity != null) {
            sendEmailMessage.setRelatedEntity(relatedEntity.getId());
        }
        
        ArrayOfBaseMessage messages = new ArrayOfBaseMessage();
        messages.getBaseMessage().add(sendEmailMessage);
        
        List<Result> results;
        try {
            results = (List) getService().execute(messages).getResult();
            
            for (Result result: results) {
                if (!result.isSuccess()) {
                    throw new ClarizenRuntimeException(result.getError().getErrorCode(), 
                            result.getError().getMessage());
                }
            }

        } catch (IClarizenExecuteSessionTimeoutFailureFaultFaultMessage e) {
            throw new ClarizenSessionTimeoutException(e.getMessage());
        }
        
        return true;
    }

    @Override
    public Boolean attachFileUrlToEntity(EntityId entityId, String attachmentUrl, String attachmentFilename) {
        //1. Create a Document entity
        GenericEntity document = new GenericEntity();

        // Document Id
        EntityId documentEntityId = new EntityId();
        documentEntityId.setTypeName("Document");
        documentEntityId.setValue(UUID.randomUUID().toString());
        document.setId(documentEntityId);

        // Document name (file name)
        FieldValue nameValue = new FieldValue();
        nameValue.setFieldName("Name");
        nameValue.setValue(attachmentFilename);

        ArrayOfFieldValue arrayOfFieldValues = new ArrayOfFieldValue();
        arrayOfFieldValues.getFieldValue().add(nameValue);
        document.setValues(arrayOfFieldValues);

        // --- Assemble Create Message for Document
        CreateMessage createDocumentMessage = new CreateMessage();
        createDocumentMessage.setEntity(document);

        //Step 2: Create a link between WorkItem and Document
        GenericEntity link = new GenericEntity();

        // Link Id
        EntityId linkEntityId = new EntityId();
        linkEntityId.setTypeName("AttachmentLink");
        linkEntityId.setValue(UUID.randomUUID().toString());
        link.setId(linkEntityId);

        // Prepare reference to Task
        FieldValue entityIdField = new FieldValue();
        entityIdField.setFieldName("Entity");
        entityIdField.setValue(entityId);

        // Prepare reference to new document
        FieldValue documentId = new FieldValue();
        documentId.setFieldName("Document");
        documentId.setValue(document.getId());

        // Include both references in Link
        ArrayOfFieldValue arrayOfLinkFieldValues = new ArrayOfFieldValue();
        arrayOfLinkFieldValues.getFieldValue().add(entityIdField);
        arrayOfLinkFieldValues.getFieldValue().add(documentId);
        link.setValues(arrayOfLinkFieldValues);

        // --- Assemble Create Message for Link
        CreateMessage createLinkMessage = new CreateMessage();
        createLinkMessage.setEntity(link);

        //Step 3: Upload the file
        FileInformation fileInformation = new FileInformation();
        fileInformation.setStorage(Storage.URL);
        fileInformation.setUrl(attachmentUrl );
        fileInformation.setFileName(attachmentFilename);

        // --- Assemble Upload Message
        UploadMessage uploadMessage = new UploadMessage();
        uploadMessage.setFileInformation(fileInformation);
        uploadMessage.setDocumentId(document.getId());


        //Perform all 3 steps in 1 call to the web service:
        ArrayOfBaseMessage messages = new ArrayOfBaseMessage();
        messages.getBaseMessage().add(createDocumentMessage);
        messages.getBaseMessage().add(createLinkMessage);
        messages.getBaseMessage().add(uploadMessage);

        List<Result> results;
        try {
            results = getService().execute(messages).getResult();

            for (Result result: results) {
                if (!result.isSuccess()) {
                    throw new ClarizenRuntimeException(result.getError().getErrorCode(),
                            result.getError().getMessage());
                }
            }

        } catch (IClarizenExecuteSessionTimeoutFailureFaultFaultMessage e) {
            throw new ClarizenSessionTimeoutException(e.getMessage());
        }

        return true;
    }

    public ConvertUtilsBean getConvertUtilsBean() {
        return convertUtilsBean;
    }

    public ClarizenDateConverter getXmlGregorianCalendarConverter() {
        return clarizenDateConverter;
    }

    public void setConvertUtilsBean(ConvertUtilsBean convertUtilsBean) {
        this.convertUtilsBean = convertUtilsBean;
    }

    public void setXmlGregorianCalendarConverter(
            ClarizenDateConverter xmlGregorianCalendarConverter) {
        this.clarizenDateConverter = xmlGregorianCalendarConverter;
    }
}