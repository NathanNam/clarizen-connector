/**
 * Mule Clarizen Cloud Connector
 *
 * (c) 2003-2014 MuleSoft, Inc. The software in this package is published under
 * the terms of the CPAL v1.0 license, a copy of which has been included with this
 * distribution in the LICENSE.md file.
 */

package org.mule.modules.clarizen.api.model.flat;

import java.util.Date;

import com.clarizen.api.EntityId;

public class ClarizenEntityFlat extends org.mule.modules.clarizen.api.model.BaseClarizenEntity {

    private EntityId createdBy;
    private Date createdOn;
    private EntityId lastUpdatedBy;
    private Date lastUpdatedOn;
    private Date lastUpdatedBySystemOn;

    public EntityId getCreatedBy() {
        return createdBy;
    }
    public Date getCreatedOn() {
        return createdOn;
    }
    public EntityId getLastUpdatedBy() {
        return lastUpdatedBy;
    }
    public Date getLastUpdatedOn() {
        return lastUpdatedOn;
    }
    public Date getLastUpdatedBySystemOn() {
        return lastUpdatedBySystemOn;
    }
    public void setCreatedBy(EntityId createdBy) {
        this.createdBy = createdBy;
    }
    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }
    public void setLastUpdatedBy(EntityId lastUpdatedBy) {
        this.lastUpdatedBy = lastUpdatedBy;
    }
    public void setLastUpdatedOn(Date lastUpdatedOn) {
        this.lastUpdatedOn = lastUpdatedOn;
    }
    public void setLastUpdatedBySystemOn(Date lastUpdatedBySystemOn) {
        this.lastUpdatedBySystemOn = lastUpdatedBySystemOn;
    }
}
