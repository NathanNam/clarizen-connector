
package com.clarizen.api.queries;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.clarizen.api.BaseEntity;
import com.clarizen.api.StringList;


/**
 * <p>Java class for QueryByExample complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QueryByExample">
 *   &lt;complexContent>
 *     &lt;extension base="{http://clarizen.com/api/queries}Query">
 *       &lt;sequence>
 *         &lt;element name="Entity" type="{http://clarizen.com/api}BaseEntity" minOccurs="0"/>
 *         &lt;element name="Fields" type="{http://clarizen.com/api}stringList" minOccurs="0"/>
 *         &lt;element name="Orders" type="{http://clarizen.com/api/queries}ArrayOfOrderBy" minOccurs="0"/>
 *         &lt;element name="TypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryByExample", propOrder = {
    "entity",
    "fields",
    "orders",
    "typeName"
})
public class QueryByExample
    extends Query
{

    @XmlElement(name = "Entity", nillable = true)
    protected BaseEntity entity;
    @XmlElement(name = "Fields", nillable = true)
    protected StringList fields;
    @XmlElement(name = "Orders", nillable = true)
    protected ArrayOfOrderBy orders;
    @XmlElement(name = "TypeName", nillable = true)
    protected String typeName;

    /**
     * Gets the value of the entity property.
     * 
     * @return
     *     possible object is
     *     {@link BaseEntity }
     *     
     */
    public BaseEntity getEntity() {
        return entity;
    }

    /**
     * Sets the value of the entity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseEntity }
     *     
     */
    public void setEntity(BaseEntity value) {
        this.entity = value;
    }

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

    /**
     * Gets the value of the typeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeName() {
        return typeName;
    }

    /**
     * Sets the value of the typeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeName(String value) {
        this.typeName = value;
    }

}
