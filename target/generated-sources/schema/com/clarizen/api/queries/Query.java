
package com.clarizen.api.queries;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.clarizen.api.BaseMessage;
import com.clarizen.api.PermissionOptions;


/**
 * <p>Java class for Query complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Query">
 *   &lt;complexContent>
 *     &lt;extension base="{http://clarizen.com/api}BaseMessage">
 *       &lt;sequence>
 *         &lt;element name="Paging" type="{http://clarizen.com/api/queries}Paging" minOccurs="0"/>
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
@XmlType(name = "Query", propOrder = {
    "paging",
    "permissions"
})
@XmlSeeAlso({
    SearchQuery.class,
    QueryByExample.class,
    BuiltInQuery.class,
    EntityQuery.class
})
public class Query
    extends BaseMessage
{

    @XmlElement(name = "Paging", nillable = true)
    protected Paging paging;
    @XmlElement(name = "Permissions")
    protected PermissionOptions permissions;

    /**
     * Gets the value of the paging property.
     * 
     * @return
     *     possible object is
     *     {@link Paging }
     *     
     */
    public Paging getPaging() {
        return paging;
    }

    /**
     * Sets the value of the paging property.
     * 
     * @param value
     *     allowed object is
     *     {@link Paging }
     *     
     */
    public void setPaging(Paging value) {
        this.paging = value;
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
