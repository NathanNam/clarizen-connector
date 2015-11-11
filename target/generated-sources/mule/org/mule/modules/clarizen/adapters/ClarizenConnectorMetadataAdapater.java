
package org.mule.modules.clarizen.adapters;

import javax.annotation.Generated;
import org.mule.api.MetadataAware;
import org.mule.modules.clarizen.ClarizenConnector;


/**
 * A <code>ClarizenConnectorMetadataAdapater</code> is a wrapper around {@link ClarizenConnector } that adds support for querying metadata about the extension.
 * 
 */
@Generated(value = "Mule DevKit Version 3.5.3", date = "2015-11-11T04:25:00-03:00", comments = "Build UNNAMED.2049.ec39f2b")
public class ClarizenConnectorMetadataAdapater
    extends ClarizenConnectorCapabilitiesAdapter
    implements MetadataAware
{

    private final static String MODULE_NAME = "Clarizen";
    private final static String MODULE_VERSION = "3.0.0";
    private final static String DEVKIT_VERSION = "3.5.3";
    private final static String DEVKIT_BUILD = "UNNAMED.2049.ec39f2b";
    private final static String MIN_MULE_VERSION = "3.4";

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

    public String getMinMuleVersion() {
        return MIN_MULE_VERSION;
    }

}
