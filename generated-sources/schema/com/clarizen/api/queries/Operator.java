
package com.clarizen.api.queries;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Operator.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Operator">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Equal"/>
 *     &lt;enumeration value="NotEqual"/>
 *     &lt;enumeration value="LessThan"/>
 *     &lt;enumeration value="GreaterThan"/>
 *     &lt;enumeration value="LessThanOrEqual"/>
 *     &lt;enumeration value="GreaterThanOrEqual"/>
 *     &lt;enumeration value="BeginsWith"/>
 *     &lt;enumeration value="EndsWith"/>
 *     &lt;enumeration value="Contains"/>
 *     &lt;enumeration value="DoesNotContain"/>
 *     &lt;enumeration value="In"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Operator")
@XmlEnum
public enum Operator {

    @XmlEnumValue("Equal")
    EQUAL("Equal"),
    @XmlEnumValue("NotEqual")
    NOT_EQUAL("NotEqual"),
    @XmlEnumValue("LessThan")
    LESS_THAN("LessThan"),
    @XmlEnumValue("GreaterThan")
    GREATER_THAN("GreaterThan"),
    @XmlEnumValue("LessThanOrEqual")
    LESS_THAN_OR_EQUAL("LessThanOrEqual"),
    @XmlEnumValue("GreaterThanOrEqual")
    GREATER_THAN_OR_EQUAL("GreaterThanOrEqual"),
    @XmlEnumValue("BeginsWith")
    BEGINS_WITH("BeginsWith"),
    @XmlEnumValue("EndsWith")
    ENDS_WITH("EndsWith"),
    @XmlEnumValue("Contains")
    CONTAINS("Contains"),
    @XmlEnumValue("DoesNotContain")
    DOES_NOT_CONTAIN("DoesNotContain"),

    /**
     * 
     *                         In is only supported in compare operations where the left side is a FieldExpression which represents a "reference to entity" field and the right side is a QueryExpression
     *                     
     * 
     */
    @XmlEnumValue("In")
    IN("In");
    private final String value;

    Operator(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Operator fromValue(String v) {
        for (Operator c: Operator.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
