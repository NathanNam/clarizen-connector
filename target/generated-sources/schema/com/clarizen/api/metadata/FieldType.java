
package com.clarizen.api.metadata;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FieldType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FieldType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Boolean"/>
 *     &lt;enumeration value="String"/>
 *     &lt;enumeration value="Integer"/>
 *     &lt;enumeration value="Long"/>
 *     &lt;enumeration value="Double"/>
 *     &lt;enumeration value="DateTime"/>
 *     &lt;enumeration value="Date"/>
 *     &lt;enumeration value="Entity"/>
 *     &lt;enumeration value="Duration"/>
 *     &lt;enumeration value="Money"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FieldType")
@XmlEnum
public enum FieldType {

    @XmlEnumValue("Boolean")
    BOOLEAN("Boolean"),
    @XmlEnumValue("String")
    STRING("String"),
    @XmlEnumValue("Integer")
    INTEGER("Integer"),
    @XmlEnumValue("Long")
    LONG("Long"),
    @XmlEnumValue("Double")
    DOUBLE("Double"),
    @XmlEnumValue("DateTime")
    DATE_TIME("DateTime"),
    @XmlEnumValue("Date")
    DATE("Date"),
    @XmlEnumValue("Entity")
    ENTITY("Entity"),
    @XmlEnumValue("Duration")
    DURATION("Duration"),
    @XmlEnumValue("Money")
    MONEY("Money");
    private final String value;

    FieldType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FieldType fromValue(String v) {
        for (FieldType c: FieldType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
