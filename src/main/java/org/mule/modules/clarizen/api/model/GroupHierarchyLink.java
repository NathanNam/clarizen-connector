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

import com.clarizen.api.EntityId;

public class GroupHierarchyLink extends ClarizenEntity {
    
    private EntityId container;
    private EntityId member;

    public EntityId getContainer() {
        return container;
    }
    public EntityId getMember() {
        return member;
    }
    public void setContainer(EntityId container) {
        this.container = container;
    }
    public void setMember(EntityId member) {
        this.member = member;
    }

}
