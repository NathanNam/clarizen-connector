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

public class Organization extends ClarizenEntity {
    
        private String description;
        private State state;
        private Countries country;
        private TimeZone timeZone;
        private CountryState countryState;
        private CurrencyType defaultCurrency;
        private Language language;
        private String domain;
        private User supportUser;
        private Long updateRequestsCounter;

        public String getDescription() {
            return description;
        }
        public State getState() {
            return state;
        }
        public Countries getCountry() {
            return country;
        }
        public TimeZone getTimeZone() {
            return timeZone;
        }
        public CountryState getCountryState() {
            return countryState;
        }
        public CurrencyType getDefaultCurrency() {
            return defaultCurrency;
        }
        public Language getLanguage() {
            return language;
        }
        public String getDomain() {
            return domain;
        }
        public User getSupportUser() {
            return supportUser;
        }
        public Long getUpdateRequestsCounter() {
            return updateRequestsCounter;
        }
        public void setDescription(String description) {
            this.description = description;
        }
        public void setState(State state) {
            this.state = state;
        }
        public void setCountry(Countries country) {
            this.country = country;
        }
        public void setTimeZone(TimeZone timeZone) {
            this.timeZone = timeZone;
        }
        public void setCountryState(CountryState countryState) {
            this.countryState = countryState;
        }
        public void setDefaultCurrency(CurrencyType defaultCurrency) {
            this.defaultCurrency = defaultCurrency;
        }
        public void setLanguage(Language language) {
            this.language = language;
        }
        public void setDomain(String domain) {
            this.domain = domain;
        }
        public void setSupportUser(User supportUser) {
            this.supportUser = supportUser;
        }
        public void setUpdateRequestsCounter(Long updateRequestsCounter) {
            this.updateRequestsCounter = updateRequestsCounter;
        }
}
