
package com.clarizen.api.queries;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.clarizen.api.Result;


/**
 * <p>Java class for GetWorkItemResourcesResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetWorkItemResourcesResult">
 *   &lt;complexContent>
 *     &lt;extension base="{http://clarizen.com/api}Result">
 *       &lt;sequence>
 *         &lt;element name="WorkItemResources" type="{http://clarizen.com/api/queries}ArrayOfWorkItemResources" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetWorkItemResourcesResult", propOrder = {
    "workItemResources"
})
public class GetWorkItemResourcesResult
    extends Result
{

    @XmlElement(name = "WorkItemResources", nillable = true)
    protected ArrayOfWorkItemResources workItemResources;

    /**
     * Gets the value of the workItemResources property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfWorkItemResources }
     *     
     */
    public ArrayOfWorkItemResources getWorkItemResources() {
        return workItemResources;
    }

    /**
     * Sets the value of the workItemResources property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfWorkItemResources }
     *     
     */
    public void setWorkItemResources(ArrayOfWorkItemResources value) {
        this.workItemResources = value;
    }

}
