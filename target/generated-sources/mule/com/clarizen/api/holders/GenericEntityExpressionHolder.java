
package com.clarizen.api.holders;

import javax.annotation.Generated;
import com.clarizen.api.ArrayOfFieldValue;
import com.clarizen.api.Permissions;

@Generated(value = "Mule DevKit Version 3.5.3", date = "2015-11-11T04:25:00-03:00", comments = "Build UNNAMED.2049.ec39f2b")
public class GenericEntityExpressionHolder
    extends BaseEntityExpressionHolder
{

    protected Object permissions;
    protected Permissions _permissionsType;
    protected Object values;
    protected ArrayOfFieldValue _valuesType;

    /**
     * Sets permissions
     * 
     * @param value Value to set
     */
    public void setPermissions(Object value) {
        this.permissions = value;
    }

    /**
     * Retrieves permissions
     * 
     */
    public Object getPermissions() {
        return this.permissions;
    }

    /**
     * Sets values
     * 
     * @param value Value to set
     */
    public void setValues(Object value) {
        this.values = value;
    }

    /**
     * Retrieves values
     * 
     */
    public Object getValues() {
        return this.values;
    }

}
