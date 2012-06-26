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

import com.clarizen.api.BaseEntity;

/**
 * Wrapper class for Clarizen API List<BaseEntity>
 * Commonly used by getting query results.
 * 
 * @author MuleSoft, Inc.
 *
 */
public class ArrayOfEntity {

    private List<BaseEntity> entityList;

    public ArrayOfEntity() {
        
    }
    
    public ArrayOfEntity(List<BaseEntity> entities) {
        setEntityList(entities);
    }
    
    public List<BaseEntity> getEntityList() {
        return entityList;
    }

    public void setEntityList(List<BaseEntity> entityList) {
        this.entityList = entityList;
    }
}
