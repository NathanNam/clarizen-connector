
package com.clarizen.api.faults;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SessionTimeoutFailure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SessionTimeoutFailure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://clarizen.com/api/faults}GeneralFault">
 *       &lt;sequence>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SessionTimeoutFailure")
public class SessionTimeoutFailure
    extends GeneralFault
{


}
