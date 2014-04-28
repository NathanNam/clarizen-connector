
package com.clarizen.api.holders;

import javax.annotation.Generated;
import com.clarizen.api.ArrayOfFieldValue;
import com.clarizen.api.Permissions;

@Generated(value = "Mule DevKit Version 3.4.3", date = "2014-04-28T12:59:10-05:00", comments = "Build 3.4.3.1620.30ea288")
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
