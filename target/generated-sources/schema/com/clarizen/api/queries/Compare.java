
package com.clarizen.api.queries;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Compare complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Compare">
 *   &lt;complexContent>
 *     &lt;extension base="{http://clarizen.com/api/queries}Condition">
 *       &lt;sequence>
 *         &lt;element name="LeftExpression" type="{http://clarizen.com/api/queries}Expression" minOccurs="0"/>
 *         &lt;element name="Operator" type="{http://clarizen.com/api/queries}Operator"/>
 *         &lt;element name="RightExpression" type="{http://clarizen.com/api/queries}Expression" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Compare", propOrder = {
    "leftExpression",
    "operator",
    "rightExpression"
})
public class Compare
    extends Condition
{

    @XmlElement(name = "LeftExpression", nillable = true)
    protected Expression leftExpression;
    @XmlElement(name = "Operator", required = true)
    protected Operator operator;
    @XmlElement(name = "RightExpression", nillable = true)
    protected Expression rightExpression;

    /**
     * Gets the value of the leftExpression property.
     * 
     * @return
     *     possible object is
     *     {@link Expression }
     *     
     */
    public Expression getLeftExpression() {
        return leftExpression;
    }

    /**
     * Sets the value of the leftExpression property.
     * 
     * @param value
     *     allowed object is
     *     {@link Expression }
     *     
     */
    public void setLeftExpression(Expression value) {
        this.leftExpression = value;
    }

    /**
     * Gets the value of the operator property.
     * 
     * @return
     *     possible object is
     *     {@link Operator }
     *     
     */
    public Operator getOperator() {
        return operator;
    }

    /**
     * Sets the value of the operator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Operator }
     *     
     */
    public void setOperator(Operator value) {
        this.operator = value;
    }

    /**
     * Gets the value of the rightExpression property.
     * 
     * @return
     *     possible object is
     *     {@link Expression }
     *     
     */
    public Expression getRightExpression() {
        return rightExpression;
    }

    /**
     * Sets the value of the rightExpression property.
     * 
     * @param value
     *     allowed object is
     *     {@link Expression }
     *     
     */
    public void setRightExpression(Expression value) {
        this.rightExpression = value;
    }

}
