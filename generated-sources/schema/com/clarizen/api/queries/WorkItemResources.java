
package com.clarizen.api.queries;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.clarizen.api.ArrayOfBaseEntity;
import com.clarizen.api.EntityId;


/**
 * <p>Java class for WorkItemResources complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WorkItemResources">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Resources" type="{http://clarizen.com/api}ArrayOfBaseEntity" minOccurs="0"/>
 *         &lt;element name="WorkItemId" type="{http://clarizen.com/api}EntityId" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WorkItemResources", propOrder = {
    "resources",
    "workItemId"
})
public class WorkItemResources {

    @XmlElement(name = "Resources", nillable = true)
    protected ArrayOfBaseEntity resources;
    @XmlElement(name = "WorkItemId", nillable = true)
    protected EntityId workItemId;

    /**
     * Gets the value of the resources property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfBaseEntity }
     *     
     */
    public ArrayOfBaseEntity getResources() {
        return resources;
    }

    /**
     * Sets the value of the resources property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfBaseEntity }
     *     
     */
    public void setResources(ArrayOfBaseEntity value) {
        this.resources = value;
    }

    /**
     * Gets the value of the workItemId property.
     * 
     * @return
     *     possible object is
     *     {@link EntityId }
     *     
     */
    public EntityId getWorkItemId() {
        return workItemId;
    }

    /**
     * Sets the value of the workItemId property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityId }
     *     
     */
    public void setWorkItemId(EntityId value) {
        this.workItemId = value;
    }

}
