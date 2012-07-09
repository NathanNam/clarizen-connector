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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mule.modules.clarizen.api.model.AllIssueType;
import org.mule.modules.clarizen.api.model.ArrayOfEntity;
import org.mule.modules.clarizen.api.model.Entity;
import org.mule.modules.clarizen.api.model.Login;
import org.mule.modules.clarizen.api.model.Operator;
import org.mule.modules.clarizen.api.model.WorkItemFilter;
import org.mule.modules.clarizen.api.model.WorkItemState;
import org.mule.modules.clarizen.api.model.WorkItemType;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class ClarizenClientTest {
    
    private static final String USER_ID = "userId";
    private static final String USER_NAME = "userName";
    private static final String USER_PASSWORD = "password";
    private static final String SOME_VALUE = "someValue";
    private static final String SOME_ID = "someId";
    private static final String SOME_TYPE = "someType";
    private static final String SOME_QUERY_TYPE = "someQueryType";
    private static final String SOME_EXPRESSION = "someExpression";
    private static final Double SOME_DOUBLE_VALUE = 30.0;
    
    private static final Operator SOME_OPERATOR = Operator.EQUAL;
    private static final AllIssueType SOME_ISSUE_TYPE = AllIssueType.ISSUE;
    private static final WorkItemFilter SOME_WORK_ITEM_FILTER = WorkItemFilter.ALL;
    private static final WorkItemState SOME_WORK_ITEM_STATE = WorkItemState.ALL;
    private static final WorkItemType SOME_WORK_ITEM_TYPE = WorkItemType.TASK;
    
    @Mock
    private DefaultClarizenClient clarizenClient;
    private ClarizenConnector clarizenConnector;
    @Mock
    private Entity entity;
    @Mock
    private Entity parentEntity;
    @Mock
    private ArrayOfEntity arrayOfEntity;
    @Mock
    private Login login;
    
    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        clarizenConnector = new ClarizenConnector();
        clarizenConnector.setClarizenClient(clarizenClient);
    }
    
    @Test
    public void testAddWorkItemResources() {
        when(clarizenClient.addWorkItemResources(entity, USER_ID, SOME_VALUE)).thenReturn(entity);
        assertEquals(entity, clarizenConnector.addWorkItemResources(entity, USER_ID, SOME_VALUE));
    }

    @Test
    public void testCreateAllIssue() {
        AllIssueType type = AllIssueType.ISSUE;;
        when(clarizenClient.createAllIssue(type, SOME_VALUE)).thenReturn(entity);
        assertEquals(entity, clarizenConnector.createAllIssue(type, SOME_VALUE));
    }

    @Test
    public void testCreateEntity() {
        when(clarizenClient.createEntity(SOME_TYPE, SOME_ID, createMap())).thenReturn(entity);
        assertEquals(entity, clarizenConnector.createEntity(SOME_TYPE, SOME_ID, createMap()));
    }

    @Test
    public void testCreateEntityQuery() {
        when(clarizenClient.createEntityQuery(createList(), SOME_QUERY_TYPE, 
                SOME_EXPRESSION, SOME_OPERATOR, SOME_EXPRESSION)).thenReturn(arrayOfEntity);
        assertEquals(arrayOfEntity, clarizenConnector.createEntityQuery(createList(), SOME_QUERY_TYPE, 
                SOME_EXPRESSION, SOME_OPERATOR, SOME_EXPRESSION));
    }

    @Test
    public void testCreateIssuesQuery() {
        when(clarizenClient.createIssuesQuery(createList(), SOME_ISSUE_TYPE, 
                SOME_EXPRESSION, SOME_OPERATOR, SOME_EXPRESSION)).thenReturn(arrayOfEntity);
        assertEquals(arrayOfEntity, clarizenConnector.createIssuesQuery(createList(), SOME_ISSUE_TYPE, 
                SOME_EXPRESSION, SOME_OPERATOR, SOME_EXPRESSION));
    }

    @Test
    public void testCreateWorkItem() {
        when(clarizenClient.createWorkItem(parentEntity, SOME_WORK_ITEM_TYPE, 
                SOME_VALUE, createMap())).thenReturn(entity);
        assertEquals(entity, clarizenConnector.createWorkItem(parentEntity, SOME_WORK_ITEM_TYPE, 
                SOME_VALUE, createMap()));
    }

    @Test
    public void testCreateWorkItemByParentId() {
        when(clarizenClient.createWorkItemByParentId(SOME_WORK_ITEM_TYPE, SOME_VALUE, SOME_WORK_ITEM_TYPE, SOME_VALUE, 
                SOME_VALUE, SOME_VALUE)).thenReturn(entity);
        assertEquals(entity, clarizenConnector.createWorkItemByParentId(SOME_WORK_ITEM_TYPE, SOME_VALUE, 
                SOME_WORK_ITEM_TYPE, SOME_VALUE, SOME_VALUE, SOME_VALUE));
    }

    @Test
    public void testCreateWorkItemSingleValues() {
        when(clarizenClient.createWorkItemSingleValues(parentEntity, SOME_WORK_ITEM_TYPE, 
                SOME_VALUE, SOME_VALUE, SOME_VALUE)).thenReturn(entity);
        assertEquals(entity, clarizenConnector.createWorkItemSingleValues(parentEntity, 
                SOME_WORK_ITEM_TYPE, SOME_VALUE, SOME_VALUE, SOME_VALUE));
    }

    @Test
    public void testGetMyWorkItems() {
        when(clarizenClient.getMyWorkItems(createList(), SOME_WORK_ITEM_STATE, 
                SOME_WORK_ITEM_TYPE, SOME_WORK_ITEM_FILTER)).thenReturn(arrayOfEntity);
        assertEquals(arrayOfEntity, clarizenConnector.getMyWorkItems(createList(), SOME_WORK_ITEM_STATE, 
                SOME_WORK_ITEM_TYPE, SOME_WORK_ITEM_FILTER));
    }

    @Test
    public void testGetWorkItemById() {
        when(clarizenClient.getWorkItemById(SOME_WORK_ITEM_TYPE, SOME_VALUE, createList())).thenReturn(entity);
        assertEquals(entity, clarizenConnector.getWorkItemById(SOME_WORK_ITEM_TYPE, SOME_VALUE, createList()));
    }

    @Test
    public void testLogin() {
        when(clarizenClient.login(USER_NAME, USER_PASSWORD, SOME_VALUE, SOME_VALUE)).thenReturn(login);
        assertEquals(login, clarizenConnector.login(USER_NAME, USER_PASSWORD, SOME_VALUE, SOME_VALUE));
    }
    
    @Test
    public void testUpdateAllIssue() {
        when(clarizenClient.updateAllIssue(entity, createMap())).thenReturn(entity);
        assertEquals(entity, clarizenConnector.updateAllIssue(entity, createMap()));
    }

    @Test
    public void testUpdateWorkItem() {
        when(clarizenClient.updateWorkItem(entity, createMap())).thenReturn(entity);
        assertEquals(entity, clarizenConnector.updateWorkItem(entity, createMap()));
    }

    @Test
    public void testUpdateWorkItemProgress() {
        when(clarizenClient.updateWorkItemProgress(entity, SOME_DOUBLE_VALUE)).thenReturn(entity);
        assertEquals(entity, clarizenConnector.updateWorkItemProgress(entity, SOME_DOUBLE_VALUE));
    }

    @Test
    public void testWorkItemsQuery() {
        when(clarizenClient.workItemsQuery(createList(), SOME_WORK_ITEM_STATE, 
                SOME_WORK_ITEM_TYPE, SOME_WORK_ITEM_FILTER)).thenReturn(arrayOfEntity);
        assertEquals(arrayOfEntity, clarizenConnector.workItemsQuery(createList(), SOME_WORK_ITEM_STATE, 
                SOME_WORK_ITEM_TYPE, SOME_WORK_ITEM_FILTER));
    }
    
    private Map<String, Object> createMap() {
        return new HashMap<String, Object>();
    }
    
    private List<String> createList() {
        return new ArrayList<String>();
    }

}