/**
 * Mule Clarizen Cloud Connector
 *
 * (c) 2003-2014 MuleSoft, Inc. The software in this package is published under
 * the terms of the CPAL v1.0 license, a copy of which has been included with this
 * distribution in the LICENSE.md file.
 */

package org.mule.modules.clarizen.api.model;

import java.util.Date;

import com.clarizen.api.EntityId;
import com.clarizen.api.Money;

public class Rate extends ClarizenEntity {
    
        private EntityId rateFor;
        private org.mule.modules.clarizen.api.model.flat.RateTypeFlat rateType;
        private Date effectiveFrom;
        private Date effectiveTo;
        private Money regularRate;
        private Money overtimeRate;

        public EntityId getRateFor() {
            return rateFor;
        }
        public org.mule.modules.clarizen.api.model.flat.RateTypeFlat getRateType() {
            return rateType;
        }
        public Date getEffectiveFrom() {
            return effectiveFrom;
        }
        public Date getEffectiveTo() {
            return effectiveTo;
        }
        public Money getRegularRate() {
            return regularRate;
        }
        public Money getOvertimeRate() {
            return overtimeRate;
        }
        public void setRateFor(EntityId rateFor) {
            this.rateFor = rateFor;
        }
        public void setRateType(
                org.mule.modules.clarizen.api.model.flat.RateTypeFlat rateType) {
            this.rateType = rateType;
        }
        public void setEffectiveFrom(Date effectiveFrom) {
            this.effectiveFrom = effectiveFrom;
        }
        public void setEffectiveTo(Date effectiveTo) {
            this.effectiveTo = effectiveTo;
        }
        public void setRegularRate(Money regularRate) {
            this.regularRate = regularRate;
        }
        public void setOvertimeRate(Money overtimeRate) {
            this.overtimeRate = overtimeRate;
        }
}