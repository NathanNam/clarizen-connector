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

import com.clarizen.api.EntityId;
import com.clarizen.api.Money;

public class ExpenseSheetFlat extends ClarizenEntityCustomFieldsFlat {
    
        private String description;
        private String SYSID;
        private EntityId owner;
        private EntityId approvedBy;
        private Date approvalDate;
        private EntityId project;
        private Integer postsCount;
        private Date date;
        private Money total;
        private Money reimbursedTotal;
        private Money billableTotal;
        private Date submittedOn;
        private EntityId approver;
        private EntityId state;

        public String getDescription() {
            return description;
        }
        public String getSYSID() {
            return SYSID;
        }
        public EntityId getOwner() {
            return owner;
        }
        public EntityId getApprovedBy() {
            return approvedBy;
        }
        public Date getApprovalDate() {
            return approvalDate;
        }
        public EntityId getProject() {
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
        public EntityId getApprover() {
            return approver;
        }
        public EntityId getState() {
            return state;
        }
        public void setDescription(String description) {
            this.description = description;
        }
        public void setSYSID(String sYSID) {
            SYSID = sYSID;
        }
        public void setOwner(EntityId owner) {
            this.owner = owner;
        }
        public void setApprovedBy(EntityId approvedBy) {
            this.approvedBy = approvedBy;
        }
        public void setApprovalDate(Date approvalDate) {
            this.approvalDate = approvalDate;
        }
        public void setProject(EntityId project) {
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
        public void setApprover(EntityId approver) {
            this.approver = approver;
        }
        public void setState(EntityId state) {
            this.state = state;
        }
}
