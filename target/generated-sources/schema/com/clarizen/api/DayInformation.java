
package com.clarizen.api;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Provides working day information about a calendar day
 * 
 * <p>Java class for DayInformation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DayInformation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EndHour" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="IsWorkingDay" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="StartHour" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="TotalWorkingHours" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DayInformation", propOrder = {
    "endHour",
    "isWorkingDay",
    "startHour",
    "totalWorkingHours"
})
public class DayInformation {

    @XmlElement(name = "EndHour")
    protected double endHour;
    @XmlElement(name = "IsWorkingDay")
    protected boolean isWorkingDay;
    @XmlElement(name = "StartHour")
    protected double startHour;
    @XmlElement(name = "TotalWorkingHours")
    protected double totalWorkingHours;

    /**
     * Gets the value of the endHour property.
     * 
     */
    public double getEndHour() {
        return endHour;
    }

    /**
     * Sets the value of the endHour property.
     * 
     */
    public void setEndHour(double value) {
        this.endHour = value;
    }

    /**
     * Gets the value of the isWorkingDay property.
     * 
     */
    public boolean isIsWorkingDay() {
        return isWorkingDay;
    }

    /**
     * Sets the value of the isWorkingDay property.
     * 
     */
    public void setIsWorkingDay(boolean value) {
        this.isWorkingDay = value;
    }

    /**
     * Gets the value of the startHour property.
     * 
     */
    public double getStartHour() {
        return startHour;
    }

    /**
     * Sets the value of the startHour property.
     * 
     */
    public void setStartHour(double value) {
        this.startHour = value;
    }

    /**
     * Gets the value of the totalWorkingHours property.
     * 
     */
    public double getTotalWorkingHours() {
        return totalWorkingHours;
    }

    /**
     * Sets the value of the totalWorkingHours property.
     * 
     */
    public void setTotalWorkingHours(double value) {
        this.totalWorkingHours = value;
    }

}
