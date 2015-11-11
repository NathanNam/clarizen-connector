
package com.clarizen.api.metadata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.clarizen.api.StringList;


/**
 * <p>Java class for EntityDescription complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EntityDescription">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Fields" type="{http://clarizen.com/api/metadata}ArrayOfFieldDescription" minOccurs="0"/>
 *         &lt;element name="TypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ValidStates" type="{http://clarizen.com/api}stringList" minOccurs="0"/>
 *         &lt;element name="Label" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LabelPlural" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EntityDescription", propOrder = {
    "fields",
    "typeName",
    "validStates",
    "label",
    "labelPlural"
})
@XmlSeeAlso({
    LinkEntityDescription.class,
    PickupEntityDescription.class
})
public class EntityDescription {

    @XmlElement(name = "Fields", nillable = true)
    protected ArrayOfFieldDescription fields;
    @XmlElement(name = "TypeName", nillable = true)
    protected String typeName;
    @XmlElement(name = "ValidStates", nillable = true)
    protected StringList validStates;
    @XmlElement(name = "Label", nillable = true)
    protected String label;
    @XmlElement(name = "LabelPlural", nillable = true)
    protected String labelPlural;

    /**
     * Gets the value of the fields property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfFieldDescription }
     *     
     */
    public ArrayOfFieldDescription getFields() {
        return fields;
    }

    /**
     * Sets the value of the fields property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfFieldDescription }
     *     
     */
    public void setFields(ArrayOfFieldDescription value) {
        this.fields = value;
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
     * Gets the value of the validStates property.
     * 
     * @return
     *     possible object is
     *     {@link StringList }
     *     
     */
    public StringList getValidStates() {
        return validStates;
    }

    /**
     * Sets the value of the validStates property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringList }
     *     
     */
    public void setValidStates(StringList value) {
        this.validStates = value;
    }

    /**
     * Gets the value of the label property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabel() {
        return label;
    }

    /**
     * Sets the value of the label property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabel(String value) {
        this.label = value;
    }

    /**
     * Gets the value of the labelPlural property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabelPlural() {
        return labelPlural;
    }

    /**
     * Sets the value of the labelPlural property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabelPlural(String value) {
        this.labelPlural = value;
    }

}
