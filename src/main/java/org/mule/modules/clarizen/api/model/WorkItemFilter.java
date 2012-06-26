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

public enum WorkItemFilter {

    I_HAVE_ANY_ROLE("IHaveAnyRole"),
    
    I_MANAGE_THE_PROJECT("IManageTheProject"),
    
    I_AM_A_MANAGER("IAmAManager"),
    
    I_AM_A_RESOURCE("IAmAResource"),
    
    I_AM_A_REVIEWER("IAmAReviewer"),
    
    I_AM_A_MANAGER_OR_A_RESOURCE("IAmAManagerOrAResource"),
    
    ALL("All");
    
    private final String value;

    WorkItemFilter(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

}