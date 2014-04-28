
package com.clarizen.api.projectmanagement;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CommentVisibility.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CommentVisibility">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="All"/>
 *     &lt;enumeration value="Private"/>
 *     &lt;enumeration value="Public"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CommentVisibility")
@XmlEnum
public enum CommentVisibility {

    @XmlEnumValue("All")
    ALL("All"),
    @XmlEnumValue("Private")
    PRIVATE("Private"),
    @XmlEnumValue("Public")
    PUBLIC("Public");
    private final String value;

    CommentVisibility(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CommentVisibility fromValue(String v) {
        for (CommentVisibility c: CommentVisibility.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
