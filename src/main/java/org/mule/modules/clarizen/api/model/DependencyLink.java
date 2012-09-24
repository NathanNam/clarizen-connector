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

public class DependencyLink extends ClarizenEntity {

    private WorkItem workItem;
    private WorkItem DependsOn;
    private DependencyType dependencyType;
    private Duration Lag;
    private Boolean Shortcut;

    public WorkItem getWorkItem() {
        return workItem;
    }
    public WorkItem getDependsOn() {
        return DependsOn;
    }
    public DependencyType getDependencyType() {
        return dependencyType;
    }
    public Duration getLag() {
        return Lag;
    }
    public Boolean getShortcut() {
        return Shortcut;
    }
    public void setWorkItem(WorkItem workItem) {
        this.workItem = workItem;
    }
    public void setDependsOn(WorkItem dependsOn) {
        DependsOn = dependsOn;
    }
    public void setDependencyType(DependencyType dependencyType) {
        this.dependencyType = dependencyType;
    }
    public void setLag(Duration lag) {
        Lag = lag;
    }
    public void setShortcut(Boolean shortcut) {
        Shortcut = shortcut;
    }
}
