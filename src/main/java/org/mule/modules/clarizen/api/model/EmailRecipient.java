/**
 * Mule Clarizen Cloud Connector
 *
 * (c) 2003-2014 MuleSoft, Inc. The software in this package is published under
 * the terms of the CPAL v1.0 license, a copy of which has been included with this
 * distribution in the LICENSE.md file.
 */

package org.mule.modules.clarizen.api.model;

import com.clarizen.api.EntityId;

public class EmailRecipient extends ClarizenEntity {
    
        private EntityId recipient;
        private String emailAddress;
        private org.mule.modules.clarizen.api.model.flat.RecipientTypeFlat recipientType;
        private org.mule.modules.clarizen.api.model.flat.EmailFlat email;

        public EntityId getRecipient() {
            return recipient;
        }
        public String getEmailAddress() {
            return emailAddress;
        }
        public org.mule.modules.clarizen.api.model.flat.RecipientTypeFlat getRecipientType() {
            return recipientType;
        }
        public org.mule.modules.clarizen.api.model.flat.EmailFlat getEmail() {
            return email;
        }
        public void setRecipient(EntityId recipient) {
            this.recipient = recipient;
        }
        public void setEmailAddress(String emailAddress) {
            this.emailAddress = emailAddress;
        }
        public void setRecipientType(
                org.mule.modules.clarizen.api.model.flat.RecipientTypeFlat recipientType) {
            this.recipientType = recipientType;
        }
        public void setEmail(org.mule.modules.clarizen.api.model.flat.EmailFlat email) {
            this.email = email;
        }
}
