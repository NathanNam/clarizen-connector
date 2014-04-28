
package com.clarizen.api;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDayInformation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDayInformation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DayInformation" type="{http://clarizen.com/api}DayInformation" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDayInformation", propOrder = {
    "dayInformation"
})
public class ArrayOfDayInformation {

    @XmlElement(name = "DayInformation", nillable = true)
    protected List<DayInformation> dayInformation;

    /**
     * Gets the value of the dayInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dayInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDayInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DayInformation }
     * 
     * 
     */
    public List<DayInformation> getDayInformation() {
        if (dayInformation == null) {
            dayInformation = new ArrayList<DayInformation>();
        }
        return this.dayInformation;
    }

}
