/**
 * Mule Clarizen Cloud Connector
 *
 * (c) 2003-2014 MuleSoft, Inc. The software in this package is published under
 * the terms of the CPAL v1.0 license, a copy of which has been included with this
 * distribution in the LICENSE.md file.
 */

package org.mule.modules.clarizen.api.model;

public class ContactPerson extends ClarizenEntity {
    
        private String description;
        private org.mule.modules.clarizen.api.model.flat.CustomerFlat customer;
        private String faxNumber;
        private Boolean mainContact;
        private String firstName;
        private String sfExternalId;
        private String lastName;
        private String sfExternalName;
        private String email;
        private String officePhone;
        private String mobilePhone;

        public String getDescription() {
            return description;
        }
        public org.mule.modules.clarizen.api.model.flat.CustomerFlat getCustomer() {
            return customer;
        }
        public String getFaxNumber() {
            return faxNumber;
        }
        public Boolean getMainContact() {
            return mainContact;
        }
        public String getFirstName() {
            return firstName;
        }
        public String getSfExternalId() {
            return sfExternalId;
        }
        public String getLastName() {
            return lastName;
        }
        public String getSfExternalName() {
            return sfExternalName;
        }
        public String getEmail() {
            return email;
        }
        public String getOfficePhone() {
            return officePhone;
        }
        public String getMobilePhone() {
            return mobilePhone;
        }
        public void setDescription(String description) {
            this.description = description;
        }
        public void setCustomer(
                org.mule.modules.clarizen.api.model.flat.CustomerFlat customer) {
            this.customer = customer;
        }
        public void setFaxNumber(String faxNumber) {
            this.faxNumber = faxNumber;
        }
        public void setMainContact(Boolean mainContact) {
            this.mainContact = mainContact;
        }
        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }
        public void setSfExternalId(String sfExternalId) {
            this.sfExternalId = sfExternalId;
        }
        public void setLastName(String lastName) {
            this.lastName = lastName;
        }
        public void setSfExternalName(String sfExternalName) {
            this.sfExternalName = sfExternalName;
        }
        public void setEmail(String email) {
            this.email = email;
        }
        public void setOfficePhone(String officePhone) {
            this.officePhone = officePhone;
        }
        public void setMobilePhone(String mobilePhone) {
            this.mobilePhone = mobilePhone;
        }
}
