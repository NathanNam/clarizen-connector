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

public class CurrencyExchangeRateFlat extends ClarizenEntityCustomFieldsFlat {

        private EntityId baseCurrency;
        private EntityId quoteCurrency;
        private Date effectiveFrom;
        private Double exchangeRate;

        public EntityId getBaseCurrency() {
            return baseCurrency;
        }
        public EntityId getQuoteCurrency() {
            return quoteCurrency;
        }
        public Date getEffectiveFrom() {
            return effectiveFrom;
        }
        public Double getExchangeRate() {
            return exchangeRate;
        }
        public void setBaseCurrency(EntityId baseCurrency) {
            this.baseCurrency = baseCurrency;
        }
        public void setQuoteCurrency(EntityId quoteCurrency) {
            this.quoteCurrency = quoteCurrency;
        }
        public void setEffectiveFrom(Date effectiveFrom) {
            this.effectiveFrom = effectiveFrom;
        }
        public void setExchangeRate(Double exchangeRate) {
            this.exchangeRate = exchangeRate;
        }
}
