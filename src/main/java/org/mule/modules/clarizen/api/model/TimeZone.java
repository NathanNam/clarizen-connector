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

public class TimeZone extends ClarizenEntity {

    private Integer offset;
    private String description;
    
    public Integer getOffset() {
        return this.offset;
    }
    public String getDescription() {
        return this.description;
    }
    public void setOffset(Integer offset) {
        this.offset = offset;
    }
    public void setDescription(String description) {
        this.description = description;
    }
}
