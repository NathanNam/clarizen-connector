
package com.clarizen.api;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DurationType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DurationType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Default"/>
 *     &lt;enumeration value="Consecutive"/>
 *     &lt;enumeration value="OverrideStart"/>
 *     &lt;enumeration value="OverrideEnd"/>
 *     &lt;enumeration value="OverrideBoth"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DurationType")
@XmlEnum
public enum DurationType {

    @XmlEnumValue("Default")
    DEFAULT("Default"),
    @XmlEnumValue("Consecutive")
    CONSECUTIVE("Consecutive"),
    @XmlEnumValue("OverrideStart")
    OVERRIDE_START("OverrideStart"),
    @XmlEnumValue("OverrideEnd")
    OVERRIDE_END("OverrideEnd"),
    @XmlEnumValue("OverrideBoth")
    OVERRIDE_BOTH("OverrideBoth");
    private final String value;

    DurationType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DurationType fromValue(String v) {
        for (DurationType c: DurationType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
