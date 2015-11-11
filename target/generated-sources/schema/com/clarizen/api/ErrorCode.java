
package com.clarizen.api;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ErrorCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ErrorCode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="EntityNotFound"/>
 *     &lt;enumeration value="InvalidArgument"/>
 *     &lt;enumeration value="MissingArgument"/>
 *     &lt;enumeration value="InvalidOperation"/>
 *     &lt;enumeration value="DuplicateKey"/>
 *     &lt;enumeration value="InvalidField"/>
 *     &lt;enumeration value="InvalidType"/>
 *     &lt;enumeration value="FileNotFound"/>
 *     &lt;enumeration value="VirusCheckFailed"/>
 *     &lt;enumeration value="Unauthorized"/>
 *     &lt;enumeration value="UnsupportedClient"/>
 *     &lt;enumeration value="General"/>
 *     &lt;enumeration value="Internal"/>
 *     &lt;enumeration value="ValidationRuleError"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ErrorCode")
@XmlEnum
public enum ErrorCode {

    @XmlEnumValue("EntityNotFound")
    ENTITY_NOT_FOUND("EntityNotFound"),
    @XmlEnumValue("InvalidArgument")
    INVALID_ARGUMENT("InvalidArgument"),
    @XmlEnumValue("MissingArgument")
    MISSING_ARGUMENT("MissingArgument"),
    @XmlEnumValue("InvalidOperation")
    INVALID_OPERATION("InvalidOperation"),
    @XmlEnumValue("DuplicateKey")
    DUPLICATE_KEY("DuplicateKey"),
    @XmlEnumValue("InvalidField")
    INVALID_FIELD("InvalidField"),
    @XmlEnumValue("InvalidType")
    INVALID_TYPE("InvalidType"),
    @XmlEnumValue("FileNotFound")
    FILE_NOT_FOUND("FileNotFound"),
    @XmlEnumValue("VirusCheckFailed")
    VIRUS_CHECK_FAILED("VirusCheckFailed"),
    @XmlEnumValue("Unauthorized")
    UNAUTHORIZED("Unauthorized"),
    @XmlEnumValue("UnsupportedClient")
    UNSUPPORTED_CLIENT("UnsupportedClient"),
    @XmlEnumValue("General")
    GENERAL("General"),
    @XmlEnumValue("Internal")
    INTERNAL("Internal"),
    @XmlEnumValue("ValidationRuleError")
    VALIDATION_RULE_ERROR("ValidationRuleError");
    private final String value;

    ErrorCode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ErrorCode fromValue(String v) {
        for (ErrorCode c: ErrorCode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
