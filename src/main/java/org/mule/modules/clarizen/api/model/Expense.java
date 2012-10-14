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

public class Expense extends ClarizenEntity {

        private String description;
        private org.mule.modules.clarizen.api.model.flat.WorkItemFlat workItem;
        private Integer attachmentsCount;
        private org.mule.modules.clarizen.api.model.flat.ExpenseCategoryFlat category;
        private Date dateIncurred;
        private Date dateInvoiced;
        private Money localAmount;
        private Money billingAmount;
        private Double exchangeRate;
        private Boolean billable;
        private Boolean receipt;
        private Boolean reimburse;
        private String comment;
        private org.mule.modules.clarizen.api.model.flat.ExpenseSheetFlat expenseSheet;
        private Money amount;
        private Boolean charged;

        public String getDescription() {
            return description;
        }
        public org.mule.modules.clarizen.api.model.flat.WorkItemFlat getWorkItem() {
            return workItem;
        }
        public Integer getAttachmentsCount() {
            return attachmentsCount;
        }
        public org.mule.modules.clarizen.api.model.flat.ExpenseCategoryFlat getCategory() {
            return category;
        }
        public Date getDateIncurred() {
            return dateIncurred;
        }
        public Date getDateInvoiced() {
            return dateInvoiced;
        }
        public Money getLocalAmount() {
            return localAmount;
        }
        public Money getBillingAmount() {
            return billingAmount;
        }
        public Double getExchangeRate() {
            return exchangeRate;
        }
        public Boolean getBillable() {
            return billable;
        }
        public Boolean getReceipt() {
            return receipt;
        }
        public Boolean getReimburse() {
            return reimburse;
        }
        public String getComment() {
            return comment;
        }
        public org.mule.modules.clarizen.api.model.flat.ExpenseSheetFlat getExpenseSheet() {
            return expenseSheet;
        }
        public Money getAmount() {
            return amount;
        }
        public Boolean getCharged() {
            return charged;
        }
        public void setDescription(String description) {
            this.description = description;
        }
        public void setWorkItem(
                org.mule.modules.clarizen.api.model.flat.WorkItemFlat workItem) {
            this.workItem = workItem;
        }
        public void setAttachmentsCount(Integer attachmentsCount) {
            this.attachmentsCount = attachmentsCount;
        }
        public void setCategory(
                org.mule.modules.clarizen.api.model.flat.ExpenseCategoryFlat category) {
            this.category = category;
        }
        public void setDateIncurred(Date dateIncurred) {
            this.dateIncurred = dateIncurred;
        }
        public void setDateInvoiced(Date dateInvoiced) {
            this.dateInvoiced = dateInvoiced;
        }
        public void setLocalAmount(Money localAmount) {
            this.localAmount = localAmount;
        }
        public void setBillingAmount(Money billingAmount) {
            this.billingAmount = billingAmount;
        }
        public void setExchangeRate(Double exchangeRate) {
            this.exchangeRate = exchangeRate;
        }
        public void setBillable(Boolean billable) {
            this.billable = billable;
        }
        public void setReceipt(Boolean receipt) {
            this.receipt = receipt;
        }
        public void setReimburse(Boolean reimburse) {
            this.reimburse = reimburse;
        }
        public void setComment(String comment) {
            this.comment = comment;
        }
        public void setExpenseSheet(
                org.mule.modules.clarizen.api.model.flat.ExpenseSheetFlat expenseSheet) {
            this.expenseSheet = expenseSheet;
        }
        public void setAmount(Money amount) {
            this.amount = amount;
        }
        public void setCharged(Boolean charged) {
            this.charged = charged;
        }
}
