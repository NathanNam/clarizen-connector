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

public class CurrencyExchangeRate extends ClarizenEntity {

        private CurrencyType baseCurrency;
        private CurrencyType quoteCurrency;
        private Date effectiveFrom;
        private Double exchangeRate;

        public CurrencyType getBaseCurrency() {
            return baseCurrency;
        }
        public CurrencyType getQuoteCurrency() {
            return quoteCurrency;
        }
        public Date getEffectiveFrom() {
            return effectiveFrom;
        }
        public Double getExchangeRate() {
            return exchangeRate;
        }
        public void setBaseCurrency(CurrencyType baseCurrency) {
            this.baseCurrency = baseCurrency;
        }
        public void setQuoteCurrency(CurrencyType quoteCurrency) {
            this.quoteCurrency = quoteCurrency;
        }
        public void setEffectiveFrom(Date effectiveFrom) {
            this.effectiveFrom = effectiveFrom;
        }
        public void setExchangeRate(Double exchangeRate) {
            this.exchangeRate = exchangeRate;
        }
}
