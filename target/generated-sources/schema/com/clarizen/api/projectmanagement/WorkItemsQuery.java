
package com.clarizen.api.projectmanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.clarizen.api.ArrayOfEntityId;
import com.clarizen.api.queries.Condition;


/**
 * <p>Java class for WorkItemsQuery complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WorkItemsQuery">
 *   &lt;complexContent>
 *     &lt;extension base="{http://clarizen.com/api/projectManagement}MyWorkItemsQuery">
 *       &lt;sequence>
 *         &lt;element name="UserIds" type="{http://clarizen.com/api}ArrayOfEntityId" minOccurs="0"/>
 *         &lt;element name="Where" type="{http://clarizen.com/api/queries}Condition" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WorkItemsQuery", propOrder = {
    "userIds",
    "where"
})
public class WorkItemsQuery
    extends MyWorkItemsQuery
{

    @XmlElement(name = "UserIds", nillable = true)
    protected ArrayOfEntityId userIds;
    @XmlElement(name = "Where", nillable = true)
    protected Condition where;

    /**
     * Gets the value of the userIds property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfEntityId }
     *     
     */
    public ArrayOfEntityId getUserIds() {
        return userIds;
    }

    /**
     * Sets the value of the userIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfEntityId }
     *     
     */
    public void setUserIds(ArrayOfEntityId value) {
        this.userIds = value;
    }

    /**
     * Gets the value of the where property.
     * 
     * @return
     *     possible object is
     *     {@link Condition }
     *     
     */
    public Condition getWhere() {
        return where;
    }

    /**
     * Sets the value of the where property.
     * 
     * @param value
     *     allowed object is
     *     {@link Condition }
     *     
     */
    public void setWhere(Condition value) {
        this.where = value;
    }

}
