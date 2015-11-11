
package org.mule.modules.clarizen.connectivity;

import javax.annotation.Generated;
import org.mule.api.MuleContext;
import org.mule.api.MuleEvent;
import org.mule.api.MuleMessage;
import org.mule.api.devkit.ProcessInterceptor;
import org.mule.api.devkit.ProcessTemplate;
import org.mule.api.processor.MessageProcessor;
import org.mule.api.routing.filter.Filter;
import org.mule.modules.clarizen.adapters.ClarizenConnectorConnectionIdentifierAdapter;
import org.mule.modules.clarizen.connection.ConnectionManager;
import org.mule.modules.clarizen.process.ClarizenConnectorManagedConnectionProcessInterceptor;
import org.mule.security.oauth.callback.ProcessCallback;
import org.mule.security.oauth.process.ProcessCallbackProcessInterceptor;
import org.mule.security.oauth.process.RetryProcessInterceptor;

@Generated(value = "Mule DevKit Version 3.5.3", date = "2015-11-11T04:25:00-03:00", comments = "Build UNNAMED.2049.ec39f2b")
public class ClarizenConnectorManagedConnectionProcessTemplate<P >implements ProcessTemplate<P, ClarizenConnectorConnectionIdentifierAdapter>
{

    private final ProcessInterceptor<P, ClarizenConnectorConnectionIdentifierAdapter> processInterceptor;

    public ClarizenConnectorManagedConnectionProcessTemplate(ConnectionManager<ClarizenConnectorConnectionKey, ClarizenConnectorConnectionIdentifierAdapter> connectionManager, MuleContext muleContext) {
        ProcessInterceptor<P, ClarizenConnectorConnectionIdentifierAdapter> processCallbackProcessInterceptor = new ProcessCallbackProcessInterceptor<P, ClarizenConnectorConnectionIdentifierAdapter>();
        ProcessInterceptor<P, ClarizenConnectorConnectionIdentifierAdapter> managedConnectionProcessInterceptor = new ClarizenConnectorManagedConnectionProcessInterceptor<P>(processCallbackProcessInterceptor, connectionManager, muleContext);
        ProcessInterceptor<P, ClarizenConnectorConnectionIdentifierAdapter> retryProcessInterceptor = new RetryProcessInterceptor<P, ClarizenConnectorConnectionIdentifierAdapter>(managedConnectionProcessInterceptor, muleContext, connectionManager.getRetryPolicyTemplate());
        processInterceptor = retryProcessInterceptor;
    }

    public P execute(ProcessCallback<P, ClarizenConnectorConnectionIdentifierAdapter> processCallback, MessageProcessor messageProcessor, MuleEvent event)
        throws Exception
    {
        return processInterceptor.execute(processCallback, null, messageProcessor, event);
    }

    public P execute(ProcessCallback<P, ClarizenConnectorConnectionIdentifierAdapter> processCallback, Filter filter, MuleMessage message)
        throws Exception
    {
        return processInterceptor.execute(processCallback, null, filter, message);
    }

}
