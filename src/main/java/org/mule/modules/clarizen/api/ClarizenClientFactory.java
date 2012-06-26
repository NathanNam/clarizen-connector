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

import org.mule.modules.clarizen.DefaultClarizenClient;

public class ClarizenClientFactory {

    private static ClarizenClient clarizenClient;

    private ClarizenClientFactory() {

    }

    public static ClarizenClient getClient() {
        if (clarizenClient == null) {
            clarizenClient = new DefaultClarizenClient(new DefaultClarizenServiceProvider());
        }
        return clarizenClient;
    }

}