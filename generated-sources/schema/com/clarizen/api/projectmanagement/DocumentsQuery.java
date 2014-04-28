
package com.clarizen.api.projectmanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.clarizen.api.EntityId;
import com.clarizen.api.queries.BuiltInQuery;


/**
 * <p>Java class for DocumentsQuery complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DocumentsQuery">
 *   &lt;complexContent>
 *     &lt;extension base="{http://clarizen.com/api/queries}BuiltInQuery">
 *       &lt;sequence>
 *         &lt;element name="WorkItemId" type="{http://clarizen.com/api}EntityId" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocumentsQuery", propOrder = {
    "workItemId"
})
public class DocumentsQuery
    extends BuiltInQuery
{

    @XmlElement(name = "WorkItemId", nillable = true)
    protected EntityId workItemId;

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
