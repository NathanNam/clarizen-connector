
package com.clarizen.api;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RetrieveMultipleResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RetrieveMultipleResult">
 *   &lt;complexContent>
 *     &lt;extension base="{http://clarizen.com/api}Result">
 *       &lt;sequence>
 *         &lt;element name="Results" type="{http://clarizen.com/api}ArrayOfRetrieveResult" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RetrieveMultipleResult", propOrder = {
    "results"
})
public class RetrieveMultipleResult
    extends Result
{

    @XmlElement(name = "Results", nillable = true)
    protected ArrayOfRetrieveResult results;

    /**
     * Gets the value of the results property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRetrieveResult }
     *     
     */
    public ArrayOfRetrieveResult getResults() {
        return results;
    }

    /**
     * Sets the value of the results property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRetrieveResult }
     *     
     */
    public void setResults(ArrayOfRetrieveResult value) {
        this.results = value;
    }

}
