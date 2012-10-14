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

public class Project extends WorkItem {

    private Boolean rollupFinancialAndEffortDataFromShortcut;
    private String justification;
    private String businessAlignment;
    private String plannedSavings;
    private String expectedBusinessValue;
    private String projectGoals;
    private org.mule.modules.clarizen.api.model.flat.ProjectSizeFlat projectSize;
    private org.mule.modules.clarizen.api.model.flat.UserFlat projectSponsor;
    private Boolean goalsAchieved;
    private Double expectedROI;
    private org.mule.modules.clarizen.api.model.flat.BusinessImpactFlat businessImpact;
    private Double score;
    private String overallSummary;
    private String scheduleSummary;
    private String budgetSummary;
    private String additionalComments;
    private String risks;
    private String mitigation;
    private org.mule.modules.clarizen.api.model.flat.RisksRateFlat risksRate;
    private org.mule.modules.clarizen.api.model.flat.RiskImpactFlat risksImpact;
    private Double risksTotalScore;
    private Boolean rollupProgressAndDatesFromShortcut;
    private String holdingNotes;
    private String closingNotes;
    private org.mule.modules.clarizen.api.model.flat.ProjectTypeFlat projectType;
    private org.mule.modules.clarizen.api.model.flat.UserFlat projectManager;
    private String projectTagging;

    public Boolean getRollupFinancialAndEffortDataFromShortcut() {
        return rollupFinancialAndEffortDataFromShortcut;
    }
    public String getJustification() {
        return justification;
    }
    public String getBusinessAlignment() {
        return businessAlignment;
    }
    public String getPlannedSavings() {
        return plannedSavings;
    }
    public String getExpectedBusinessValue() {
        return expectedBusinessValue;
    }
    public String getProjectGoals() {
        return projectGoals;
    }
    public org.mule.modules.clarizen.api.model.flat.ProjectSizeFlat getProjectSize() {
        return projectSize;
    }
    public org.mule.modules.clarizen.api.model.flat.UserFlat getProjectSponsor() {
        return projectSponsor;
    }
    public Boolean getGoalsAchieved() {
        return goalsAchieved;
    }
    public Double getExpectedROI() {
        return expectedROI;
    }
    public org.mule.modules.clarizen.api.model.flat.BusinessImpactFlat getBusinessImpact() {
        return businessImpact;
    }
    public Double getScore() {
        return score;
    }
    public String getOverallSummary() {
        return overallSummary;
    }
    public String getScheduleSummary() {
        return scheduleSummary;
    }
    public String getBudgetSummary() {
        return budgetSummary;
    }
    public String getAdditionalComments() {
        return additionalComments;
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
    public Boolean getRollupProgressAndDatesFromShortcut() {
        return rollupProgressAndDatesFromShortcut;
    }
    public String getHoldingNotes() {
        return holdingNotes;
    }
    public String getClosingNotes() {
        return closingNotes;
    }
    public org.mule.modules.clarizen.api.model.flat.ProjectTypeFlat getProjectType() {
        return projectType;
    }
    public org.mule.modules.clarizen.api.model.flat.UserFlat getProjectManager() {
        return projectManager;
    }
    public String getProjectTagging() {
        return projectTagging;
    }
    public void setRollupFinancialAndEffortDataFromShortcut(
            Boolean rollupFinancialAndEffortDataFromShortcut) {
        this.rollupFinancialAndEffortDataFromShortcut = rollupFinancialAndEffortDataFromShortcut;
    }
    public void setJustification(String justification) {
        this.justification = justification;
    }
    public void setBusinessAlignment(String businessAlignment) {
        this.businessAlignment = businessAlignment;
    }
    public void setPlannedSavings(String plannedSavings) {
        this.plannedSavings = plannedSavings;
    }
    public void setExpectedBusinessValue(String expectedBusinessValue) {
        this.expectedBusinessValue = expectedBusinessValue;
    }
    public void setProjectGoals(String projectGoals) {
        this.projectGoals = projectGoals;
    }
    public void setProjectSize(
            org.mule.modules.clarizen.api.model.flat.ProjectSizeFlat projectSize) {
        this.projectSize = projectSize;
    }
    public void setProjectSponsor(
            org.mule.modules.clarizen.api.model.flat.UserFlat projectSponsor) {
        this.projectSponsor = projectSponsor;
    }
    public void setGoalsAchieved(Boolean goalsAchieved) {
        this.goalsAchieved = goalsAchieved;
    }
    public void setExpectedROI(Double expectedROI) {
        this.expectedROI = expectedROI;
    }
    public void setBusinessImpact(
            org.mule.modules.clarizen.api.model.flat.BusinessImpactFlat businessImpact) {
        this.businessImpact = businessImpact;
    }
    public void setScore(Double score) {
        this.score = score;
    }
    public void setOverallSummary(String overallSummary) {
        this.overallSummary = overallSummary;
    }
    public void setScheduleSummary(String scheduleSummary) {
        this.scheduleSummary = scheduleSummary;
    }
    public void setBudgetSummary(String budgetSummary) {
        this.budgetSummary = budgetSummary;
    }
    public void setAdditionalComments(String additionalComments) {
        this.additionalComments = additionalComments;
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
    public void setRollupProgressAndDatesFromShortcut(
            Boolean rollupProgressAndDatesFromShortcut) {
        this.rollupProgressAndDatesFromShortcut = rollupProgressAndDatesFromShortcut;
    }
    public void setHoldingNotes(String holdingNotes) {
        this.holdingNotes = holdingNotes;
    }
    public void setClosingNotes(String closingNotes) {
        this.closingNotes = closingNotes;
    }
    public void setProjectType(
            org.mule.modules.clarizen.api.model.flat.ProjectTypeFlat projectType) {
        this.projectType = projectType;
    }
    public void setProjectManager(
            org.mule.modules.clarizen.api.model.flat.UserFlat projectManager) {
        this.projectManager = projectManager;
    }
    public void setProjectTagging(String projectTagging) {
        this.projectTagging = projectTagging;
    }
}
