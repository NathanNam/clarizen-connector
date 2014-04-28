
package com.clarizen.api.queries;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.clarizen.api.EntityId;


/**
 * <p>Java class for RecursiveQuery complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RecursiveQuery">
 *   &lt;complexContent>
 *     &lt;extension base="{http://clarizen.com/api/queries}BuiltInQuery">
 *       &lt;sequence>
 *         &lt;element name="Levels" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="RootItemId" type="{http://clarizen.com/api}EntityId" minOccurs="0"/>
 *         &lt;element name="TypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Where" type="{http://clarizen.com/api/queries}Condition" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RecursiveQuery", propOrder = {
    "levels",
    "rootItemId",
    "typeName",
    "where"
})
@XmlSeeAlso({
    WorkItemRecursiveQuery.class
})
public class RecursiveQuery
    extends BuiltInQuery
{

    @XmlElement(name = "Levels")
    protected int levels;
    @XmlElement(name = "RootItemId", nillable = true)
    protected EntityId rootItemId;
    @XmlElement(name = "TypeName", nillable = true)
    protected String typeName;
    @XmlElement(name = "Where", nillable = true)
    protected Condition where;

    /**
     * Gets the value of the levels property.
     * 
     */
    public int getLevels() {
        return levels;
    }

    /**
     * Sets the value of the levels property.
     * 
     */
    public void setLevels(int value) {
        this.levels = value;
    }

    /**
     * Gets the value of the rootItemId property.
     * 
     * @return
     *     possible object is
     *     {@link EntityId }
     *     
     */
    public EntityId getRootItemId() {
        return rootItemId;
    }

    /**
     * Sets the value of the rootItemId property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityId }
     *     
     */
    public void setRootItemId(EntityId value) {
        this.rootItemId = value;
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

    /**
     * Gets the value of the where property.
     * 
     * @return
     *     possible object is
     *     {@link Condition }
     *     
     */
    public Condition getWhere() {
        return where;
    }

    /**
     * Sets the value of the where property.
     * 
     * @param value
     *     allowed object is
     *     {@link Condition }
     *     
     */
    public void setWhere(Condition value) {
        this.where = value;
    }

}
