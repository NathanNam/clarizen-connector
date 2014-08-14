
package org.mule.modules.clarizen.api.model.holders;

import javax.annotation.Generated;
import com.clarizen.api.EntityId;

@Generated(value = "Mule DevKit Version 3.4.3", date = "2014-08-14T11:23:00-05:00", comments = "Build 3.4.3.1620.30ea288")
public class BaseClarizenEntityExpressionHolder {

    protected Object id;
    protected EntityId _idType;
    protected Object name;
    protected String _nameType;
    protected Object entityType;
    protected EntityId _entityTypeType;

    /**
     * Sets id
     * 
     * @param value Value to set
     */
    public void setId(Object value) {
        this.id = value;
    }

    /**
     * Retrieves id
     * 
     */
    public Object getId() {
        return this.id;
    }

    /**
     * Sets name
     * 
     * @param value Value to set
     */
    public void setName(Object value) {
        this.name = value;
    }

    /**
     * Retrieves name
     * 
     */
    public Object getName() {
        return this.name;
    }

    /**
     * Sets entityType
     * 
     * @param value Value to set
     */
    public void setEntityType(Object value) {
        this.entityType = value;
    }

    /**
     * Retrieves entityType
     * 
     */
    public Object getEntityType() {
        return this.entityType;
    }

}
