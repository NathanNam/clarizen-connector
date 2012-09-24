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

public class ExpenseEntryAttachmentLink extends ClarizenEntity {

        private Expense entity;
        private Document document;

        public Expense getEntity() {
            return entity;
        }
        public Document getDocument() {
            return document;
        }
        public void setEntity(Expense entity) {
            this.entity = entity;
        }
        public void setDocument(Document document) {
            this.document = document;
        }
}
