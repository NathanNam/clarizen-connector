
package com.clarizen.api;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DurationUnit.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DurationUnit">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Minutes"/>
 *     &lt;enumeration value="Hours"/>
 *     &lt;enumeration value="Days"/>
 *     &lt;enumeration value="Weeks"/>
 *     &lt;enumeration value="Months"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DurationUnit")
@XmlEnum
public enum DurationUnit {

    @XmlEnumValue("Minutes")
    MINUTES("Minutes"),
    @XmlEnumValue("Hours")
    HOURS("Hours"),
    @XmlEnumValue("Days")
    DAYS("Days"),
    @XmlEnumValue("Weeks")
    WEEKS("Weeks"),
    @XmlEnumValue("Months")
    MONTHS("Months");
    private final String value;

    DurationUnit(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DurationUnit fromValue(String v) {
        for (DurationUnit c: DurationUnit.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
