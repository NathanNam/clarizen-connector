/**
 * Mule Clarizen Cloud Connector
 *
 * (c) 2003-2014 MuleSoft, Inc. The software in this package is published under
 * the terms of the CPAL v1.0 license, a copy of which has been included with this
 * distribution in the LICENSE.md file.
 */

package org.mule.modules.clarizen.api.model;

import java.util.Date;

public class CaseCustomerLink extends ClarizenEntity {
    
        private org.mule.modules.clarizen.api.model.flat.CaseFlat entity;
        private org.mule.modules.clarizen.api.model.flat.CustomerFlat customer;
        private Boolean submitted;
        private Boolean committed;
        private Date committedDate;

        public org.mule.modules.clarizen.api.model.flat.CaseFlat getEntity() {
            return entity;
        }
        public org.mule.modules.clarizen.api.model.flat.CustomerFlat getCustomer() {
            return customer;
        }
        public Boolean getSubmitted() {
            return submitted;
        }
        public Boolean getCommitted() {
            return committed;
        }
        public Date getCommittedDate() {
            return committedDate;
        }
        public void setEntity(org.mule.modules.clarizen.api.model.flat.CaseFlat entity) {
            this.entity = entity;
        }
        public void setCustomer(
                org.mule.modules.clarizen.api.model.flat.CustomerFlat customer) {
            this.customer = customer;
        }
        public void setSubmitted(Boolean submitted) {
            this.submitted = submitted;
        }
        public void setCommitted(Boolean committed) {
            this.committed = committed;
        }
        public void setCommittedDate(Date committedDate) {
            this.committedDate = committedDate;
        }
}
