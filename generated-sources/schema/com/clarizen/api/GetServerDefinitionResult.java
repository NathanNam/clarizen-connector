
package com.clarizen.api;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetServerDefinitionResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetServerDefinitionResult">
 *   &lt;complexContent>
 *     &lt;extension base="{http://clarizen.com/api}Result">
 *       &lt;sequence>
 *         &lt;element name="ServerLocation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetServerDefinitionResult", propOrder = {
    "serverLocation"
})
public class GetServerDefinitionResult
    extends Result
{

    @XmlElement(name = "ServerLocation", nillable = true)
    protected String serverLocation;

    /**
     * Gets the value of the serverLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServerLocation() {
        return serverLocation;
    }

    /**
     * Sets the value of the serverLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServerLocation(String value) {
        this.serverLocation = value;
    }

}
