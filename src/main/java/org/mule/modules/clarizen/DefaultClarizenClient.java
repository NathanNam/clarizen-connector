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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.xml.bind.JAXBException;
import javax.xml.namespace.QName;
import javax.xml.ws.BindingProvider;

import org.apache.commons.beanutils.BeanMap;
import org.apache.commons.beanutils.BeanUtils;
import org.apache.cxf.headers.Header;
import org.apache.cxf.jaxb.JAXBDataBinding;
import org.mule.modules.clarizen.api.ClarizenClient;
import org.mule.modules.clarizen.api.ClarizenClientHelper;
import org.mule.modules.clarizen.api.ClarizenServiceProvider;
import org.mule.modules.clarizen.api.model.AllIssueType;
import org.mule.modules.clarizen.api.model.BaseClarizenEntity;
import org.mule.modules.clarizen.api.model.ClarizenEntity;
import org.mule.modules.clarizen.api.model.Login;
import org.mule.modules.clarizen.api.model.WorkItemFilter;
import org.mule.modules.clarizen.api.model.WorkItemState;
import org.mule.modules.clarizen.api.model.WorkItemType;
import org.springframework.util.StringUtils;

import com.clarizen.api.ArrayOfBaseMessage;
import com.clarizen.api.Clarizen;
import com.clarizen.api.CreateMessage;
import com.clarizen.api.CreateResult;
import com.clarizen.api.DeleteMessage;
import com.clarizen.api.EntityId;
import com.clarizen.api.FieldValue;
import com.clarizen.api.GenericEntity;
import com.clarizen.api.GetCalendarInfoMessage;
import com.clarizen.api.GetCalendarInfoResult;
import com.clarizen.api.IClarizen;
import com.clarizen.api.IClarizenExecuteSessionTimeoutFailureFaultFaultMessage;
import com.clarizen.api.IClarizenLoginLoginFailureFaultFaultMessage;
import com.clarizen.api.IClarizenMetadataSessionTimeoutFailureFaultFaultMessage;
import com.clarizen.api.IClarizenQuerySessionTimeoutFailureFaultFaultMessage;
import com.clarizen.api.LifecycleMessage;
import com.clarizen.api.LoginOptions;
import com.clarizen.api.LoginResult;
import com.clarizen.api.Result;
import com.clarizen.api.RetrieveMessage;
import com.clarizen.api.RetrieveResult;
import com.clarizen.api.SessionHeader;
import com.clarizen.api.StringList;
import com.clarizen.api.UpdateMessage;
import com.clarizen.api.metadata.DescribeEntitiesMessage;
import com.clarizen.api.metadata.DescribeEntitiesResult;
import com.clarizen.api.metadata.EntityDescription;
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
    private static final String DEFAULT_PACKAGE_MODEL = "org.mule.modules.clarizen.api.model.";
    
    public DefaultClarizenClient(ClarizenServiceProvider provider) {
        helper = new ClarizenClientHelper();
        serviceProvider = provider;
    }
    
    @SuppressWarnings("unchecked")
    @Override
    public <T extends BaseClarizenEntity> List<T> createEntityQuery(List<String> fieldsToRetrieve,
            String queryTypeName, Condition condition, 
            Integer pageSize, Integer maxNumberOfPages) {
        
        EntityQuery query = new EntityQuery();
        query.setTypeName(queryTypeName);

        if (condition != null) {
            query.setWhere(condition);
        }

        List<GenericEntity> results = createQuery(query, fieldsToRetrieve, pageSize, maxNumberOfPages);

        return (List<T>) listBaseClarizenEntityFromGenericEntity(results, 
                    ((EntityQuery) query).getTypeName());
    }
    
    @SuppressWarnings("unchecked")
    @Override
    public <T extends BaseClarizenEntity> List<T> createIssuesQuery(List<String> fieldsToRetrieve,
            AllIssueType issueType, Condition condition, 
            Integer pageSize, Integer maxNumberOfPages) {

        EntityQuery query = new EntityQuery();
        query.setTypeName(issueType.value());

        if (condition != null) {
            query.setWhere(condition);
        }

        List<GenericEntity> results = createQuery(query, fieldsToRetrieve, pageSize, maxNumberOfPages);
        
        return (List<T>) listBaseClarizenEntityFromGenericEntity(results, 
                ((EntityQuery) query).getTypeName());
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

    @Override
    public List<GenericEntity> getMyWorkItems(List<String> fieldsToRetrieve,
            WorkItemState workItemState, WorkItemType workItemType,
            WorkItemFilter workItemFilter, Integer pageSize, Integer maxNumberOfPages) {
        
        MyWorkItemsQuery query = new MyWorkItemsQuery();
        query.setItemsState(helper.createWorkItemState(workItemState.value()));
        query.setItemsFilter(helper.createWorkItemFilter(workItemFilter.value()));
        query.setItemsType(helper.createWorkItemType(workItemType.value()));
        
        return createQuery(query, fieldsToRetrieve, pageSize, maxNumberOfPages);
    }

    public BaseClarizenEntity getWorkItemById(WorkItemType type, String workItemId, List<String> fieldsToRetrieve) {
        
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
        
        return toBaseClarizenEntity((GenericEntity) result.getEntity(), type.value());
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
            login = getService().login(username, password, opts);
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
        getService().logout();
    }

    @Override
    public List<GenericEntity> workItemsQuery(List<String> fieldsToRetrieve, WorkItemState workItemState,
                                        WorkItemType workItemType, WorkItemFilter workItemFilter,
                                        Integer pageSize, Integer maxNumberOfPages) {

        WorkItemsQuery query = new WorkItemsQuery();
        query.setItemsState(helper.createWorkItemState(workItemState.value()));
        query.setItemsFilter(helper.createWorkItemFilter(workItemFilter.value()));
        query.setItemsType(helper.createWorkItemType(workItemType.value()));
        
        return createQuery(query, fieldsToRetrieve, pageSize, maxNumberOfPages);
        
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
     * @param clarizenType type to be created
     * @return the created entity extending BaseClarizenEntity
     */
    private BaseClarizenEntity toBaseClarizenEntity(GenericEntity genericEntity, String clarizenType) {
        
        ClarizenEntity baseEntity = null;
        try {
            baseEntity = (ClarizenEntity) Class.forName(DEFAULT_PACKAGE_MODEL + 
                    StringUtils.capitalize(clarizenType)).newInstance();
        } catch (InstantiationException e1) {
            throw new ClarizenRuntimeException(e1);
        } catch (IllegalAccessException e1) {
            throw new ClarizenRuntimeException(e1);
        } catch (ClassNotFoundException e1) {
            throw new ClarizenRuntimeException(e1);
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
        Map<String, Object> entityFieldsMap = getFieldsFromGenericEntity(entityFields);
        
        try {
            BeanUtils.populate(baseEntity, entityFieldsMap);
        } catch (IllegalAccessException e) {
            throw new ClarizenRuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new ClarizenRuntimeException(e);
        }  
        
        return baseEntity;       
    }

    /**
     * Extracts the attributes from a GenericEntity using Clarizen model classes
     * 
     * @param entity
     * @return map of entity fields 
     */
    private Map<String, Object> getFieldsFromGenericEntity(List<FieldValue> entityFields) {
        Map<String, Object> entityMap = new HashMap<String, Object>();
        
        Object fieldValue;
        String fieldName;
        for (FieldValue field : entityFields) {
            fieldName = StringUtils.uncapitalize(field.getFieldName());

            if (field.getValue() != null)
            {
                //if it's a GenericEntity it must be converted into a model class
                if (field.getValue().getClass().getSimpleName().equals("GenericEntity")) {
                    fieldValue = toBaseClarizenEntity((GenericEntity) field.getValue(), 
                            ((GenericEntity) field.getValue()).getId().getTypeName());
                }
                else {
                    fieldValue = field.getValue();
                }
                
                entityMap.put(fieldName, fieldValue);
            }
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

        //Assigns entity id
        try {
            EntityId entityId = (EntityId) entity.getClass().getMethod("getId").invoke(entity);
            if (entityId == null) {
                newGenericEntity.setId(helper.createBaseEntityId(entity.getClass().getSimpleName(), null));
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
    @SuppressWarnings("rawtypes")
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

           if (fieldValue != null && isAttributeAnEntity(fieldValue.getClass())) {
               fieldValue = toGenericEntity(fieldValue);
           }
           
           //Convert attributes into GenericEntity
           if (fieldValue != null && !propertyName.equalsIgnoreCase("class") && !propertyName.equalsIgnoreCase("id")) {
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
        return BaseClarizenEntity.class.isAssignableFrom(clazz);
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
            String clarizenType) {
    
        List<BaseClarizenEntity> list = new ArrayList<BaseClarizenEntity>();
        
        for (GenericEntity genericEntity : listGenericEntity) {
            list.add(toBaseClarizenEntity(genericEntity, clarizenType));
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
    
    public ClarizenServiceProvider getServiceProvider() {
        return serviceProvider;
    }

    public String getSessionId() {
        return sessionId;
    }

    
    @SuppressWarnings({ "unchecked", "rawtypes" })
    @Override
    //TODO:complete operation!
    public GetCalendarInfoResult getCalendarInfo(EntityId userId) {
        GetCalendarInfoMessage getCalendarInfoMsg = new GetCalendarInfoMessage();
        
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
}