/**
 * Mule Clarizen Cloud Connector
 *
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */

package org.mule.modules.clarizen.api.model;

import com.clarizen.api.Duration;

public class StopWatch extends ClarizenEntity {
    
    private WorkItem workItem;
    private User user;
    private ResourceLink humanResource;
    private StopwatchState state;
    private Duration elapsedTime;
    private Duration organizationElapsedTime;

    public WorkItem getWorkItem() {
        return workItem;
    }
    public User getUser() {
        return user;
    }
    public ResourceLink getHumanResource() {
        return humanResource;
    }
    public StopwatchState getState() {
        return state;
    }
    public Duration getElapsedTime() {
        return elapsedTime;
    }
    public Duration getOrganizationElapsedTime() {
        return organizationElapsedTime;
    }
    public void setWorkItem(WorkItem workItem) {
        this.workItem = workItem;
    }
    public void setUser(User user) {
        this.user = user;
    }
    public void setHumanResource(ResourceLink humanResource) {
        this.humanResource = humanResource;
    }
    public void setState(StopwatchState state) {
        this.state = state;
    }
    public void setElapsedTime(Duration elapsedTime) {
        this.elapsedTime = elapsedTime;
    }
    public void setOrganizationElapsedTime(Duration organizationElapsedTime) {
        this.organizationElapsedTime = organizationElapsedTime;
    }

    

}
