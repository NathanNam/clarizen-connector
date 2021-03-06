/**
 * Mule Clarizen Cloud Connector
 *
 * (c) 2003-2014 MuleSoft, Inc. The software in this package is published under
 * the terms of the CPAL v1.0 license, a copy of which has been included with this
 * distribution in the LICENSE.md file.
 */

package org.mule.modules.clarizen.api.model.flat;

import com.clarizen.api.EntityId;

public class IssueTeamMembersFlat extends ClarizenEntityCustomFieldsFlat {
    
        private EntityId Case;
        private EntityId teamMember;

        public EntityId getCase() {
            return Case;
        }
        public EntityId getTeamMember() {
            return teamMember;
        }
        public void setCase(EntityId case1) {
            Case = case1;
        }
        public void setTeamMember(EntityId teamMember) {
            this.teamMember = teamMember;
        }

        
}
