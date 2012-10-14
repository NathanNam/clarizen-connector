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

import com.clarizen.api.Duration;
import com.clarizen.api.EntityId;

public class RecurringTaskFlat extends WorkItemFlat {

    private EntityId taskType;
    private EntityId milestone;
    private EntityId recurrenceType;
    private Integer recurrenceInterval;
    private Boolean workdaysOnly;
    private Integer weekDays;
    private Integer recurrenceDayOfMonth;
    private EntityId recurrenceMonthOfYear;
    private Date recurrenceStartDate;
    private Date recurrenceEndDate;
    private Duration occurenceDuration;
    private Integer occurrences;

    public EntityId getTaskType() {
        return taskType;
    }
    public EntityId getMilestone() {
        return milestone;
    }
    public EntityId getRecurrenceType() {
        return recurrenceType;
    }
    public Integer getRecurrenceInterval() {
        return recurrenceInterval;
    }
    public Boolean getWorkdaysOnly() {
        return workdaysOnly;
    }
    public Integer getWeekDays() {
        return weekDays;
    }
    public Integer getRecurrenceDayOfMonth() {
        return recurrenceDayOfMonth;
    }
    public EntityId getRecurrenceMonthOfYear() {
        return recurrenceMonthOfYear;
    }
    public Date getRecurrenceStartDate() {
        return recurrenceStartDate;
    }
    public Date getRecurrenceEndDate() {
        return recurrenceEndDate;
    }
    public Duration getOccurenceDuration() {
        return occurenceDuration;
    }
    public Integer getOccurrences() {
        return occurrences;
    }
    public void setTaskType(EntityId taskType) {
        this.taskType = taskType;
    }
    public void setMilestone(EntityId milestone) {
        this.milestone = milestone;
    }
    public void setRecurrenceType(EntityId recurrenceType) {
        this.recurrenceType = recurrenceType;
    }
    public void setRecurrenceInterval(Integer recurrenceInterval) {
        this.recurrenceInterval = recurrenceInterval;
    }
    public void setWorkdaysOnly(Boolean workdaysOnly) {
        this.workdaysOnly = workdaysOnly;
    }
    public void setWeekDays(Integer weekDays) {
        this.weekDays = weekDays;
    }
    public void setRecurrenceDayOfMonth(Integer recurrenceDayOfMonth) {
        this.recurrenceDayOfMonth = recurrenceDayOfMonth;
    }
    public void setRecurrenceMonthOfYear(EntityId recurrenceMonthOfYear) {
        this.recurrenceMonthOfYear = recurrenceMonthOfYear;
    }
    public void setRecurrenceStartDate(Date recurrenceStartDate) {
        this.recurrenceStartDate = recurrenceStartDate;
    }
    public void setRecurrenceEndDate(Date recurrenceEndDate) {
        this.recurrenceEndDate = recurrenceEndDate;
    }
    public void setOccurenceDuration(Duration occurenceDuration) {
        this.occurenceDuration = occurenceDuration;
    }
    public void setOccurrences(Integer occurrences) {
        this.occurrences = occurrences;
    }
}
