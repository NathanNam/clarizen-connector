/**
 * Mule Clarizen Cloud Connector
 *
 * (c) 2003-2014 MuleSoft, Inc. The software in this package is published under
 * the terms of the CPAL v1.0 license, a copy of which has been included with this
 * distribution in the LICENSE.md file.
 */

package org.mule.modules.clarizen.api.model;

public class EnhancementRequest extends Case {
    
        private org.mule.modules.clarizen.api.model.flat.RequestTypeFlat requestType;
        private Double expectedCost;
        private Double expectedRevenue;
        private String risks;
        private String mitigation;
        private org.mule.modules.clarizen.api.model.flat.RisksRateFlat risksRate;
        private org.mule.modules.clarizen.api.model.flat.RiskImpactFlat risksImpact;
        private Double risksTotalScore;

        public org.mule.modules.clarizen.api.model.flat.RequestTypeFlat getRequestType() {
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
        public org.mule.modules.clarizen.api.model.flat.RisksRateFlat getRisksRate() {
            return risksRate;
        }
        public org.mule.modules.clarizen.api.model.flat.RiskImpactFlat getRisksImpact() {
            return risksImpact;
        }
        public Double getRisksTotalScore() {
            return risksTotalScore;
        }
        public void setRequestType(
                org.mule.modules.clarizen.api.model.flat.RequestTypeFlat requestType) {
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
        public void setRisksRate(
                org.mule.modules.clarizen.api.model.flat.RisksRateFlat risksRate) {
            this.risksRate = risksRate;
        }
        public void setRisksImpact(
                org.mule.modules.clarizen.api.model.flat.RiskImpactFlat risksImpact) {
            this.risksImpact = risksImpact;
        }
        public void setRisksTotalScore(Double risksTotalScore) {
            this.risksTotalScore = risksTotalScore;
        }
}
