/**
 * Mule Clarizen Cloud Connector
 *
 * (c) 2003-2014 MuleSoft, Inc. The software in this package is published under
 * the terms of the CPAL v1.0 license, a copy of which has been included with this
 * distribution in the LICENSE.md file.
 */

package org.mule.modules.clarizen.api.model.flat;

import java.util.List;

import com.clarizen.api.FieldValue;

public class ClarizenEntityCustomFieldsFlat extends ClarizenEntityFlat {

    private List<FieldValue> customFields;

    public List<FieldValue> getCustomFields() {
        return customFields;
    }

    public void setCustomFields(List<FieldValue> customFields) {
        this.customFields = customFields;
    }

}
