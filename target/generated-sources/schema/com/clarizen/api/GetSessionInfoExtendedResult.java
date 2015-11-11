
package com.clarizen.api;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetSessionInfoExtendedResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetSessionInfoExtendedResult">
 *   &lt;complexContent>
 *     &lt;extension base="{http://clarizen.com/api}GetSessionInfoResult">
 *       &lt;sequence>
 *         &lt;element name="ClientVersionInfo" type="{http://clarizen.com/api}ClientVersionInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetSessionInfoExtendedResult", propOrder = {
    "clientVersionInfo"
})
public class GetSessionInfoExtendedResult
    extends GetSessionInfoResult
{

    @XmlElement(name = "ClientVersionInfo", nillable = true)
    protected ClientVersionInfo clientVersionInfo;

    /**
     * Gets the value of the clientVersionInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ClientVersionInfo }
     *     
     */
    public ClientVersionInfo getClientVersionInfo() {
        return clientVersionInfo;
    }

    /**
     * Sets the value of the clientVersionInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClientVersionInfo }
     *     
     */
    public void setClientVersionInfo(ClientVersionInfo value) {
        this.clientVersionInfo = value;
    }

}
