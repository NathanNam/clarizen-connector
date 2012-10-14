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

import java.util.Date;

import com.clarizen.api.EntityId;

public class TaskFlat extends WorkItemFlat {
    private EntityId taskType;
    private EntityId milestone;
    private Integer instanceNumber;
    private Date occurrenceStartDate;

    public EntityId getTaskType() {
        return taskType;
    }
    public EntityId getMilestone() {
        return milestone;
    }
    public Integer getInstanceNumber() {
        return instanceNumber;
    }
    public Date getOccurrenceStartDate() {
        return occurrenceStartDate;
    }
    public void setTaskType(EntityId taskType) {
        this.taskType = taskType;
    }
    public void setMilestone(EntityId milestone) {
        this.milestone = milestone;
    }
    public void setInstanceNumber(Integer instanceNumber) {
        this.instanceNumber = instanceNumber;
    }
    public void setOccurrenceStartDate(Date occurrenceStartDate) {
        this.occurrenceStartDate = occurrenceStartDate;
    }
}
