/**
 * Mule Clarizen Cloud Connector
 *
 * (c) 2003-2014 MuleSoft, Inc. The software in this package is published under
 * the terms of the CPAL v1.0 license, a copy of which has been included with this
 * distribution in the LICENSE.md file.
 */

package org.mule.modules.clarizen.api.model.flat;

import com.clarizen.api.EntityId;

public class CustomerFlat extends ClarizenEntityCustomFieldsFlat {
    
        private String description;
        private EntityId state;
        private String businessAddress;
        private String billingAddress;
        private String SYSID;
        private String internalId;
        private String sfExternalId;
        private String sfExternalName;

        public String getDescription() {
            return description;
        }
        public EntityId getState() {
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
        public void setState(EntityId state) {
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
