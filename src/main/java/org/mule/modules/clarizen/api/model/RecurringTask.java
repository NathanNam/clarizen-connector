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

import com.clarizen.api.Duration;

public class RecurringTask extends WorkItem {

    private TaskType taskType;
    private Milestone milestone;
    private RecurrenceType recurrenceType;
    private Integer recurrenceInterval;
    private Boolean workdaysOnly;
    private Integer weekDays;
    private Integer recurrenceDayOfMonth;
    private Months recurrenceMonthOfYear;
    private Date recurrenceStartDate;
    private Date recurrenceEndDate;
    private Duration occurenceDuration;
    private Integer occurrences;

    public TaskType getTaskType() {
        return taskType;
    }
    public Milestone getMilestone() {
        return milestone;
    }
    public RecurrenceType getRecurrenceType() {
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
    public Months getRecurrenceMonthOfYear() {
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
    public void setTaskType(TaskType taskType) {
        this.taskType = taskType;
    }
    public void setMilestone(Milestone milestone) {
        this.milestone = milestone;
    }
    public void setRecurrenceType(RecurrenceType recurrenceType) {
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
    public void setRecurrenceMonthOfYear(Months recurrenceMonthOfYear) {
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
