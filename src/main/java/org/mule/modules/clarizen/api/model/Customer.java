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

public class Customer extends ClarizenEntity {
    
        private String description;
        private State state;
        private String businessAddress;
        private String billingAddress;
        private String SYSID;
        private String internalId;
        private String sfExternalId;
        private String sfExternalName;

        public String getDescription() {
            return description;
        }
        public State getState() {
            return state;
        }
        public String getBusinessAddress() {
            return businessAddress;
        }
        public String getBillingAddress() {
            return billingAddress;
        }
        public String getSYSID() {
            return SYSID;
        }
        public String getInternalId() {
            return internalId;
        }
        public String getSfExternalId() {
            return sfExternalId;
        }
        public String getSfExternalName() {
            return sfExternalName;
        }
        public void setDescription(String description) {
            this.description = description;
        }
        public void setState(State state) {
            this.state = state;
        }
        public void setBusinessAddress(String businessAddress) {
            this.businessAddress = businessAddress;
        }
        public void setBillingAddress(String billingAddress) {
            this.billingAddress = billingAddress;
        }
        public void setSYSID(String sYSID) {
            SYSID = sYSID;
        }
        public void setInternalId(String internalId) {
            this.internalId = internalId;
        }
        public void setSfExternalId(String sfExternalId) {
            this.sfExternalId = sfExternalId;
        }
        public void setSfExternalName(String sfExternalName) {
            this.sfExternalName = sfExternalName;
        }

}
