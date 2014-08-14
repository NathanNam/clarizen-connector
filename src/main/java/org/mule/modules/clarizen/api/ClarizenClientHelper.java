/**
 * Mule Clarizen Cloud Connector
 *
 * (c) 2003-2014 MuleSoft, Inc. The software in this package is published under
 * the terms of the CPAL v1.0 license, a copy of which has been included with this
 * distribution in the LICENSE.md file.
 */

package org.mule.modules.clarizen.api;

import java.util.List;

import com.clarizen.api.ArrayOfBaseMessage;
import com.clarizen.api.ArrayOfEntityId;
import com.clarizen.api.ArrayOfFieldValue;
import com.clarizen.api.ArrayOfRecipient;
import com.clarizen.api.BaseMessage;
import com.clarizen.api.EntityId;
import com.clarizen.api.FieldValue;
import com.clarizen.api.Recipient;
import com.clarizen.api.SessionHeader;
import com.clarizen.api.StringList;
import com.clarizen.api.queries.ConstantExpression;
import com.clarizen.api.queries.Expression;
import com.clarizen.api.queries.FieldExpression;
import com.clarizen.api.queries.Operator;
import com.clarizen.api.projectmanagement.WorkItemFilter;
import com.clarizen.api.projectmanagement.WorkItemState;
import com.clarizen.api.projectmanagement.WorkItemType;

public class ClarizenClientHelper {
    
    private com.clarizen.api.ObjectFactory objectFactoryApi;
    private com.clarizen.api.files.ObjectFactory objectFactoryFiles;
    private com.clarizen.api.queries.ObjectFactory objectFactoryQueries;
    private com.clarizen.api.projectmanagement.ObjectFactory objectFactoryProject;

    public ClarizenClientHelper() {
        objectFactoryApi = new com.clarizen.api.ObjectFactory();
        objectFactoryFiles = new com.clarizen.api.files.ObjectFactory();
        objectFactoryQueries = new com.clarizen.api.queries.ObjectFactory();
        objectFactoryProject = new com.clarizen.api.projectmanagement.ObjectFactory();
    }
    
    public ArrayOfEntityId createArrayOfEntityId(List<EntityId> entityIdList) {
        ArrayOfEntityId array = new ArrayOfEntityId();
        array.getEntityId().addAll(entityIdList);
        return array;
    }
    
    public ArrayOfRecipient createArrayOfRecipients(List<Recipient> recipients) {
        ArrayOfRecipient array = new ArrayOfRecipient();
        array.getRecipient().addAll(recipients);
        return array;        
    }
    
    public EntityId createBaseEntityId(String typeName, String value) {
        EntityId entityId = objectFactoryApi.createEntityId();
        entityId.setTypeName(typeName);
        entityId.setValue(value);
        return entityId;
    }
    
    public Expression createConstantExpression(String constantExpression) {
        ConstantExpression constant = new ConstantExpression();
        constant.setValue(constantExpression);
        return constant;
    }
    
    public Expression createConstantExpressionUser(String userId) {
        ConstantExpression constant = new ConstantExpression();
        EntityId user = new EntityId();
        user.setTypeName("User");
        user.setValue(userId);
        constant.setValue(user);
        return constant;
    }
    
    public Expression createFieldExpression(String fieldExpression) {
        FieldExpression field = new FieldExpression();
        field.setFieldName(fieldExpression);
        return field;
    }
    
    public FieldValue createFieldValue(String fieldName, Object value) {
        FieldValue fieldValue = objectFactoryApi.createFieldValue();
        fieldValue.setFieldName(fieldName);
        fieldValue.setValue(value);
        return fieldValue;
    }
    
    public ArrayOfFieldValue createGenericEntityArrayOfFieldValue(List<FieldValue> fieldValueList) {
        ArrayOfFieldValue array = objectFactoryApi.createArrayOfFieldValue();
        array.getFieldValue().addAll(fieldValueList);
        return array;
    }

    public ArrayOfBaseMessage createMessage(BaseMessage message) {
        ArrayOfBaseMessage arrayOfBaseMessage = objectFactoryApi.createArrayOfBaseMessage();
        arrayOfBaseMessage.getBaseMessage().add(message);
        return arrayOfBaseMessage;
    }

    public Operator createOperator(String operator) {
        return Operator.fromValue(operator);
    }

    public SessionHeader createSessionHeader(String sessionId) {
        SessionHeader sh = new SessionHeader();
        sh.setID(sessionId);
        return sh;
    }

    public StringList createStringList(List<String> stringList) {
        StringList list = new StringList();
        list.getString().addAll(stringList);
        return list;
    }

    public WorkItemFilter createWorkItemFilter(String filter) {
        return WorkItemFilter.fromValue(filter);
    }

    public WorkItemState createWorkItemState(String state) {
        return WorkItemState.fromValue(state);
    }

    public WorkItemType createWorkItemType(String type) {
        return WorkItemType.fromValue(type);
    }

    public com.clarizen.api.ObjectFactory getObjectFactoryApi() {
        return objectFactoryApi;
    }
    
    public com.clarizen.api.files.ObjectFactory getObjectFactoryFiles() {
        return objectFactoryFiles;
    }
    
    public com.clarizen.api.projectmanagement.ObjectFactory getObjectFactoryProject() {
        return objectFactoryProject;
    }
    
    public com.clarizen.api.queries.ObjectFactory getObjectFactoryQueries() {
        return objectFactoryQueries;
    }
    
    public void setObjectFactoryApi(com.clarizen.api.ObjectFactory objectFactoryApi) {
        this.objectFactoryApi = objectFactoryApi;
    }
    
    public void setObjectFactoryFiles(
            com.clarizen.api.files.ObjectFactory objectFactoryFiles) {
        this.objectFactoryFiles = objectFactoryFiles;
    }
    
    public void setObjectFactoryProject(
            com.clarizen.api.projectmanagement.ObjectFactory objectFactoryProject) {
        this.objectFactoryProject = objectFactoryProject;
    }
    
    public void setObjectFactoryQueries(
            com.clarizen.api.queries.ObjectFactory objectFactoryQueries) {
        this.objectFactoryQueries = objectFactoryQueries;
    }    
}
