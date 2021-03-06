/**
 * Mule Clarizen Cloud Connector
 *
 * (c) 2003-2014 MuleSoft, Inc. The software in this package is published under
 * the terms of the CPAL v1.0 license, a copy of which has been included with this
 * distribution in the LICENSE.md file.
 */

package org.mule.modules.clarizen;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.clarizen.api.EntityId;
import com.clarizen.api.files.FileInformation;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mule.modules.clarizen.api.model.AllIssueType;
import org.mule.modules.clarizen.api.model.BaseClarizenEntity;
import org.mule.modules.clarizen.api.model.Login;
import org.mule.modules.clarizen.api.model.WorkItemFilter;
import org.mule.modules.clarizen.api.model.WorkItemState;
import org.mule.modules.clarizen.api.model.WorkItemType;

import com.clarizen.api.GenericEntity;
import com.clarizen.api.queries.Condition;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

public class ClarizenClientTest {
    
    private static final String USER_NAME = "userName";
    private static final String USER_PASSWORD = "password";
    private static final String SOME_VALUE = "someValue";
    private static final String SOME_QUERY_TYPE = "someQueryType";
    private static final Integer SOME_PAGE_SIZE = 1000;
    private static final Integer SOME_MAX_NO_PAGES = 1;
    private static final boolean USE_FLAT_CLASSES = true;
    
    private static final AllIssueType SOME_ISSUE_TYPE = AllIssueType.ISSUE;
    private static final WorkItemFilter SOME_WORK_ITEM_FILTER = WorkItemFilter.ALL;
    private static final WorkItemState SOME_WORK_ITEM_STATE = WorkItemState.ALL;
    private static final WorkItemType SOME_WORK_ITEM_TYPE = WorkItemType.TASK;

    private static final String SOME_URL = "http://somesite.com/files/12345";
    private static final String SOME_FILENAME = "someFile.txt";
    
