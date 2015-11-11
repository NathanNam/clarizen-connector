
package com.clarizen.api;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetCalendarInfoResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetCalendarInfoResult">
 *   &lt;complexContent>
 *     &lt;extension base="{http://clarizen.com/api}Result">
 *       &lt;sequence>
 *         &lt;element name="DefaultWorkingDay" type="{http://clarizen.com/api}DayInformation" minOccurs="0"/>
 *         &lt;element name="WeekDayInformation" type="{http://clarizen.com/api}ArrayOfDayInformation" minOccurs="0"/>
 *         &lt;element name="WeekStartsOn" type="{http://clarizen.com/api}Day"/>
 *         &lt;element name="WorkingDaysPerMonth" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetCalendarInfoResult", propOrder = {
    "defaultWorkingDay",
    "weekDayInformation",
    "weekStartsOn",
    "workingDaysPerMonth"
})
public class GetCalendarInfoResult
    extends Result
{

    @XmlElement(name = "DefaultWorkingDay", nillable = true)
    protected DayInformation defaultWorkingDay;
    @XmlElement(name = "WeekDayInformation", nillable = true)
    protected ArrayOfDayInformation weekDayInformation;
    @XmlElement(name = "WeekStartsOn", required = true)
    protected Day weekStartsOn;
    @XmlElement(name = "WorkingDaysPerMonth")
    protected Integer workingDaysPerMonth;

    /**
     * Gets the value of the defaultWorkingDay property.
     * 
     * @return
     *     possible object is
     *     {@link DayInformation }
     *     
     */
    public DayInformation getDefaultWorkingDay() {
        return defaultWorkingDay;
    }

    /**
     * Sets the value of the defaultWorkingDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link DayInformation }
     *     
     */
    public void setDefaultWorkingDay(DayInformation value) {
        this.defaultWorkingDay = value;
    }

    /**
     * Gets the value of the weekDayInformation property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDayInformation }
     *     
     */
    public ArrayOfDayInformation getWeekDayInformation() {
        return weekDayInformation;
    }

    /**
     * Sets the value of the weekDayInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDayInformation }
     *     
     */
    public void setWeekDayInformation(ArrayOfDayInformation value) {
        this.weekDayInformation = value;
    }

    /**
     * Gets the value of the weekStartsOn property.
     * 
     * @return
     *     possible object is
     *     {@link Day }
     *     
     */
    public Day getWeekStartsOn() {
        return weekStartsOn;
    }

    /**
     * Sets the value of the weekStartsOn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Day }
     *     
     */
    public void setWeekStartsOn(Day value) {
        this.weekStartsOn = value;
    }

    /**
     * Gets the value of the workingDaysPerMonth property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getWorkingDaysPerMonth() {
        return workingDaysPerMonth;
    }

    /**
     * Sets the value of the workingDaysPerMonth property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setWorkingDaysPerMonth(Integer value) {
        this.workingDaysPerMonth = value;
    }

}
