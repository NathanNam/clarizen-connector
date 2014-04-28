
package com.clarizen.api.queries;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.clarizen.api.ArrayOfEntityId;
import com.clarizen.api.BaseMessage;
import com.clarizen.api.PermissionOptions;
import com.clarizen.api.StringList;


/**
 * <p>Java class for GetWorkItemResourcesMessage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetWorkItemResourcesMessage">
 *   &lt;complexContent>
 *     &lt;extension base="{http://clarizen.com/api}BaseMessage">
 *       &lt;sequence>
 *         &lt;element name="Fields" type="{http://clarizen.com/api}stringList" minOccurs="0"/>
 *         &lt;element name="Permissions" type="{http://clarizen.com/api}PermissionOptions" minOccurs="0"/>
 *         &lt;element name="WorkItemsIds" type="{http://clarizen.com/api}ArrayOfEntityId" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetWorkItemResourcesMessage", propOrder = {
    "fields",
    "permissions",
    "workItemsIds"
})
public class GetWorkItemResourcesMessage
    extends BaseMessage
{

    @XmlElement(name = "Fields", nillable = true)
    protected StringList fields;
    @XmlElement(name = "Permissions")
    protected PermissionOptions permissions;
    @XmlElement(name = "WorkItemsIds", nillable = true)
    protected ArrayOfEntityId workItemsIds;

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

    /**
     * Gets the value of the workItemsIds property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfEntityId }
     *     
     */
    public ArrayOfEntityId getWorkItemsIds() {
        return workItemsIds;
    }

    /**
     * Sets the value of the workItemsIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfEntityId }
     *     
     */
    public void setWorkItemsIds(ArrayOfEntityId value) {
        this.workItemsIds = value;
    }

}
