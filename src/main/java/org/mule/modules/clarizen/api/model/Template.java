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

import com.clarizen.api.EntityId;

public class Template extends ClarizenEntity {

    private String description;
    private State state;
    private EntityId referenceToTemplate;
    private String SYSID;

    public String getDescription() {
        return description;
    }
    public State getState() {
        return state;
    }
    public EntityId getReferenceToTemplate() {
        return referenceToTemplate;
    }
    public String getSYSID() {
        return SYSID;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public void setState(State state) {
        this.state = state;
    }
    public void setReferenceToTemplate(EntityId referenceToTemplate) {
        this.referenceToTemplate = referenceToTemplate;
    }
    public void setSYSID(String sYSID) {
        SYSID = sYSID;
    }
}
