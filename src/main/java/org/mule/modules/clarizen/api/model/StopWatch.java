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
    
    private org.mule.modules.clarizen.api.model.flat.WorkItemFlat workItem;
    private org.mule.modules.clarizen.api.model.flat.UserFlat user;
    private org.mule.modules.clarizen.api.model.flat.ResourceLinkFlat humanResource;
    private org.mule.modules.clarizen.api.model.flat.StopwatchStateFlat state;
    private Duration elapsedTime;
    private Duration organizationElapsedTime;

    public org.mule.modules.clarizen.api.model.flat.WorkItemFlat getWorkItem() {
        return workItem;
    }
    public org.mule.modules.clarizen.api.model.flat.UserFlat getUser() {
        return user;
    }
    public org.mule.modules.clarizen.api.model.flat.ResourceLinkFlat getHumanResource() {
        return humanResource;
    }
    public org.mule.modules.clarizen.api.model.flat.StopwatchStateFlat getState() {
        return state;
    }
    public Duration getElapsedTime() {
        return elapsedTime;
    }
    public Duration getOrganizationElapsedTime() {
        return organizationElapsedTime;
    }
    public void setWorkItem(
            org.mule.modules.clarizen.api.model.flat.WorkItemFlat workItem) {
        this.workItem = workItem;
    }
    public void setUser(org.mule.modules.clarizen.api.model.flat.UserFlat user) {
        this.user = user;
    }
    public void setHumanResource(
            org.mule.modules.clarizen.api.model.flat.ResourceLinkFlat humanResource) {
        this.humanResource = humanResource;
    }
    public void setState(
            org.mule.modules.clarizen.api.model.flat.StopwatchStateFlat state) {
        this.state = state;
    }
    public void setElapsedTime(Duration elapsedTime) {
        this.elapsedTime = elapsedTime;
    }
    public void setOrganizationElapsedTime(Duration organizationElapsedTime) {
        this.organizationElapsedTime = organizationElapsedTime;
    }    
}
