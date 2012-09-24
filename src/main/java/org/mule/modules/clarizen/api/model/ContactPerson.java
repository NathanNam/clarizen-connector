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

public class ContactPerson extends ClarizenEntity {
    
        private String description;
        private Customer customer;
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
        public Customer getCustomer() {
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
        public void setCustomer(Customer customer) {
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
