
package org.mule.modules.clarizen.adapters;

import javax.annotation.Generated;
import org.mule.modules.clarizen.ClarizenConnector;
import org.mule.modules.clarizen.basic.Capabilities;
import org.mule.modules.clarizen.basic.Capability;


/**
 * A <code>ClarizenConnectorCapabilitiesAdapter</code> is a wrapper around {@link ClarizenConnector } that implements {@link org.mule.api.Capabilities} interface.
 * 
 */
@Generated(value = "Mule DevKit Version 3.4.3", date = "2014-06-04T12:20:43-05:00", comments = "Build 3.4.3.1620.30ea288")
public class ClarizenConnectorCapabilitiesAdapter
    extends ClarizenConnector
    implements Capabilities
{


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

}
