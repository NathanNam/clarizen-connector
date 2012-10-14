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

import com.clarizen.api.Money;

public class ExpenseSheet extends ClarizenEntity {
    
        private String description;
        private String SYSID;
        private org.mule.modules.clarizen.api.model.flat.UserFlat owner;
        private org.mule.modules.clarizen.api.model.flat.UserFlat approvedBy;
        private Date approvalDate;
        private org.mule.modules.clarizen.api.model.flat.ProjectFlat project;
        private Integer postsCount;
        private Date date;
        private Money total;
        private Money reimbursedTotal;
        private Money billableTotal;
        private Date submittedOn;
        private org.mule.modules.clarizen.api.model.flat.UserFlat approver;
        private org.mule.modules.clarizen.api.model.flat.StateFlat state;

        public String getDescription() {
            return description;
        }
        public String getSYSID() {
            return SYSID;
        }
        public org.mule.modules.clarizen.api.model.flat.UserFlat getOwner() {
            return owner;
        }
        public org.mule.modules.clarizen.api.model.flat.UserFlat getApprovedBy() {
            return approvedBy;
        }
        public Date getApprovalDate() {
            return approvalDate;
        }
        public org.mule.modules.clarizen.api.model.flat.ProjectFlat getProject() {
            return project;
        }
        public Integer getPostsCount() {
            return postsCount;
        }
        public Date getDate() {
            return date;
        }
        public Money getTotal() {
            return total;
        }
        public Money getReimbursedTotal() {
            return reimbursedTotal;
        }
        public Money getBillableTotal() {
            return billableTotal;
        }
        public Date getSubmittedOn() {
            return submittedOn;
        }
        public org.mule.modules.clarizen.api.model.flat.UserFlat getApprover() {
            return approver;
        }
        public org.mule.modules.clarizen.api.model.flat.StateFlat getState() {
            return state;
        }
        public void setDescription(String description) {
            this.description = description;
        }
        public void setSYSID(String sYSID) {
            SYSID = sYSID;
        }
        public void setOwner(org.mule.modules.clarizen.api.model.flat.UserFlat owner) {
            this.owner = owner;
        }
        public void setApprovedBy(
                org.mule.modules.clarizen.api.model.flat.UserFlat approvedBy) {
            this.approvedBy = approvedBy;
        }
        public void setApprovalDate(Date approvalDate) {
            this.approvalDate = approvalDate;
        }
        public void setProject(org.mule.modules.clarizen.api.model.flat.ProjectFlat project) {
            this.project = project;
        }
        public void setPostsCount(Integer postsCount) {
            this.postsCount = postsCount;
        }
        public void setDate(Date date) {
            this.date = date;
        }
        public void setTotal(Money total) {
            this.total = total;
        }
        public void setReimbursedTotal(Money reimbursedTotal) {
            this.reimbursedTotal = reimbursedTotal;
        }
        public void setBillableTotal(Money billableTotal) {
            this.billableTotal = billableTotal;
        }
        public void setSubmittedOn(Date submittedOn) {
            this.submittedOn = submittedOn;
        }
        public void setApprover(org.mule.modules.clarizen.api.model.flat.UserFlat approver) {
            this.approver = approver;
        }
        public void setState(org.mule.modules.clarizen.api.model.flat.StateFlat state) {
            this.state = state;
        }
}
