
package org.mule.modules.clarizen.adapters;

import javax.annotation.Generated;
import org.mule.api.MuleEvent;
import org.mule.api.MuleMessage;
import org.mule.api.processor.MessageProcessor;
import org.mule.api.routing.filter.Filter;
import org.mule.modules.clarizen.ClarizenConnector;
import org.mule.modules.clarizen.process.ProcessAdapter;
import org.mule.modules.clarizen.process.ProcessCallback;
import org.mule.modules.clarizen.process.ProcessTemplate;
import org.mule.modules.clarizen.process.ProcessTemplate;


/**
 * A <code>ClarizenConnectorProcessAdapter</code> is a wrapper around {@link ClarizenConnector } that enables custom processing strategies.
 * 
 */
@Generated(value = "Mule DevKit Version 3.4.3", date = "2014-04-28T12:59:10-05:00", comments = "Build 3.4.3.1620.30ea288")
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
