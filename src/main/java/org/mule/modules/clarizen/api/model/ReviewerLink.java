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

import com.clarizen.api.Duration;

public class ReviewerLink extends ClarizenEntity {
    
        private org.mule.modules.clarizen.api.model.flat.WorkItemFlat workItem;
        private org.mule.modules.clarizen.api.model.flat.UserFlat resource;
        private Duration remainingEffort;
        private Double units;
        private org.mule.modules.clarizen.api.model.flat.ResourceRoleFlat resourceRole;
        private Duration work;
        private Boolean workManuallySet;
        private Boolean remainingEffortManuallySet;
        private Boolean unitsManuallySet;
        private Duration duration;
        private Duration actualRegularEffort;
        private Boolean actualRegularManuallySet;
        private Duration actualOvertimeEffort;
        private Boolean actualOvertimeEffortManuallySet;
        private Duration workVariance;
        private org.mule.modules.clarizen.api.model.flat.RoleFlat role;
        private Double availability;
        private Double percentCompleted;
        private Long completnessDefinition;
        private Duration pendingTime;

        public org.mule.modules.clarizen.api.model.flat.WorkItemFlat getWorkItem() {
            return workItem;
        }
        public org.mule.modules.clarizen.api.model.flat.UserFlat getResource() {
            return resource;
        }
        public Duration getRemainingEffort() {
            return remainingEffort;
        }
        public Double getUnits() {
            return units;
        }
        public org.mule.modules.clarizen.api.model.flat.ResourceRoleFlat getResourceRole() {
            return resourceRole;
        }
        public Duration getWork() {
            return work;
        }
        public Boolean getWorkManuallySet() {
            return workManuallySet;
        }
        public Boolean getRemainingEffortManuallySet() {
            return remainingEffortManuallySet;
        }
        public Boolean getUnitsManuallySet() {
            return unitsManuallySet;
        }
        public Duration getDuration() {
            return duration;
        }
        public Duration getActualRegularEffort() {
            return actualRegularEffort;
        }
        public Boolean getActualRegularManuallySet() {
            return actualRegularManuallySet;
        }
        public Duration getActualOvertimeEffort() {
            return actualOvertimeEffort;
        }
        public Boolean getActualOvertimeEffortManuallySet() {
            return actualOvertimeEffortManuallySet;
        }
        public Duration getWorkVariance() {
            return workVariance;
        }
        public org.mule.modules.clarizen.api.model.flat.RoleFlat getRole() {
            return role;
        }
        public Double getAvailability() {
            return availability;
        }
        public Double getPercentCompleted() {
            return percentCompleted;
        }
        public Long getCompletnessDefinition() {
            return completnessDefinition;
        }
        public Duration getPendingTime() {
            return pendingTime;
        }
        public void setWorkItem(
                org.mule.modules.clarizen.api.model.flat.WorkItemFlat workItem) {
            this.workItem = workItem;
        }
        public void setResource(org.mule.modules.clarizen.api.model.flat.UserFlat resource) {
            this.resource = resource;
        }
        public void setRemainingEffort(Duration remainingEffort) {
            this.remainingEffort = remainingEffort;
        }
        public void setUnits(Double units) {
            this.units = units;
        }
        public void setResourceRole(
                org.mule.modules.clarizen.api.model.flat.ResourceRoleFlat resourceRole) {
            this.resourceRole = resourceRole;
        }
        public void setWork(Duration work) {
            this.work = work;
        }
        public void setWorkManuallySet(Boolean workManuallySet) {
            this.workManuallySet = workManuallySet;
        }
        public void setRemainingEffortManuallySet(Boolean remainingEffortManuallySet) {
            this.remainingEffortManuallySet = remainingEffortManuallySet;
        }
        public void setUnitsManuallySet(Boolean unitsManuallySet) {
            this.unitsManuallySet = unitsManuallySet;
        }
        public void setDuration(Duration duration) {
            this.duration = duration;
        }
        public void setActualRegularEffort(Duration actualRegularEffort) {
            this.actualRegularEffort = actualRegularEffort;
        }
        public void setActualRegularManuallySet(Boolean actualRegularManuallySet) {
            this.actualRegularManuallySet = actualRegularManuallySet;
        }
        public void setActualOvertimeEffort(Duration actualOvertimeEffort) {
            this.actualOvertimeEffort = actualOvertimeEffort;
        }
        public void setActualOvertimeEffortManuallySet(
                Boolean actualOvertimeEffortManuallySet) {
            this.actualOvertimeEffortManuallySet = actualOvertimeEffortManuallySet;
        }
        public void setWorkVariance(Duration workVariance) {
            this.workVariance = workVariance;
        }
        public void setRole(org.mule.modules.clarizen.api.model.flat.RoleFlat role) {
            this.role = role;
        }
        public void setAvailability(Double availability) {
            this.availability = availability;
        }
        public void setPercentCompleted(Double percentCompleted) {
            this.percentCompleted = percentCompleted;
        }
        public void setCompletnessDefinition(Long completnessDefinition) {
            this.completnessDefinition = completnessDefinition;
        }
        public void setPendingTime(Duration pendingTime) {
            this.pendingTime = pendingTime;
        }
}
