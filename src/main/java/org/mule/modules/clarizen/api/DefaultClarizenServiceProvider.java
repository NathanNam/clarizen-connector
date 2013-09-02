/**
 * Mule Clarizen Cloud Connector
 *
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */

package org.mule.modules.clarizen.api;

import com.clarizen.api.Clarizen;
import com.clarizen.api.IClarizen;
import org.mule.modules.clarizen.ClarizenRuntimeException;

import java.net.MalformedURLException;
import java.net.URL;

public class DefaultClarizenServiceProvider implements ClarizenServiceProvider {

    private String serviceAddress;

    public DefaultClarizenServiceProvider() {
    }

    public DefaultClarizenServiceProvider(String serviceAddress) {
        this.serviceAddress = serviceAddress;
    }

    @Override
    public IClarizen getLoginService() {
        return new Clarizen().getClarizen();
    }

    @Override
    public IClarizen getService() {
        try {
            return new Clarizen(new URL(getServiceAddress())).getClarizen();
        } catch (MalformedURLException e) {
            throw new ClarizenRuntimeException(e);
        }
    }

    @Override
    public String getServiceAddress() {
        return serviceAddress;
    }

    public void setServiceAddress(String serviceAddress) {
        this.serviceAddress = serviceAddress;
    }
}
