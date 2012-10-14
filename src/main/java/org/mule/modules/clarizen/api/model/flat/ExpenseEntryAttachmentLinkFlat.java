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

public class ExpenseEntryAttachmentLinkFlat extends ClarizenEntityCustomFieldsFlat {

        private EntityId entity;
        private EntityId document;

        public EntityId getEntity() {
            return entity;
        }
        public EntityId getDocument() {
            return document;
        }
        public void setEntity(EntityId entity) {
            this.entity = entity;
        }
        public void setDocument(EntityId document) {
            this.document = document;
        }        
}
