
package org.mule.modules.clarizen.connectivity;

import javax.annotation.Generated;
import org.apache.commons.pool.impl.GenericKeyedObjectPool;
import org.mule.api.ConnectionException;
import org.mule.api.ConnectionExceptionCode;
import org.mule.api.MuleContext;
import org.mule.api.config.MuleProperties;
import org.mule.api.construct.FlowConstruct;
import org.mule.api.context.MuleContextAware;
import org.mule.api.lifecycle.Disposable;
import org.mule.api.lifecycle.Initialisable;
import org.mule.api.retry.RetryPolicyTemplate;
import org.mule.common.DefaultResult;
import org.mule.common.DefaultTestResult;
import org.mule.common.FailureType;
import org.mule.common.TestResult;
import org.mule.common.Testable;
import org.mule.config.PoolingProfile;
import org.mule.modules.clarizen.ClarizenConnector;
import org.mule.modules.clarizen.adapters.ClarizenConnectorConnectionIdentifierAdapter;
import org.mule.modules.clarizen.basic.Capabilities;
import org.mule.modules.clarizen.basic.Capability;
import org.mule.modules.clarizen.basic.MetadataAware;
import org.mule.modules.clarizen.connection.ConnectionManager;
import org.mule.modules.clarizen.process.ProcessAdapter;
import org.mule.modules.clarizen.process.ProcessTemplate;


/**
 * A {@code ClarizenConnectorConnectionManager} is a wrapper around {@link ClarizenConnector } that adds connection management capabilities to the pojo.
 * 
 */
@Generated(value = "Mule DevKit Version 3.4.3", date = "2014-08-21T04:41:47-05:00", comments = "Build 3.4.3.1620.30ea288")
public class ClarizenConnectorConnectionManager implements MuleContextAware, Disposable, Initialisable, Testable, Capabilities, MetadataAware, ConnectionManager<ClarizenConnectorConnectionKey, ClarizenConnectorConnectionIdentifierAdapter> , ProcessAdapter<ClarizenConnectorConnectionIdentifierAdapter>
{

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
    /**
     * Mule Context
     * 
     */
    protected MuleContext muleContext;
    /**
     * Flow Construct
     * 
     */
    protected FlowConstruct flowConstruct;
    /**
     * Connector Pool
     * 
     */
    private GenericKeyedObjectPool connectionPool;
    protected PoolingProfile connectionPoolingProfile;
    protected RetryPolicyTemplate retryPolicyTemplate;
    private final static String MODULE_NAME = "Clarizen";
    private final static String MODULE_VERSION = "2.0.10-SNAPSHOT";
    private final static String DEVKIT_VERSION = "3.4.3";
    private final static String DEVKIT_BUILD = "3.4.3.1620.30ea288";

    /**
     * Sets muleContext
     * 
     * @param value Value to set
     */
    public void setMuleContext(MuleContext value) {
        this.muleContext = value;
    }

    /**
     * Retrieves muleContext
     * 
     */
    public MuleContext getMuleContext() {
        return this.muleContext;
    }

    /**
     * Sets flowConstruct
     * 
     * @param value Value to set
     */
    public void setFlowConstruct(FlowConstruct value) {
        this.flowConstruct = value;
    }

    /**
     * Retrieves flowConstruct
     * 
     */
    public FlowConstruct getFlowConstruct() {
        return this.flowConstruct;
    }

    /**
     * Sets connectionPoolingProfile
     * 
     * @param value Value to set
     */
    public void setConnectionPoolingProfile(PoolingProfile value) {
        this.connectionPoolingProfile = value;
    }

    /**
     * Retrieves connectionPoolingProfile
     * 
     */
    public PoolingProfile getConnectionPoolingProfile() {
        return this.connectionPoolingProfile;
    }

    /**
     * Sets retryPolicyTemplate
     * 
     * @param value Value to set
     */
    public void setRetryPolicyTemplate(RetryPolicyTemplate value) {
        this.retryPolicyTemplate = value;
    }

