
package com.clarizen.api.projectmanagement;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WorkItemType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="WorkItemType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Project"/>
 *     &lt;enumeration value="Milestone"/>
 *     &lt;enumeration value="Task"/>
 *     &lt;enumeration value="All"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "WorkItemType")
@XmlEnum
public enum WorkItemType {

    @XmlEnumValue("Project")
    PROJECT("Project"),
    @XmlEnumValue("Milestone")
    MILESTONE("Milestone"),
    @XmlEnumValue("Task")
    TASK("Task"),
    @XmlEnumValue("All")
    ALL("All");
    private final String value;

    WorkItemType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static WorkItemType fromValue(String v) {
        for (WorkItemType c: WorkItemType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
