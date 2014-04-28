
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
 *         &lt;element name="MetadataResult" type="{http://clarizen.com/api}Result" minOccurs="0"/>
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
    "metadataResult"
})
@XmlRootElement(name = "MetadataResponse")
public class MetadataResponse {

    @XmlElement(name = "MetadataResult", nillable = true)
    protected Result metadataResult;

    /**
     * Gets the value of the metadataResult property.
     * 
     * @return
     *     possible object is
     *     {@link Result }
     *     
     */
    public Result getMetadataResult() {
        return metadataResult;
    }

    /**
     * Sets the value of the metadataResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Result }
     *     
     */
    public void setMetadataResult(Result value) {
        this.metadataResult = value;
    }

}
