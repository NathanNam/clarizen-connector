
package com.clarizen.api;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GenerateUniqueIdsResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GenerateUniqueIdsResult">
 *   &lt;complexContent>
 *     &lt;extension base="{http://clarizen.com/api}Result">
 *       &lt;sequence>
 *         &lt;element name="Ids" type="{http://clarizen.com/api}stringList" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GenerateUniqueIdsResult", propOrder = {
    "ids"
})
public class GenerateUniqueIdsResult
    extends Result
{

    @XmlElement(name = "Ids", nillable = true)
    protected StringList ids;

    /**
     * Gets the value of the ids property.
     * 
     * @return
     *     possible object is
     *     {@link StringList }
     *     
     */
    public StringList getIds() {
        return ids;
    }

    /**
     * Sets the value of the ids property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringList }
     *     
     */
    public void setIds(StringList value) {
        this.ids = value;
    }

}
