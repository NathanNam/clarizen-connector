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

public class Issue extends Case {
    
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
