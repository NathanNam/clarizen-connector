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

public class RelatedWork extends ClarizenEntity {
    
        private Case Case;
        private WorkItem workItem;
        private Double ImpactWeight;

        public Case getCase() {
            return Case;
        }
        public WorkItem getWorkItem() {
            return workItem;
        }
        public Double getImpactWeight() {
            return ImpactWeight;
        }
        public void setCase(Case case1) {
            Case = case1;
        }
        public void setWorkItem(WorkItem workItem) {
            this.workItem = workItem;
        }
        public void setImpactWeight(Double impactWeight) {
            ImpactWeight = impactWeight;
        }
}
