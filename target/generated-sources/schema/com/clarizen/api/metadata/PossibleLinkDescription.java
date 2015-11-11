
package com.clarizen.api.metadata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PossibleLinkDescription complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PossibleLinkDescription">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FromEntity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FromField" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ToEntity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ToField" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PossibleLinkDescription", propOrder = {
    "fromEntity",
    "fromField",
    "toEntity",
    "toField"
})
public class PossibleLinkDescription {

    @XmlElement(name = "FromEntity", nillable = true)
    protected String fromEntity;
    @XmlElement(name = "FromField", nillable = true)
    protected String fromField;
    @XmlElement(name = "ToEntity", nillable = true)
    protected String toEntity;
    @XmlElement(name = "ToField", nillable = true)
    protected String toField;

    /**
     * Gets the value of the fromEntity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFromEntity() {
        return fromEntity;
    }

    /**
     * Sets the value of the fromEntity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFromEntity(String value) {
        this.fromEntity = value;
    }

    /**
     * Gets the value of the fromField property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFromField() {
        return fromField;
    }

    /**
     * Sets the value of the fromField property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFromField(String value) {
        this.fromField = value;
    }

    /**
     * Gets the value of the toEntity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToEntity() {
        return toEntity;
    }

    /**
     * Sets the value of the toEntity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToEntity(String value) {
        this.toEntity = value;
    }

    /**
     * Gets the value of the toField property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToField() {
        return toField;
    }

    /**
     * Sets the value of the toField property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToField(String value) {
        this.toField = value;
    }

}
