
package com.clarizen.api;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetMultipleTodayInfoResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetMultipleTodayInfoResult">
 *   &lt;complexContent>
 *     &lt;extension base="{http://clarizen.com/api}Result">
 *       &lt;sequence>
 *         &lt;element name="Results" type="{http://clarizen.com/api}ArrayOfGetTodayInfoResult" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetMultipleTodayInfoResult", propOrder = {
    "results"
})
public class GetMultipleTodayInfoResult
    extends Result
{

    @XmlElement(name = "Results", nillable = true)
    protected ArrayOfGetTodayInfoResult results;

    /**
     * Gets the value of the results property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfGetTodayInfoResult }
     *     
     */
    public ArrayOfGetTodayInfoResult getResults() {
        return results;
    }

    /**
     * Sets the value of the results property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfGetTodayInfoResult }
     *     
     */
    public void setResults(ArrayOfGetTodayInfoResult value) {
        this.results = value;
    }

}
