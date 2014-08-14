/**
 * Mule Clarizen Cloud Connector
 *
 * (c) 2003-2014 MuleSoft, Inc. The software in this package is published under
 * the terms of the CPAL v1.0 license, a copy of which has been included with this
 * distribution in the LICENSE.md file.
 */

package org.mule.modules.clarizen.api.model.flat;

import java.util.Date;

import com.clarizen.api.Duration;
import com.clarizen.api.EntityId;

public class CaseFlat extends ClarizenEntityCustomFieldsFlat {
    
        private String SYSID;
        private Double percentCompleted;
        private Integer attachmentsCount;
        private Integer postsCount;
        private Integer notesCount;
        private String title;
        private SeverityFlat severity;
        private Integer priority;
        private Boolean mandatory;
        private EntityId owner;
        private Date dueDate;
        private EntityId sssignedTo;
        private Date assignmentDate;
        private EntityId submittedBy;
        private Date submissionDate;
        private EntityId evaluatedBy;
        private Date evaluationDate;
        private EntityId openedBy;
        private Date openingDate;
        private EntityId resolvedBy;
        private Date resolvedDate;
        private String resolutionDetails;
        private EntityId closedBy;
        private Date closureDate;
        private EntityId rejectedBy;
        private Date rejectionDate;
        private String rejectDetails;
        private EntityId reopenedBy;
        private Date reopeningDate;
        private String reopenReasons;
        private EntityId deferredBy;
        private Date deferringDate;
        private String comment;
        private EntityId plannedFor;
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
        private EntityId businessImpact;
        private Double score;
        private EntityId originatedFrom;
        private String objectAlias;
        private EntityId state;
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
        public SeverityFlat getSeverity() {
            return severity;
        }
        public Integer getPriority() {
            return priority;
        }
        public Boolean getMandatory() {
            return mandatory;
        }
        public EntityId getOwner() {
            return owner;
        }
        public Date getDueDate() {
            return dueDate;
        }
        public EntityId getSssignedTo() {
            return sssignedTo;
        }
        public Date getAssignmentDate() {
            return assignmentDate;
        }
        public EntityId getSubmittedBy() {
            return submittedBy;
        }
        public Date getSubmissionDate() {
            return submissionDate;
        }
        public EntityId getEvaluatedBy() {
            return evaluatedBy;
        }
        public Date getEvaluationDate() {
            return evaluationDate;
        }
        public EntityId getOpenedBy() {
            return openedBy;
        }
        public Date getOpeningDate() {
            return openingDate;
        }
        public EntityId getResolvedBy() {
            return resolvedBy;
        }
        public Date getResolvedDate() {
            return resolvedDate;
        }
        public String getResolutionDetails() {
            return resolutionDetails;
        }
        public EntityId getClosedBy() {
            return closedBy;
        }
        public Date getClosureDate() {
            return closureDate;
        }
        public EntityId getRejectedBy() {
            return rejectedBy;
        }
        public Date getRejectionDate() {
            return rejectionDate;
        }
        public String getRejectDetails() {
            return rejectDetails;
        }
        public EntityId getReopenedBy() {
            return reopenedBy;
        }
        public Date getReopeningDate() {
            return reopeningDate;
        }
        public String getReopenReasons() {
            return reopenReasons;
        }
        public EntityId getDeferredBy() {
            return deferredBy;
        }
        public Date getDeferringDate() {
            return deferringDate;
        }
        public String getComment() {
            return comment;
        }
        public EntityId getPlannedFor() {
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
        public EntityId getBusinessImpact() {
            return businessImpact;
        }
        public Double getScore() {
            return score;
        }
        public EntityId getOriginatedFrom() {
            return originatedFrom;
        }
        public String getObjectAlias() {
            return objectAlias;
        }
        public EntityId getState() {
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
        public void setSeverity(SeverityFlat severity) {
            this.severity = severity;
        }
        public void setPriority(Integer priority) {
            this.priority = priority;
        }
        public void setMandatory(Boolean mandatory) {
            this.mandatory = mandatory;
        }
        public void setOwner(EntityId owner) {
            this.owner = owner;
        }
        public void setDueDate(Date dueDate) {
            this.dueDate = dueDate;
        }
        public void setSssignedTo(EntityId sssignedTo) {
            this.sssignedTo = sssignedTo;
        }
        public void setAssignmentDate(Date assignmentDate) {
            this.assignmentDate = assignmentDate;
        }
        public void setSubmittedBy(EntityId submittedBy) {
            this.submittedBy = submittedBy;
        }
        public void setSubmissionDate(Date submissionDate) {
            this.submissionDate = submissionDate;
        }
        public void setEvaluatedBy(EntityId evaluatedBy) {
            this.evaluatedBy = evaluatedBy;
        }
        public void setEvaluationDate(Date evaluationDate) {
            this.evaluationDate = evaluationDate;
        }
        public void setOpenedBy(EntityId openedBy) {
            this.openedBy = openedBy;
        }
        public void setOpeningDate(Date openingDate) {
            this.openingDate = openingDate;
        }
        public void setResolvedBy(EntityId resolvedBy) {
            this.resolvedBy = resolvedBy;
        }
        public void setResolvedDate(Date resolvedDate) {
            this.resolvedDate = resolvedDate;
        }
        public void setResolutionDetails(String resolutionDetails) {
            this.resolutionDetails = resolutionDetails;
        }
        public void setClosedBy(EntityId closedBy) {
            this.closedBy = closedBy;
        }
        public void setClosureDate(Date closureDate) {
            this.closureDate = closureDate;
        }
        public void setRejectedBy(EntityId rejectedBy) {
            this.rejectedBy = rejectedBy;
        }
        public void setRejectionDate(Date rejectionDate) {
            this.rejectionDate = rejectionDate;
        }
        public void setRejectDetails(String rejectDetails) {
            this.rejectDetails = rejectDetails;
        }
        public void setReopenedBy(EntityId reopenedBy) {
            this.reopenedBy = reopenedBy;
        }
        public void setReopeningDate(Date reopeningDate) {
            this.reopeningDate = reopeningDate;
        }
        public void setReopenReasons(String reopenReasons) {
            this.reopenReasons = reopenReasons;
        }
        public void setDeferredBy(EntityId deferredBy) {
            this.deferredBy = deferredBy;
        }
        public void setDeferringDate(Date deferringDate) {
            this.deferringDate = deferringDate;
        }
        public void setComment(String comment) {
            this.comment = comment;
        }
        public void setPlannedFor(EntityId plannedFor) {
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
        public void setBusinessImpact(EntityId businessImpact) {
            this.businessImpact = businessImpact;
        }
        public void setScore(Double score) {
            this.score = score;
        }
        public void setOriginatedFrom(EntityId originatedFrom) {
            this.originatedFrom = originatedFrom;
        }
        public void setObjectAlias(String objectAlias) {
            this.objectAlias = objectAlias;
        }
        public void setState(EntityId state) {
            this.state = state;
        }
        public void setReportedBy(EntityId reportedBy) {
            this.reportedBy = reportedBy;
        }
        public void setReportedByMail(String reportedByMail) {
            this.reportedByMail = reportedByMail;
        }
}
