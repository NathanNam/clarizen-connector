/**
 * Mule Clarizen Cloud Connector
 *
 * (c) 2003-2014 MuleSoft, Inc. The software in this package is published under
 * the terms of the CPAL v1.0 license, a copy of which has been included with this
 * distribution in the LICENSE.md file.
 */

package org.mule.modules.clarizen.api.model.flat;

import com.clarizen.api.EntityId;

public class RelatedWorkFlat extends ClarizenEntityCustomFieldsFlat {
    
        private EntityId Case;
        private EntityId workItem;
        private Double ImpactWeight;

        public EntityId getCase() {
            return Case;
        }
        public EntityId getWorkItem() {
            return workItem;
        }
        public Double getImpactWeight() {
            return ImpactWeight;
        }
        public void setCase(EntityId case1) {
            Case = case1;
        }
        public void setWorkItem(EntityId workItem) {
            this.workItem = workItem;
        }
        public void setImpactWeight(Double impactWeight) {
            ImpactWeight = impactWeight;
        }
}
