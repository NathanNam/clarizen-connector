/**
 * Mule Clarizen Cloud Connector
 *
 * (c) 2003-2014 MuleSoft, Inc. The software in this package is published under
 * the terms of the CPAL v1.0 license, a copy of which has been included with this
 * distribution in the LICENSE.md file.
 */

package org.mule.modules.clarizen.api.model.flat;

import com.clarizen.api.EntityId;

public class TemplateFlat extends ClarizenEntityCustomFieldsFlat {

    private String description;
    private EntityId state;
    private EntityId referenceToTemplate;
    private String SYSID;

    public String getDescription() {
        return description;
    }
    public EntityId getState() {
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
    public void setState(EntityId state) {
        this.state = state;
    }
    public void setReferenceToTemplate(EntityId referenceToTemplate) {
        this.referenceToTemplate = referenceToTemplate;
    }
    public void setSYSID(String sYSID) {
        SYSID = sYSID;
    }    
}
