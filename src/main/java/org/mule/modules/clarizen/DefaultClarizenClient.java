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

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.bind.JAXBException;
import javax.xml.namespace.QName;
import javax.xml.ws.BindingProvider;

import org.apache.commons.lang.Validate;
import org.apache.cxf.headers.Header;
import org.apache.cxf.jaxb.JAXBDataBinding;
import org.mule.modules.clarizen.api.ClarizenClient;
import org.mule.modules.clarizen.api.ClarizenClientHelper;
import org.mule.modules.clarizen.api.ClarizenServiceProvider;
import org.mule.modules.clarizen.api.model.AllIssueType;
import org.mule.modules.clarizen.api.model.ArrayOfEntity;
import org.mule.modules.clarizen.api.model.Entity;
import org.mule.modules.clarizen.api.model.Login;
import org.mule.modules.clarizen.api.model.Operator;
import org.mule.modules.clarizen.api.model.WorkItemFilter;
import org.mule.modules.clarizen.api.model.WorkItemState;
import org.mule.modules.clarizen.api.model.WorkItemType;
import org.mule.util.StringUtils;
import org.mule.util.UUID;

import com.clarizen.api.ArrayOfBaseMessage;
import com.clarizen.api.Clarizen;
import com.clarizen.api.CreateMessage;
import com.clarizen.api.FieldValue;
import com.clarizen.api.GenericEntity;
import com.clarizen.api.IClarizen;
import com.clarizen.api.IClarizenExecuteSessionTimeoutFailureFaultFaultMessage;
import com.clarizen.api.IClarizenLoginLoginFailureFaultFaultMessage;
import com.clarizen.api.IClarizenQuerySessionTimeoutFailureFaultFaultMessage;
import com.clarizen.api.LoginOptions;
import com.clarizen.api.LoginResult;
import com.clarizen.api.Result;
import com.clarizen.api.RetrieveMessage;
import com.clarizen.api.RetrieveResult;
import com.clarizen.api.SessionHeader;
import com.clarizen.api.StringList;
import com.clarizen.api.UpdateMessage;
import com.clarizen.api.projectmanagement.MyWorkItemsQuery;
import com.clarizen.api.projectmanagement.WorkItemsQuery;
import com.clarizen.api.queries.Compare;
import com.clarizen.api.queries.EntityQuery;
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
    public Entity addWorkItemResources(Entity workItem,
            String resourceId, String units) {
        
        GenericEntity humanResource = new GenericEntity();
        humanResource.setId(helper.createBaseEntityId("ResourceLink", null));
        GenericEntity user = new GenericEntity();
        user.setId(helper.createBaseEntityId("User", resourceId));        
        
        List<FieldValue> fields = new ArrayList<FieldValue>();
        FieldValue fieldWorkItem = helper.createFieldValue("WorkItem", workItem.getGenericEntity());
        FieldValue fieldResource = helper.createFieldValue("Resource", user);
        FieldValue fieldUnits = helper.createFieldValue("Units", units);
        
        fields.add(fieldWorkItem);
        fields.add(fieldResource);
        fields.add(fieldUnits);
        
        humanResource.setValues(helper.createGenericEntityArrayOfFieldValue(fields));
        
        CreateMessage workItemResourceMessage = new CreateMessage();
        workItemResourceMessage.setEntity(humanResource);

        ArrayOfBaseMessage messages = helper.createMessage(workItemResourceMessage);

        try {
            Result result = getService().execute(messages).getResult().get(0);
            
            if (!result.isSuccess()) {
                throw new ClarizenRuntimeException(result.getError().getErrorCode(), 
                        result.getError().getMessage());
            }
            
        } catch (IClarizenExecuteSessionTimeoutFailureFaultFaultMessage e) {
            throw new ClarizenSessionTimeoutException(e.getMessage());
        }
        
        return new Entity(humanResource);
    }

    @Override
    public Entity createCase(AllIssueType issueType, String title, Map<String, Object> caseFields) {
        
        GenericEntity caseEntity = new GenericEntity();
        caseEntity.setId(helper.createBaseEntityId(issueType.value(), UUID.getUUID()));
        
        FieldValue titleField = helper.createFieldValue("Title", title);
        
        List<FieldValue> fields = new ArrayList<FieldValue>();
        fields.add(titleField);
        
        if (caseFields != null) {
            for (Map.Entry<String, Object> fieldValue : caseFields.entrySet()) {
                fields.add(helper.createFieldValue(fieldValue.getKey(), fieldValue.getValue()));
            }
        }

        caseEntity.setValues(helper.createGenericEntityArrayOfFieldValue(fields));
        
        CreateMessage caseMessage = new CreateMessage();
        caseMessage.setEntity(caseEntity);
        
        try {
            Result result = getService().execute(helper.createMessage(caseMessage)).getResult().get(0);
            
            if (!result.isSuccess()) {
                throw new ClarizenRuntimeException(result.getError().getErrorCode(), 
                        result.getError().getMessage());
            }
            
        } catch (IClarizenExecuteSessionTimeoutFailureFaultFaultMessage e) {
            throw new ClarizenSessionTimeoutException(e.getMessage());
        }
        
        return new Entity(caseEntity);
    }

    @Override
    public Entity createEntity(String entityType, String entityId,
            Map<String, Object> entityFields) {
        
        GenericEntity genericEntity = new GenericEntity();
        genericEntity.setId(helper.createBaseEntityId(entityType, entityId));
        
        List<FieldValue> fields = new ArrayList<FieldValue>();
        
        if (entityFields != null) {
            for (Map.Entry<String, Object> fieldValue : entityFields.entrySet()) {
                fields.add(helper.createFieldValue(fieldValue.getKey(), fieldValue.getValue()));
            }
            genericEntity.setValues(helper.createGenericEntityArrayOfFieldValue(fields));
        }        
        
        CreateMessage entityMessage = new CreateMessage();
        entityMessage.setEntity(genericEntity);
        
        ArrayOfBaseMessage messages = new ArrayOfBaseMessage();
        messages.getBaseMessage().add(entityMessage);
        
        try {
            List<Result> results = getService().execute(messages).getResult();
            
            for (Result result: results) {
                if (!result.isSuccess()) {
                    throw new ClarizenRuntimeException(result.getError().getErrorCode(), 
                            result.getError().getMessage());
                }
            }
            
        } catch (IClarizenExecuteSessionTimeoutFailureFaultFaultMessage e) {
            throw new ClarizenSessionTimeoutException(e.getMessage());
        }
        
        return new Entity(genericEntity);
    }

    @Override
    public ArrayOfEntity createEntityQuery(List<String> fieldsToRetrieve,
            String queryTypeName,
            String expression,
            Operator operator,
            String conditionValue) {
        
        EntityQuery query = new EntityQuery();
        query.setTypeName(queryTypeName);
        
        // Fields to be retrieved
        StringList fields = new StringList();
        if (fieldsToRetrieve != null) {
            fields.getString().addAll(fieldsToRetrieve);
        }

        if (fields != null) {
            query.setFields(fields);
        }

        Compare condition = new Compare();
        condition.setLeftExpression(helper.createFieldExpression(expression));
        condition.setRightExpression(helper.createConstantExpression(conditionValue));
        condition.setOperator(helper.createOperator(operator.value()));
        query.setWhere(condition);
        
        QueryResult result;
        try {
            result = getService().query(query);
            
            if (!result.isSuccess()) {
                throw new ClarizenRuntimeException(result.getError().getErrorCode(), 
                        result.getError().getMessage());
            }
            
        } catch (IClarizenQuerySessionTimeoutFailureFaultFaultMessage e) {
            throw new ClarizenSessionTimeoutException(e.getMessage());
        }
        
        return new ArrayOfEntity(result.getEntities().getBaseEntity());        
    }
    
    @Override
    public ArrayOfEntity createIssuesQuery(List<String> fieldsToRetrieve,
            AllIssueType issueType,
            String expression,
            Operator operator,
            String conditionValue) {
        
        EntityQuery query = new EntityQuery();
        query.setTypeName(issueType.value());
        
        // Fields to be retrieved
        StringList fields = new StringList();
        if (fieldsToRetrieve != null) {
            fields.getString().addAll(fieldsToRetrieve);
        }

        if (fields != null) {
            query.setFields(fields);
        }

        Compare condition = new Compare();
        condition.setLeftExpression(helper.createFieldExpression(expression));
        condition.setRightExpression(helper.createConstantExpression(conditionValue));
        condition.setOperator(helper.createOperator(operator.value()));
        query.setWhere(condition);
        
        QueryResult result;
        try {
            result = getService().query(query);
            
            if (!result.isSuccess()) {
                throw new ClarizenRuntimeException(result.getError().getErrorCode(), 
                        result.getError().getMessage());
            }
            
        } catch (IClarizenQuerySessionTimeoutFailureFaultFaultMessage e) {
            throw new ClarizenSessionTimeoutException(e.getMessage());
        }
        
        return new ArrayOfEntity(result.getEntities().getBaseEntity());        
    }

    @Override
    public Entity createWorkItem(Entity parentEntity, WorkItemType workItemType, 
                                        String workItemName, Map<String, Object> workItemFields) {
        
        Validate.notNull(workItemName);
        String workItemId = UUID.getUUID();
        GenericEntity workItem = new GenericEntity();
        workItem.setId(helper.createBaseEntityId(workItemType.value(), workItemId));
                
        FieldValue nameField = helper.createFieldValue("Name", workItemName);
        
        List<FieldValue> fields = new ArrayList<FieldValue>();
        fields.add(nameField);
        
        if (workItemFields != null) {
            for (Map.Entry<String, Object> fieldValue : workItemFields.entrySet()) {
                fields.add(helper.createFieldValue(fieldValue.getKey(), fieldValue.getValue()));
            }
        }
        
        workItem.setValues(helper.createGenericEntityArrayOfFieldValue(fields));
        
        GenericEntity linkEntity = new GenericEntity();
        linkEntity.setId(helper.createBaseEntityId("WorkItemHierarchyLink", UUID.getUUID()));
        
        FieldValue fieldParent = helper.createFieldValue("Parent", parentEntity.getGenericEntity().getId());
        FieldValue fieldChild = helper.createFieldValue("Child", 
                helper.createBaseEntityId(workItemType.value(), workItemId));
        
        List<FieldValue> fieldLink = new ArrayList<FieldValue>();
        fieldLink.add(fieldChild);
        fieldLink.add(fieldParent);
        
        linkEntity.setValues(helper.createGenericEntityArrayOfFieldValue(fieldLink));
        
        CreateMessage workItemMessage = new CreateMessage();
        workItemMessage.setEntity(workItem);
        
        CreateMessage workItemLinkMessage = new CreateMessage();
        workItemLinkMessage.setEntity(linkEntity);
        
        ArrayOfBaseMessage messages = new ArrayOfBaseMessage();
        messages.getBaseMessage().add(workItemMessage);
        messages.getBaseMessage().add(workItemLinkMessage);
        
        try {
            List<Result> results = getService().execute(messages).getResult();
            
            for (Result result: results) {
                if (!result.isSuccess()) {
                    throw new ClarizenRuntimeException(result.getError().getErrorCode(), 
                            result.getError().getMessage());
                }
            }
            
        } catch (IClarizenExecuteSessionTimeoutFailureFaultFaultMessage e) {
            throw new ClarizenSessionTimeoutException(e.getMessage());
        }
        
        return new Entity(workItem);
    }

    @Override
    public Entity createWorkItemByParentId(WorkItemType parentType, String parentId, WorkItemType workItemType, 
                                                  String workItemName, String workItemDescription, String startDate) {
        
        GenericEntity parentEntity = new GenericEntity();
        parentEntity.setId(helper.createBaseEntityId(parentType.value(), parentId));
        return createWorkItemSingleValues(new Entity(parentEntity), workItemType, workItemName, workItemDescription, startDate);
    }
    
    @Override
    public Entity createWorkItemSingleValues(Entity parentEntity, WorkItemType workItemType, 
                                        String workItemName, String workItemDescription, String startDate) {
        
        String workItemId = UUID.getUUID();
        GenericEntity workItem = new GenericEntity();
        workItem.setId(helper.createBaseEntityId(workItemType.value(), workItemId));
                
        FieldValue nameField = helper.createFieldValue("Name", workItemName);
        
        List<FieldValue> fields = new ArrayList<FieldValue>();
        fields.add(nameField);
        
        if (StringUtils.isNotEmpty(workItemDescription)) {
            FieldValue descriptionField = helper.createFieldValue("Description", workItemDescription);
            fields.add(descriptionField);
        }
        
        if (StringUtils.isNotEmpty(startDate)) {
            FieldValue startDateField = helper.createFieldValue("StartDate", startDate);
            fields.add(startDateField);
        }
        
        workItem.setValues(helper.createGenericEntityArrayOfFieldValue(fields));
        
        GenericEntity linkEntity = new GenericEntity();
        linkEntity.setId(helper.createBaseEntityId("WorkItemHierarchyLink", UUID.getUUID()));
        
        FieldValue fieldParent = helper.createFieldValue("Parent", parentEntity.getGenericEntity().getId());
        FieldValue fieldChild = helper.createFieldValue("Child", 
                helper.createBaseEntityId(workItemType.value(), workItemId));
        
        List<FieldValue> fieldLink = new ArrayList<FieldValue>();
        fieldLink.add(fieldChild);
        fieldLink.add(fieldParent);
        
        linkEntity.setValues(helper.createGenericEntityArrayOfFieldValue(fieldLink));
        
        CreateMessage workItemMessage = new CreateMessage();
        workItemMessage.setEntity(workItem);
        
        CreateMessage workItemLinkMessage = new CreateMessage();
        workItemLinkMessage.setEntity(linkEntity);
        
        ArrayOfBaseMessage messages = new ArrayOfBaseMessage();
        messages.getBaseMessage().add(workItemMessage);
        messages.getBaseMessage().add(workItemLinkMessage);
        
        try {
            List<Result> results = getService().execute(messages).getResult();
            
            for (Result result: results) {
                if (!result.isSuccess()) {
                    throw new ClarizenRuntimeException(result.getError().getErrorCode(), 
                            result.getError().getMessage());
                }
            }
            
        } catch (IClarizenExecuteSessionTimeoutFailureFaultFaultMessage e) {
            throw new ClarizenSessionTimeoutException(e.getMessage());
        }
        
        return new Entity(workItem);
    }
    
    public ClarizenClientHelper getHelper() {
        return helper;
    }

    @Override
    public ArrayOfEntity getMyWorkItems(List<String> fieldsToRetrieve,
            WorkItemState workItemState, WorkItemType workItemType,
            WorkItemFilter workItemFilter) {
        
        MyWorkItemsQuery query = new MyWorkItemsQuery();
        query.setItemsState(helper.createWorkItemState(workItemState.value()));
        query.setItemsFilter(helper.createWorkItemFilter(workItemFilter.value()));
        query.setItemsType(helper.createWorkItemType(workItemType.value()));
        
        // Fields to be retrieved
        StringList fields = new StringList();
        if (fieldsToRetrieve != null) {
            fields.getString().addAll(fieldsToRetrieve);
        }

        if (fields != null) {
            query.setFields(fields);
        }
        
        QueryResult result;
        try {
            result = getService().query(query);
            
            if (!result.isSuccess()) {
                throw new ClarizenRuntimeException(result.getError().getErrorCode(), 
                        result.getError().getMessage());
            }
            
        } catch (IClarizenQuerySessionTimeoutFailureFaultFaultMessage e) {
            throw new ClarizenSessionTimeoutException(e.getMessage());
        }
        
        return new ArrayOfEntity(result.getEntities().getBaseEntity());    
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
    
    @Override
    public Entity getWorkItemById(WorkItemType type, String workItemId, List<String> fieldsToRetrieve) {
        
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
        
        return new Entity((GenericEntity) result.getEntity());
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

    @Override
    public Entity updateCase(Entity caseEntity, Map<String, Object> fieldsToUpdate) {

        List<FieldValue> fields = new ArrayList<FieldValue>();

        if (fieldsToUpdate != null) {
            for (Map.Entry<String, Object> fieldToUpdate : fieldsToUpdate.entrySet()) {
                fields.add(helper.createFieldValue(fieldToUpdate.getKey(), fieldToUpdate.getValue()));
            }
        }

        if (fields != null) {
            caseEntity.getGenericEntity().setValues(helper.createGenericEntityArrayOfFieldValue(fields));
        }

        UpdateMessage updateMsg = new UpdateMessage();
        updateMsg.setEntity(caseEntity.getGenericEntity());

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
        
        return caseEntity;
    }

    @Override
    public Entity updateWorkItem(Entity workItem, Map<String, Object> fieldsToUpdate) {
        
        if (fieldsToUpdate != null) {
            List<FieldValue> fields = new ArrayList<FieldValue>();
            for (Map.Entry<String, Object> fieldToUpdate : fieldsToUpdate.entrySet()) {
                fields.add(helper.createFieldValue(fieldToUpdate.getKey(), fieldToUpdate.getValue()));
            }
            workItem.getGenericEntity().setValues(helper.createGenericEntityArrayOfFieldValue(fields));
        }

        UpdateMessage updateMsg = new UpdateMessage();
        updateMsg.setEntity(workItem.getGenericEntity());
        
        try {
            Result result = getService().execute(helper.createMessage(updateMsg)).getResult().get(0);
            
            if (!result.isSuccess()) {
                throw new ClarizenRuntimeException(result.getError().getErrorCode(), 
                        result.getError().getMessage());
            }
            
        } catch (IClarizenExecuteSessionTimeoutFailureFaultFaultMessage e) {
            throw new ClarizenSessionTimeoutException(e.getMessage());
        }
        
        return workItem;
    }

    @Override
    public Entity updateWorkItemProgress(Entity workItem, Double percentCompleted) {
        Map<String, Object> fieldsToUpdate = new HashMap<String, Object>();
        fieldsToUpdate.put("PercentCompleted", percentCompleted);
        return updateWorkItem(workItem, fieldsToUpdate);
    }
    
    @Override
    public ArrayOfEntity workItemsQuery(List<String> fieldsToRetrieve, WorkItemState workItemState,
                                            WorkItemType workItemType, WorkItemFilter workItemFilter) {

        WorkItemsQuery query = new WorkItemsQuery();
        query.setItemsState(helper.createWorkItemState(workItemState.value()));
        query.setItemsFilter(helper.createWorkItemFilter(workItemFilter.value()));
        query.setItemsType(helper.createWorkItemType(workItemType.value()));
        
        // Fields to be retrieved
        StringList fields = new StringList();
        if (fieldsToRetrieve != null) {
            fields.getString().addAll(fieldsToRetrieve);
        }

        if (fields != null) {
            query.setFields(fields);
        }
        
        QueryResult result;
        try {
            result = getService().query(query);
            
            if (!result.isSuccess()) {
                throw new ClarizenRuntimeException(result.getError().getErrorCode(), 
                        result.getError().getMessage());
            }
            
        } catch (IClarizenQuerySessionTimeoutFailureFaultFaultMessage e) {
            throw new ClarizenSessionTimeoutException(e.getMessage());
        }
        
        return new ArrayOfEntity(result.getEntities().getBaseEntity());
    }
}