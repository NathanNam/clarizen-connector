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

public class DependencyLinkFlat extends ClarizenEntityCustomFieldsFlat {

    private EntityId workItem;
    private EntityId DependsOn;
    private EntityId dependencyType;
    private Duration Lag;
    private Boolean Shortcut;

    public EntityId getWorkItem() {
        return workItem;
    }
    public EntityId getDependsOn() {
        return DependsOn;
    }
    public EntityId getDependencyType() {
        return dependencyType;
    }
    public Duration getLag() {
        return Lag;
    }
    public Boolean getShortcut() {
        return Shortcut;
    }
    public void setWorkItem(EntityId workItem) {
        this.workItem = workItem;
    }
    public void setDependsOn(EntityId dependsOn) {
        DependsOn = dependsOn;
    }
    public void setDependencyType(EntityId dependencyType) {
        this.dependencyType = dependencyType;
    }
    public void setLag(Duration lag) {
        Lag = lag;
    }
    public void setShortcut(Boolean shortcut) {
        Shortcut = shortcut;
    }
}
