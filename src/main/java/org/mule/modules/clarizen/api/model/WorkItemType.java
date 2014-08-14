/**
 * Mule Clarizen Cloud Connector
 *
 * (c) 2003-2014 MuleSoft, Inc. The software in this package is published under
 * the terms of the CPAL v1.0 license, a copy of which has been included with this
 * distribution in the LICENSE.md file.
 */

package org.mule.modules.clarizen.api.model;

public enum WorkItemType {

    PROJECT("Project"),

    MILESTONE("Milestone"),
    
    TASK("Task"),
    
    ALL("All");
    
    private final String value;

    WorkItemType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }
}
