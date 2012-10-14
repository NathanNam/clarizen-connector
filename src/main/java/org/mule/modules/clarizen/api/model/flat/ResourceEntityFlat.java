/**
 * Mule Clarizen Cloud Connector
 *
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */

package org.mule.modules.clarizen.api.model.flat;

public class ResourceEntityFlat extends ClarizenEntityCustomFieldsFlat {
    
        private String description;
        private StateFlat state;
        private Double availability;
        private Integer stopwatchesCount;

        public String getDescription() {
            return description;
        }
        public StateFlat getState() {
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
        public void setState(StateFlat state) {
            this.state = state;
        }
        public void setAvailability(Double availability) {
            this.availability = availability;
        }
        public void setStopwatchesCount(Integer stopwatchesCount) {
            this.stopwatchesCount = stopwatchesCount;
        }

}
