/**
 * Mule Clarizen Cloud Connector
 *
 * (c) 2003-2014 MuleSoft, Inc. The software in this package is published under
 * the terms of the CPAL v1.0 license, a copy of which has been included with this
 * distribution in the LICENSE.md file.
 */

package org.mule.modules.clarizen.api.model.flat;

import com.clarizen.api.EntityId;

public class OrganizationFlat extends ClarizenEntityCustomFieldsFlat {
    
        private String description;
        private EntityId state;
        private EntityId country;
        private EntityId timeZone;
        private EntityId countryState;
        private EntityId defaultCurrency;
        private EntityId language;
        private String domain;
        private EntityId supportUser;
        private Long updateRequestsCounter;

        public String getDescription() {
            return description;
        }
        public EntityId getState() {
            return state;
        }
        public EntityId getCountry() {
            return country;
        }
        public EntityId getTimeZone() {
            return timeZone;
        }
        public EntityId getCountryState() {
            return countryState;
        }
        public EntityId getDefaultCurrency() {
            return defaultCurrency;
        }
        public EntityId getLanguage() {
            return language;
        }
        public String getDomain() {
            return domain;
        }
        public EntityId getSupportUser() {
            return supportUser;
        }
        public Long getUpdateRequestsCounter() {
            return updateRequestsCounter;
        }
        public void setDescription(String description) {
            this.description = description;
        }
        public void setState(EntityId state) {
            this.state = state;
        }
        public void setCountry(EntityId country) {
            this.country = country;
        }
        public void setTimeZone(EntityId timeZone) {
            this.timeZone = timeZone;
        }
        public void setCountryState(EntityId countryState) {
            this.countryState = countryState;
        }
        public void setDefaultCurrency(EntityId defaultCurrency) {
            this.defaultCurrency = defaultCurrency;
        }
        public void setLanguage(EntityId language) {
            this.language = language;
        }
        public void setDomain(String domain) {
            this.domain = domain;
        }
        public void setSupportUser(EntityId supportUser) {
            this.supportUser = supportUser;
        }
        public void setUpdateRequestsCounter(Long updateRequestsCounter) {
            this.updateRequestsCounter = updateRequestsCounter;
        }
}
