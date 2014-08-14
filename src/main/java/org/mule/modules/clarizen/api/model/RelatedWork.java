/**
 * Mule Clarizen Cloud Connector
 *
 * (c) 2003-2014 MuleSoft, Inc. The software in this package is published under
 * the terms of the CPAL v1.0 license, a copy of which has been included with this
 * distribution in the LICENSE.md file.
 */

package org.mule.modules.clarizen.api.model;

public class RelatedWork extends ClarizenEntity {
    
        private org.mule.modules.clarizen.api.model.flat.CaseFlat Case;
        private org.mule.modules.clarizen.api.model.flat.WorkItemFlat workItem;
        private Double ImpactWeight;

        public org.mule.modules.clarizen.api.model.flat.CaseFlat getCase() {
            return Case;
        }
        public org.mule.modules.clarizen.api.model.flat.WorkItemFlat getWorkItem() {
            return workItem;
        }
        public Double getImpactWeight() {
            return ImpactWeight;
        }
        public void setCase(org.mule.modules.clarizen.api.model.flat.CaseFlat case1) {
            Case = case1;
        }
        public void setWorkItem(
                org.mule.modules.clarizen.api.model.flat.WorkItemFlat workItem) {
            this.workItem = workItem;
        }
        public void setImpactWeight(Double impactWeight) {
            ImpactWeight = impactWeight;
        }        
}
