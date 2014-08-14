/**
 * Mule Clarizen Cloud Connector
 *
 * (c) 2003-2014 MuleSoft, Inc. The software in this package is published under
 * the terms of the CPAL v1.0 license, a copy of which has been included with this
 * distribution in the LICENSE.md file.
 */

package org.mule.modules.clarizen.api.model;

import java.util.Date;

public class CurrencyExchangeRate extends ClarizenEntity {

        private org.mule.modules.clarizen.api.model.flat.CurrencyTypeFlat baseCurrency;
        private org.mule.modules.clarizen.api.model.flat.CurrencyTypeFlat quoteCurrency;
        private Date effectiveFrom;
        private Double exchangeRate;

        public org.mule.modules.clarizen.api.model.flat.CurrencyTypeFlat getBaseCurrency() {
            return baseCurrency;
        }
        public org.mule.modules.clarizen.api.model.flat.CurrencyTypeFlat getQuoteCurrency() {
            return quoteCurrency;
        }
        public Date getEffectiveFrom() {
            return effectiveFrom;
        }
        public Double getExchangeRate() {
            return exchangeRate;
        }
        public void setBaseCurrency(
                org.mule.modules.clarizen.api.model.flat.CurrencyTypeFlat baseCurrency) {
            this.baseCurrency = baseCurrency;
        }
        public void setQuoteCurrency(
                org.mule.modules.clarizen.api.model.flat.CurrencyTypeFlat quoteCurrency) {
            this.quoteCurrency = quoteCurrency;
        }
        public void setEffectiveFrom(Date effectiveFrom) {
            this.effectiveFrom = effectiveFrom;
        }
        public void setExchangeRate(Double exchangeRate) {
            this.exchangeRate = exchangeRate;
        }
}
