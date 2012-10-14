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

public class UserGroup extends ClarizenEntity {
    
        private String description;
        private Integer subGroupsCount;
        private Double availability;
        private Integer stopwatchesCount;
        private EntityId entityType;
        private Boolean organizationUnit;
        private org.mule.modules.clarizen.api.model.flat.UserFlat directManager;
        private org.mule.modules.clarizen.api.model.flat.TimeZoneFlat timeZone;
        private org.mule.modules.clarizen.api.model.flat.LanguageFlat language;

        public String getDescription() {
            return description;
        }
        public Integer getSubGroupsCount() {
            return subGroupsCount;
        }
        public Double getAvailability() {
            return availability;
        }
        public Integer getStopwatchesCount() {
            return stopwatchesCount;
        }
        public EntityId getEntityType() {
            return entityType;
        }
        public Boolean getOrganizationUnit() {
            return organizationUnit;
        }
        public org.mule.modules.clarizen.api.model.flat.UserFlat getDirectManager() {
            return directManager;
        }
        public org.mule.modules.clarizen.api.model.flat.TimeZoneFlat getTimeZone() {
            return timeZone;
        }
        public org.mule.modules.clarizen.api.model.flat.LanguageFlat getLanguage() {
            return language;
        }
        public void setDescription(String description) {
            this.description = description;
        }
        public void setSubGroupsCount(Integer subGroupsCount) {
            this.subGroupsCount = subGroupsCount;
        }
        public void setAvailability(Double availability) {
            this.availability = availability;
        }
        public void setStopwatchesCount(Integer stopwatchesCount) {
            this.stopwatchesCount = stopwatchesCount;
        }
        public void setEntityType(EntityId entityType) {
            this.entityType = entityType;
        }
        public void setOrganizationUnit(Boolean organizationUnit) {
            this.organizationUnit = organizationUnit;
        }
        public void setDirectManager(
                org.mule.modules.clarizen.api.model.flat.UserFlat directManager) {
            this.directManager = directManager;
        }
        public void setTimeZone(
                org.mule.modules.clarizen.api.model.flat.TimeZoneFlat timeZone) {
            this.timeZone = timeZone;
        }
        public void setLanguage(
                org.mule.modules.clarizen.api.model.flat.LanguageFlat language) {
            this.language = language;
        }
}
