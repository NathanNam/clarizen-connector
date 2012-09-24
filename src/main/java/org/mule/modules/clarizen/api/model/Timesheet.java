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

public class Timesheet extends ClarizenEntity {
    
        private State state;
        private User approvedBy;
        private Date approvalDate;
        private User reportedBy;
        private Date reportedDate;
        private Duration duration;
        private Boolean regularHours;
        private String comment;
        private Money billingRate;
        private Money cost;
        private WorkItem workItem;
        private Money costRate;
        private Money price;
        private Boolean charged;
        private CreatorType creatorType;
        private RegularResourceLink humanResource;

        public State getState() {
            return state;
        }
        public User getApprovedBy() {
            return approvedBy;
        }
        public Date getApprovalDate() {
            return approvalDate;
        }
        public User getReportedBy() {
            return reportedBy;
        }
        public Date getReportedDate() {
            return reportedDate;
        }
        public Duration getDuration() {
            return duration;
        }
        public Boolean getRegularHours() {
            return regularHours;
        }
        public String getComment() {
            return comment;
        }
        public Money getBillingRate() {
            return billingRate;
        }
        public Money getCost() {
            return cost;
        }
        public WorkItem getWorkItem() {
            return workItem;
        }
        public Money getCostRate() {
            return costRate;
        }
        public Money getPrice() {
            return price;
        }
        public Boolean getCharged() {
            return charged;
        }
        public CreatorType getCreatorType() {
            return creatorType;
        }
        public RegularResourceLink getHumanResource() {
            return humanResource;
        }
        public void setState(State state) {
            this.state = state;
        }
        public void setApprovedBy(User approvedBy) {
            this.approvedBy = approvedBy;
        }
        public void setApprovalDate(Date approvalDate) {
            this.approvalDate = approvalDate;
        }
        public void setReportedBy(User reportedBy) {
            this.reportedBy = reportedBy;
        }
        public void setReportedDate(Date reportedDate) {
            this.reportedDate = reportedDate;
        }
        public void setDuration(Duration duration) {
            this.duration = duration;
        }
        public void setRegularHours(Boolean regularHours) {
            this.regularHours = regularHours;
        }
        public void setComment(String comment) {
            this.comment = comment;
        }
        public void setBillingRate(Money billingRate) {
            this.billingRate = billingRate;
        }
        public void setCost(Money cost) {
            this.cost = cost;
        }
        public void setWorkItem(WorkItem workItem) {
            this.workItem = workItem;
        }
        public void setCostRate(Money costRate) {
            this.costRate = costRate;
        }
        public void setPrice(Money price) {
            this.price = price;
        }
        public void setCharged(Boolean charged) {
            this.charged = charged;
        }
        public void setCreatorType(CreatorType creatorType) {
            this.creatorType = creatorType;
        }
        public void setHumanResource(RegularResourceLink humanResource) {
            this.humanResource = humanResource;
        }
}
