/**
 * Mule Clarizen Cloud Connector
 *
 * (c) 2003-2014 MuleSoft, Inc. The software in this package is published under
 * the terms of the CPAL v1.0 license, a copy of which has been included with this
 * distribution in the LICENSE.md file.
 */

package org.mule.modules.clarizen.api.model;

import com.clarizen.api.EntityId;

public class BaseClarizenEntity {

    private EntityId id;
    private String name;
    private EntityId entityType;

    public EntityId getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public EntityId getEntityType() {
        return entityType;
    }
    public void setId(EntityId id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setEntityType(EntityId entityType) {
        this.entityType = entityType;
    }
}
