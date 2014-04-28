
package com.clarizen.api.projectmanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.clarizen.api.queries.Condition;
import com.clarizen.api.queries.EntityQuery;


/**
 * <p>Java class for IssuesQuery complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IssuesQuery">
 *   &lt;complexContent>
 *     &lt;extension base="{http://clarizen.com/api/queries}EntityQuery">
 *       &lt;sequence>
 *         &lt;element name="CustomerCondition" type="{http://clarizen.com/api/queries}Condition" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IssuesQuery", propOrder = {
    "customerCondition"
})
public class IssuesQuery
    extends EntityQuery
{

    @XmlElement(name = "CustomerCondition", nillable = true)
    protected Condition customerCondition;

    /**
     * Gets the value of the customerCondition property.
     * 
     * @return
     *     possible object is
     *     {@link Condition }
     *     
     */
    public Condition getCustomerCondition() {
        return customerCondition;
    }

    /**
     * Sets the value of the customerCondition property.
     * 
     * @param value
     *     allowed object is
     *     {@link Condition }
     *     
     */
    public void setCustomerCondition(Condition value) {
        this.customerCondition = value;
    }

}
