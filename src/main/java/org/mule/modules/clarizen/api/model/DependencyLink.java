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

    private org.mule.modules.clarizen.api.model.flat.WorkItemFlat workItem;
    private org.mule.modules.clarizen.api.model.flat.WorkItemFlat DependsOn;
    private org.mule.modules.clarizen.api.model.flat.DependencyTypeFlat dependencyType;
    private Duration Lag;
    private Boolean Shortcut;

    public org.mule.modules.clarizen.api.model.flat.WorkItemFlat getWorkItem() {
        return workItem;
    }
    public org.mule.modules.clarizen.api.model.flat.WorkItemFlat getDependsOn() {
        return DependsOn;
    }
    public org.mule.modules.clarizen.api.model.flat.DependencyTypeFlat getDependencyType() {
        return dependencyType;
    }
    public Duration getLag() {
        return Lag;
    }
    public Boolean getShortcut() {
        return Shortcut;
    }
    public void setWorkItem(
            org.mule.modules.clarizen.api.model.flat.WorkItemFlat workItem) {
        this.workItem = workItem;
    }
    public void setDependsOn(
            org.mule.modules.clarizen.api.model.flat.WorkItemFlat dependsOn) {
        DependsOn = dependsOn;
    }
    public void setDependencyType(
            org.mule.modules.clarizen.api.model.flat.DependencyTypeFlat dependencyType) {
        this.dependencyType = dependencyType;
    }
    public void setLag(Duration lag) {
        Lag = lag;
    }
    public void setShortcut(Boolean shortcut) {
        Shortcut = shortcut;
    }
}
