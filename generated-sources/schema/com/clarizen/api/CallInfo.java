
package com.clarizen.api;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CallInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CallInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Activity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Module" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CallInfo", propOrder = {
    "activity",
    "module"
})
public class CallInfo {

    @XmlElement(name = "Activity", nillable = true)
    protected String activity;
    @XmlElement(name = "Module", nillable = true)
    protected String module;

    /**
     * Gets the value of the activity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActivity() {
        return activity;
    }

    /**
     * Sets the value of the activity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActivity(String value) {
        this.activity = value;
    }

    /**
     * Gets the value of the module property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModule() {
        return module;
    }

    /**
     * Sets the value of the module property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModule(String value) {
        this.module = value;
    }

}
