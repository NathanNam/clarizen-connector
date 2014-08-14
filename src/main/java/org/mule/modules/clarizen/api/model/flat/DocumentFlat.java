/**
 * Mule Clarizen Cloud Connector
 *
 * (c) 2003-2014 MuleSoft, Inc. The software in this package is published under
 * the terms of the CPAL v1.0 license, a copy of which has been included with this
 * distribution in the LICENSE.md file.
 */

package org.mule.modules.clarizen.api.model.flat;

import com.clarizen.api.EntityId;

public class DocumentFlat extends ClarizenEntityCustomFieldsFlat {
    
        private String description;
        private EntityId documentType;
        private String SYSID;

        public String getDescription() {
            return description;
        }
        public EntityId getDocumentType() {
            return documentType;
        }
        public String getSYSID() {
            return SYSID;
        }
        public void setDescription(String description) {
            this.description = description;
        }
        public void setDocumentType(EntityId documentType) {
            this.documentType = documentType;
        }
        public void setSYSID(String sYSID) {
            SYSID = sYSID;
        }

}