    @Mock
    private DefaultClarizenClient clarizenClient;
    private ClarizenConnector clarizenConnector;
    @Mock
    private BaseClarizenEntity entity;
    @Mock
    private GenericEntity genericEntity;
    @Mock
    private Login login;
    @Mock
    private Condition queryCondition;
    @Mock
    private EntityId entityId;
    @Mock
    private List<FileInformation> fileInformationList;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        clarizenConnector = new ClarizenConnector();
        clarizenConnector.setClarizenClient(clarizenClient);
    }

    @Test
    public void testCreateEntity() {
        when(clarizenClient.createEntity(entity)).thenReturn(entity);
        assertEquals(entity, clarizenConnector.createEntity(entity));
    }

    @Test
    public void testCreateGenericEntity() {
        when(clarizenClient.createEntity(genericEntity)).thenReturn(genericEntity);
        assertEquals(genericEntity, clarizenConnector.createGenericEntity(genericEntity));
    }

    @Test
    public void testCreateEntityQuery() {
        when(clarizenClient.createEntityQuery(createList(), SOME_QUERY_TYPE, 
                queryCondition, SOME_PAGE_SIZE, SOME_MAX_NO_PAGES, USE_FLAT_CLASSES)).thenReturn(createListBaseClarizenEntity());
        assertEquals(createListGenericEntity(), clarizenConnector.entityQuery(createList(), SOME_QUERY_TYPE, 
                queryCondition, SOME_PAGE_SIZE, SOME_MAX_NO_PAGES));
    }

    @Test
    public void testCreateIssuesQuery() {
        when(clarizenClient.createIssuesQuery(createList(), SOME_ISSUE_TYPE, 
                queryCondition, SOME_PAGE_SIZE, SOME_MAX_NO_PAGES, USE_FLAT_CLASSES)).thenReturn(createListBaseClarizenEntity());
        assertEquals(createListGenericEntity(), clarizenConnector.issueQuery(createList(), SOME_ISSUE_TYPE, 
                queryCondition, SOME_PAGE_SIZE, SOME_MAX_NO_PAGES));
    }

    @Test
    public void testGetMyWorkItems() {
        when(clarizenClient.getMyWorkItems(createList(), SOME_WORK_ITEM_STATE, 
                SOME_WORK_ITEM_TYPE, SOME_WORK_ITEM_FILTER, SOME_PAGE_SIZE, SOME_MAX_NO_PAGES, USE_FLAT_CLASSES)).
                thenReturn(createListBaseClarizenEntity());
        assertEquals(createListGenericEntity(), clarizenConnector.getMyWorkItems(createList(), SOME_WORK_ITEM_STATE, 
                SOME_WORK_ITEM_TYPE, SOME_WORK_ITEM_FILTER, SOME_PAGE_SIZE, SOME_MAX_NO_PAGES));
    }

    @Test
    public void testGetWorkItemById() {
        when(clarizenClient.getWorkItemById(SOME_WORK_ITEM_TYPE, SOME_VALUE, createList(), USE_FLAT_CLASSES)).thenReturn(entity);
        assertEquals(entity, clarizenConnector.getWorkItemById(SOME_WORK_ITEM_TYPE, SOME_VALUE, createList()));
    }

    @Test
    public void testLogin() {
        when(clarizenClient.login(USER_NAME, USER_PASSWORD, SOME_VALUE, SOME_VALUE)).thenReturn(login);
        assertEquals(login, clarizenConnector.login(USER_NAME, USER_PASSWORD, SOME_VALUE, SOME_VALUE));
    }

    @Test
    public void testUpdateEntity() {
        when(clarizenClient.updateEntity(entity)).thenReturn(entity);
        assertEquals(entity, clarizenConnector.updateEntity(entity));
    }

    @Test
    public void testUpdateGenericEntity() {
        when(clarizenClient.updateEntity(genericEntity)).thenReturn(genericEntity);
        assertEquals(genericEntity, clarizenConnector.updateGenericEntity(genericEntity));
    }

    @Test
    public void testAttachFileUrlToEntity() {
        when(clarizenClient.attachFileUrlToEntity(entityId, SOME_URL, SOME_FILENAME)).thenReturn(true);
        assertTrue(clarizenConnector.attachFileUrlToEntity(entityId, SOME_URL, SOME_FILENAME));
    }

    @Test
    public void downloadAttachments() {
        when(clarizenClient.downloadEntityAttachments(entityId)).thenReturn(createFileInformationList());
        assertEquals(createFileInformationList(), clarizenConnector.downloadEntityAttachments(entityId));
    }

    @Test
    public void retrieveHumanResources() {
        List<String> fieldsToRetrieve = Arrays.asList("WorkItem", "Resource", "ResourceRole", "Units", "CurrentJiraAssignee");
        when(clarizenClient.retrieveWorkItemHumanResources(entityId, fieldsToRetrieve)).thenReturn(createListGenericEntity());
        assertEquals(createListGenericEntity(), clarizenConnector.retrieveWorkItemHumanResources(entityId, fieldsToRetrieve));
    }

    @Test
    public void testWorkItemsQuery() {
        when(clarizenClient.workItemsQuery(createList(), SOME_WORK_ITEM_STATE, 
                SOME_WORK_ITEM_TYPE, SOME_WORK_ITEM_FILTER, SOME_PAGE_SIZE, SOME_MAX_NO_PAGES, USE_FLAT_CLASSES)).
                thenReturn(createListBaseClarizenEntity());
        assertEquals(createListGenericEntity(), clarizenConnector.workItemsQuery(createList(), SOME_WORK_ITEM_STATE,
                SOME_WORK_ITEM_TYPE, SOME_WORK_ITEM_FILTER, SOME_PAGE_SIZE, SOME_MAX_NO_PAGES));
    }
    
    private List<String> createList() {
        return new ArrayList<String>();
    }
    
    private List<GenericEntity> createListGenericEntity() {
        return new ArrayList<GenericEntity>();
    }
    
    private List<BaseClarizenEntity> createListBaseClarizenEntity() {
        return new ArrayList<BaseClarizenEntity>();
    }

    private List<FileInformation> createFileInformationList() {
        return new ArrayList<FileInformation>();
    }

}