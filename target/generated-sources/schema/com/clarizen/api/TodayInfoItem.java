
package com.clarizen.api;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TodayInfoItem.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TodayInfoItem">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="MyTasks"/>
 *     &lt;enumeration value="MyOverdueTasks"/>
 *     &lt;enumeration value="ManagedTask"/>
 *     &lt;enumeration value="OverdueManagedTask"/>
 *     &lt;enumeration value="MyIssues"/>
 *     &lt;enumeration value="MyOverdueIssues"/>
 *     &lt;enumeration value="SubordinatesIssues"/>
 *     &lt;enumeration value="OverdueSubordinatesIssues"/>
 *     &lt;enumeration value="AprovalTimesheets"/>
 *     &lt;enumeration value="NewProjects"/>
 *     &lt;enumeration value="NewMilestones"/>
 *     &lt;enumeration value="NewTasks"/>
 *     &lt;enumeration value="NewDocuments"/>
 *     &lt;enumeration value="NewNotes"/>
 *     &lt;enumeration value="NewDiscussions"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TodayInfoItem")
@XmlEnum
public enum TodayInfoItem {

    @XmlEnumValue("MyTasks")
    MY_TASKS("MyTasks"),
    @XmlEnumValue("MyOverdueTasks")
    MY_OVERDUE_TASKS("MyOverdueTasks"),
    @XmlEnumValue("ManagedTask")
    MANAGED_TASK("ManagedTask"),
    @XmlEnumValue("OverdueManagedTask")
    OVERDUE_MANAGED_TASK("OverdueManagedTask"),
    @XmlEnumValue("MyIssues")
    MY_ISSUES("MyIssues"),
    @XmlEnumValue("MyOverdueIssues")
    MY_OVERDUE_ISSUES("MyOverdueIssues"),
    @XmlEnumValue("SubordinatesIssues")
    SUBORDINATES_ISSUES("SubordinatesIssues"),
    @XmlEnumValue("OverdueSubordinatesIssues")
    OVERDUE_SUBORDINATES_ISSUES("OverdueSubordinatesIssues"),
    @XmlEnumValue("AprovalTimesheets")
    APROVAL_TIMESHEETS("AprovalTimesheets"),
    @XmlEnumValue("NewProjects")
    NEW_PROJECTS("NewProjects"),
    @XmlEnumValue("NewMilestones")
    NEW_MILESTONES("NewMilestones"),
    @XmlEnumValue("NewTasks")
    NEW_TASKS("NewTasks"),
    @XmlEnumValue("NewDocuments")
    NEW_DOCUMENTS("NewDocuments"),
    @XmlEnumValue("NewNotes")
    NEW_NOTES("NewNotes"),
    @XmlEnumValue("NewDiscussions")
    NEW_DISCUSSIONS("NewDiscussions");
    private final String value;

    TodayInfoItem(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TodayInfoItem fromValue(String v) {
        for (TodayInfoItem c: TodayInfoItem.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
