
package com.clarizen.api.holders;

import javax.annotation.Generated;
import com.clarizen.api.ArrayOfFieldPermission;
import com.clarizen.api.ArrayOfObjectPermissions;

@Generated(value = "Mule DevKit Version 3.5.3", date = "2015-11-11T04:25:00-03:00", comments = "Build UNNAMED.2049.ec39f2b")
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
