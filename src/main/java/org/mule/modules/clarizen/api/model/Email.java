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

import com.clarizen.api.EntityId;

public class Email extends ClarizenEntity {

    private String subject;
    private String comment;
    private String plainText;
    private EntityId attachedTo;
    private CommentType visibility;
    private EntityId sentBy;

    public String getSubject() {
        return subject;
    }
    public String getComment() {
        return comment;
    }
    public String getPlainText() {
        return plainText;
    }
    public EntityId getAttachedTo() {
        return attachedTo;
    }
    public CommentType getVisibility() {
        return visibility;
    }
    public EntityId getSentBy() {
        return sentBy;
    }
    public void setSubject(String subject) {
        this.subject = subject;
    }
    public void setComment(String comment) {
        this.comment = comment;
    }
    public void setPlainText(String plainText) {
        this.plainText = plainText;
    }
    public void setAttachedTo(EntityId attachedTo) {
        this.attachedTo = attachedTo;
    }
    public void setVisibility(CommentType visibility) {
        this.visibility = visibility;
    }
    public void setSentBy(EntityId sentBy) {
        this.sentBy = sentBy;
    }
}
