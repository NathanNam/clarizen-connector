
package org.mule.modules.clarizen.processors;

import java.lang.reflect.Type;
import javax.annotation.Generated;
import org.mule.devkit.processor.DevkitBasedMessageProcessor;

@Generated(value = "Mule DevKit Version 3.5.3", date = "2015-11-11T04:25:00-03:00", comments = "Build UNNAMED.2049.ec39f2b")
public abstract class AbstractConnectedProcessor
    extends DevkitBasedMessageProcessor
    implements ConnectivityProcessor
{

    protected Object connectionUser;
    protected String _connectionUserType;
    protected Object connectionPassword;
    protected String _connectionPasswordType;
    protected Object applicationId;
    protected String _applicationIdType;
    protected Object partnerId;
    protected String _partnerIdType;

    public AbstractConnectedProcessor(String operationName) {
        super(operationName);
    }

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
    @Override
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
    @Override
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
    @Override
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
    @Override
    public Object getApplicationId() {
        return this.applicationId;
    }

    /**
     * {@inheritDoc}
     * 
     */
    @Override
    public Type typeFor(String fieldName)
        throws NoSuchFieldException
    {
        return AbstractConnectedProcessor.class.getDeclaredField(fieldName).getGenericType();
    }

}
