/**
 * Mule Clarizen Cloud Connector
 *
 * (c) 2003-2014 MuleSoft, Inc. The software in this package is published under
 * the terms of the CPAL v1.0 license, a copy of which has been included with this
 * distribution in the LICENSE.md file.
 */

package org.mule.modules.clarizen.api.model;

public class Milestone extends WorkItem {
    
    private org.mule.modules.clarizen.api.model.flat.MilestoneTypeFlat milestoneType;

    public org.mule.modules.clarizen.api.model.flat.MilestoneTypeFlat getMilestoneType() {
        return milestoneType;
    }

    public void setMilestoneType(
            org.mule.modules.clarizen.api.model.flat.MilestoneTypeFlat milestoneType) {
        this.milestoneType = milestoneType;
    }

}
