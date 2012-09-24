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
import org.mule.modules.clarizen.api.model.ArrayOfEntity;
import org.mule.modules.clarizen.api.model.BaseClarizenEntity;
import org.mule.modules.clarizen.api.model.EntityMetadataDescription;
import org.mule.modules.clarizen.api.model.Login;
import org.mule.modules.clarizen.api.model.QueryCondition;
import org.mule.modules.clarizen.api.model.WorkItemFilter;
import org.mule.modules.clarizen.api.model.WorkItemState;
import org.mule.modules.clarizen.api.model.WorkItemType;


import com.clarizen.api.GenericEntity;

public interface ClarizenClient {

    BaseClarizenEntity createEntity(BaseClarizenEntity entity);
    
    ArrayOfEntity createEntityQuery(List<String> fieldsToRetrieve, String queryTypeName, 
            QueryCondition condition, Integer pageSize, Integer maxNumberOfPages);
    
    ArrayOfEntity createIssuesQuery(List<String> fieldsToRetrieve, AllIssueType issueType,
            QueryCondition condition, Integer pageSize, Integer maxNumberOfPages);

    EntityMetadataDescription describeEntity(String typeName);
    
    ArrayOfEntity getMyWorkItems(List<String> fieldsToRetrieve,
            WorkItemState workItemState, WorkItemType workItemType,
            WorkItemFilter workItemFilter, Integer pageSize, Integer maxNumberOfPages);
    
    GenericEntity getWorkItemById(WorkItemType workItemType, String workItemId, List<String> fieldsToRetrieve);
    
    List<String> listEntities();
    
    Login login(String username, String password, String applicationId, String partnerId);
    
    void logout();
    
    BaseClarizenEntity updateEntity(BaseClarizenEntity entity);
    
    ArrayOfEntity workItemsQuery(List<String> fieldsToRetrieve, WorkItemState workItemState,
                               WorkItemType workItemType, WorkItemFilter workItemFilter, 
                               Integer pageSize, Integer maxNumberOfPages);
}