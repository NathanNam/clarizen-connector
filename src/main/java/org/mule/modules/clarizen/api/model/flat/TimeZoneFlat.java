/**
 * Mule Clarizen Cloud Connector
 *
 * (c) 2003-2014 MuleSoft, Inc. The software in this package is published under
 * the terms of the CPAL v1.0 license, a copy of which has been included with this
 * distribution in the LICENSE.md file.
 */

package org.mule.modules.clarizen.api.model.flat;

public class TimeZoneFlat extends ClarizenEntityCustomFieldsFlat {

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
