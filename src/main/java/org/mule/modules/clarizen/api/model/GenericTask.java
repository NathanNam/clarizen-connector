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

public class GenericTask extends WorkItem {
    
        private org.mule.modules.clarizen.api.model.flat.TaskTypeFlat taskType;
        private org.mule.modules.clarizen.api.model.flat.MilestoneFlat milestone;

        public org.mule.modules.clarizen.api.model.flat.TaskTypeFlat getTaskType() {
            return taskType;
        }
        public org.mule.modules.clarizen.api.model.flat.MilestoneFlat getMilestone() {
            return milestone;
        }
        public void setTaskType(
                org.mule.modules.clarizen.api.model.flat.TaskTypeFlat taskType) {
            this.taskType = taskType;
        }
        public void setMilestone(
                org.mule.modules.clarizen.api.model.flat.MilestoneFlat milestone) {
            this.milestone = milestone;
        }        
}
