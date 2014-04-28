
package com.clarizen.api;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfRetrieveResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfRetrieveResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RetrieveResult" type="{http://clarizen.com/api}RetrieveResult" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfRetrieveResult", propOrder = {
    "retrieveResult"
})
public class ArrayOfRetrieveResult {

    @XmlElement(name = "RetrieveResult", nillable = true)
    protected List<RetrieveResult> retrieveResult;

    /**
     * Gets the value of the retrieveResult property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the retrieveResult property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRetrieveResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RetrieveResult }
     * 
     * 
     */
    public List<RetrieveResult> getRetrieveResult() {
        if (retrieveResult == null) {
            retrieveResult = new ArrayList<RetrieveResult>();
        }
        return this.retrieveResult;
    }

}
