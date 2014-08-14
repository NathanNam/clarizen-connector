/**
 * Mule Clarizen Cloud Connector
 *
 * (c) 2003-2014 MuleSoft, Inc. The software in this package is published under
 * the terms of the CPAL v1.0 license, a copy of which has been included with this
 * distribution in the LICENSE.md file.
 */

package org.mule.modules.clarizen.api.model.flat;

import com.clarizen.api.EntityId;

public class CustomerLinkFlat extends ClarizenEntityCustomFieldsFlat {
    
        private EntityId entity;
        private EntityId customer;
        private Double costAllocation;

        public EntityId getEntity() {
            return entity;
        }
        public EntityId getCustomer() {
            return customer;
        }
        public Double getCostAllocation() {
            return costAllocation;
        }
        public void setEntity(EntityId entity) {
            this.entity = entity;
        }
        public void setCustomer(EntityId customer) {
            this.customer = customer;
        }
        public void setCostAllocation(Double costAllocation) {
            this.costAllocation = costAllocation;
        }

        
}
