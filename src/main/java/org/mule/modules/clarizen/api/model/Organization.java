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
        private org.mule.modules.clarizen.api.model.flat.StateFlat state;
        private org.mule.modules.clarizen.api.model.flat.CountriesFlat country;
        private org.mule.modules.clarizen.api.model.flat.TimeZoneFlat timeZone;
        private org.mule.modules.clarizen.api.model.flat.CountryStateFlat countryState;
        private org.mule.modules.clarizen.api.model.flat.CurrencyTypeFlat defaultCurrency;
        private org.mule.modules.clarizen.api.model.flat.LanguageFlat language;
        private String domain;
        private org.mule.modules.clarizen.api.model.flat.UserFlat supportUser;
        private Long updateRequestsCounter;

        public String getDescription() {
            return description;
        }
        public org.mule.modules.clarizen.api.model.flat.StateFlat getState() {
            return state;
        }
        public org.mule.modules.clarizen.api.model.flat.CountriesFlat getCountry() {
            return country;
        }
        public org.mule.modules.clarizen.api.model.flat.TimeZoneFlat getTimeZone() {
            return timeZone;
        }
        public org.mule.modules.clarizen.api.model.flat.CountryStateFlat getCountryState() {
            return countryState;
        }
        public org.mule.modules.clarizen.api.model.flat.CurrencyTypeFlat getDefaultCurrency() {
            return defaultCurrency;
        }
        public org.mule.modules.clarizen.api.model.flat.LanguageFlat getLanguage() {
            return language;
        }
        public String getDomain() {
            return domain;
        }
        public org.mule.modules.clarizen.api.model.flat.UserFlat getSupportUser() {
            return supportUser;
        }
        public Long getUpdateRequestsCounter() {
            return updateRequestsCounter;
        }
        public void setDescription(String description) {
            this.description = description;
        }
        public void setState(org.mule.modules.clarizen.api.model.flat.StateFlat state) {
            this.state = state;
        }
        public void setCountry(
                org.mule.modules.clarizen.api.model.flat.CountriesFlat country) {
            this.country = country;
        }
        public void setTimeZone(
                org.mule.modules.clarizen.api.model.flat.TimeZoneFlat timeZone) {
            this.timeZone = timeZone;
        }
        public void setCountryState(
                org.mule.modules.clarizen.api.model.flat.CountryStateFlat countryState) {
            this.countryState = countryState;
        }
        public void setDefaultCurrency(
                org.mule.modules.clarizen.api.model.flat.CurrencyTypeFlat defaultCurrency) {
            this.defaultCurrency = defaultCurrency;
        }
        public void setLanguage(
                org.mule.modules.clarizen.api.model.flat.LanguageFlat language) {
            this.language = language;
        }
        public void setDomain(String domain) {
            this.domain = domain;
        }
        public void setSupportUser(
                org.mule.modules.clarizen.api.model.flat.UserFlat supportUser) {
            this.supportUser = supportUser;
        }
        public void setUpdateRequestsCounter(Long updateRequestsCounter) {
            this.updateRequestsCounter = updateRequestsCounter;
        }

}
