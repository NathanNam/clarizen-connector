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

import java.util.Date;
import java.util.List;

import com.clarizen.api.FieldValue;

public class ClarizenEntity extends BaseClarizenEntity {

    private org.mule.modules.clarizen.api.model.flat.UserFlat createdBy;
    private Date createdOn;
    private org.mule.modules.clarizen.api.model.flat.UserFlat lastUpdatedBy;
    private Date lastUpdatedOn;
    private Date lastUpdatedBySystemOn;
    private List<FieldValue> customFields;

    public org.mule.modules.clarizen.api.model.flat.UserFlat getCreatedBy() {
        return createdBy;
    }
    public Date getCreatedOn() {
        return createdOn;
    }
    public org.mule.modules.clarizen.api.model.flat.UserFlat getLastUpdatedBy() {
        return lastUpdatedBy;
    }
    public Date getLastUpdatedOn() {
        return lastUpdatedOn;
    }
    public Date getLastUpdatedBySystemOn() {
        return lastUpdatedBySystemOn;
    }
    public List<FieldValue> getCustomFields() {
        return customFields;
    }
    public void setCreatedBy(org.mule.modules.clarizen.api.model.flat.UserFlat createdBy) {
        this.createdBy = createdBy;
    }
    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }
    public void setLastUpdatedBy(
            org.mule.modules.clarizen.api.model.flat.UserFlat lastUpdatedBy) {
        this.lastUpdatedBy = lastUpdatedBy;
    }
    public void setLastUpdatedOn(Date lastUpdatedOn) {
        this.lastUpdatedOn = lastUpdatedOn;
    }
    public void setLastUpdatedBySystemOn(Date lastUpdatedBySystemOn) {
        this.lastUpdatedBySystemOn = lastUpdatedBySystemOn;
    }
    public void setCustomFields(List<FieldValue> customFields) {
        this.customFields = customFields;
    }
}
