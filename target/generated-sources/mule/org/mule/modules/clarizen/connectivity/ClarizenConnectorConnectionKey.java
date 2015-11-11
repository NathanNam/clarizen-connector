
package org.mule.modules.clarizen.connectivity;

import javax.annotation.Generated;


/**
 * A tuple of connection parameters
 * 
 */
@Generated(value = "Mule DevKit Version 3.5.3", date = "2015-11-11T04:25:00-03:00", comments = "Build UNNAMED.2049.ec39f2b")
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

    @Override
    public int hashCode() {
        int result = ((this.connectionUser!= null)?this.connectionUser.hashCode(): 0);
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ClarizenConnectorConnectionKey)) {
            return false;
        }
        ClarizenConnectorConnectionKey that = ((ClarizenConnectorConnectionKey) o);
        if (((this.connectionUser!= null)?(!this.connectionUser.equals(that.connectionUser)):(that.connectionUser!= null))) {
            return false;
        }
        return true;
    }

}
