
package org.mule.modules.clarizen.connectivity;

import javax.annotation.Generated;


/**
 * A tuple of connection parameters
 * 
 */
@Generated(value = "Mule DevKit Version 3.4.3", date = "2014-04-28T12:59:10-05:00", comments = "Build 3.4.3.1620.30ea288")
public class ClarizenConnectorConnectionKey {

    /**
     * 
     */
    private String connectionUser;
    /**
     * 
     */
    private String connectionPassword;
    /**
     * 
     */
    private String applicationId;
    /**
     * 
     */
    private String partnerId;

    public ClarizenConnectorConnectionKey(String connectionUser, String connectionPassword, String applicationId, String partnerId) {
        this.connectionUser = connectionUser;
        this.connectionPassword = connectionPassword;
        this.applicationId = applicationId;
        this.partnerId = partnerId;
    }

    /**
     * Sets connectionUser
     * 
     * @param value Value to set
     */
    public void setConnectionUser(String value) {
        this.connectionUser = value;
    }

    /**
     * Retrieves connectionUser
     * 
     */
    public String getConnectionUser() {
        return this.connectionUser;
    }

    /**
     * Sets connectionPassword
     * 
     * @param value Value to set
     */
    public void setConnectionPassword(String value) {
        this.connectionPassword = value;
    }

    /**
     * Retrieves connectionPassword
     * 
     */
    public String getConnectionPassword() {
        return this.connectionPassword;
    }

    /**
     * Sets partnerId
     * 
     * @param value Value to set
     */
    public void setPartnerId(String value) {
        this.partnerId = value;
    }

    /**
     * Retrieves partnerId
     * 
     */
    public String getPartnerId() {
        return this.partnerId;
    }

    /**
     * Sets applicationId
     * 
     * @param value Value to set
     */
    public void setApplicationId(String value) {
        this.applicationId = value;
    }

    /**
     * Retrieves applicationId
     * 
     */
    public String getApplicationId() {
        return this.applicationId;
    }

    public int hashCode() {
        int hash = 1;
        hash = (hash* 31);
        if (this.connectionUser!= null) {
            hash += this.connectionUser.hashCode();
        }
        return hash;
    }

    public boolean equals(Object obj) {
        return (((obj instanceof ClarizenConnectorConnectionKey)&&(this.connectionUser!= null))&&this.connectionUser.equals(((ClarizenConnectorConnectionKey) obj).connectionUser));
    }

}
