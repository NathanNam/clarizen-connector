
package com.clarizen.api;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetSessionInfoResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetSessionInfoResult">
 *   &lt;complexContent>
 *     &lt;extension base="{http://clarizen.com/api}LoginResult">
 *       &lt;sequence>
 *         &lt;element name="CustomInfo" type="{http://clarizen.com/api}ArrayOfFieldValue" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetSessionInfoResult", propOrder = {
    "customInfo"
})
@XmlSeeAlso({
    GetSessionInfoExtendedResult.class
})
public class GetSessionInfoResult
    extends LoginResult
{

    @XmlElement(name = "CustomInfo", nillable = true)
    protected ArrayOfFieldValue customInfo;

    /**
     * Gets the value of the customInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfFieldValue }
     *     
     */
    public ArrayOfFieldValue getCustomInfo() {
        return customInfo;
    }

    /**
     * Sets the value of the customInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfFieldValue }
     *     
     */
    public void setCustomInfo(ArrayOfFieldValue value) {
        this.customInfo = value;
    }

}
