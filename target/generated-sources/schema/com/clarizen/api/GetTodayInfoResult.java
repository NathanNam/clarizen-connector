
package com.clarizen.api;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetTodayInfoResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetTodayInfoResult">
 *   &lt;complexContent>
 *     &lt;extension base="{http://clarizen.com/api}Result">
 *       &lt;sequence>
 *         &lt;element name="InfoItem" type="{http://clarizen.com/api}TodayInfoItem"/>
 *         &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetTodayInfoResult", propOrder = {
    "infoItem",
    "value"
})
public class GetTodayInfoResult
    extends Result
{

    @XmlElement(name = "InfoItem", required = true)
    protected TodayInfoItem infoItem;
    @XmlElement(name = "Value")
    protected long value;

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

    /**
     * Gets the value of the value property.
     * 
     */
    public long getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     */
    public void setValue(long value) {
        this.value = value;
    }

}
