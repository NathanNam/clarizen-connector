/**
 * Mule Clarizen Cloud Connector
 *
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */

package org.mule.modules.clarizen.api.model.flat;

import com.clarizen.api.EntityId;

public class ProjectFlat extends WorkItemFlat {

    private Boolean rollupFinancialAndEffortDataFromShortcut;
    private String justification;
    private String businessAlignment;
    private String plannedSavings;
    private String expectedBusinessValue;
    private String projectGoals;
    private EntityId projectSize;
    private EntityId projectSponsor;
    private Boolean goalsAchieved;
    private Double expectedROI;
    private EntityId businessImpact;
    private Double score;
    private String overallSummary;
    private String scheduleSummary;
    private String budgetSummary;
    private String additionalComments;
    private String risks;
    private String mitigation;
    private EntityId risksRate;
    private EntityId risksImpact;
    private Double risksTotalScore;
    private Boolean rollupProgressAndDatesFromShortcut;
    private String holdingNotes;
    private String closingNotes;
    private EntityId projectType;
    private EntityId projectManager;
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
    public EntityId getProjectSize() {
        return projectSize;
    }
    public EntityId getProjectSponsor() {
        return projectSponsor;
    }
    public Boolean getGoalsAchieved() {
        return goalsAchieved;
    }
    public Double getExpectedROI() {
        return expectedROI;
    }
    public EntityId getBusinessImpact() {
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
    public EntityId getRisksRate() {
        return risksRate;
    }
    public EntityId getRisksImpact() {
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
    public EntityId getProjectType() {
        return projectType;
    }
    public EntityId getProjectManager() {
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
    public void setProjectSize(EntityId projectSize) {
        this.projectSize = projectSize;
    }
    public void setProjectSponsor(EntityId projectSponsor) {
        this.projectSponsor = projectSponsor;
    }
    public void setGoalsAchieved(Boolean goalsAchieved) {
        this.goalsAchieved = goalsAchieved;
    }
    public void setExpectedROI(Double expectedROI) {
        this.expectedROI = expectedROI;
    }
    public void setBusinessImpact(EntityId businessImpact) {
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
    public void setRisksRate(EntityId risksRate) {
        this.risksRate = risksRate;
    }
    public void setRisksImpact(EntityId risksImpact) {
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
    public void setProjectType(EntityId projectType) {
        this.projectType = projectType;
    }
    public void setProjectManager(EntityId projectManager) {
        this.projectManager = projectManager;
    }
    public void setProjectTagging(String projectTagging) {
        this.projectTagging = projectTagging;
    }
}
