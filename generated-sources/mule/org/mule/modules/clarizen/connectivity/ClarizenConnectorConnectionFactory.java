
package org.mule.modules.clarizen.connectivity;

import javax.annotation.Generated;
import org.apache.commons.pool.KeyedPoolableObjectFactory;
import org.mule.api.context.MuleContextAware;
import org.mule.api.lifecycle.Disposable;
import org.mule.api.lifecycle.Initialisable;
import org.mule.api.lifecycle.Startable;
import org.mule.api.lifecycle.Stoppable;
import org.mule.modules.clarizen.adapters.ClarizenConnectorLicenseChecker;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Generated(value = "Mule DevKit Version 3.4.3", date = "2014-06-09T03:26:49-05:00", comments = "Build 3.4.3.1620.30ea288")
public class ClarizenConnectorConnectionFactory implements KeyedPoolableObjectFactory
{

    private static Logger logger = LoggerFactory.getLogger(ClarizenConnectorConnectionFactory.class);
    private ClarizenConnectorConnectionManager connectionManager;

    public ClarizenConnectorConnectionFactory(ClarizenConnectorConnectionManager connectionManager) {
        this.connectionManager = connectionManager;
    }

    public Object makeObject(Object key)
        throws Exception
    {
        if (!(key instanceof ClarizenConnectorConnectionKey)) {
            if (key == null) {
                logger.warn("Connection key is null");
            } else {
                logger.warn("Cannot cast key of type ".concat(key.getClass().getName().concat(" to ").concat("org.mule.modules.clarizen.connectivity.ClarizenConnectorConnectionKey")));
            }
            throw new RuntimeException("Invalid key type ".concat(key.getClass().getName()));
        }
        ClarizenConnectorLicenseChecker connector = new ClarizenConnectorLicenseChecker();
        connector.setServiceAddress(connectionManager.getServiceAddress());
        if (connector instanceof Initialisable) {
            ((Initialisable) connector).initialise();
        }
        if (connector instanceof MuleContextAware) {
            ((MuleContextAware) connector).setMuleContext(connectionManager.getMuleContext());
        }
        if (connector instanceof Startable) {
            ((Startable) connector).start();
        }
        if (!connector.validateConnection()) {
            connector.connect(((ClarizenConnectorConnectionKey) key).getConnectionUser(), ((ClarizenConnectorConnectionKey) key).getConnectionPassword(), ((ClarizenConnectorConnectionKey) key).getApplicationId(), ((ClarizenConnectorConnectionKey) key).getPartnerId());
        }
        return connector;
    }

    public void destroyObject(Object key, Object obj)
        throws Exception
    {
        if (!(key instanceof ClarizenConnectorConnectionKey)) {
            if (key == null) {
                logger.warn("Connection key is null");
            } else {
                logger.warn("Cannot cast key of type ".concat(key.getClass().getName().concat(" to ").concat("org.mule.modules.clarizen.connectivity.ClarizenConnectorConnectionKey")));
            }
            throw new RuntimeException("Invalid key type ".concat(key.getClass().getName()));
        }
        if (!(obj instanceof ClarizenConnectorLicenseChecker)) {
            if (obj == null) {
                logger.warn("Connector is null");
            } else {
                logger.warn("Cannot cast connector of type ".concat(obj.getClass().getName().concat(" to ").concat("org.mule.modules.clarizen.adapters.ClarizenConnectorLicenseChecker")));
            }
            throw new RuntimeException("Invalid connector type ".concat(obj.getClass().getName()));
        }
        try {
            ((ClarizenConnectorLicenseChecker) obj).disconnect();
        } catch (Exception e) {
            throw e;
        } finally {
            if (((ClarizenConnectorLicenseChecker) obj) instanceof Stoppable) {
                ((Stoppable) obj).stop();
            }
            if (((ClarizenConnectorLicenseChecker) obj) instanceof Disposable) {
                ((Disposable) obj).dispose();
            }
        }
    }

    public boolean validateObject(Object key, Object obj) {
        if (!(obj instanceof ClarizenConnectorLicenseChecker)) {
            if (obj == null) {
                logger.warn("Connector is null");
            } else {
                logger.warn("Cannot cast connector of type ".concat(obj.getClass().getName().concat(" to ").concat("org.mule.modules.clarizen.adapters.ClarizenConnectorLicenseChecker")));
            }
            throw new RuntimeException("Invalid connector type ".concat(obj.getClass().getName()));
        }
        try {
            return ((ClarizenConnectorLicenseChecker) obj).validateConnection();
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            return false;
        }
    }

    public void activateObject(Object key, Object obj)
        throws Exception
    {
        if (!(key instanceof ClarizenConnectorConnectionKey)) {
            throw new RuntimeException("Invalid key type");
        }
        if (!(obj instanceof ClarizenConnectorLicenseChecker)) {
            throw new RuntimeException("Invalid connector type");
        }
        try {
            if (!((ClarizenConnectorLicenseChecker) obj).validateConnection()) {
                ((ClarizenConnectorLicenseChecker) obj).connect(((ClarizenConnectorConnectionKey) key).getConnectionUser(), ((ClarizenConnectorConnectionKey) key).getConnectionPassword(), ((ClarizenConnectorConnectionKey) key).getApplicationId(), ((ClarizenConnectorConnectionKey) key).getPartnerId());
            }
        } catch (Exception e) {
            throw e;
        }
    }

    public void passivateObject(Object key, Object obj)
        throws Exception
    {
    }

}
