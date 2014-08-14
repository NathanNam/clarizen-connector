/**
 * Mule Clarizen Cloud Connector
 *
 * (c) 2003-2014 MuleSoft, Inc. The software in this package is published under
 * the terms of the CPAL v1.0 license, a copy of which has been included with this
 * distribution in the LICENSE.md file.
 */

package org.mule.modules.clarizen.api.model.flat;

public class IssueFlat extends CaseFlat {
    
        private String sfExternalId;
        private String sfExternalName;
        private String zdExternalId;
        private String zdExternalName;

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
