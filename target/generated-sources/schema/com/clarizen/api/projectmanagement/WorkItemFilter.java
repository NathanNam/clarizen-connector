
package com.clarizen.api.projectmanagement;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WorkItemFilter.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="WorkItemFilter">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="IHaveAnyRole"/>
 *     &lt;enumeration value="IManageTheProject"/>
 *     &lt;enumeration value="IAmAManager"/>
 *     &lt;enumeration value="IAmAResource"/>
 *     &lt;enumeration value="IAmAReviewer"/>
 *     &lt;enumeration value="IAmAManagerOrAResource"/>
 *     &lt;enumeration value="All"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "WorkItemFilter")
@XmlEnum
public enum WorkItemFilter {

    @XmlEnumValue("IHaveAnyRole")
    I_HAVE_ANY_ROLE("IHaveAnyRole"),
    @XmlEnumValue("IManageTheProject")
    I_MANAGE_THE_PROJECT("IManageTheProject"),
    @XmlEnumValue("IAmAManager")
    I_AM_A_MANAGER("IAmAManager"),
    @XmlEnumValue("IAmAResource")
    I_AM_A_RESOURCE("IAmAResource"),
    @XmlEnumValue("IAmAReviewer")
    I_AM_A_REVIEWER("IAmAReviewer"),
    @XmlEnumValue("IAmAManagerOrAResource")
    I_AM_A_MANAGER_OR_A_RESOURCE("IAmAManagerOrAResource"),
    @XmlEnumValue("All")
    ALL("All");
    private final String value;

    WorkItemFilter(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static WorkItemFilter fromValue(String v) {
        for (WorkItemFilter c: WorkItemFilter.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
