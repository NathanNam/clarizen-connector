/**
 * Mule Clarizen Cloud Connector
 *
 * (c) 2003-2014 MuleSoft, Inc. The software in this package is published under
 * the terms of the CPAL v1.0 license, a copy of which has been included with this
 * distribution in the LICENSE.md file.
 */

package org.mule.modules.clarizen.api.model;

public class ResourceEntity extends ClarizenEntity {
    
        private String description;
        private org.mule.modules.clarizen.api.model.flat.StateFlat state;
        private Double availability;
        private Integer stopwatchesCount;

        public String getDescription() {
            return description;
        }
        public org.mule.modules.clarizen.api.model.flat.StateFlat getState() {
            return state;
        }
        public Double getAvailability() {
            return availability;
        }
        public Integer getStopwatchesCount() {
            return stopwatchesCount;
        }
        public void setDescription(String description) {
            this.description = description;
        }
        public void setState(org.mule.modules.clarizen.api.model.flat.StateFlat state) {
            this.state = state;
        }
        public void setAvailability(Double availability) {
            this.availability = availability;
        }
        public void setStopwatchesCount(Integer stopwatchesCount) {
            this.stopwatchesCount = stopwatchesCount;
        }
}
