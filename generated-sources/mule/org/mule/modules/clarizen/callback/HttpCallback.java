
package org.mule.modules.clarizen.callback;

import javax.annotation.Generated;
import org.mule.api.context.MuleContextAware;
import org.mule.api.lifecycle.Startable;
import org.mule.api.lifecycle.Stoppable;

@Generated(value = "Mule DevKit Version 3.4.3", date = "2014-06-09T03:26:49-05:00", comments = "Build 3.4.3.1620.30ea288")
public interface HttpCallback extends MuleContextAware, Startable, Stoppable
{

    String getUrl();
}
