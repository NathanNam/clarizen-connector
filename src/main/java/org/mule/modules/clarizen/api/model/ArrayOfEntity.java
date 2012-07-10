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

import java.util.List;

import com.clarizen.api.GenericEntity;

/**
 * Wrapper class for Clarizen API. 
 * Commonly used by getting query results.
 * 
 * @author MuleSoft, Inc.
 *
 */
public class ArrayOfEntity {

    private List<GenericEntity> entityList;

    public ArrayOfEntity() {
        
    }
    
    public ArrayOfEntity(List<GenericEntity> entities) {
        setEntityList(entities);
    }
    
    public List<GenericEntity> getEntityList() {
        return entityList;
    }

    public void setEntityList(List<GenericEntity> entityList) {
        this.entityList = entityList;
    }
}
