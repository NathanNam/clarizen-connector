/**
 * Mule Clarizen Cloud Connector
 *
 * (c) 2003-2014 MuleSoft, Inc. The software in this package is published under
 * the terms of the CPAL v1.0 license, a copy of which has been included with this
 * distribution in the LICENSE.md file.
 */

package org.mule.modules.clarizen.api.model.flat;

import com.clarizen.api.EntityId;

public class GroupHierarchyLinkFlat extends ClarizenEntityCustomFieldsFlat {
    
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
