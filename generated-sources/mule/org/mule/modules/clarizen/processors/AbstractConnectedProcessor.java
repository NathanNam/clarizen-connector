
package org.mule.modules.clarizen.processors;

import javax.annotation.Generated;

@Generated(value = "Mule DevKit Version 3.4.3", date = "2014-06-04T12:20:43-05:00", comments = "Build 3.4.3.1620.30ea288")
public abstract class AbstractConnectedProcessor
    extends AbstractExpressionEvaluator
{

    protected Object connectionUser;
    protected String _connectionUserType;
    protected Object connectionPassword;
    protected String _connectionPasswordType;
    protected Object applicationId;
    protected String _applicationIdType;
    protected Object partnerId;
    protected String _partnerIdType;

    /**
     * Sets connectionUser
     * 
     * @param value Value to set
     */
    public void setConnectionUser(Object value) {
        this.connectionUser = value;
    }

    /**
     * Retrieves connectionUser
     * 
     */
    public Object getConnectionUser() {
        return this.connectionUser;
    }

    /**
     * Sets connectionPassword
     * 
     * @param value Value to set
     */
    public void setConnectionPassword(Object value) {
        this.connectionPassword = value;
    }

    /**
     * Retrieves connectionPassword
     * 
     */
    public Object getConnectionPassword() {
        return this.connectionPassword;
    }

    /**
     * Sets partnerId
     * 
     * @param value Value to set
     */
    public void setPartnerId(Object value) {
        this.partnerId = value;
    }

    /**
     * Retrieves partnerId
     * 
     */
    public Object getPartnerId() {
        return this.partnerId;
    }

    /**
     * Sets applicationId
     * 
     * @param value Value to set
     */
    public void setApplicationId(Object value) {
        this.applicationId = value;
    }

    /**
     * Retrieves applicationId
     * 
     */
    public Object getApplicationId() {
        return this.applicationId;
    }

}
