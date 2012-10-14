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
    
        private org.mule.modules.clarizen.api.model.flat.StateFlat state;
        private org.mule.modules.clarizen.api.model.flat.UserFlat approvedBy;
        private Date approvalDate;
        private org.mule.modules.clarizen.api.model.flat.UserFlat reportedBy;
        private Date reportedDate;
        private Duration duration;
        private Boolean regularHours;
        private String comment;
        private Money billingRate;
        private Money cost;
        private org.mule.modules.clarizen.api.model.flat.WorkItemFlat workItem;
        private Money costRate;
        private Money price;
        private Boolean charged;
        private org.mule.modules.clarizen.api.model.flat.CreatorTypeFlat creatorType;
        private org.mule.modules.clarizen.api.model.flat.RegularResourceLinkFlat humanResource;

        public org.mule.modules.clarizen.api.model.flat.StateFlat getState() {
            return state;
        }
        public org.mule.modules.clarizen.api.model.flat.UserFlat getApprovedBy() {
            return approvedBy;
        }
        public Date getApprovalDate() {
            return approvalDate;
        }
        public org.mule.modules.clarizen.api.model.flat.UserFlat getReportedBy() {
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
        public org.mule.modules.clarizen.api.model.flat.WorkItemFlat getWorkItem() {
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
        public org.mule.modules.clarizen.api.model.flat.CreatorTypeFlat getCreatorType() {
            return creatorType;
        }
        public org.mule.modules.clarizen.api.model.flat.RegularResourceLinkFlat getHumanResource() {
            return humanResource;
        }
        public void setState(org.mule.modules.clarizen.api.model.flat.StateFlat state) {
            this.state = state;
        }
        public void setApprovedBy(
                org.mule.modules.clarizen.api.model.flat.UserFlat approvedBy) {
            this.approvedBy = approvedBy;
        }
        public void setApprovalDate(Date approvalDate) {
            this.approvalDate = approvalDate;
        }
        public void setReportedBy(
                org.mule.modules.clarizen.api.model.flat.UserFlat reportedBy) {
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
        public void setWorkItem(
                org.mule.modules.clarizen.api.model.flat.WorkItemFlat workItem) {
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
        public void setCreatorType(
                org.mule.modules.clarizen.api.model.flat.CreatorTypeFlat creatorType) {
            this.creatorType = creatorType;
        }
        public void setHumanResource(
                org.mule.modules.clarizen.api.model.flat.RegularResourceLinkFlat humanResource) {
            this.humanResource = humanResource;
        }
}
