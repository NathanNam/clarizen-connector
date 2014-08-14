/**
 * Mule Clarizen Cloud Connector
 *
 * (c) 2003-2014 MuleSoft, Inc. The software in this package is published under
 * the terms of the CPAL v1.0 license, a copy of which has been included with this
 * distribution in the LICENSE.md file.
 */

package org.mule.modules.clarizen.api.model;

/**
 * Mule Clarizen Cloud Connector
 *
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */

public enum Operator {

    EQUAL("Equal"),
    NOT_EQUAL("NotEqual"),
    LESS_THAN("LessThan"),
    GREATER_THAN("GreaterThan"),
    LESS_THAN_OR_EQUAL("LessThanOrEqual"),
    GREATER_THAN_OR_EQUAL("GreaterThanOrEqual"),
    BEGINS_WITH("BeginsWith"),
    ENDS_WITH("EndsWith"),
    CONTAINS("Contains"),
    DOES_NOT_CONTAIN("DoesNotContain"),
    IN("In");
    
    private final String value;

    Operator(String v) {
        value = v;
    }

    public String value() {
        return value;
    }
}