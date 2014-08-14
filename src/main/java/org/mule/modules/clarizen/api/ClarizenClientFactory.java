/**
 * Mule Clarizen Cloud Connector
 *
 * (c) 2003-2014 MuleSoft, Inc. The software in this package is published under
 * the terms of the CPAL v1.0 license, a copy of which has been included with this
 * distribution in the LICENSE.md file.
 */

package org.mule.modules.clarizen.api;

import org.mule.modules.clarizen.DefaultClarizenClient;

public class ClarizenClientFactory {

    private static ClarizenClient clarizenClient;

    private ClarizenClientFactory() {

    }

    public static ClarizenClient getClient(String address) {
        if (address == null) {
            clarizenClient = new DefaultClarizenClient(new DefaultClarizenServiceProvider());
        } else {
            clarizenClient = new DefaultClarizenClient(new DefaultClarizenServiceProvider(address));
        }
        return clarizenClient;
    }
}