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
    
        private TaskType taskType;
        private Milestone milestone;
        
        public TaskType getTaskType() {
            return taskType;
        }
        public Milestone getMilestone() {
            return milestone;
        }
        public void setTaskType(TaskType taskType) {
            this.taskType = taskType;
        }
        public void setMilestone(Milestone milestone) {
            this.milestone = milestone;
        }
}
