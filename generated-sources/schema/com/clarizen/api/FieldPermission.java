
package com.clarizen.api;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FieldPermission complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FieldPermission">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FieldName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Permissions" type="{http://clarizen.com/api}FieldPermissions"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FieldPermission", propOrder = {
    "fieldName",
    "permissions"
})
public class FieldPermission {

    @XmlElement(name = "FieldName", nillable = true)
    protected String fieldName;
    @XmlElement(name = "Permissions", required = true)
    protected FieldPermissions permissions;

    /**
     * Gets the value of the fieldName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFieldName() {
        return fieldName;
    }

    /**
     * Sets the value of the fieldName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFieldName(String value) {
        this.fieldName = value;
    }

    /**
     * Gets the value of the permissions property.
     * 
     * @return
     *     possible object is
     *     {@link FieldPermissions }
     *     
     */
    public FieldPermissions getPermissions() {
        return permissions;
    }

    /**
     * Sets the value of the permissions property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldPermissions }
     *     
     */
    public void setPermissions(FieldPermissions value) {
        this.permissions = value;
    }

}
