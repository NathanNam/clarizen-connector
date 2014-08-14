/**
 * Mule Clarizen Cloud Connector
 *
 * (c) 2003-2014 MuleSoft, Inc. The software in this package is published under
 * the terms of the CPAL v1.0 license, a copy of which has been included with this
 * distribution in the LICENSE.md file.
 */

package org.mule.modules.clarizen.api.model;

public class JobTitleLink extends ClarizenEntity {
    
    private org.mule.modules.clarizen.api.model.flat.JobTitleFlat container;
    private org.mule.modules.clarizen.api.model.flat.UserFlat member;

    public org.mule.modules.clarizen.api.model.flat.JobTitleFlat getContainer() {
        return container;
    }
    public org.mule.modules.clarizen.api.model.flat.UserFlat getMember() {
        return member;
    }
    public void setContainer(
            org.mule.modules.clarizen.api.model.flat.JobTitleFlat container) {
        this.container = container;
    }
    public void setMember(org.mule.modules.clarizen.api.model.flat.UserFlat member) {
        this.member = member;
    }
}
