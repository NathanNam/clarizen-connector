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

public class CaseCustomerLinkFlat extends ClarizenEntityCustomFieldsFlat {
    
        private EntityId entity;
        private EntityId customer;
        private Boolean submitted;
        private Boolean committed;
        private Date committedDate;

        public EntityId getEntity() {
            return entity;
        }
        public EntityId getCustomer() {
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
        public void setEntity(EntityId entity) {
            this.entity = entity;
        }
        public void setCustomer(EntityId customer) {
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
