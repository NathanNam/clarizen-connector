/**
 * Mule Clarizen Cloud Connector
 *
 * (c) 2003-2014 MuleSoft, Inc. The software in this package is published under
 * the terms of the CPAL v1.0 license, a copy of which has been included with this
 * distribution in the LICENSE.md file.
 */

package org.mule.modules.clarizen.api.model.flat;

import java.util.Date;

import com.clarizen.api.EntityId;

public class RiskFlat extends CaseFlat {
    
        private Double percentProbability;
        private Integer impact;
        private Date triggerDate;
        private String mitigationPlan;
        private String contingencyPlan;
        private Double riskRate;
        private EntityId riskState;

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
        public EntityId getRiskState() {
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
        public void setRiskState(EntityId riskState) {
            this.riskState = riskState;
        }
}
