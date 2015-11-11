
package com.clarizen.api;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LicenseType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LicenseType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Full"/>
 *     &lt;enumeration value="Limited"/>
 *     &lt;enumeration value="Email"/>
 *     &lt;enumeration value="None"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LicenseType")
@XmlEnum
public enum LicenseType {

    @XmlEnumValue("Full")
    FULL("Full"),
    @XmlEnumValue("Limited")
    LIMITED("Limited"),
    @XmlEnumValue("Email")
    EMAIL("Email"),
    @XmlEnumValue("None")
    NONE("None");
    private final String value;

    LicenseType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LicenseType fromValue(String v) {
        for (LicenseType c: LicenseType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
