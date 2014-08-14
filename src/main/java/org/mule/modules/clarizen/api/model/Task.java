/**
 * Mule Clarizen Cloud Connector
 *
 * (c) 2003-2014 MuleSoft, Inc. The software in this package is published under
 * the terms of the CPAL v1.0 license, a copy of which has been included with this
 * distribution in the LICENSE.md file.
 */

package org.mule.modules.clarizen.api.model;

import java.util.Date;

public class Task extends WorkItem {
    private org.mule.modules.clarizen.api.model.flat.TaskTypeFlat taskType;
    private org.mule.modules.clarizen.api.model.flat.MilestoneFlat milestone;
    private Integer instanceNumber;
    private Date occurrenceStartDate;

    public org.mule.modules.clarizen.api.model.flat.TaskTypeFlat getTaskType() {
        return taskType;
    }
    public org.mule.modules.clarizen.api.model.flat.MilestoneFlat getMilestone() {
        return milestone;
    }
    public Integer getInstanceNumber() {
        return instanceNumber;
    }
    public Date getOccurrenceStartDate() {
        return occurrenceStartDate;
    }
    public void setTaskType(
            org.mule.modules.clarizen.api.model.flat.TaskTypeFlat taskType) {
        this.taskType = taskType;
    }
    public void setMilestone(
            org.mule.modules.clarizen.api.model.flat.MilestoneFlat milestone) {
        this.milestone = milestone;
    }
    public void setInstanceNumber(Integer instanceNumber) {
        this.instanceNumber = instanceNumber;
    }
    public void setOccurrenceStartDate(Date occurrenceStartDate) {
        this.occurrenceStartDate = occurrenceStartDate;
    }
    
}
