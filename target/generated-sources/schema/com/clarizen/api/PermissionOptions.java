
package com.clarizen.api;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PermissionOptions.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PermissionOptions">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Object"/>
 *     &lt;enumeration value="ObjectAndFields"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PermissionOptions")
@XmlEnum
public enum PermissionOptions {

    @XmlEnumValue("Object")
    OBJECT("Object"),
    @XmlEnumValue("ObjectAndFields")
    OBJECT_AND_FIELDS("ObjectAndFields");
    private final String value;

    PermissionOptions(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PermissionOptions fromValue(String v) {
        for (PermissionOptions c: PermissionOptions.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
