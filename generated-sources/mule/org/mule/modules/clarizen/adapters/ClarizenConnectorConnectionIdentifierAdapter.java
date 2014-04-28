
package org.mule.modules.clarizen.adapters;

import javax.annotation.Generated;
import org.mule.modules.clarizen.ClarizenConnector;
import org.mule.modules.clarizen.connection.Connection;


/**
 * A <code>ClarizenConnectorConnectionIdentifierAdapter</code> is a wrapper around {@link ClarizenConnector } that implements {@link org.mule.devkit.dynamic.api.helper.Connection} interface.
 * 
 */
@Generated(value = "Mule DevKit Version 3.4.3", date = "2014-04-28T12:59:10-05:00", comments = "Build 3.4.3.1620.30ea288")
public class ClarizenConnectorConnectionIdentifierAdapter
    extends ClarizenConnectorProcessAdapter
    implements Connection
{


    public String getConnectionIdentifier() {
        return super.toString();
    }

}
