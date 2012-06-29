/**
 * Mule Clarizen Cloud Connector
 *
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */

package org.mule.modules.clarizen;

import com.clarizen.api.ErrorCode;

/**
 * Clarizen Session Timeout Exception
 *  
 */
public class ClarizenSessionTimeoutException extends RuntimeException {

    private static final long serialVersionUID = -3070656338202096135L;

    public ClarizenSessionTimeoutException (String exceptionMessage) {
        super(exceptionMessage);
    }

    public ClarizenSessionTimeoutException(Throwable cause) {
        super(cause);
    }

    public ClarizenSessionTimeoutException (String exceptionMessage, Throwable cause) {
        super(exceptionMessage, cause);
    }
    
    public ClarizenSessionTimeoutException (ErrorCode errorCode, String message) {
        super(errorCode.value() + ": " + message);
    }
}
