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
import java.util.Map;

import org.mule.modules.clarizen.api.model.AllIssueType;
import org.mule.modules.clarizen.api.model.ArrayOfEntity;
import org.mule.modules.clarizen.api.model.Entity;
import org.mule.modules.clarizen.api.model.EntityMetadataDescription;
import org.mule.modules.clarizen.api.model.Login;
import org.mule.modules.clarizen.api.model.QueryCondition;
import org.mule.modules.clarizen.api.model.WorkItemFilter;
import org.mule.modules.clarizen.api.model.WorkItemState;
import org.mule.modules.clarizen.api.model.WorkItemType;

import com.clarizen.api.metadata.ListEntitiesResult;

public interface ClarizenClient {

    Entity addWorkItemResources(Entity workItem, String resourceId,
                                           String units);
    
    Entity createCase(AllIssueType issueType, String title, 
            Map<String, Object> entityFields);

    Entity createEntity(String entityType, String entityId, 
            Map<String, Object> entityFields);

    ArrayOfEntity createEntityQuery(List<String> fieldsToRetrieve, String queryTypeName, 
            QueryCondition condition, Integer pageSize);
    
    ArrayOfEntity createIssuesQuery(List<String> fieldsToRetrieve, AllIssueType issueType,
            QueryCondition condition, Integer pageSize);

    Entity createWorkItem(Entity parentEntity, WorkItemType workItemType, 
                                 String workItemName, Map<String, Object> workItemFields);
    
    Entity createWorkItemByParentId(WorkItemType parentType, String parentId, 
            WorkItemType workItemType, String workItemName,
            String workItemDescription, String startDate);

    Entity createWorkItemSingleValues(Entity parentEntity,
            WorkItemType workItemType, String workItemName,
            String workItemDescription, String startDate);

    ArrayOfEntity getMyWorkItems(List<String> fieldsToRetrieve,
            WorkItemState workItemState, WorkItemType workItemType,
            WorkItemFilter workItemFilter, Integer pageSize);

    EntityMetadataDescription describeEntity(String typeName);
    
    Entity getWorkItemById(WorkItemType workItemType, String workItemId, List<String> fieldsToRetrieve);
    
    List<String> listEntities();
    
    Login login(String username, String password, String applicationId, String partnerId);
    
    void logout();
    
    Entity updateCase(Entity caseEntity, Map<String, Object> fieldsToUpdate);
    
    Entity updateWorkItem(Entity workItem, Map<String, Object> fieldsToUpdate);
    
    Entity updateWorkItemProgress(Entity workItem, Double percentCompleted);

    ArrayOfEntity workItemsQuery(List<String> fieldsToRetrieve, WorkItemState workItemState,
                               WorkItemType workItemType, WorkItemFilter workItemFilter, Integer pageSize);
}