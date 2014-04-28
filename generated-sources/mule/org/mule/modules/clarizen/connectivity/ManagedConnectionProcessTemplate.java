
package org.mule.modules.clarizen.connectivity;

import javax.annotation.Generated;
import org.mule.api.MuleContext;
import org.mule.api.MuleEvent;
import org.mule.api.MuleMessage;
import org.mule.api.processor.MessageProcessor;
import org.mule.api.routing.filter.Filter;
import org.mule.modules.clarizen.adapters.ClarizenConnectorConnectionIdentifierAdapter;
import org.mule.modules.clarizen.connection.ConnectionManager;
import org.mule.modules.clarizen.process.ManagedConnectionProcessInterceptor;
import org.mule.modules.clarizen.process.ProcessCallback;
import org.mule.modules.clarizen.process.ProcessCallbackProcessInterceptor;
import org.mule.modules.clarizen.process.ProcessInterceptor;
import org.mule.modules.clarizen.process.ProcessTemplate;
import org.mule.modules.clarizen.process.RetryProcessInterceptor;

@Generated(value = "Mule DevKit Version 3.4.0", date = "2014-04-10T01:27:59-05:00", comments = "Build 3.4.0.1555.8df15c1")
public class ManagedConnectionProcessTemplate<P >implements ProcessTemplate<P, ClarizenConnectorConnectionIdentifierAdapter>
{

    private final ProcessInterceptor<P, ClarizenConnectorConnectionIdentifierAdapter> processInterceptor;

    public ManagedConnectionProcessTemplate(ConnectionManager<ClarizenConnectorConnectionKey, ClarizenConnectorConnectionIdentifierAdapter> connectionManager, MuleContext muleContext) {
        ProcessInterceptor<P, ClarizenConnectorConnectionIdentifierAdapter> processCallbackProcessInterceptor = new ProcessCallbackProcessInterceptor<P, ClarizenConnectorConnectionIdentifierAdapter>();
        ProcessInterceptor<P, ClarizenConnectorConnectionIdentifierAdapter> managedConnectionProcessInterceptor = new ManagedConnectionProcessInterceptor<P>(processCallbackProcessInterceptor, connectionManager, muleContext);
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
