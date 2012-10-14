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
import com.clarizen.api.Money;

public class WorkItem extends ClarizenEntity {

    private String description;
    private org.mule.modules.clarizen.api.model.flat.StateFlat state;
    private org.mule.modules.clarizen.api.model.flat.PhaseFlat phase;
    private Date startDate;
    private Date dueDate;
    private Duration duration;
    private Date actualStartDate;
    private Date actualEndDate;
    private org.mule.modules.clarizen.api.model.flat.TrackStatusFlat trackStatus;
    private Long conflicts;
    private Boolean onCriticalPath;
    private Date earliestStartDate;
    private Date latestStartDate;
    private Date earliestEndDate;
    private Date latestEndDate;
    private Double expectedProgress;
    private org.mule.modules.clarizen.api.model.flat.SchedulingTypeFlat schedulingType;
    private org.mule.modules.clarizen.api.model.flat.ImportedFromFlat importedFrom;
    private org.mule.modules.clarizen.api.model.flat.ImportanceFlat importance;
    private Integer priority;
    private Double percentCompleted;
    private org.mule.modules.clarizen.api.model.flat.UserFlat manager;
    private Boolean chargedTypeManuallySet;
    private Integer childrenCount;
    private Integer successorsCount;
    private Integer predecessorsCount;
    private Integer attachmentsCount;
    private Integer postsCount;
    private Integer notesCount;
    private Boolean reportable;
    private Boolean reportableManuallySet;
    private Boolean billable;
    private Integer childShortcutCount;
    private org.mule.modules.clarizen.api.model.flat.ProjectFlat project;
    private org.mule.modules.clarizen.api.model.flat.WorkPolicyFlat workPolicy;
    private org.mule.modules.clarizen.api.model.flat.CommitLevelFlat commitLevel;
    private Date reportingStartDate;
    private String SYSID;
    private Duration work;
    private Duration actualEffort;
    private Duration remainingEffort;
    private Boolean workManuallySet;
    private Boolean remainingEffortManuallySet;
    private Duration workVariance;
    private Duration actualDuration;
    private Duration startDateVariance;
    private Money actualCost;
    private Duration dueDateVariance;
    private Money plannedBudget;
    private Duration durationVariance;
    private Boolean actualCostManuallySet;
    private Boolean plannedBudgetManuallySet;
    private Duration timeTrackingEffort;
    private Money timeTrackingCost;
    private Money fixedCost;
    private Money fixedPrice;
    private Double percentInvested;
    private Money costVariance;
    private Money timeTrackingBilling;
    private Money earnedValue;
    private Money plannedRevenue;
    private Double CPI;
    private Money actualRevenue;
    private Double SPI;
    private Boolean plannedRevenueManuallySet;
    private Boolean actualRevenueManuallySet;
    private Money profitability;
    private Double percentProfitability;
    private Money plannedExpenses;
    private Money directPlannedExpenses;
    private Money actualExpenses;
    private Money directActualExpenses;
    private Money projectedExpenses;
    private Money directProjectedExpenses;
    private Money plannedBilledExpenses;
    private Money directPlannedBilledExpenses;
    private Money actualBilledExpenses;
    private Money directActualBilledExpenses;
    private Money projectedBilledExpenses;
    private Money directProjectedBilledExpenses;
    private org.mule.modules.clarizen.api.model.flat.CurrencyTypeFlat revenueCurrencyType;
    private org.mule.modules.clarizen.api.model.flat.CurrencyTypeFlat costCurrencyType;
    private org.mule.modules.clarizen.api.model.flat.PendingFlat pending;
    private Integer issuesCount;
    private Date lastUpdatedBySystemOn;
    private Boolean allowReportingOnSubItems;
    private Date committedDate;
    private Integer resourcesCount;
    private Duration budgetedHours;
    private Integer emailsCount;
    private Money costBalance;
    private org.mule.modules.clarizen.api.model.flat.BudgetStatusFlat budgetStatus;
    private Money revenueBalance;
    private Boolean actualEffortUpdatedFromTimesheets;
    private org.mule.modules.clarizen.api.model.flat.ProjectFlat parentProject;
    private String sfExternalId;
    private String sfExternalName;
    private String internalId;
    private String orderID;
    private String SKU;
    private Date baselineStartDate;
    private Duration baselineStartDateVariance;
    private Date baselineDueDate;
    private Duration baselineDueDateVariance;
    private Duration baselineDuration;
    private Duration baselineDurationVariance;
    private Duration baselineWork;
    private Duration baselineWorkVariance;
    private Money baselineCost;
    private Money baselineCostsVariance;
    private Money baselineRevenue;
    private Money baselineRevenueVariance;
    private String internalStatus;
    private Boolean deliverable;
    private String deliverableType;
    private Boolean executable;
    private org.mule.modules.clarizen.api.model.flat.WorkItemFlat parent;
    private Money plannedAmount;
    private Double ETC;
    private Money chargedAmount;
    private Double EAC;
    private Double TCPI;
    private Money totalEstimatedCost;
    private Boolean chargedAmountManuallySet;
    private Money revenueEarnedValue;
    private org.mule.modules.clarizen.api.model.flat.ChargedTypeFlat charged;
    private Double RPI;
    private Double RETC;
    private Double REAC;
    private Double RTCPI;
    private Long completnessDefinition;
    private org.mule.modules.clarizen.api.model.flat.TaskReportingPolicyFlat taskReportingPolicy;
    private Boolean taskReportingPolicyManuallySet;
    private Boolean individualReporting;
    private Date baselineCreationDate;
    private Integer aggregatedStopwatchesCount;
    private org.mule.modules.clarizen.api.model.flat.StopwatchAggregateStateFlat activeStopwatch;
    private String objectAlias;
    private Integer stopwatchesCount;
    private Duration pendingTimeTrackingEffort;

