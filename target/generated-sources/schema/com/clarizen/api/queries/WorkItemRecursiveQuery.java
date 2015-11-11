
package com.clarizen.api.queries;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WorkItemRecursiveQuery complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WorkItemRecursiveQuery">
 *   &lt;complexContent>
 *     &lt;extension base="{http://clarizen.com/api/queries}RecursiveQuery">
 *       &lt;sequence>
 *         &lt;element name="IncludeShortcuts" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WorkItemRecursiveQuery", propOrder = {
    "includeShortcuts"
})
public class WorkItemRecursiveQuery
    extends RecursiveQuery
{

    @XmlElement(name = "IncludeShortcuts")
    protected Boolean includeShortcuts;

    /**
     * Gets the value of the includeShortcuts property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeShortcuts() {
        return includeShortcuts;
    }

    /**
     * Sets the value of the includeShortcuts property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeShortcuts(Boolean value) {
        this.includeShortcuts = value;
    }

}
