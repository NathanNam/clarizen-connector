
package org.mule.modules.clarizen.adapters;

import javax.annotation.Generated;
import org.mule.api.MuleEvent;
import org.mule.api.MuleMessage;
import org.mule.api.devkit.ProcessAdapter;
import org.mule.api.devkit.ProcessTemplate;
import org.mule.api.devkit.ProcessTemplate;
import org.mule.api.processor.MessageProcessor;
import org.mule.api.routing.filter.Filter;
import org.mule.modules.clarizen.ClarizenConnector;
import org.mule.security.oauth.callback.ProcessCallback;


/**
 * A <code>ClarizenConnectorProcessAdapter</code> is a wrapper around {@link ClarizenConnector } that enables custom processing strategies.
 * 
 */
@Generated(value = "Mule DevKit Version 3.5.3", date = "2015-11-11T04:25:00-03:00", comments = "Build UNNAMED.2049.ec39f2b")
public class ClarizenConnectorProcessAdapter
    extends ClarizenConnectorLifecycleAdapter
    implements ProcessAdapter<ClarizenConnectorCapabilitiesAdapter>
{


    public<P >ProcessTemplate<P, ClarizenConnectorCapabilitiesAdapter> getProcessTemplate() {
        final ClarizenConnectorCapabilitiesAdapter object = this;
        return new ProcessTemplate<P,ClarizenConnectorCapabilitiesAdapter>() {


            @Override
            public P execute(ProcessCallback<P, ClarizenConnectorCapabilitiesAdapter> processCallback, MessageProcessor messageProcessor, MuleEvent event)
                throws Exception
            {
                return processCallback.process(object);
            }

            @Override
            public P execute(ProcessCallback<P, ClarizenConnectorCapabilitiesAdapter> processCallback, Filter filter, MuleMessage message)
                throws Exception
            {
                return processCallback.process(object);
            }

        }
        ;
    }

}
