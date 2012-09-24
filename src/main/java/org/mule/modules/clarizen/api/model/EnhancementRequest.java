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

public class EnhancementRequest extends Case {
    
        private RequestType requestType;
        private Double expectedCost;
        private Double expectedRevenue;
        private String risks;
        private String mitigation;
        private RisksRate risksRate;
        private RiskImpact risksImpact;
        private Double risksTotalScore;

        public RequestType getRequestType() {
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
        public RisksRate getRisksRate() {
            return risksRate;
        }
        public RiskImpact getRisksImpact() {
            return risksImpact;
        }
        public Double getRisksTotalScore() {
            return risksTotalScore;
        }
        public void setRequestType(RequestType requestType) {
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
        public void setRisksRate(RisksRate risksRate) {
            this.risksRate = risksRate;
        }
        public void setRisksImpact(RiskImpact risksImpact) {
            this.risksImpact = risksImpact;
        }
        public void setRisksTotalScore(Double risksTotalScore) {
            this.risksTotalScore = risksTotalScore;
        }
}
