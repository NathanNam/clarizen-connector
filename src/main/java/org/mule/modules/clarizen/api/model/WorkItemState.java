/**
 * Mule Clarizen Cloud Connector
 *
 * (c) 2003-2014 MuleSoft, Inc. The software in this package is published under
 * the terms of the CPAL v1.0 license, a copy of which has been included with this
 * distribution in the LICENSE.md file.
 */

package org.mule.modules.clarizen.api.model;

public enum WorkItemState {

    ALL("All"),

    ACTIVE("Active"),

    CANCELLED("Cancelled"),

    DRAFT("Draft"),

    COMPLETED("Completed"),

    ON_HOLD("OnHold"),

    CURRENT("Current"),

    UPCOMING("Upcoming"),

    IN_THE_WORKS("InTheWorks"),

    EXECUTABLE("Executable");

    private final String value;

    WorkItemState(String v) {
        value = v;
    }

    public String value() {
        return value;
    }
}
