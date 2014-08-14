/**
 * Mule Clarizen Cloud Connector
 *
 * (c) 2003-2014 MuleSoft, Inc. The software in this package is published under
 * the terms of the CPAL v1.0 license, a copy of which has been included with this
 * distribution in the LICENSE.md file.
 */

package org.mule.modules.clarizen.api.model;

import com.clarizen.api.EntityId;

public class ReceivedMail extends ClarizenEntity {

        private String from;
        private String to;
        private String cc;
        private String subject;
        private String htmlBody;
        private EntityId sentBy;
        private String textBody;

        public String getFrom() {
            return from;
        }
        public String getTo() {
            return to;
        }
        public String getCc() {
            return cc;
        }
        public String getSubject() {
            return subject;
        }
        public String getHtmlBody() {
            return htmlBody;
        }
        public EntityId getSentBy() {
            return sentBy;
        }
        public String getTextBody() {
            return textBody;
        }
        public void setFrom(String from) {
            this.from = from;
        }
        public void setTo(String to) {
            this.to = to;
        }
        public void setCc(String cc) {
            this.cc = cc;
        }
        public void setSubject(String subject) {
            this.subject = subject;
        }
        public void setHtmlBody(String htmlBody) {
            this.htmlBody = htmlBody;
        }
        public void setSentBy(EntityId sentBy) {
            this.sentBy = sentBy;
        }
        public void setTextBody(String textBody) {
            this.textBody = textBody;
        }
}
