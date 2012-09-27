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

import org.mule.modules.clarizen.api.model.AllIssueType;
import org.mule.modules.clarizen.api.model.BaseClarizenEntity;
import org.mule.modules.clarizen.api.model.Login;
import org.mule.modules.clarizen.api.model.WorkItemFilter;
import org.mule.modules.clarizen.api.model.WorkItemState;
import org.mule.modules.clarizen.api.model.WorkItemType;

import com.clarizen.api.EntityId;
import com.clarizen.api.GenericEntity;
import com.clarizen.api.GetCalendarInfoResult;
import com.clarizen.api.metadata.EntityDescription;
import com.clarizen.api.queries.Condition;

public interface ClarizenClient {

    /**
     * Creates an entity
     * @param entity model class extending BaseClarizenClient
     * @return created entity
     */
    BaseClarizenEntity createEntity(BaseClarizenEntity entity);
    
    /**
     * Creates an entity query
     * 
     * @param fieldsToRetrieve
     * @param queryTypeName
     * @param condition
     * @param pageSize
     * @param maxNumberOfPages
     * @return a list of entities taking into account depending on the parameter queryTypeName
     */
    <T extends BaseClarizenEntity> List<T> createEntityQuery(List<String> fieldsToRetrieve, String queryTypeName, 
            Condition condition, Integer pageSize, Integer maxNumberOfPages);
    
    /**
     * Creates an issue query
     * @param fieldsToRetrieve
     * @param issueType
     * @param condition
     * @param pageSize
     * @param maxNumberOfPages
     * @return a list of entities taking into account depending on the parameter issueType
     */
    <T extends BaseClarizenEntity> List<T> createIssuesQuery(List<String> fieldsToRetrieve, AllIssueType issueType,
            Condition condition, Integer pageSize, Integer maxNumberOfPages);

    /**
     * Deletes en entity
     * @param entity to be deleted
     * @return true if the entity was successfully deleted
     */
    Boolean deleteEntity(BaseClarizenEntity entity);

    /**
     * Describes an entity querying the metadata information provided by the webservice
     * @param typeName
     * @return entityDescription object
     */
    List<EntityDescription> describeEntities(List<String> typeNames);

    /**
     * Get Calendar Information
     * @param userId
     * @return calendar information
     */
    GetCalendarInfoResult getCalendarInfo(EntityId userId);
    
    /**
     * Gets System settings
     * @param settings list
     * @return system settings values
     */
    List<Object> getSystemSettings(List<String> settingList);
    
    /**
     * Query for current user's workitems
     * @param fieldsToRetrieve
     * @param workItemState
     * @param workItemType
     * @param workItemFilter
     * @param pageSize
     * @param maxNumberOfPages
     * @return list of GenericEntity containing the workitems objects
     */
    List<GenericEntity> getMyWorkItems(List<String> fieldsToRetrieve,
            WorkItemState workItemState, WorkItemType workItemType,
            WorkItemFilter workItemFilter, Integer pageSize, Integer maxNumberOfPages);
    
    /**
     * Gets workItem information by id
     * @param workItemType
     * @param workItemId
     * @param fieldsToRetrieve
     * @return GenericEntity
     */
    BaseClarizenEntity getWorkItemById(WorkItemType workItemType, String workItemId, List<String> fieldsToRetrieve);

    /**
     * Changes the state of an entity
     * @param entityIdList list of entityIds to be updated
     * @param operation lifecycle change
     * @param recursive
     * @return true if the change was successful
     */
    Boolean lifecycleChange(List<EntityId> entityIdList, String operation, Boolean recursive);

    /**
     * Queries metadata information provided by the webservice for available entities
     * @return list of entities names
     */
    List<String> listEntities();
    
    /**
     * Login to the webservice
     * @param username
     * @param password
     * @param applicationId
     * @param partnerId
     * @return Login information including session id
     */
    Login login(String username, String password, String applicationId, String partnerId);
    
    /**
     * Logout
     */
    void logout();
    
    /**
     * Updates an entity
     * @param entity model class extending BaseClarizenClient
     * @return updated entity
     */
    BaseClarizenEntity updateEntity(BaseClarizenEntity entity);
    
    /**
     * Queries workItems
     * @param fieldsToRetrieve
     * @param workItemState
     * @param workItemType
     * @param workItemFilter
     * @param pageSize
     * @param maxNumberOfPages
     * @return list of GenericEntity containing the workitems objects
     */
    List<GenericEntity> workItemsQuery(List<String> fieldsToRetrieve, WorkItemState workItemState,
                               WorkItemType workItemType, WorkItemFilter workItemFilter, 
                               Integer pageSize, Integer maxNumberOfPages);
}