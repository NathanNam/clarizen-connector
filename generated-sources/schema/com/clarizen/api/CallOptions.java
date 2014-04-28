
package com.clarizen.api;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CallOptions complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CallOptions">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Batch" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="DisableValidationRules" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="DisableWorkflowRules" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CallOptions", propOrder = {
    "batch",
    "disableValidationRules",
    "disableWorkflowRules"
})
public class CallOptions {

    @XmlElement(name = "Batch")
    protected Boolean batch;
    @XmlElement(name = "DisableValidationRules")
    protected Boolean disableValidationRules;
    @XmlElement(name = "DisableWorkflowRules")
    protected Boolean disableWorkflowRules;

    /**
     * Gets the value of the batch property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBatch() {
        return batch;
    }

    /**
     * Sets the value of the batch property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBatch(Boolean value) {
        this.batch = value;
    }

    /**
     * Gets the value of the disableValidationRules property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDisableValidationRules() {
        return disableValidationRules;
    }

    /**
     * Sets the value of the disableValidationRules property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDisableValidationRules(Boolean value) {
        this.disableValidationRules = value;
    }

    /**
     * Gets the value of the disableWorkflowRules property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDisableWorkflowRules() {
        return disableWorkflowRules;
    }

    /**
     * Sets the value of the disableWorkflowRules property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDisableWorkflowRules(Boolean value) {
        this.disableWorkflowRules = value;
    }

}
