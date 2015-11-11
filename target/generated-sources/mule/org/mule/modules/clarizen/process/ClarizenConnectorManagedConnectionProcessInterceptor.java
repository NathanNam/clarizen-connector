
package org.mule.modules.clarizen.process;

import java.util.List;
import javax.annotation.Generated;
import org.mule.api.MuleContext;
import org.mule.api.MuleEvent;
import org.mule.api.MuleMessage;
import org.mule.api.devkit.ProcessInterceptor;
import org.mule.api.processor.MessageProcessor;
import org.mule.api.routing.filter.Filter;
import org.mule.devkit.processor.ExpressionEvaluatorSupport;
import org.mule.modules.clarizen.adapters.ClarizenConnectorConnectionIdentifierAdapter;
import org.mule.modules.clarizen.connection.ConnectionManager;
import org.mule.modules.clarizen.connection.UnableToAcquireConnectionException;
import org.mule.modules.clarizen.connection.UnableToReleaseConnectionException;
import org.mule.modules.clarizen.connectivity.ClarizenConnectorConnectionKey;
import org.mule.modules.clarizen.processors.ConnectivityProcessor;
import org.mule.security.oauth.callback.ProcessCallback;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Generated(value = "Mule DevKit Version 3.5.3", date = "2015-11-11T04:25:00-03:00", comments = "Build UNNAMED.2049.ec39f2b")
public class ClarizenConnectorManagedConnectionProcessInterceptor<T >
    extends ExpressionEvaluatorSupport
    implements ProcessInterceptor<T, ClarizenConnectorConnectionIdentifierAdapter>
{

    private static Logger logger = LoggerFactory.getLogger(ClarizenConnectorManagedConnectionProcessInterceptor.class);
    private final ConnectionManager<ClarizenConnectorConnectionKey, ClarizenConnectorConnectionIdentifierAdapter> connectionManager;
    private final MuleContext muleContext;
    private final ProcessInterceptor<T, ClarizenConnectorConnectionIdentifierAdapter> next;

    public ClarizenConnectorManagedConnectionProcessInterceptor(ProcessInterceptor<T, ClarizenConnectorConnectionIdentifierAdapter> next, ConnectionManager<ClarizenConnectorConnectionKey, ClarizenConnectorConnectionIdentifierAdapter> connectionManager, MuleContext muleContext) {
        this.next = next;
        this.connectionManager = connectionManager;
        this.muleContext = muleContext;
    }

    @Override
    public T execute(ProcessCallback<T, ClarizenConnectorConnectionIdentifierAdapter> processCallback, ClarizenConnectorConnectionIdentifierAdapter object, MessageProcessor messageProcessor, MuleEvent event)
        throws Exception
    {
        ClarizenConnectorConnectionIdentifierAdapter connection = null;
        ClarizenConnectorConnectionKey key = null;
        if (hasConnectionKeysOverride(messageProcessor)) {
            ConnectivityProcessor connectivityProcessor = ((ConnectivityProcessor) messageProcessor);
            final String _transformedConnectionUser = ((String) evaluateAndTransform(muleContext, event, connectivityProcessor.typeFor("_connectionUserType"), null, connectivityProcessor.getConnectionUser()));
            if (_transformedConnectionUser == null) {
                throw new UnableToAcquireConnectionException("Parameter connectionUser in method connect can't be null because is not @Optional");
            }
            final String _transformedConnectionPassword = ((String) evaluateAndTransform(muleContext, event, connectivityProcessor.typeFor("_connectionPasswordType"), null, connectivityProcessor.getConnectionPassword()));
            if (_transformedConnectionPassword == null) {
                throw new UnableToAcquireConnectionException("Parameter connectionPassword in method connect can't be null because is not @Optional");
            }
            final String _transformedApplicationId = ((String) evaluateAndTransform(muleContext, event, connectivityProcessor.typeFor("_applicationIdType"), null, connectivityProcessor.getApplicationId()));
            final String _transformedPartnerId = ((String) evaluateAndTransform(muleContext, event, connectivityProcessor.typeFor("_partnerIdType"), null, connectivityProcessor.getPartnerId()));
            key = new ClarizenConnectorConnectionKey(_transformedConnectionUser, _transformedConnectionPassword, _transformedApplicationId, _transformedPartnerId);
        } else {
            key = connectionManager.getEvaluatedConnectionKey(event);
        }
        try {
            if (logger.isDebugEnabled()) {
                logger.debug(("Attempting to acquire connection using "+ key.toString()));
            }
            connection = connectionManager.acquireConnection(key);
            if (connection == null) {
                throw new UnableToAcquireConnectionException();
            } else {
                if (logger.isDebugEnabled()) {
                    logger.debug((("Connection has been acquired with [id="+ connection.getConnectionIdentifier())+"]"));
                }
            }
            return next.execute(processCallback, connection, messageProcessor, event);
        } catch (Exception e) {
            if (processCallback.getManagedExceptions()!= null) {
                for (Class exceptionClass: ((List<Class<? extends Exception>> ) processCallback.getManagedExceptions())) {
                    if (exceptionClass.isInstance(e)) {
                        if (logger.isDebugEnabled()) {
                            logger.debug((((("An exception ( "+ exceptionClass.getName())+") has been thrown. Destroying the connection with [id=")+ connection.getConnectionIdentifier())+"]"));
                        }
                        try {
                            if (connection!= null) {
                                connectionManager.destroyConnection(key, connection);
                                connection = null;
                            }
                        } catch (Exception innerException) {
                            logger.error(innerException.getMessage(), innerException);
                        }
                    }
                }
            }
            throw e;
        } finally {
            try {
                if (connection!= null) {
                    if (logger.isDebugEnabled()) {
                        logger.debug((("Releasing the connection back into the pool [id="+ connection.getConnectionIdentifier())+"]"));
                    }
                    connectionManager.releaseConnection(key, connection);
                }
            } catch (Exception e) {
                throw new UnableToReleaseConnectionException(e);
            }
        }
    }

    /**
     * Validates that the current message processor has changed any of its connection parameters at processor level. If so, a new ClarizenConnectorConnectionKey must be generated
     * 
     * @param messageProcessor
     *     the message processor to test against the keys
     * @return
     *     true if any of the parameters in @Connect method annotated with @ConnectionKey was override in the XML, false otherwise  
     */
    private Boolean hasConnectionKeysOverride(MessageProcessor messageProcessor) {
        if ((messageProcessor == null)||(!(messageProcessor instanceof ConnectivityProcessor))) {
            return false;
        }
        ConnectivityProcessor connectivityProcessor = ((ConnectivityProcessor) messageProcessor);
        if (connectivityProcessor.getConnectionUser()!= null) {
            return true;
        }
        return false;
    }

    public T execute(ProcessCallback<T, ClarizenConnectorConnectionIdentifierAdapter> processCallback, ClarizenConnectorConnectionIdentifierAdapter object, Filter filter, MuleMessage message)
        throws Exception
    {
        throw new UnsupportedOperationException();
    }

}
