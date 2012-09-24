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

import com.clarizen.api.EntityId;

public class EmailRecipient extends ClarizenEntity {
    
        private EntityId recipient;
        private String emailAddress;
        private RecipientType recipientType;
        private Email email;

        public EntityId getRecipient() {
            return recipient;
        }
        public String getEmailAddress() {
            return emailAddress;
        }
        public RecipientType getRecipientType() {
            return recipientType;
        }
        public Email getEmail() {
            return email;
        }
        public void setRecipient(EntityId recipient) {
            this.recipient = recipient;
        }
        public void setEmailAddress(String emailAddress) {
            this.emailAddress = emailAddress;
        }
        public void setRecipientType(RecipientType recipientType) {
            this.recipientType = recipientType;
        }
        public void setEmail(Email email) {
            this.email = email;
        }
}
