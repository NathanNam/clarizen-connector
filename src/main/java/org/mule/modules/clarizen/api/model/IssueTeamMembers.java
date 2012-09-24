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

public class IssueTeamMembers extends ClarizenEntity {
    
        private Case Case;
        private User teamMember;

        public Case getCase() {
            return Case;
        }
        public User getTeamMember() {
            return teamMember;
        }
        public void setCase(Case case1) {
            Case = case1;
        }
        public void setTeamMember(User teamMember) {
            this.teamMember = teamMember;
        }
}
