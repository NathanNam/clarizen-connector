
package com.clarizen.api.queries;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.clarizen.api.ConditionList;


/**
 * <p>Java class for LogicalCondition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LogicalCondition">
 *   &lt;complexContent>
 *     &lt;extension base="{http://clarizen.com/api/queries}Condition">
 *       &lt;sequence>
 *         &lt;element name="Conditions" type="{http://clarizen.com/api}ConditionList" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LogicalCondition", propOrder = {
    "conditions"
})
@XmlSeeAlso({
    Or.class,
    And.class
})
public class LogicalCondition
    extends Condition
{

    @XmlElement(name = "Conditions", nillable = true)
    protected ConditionList conditions;

    /**
     * Gets the value of the conditions property.
     * 
     * @return
     *     possible object is
     *     {@link ConditionList }
     *     
     */
    public ConditionList getConditions() {
        return conditions;
    }

    /**
     * Sets the value of the conditions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConditionList }
     *     
     */
    public void setConditions(ConditionList value) {
        this.conditions = value;
    }

}
