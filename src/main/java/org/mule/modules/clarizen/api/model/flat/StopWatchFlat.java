/**
 * Mule Clarizen Cloud Connector
 *
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */

package org.mule.modules.clarizen.api.model.flat;

import com.clarizen.api.Duration;
import com.clarizen.api.EntityId;

public class StopWatchFlat extends ClarizenEntityCustomFieldsFlat {
    
    private EntityId workItem;
    private EntityId user;
    private EntityId humanResource;
    private EntityId state;
    private Duration elapsedTime;
    private Duration organizationElapsedTime;

    public EntityId getWorkItem() {
        return workItem;
    }
    public EntityId getUser() {
        return user;
    }
    public EntityId getHumanResource() {
        return humanResource;
    }
    public EntityId getState() {
        return state;
    }
    public Duration getElapsedTime() {
        return elapsedTime;
    }
    public Duration getOrganizationElapsedTime() {
        return organizationElapsedTime;
    }
    public void setWorkItem(EntityId workItem) {
        this.workItem = workItem;
    }
    public void setUser(EntityId user) {
        this.user = user;
    }
    public void setHumanResource(EntityId humanResource) {
        this.humanResource = humanResource;
    }
    public void setState(EntityId state) {
        this.state = state;
    }
    public void setElapsedTime(Duration elapsedTime) {
        this.elapsedTime = elapsedTime;
    }
    public void setOrganizationElapsedTime(Duration organizationElapsedTime) {
        this.organizationElapsedTime = organizationElapsedTime;
    }
}
