
package org.mule.modules.clarizen.adapters;

import javax.annotation.Generated;
import org.mule.modules.clarizen.ClarizenConnector;
import org.mule.modules.clarizen.basic.MetadataAware;


/**
 * A <code>ClarizenConnectorMetadataAdapater</code> is a wrapper around {@link ClarizenConnector } that adds support for querying metadata about the extension.
 * 
 */
@Generated(value = "Mule DevKit Version 3.4.3", date = "2014-08-14T11:23:00-05:00", comments = "Build 3.4.3.1620.30ea288")
public class ClarizenConnectorMetadataAdapater
    extends ClarizenConnectorCapabilitiesAdapter
    implements MetadataAware
{

    private final static String MODULE_NAME = "Clarizen";
    private final static String MODULE_VERSION = "2.0.10-SNAPSHOT";
    private final static String DEVKIT_VERSION = "3.4.3";
    private final static String DEVKIT_BUILD = "3.4.3.1620.30ea288";

    public String getModuleName() {
        return MODULE_NAME;
    }

    public String getModuleVersion() {
        return MODULE_VERSION;
    }

    public String getDevkitVersion() {
        return DEVKIT_VERSION;
    }

    public String getDevkitBuild() {
        return DEVKIT_BUILD;
    }

}
