
package org.mule.modules.clarizen.adapter;

import javax.annotation.Generated;

@Generated(value = "Mule DevKit Version 3.4.3", date = "2014-04-28T12:59:10-05:00", comments = "Build 3.4.3.1620.30ea288")
public interface HttpCallbackAdapter {

      Integer getLocalPort();

    Integer getRemotePort();

    String getDomain();

    org.mule.api.transport.Connector getConnector();

    Boolean getAsync();

    String getPath();
}
