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

import com.clarizen.api.queries.Condition;

/**
 * Wrapper class for Clarizen API Queries conditions
 * 
 * @author MuleSoft, Inc.
 *
 */
public class QueryCondition {

    private Condition condition;
    
    public QueryCondition(Condition condition) {
        this.setCondition(condition);
    }

    public Condition getCondition() {
        return condition;
    }

    public void setCondition(Condition condition) {
        this.condition = condition;
    }
}
