/**
 * Mule Clarizen Cloud Connector
 *
 * (c) 2003-2014 MuleSoft, Inc. The software in this package is published under
 * the terms of the CPAL v1.0 license, a copy of which has been included with this
 * distribution in the LICENSE.md file.
 */

package org.mule.modules.clarizen.api.model.flat;

public class BugFlat extends CaseFlat {

        private Boolean regression;
        private String impactArea;
        private String foundInBuild;
        private String integratedInBuild;
        private String closedInBuild;
        private String reopenedInBuild;
        private String sfExternalId;
        private String sfExternalName;
        private String zdExternalId;
        private String zdExternalName;

        public Boolean getRegression() {
            return regression;
        }
        public String getImpactArea() {
            return impactArea;
        }
        public String getFoundInBuild() {
            return foundInBuild;
        }
        public String getIntegratedInBuild() {
            return integratedInBuild;
        }
        public String getClosedInBuild() {
            return closedInBuild;
        }
        public String getReopenedInBuild() {
            return reopenedInBuild;
        }
        public String getSfExternalId() {
            return sfExternalId;
        }
        public String getSfExternalName() {
            return sfExternalName;
        }
        public String getZdExternalId() {
            return zdExternalId;
        }
        public String getZdExternalName() {
            return zdExternalName;
        }
        public void setRegression(Boolean regression) {
            this.regression = regression;
        }
        public void setImpactArea(String impactArea) {
            this.impactArea = impactArea;
        }
        public void setFoundInBuild(String foundInBuild) {
            this.foundInBuild = foundInBuild;
        }
        public void setIntegratedInBuild(String integratedInBuild) {
            this.integratedInBuild = integratedInBuild;
        }
        public void setClosedInBuild(String closedInBuild) {
            this.closedInBuild = closedInBuild;
        }
        public void setReopenedInBuild(String reopenedInBuild) {
            this.reopenedInBuild = reopenedInBuild;
        }
        public void setSfExternalId(String sfExternalId) {
            this.sfExternalId = sfExternalId;
        }
        public void setSfExternalName(String sfExternalName) {
            this.sfExternalName = sfExternalName;
        }
        public void setZdExternalId(String zdExternalId) {
            this.zdExternalId = zdExternalId;
        }
        public void setZdExternalName(String zdExternalName) {
            this.zdExternalName = zdExternalName;
        }
    
}
