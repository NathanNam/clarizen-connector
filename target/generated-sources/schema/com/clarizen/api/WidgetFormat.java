
package com.clarizen.api;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WidgetFormat.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="WidgetFormat">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Roadmap"/>
 *     &lt;enumeration value="Gantt"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "WidgetFormat")
@XmlEnum
public enum WidgetFormat {

    @XmlEnumValue("Roadmap")
    ROADMAP("Roadmap"),
    @XmlEnumValue("Gantt")
    GANTT("Gantt");
    private final String value;

    WidgetFormat(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static WidgetFormat fromValue(String v) {
        for (WidgetFormat c: WidgetFormat.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
