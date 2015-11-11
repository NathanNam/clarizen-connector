
package com.clarizen.api.metadata;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PresentationType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PresentationType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Text"/>
 *     &lt;enumeration value="Numeric"/>
 *     &lt;enumeration value="Date"/>
 *     &lt;enumeration value="Checkbox"/>
 *     &lt;enumeration value="TextArea"/>
 *     &lt;enumeration value="Currency"/>
 *     &lt;enumeration value="Duration"/>
 *     &lt;enumeration value="ReferenceToObject"/>
 *     &lt;enumeration value="PickList"/>
 *     &lt;enumeration value="Url"/>
 *     &lt;enumeration value="Percent"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PresentationType")
@XmlEnum
public enum PresentationType {

    @XmlEnumValue("Text")
    TEXT("Text"),
    @XmlEnumValue("Numeric")
    NUMERIC("Numeric"),
    @XmlEnumValue("Date")
    DATE("Date"),
    @XmlEnumValue("Checkbox")
    CHECKBOX("Checkbox"),
    @XmlEnumValue("TextArea")
    TEXT_AREA("TextArea"),
    @XmlEnumValue("Currency")
    CURRENCY("Currency"),
    @XmlEnumValue("Duration")
    DURATION("Duration"),
    @XmlEnumValue("ReferenceToObject")
    REFERENCE_TO_OBJECT("ReferenceToObject"),
    @XmlEnumValue("PickList")
    PICK_LIST("PickList"),
    @XmlEnumValue("Url")
    URL("Url"),
    @XmlEnumValue("Percent")
    PERCENT("Percent"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    PresentationType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PresentationType fromValue(String v) {
        for (PresentationType c: PresentationType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
