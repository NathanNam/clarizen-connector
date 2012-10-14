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

public class WorkItemAttachmentLink extends ClarizenEntity {
    
    private org.mule.modules.clarizen.api.model.flat.WorkItemFlat entity;
    private org.mule.modules.clarizen.api.model.flat.DocumentFlat document;

    public org.mule.modules.clarizen.api.model.flat.WorkItemFlat getEntity() {
        return entity;
    }
    public org.mule.modules.clarizen.api.model.flat.DocumentFlat getDocument() {
        return document;
    }
    public void setEntity(org.mule.modules.clarizen.api.model.flat.WorkItemFlat entity) {
        this.entity = entity;
    }
    public void setDocument(
            org.mule.modules.clarizen.api.model.flat.DocumentFlat document) {
        this.document = document;
    }

}
