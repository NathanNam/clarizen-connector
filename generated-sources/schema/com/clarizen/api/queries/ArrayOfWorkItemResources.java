
package com.clarizen.api.queries;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfWorkItemResources complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfWorkItemResources">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="WorkItemResources" type="{http://clarizen.com/api/queries}WorkItemResources" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfWorkItemResources", propOrder = {
    "workItemResources"
})
public class ArrayOfWorkItemResources {

    @XmlElement(name = "WorkItemResources", nillable = true)
    protected List<WorkItemResources> workItemResources;

    /**
     * Gets the value of the workItemResources property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the workItemResources property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWorkItemResources().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WorkItemResources }
     * 
     * 
     */
    public List<WorkItemResources> getWorkItemResources() {
        if (workItemResources == null) {
            workItemResources = new ArrayList<WorkItemResources>();
        }
        return this.workItemResources;
    }

}
