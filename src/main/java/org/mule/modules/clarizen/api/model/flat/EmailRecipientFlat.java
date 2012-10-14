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

import com.clarizen.api.EntityId;

public class EmailRecipientFlat extends ClarizenEntityCustomFieldsFlat {
    
        private EntityId recipient;
        private String emailAddress;
        private EntityId recipientType;
        private EntityId email;

        public EntityId getRecipient() {
            return recipient;
        }
        public String getEmailAddress() {
            return emailAddress;
        }
        public EntityId getRecipientType() {
            return recipientType;
        }
        public EntityId getEmail() {
            return email;
        }
        public void setRecipient(EntityId recipient) {
            this.recipient = recipient;
        }
        public void setEmailAddress(String emailAddress) {
            this.emailAddress = emailAddress;
        }
        public void setRecipientType(EntityId recipientType) {
            this.recipientType = recipientType;
        }
        public void setEmail(EntityId email) {
            this.email = email;
        }
}
