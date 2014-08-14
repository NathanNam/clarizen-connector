/**
 * Mule Clarizen Cloud Connector
 *
 * (c) 2003-2014 MuleSoft, Inc. The software in this package is published under
 * the terms of the CPAL v1.0 license, a copy of which has been included with this
 * distribution in the LICENSE.md file.
 */

package org.mule.modules.clarizen.api.model.flat;

import java.util.Date;

import com.clarizen.api.EntityId;
import com.clarizen.api.Money;

public class ExpenseFlat extends ClarizenEntityCustomFieldsFlat {

        private String description;
        private EntityId workItem;
        private Integer attachmentsCount;
        private EntityId category;
        private Date dateIncurred;
        private Date dateInvoiced;
        private Money localAmount;
        private Money billingAmount;
        private Double exchangeRate;
        private Boolean billable;
        private Boolean receipt;
        private Boolean reimburse;
        private String comment;
        private EntityId expenseSheet;
        private Money amount;
        private Boolean charged;

        public String getDescription() {
            return description;
        }
        public EntityId getWorkItem() {
            return workItem;
        }
        public Integer getAttachmentsCount() {
            return attachmentsCount;
        }
        public EntityId getCategory() {
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
        public EntityId getExpenseSheet() {
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
        public void setWorkItem(EntityId workItem) {
            this.workItem = workItem;
        }
        public void setAttachmentsCount(Integer attachmentsCount) {
            this.attachmentsCount = attachmentsCount;
        }
        public void setCategory(EntityId category) {
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
        public void setExpenseSheet(EntityId expenseSheet) {
            this.expenseSheet = expenseSheet;
        }
        public void setAmount(Money amount) {
            this.amount = amount;
        }
        public void setCharged(Boolean charged) {
            this.charged = charged;
        }
}
