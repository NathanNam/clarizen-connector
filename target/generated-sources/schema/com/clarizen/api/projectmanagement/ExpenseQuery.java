
package com.clarizen.api.projectmanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.clarizen.api.EntityId;
import com.clarizen.api.queries.EntityQuery;


/**
 * <p>Java class for ExpenseQuery complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExpenseQuery">
 *   &lt;complexContent>
 *     &lt;extension base="{http://clarizen.com/api/queries}EntityQuery">
 *       &lt;sequence>
 *         &lt;element name="CustomerId" type="{http://clarizen.com/api}EntityId" minOccurs="0"/>
 *         &lt;element name="ProjectId" type="{http://clarizen.com/api}EntityId" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExpenseQuery", propOrder = {
    "customerId",
    "projectId"
})
public class ExpenseQuery
    extends EntityQuery
{

    @XmlElement(name = "CustomerId", nillable = true)
    protected EntityId customerId;
    @XmlElement(name = "ProjectId", nillable = true)
    protected EntityId projectId;

    /**
     * Gets the value of the customerId property.
     * 
     * @return
     *     possible object is
     *     {@link EntityId }
     *     
     */
    public EntityId getCustomerId() {
        return customerId;
    }

    /**
     * Sets the value of the customerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityId }
     *     
     */
    public void setCustomerId(EntityId value) {
        this.customerId = value;
    }

    /**
     * Gets the value of the projectId property.
     * 
     * @return
     *     possible object is
     *     {@link EntityId }
     *     
     */
    public EntityId getProjectId() {
        return projectId;
    }

    /**
     * Sets the value of the projectId property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityId }
     *     
     */
    public void setProjectId(EntityId value) {
        this.projectId = value;
    }

}
