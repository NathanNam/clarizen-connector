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

import java.util.Date;

public class Risk extends Case {
    
        private Double percentProbability;
        private Integer impact;
        private Date triggerDate;
        private String mitigationPlan;
        private String contingencyPlan;
        private Double riskRate;
        private org.mule.modules.clarizen.api.model.flat.RiskStateFlat riskState;

        public Double getPercentProbability() {
            return percentProbability;
        }
        public Integer getImpact() {
            return impact;
        }
        public Date getTriggerDate() {
            return triggerDate;
        }
        public String getMitigationPlan() {
            return mitigationPlan;
        }
        public String getContingencyPlan() {
            return contingencyPlan;
        }
        public Double getRiskRate() {
            return riskRate;
        }
        public org.mule.modules.clarizen.api.model.flat.RiskStateFlat getRiskState() {
            return riskState;
        }
        public void setPercentProbability(Double percentProbability) {
            this.percentProbability = percentProbability;
        }
        public void setImpact(Integer impact) {
            this.impact = impact;
        }
        public void setTriggerDate(Date triggerDate) {
            this.triggerDate = triggerDate;
        }
        public void setMitigationPlan(String mitigationPlan) {
            this.mitigationPlan = mitigationPlan;
        }
        public void setContingencyPlan(String contingencyPlan) {
            this.contingencyPlan = contingencyPlan;
        }
        public void setRiskRate(Double riskRate) {
            this.riskRate = riskRate;
        }
        public void setRiskState(
                org.mule.modules.clarizen.api.model.flat.RiskStateFlat riskState) {
            this.riskState = riskState;
        }
}
