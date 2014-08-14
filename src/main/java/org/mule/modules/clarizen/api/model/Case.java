/**
 * Mule Clarizen Cloud Connector
 *
 * (c) 2003-2014 MuleSoft, Inc. The software in this package is published under
 * the terms of the CPAL v1.0 license, a copy of which has been included with this
 * distribution in the LICENSE.md file.
 */

package org.mule.modules.clarizen.api.model;

import java.util.Date;

import com.clarizen.api.Duration;
import com.clarizen.api.EntityId;

public class Case extends ClarizenEntity {
    
        private String SYSID;
        private Double percentCompleted;
        private Integer attachmentsCount;
        private Integer postsCount;
        private Integer notesCount;
        private String title;
        private org.mule.modules.clarizen.api.model.flat.SeverityFlat severity;
        private Integer priority;
        private Boolean mandatory;
        private org.mule.modules.clarizen.api.model.flat.UserFlat owner;
        private Date dueDate;
        private org.mule.modules.clarizen.api.model.flat.UserFlat sssignedTo;
        private Date assignmentDate;
        private org.mule.modules.clarizen.api.model.flat.UserFlat submittedBy;
        private Date submissionDate;
        private org.mule.modules.clarizen.api.model.flat.UserFlat evaluatedBy;
        private Date evaluationDate;
        private org.mule.modules.clarizen.api.model.flat.UserFlat openedBy;
        private Date openingDate;
        private org.mule.modules.clarizen.api.model.flat.UserFlat resolvedBy;
        private Date resolvedDate;
        private String resolutionDetails;
        private org.mule.modules.clarizen.api.model.flat.UserFlat closedBy;
        private Date closureDate;
        private org.mule.modules.clarizen.api.model.flat.UserFlat rejectedBy;
        private Date rejectionDate;
        private String rejectDetails;
        private org.mule.modules.clarizen.api.model.flat.UserFlat reopenedBy;
        private Date reopeningDate;
        private String reopenReasons;
        private org.mule.modules.clarizen.api.model.flat.UserFlat deferredBy;
        private Date deferringDate;
        private String comment;
        private org.mule.modules.clarizen.api.model.flat.ProjectFlat plannedFor;
        private Boolean reportedbyCustomer;
        private String category;
        private String duplicateTo;
        private String description;
        private String plainText;
        private Date lastUpdatedBySystemOn;
        private String deferReasons;
        private Duration work;
        private Duration actualEffort;
        private Duration remainingEffort;
        private Boolean workManuallySet;
        private Boolean remainingEffortManuallySet;
        private Duration workVariance;
        private Integer emailsCount;
        private String justification;
        private String businessAlignment;
        private String plannedSavings;
        private String expectedBusinessValue;
        private Boolean goalsAchieved;
        private Double expectedROI;
        private org.mule.modules.clarizen.api.model.flat.CaseBusinessImpactFlat businessImpact;
        private Double score;
        private org.mule.modules.clarizen.api.model.flat.WorkItemFlat originatedFrom;
        private String objectAlias;
        private org.mule.modules.clarizen.api.model.flat.CaseStateFlat state;
        private EntityId reportedBy;
        private String reportedByMail;

