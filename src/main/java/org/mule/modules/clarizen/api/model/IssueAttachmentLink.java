/**
 * Mule Clarizen Cloud Connector
 *
 * (c) 2003-2014 MuleSoft, Inc. The software in this package is published under
 * the terms of the CPAL v1.0 license, a copy of which has been included with this
 * distribution in the LICENSE.md file.
 */

package org.mule.modules.clarizen.api.model;

public class IssueAttachmentLink extends ClarizenEntity {

    private org.mule.modules.clarizen.api.model.flat.CaseFlat entity;
    private org.mule.modules.clarizen.api.model.flat.DocumentFlat document;

    public org.mule.modules.clarizen.api.model.flat.CaseFlat getEntity() {
        return entity;
    }
    public org.mule.modules.clarizen.api.model.flat.DocumentFlat getDocument() {
        return document;
    }
    public void setEntity(org.mule.modules.clarizen.api.model.flat.CaseFlat entity) {
        this.entity = entity;
    }
    public void setDocument(
            org.mule.modules.clarizen.api.model.flat.DocumentFlat document) {
        this.document = document;
    }   
}
