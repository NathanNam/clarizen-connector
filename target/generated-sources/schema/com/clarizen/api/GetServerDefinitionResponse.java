
package com.clarizen.api;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GetServerDefinitionResult" type="{http://clarizen.com/api}GetServerDefinitionResult" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getServerDefinitionResult"
})
@XmlRootElement(name = "GetServerDefinitionResponse")
public class GetServerDefinitionResponse {

    @XmlElement(name = "GetServerDefinitionResult", nillable = true)
    protected GetServerDefinitionResult getServerDefinitionResult;

    /**
     * Gets the value of the getServerDefinitionResult property.
     * 
     * @return
     *     possible object is
     *     {@link GetServerDefinitionResult }
     *     
     */
    public GetServerDefinitionResult getGetServerDefinitionResult() {
        return getServerDefinitionResult;
    }

    /**
     * Sets the value of the getServerDefinitionResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetServerDefinitionResult }
     *     
     */
    public void setGetServerDefinitionResult(GetServerDefinitionResult value) {
        this.getServerDefinitionResult = value;
    }

}
