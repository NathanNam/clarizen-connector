
package com.clarizen.api.metadata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.clarizen.api.AnyTypeList;
import com.clarizen.api.Result;


/**
 * <p>Java class for GetSystemSettingsValuesResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetSystemSettingsValuesResult">
 *   &lt;complexContent>
 *     &lt;extension base="{http://clarizen.com/api}Result">
 *       &lt;sequence>
 *         &lt;element name="Values" type="{http://clarizen.com/api}anyTypeList" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetSystemSettingsValuesResult", propOrder = {
    "values"
})
public class GetSystemSettingsValuesResult
    extends Result
{

    @XmlElement(name = "Values", nillable = true)
    protected AnyTypeList values;

    /**
     * Gets the value of the values property.
     * 
     * @return
     *     possible object is
     *     {@link AnyTypeList }
     *     
     */
    public AnyTypeList getValues() {
        return values;
    }

    /**
     * Sets the value of the values property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnyTypeList }
     *     
     */
    public void setValues(AnyTypeList value) {
        this.values = value;
    }

}
