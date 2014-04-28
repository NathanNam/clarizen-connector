
package com.clarizen.api;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RetrieveMessage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RetrieveMessage">
 *   &lt;complexContent>
 *     &lt;extension base="{http://clarizen.com/api}BaseMessage">
 *       &lt;sequence>
 *         &lt;element name="Fields" type="{http://clarizen.com/api}stringList" minOccurs="0"/>
 *         &lt;element name="Id" type="{http://clarizen.com/api}EntityId" minOccurs="0"/>
 *         &lt;element name="Permissions" type="{http://clarizen.com/api}PermissionOptions" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RetrieveMessage", propOrder = {
    "fields",
    "id",
    "permissions"
})
public class RetrieveMessage
    extends BaseMessage
{

    @XmlElement(name = "Fields", nillable = true)
    protected StringList fields;
    @XmlElement(name = "Id", nillable = true)
    protected EntityId id;
    @XmlElement(name = "Permissions")
    protected PermissionOptions permissions;

    /**
     * Gets the value of the fields property.
     * 
     * @return
     *     possible object is
     *     {@link StringList }
     *     
     */
    public StringList getFields() {
        return fields;
    }

    /**
     * Sets the value of the fields property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringList }
     *     
     */
    public void setFields(StringList value) {
        this.fields = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link EntityId }
     *     
     */
    public EntityId getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityId }
     *     
     */
    public void setId(EntityId value) {
        this.id = value;
    }

    /**
     * Gets the value of the permissions property.
     * 
     * @return
     *     possible object is
     *     {@link PermissionOptions }
     *     
     */
    public PermissionOptions getPermissions() {
        return permissions;
    }

    /**
     * Sets the value of the permissions property.
     * 
     * @param value
     *     allowed object is
     *     {@link PermissionOptions }
     *     
     */
    public void setPermissions(PermissionOptions value) {
        this.permissions = value;
    }

}