    public String getDescription() {
        return description;
    }
    public org.mule.modules.clarizen.api.model.flat.StateFlat getState() {
        return state;
    }
    public org.mule.modules.clarizen.api.model.flat.PhaseFlat getPhase() {
        return phase;
    }
    public Date getStartDate() {
        return startDate;
    }
    public Date getDueDate() {
        return dueDate;
    }
    public Duration getDuration() {
        return duration;
    }
    public Date getActualStartDate() {
        return actualStartDate;
    }
    public Date getActualEndDate() {
        return actualEndDate;
    }
    public org.mule.modules.clarizen.api.model.flat.TrackStatusFlat getTrackStatus() {
        return trackStatus;
    }
    public Long getConflicts() {
        return conflicts;
    }
    public Boolean getOnCriticalPath() {
        return onCriticalPath;
    }
    public Date getEarliestStartDate() {
        return earliestStartDate;
    }
    public Date getLatestStartDate() {
        return latestStartDate;
    }
    public Date getEarliestEndDate() {
        return earliestEndDate;
    }
    public Date getLatestEndDate() {
        return latestEndDate;
    }
    public Double getExpectedProgress() {
        return expectedProgress;
    }
    public org.mule.modules.clarizen.api.model.flat.SchedulingTypeFlat getSchedulingType() {
        return schedulingType;
    }
    public org.mule.modules.clarizen.api.model.flat.ImportedFromFlat getImportedFrom() {
        return importedFrom;
    }
    public org.mule.modules.clarizen.api.model.flat.ImportanceFlat getImportance() {
        return importance;
    }
    public Integer getPriority() {
        return priority;
    }
    public Double getPercentCompleted() {
        return percentCompleted;
    }
    public org.mule.modules.clarizen.api.model.flat.UserFlat getManager() {
        return manager;
    }
    public Boolean getChargedTypeManuallySet() {
        return chargedTypeManuallySet;
    }
    public Integer getChildrenCount() {
        return childrenCount;
    }
    public Integer getSuccessorsCount() {
        return successorsCount;
    }
    public Integer getPredecessorsCount() {
        return predecessorsCount;
    }
    public Integer getAttachmentsCount() {
        return attachmentsCount;
    }
    public Integer getPostsCount() {
        return postsCount;
    }
    public Integer getNotesCount() {
        return notesCount;
    }
    public Boolean getReportable() {
        return reportable;
    }
    public Boolean getReportableManuallySet() {
        return reportableManuallySet;
    }
    public Boolean getBillable() {
        return billable;
    }
    public Integer getChildShortcutCount() {
        return childShortcutCount;
    }
    public org.mule.modules.clarizen.api.model.flat.ProjectFlat getProject() {
        return project;
    }
    public org.mule.modules.clarizen.api.model.flat.WorkPolicyFlat getWorkPolicy() {
        return workPolicy;
    }
    public org.mule.modules.clarizen.api.model.flat.CommitLevelFlat getCommitLevel() {
        return commitLevel;
    }
    public Date getReportingStartDate() {
        return reportingStartDate;
    }
    public String getSYSID() {
        return SYSID;
    }
    public Duration getWork() {
        return work;
    }
    public Duration getActualEffort() {
        return actualEffort;
    }
    public Duration getRemainingEffort() {
        return remainingEffort;
    }
    public Boolean getWorkManuallySet() {
        return workManuallySet;
    }
    public Boolean getRemainingEffortManuallySet() {
        return remainingEffortManuallySet;
    }
    public Duration getWorkVariance() {
        return workVariance;
    }
    public Duration getActualDuration() {
        return actualDuration;
    }
    public Duration getStartDateVariance() {
        return startDateVariance;
    }
    public Money getActualCost() {
        return actualCost;
    }
    public Duration getDueDateVariance() {
        return dueDateVariance;
    }
    public Money getPlannedBudget() {
        return plannedBudget;
    }
    public Duration getDurationVariance() {
        return durationVariance;
    }
    public Boolean getActualCostManuallySet() {
        return actualCostManuallySet;
    }
    public Boolean getPlannedBudgetManuallySet() {
        return plannedBudgetManuallySet;
    }
    public Duration getTimeTrackingEffort() {
        return timeTrackingEffort;
    }
    public Money getTimeTrackingCost() {
        return timeTrackingCost;
    }
    public Money getFixedCost() {
        return fixedCost;
    }
    public Money getFixedPrice() {
        return fixedPrice;
    }
    public Double getPercentInvested() {
        return percentInvested;
    }
    public Money getCostVariance() {
        return costVariance;
    }
    public Money getTimeTrackingBilling() {
        return timeTrackingBilling;
    }
    public Money getEarnedValue() {
        return earnedValue;
    }
    public Money getPlannedRevenue() {
        return plannedRevenue;
    }
    public Double getCPI() {
        return CPI;
    }
    public Money getActualRevenue() {
        return actualRevenue;
    }
    public Double getSPI() {
        return SPI;
    }
    public Boolean getPlannedRevenueManuallySet() {
        return plannedRevenueManuallySet;
    }
    public Boolean getActualRevenueManuallySet() {
        return actualRevenueManuallySet;
    }
    public Money getProfitability() {
        return profitability;
    }
    public Double getPercentProfitability() {
        return percentProfitability;
    }
    public Money getPlannedExpenses() {
        return plannedExpenses;
    }
    public Money getDirectPlannedExpenses() {
        return directPlannedExpenses;
    }
    public Money getActualExpenses() {
        return actualExpenses;
    }
    public Money getDirectActualExpenses() {
        return directActualExpenses;
    }
    public Money getProjectedExpenses() {
        return projectedExpenses;
    }
    public Money getDirectProjectedExpenses() {
        return directProjectedExpenses;
    }
    public Money getPlannedBilledExpenses() {
        return plannedBilledExpenses;
    }
    public Money getDirectPlannedBilledExpenses() {
        return directPlannedBilledExpenses;
    }
    public Money getActualBilledExpenses() {
        return actualBilledExpenses;
    }
    public Money getDirectActualBilledExpenses() {
        return directActualBilledExpenses;
    }
    public Money getProjectedBilledExpenses() {
        return projectedBilledExpenses;
    }
    public Money getDirectProjectedBilledExpenses() {
        return directProjectedBilledExpenses;
    }
    public org.mule.modules.clarizen.api.model.flat.CurrencyTypeFlat getRevenueCurrencyType() {
        return revenueCurrencyType;
    }
    public org.mule.modules.clarizen.api.model.flat.CurrencyTypeFlat getCostCurrencyType() {
        return costCurrencyType;
    }
    public org.mule.modules.clarizen.api.model.flat.PendingFlat getPending() {
        return pending;
    }
    public Integer getIssuesCount() {
        return issuesCount;
    }
    public Date getLastUpdatedBySystemOn() {
        return lastUpdatedBySystemOn;
    }
    public Boolean getAllowReportingOnSubItems() {
        return allowReportingOnSubItems;
    }
    public Date getCommittedDate() {
        return committedDate;
    }
    public Integer getResourcesCount() {
        return resourcesCount;
    }
    public Duration getBudgetedHours() {
        return budgetedHours;
    }
    public Integer getEmailsCount() {
        return emailsCount;
    }
    public Money getCostBalance() {
        return costBalance;
    }
    public org.mule.modules.clarizen.api.model.flat.BudgetStatusFlat getBudgetStatus() {
        return budgetStatus;
    }
    public Money getRevenueBalance() {
        return revenueBalance;
    }
    public Boolean getActualEffortUpdatedFromTimesheets() {
        return actualEffortUpdatedFromTimesheets;
    }
    public org.mule.modules.clarizen.api.model.flat.ProjectFlat getParentProject() {
        return parentProject;
    }
    public String getSfExternalId() {
        return sfExternalId;
    }
    public String getSfExternalName() {
        return sfExternalName;
    }
    public String getInternalId() {
        return internalId;
    }
    public String getOrderID() {
        return orderID;
    }
    public String getSKU() {
        return SKU;
    }
    public Date getBaselineStartDate() {
        return baselineStartDate;
    }
    public Duration getBaselineStartDateVariance() {
        return baselineStartDateVariance;
    }
    public Date getBaselineDueDate() {
        return baselineDueDate;
    }
    public Duration getBaselineDueDateVariance() {
        return baselineDueDateVariance;
    }
    public Duration getBaselineDuration() {
        return baselineDuration;
    }
    public Duration getBaselineDurationVariance() {
        return baselineDurationVariance;
    }
    public Duration getBaselineWork() {
        return baselineWork;
    }
    public Duration getBaselineWorkVariance() {
        return baselineWorkVariance;
    }
    public Money getBaselineCost() {
        return baselineCost;
    }
    public Money getBaselineCostsVariance() {
        return baselineCostsVariance;
    }
    public Money getBaselineRevenue() {
        return baselineRevenue;
    }
    public Money getBaselineRevenueVariance() {
        return baselineRevenueVariance;
    }
    public String getInternalStatus() {
        return internalStatus;
    }
    public Boolean getDeliverable() {
        return deliverable;
    }
    public String getDeliverableType() {
        return deliverableType;
    }
    public Boolean getExecutable() {
        return executable;
    }
    public org.mule.modules.clarizen.api.model.flat.WorkItemFlat getParent() {
        return parent;
    }
    public Money getPlannedAmount() {
        return plannedAmount;
    }
    public Double getETC() {
        return ETC;
    }
    public Money getChargedAmount() {
        return chargedAmount;
    }
    public Double getEAC() {
        return EAC;
    }
    public Double getTCPI() {
        return TCPI;
    }
    public Money getTotalEstimatedCost() {
        return totalEstimatedCost;
    }
    public Boolean getChargedAmountManuallySet() {
        return chargedAmountManuallySet;
    }
    public Money getRevenueEarnedValue() {
        return revenueEarnedValue;
    }
    public org.mule.modules.clarizen.api.model.flat.ChargedTypeFlat getCharged() {
        return charged;
    }
    public Double getRPI() {
        return RPI;
    }
    public Double getRETC() {
        return RETC;
    }
    public Double getREAC() {
        return REAC;
    }
    public Double getRTCPI() {
        return RTCPI;
    }
    public Long getCompletnessDefinition() {
        return completnessDefinition;
    }
    public org.mule.modules.clarizen.api.model.flat.TaskReportingPolicyFlat getTaskReportingPolicy() {
        return taskReportingPolicy;
    }
    public Boolean getTaskReportingPolicyManuallySet() {
        return taskReportingPolicyManuallySet;
    }
    public Boolean getIndividualReporting() {
        return individualReporting;
    }
    public Date getBaselineCreationDate() {
        return baselineCreationDate;
    }
    public Integer getAggregatedStopwatchesCount() {
        return aggregatedStopwatchesCount;
    }
    public org.mule.modules.clarizen.api.model.flat.StopwatchAggregateStateFlat getActiveStopwatch() {
        return activeStopwatch;
    }
    public String getObjectAlias() {
        return objectAlias;
    }
    public Integer getStopwatchesCount() {
        return stopwatchesCount;
    }
    public Duration getPendingTimeTrackingEffort() {
        return pendingTimeTrackingEffort;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public void setState(org.mule.modules.clarizen.api.model.flat.StateFlat state) {
        this.state = state;
    }
    public void setPhase(org.mule.modules.clarizen.api.model.flat.PhaseFlat phase) {
        this.phase = phase;
    }
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }
    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }
    public void setDuration(Duration duration) {
        this.duration = duration;
    }
    public void setActualStartDate(Date actualStartDate) {
        this.actualStartDate = actualStartDate;
    }
    public void setActualEndDate(Date actualEndDate) {
        this.actualEndDate = actualEndDate;
    }
    public void setTrackStatus(
            org.mule.modules.clarizen.api.model.flat.TrackStatusFlat trackStatus) {
        this.trackStatus = trackStatus;
    }
    public void setConflicts(Long conflicts) {
        this.conflicts = conflicts;
    }
    public void setOnCriticalPath(Boolean onCriticalPath) {
        this.onCriticalPath = onCriticalPath;
    }
    public void setEarliestStartDate(Date earliestStartDate) {
        this.earliestStartDate = earliestStartDate;
    }
    public void setLatestStartDate(Date latestStartDate) {
        this.latestStartDate = latestStartDate;
    }
    public void setEarliestEndDate(Date earliestEndDate) {
        this.earliestEndDate = earliestEndDate;
    }
    public void setLatestEndDate(Date latestEndDate) {
        this.latestEndDate = latestEndDate;
    }
    public void setExpectedProgress(Double expectedProgress) {
        this.expectedProgress = expectedProgress;
    }
    public void setSchedulingType(
            org.mule.modules.clarizen.api.model.flat.SchedulingTypeFlat schedulingType) {
        this.schedulingType = schedulingType;
    }
    public void setImportedFrom(
            org.mule.modules.clarizen.api.model.flat.ImportedFromFlat importedFrom) {
        this.importedFrom = importedFrom;
    }
    public void setImportance(
            org.mule.modules.clarizen.api.model.flat.ImportanceFlat importance) {
        this.importance = importance;
    }
    public void setPriority(Integer priority) {
        this.priority = priority;
    }
    public void setPercentCompleted(Double percentCompleted) {
        this.percentCompleted = percentCompleted;
    }
    public void setManager(org.mule.modules.clarizen.api.model.flat.UserFlat manager) {
        this.manager = manager;
    }
    public void setChargedTypeManuallySet(Boolean chargedTypeManuallySet) {
        this.chargedTypeManuallySet = chargedTypeManuallySet;
    }
    public void setChildrenCount(Integer childrenCount) {
        this.childrenCount = childrenCount;
    }
    public void setSuccessorsCount(Integer successorsCount) {
        this.successorsCount = successorsCount;
    }
    public void setPredecessorsCount(Integer predecessorsCount) {
        this.predecessorsCount = predecessorsCount;
    }
    public void setAttachmentsCount(Integer attachmentsCount) {
        this.attachmentsCount = attachmentsCount;
    }
    public void setPostsCount(Integer postsCount) {
        this.postsCount = postsCount;
    }
    public void setNotesCount(Integer notesCount) {
        this.notesCount = notesCount;
    }
    public void setReportable(Boolean reportable) {
        this.reportable = reportable;
    }
    public void setReportableManuallySet(Boolean reportableManuallySet) {
        this.reportableManuallySet = reportableManuallySet;
    }
    public void setBillable(Boolean billable) {
        this.billable = billable;
    }
    public void setChildShortcutCount(Integer childShortcutCount) {
        this.childShortcutCount = childShortcutCount;
    }
    public void setProject(org.mule.modules.clarizen.api.model.flat.ProjectFlat project) {
        this.project = project;
    }
    public void setWorkPolicy(
            org.mule.modules.clarizen.api.model.flat.WorkPolicyFlat workPolicy) {
        this.workPolicy = workPolicy;
    }
    public void setCommitLevel(
            org.mule.modules.clarizen.api.model.flat.CommitLevelFlat commitLevel) {
        this.commitLevel = commitLevel;
    }
    public void setReportingStartDate(Date reportingStartDate) {
        this.reportingStartDate = reportingStartDate;
    }
    public void setSYSID(String sYSID) {
        SYSID = sYSID;
    }
    public void setWork(Duration work) {
        this.work = work;
    }
    public void setActualEffort(Duration actualEffort) {
        this.actualEffort = actualEffort;
    }
    public void setRemainingEffort(Duration remainingEffort) {
        this.remainingEffort = remainingEffort;
    }
    public void setWorkManuallySet(Boolean workManuallySet) {
        this.workManuallySet = workManuallySet;
    }
    public void setRemainingEffortManuallySet(Boolean remainingEffortManuallySet) {
        this.remainingEffortManuallySet = remainingEffortManuallySet;
    }
    public void setWorkVariance(Duration workVariance) {
        this.workVariance = workVariance;
    }
    public void setActualDuration(Duration actualDuration) {
        this.actualDuration = actualDuration;
    }
    public void setStartDateVariance(Duration startDateVariance) {
        this.startDateVariance = startDateVariance;
    }
    public void setActualCost(Money actualCost) {
        this.actualCost = actualCost;
    }
    public void setDueDateVariance(Duration dueDateVariance) {
        this.dueDateVariance = dueDateVariance;
    }
    public void setPlannedBudget(Money plannedBudget) {
        this.plannedBudget = plannedBudget;
    }
    public void setDurationVariance(Duration durationVariance) {
        this.durationVariance = durationVariance;
    }
    public void setActualCostManuallySet(Boolean actualCostManuallySet) {
        this.actualCostManuallySet = actualCostManuallySet;
    }
    public void setPlannedBudgetManuallySet(Boolean plannedBudgetManuallySet) {
        this.plannedBudgetManuallySet = plannedBudgetManuallySet;
    }
    public void setTimeTrackingEffort(Duration timeTrackingEffort) {
        this.timeTrackingEffort = timeTrackingEffort;
    }
    public void setTimeTrackingCost(Money timeTrackingCost) {
        this.timeTrackingCost = timeTrackingCost;
    }
    public void setFixedCost(Money fixedCost) {
        this.fixedCost = fixedCost;
    }
    public void setFixedPrice(Money fixedPrice) {
        this.fixedPrice = fixedPrice;
    }
    public void setPercentInvested(Double percentInvested) {
        this.percentInvested = percentInvested;
    }
    public void setCostVariance(Money costVariance) {
        this.costVariance = costVariance;
    }
    public void setTimeTrackingBilling(Money timeTrackingBilling) {
        this.timeTrackingBilling = timeTrackingBilling;
    }
    public void setEarnedValue(Money earnedValue) {
        this.earnedValue = earnedValue;
    }
    public void setPlannedRevenue(Money plannedRevenue) {
        this.plannedRevenue = plannedRevenue;
    }
    public void setCPI(Double cPI) {
        CPI = cPI;
    }
    public void setActualRevenue(Money actualRevenue) {
        this.actualRevenue = actualRevenue;
    }
    public void setSPI(Double sPI) {
        SPI = sPI;
    }
    public void setPlannedRevenueManuallySet(Boolean plannedRevenueManuallySet) {
        this.plannedRevenueManuallySet = plannedRevenueManuallySet;
    }
    public void setActualRevenueManuallySet(Boolean actualRevenueManuallySet) {
        this.actualRevenueManuallySet = actualRevenueManuallySet;
    }
    public void setProfitability(Money profitability) {
        this.profitability = profitability;
    }
    public void setPercentProfitability(Double percentProfitability) {
        this.percentProfitability = percentProfitability;
    }
    public void setPlannedExpenses(Money plannedExpenses) {
        this.plannedExpenses = plannedExpenses;
    }
    public void setDirectPlannedExpenses(Money directPlannedExpenses) {
        this.directPlannedExpenses = directPlannedExpenses;
    }
    public void setActualExpenses(Money actualExpenses) {
        this.actualExpenses = actualExpenses;
    }
    public void setDirectActualExpenses(Money directActualExpenses) {
        this.directActualExpenses = directActualExpenses;
    }
    public void setProjectedExpenses(Money projectedExpenses) {
        this.projectedExpenses = projectedExpenses;
    }
    public void setDirectProjectedExpenses(Money directProjectedExpenses) {
        this.directProjectedExpenses = directProjectedExpenses;
    }
    public void setPlannedBilledExpenses(Money plannedBilledExpenses) {
        this.plannedBilledExpenses = plannedBilledExpenses;
    }
    public void setDirectPlannedBilledExpenses(Money directPlannedBilledExpenses) {
        this.directPlannedBilledExpenses = directPlannedBilledExpenses;
    }
    public void setActualBilledExpenses(Money actualBilledExpenses) {
        this.actualBilledExpenses = actualBilledExpenses;
    }
    public void setDirectActualBilledExpenses(Money directActualBilledExpenses) {
        this.directActualBilledExpenses = directActualBilledExpenses;
    }
    public void setProjectedBilledExpenses(Money projectedBilledExpenses) {
        this.projectedBilledExpenses = projectedBilledExpenses;
    }
    public void setDirectProjectedBilledExpenses(Money directProjectedBilledExpenses) {
        this.directProjectedBilledExpenses = directProjectedBilledExpenses;
    }
    public void setRevenueCurrencyType(
            org.mule.modules.clarizen.api.model.flat.CurrencyTypeFlat revenueCurrencyType) {
        this.revenueCurrencyType = revenueCurrencyType;
    }
    public void setCostCurrencyType(
            org.mule.modules.clarizen.api.model.flat.CurrencyTypeFlat costCurrencyType) {
        this.costCurrencyType = costCurrencyType;
    }
    public void setPending(org.mule.modules.clarizen.api.model.flat.PendingFlat pending) {
        this.pending = pending;
    }
    public void setIssuesCount(Integer issuesCount) {
        this.issuesCount = issuesCount;
    }
    public void setLastUpdatedBySystemOn(Date lastUpdatedBySystemOn) {
        this.lastUpdatedBySystemOn = lastUpdatedBySystemOn;
    }
    public void setAllowReportingOnSubItems(Boolean allowReportingOnSubItems) {
        this.allowReportingOnSubItems = allowReportingOnSubItems;
    }
    public void setCommittedDate(Date committedDate) {
        this.committedDate = committedDate;
    }
    public void setResourcesCount(Integer resourcesCount) {
        this.resourcesCount = resourcesCount;
    }
    public void setBudgetedHours(Duration budgetedHours) {
        this.budgetedHours = budgetedHours;
    }
    public void setEmailsCount(Integer emailsCount) {
        this.emailsCount = emailsCount;
    }
    public void setCostBalance(Money costBalance) {
        this.costBalance = costBalance;
    }
    public void setBudgetStatus(
            org.mule.modules.clarizen.api.model.flat.BudgetStatusFlat budgetStatus) {
        this.budgetStatus = budgetStatus;
    }
    public void setRevenueBalance(Money revenueBalance) {
        this.revenueBalance = revenueBalance;
    }
    public void setActualEffortUpdatedFromTimesheets(
            Boolean actualEffortUpdatedFromTimesheets) {
        this.actualEffortUpdatedFromTimesheets = actualEffortUpdatedFromTimesheets;
    }
    public void setParentProject(
            org.mule.modules.clarizen.api.model.flat.ProjectFlat parentProject) {
        this.parentProject = parentProject;
    }
    public void setSfExternalId(String sfExternalId) {
        this.sfExternalId = sfExternalId;
    }
    public void setSfExternalName(String sfExternalName) {
        this.sfExternalName = sfExternalName;
    }
    public void setInternalId(String internalId) {
        this.internalId = internalId;
    }
    public void setOrderID(String orderID) {
        this.orderID = orderID;
    }
    public void setSKU(String sKU) {
        SKU = sKU;
    }
    public void setBaselineStartDate(Date baselineStartDate) {
        this.baselineStartDate = baselineStartDate;
    }
    public void setBaselineStartDateVariance(Duration baselineStartDateVariance) {
        this.baselineStartDateVariance = baselineStartDateVariance;
    }
    public void setBaselineDueDate(Date baselineDueDate) {
        this.baselineDueDate = baselineDueDate;
    }
    public void setBaselineDueDateVariance(Duration baselineDueDateVariance) {
        this.baselineDueDateVariance = baselineDueDateVariance;
    }
    public void setBaselineDuration(Duration baselineDuration) {
        this.baselineDuration = baselineDuration;
    }
    public void setBaselineDurationVariance(Duration baselineDurationVariance) {
        this.baselineDurationVariance = baselineDurationVariance;
    }
    public void setBaselineWork(Duration baselineWork) {
        this.baselineWork = baselineWork;
    }
    public void setBaselineWorkVariance(Duration baselineWorkVariance) {
        this.baselineWorkVariance = baselineWorkVariance;
    }
    public void setBaselineCost(Money baselineCost) {
        this.baselineCost = baselineCost;
    }
    public void setBaselineCostsVariance(Money baselineCostsVariance) {
        this.baselineCostsVariance = baselineCostsVariance;
    }
    public void setBaselineRevenue(Money baselineRevenue) {
        this.baselineRevenue = baselineRevenue;
    }
    public void setBaselineRevenueVariance(Money baselineRevenueVariance) {
        this.baselineRevenueVariance = baselineRevenueVariance;
    }
    public void setInternalStatus(String internalStatus) {
        this.internalStatus = internalStatus;
    }
    public void setDeliverable(Boolean deliverable) {
        this.deliverable = deliverable;
    }
    public void setDeliverableType(String deliverableType) {
        this.deliverableType = deliverableType;
    }
    public void setExecutable(Boolean executable) {
        this.executable = executable;
    }
    public void setParent(org.mule.modules.clarizen.api.model.flat.WorkItemFlat parent) {
        this.parent = parent;
    }
    public void setPlannedAmount(Money plannedAmount) {
        this.plannedAmount = plannedAmount;
    }
    public void setETC(Double eTC) {
        ETC = eTC;
    }
    public void setChargedAmount(Money chargedAmount) {
        this.chargedAmount = chargedAmount;
    }
    public void setEAC(Double eAC) {
        EAC = eAC;
    }
    public void setTCPI(Double tCPI) {
        TCPI = tCPI;
    }
    public void setTotalEstimatedCost(Money totalEstimatedCost) {
        this.totalEstimatedCost = totalEstimatedCost;
    }
    public void setChargedAmountManuallySet(Boolean chargedAmountManuallySet) {
        this.chargedAmountManuallySet = chargedAmountManuallySet;
    }
    public void setRevenueEarnedValue(Money revenueEarnedValue) {
        this.revenueEarnedValue = revenueEarnedValue;
    }
    public void setCharged(
            org.mule.modules.clarizen.api.model.flat.ChargedTypeFlat charged) {
        this.charged = charged;
    }
    public void setRPI(Double rPI) {
        RPI = rPI;
    }
    public void setRETC(Double rETC) {
        RETC = rETC;
    }
    public void setREAC(Double rEAC) {
        REAC = rEAC;
    }
    public void setRTCPI(Double rTCPI) {
        RTCPI = rTCPI;
    }
    public void setCompletnessDefinition(Long completnessDefinition) {
        this.completnessDefinition = completnessDefinition;
    }
    public void setTaskReportingPolicy(
            org.mule.modules.clarizen.api.model.flat.TaskReportingPolicyFlat taskReportingPolicy) {
        this.taskReportingPolicy = taskReportingPolicy;
    }
    public void setTaskReportingPolicyManuallySet(
            Boolean taskReportingPolicyManuallySet) {
        this.taskReportingPolicyManuallySet = taskReportingPolicyManuallySet;
    }
    public void setIndividualReporting(Boolean individualReporting) {
        this.individualReporting = individualReporting;
    }
    public void setBaselineCreationDate(Date baselineCreationDate) {
        this.baselineCreationDate = baselineCreationDate;
    }
    public void setAggregatedStopwatchesCount(Integer aggregatedStopwatchesCount) {
        this.aggregatedStopwatchesCount = aggregatedStopwatchesCount;
    }
    public void setActiveStopwatch(
            org.mule.modules.clarizen.api.model.flat.StopwatchAggregateStateFlat activeStopwatch) {
        this.activeStopwatch = activeStopwatch;
    }
    public void setObjectAlias(String objectAlias) {
        this.objectAlias = objectAlias;
    }
    public void setStopwatchesCount(Integer stopwatchesCount) {
        this.stopwatchesCount = stopwatchesCount;
    }
    public void setPendingTimeTrackingEffort(Duration pendingTimeTrackingEffort) {
        this.pendingTimeTrackingEffort = pendingTimeTrackingEffort;
    }


}