        public String getSYSID() {
            return SYSID;
        }
        public Double getPercentCompleted() {
            return percentCompleted;
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
        public String getTitle() {
            return title;
        }
        public org.mule.modules.clarizen.api.model.flat.SeverityFlat getSeverity() {
            return severity;
        }
        public Integer getPriority() {
            return priority;
        }
        public Boolean getMandatory() {
            return mandatory;
        }
        public org.mule.modules.clarizen.api.model.flat.UserFlat getOwner() {
            return owner;
        }
        public Date getDueDate() {
            return dueDate;
        }
        public org.mule.modules.clarizen.api.model.flat.UserFlat getSssignedTo() {
            return sssignedTo;
        }
        public Date getAssignmentDate() {
            return assignmentDate;
        }
        public org.mule.modules.clarizen.api.model.flat.UserFlat getSubmittedBy() {
            return submittedBy;
        }
        public Date getSubmissionDate() {
            return submissionDate;
        }
        public org.mule.modules.clarizen.api.model.flat.UserFlat getEvaluatedBy() {
            return evaluatedBy;
        }
        public Date getEvaluationDate() {
            return evaluationDate;
        }
        public org.mule.modules.clarizen.api.model.flat.UserFlat getOpenedBy() {
            return openedBy;
        }
        public Date getOpeningDate() {
            return openingDate;
        }
        public org.mule.modules.clarizen.api.model.flat.UserFlat getResolvedBy() {
            return resolvedBy;
        }
        public Date getResolvedDate() {
            return resolvedDate;
        }
        public String getResolutionDetails() {
            return resolutionDetails;
        }
        public org.mule.modules.clarizen.api.model.flat.UserFlat getClosedBy() {
            return closedBy;
        }
        public Date getClosureDate() {
            return closureDate;
        }
        public org.mule.modules.clarizen.api.model.flat.UserFlat getRejectedBy() {
            return rejectedBy;
        }
        public Date getRejectionDate() {
            return rejectionDate;
        }
        public String getRejectDetails() {
            return rejectDetails;
        }
        public org.mule.modules.clarizen.api.model.flat.UserFlat getReopenedBy() {
            return reopenedBy;
        }
        public Date getReopeningDate() {
            return reopeningDate;
        }
        public String getReopenReasons() {
            return reopenReasons;
        }
        public org.mule.modules.clarizen.api.model.flat.UserFlat getDeferredBy() {
            return deferredBy;
        }
        public Date getDeferringDate() {
            return deferringDate;
        }
        public String getComment() {
            return comment;
        }
        public org.mule.modules.clarizen.api.model.flat.ProjectFlat getPlannedFor() {
            return plannedFor;
        }
        public Boolean getReportedbyCustomer() {
            return reportedbyCustomer;
        }
        public String getCategory() {
            return category;
        }
        public String getDuplicateTo() {
            return duplicateTo;
        }
        public String getDescription() {
            return description;
        }
        public String getPlainText() {
            return plainText;
        }
        public Date getLastUpdatedBySystemOn() {
            return lastUpdatedBySystemOn;
        }
        public String getDeferReasons() {
            return deferReasons;
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
        public Integer getEmailsCount() {
            return emailsCount;
        }
        public String getJustification() {
            return justification;
        }
        public String getBusinessAlignment() {
            return businessAlignment;
        }
        public String getPlannedSavings() {
            return plannedSavings;
        }
        public String getExpectedBusinessValue() {
            return expectedBusinessValue;
        }
        public Boolean getGoalsAchieved() {
            return goalsAchieved;
        }
        public Double getExpectedROI() {
            return expectedROI;
        }
        public org.mule.modules.clarizen.api.model.flat.CaseBusinessImpactFlat getBusinessImpact() {
            return businessImpact;
        }
        public Double getScore() {
            return score;
        }
        public org.mule.modules.clarizen.api.model.flat.WorkItemFlat getOriginatedFrom() {
            return originatedFrom;
        }
        public String getObjectAlias() {
            return objectAlias;
        }
        public org.mule.modules.clarizen.api.model.flat.CaseStateFlat getState() {
            return state;
        }
        public EntityId getReportedBy() {
            return reportedBy;
        }
        public String getReportedByMail() {
            return reportedByMail;
        }
        public void setSYSID(String sYSID) {
            SYSID = sYSID;
        }
        public void setPercentCompleted(Double percentCompleted) {
            this.percentCompleted = percentCompleted;
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
        public void setTitle(String title) {
            this.title = title;
        }
        public void setSeverity(
                org.mule.modules.clarizen.api.model.flat.SeverityFlat severity) {
            this.severity = severity;
        }
        public void setPriority(Integer priority) {
            this.priority = priority;
        }
        public void setMandatory(Boolean mandatory) {
            this.mandatory = mandatory;
        }
        public void setOwner(org.mule.modules.clarizen.api.model.flat.UserFlat owner) {
            this.owner = owner;
        }
        public void setDueDate(Date dueDate) {
            this.dueDate = dueDate;
        }
        public void setSssignedTo(
                org.mule.modules.clarizen.api.model.flat.UserFlat sssignedTo) {
            this.sssignedTo = sssignedTo;
        }
        public void setAssignmentDate(Date assignmentDate) {
            this.assignmentDate = assignmentDate;
        }
        public void setSubmittedBy(
                org.mule.modules.clarizen.api.model.flat.UserFlat submittedBy) {
            this.submittedBy = submittedBy;
        }
        public void setSubmissionDate(Date submissionDate) {
            this.submissionDate = submissionDate;
        }
        public void setEvaluatedBy(
                org.mule.modules.clarizen.api.model.flat.UserFlat evaluatedBy) {
            this.evaluatedBy = evaluatedBy;
        }
        public void setEvaluationDate(Date evaluationDate) {
            this.evaluationDate = evaluationDate;
        }
        public void setOpenedBy(org.mule.modules.clarizen.api.model.flat.UserFlat openedBy) {
            this.openedBy = openedBy;
        }
        public void setOpeningDate(Date openingDate) {
            this.openingDate = openingDate;
        }
        public void setResolvedBy(
                org.mule.modules.clarizen.api.model.flat.UserFlat resolvedBy) {
            this.resolvedBy = resolvedBy;
        }
        public void setResolvedDate(Date resolvedDate) {
            this.resolvedDate = resolvedDate;
        }
        public void setResolutionDetails(String resolutionDetails) {
            this.resolutionDetails = resolutionDetails;
        }
        public void setClosedBy(org.mule.modules.clarizen.api.model.flat.UserFlat closedBy) {
            this.closedBy = closedBy;
        }
        public void setClosureDate(Date closureDate) {
            this.closureDate = closureDate;
        }
        public void setRejectedBy(
                org.mule.modules.clarizen.api.model.flat.UserFlat rejectedBy) {
            this.rejectedBy = rejectedBy;
        }
        public void setRejectionDate(Date rejectionDate) {
            this.rejectionDate = rejectionDate;
        }
        public void setRejectDetails(String rejectDetails) {
            this.rejectDetails = rejectDetails;
        }
        public void setReopenedBy(
                org.mule.modules.clarizen.api.model.flat.UserFlat reopenedBy) {
            this.reopenedBy = reopenedBy;
        }
        public void setReopeningDate(Date reopeningDate) {
            this.reopeningDate = reopeningDate;
        }
        public void setReopenReasons(String reopenReasons) {
            this.reopenReasons = reopenReasons;
        }
        public void setDeferredBy(
                org.mule.modules.clarizen.api.model.flat.UserFlat deferredBy) {
            this.deferredBy = deferredBy;
        }
        public void setDeferringDate(Date deferringDate) {
            this.deferringDate = deferringDate;
        }
        public void setComment(String comment) {
            this.comment = comment;
        }
        public void setPlannedFor(
                org.mule.modules.clarizen.api.model.flat.ProjectFlat plannedFor) {
            this.plannedFor = plannedFor;
        }
        public void setReportedbyCustomer(Boolean reportedbyCustomer) {
            this.reportedbyCustomer = reportedbyCustomer;
        }
        public void setCategory(String category) {
            this.category = category;
        }
        public void setDuplicateTo(String duplicateTo) {
            this.duplicateTo = duplicateTo;
        }
        public void setDescription(String description) {
            this.description = description;
        }
        public void setPlainText(String plainText) {
            this.plainText = plainText;
        }
        public void setLastUpdatedBySystemOn(Date lastUpdatedBySystemOn) {
            this.lastUpdatedBySystemOn = lastUpdatedBySystemOn;
        }
        public void setDeferReasons(String deferReasons) {
            this.deferReasons = deferReasons;
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
        public void setEmailsCount(Integer emailsCount) {
            this.emailsCount = emailsCount;
        }
        public void setJustification(String justification) {
            this.justification = justification;
        }
        public void setBusinessAlignment(String businessAlignment) {
            this.businessAlignment = businessAlignment;
        }
        public void setPlannedSavings(String plannedSavings) {
            this.plannedSavings = plannedSavings;
        }
        public void setExpectedBusinessValue(String expectedBusinessValue) {
            this.expectedBusinessValue = expectedBusinessValue;
        }
        public void setGoalsAchieved(Boolean goalsAchieved) {
            this.goalsAchieved = goalsAchieved;
        }
        public void setExpectedROI(Double expectedROI) {
            this.expectedROI = expectedROI;
        }
        public void setBusinessImpact(
                org.mule.modules.clarizen.api.model.flat.CaseBusinessImpactFlat businessImpact) {
            this.businessImpact = businessImpact;
        }
        public void setScore(Double score) {
            this.score = score;
        }
        public void setOriginatedFrom(
                org.mule.modules.clarizen.api.model.flat.WorkItemFlat originatedFrom) {
            this.originatedFrom = originatedFrom;
        }
        public void setObjectAlias(String objectAlias) {
            this.objectAlias = objectAlias;
        }
        public void setState(org.mule.modules.clarizen.api.model.flat.CaseStateFlat state) {
            this.state = state;
        }
        public void setReportedBy(EntityId reportedBy) {
            this.reportedBy = reportedBy;
        }
        public void setReportedByMail(String reportedByMail) {
            this.reportedByMail = reportedByMail;
        }
       
}
