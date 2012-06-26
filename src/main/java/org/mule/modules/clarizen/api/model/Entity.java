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

import com.clarizen.api.GenericEntity;

/**
 * Wrapper class for Clarizen API GenericEntity * 
 * 
 * @author MuleSoft, Inc.
 *
 */
public class Entity {

    private GenericEntity genericEntity;
    
    public Entity() {
        
    }
    
    public Entity (GenericEntity genericEntity) {
        setGenericEntity(genericEntity);
    }

    public GenericEntity getGenericEntity() {
        return genericEntity;
    }

    public void setGenericEntity(GenericEntity genericEntity) {
        this.genericEntity = genericEntity;
    }
}
