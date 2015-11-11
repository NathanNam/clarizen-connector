
package com.clarizen.api.projectmanagement;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WorkItemState.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="WorkItemState">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="All"/>
 *     &lt;enumeration value="Active"/>
 *     &lt;enumeration value="Cancelled"/>
 *     &lt;enumeration value="Draft"/>
 *     &lt;enumeration value="Completed"/>
 *     &lt;enumeration value="OnHold"/>
 *     &lt;enumeration value="Current"/>
 *     &lt;enumeration value="Upcoming"/>
 *     &lt;enumeration value="InTheWorks"/>
 *     &lt;enumeration value="Executable"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "WorkItemState")
@XmlEnum
public enum WorkItemState {

    @XmlEnumValue("All")
    ALL("All"),
    @XmlEnumValue("Active")
    ACTIVE("Active"),
    @XmlEnumValue("Cancelled")
    CANCELLED("Cancelled"),
    @XmlEnumValue("Draft")
    DRAFT("Draft"),
    @XmlEnumValue("Completed")
    COMPLETED("Completed"),
    @XmlEnumValue("OnHold")
    ON_HOLD("OnHold"),
    @XmlEnumValue("Current")
    CURRENT("Current"),
    @XmlEnumValue("Upcoming")
    UPCOMING("Upcoming"),
    @XmlEnumValue("InTheWorks")
    IN_THE_WORKS("InTheWorks"),
    @XmlEnumValue("Executable")
    EXECUTABLE("Executable");
    private final String value;

    WorkItemState(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static WorkItemState fromValue(String v) {
        for (WorkItemState c: WorkItemState.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
