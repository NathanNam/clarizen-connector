
package com.clarizen.api.projectmanagement;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlType;
import com.clarizen.api.ArrayOfEntityId;
import com.clarizen.api.EntityId;
import com.clarizen.api.queries.EntityQuery;


/**
 * <p>Java class for TimesheetQuery complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TimesheetQuery">
 *   &lt;complexContent>
 *     &lt;extension base="{http://clarizen.com/api/queries}EntityQuery">
 *       &lt;sequence>
 *         &lt;element name="CustomerId" type="{http://clarizen.com/api}EntityId" minOccurs="0"/>
 *         &lt;element name="IAmTheApprover" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ProjectId" type="{http://clarizen.com/api}EntityId" minOccurs="0"/>
 *         &lt;element name="TimesheetState" type="{http://clarizen.com/api}TimesheetState" minOccurs="0"/>
 *         &lt;element name="WorkItems" type="{http://clarizen.com/api}ArrayOfEntityId" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimesheetQuery", propOrder = {
    "customerId",
    "iAmTheApprover",
    "projectId",
    "timesheetState",
    "workItems"
})
public class TimesheetQuery
    extends EntityQuery
{

    @XmlElement(name = "CustomerId", nillable = true)
    protected EntityId customerId;
    @XmlElement(name = "IAmTheApprover")
    protected Boolean iAmTheApprover;
    @XmlElement(name = "ProjectId", nillable = true)
    protected EntityId projectId;
    @XmlList
    @XmlElement(name = "TimesheetState")
    protected List<String> timesheetState;
    @XmlElement(name = "WorkItems", nillable = true)
    protected ArrayOfEntityId workItems;

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
     * Gets the value of the iAmTheApprover property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIAmTheApprover() {
        return iAmTheApprover;
    }

    /**
     * Sets the value of the iAmTheApprover property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIAmTheApprover(Boolean value) {
        this.iAmTheApprover = value;
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

    /**
     * Gets the value of the timesheetState property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the timesheetState property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTimesheetState().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getTimesheetState() {
        if (timesheetState == null) {
            timesheetState = new ArrayList<String>();
        }
        return this.timesheetState;
    }

    /**
     * Gets the value of the workItems property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfEntityId }
     *     
     */
    public ArrayOfEntityId getWorkItems() {
        return workItems;
    }

    /**
     * Sets the value of the workItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfEntityId }
     *     
     */
    public void setWorkItems(ArrayOfEntityId value) {
        this.workItems = value;
    }

}
