
package com.clarizen.api.holders;

import javax.annotation.Generated;
import com.clarizen.api.ArrayOfFieldPermission;
import com.clarizen.api.ArrayOfObjectPermissions;

@Generated(value = "Mule DevKit Version 3.4.3", date = "2014-08-21T04:41:47-05:00", comments = "Build 3.4.3.1620.30ea288")
public class PermissionsExpressionHolder {

    protected Object fieldPermissions;
    protected ArrayOfFieldPermission _fieldPermissionsType;
    protected Object objectPermissions;
    protected ArrayOfObjectPermissions _objectPermissionsType;

    /**
     * Sets fieldPermissions
     * 
     * @param value Value to set
     */
    public void setFieldPermissions(Object value) {
        this.fieldPermissions = value;
    }

    /**
     * Retrieves fieldPermissions
     * 
     */
    public Object getFieldPermissions() {
        return this.fieldPermissions;
    }

    /**
     * Sets objectPermissions
     * 
     * @param value Value to set
     */
    public void setObjectPermissions(Object value) {
        this.objectPermissions = value;
    }

    /**
     * Retrieves objectPermissions
     * 
     */
    public Object getObjectPermissions() {
        return this.objectPermissions;
    }

}
