
package com.clarizen.api;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetMultipleTodayInfoMessage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetMultipleTodayInfoMessage">
 *   &lt;complexContent>
 *     &lt;extension base="{http://clarizen.com/api}BaseMessage">
 *       &lt;sequence>
 *         &lt;element name="InfoItems" type="{http://clarizen.com/api}ArrayOfTodayInfoItem" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetMultipleTodayInfoMessage", propOrder = {
    "infoItems"
})
public class GetMultipleTodayInfoMessage
    extends BaseMessage
{

    @XmlElement(name = "InfoItems", nillable = true)
    protected ArrayOfTodayInfoItem infoItems;

    /**
     * Gets the value of the infoItems property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTodayInfoItem }
     *     
     */
    public ArrayOfTodayInfoItem getInfoItems() {
        return infoItems;
    }

    /**
     * Sets the value of the infoItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTodayInfoItem }
     *     
     */
    public void setInfoItems(ArrayOfTodayInfoItem value) {
        this.infoItems = value;
    }

}