    /**
     * Retrieves retryPolicyTemplate
     * 
     */
    public RetryPolicyTemplate getRetryPolicyTemplate() {
        return this.retryPolicyTemplate;
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

    public void initialise() {
        GenericKeyedObjectPool.Config config = new GenericKeyedObjectPool.Config();
        if (connectionPoolingProfile!= null) {
            config.maxIdle = connectionPoolingProfile.getMaxIdle();
            config.maxActive = connectionPoolingProfile.getMaxActive();
            config.maxWait = connectionPoolingProfile.getMaxWait();
            config.whenExhaustedAction = ((byte) connectionPoolingProfile.getExhaustedAction());
            config.timeBetweenEvictionRunsMillis = connectionPoolingProfile.getEvictionCheckIntervalMillis();
            config.minEvictableIdleTimeMillis = connectionPoolingProfile.getMinEvictionMillis();
        }
        connectionPool = new GenericKeyedObjectPool(new ClarizenConnectorConnectionFactory(this), config);
        if (retryPolicyTemplate == null) {
            retryPolicyTemplate = muleContext.getRegistry().lookupObject(MuleProperties.OBJECT_DEFAULT_RETRY_POLICY_TEMPLATE);
        }
    }

    @Override
    public void dispose() {
        try {
            connectionPool.close();
        } catch (Exception e) {
        }
    }

    public ClarizenConnectorConnectionIdentifierAdapter acquireConnection(ClarizenConnectorConnectionKey key)
        throws Exception
    {
        return ((ClarizenConnectorConnectionIdentifierAdapter) connectionPool.borrowObject(key));
    }

    public void releaseConnection(ClarizenConnectorConnectionKey key, ClarizenConnectorConnectionIdentifierAdapter connection)
        throws Exception
    {
        connectionPool.returnObject(key, connection);
    }

    public void destroyConnection(ClarizenConnectorConnectionKey key, ClarizenConnectorConnectionIdentifierAdapter connection)
        throws Exception
    {
        connectionPool.invalidateObject(key, connection);
    }

    /**
     * Returns true if this module implements such capability
     * 
     */
    public boolean isCapableOf(Capability capability) {
        if (capability == Capability.LIFECYCLE_CAPABLE) {
            return true;
        }
        if (capability == Capability.CONNECTION_MANAGEMENT_CAPABLE) {
            return true;
        }
        return false;
    }

    @Override
    public<P >ProcessTemplate<P, ClarizenConnectorConnectionIdentifierAdapter> getProcessTemplate() {
        return new ClarizenConnectorManagedConnectionProcessTemplate(this, muleContext);
    }

    public ClarizenConnectorConnectionKey getDefaultConnectionKey() {
        return new ClarizenConnectorConnectionKey(getConnectionUser(), getConnectionPassword(), getApplicationId(), getPartnerId());
    }

    public String getModuleName() {
        return MODULE_NAME;
    }

    public String getModuleVersion() {
        return MODULE_VERSION;
    }

    public String getDevkitVersion() {
        return DEVKIT_VERSION;
    }

    public String getDevkitBuild() {
        return DEVKIT_BUILD;
    }

    public TestResult test() {
        ClarizenConnectorConnectionIdentifierAdapter connection = null;
        DefaultTestResult result;
        ClarizenConnectorConnectionKey key = getDefaultConnectionKey();
        try {
            connection = acquireConnection(key);
            result = new DefaultTestResult(org.mule.common.Result.Status.SUCCESS);
        } catch (Exception e) {
            try {
                destroyConnection(key, connection);
            } catch (Exception ie) {
            }
            result = ((DefaultTestResult) buildFailureTestResult(e));
        } finally {
            if (connection!= null) {
                try {
                    releaseConnection(key, connection);
                } catch (Exception ie) {
                }
            }
        }
        return result;
    }

    public DefaultResult buildFailureTestResult(Exception exception) {
        DefaultTestResult result;
        if (exception instanceof ConnectionException) {
            ConnectionExceptionCode code = ((ConnectionException) exception).getCode();
            if (code == ConnectionExceptionCode.UNKNOWN_HOST) {
                result = new DefaultTestResult(org.mule.common.Result.Status.FAILURE, exception.getMessage(), FailureType.UNKNOWN_HOST, exception);
            } else {
                if (code == ConnectionExceptionCode.CANNOT_REACH) {
                    result = new DefaultTestResult(org.mule.common.Result.Status.FAILURE, exception.getMessage(), FailureType.RESOURCE_UNAVAILABLE, exception);
                } else {
                    if (code == ConnectionExceptionCode.INCORRECT_CREDENTIALS) {
                        result = new DefaultTestResult(org.mule.common.Result.Status.FAILURE, exception.getMessage(), FailureType.INVALID_CREDENTIALS, exception);
                    } else {
                        if (code == ConnectionExceptionCode.CREDENTIALS_EXPIRED) {
                            result = new DefaultTestResult(org.mule.common.Result.Status.FAILURE, exception.getMessage(), FailureType.INVALID_CREDENTIALS, exception);
                        } else {
                            if (code == ConnectionExceptionCode.UNKNOWN) {
                                result = new DefaultTestResult(org.mule.common.Result.Status.FAILURE, exception.getMessage(), FailureType.UNSPECIFIED, exception);
                            } else {
                                result = new DefaultTestResult(org.mule.common.Result.Status.FAILURE, exception.getMessage(), FailureType.UNSPECIFIED, exception);
                            }
                        }
                    }
                }
            }
        } else {
            result = new DefaultTestResult(org.mule.common.Result.Status.FAILURE, exception.getMessage(), FailureType.UNSPECIFIED, exception);
        }
        return result;
    }

}
