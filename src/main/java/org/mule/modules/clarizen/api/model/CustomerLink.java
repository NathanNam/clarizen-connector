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

public class CustomerLink extends ClarizenEntity {
    
        private org.mule.modules.clarizen.api.model.flat.ProjectFlat entity;
        private org.mule.modules.clarizen.api.model.flat.CustomerFlat customer;
        private Double costAllocation;

        public org.mule.modules.clarizen.api.model.flat.ProjectFlat getEntity() {
            return entity;
        }
        public org.mule.modules.clarizen.api.model.flat.CustomerFlat getCustomer() {
            return customer;
        }
        public Double getCostAllocation() {
            return costAllocation;
        }
        public void setEntity(org.mule.modules.clarizen.api.model.flat.ProjectFlat entity) {
            this.entity = entity;
        }
        public void setCustomer(
                org.mule.modules.clarizen.api.model.flat.CustomerFlat customer) {
            this.customer = customer;
        }
        public void setCostAllocation(Double costAllocation) {
            this.costAllocation = costAllocation;
        }

       
}
