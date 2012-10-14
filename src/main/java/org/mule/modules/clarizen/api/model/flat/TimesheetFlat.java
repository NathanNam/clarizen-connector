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
import com.clarizen.api.Money;

public class TimesheetFlat extends ClarizenEntityCustomFieldsFlat {
    
        private EntityId state;
        private EntityId approvedBy;
        private Date approvalDate;
        private EntityId reportedBy;
        private Date reportedDate;
        private Duration duration;
        private Boolean regularHours;
        private String comment;
        private Money billingRate;
        private Money cost;
        private EntityId workItem;
        private Money costRate;
        private Money price;
        private Boolean charged;
        private EntityId creatorType;
        private EntityId humanResource;

        public EntityId getState() {
            return state;
        }
        public EntityId getApprovedBy() {
            return approvedBy;
        }
        public Date getApprovalDate() {
            return approvalDate;
        }
        public EntityId getReportedBy() {
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
        public EntityId getWorkItem() {
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
        public EntityId getCreatorType() {
            return creatorType;
        }
        public EntityId getHumanResource() {
            return humanResource;
        }
        public void setState(EntityId state) {
            this.state = state;
        }
        public void setApprovedBy(EntityId approvedBy) {
            this.approvedBy = approvedBy;
        }
        public void setApprovalDate(Date approvalDate) {
            this.approvalDate = approvalDate;
        }
        public void setReportedBy(EntityId reportedBy) {
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
        public void setWorkItem(EntityId workItem) {
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
        public void setCreatorType(EntityId creatorType) {
            this.creatorType = creatorType;
        }
        public void setHumanResource(EntityId humanResource) {
            this.humanResource = humanResource;
        }
}
