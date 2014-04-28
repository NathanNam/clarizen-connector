
package com.clarizen.api.projectmanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.clarizen.api.queries.BuiltInQuery;


/**
 * <p>Java class for MyWorkItemsQuery complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MyWorkItemsQuery">
 *   &lt;complexContent>
 *     &lt;extension base="{http://clarizen.com/api/queries}BuiltInQuery">
 *       &lt;sequence>
 *         &lt;element name="ItemsFilter" type="{http://clarizen.com/api/projectManagement}WorkItemFilter" minOccurs="0"/>
 *         &lt;element name="ItemsState" type="{http://clarizen.com/api/projectManagement}WorkItemState" minOccurs="0"/>
 *         &lt;element name="ItemsType" type="{http://clarizen.com/api/projectManagement}WorkItemType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MyWorkItemsQuery", propOrder = {
    "itemsFilter",
    "itemsState",
    "itemsType"
})
@XmlSeeAlso({
    WorkItemsQuery.class
})
public class MyWorkItemsQuery
    extends BuiltInQuery
{

    @XmlElement(name = "ItemsFilter")
    protected WorkItemFilter itemsFilter;
    @XmlElement(name = "ItemsState")
    protected WorkItemState itemsState;
    @XmlElement(name = "ItemsType")
    protected WorkItemType itemsType;

    /**
     * Gets the value of the itemsFilter property.
     * 
     * @return
     *     possible object is
     *     {@link WorkItemFilter }
     *     
     */
    public WorkItemFilter getItemsFilter() {
        return itemsFilter;
    }

    /**
     * Sets the value of the itemsFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkItemFilter }
     *     
     */
    public void setItemsFilter(WorkItemFilter value) {
        this.itemsFilter = value;
    }

    /**
     * Gets the value of the itemsState property.
     * 
     * @return
     *     possible object is
     *     {@link WorkItemState }
     *     
     */
    public WorkItemState getItemsState() {
        return itemsState;
    }

    /**
     * Sets the value of the itemsState property.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkItemState }
     *     
     */
    public void setItemsState(WorkItemState value) {
        this.itemsState = value;
    }

    /**
     * Gets the value of the itemsType property.
     * 
     * @return
     *     possible object is
     *     {@link WorkItemType }
     *     
     */
    public WorkItemType getItemsType() {
        return itemsType;
    }

    /**
     * Sets the value of the itemsType property.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkItemType }
     *     
     */
    public void setItemsType(WorkItemType value) {
        this.itemsType = value;
    }

}
