
package com.clarizen.api.files;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Storage.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Storage">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Server"/>
 *     &lt;enumeration value="Url"/>
 *     &lt;enumeration value="Link"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Storage")
@XmlEnum
public enum Storage {

    @XmlEnumValue("Server")
    SERVER("Server"),
    @XmlEnumValue("Url")
    URL("Url"),
    @XmlEnumValue("Link")
    LINK("Link");
    private final String value;

    Storage(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Storage fromValue(String v) {
        for (Storage c: Storage.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
