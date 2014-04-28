
package org.mule.modules.clarizen.adapters;

import java.util.Calendar;
import java.util.Date;
import javax.annotation.Generated;
import com.mulesource.licm.EnterpriseLicenseKey;
import com.mulesource.licm.LicenseKeyException;
import com.mulesource.licm.LicenseManagementFactory;
import com.mulesource.licm.LicenseManager;
import org.mule.api.lifecycle.Initialisable;
import org.mule.api.lifecycle.InitialisationException;

@Generated(value = "Mule DevKit Version 3.4.3", date = "2014-04-28T12:59:10-05:00", comments = "Build 3.4.3.1620.30ea288")
public class ClarizenConnectorLicenseChecker
    extends ClarizenConnectorConnectionIdentifierAdapter
    implements Initialisable
{


    @Override
    public void initialise()
        throws InitialisationException
    {
        super.initialise();
        checkMuleLicense();
    }

    /**
     * Obtains the expression manager from the Mule context and initialises the connector. If a target object  has not been set already it will search the Mule registry for a default one.
     * 
     * @throws InitialisationException
     */
    private void checkMuleLicense() {
        try {
            LicenseManager licenseManager = LicenseManagementFactory.getInstance().createLicenseManager(LicenseManagementFactory.MULE_EE);
            EnterpriseLicenseKey license = licenseManager.validate(LicenseManagementFactory.MULE_EE);
            Calendar expirationDate = Calendar.getInstance();
            if (license.getExpirationDate()!= null) {
                expirationDate.setTime(license.getExpirationDate());
                if (expirationDate.after(new Date())) {
                    throw new RuntimeException("Your license has expire");
                }
            }
            if (license.isEvaluation()) {
                throw new RuntimeException("This Module does not allow Evaluation Licenses.");
            }
        } catch (LicenseKeyException _x) {
            throw new RuntimeException("This Module requires an Enterprise license");
        }
    }

}
