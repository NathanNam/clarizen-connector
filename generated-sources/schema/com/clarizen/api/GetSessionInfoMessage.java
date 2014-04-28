
package com.clarizen.api;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetSessionInfoMessage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetSessionInfoMessage">
 *   &lt;complexContent>
 *     &lt;extension base="{http://clarizen.com/api}BaseMessage">
 *       &lt;sequence>
 *         &lt;element name="options" type="{http://clarizen.com/api}LoginOptions" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetSessionInfoMessage", propOrder = {
    "options"
})
public class GetSessionInfoMessage
    extends BaseMessage
{

    @XmlElement(nillable = true)
    protected LoginOptions options;

    /**
     * Gets the value of the options property.
     * 
     * @return
     *     possible object is
     *     {@link LoginOptions }
     *     
     */
    public LoginOptions getOptions() {
        return options;
    }

    /**
     * Sets the value of the options property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoginOptions }
     *     
     */
    public void setOptions(LoginOptions value) {
        this.options = value;
    }

}
