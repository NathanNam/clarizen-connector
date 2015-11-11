
package org.mule.modules.clarizen.adapters;

import javax.annotation.Generated;
import org.mule.modules.clarizen.ClarizenConnector;
import org.mule.modules.clarizen.connection.Connection;


/**
 * A <code>ClarizenConnectorConnectionIdentifierAdapter</code> is a wrapper around {@link ClarizenConnector } that implements {@link org.mule.devkit.dynamic.api.helper.Connection} interface.
 * 
 */
@Generated(value = "Mule DevKit Version 3.5.3", date = "2015-11-11T04:25:00-03:00", comments = "Build UNNAMED.2049.ec39f2b")
public class ClarizenConnectorConnectionIdentifierAdapter
    extends ClarizenConnectorProcessAdapter
    implements Connection
{


    public String getConnectionIdentifier() {
        return super.toString();
    }

}
