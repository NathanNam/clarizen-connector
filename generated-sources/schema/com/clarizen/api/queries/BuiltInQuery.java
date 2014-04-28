
package com.clarizen.api.queries;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.clarizen.api.FindCustomerQuery;
import com.clarizen.api.FindUserQuery;
import com.clarizen.api.StringList;
import com.clarizen.api.TodayQuery;
import com.clarizen.api.projectmanagement.CommentsQuery;
import com.clarizen.api.projectmanagement.DocumentsQuery;
import com.clarizen.api.projectmanagement.MyWorkItemsQuery;
import com.clarizen.api.projectmanagement.ProjectIssuesQuery;
import com.clarizen.api.projectmanagement.WorkItemsByFileNameQuery;


/**
 * <p>Java class for BuiltInQuery complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BuiltInQuery">
 *   &lt;complexContent>
 *     &lt;extension base="{http://clarizen.com/api/queries}Query">
 *       &lt;sequence>
 *         &lt;element name="Fields" type="{http://clarizen.com/api}stringList" minOccurs="0"/>
 *         &lt;element name="Orders" type="{http://clarizen.com/api/queries}ArrayOfOrderBy" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BuiltInQuery", propOrder = {
    "fields",
    "orders"
})
@XmlSeeAlso({
    FindUserQuery.class,
    TodayQuery.class,
    FindCustomerQuery.class,
    RecursiveQuery.class,
    WorkItemsByFileNameQuery.class,
    DocumentsQuery.class,
    MyWorkItemsQuery.class,
    CommentsQuery.class,
    ProjectIssuesQuery.class
})
public class BuiltInQuery
    extends Query
{

    @XmlElement(name = "Fields", nillable = true)
    protected StringList fields;
    @XmlElement(name = "Orders", nillable = true)
    protected ArrayOfOrderBy orders;

    /**
     * Gets the value of the fields property.
     * 
     * @return
     *     possible object is
     *     {@link StringList }
     *     
     */
    public StringList getFields() {
        return fields;
    }

    /**
     * Sets the value of the fields property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringList }
     *     
     */
    public void setFields(StringList value) {
        this.fields = value;
    }

    /**
     * Gets the value of the orders property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOrderBy }
     *     
     */
    public ArrayOfOrderBy getOrders() {
        return orders;
    }

    /**
     * Sets the value of the orders property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOrderBy }
     *     
     */
    public void setOrders(ArrayOfOrderBy value) {
        this.orders = value;
    }

}
