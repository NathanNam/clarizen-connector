
package com.clarizen.api;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetTodayInfoMessage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetTodayInfoMessage">
 *   &lt;complexContent>
 *     &lt;extension base="{http://clarizen.com/api}BaseMessage">
 *       &lt;sequence>
 *         &lt;element name="InfoItem" type="{http://clarizen.com/api}TodayInfoItem"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetTodayInfoMessage", propOrder = {
    "infoItem"
})
public class GetTodayInfoMessage
    extends BaseMessage
{

    @XmlElement(name = "InfoItem", required = true)
    protected TodayInfoItem infoItem;

    /**
     * Gets the value of the infoItem property.
     * 
     * @return
     *     possible object is
     *     {@link TodayInfoItem }
     *     
     */
    public TodayInfoItem getInfoItem() {
        return infoItem;
    }

    /**
     * Sets the value of the infoItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link TodayInfoItem }
     *     
     */
    public void setInfoItem(TodayInfoItem value) {
        this.infoItem = value;
    }

}
