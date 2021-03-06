/**
 * Mule Clarizen Cloud Connector
 *
 * (c) 2003-2014 MuleSoft, Inc. The software in this package is published under
 * the terms of the CPAL v1.0 license, a copy of which has been included with this
 * distribution in the LICENSE.md file.
 */

package org.mule.modules.clarizen.api.model;

import com.clarizen.api.Money;

public class JobTitle extends ClarizenEntity {

    private String description;
    private Double availability;
    private Integer stopwatchesCount;
    private Money costRegularRate;
    private Money costOvertimeRate;
    private Money revenueRegularRate;
    private Money revenueOvertimeRate;

    public String getDescription() {
        return description;
    }
    public Double getAvailability() {
        return availability;
    }
    public Integer getStopwatchesCount() {
        return stopwatchesCount;
    }
    public Money getCostRegularRate() {
        return costRegularRate;
    }
    public Money getCostOvertimeRate() {
        return costOvertimeRate;
    }
    public Money getRevenueRegularRate() {
        return revenueRegularRate;
    }
    public Money getRevenueOvertimeRate() {
        return revenueOvertimeRate;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public void setAvailability(Double availability) {
        this.availability = availability;
    }
    public void setStopwatchesCount(Integer stopwatchesCount) {
        this.stopwatchesCount = stopwatchesCount;
    }
    public void setCostRegularRate(Money costRegularRate) {
        this.costRegularRate = costRegularRate;
    }
    public void setCostOvertimeRate(Money costOvertimeRate) {
        this.costOvertimeRate = costOvertimeRate;
    }
    public void setRevenueRegularRate(Money revenueRegularRate) {
        this.revenueRegularRate = revenueRegularRate;
    }
    public void setRevenueOvertimeRate(Money revenueOvertimeRate) {
        this.revenueOvertimeRate = revenueOvertimeRate;
    }
}
