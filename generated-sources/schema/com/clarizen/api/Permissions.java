
package com.clarizen.api;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Permissions complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Permissions">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FieldPermissions" type="{http://clarizen.com/api}ArrayOfFieldPermission" minOccurs="0"/>
 *         &lt;element name="ObjectPermissions" type="{http://clarizen.com/api}ArrayOfObjectPermissions" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Permissions", propOrder = {
    "fieldPermissions",
    "objectPermissions"
})
public class Permissions {

    @XmlElement(name = "FieldPermissions", nillable = true)
    protected ArrayOfFieldPermission fieldPermissions;
    @XmlElement(name = "ObjectPermissions", nillable = true)
    protected ArrayOfObjectPermissions objectPermissions;

    /**
     * Gets the value of the fieldPermissions property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfFieldPermission }
     *     
     */
    public ArrayOfFieldPermission getFieldPermissions() {
        return fieldPermissions;
    }

    /**
     * Sets the value of the fieldPermissions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfFieldPermission }
     *     
     */
    public void setFieldPermissions(ArrayOfFieldPermission value) {
        this.fieldPermissions = value;
    }

    /**
     * Gets the value of the objectPermissions property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfObjectPermissions }
     *     
     */
    public ArrayOfObjectPermissions getObjectPermissions() {
        return objectPermissions;
    }

    /**
     * Sets the value of the objectPermissions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfObjectPermissions }
     *     
     */
    public void setObjectPermissions(ArrayOfObjectPermissions value) {
        this.objectPermissions = value;
    }

}
