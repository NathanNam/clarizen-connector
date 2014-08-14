/**
 * Mule Clarizen Cloud Connector
 *
 * (c) 2003-2014 MuleSoft, Inc. The software in this package is published under
 * the terms of the CPAL v1.0 license, a copy of which has been included with this
 * distribution in the LICENSE.md file.
 */

package org.mule.modules.clarizen.api.model.flat;

import com.clarizen.api.EntityId;

public class EnhancementRequestFlat extends CaseFlat {
    
        private EntityId requestType;
        private Double expectedCost;
        private Double expectedRevenue;
        private String risks;
        private String mitigation;
        private EntityId risksRate;
        private EntityId risksImpact;
        private Double risksTotalScore;

        public EntityId getRequestType() {
            return requestType;
        }
        public Double getExpectedCost() {
            return expectedCost;
        }
        public Double getExpectedRevenue() {
            return expectedRevenue;
        }
        public String getRisks() {
            return risks;
        }
        public String getMitigation() {
            return mitigation;
        }
        public EntityId getRisksRate() {
            return risksRate;
        }
        public EntityId getRisksImpact() {
            return risksImpact;
        }
        public Double getRisksTotalScore() {
            return risksTotalScore;
        }
        public void setRequestType(EntityId requestType) {
            this.requestType = requestType;
        }
        public void setExpectedCost(Double expectedCost) {
            this.expectedCost = expectedCost;
        }
        public void setExpectedRevenue(Double expectedRevenue) {
            this.expectedRevenue = expectedRevenue;
        }
        public void setRisks(String risks) {
            this.risks = risks;
        }
        public void setMitigation(String mitigation) {
            this.mitigation = mitigation;
        }
        public void setRisksRate(EntityId risksRate) {
            this.risksRate = risksRate;
        }
        public void setRisksImpact(EntityId risksImpact) {
            this.risksImpact = risksImpact;
        }
        public void setRisksTotalScore(Double risksTotalScore) {
            this.risksTotalScore = risksTotalScore;
        }
        
}
