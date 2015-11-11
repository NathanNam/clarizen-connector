
package com.clarizen.api.holders;

import javax.annotation.Generated;
import com.clarizen.api.EntityId;
import com.clarizen.api.RecipientType;

@Generated(value = "Mule DevKit Version 3.5.3", date = "2015-11-11T04:25:00-03:00", comments = "Build UNNAMED.2049.ec39f2b")
public class RecipientExpressionHolder {

    protected Object eMail;
    protected String _eMailType;
    protected Object recipientType;
    protected RecipientType _recipientTypeType;
    protected Object user;
    protected EntityId _userType;

    /**
     * Sets eMail
     * 
     * @param value Value to set
     */
    public void setEMail(Object value) {
        this.eMail = value;
    }

    /**
     * Retrieves eMail
     * 
     */
    public Object getEMail() {
        return this.eMail;
    }

    /**
     * Sets recipientType
     * 
     * @param value Value to set
     */
    public void setRecipientType(Object value) {
        this.recipientType = value;
    }

    /**
     * Retrieves recipientType
     * 
     */
    public Object getRecipientType() {
        return this.recipientType;
    }

    /**
     * Sets user
     * 
     * @param value Value to set
     */
    public void setUser(Object value) {
        this.user = value;
    }

    /**
     * Retrieves user
     * 
     */
    public Object getUser() {
        return this.user;
    }

}
