
package com.clarizen.api;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GenericEntity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GenericEntity">
 *   &lt;complexContent>
 *     &lt;extension base="{http://clarizen.com/api}BaseEntity">
 *       &lt;sequence>
 *         &lt;element name="Permissions" type="{http://clarizen.com/api}Permissions" minOccurs="0"/>
 *         &lt;element name="Values" type="{http://clarizen.com/api}ArrayOfFieldValue" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GenericEntity", propOrder = {
    "permissions",
    "values"
})
public class GenericEntity
    extends BaseEntity
{

    @XmlElement(name = "Permissions", nillable = true)
    protected Permissions permissions;
    @XmlElement(name = "Values", nillable = true)
    protected ArrayOfFieldValue values;

    /**
     * Gets the value of the permissions property.
     * 
     * @return
     *     possible object is
     *     {@link Permissions }
     *     
     */
    public Permissions getPermissions() {
        return permissions;
    }

    /**
     * Sets the value of the permissions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Permissions }
     *     
     */
    public void setPermissions(Permissions value) {
        this.permissions = value;
    }

    /**
     * Gets the value of the values property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfFieldValue }
     *     
     */
    public ArrayOfFieldValue getValues() {
        return values;
    }

    /**
     * Sets the value of the values property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfFieldValue }
     *     
     */
    public void setValues(ArrayOfFieldValue value) {
        this.values = value;
    }

}
