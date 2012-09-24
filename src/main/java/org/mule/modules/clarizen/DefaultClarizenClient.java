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
import java.util.Iterator;
import java.util.List;

import javax.xml.bind.JAXBException;
import javax.xml.namespace.QName;
import javax.xml.ws.BindingProvider;

import org.apache.commons.beanutils.BeanMap;
import org.apache.cxf.headers.Header;
import org.apache.cxf.jaxb.JAXBDataBinding;
import org.mule.modules.clarizen.api.ClarizenClient;
import org.mule.modules.clarizen.api.ClarizenClientHelper;
import org.mule.modules.clarizen.api.ClarizenServiceProvider;
import org.mule.modules.clarizen.api.model.AllIssueType;
import org.mule.modules.clarizen.api.model.ArrayOfEntity;
import org.mule.modules.clarizen.api.model.BaseClarizenEntity;
import org.mule.modules.clarizen.api.model.EntityMetadataDescription;
import org.mule.modules.clarizen.api.model.Login;
import org.mule.modules.clarizen.api.model.QueryCondition;
import org.mule.modules.clarizen.api.model.WorkItemFilter;
import org.mule.modules.clarizen.api.model.WorkItemState;
import org.mule.modules.clarizen.api.model.WorkItemType;

import com.clarizen.api.ArrayOfBaseMessage;
import com.clarizen.api.Clarizen;
import com.clarizen.api.CreateMessage;
import com.clarizen.api.CreateResult;
import com.clarizen.api.EntityId;
import com.clarizen.api.FieldValue;
import com.clarizen.api.GenericEntity;
import com.clarizen.api.IClarizen;
import com.clarizen.api.IClarizenExecuteSessionTimeoutFailureFaultFaultMessage;
import com.clarizen.api.IClarizenLoginLoginFailureFaultFaultMessage;
import com.clarizen.api.IClarizenMetadataSessionTimeoutFailureFaultFaultMessage;
import com.clarizen.api.IClarizenQuerySessionTimeoutFailureFaultFaultMessage;
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
import com.clarizen.api.metadata.ListEntitiesMessage;
import com.clarizen.api.metadata.ListEntitiesResult;
import com.clarizen.api.projectmanagement.MyWorkItemsQuery;
import com.clarizen.api.projectmanagement.WorkItemsQuery;
import com.clarizen.api.queries.EntityQuery;
import com.clarizen.api.queries.Paging;
import com.clarizen.api.queries.Query;
import com.clarizen.api.queries.QueryResult;

public class DefaultClarizenClient implements ClarizenClient {

    private ClarizenClientHelper helper;
    private IClarizen service;
    private ClarizenServiceProvider serviceProvider;
    private String sessionId;
    
    public DefaultClarizenClient(ClarizenServiceProvider provider) {
        helper = new ClarizenClientHelper();
        serviceProvider = provider;
    }

    @Override
    public ArrayOfEntity createEntityQuery(List<String> fieldsToRetrieve,
            String queryTypeName, QueryCondition condition, 
            Integer pageSize, Integer maxNumberOfPages) {
        
        EntityQuery query = new EntityQuery();
        query.setTypeName(queryTypeName);
        
        return createQuery(query, fieldsToRetrieve, pageSize, maxNumberOfPages);       
    }
    
    @Override
    public ArrayOfEntity createIssuesQuery(List<String> fieldsToRetrieve,
            AllIssueType issueType, QueryCondition condition, 
            Integer pageSize, Integer maxNumberOfPages) {

        EntityQuery query = new EntityQuery();
        query.setTypeName(issueType.value());
        
        return createQuery(query, fieldsToRetrieve, pageSize, maxNumberOfPages);
        
    }

    @Override
    public EntityMetadataDescription describeEntity(String typeName) {

        DescribeEntitiesMessage describeEntityMsg = new DescribeEntitiesMessage();
        StringList types = new StringList();
        types.getString().add(typeName);
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
        
        return new EntityMetadataDescription(result.getEntityDescriptions().getEntityDescription().get(0));
    }

    @Override
    public ArrayOfEntity getMyWorkItems(List<String> fieldsToRetrieve,
            WorkItemState workItemState, WorkItemType workItemType,
            WorkItemFilter workItemFilter, Integer pageSize, Integer maxNumberOfPages) {
        
        MyWorkItemsQuery query = new MyWorkItemsQuery();
        query.setItemsState(helper.createWorkItemState(workItemState.value()));
        query.setItemsFilter(helper.createWorkItemFilter(workItemFilter.value()));
        query.setItemsType(helper.createWorkItemType(workItemType.value()));
        
        return createQuery(query, fieldsToRetrieve, pageSize, maxNumberOfPages);
    }

    public GenericEntity getWorkItemById(WorkItemType type, String workItemId, List<String> fieldsToRetrieve) {
        
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
        
        return (GenericEntity) result.getEntity();
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
    public ArrayOfEntity workItemsQuery(List<String> fieldsToRetrieve, WorkItemState workItemState,
                                        WorkItemType workItemType, WorkItemFilter workItemFilter,
                                        Integer pageSize, Integer maxNumberOfPages) {

        WorkItemsQuery query = new WorkItemsQuery();
        query.setItemsState(helper.createWorkItemState(workItemState.value()));
        query.setItemsFilter(helper.createWorkItemFilter(workItemFilter.value()));
        query.setItemsType(helper.createWorkItemType(workItemType.value()));
        
        return createQuery(query, fieldsToRetrieve, pageSize, maxNumberOfPages);
        
    }
    
    @SuppressWarnings({ "unchecked", "rawtypes" })
    private ArrayOfEntity createQuery(Query query, List<String> fieldsToRetrieve, 
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
        
        return new ArrayOfEntity(listResults);
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
}