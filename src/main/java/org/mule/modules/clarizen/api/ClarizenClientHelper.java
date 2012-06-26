/**
 * Mule Clarizen Cloud Connector
 *
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */

package org.mule.modules.clarizen.api;

import java.util.List;

import javax.xml.bind.JAXBElement;

import com.clarizen.api.ArrayOfBaseEntity;
import com.clarizen.api.ArrayOfBaseMessage;
import com.clarizen.api.ArrayOfFieldValue;
import com.clarizen.api.BaseEntity;
import com.clarizen.api.BaseMessage;
import com.clarizen.api.EntityId;
import com.clarizen.api.FieldValue;
import com.clarizen.api.GenericEntity;
import com.clarizen.api.SessionHeader;
import com.clarizen.api.StringList;
import com.clarizen.api.files.FileInformation;
import com.clarizen.api.queries.Compare;
import com.clarizen.api.queries.Condition;
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
    
    public JAXBElement<EntityId> createBaseEntityId(String typeName, String value) {
        EntityId entityId = objectFactoryApi.createEntityId();
        entityId.setTypeName(objectFactoryApi.createEntityIdTypeName(typeName));
        entityId.setValue(objectFactoryApi.createEntityIdValue(value));
        return objectFactoryApi.createBaseEntityId(entityId);
    }
    
    public FieldValue createFieldValue(String fieldName, Object value) {
        FieldValue fieldValue = objectFactoryApi.createFieldValue();
        fieldValue.setFieldName(objectFactoryApi.createFieldValueFieldName(fieldName));
        fieldValue.setValue(objectFactoryApi.createFieldValueValue(value));
        return fieldValue;
    }
    
    public JAXBElement<FieldValue> createJAXBFieldValue(String fieldName, Object value) {
        FieldValue fieldValue = objectFactoryApi.createFieldValue();
        fieldValue.setFieldName(objectFactoryApi.createFieldValueFieldName(fieldName));
        fieldValue.setValue(objectFactoryApi.createFieldValueValue(value));
        return objectFactoryApi.createFieldValue(fieldValue);
    }
    
    public JAXBElement<ArrayOfFieldValue> createGenericEntityArrayOfFieldValue(List<FieldValue> fieldValueList) {
        ArrayOfFieldValue array = objectFactoryApi.createArrayOfFieldValue();
        array.getFieldValue().addAll(fieldValueList);
        return objectFactoryApi.createGenericEntityValues(array);
    }
    
    public ArrayOfBaseMessage createMessage(BaseMessage message) {
        ArrayOfBaseMessage arrayOfBaseMessage = objectFactoryApi.createArrayOfBaseMessage();
        arrayOfBaseMessage.getBaseMessage().add(message);
        return arrayOfBaseMessage;
    }
    
    public JAXBElement<BaseEntity> createMessageBaseEntity(GenericEntity entity) {
        return objectFactoryApi.createCreateMessageEntity(entity);
    }
    
    public JAXBElement<StringList> createStringList(StringList list) {
        return objectFactoryApi.createStringList(list);
    }
    
    public JAXBElement<StringList> createEntityQueryStringList(StringList list) {
        return objectFactoryQueries.createEntityQueryFields(list);
    }

    public JAXBElement<String> createLoginOptionsApplicationId(String value) {
        return objectFactoryApi.createLoginOptionsApplicationId(value);
    }

    public JAXBElement<String> createLoginOptionsPartnerId(String value) {
        return objectFactoryApi.createLoginOptionsPartnerId(value);
    }

    public JAXBElement<FileInformation> createFileInformation(FileInformation fileInformation) {
        return objectFactoryFiles.createFileInformation(fileInformation);
    }
    
    public JAXBElement<String> createFileInformationFilename(String filename) {
        return objectFactoryFiles.createFileInformationFileName(filename);
    }
    
    public JAXBElement<Expression> createCompareExpression(Expression expression) {
        return objectFactoryQueries.createCompareRightExpression(expression);
    }
    
    public JAXBElement<Expression> createFieldExpression(String fieldExpression) {
        FieldExpression field = new FieldExpression();
        field.setFieldName(objectFactoryQueries.createFieldExpressionFieldName(fieldExpression));
        return objectFactoryQueries.createCompareLeftExpression(field);
    }
    
    public JAXBElement<Expression> createConstantExpression(String constantExpression) {
        ConstantExpression constant = new ConstantExpression();
        constant.setValue(objectFactoryQueries.createConstantExpressionValue(constantExpression));
        return objectFactoryQueries.createCompareRightExpression(constant);
    }
    
    public JAXBElement<Expression> createConstantExpressionUser(String userId) {
        ConstantExpression constant = new ConstantExpression();
        EntityId user = new EntityId();
        user.setTypeName(objectFactoryApi.createEntityIdTypeName("User"));
        user.setValue(objectFactoryApi.createEntityIdValue(userId));
        constant.setValue(objectFactoryQueries.createConstantExpressionValue(user));
        return objectFactoryQueries.createExpression(constant);
    }
    
    public JAXBElement<Expression> createExpression(Expression expression) {
        return objectFactoryQueries.createExpression(expression);
    }
    
    public JAXBElement<Condition> createEntityQueryCondition(Compare condition) {
        return objectFactoryQueries.createEntityQueryWhere(condition);
    }
    
    public JAXBElement<String> createQueryTypeName(String typeName) {
        return objectFactoryQueries.createEntityQueryTypeName(typeName);
    }
    
    public JAXBElement<SessionHeader> createSessionHeader(JAXBElement<String> sessionId) {
        SessionHeader sh = new SessionHeader();
        sh.setID(sessionId);
        return objectFactoryApi.createSessionHeader(sh);
    }
    
    public SessionHeader createSessionHeader(String sessionId) {
        SessionHeader sh = new SessionHeader();
        sh.setID(objectFactoryApi.createSessionHeaderID(sessionId));
        return sh;
    }

    public com.clarizen.api.ObjectFactory getObjectFactoryApi() {
        return objectFactoryApi;
    }

    public void setObjectFactoryApi(com.clarizen.api.ObjectFactory objectFactoryApi) {
        this.objectFactoryApi = objectFactoryApi;
    }

    public com.clarizen.api.files.ObjectFactory getObjectFactoryFiles() {
        return objectFactoryFiles;
    }

    public void setObjectFactoryFiles(
            com.clarizen.api.files.ObjectFactory objectFactoryFiles) {
        this.objectFactoryFiles = objectFactoryFiles;
    }

    public com.clarizen.api.queries.ObjectFactory getObjectFactoryQueries() {
        return objectFactoryQueries;
    }

    public void setObjectFactoryQueries(
            com.clarizen.api.queries.ObjectFactory objectFactoryQueries) {
        this.objectFactoryQueries = objectFactoryQueries;
    }

    public com.clarizen.api.projectmanagement.ObjectFactory getObjectFactoryProject() {
        return objectFactoryProject;
    }

    public void setObjectFactoryProject(
            com.clarizen.api.projectmanagement.ObjectFactory objectFactoryProject) {
        this.objectFactoryProject = objectFactoryProject;
    }

    public JAXBElement<ArrayOfBaseEntity> createResourcesArray(GenericEntity resources) {
        ArrayOfBaseEntity entityArray = new ArrayOfBaseEntity();
        entityArray.getBaseEntity().add(resources);
        return objectFactoryApi.createArrayOfBaseEntity(entityArray);
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
    
    public Operator createOperator(String operator) {
        return Operator.fromValue(operator);
    }
}
