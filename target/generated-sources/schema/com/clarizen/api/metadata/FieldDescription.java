
package com.clarizen.api.metadata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FieldDescription complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FieldDescription">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Type" type="{http://clarizen.com/api/metadata}FieldType" minOccurs="0"/>
 *         &lt;element name="Calculated" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="CreateOnly" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Custom" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="DefaultValue" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *         &lt;element name="Internal" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Label" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Nullable" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="PresentationType" type="{http://clarizen.com/api/metadata}PresentationType" minOccurs="0"/>
 *         &lt;element name="System" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Updateable" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Visible" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="DecimalPlaces" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FieldDescription", propOrder = {
    "name",
    "type",
    "calculated",
    "createOnly",
    "custom",
    "defaultValue",
    "internal",
    "label",
    "nullable",
    "presentationType",
    "system",
    "updateable",
    "visible",
    "decimalPlaces"
})
@XmlSeeAlso({
    EntityFieldDescription.class
})
public class FieldDescription {

    @XmlElement(name = "Name", nillable = true)
    protected String name;
    @XmlElement(name = "Type")
    protected FieldType type;
    @XmlElement(name = "Calculated")
    protected boolean calculated;
    @XmlElement(name = "CreateOnly")
    protected boolean createOnly;
    @XmlElement(name = "Custom")
    protected boolean custom;
    @XmlElement(name = "DefaultValue", nillable = true)
    protected Object defaultValue;
    @XmlElement(name = "Internal")
    protected boolean internal;
    @XmlElement(name = "Label", nillable = true)
    protected String label;
    @XmlElement(name = "Nullable")
    protected boolean nullable;
    @XmlElement(name = "PresentationType")
    protected PresentationType presentationType;
    @XmlElement(name = "System")
    protected boolean system;
    @XmlElement(name = "Updateable")
    protected boolean updateable;
    @XmlElement(name = "Visible")
    protected boolean visible;
    @XmlElement(name = "DecimalPlaces")
    protected int decimalPlaces;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link FieldType }
     *     
     */
    public FieldType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldType }
     *     
     */
    public void setType(FieldType value) {
        this.type = value;
    }

    /**
     * Gets the value of the calculated property.
     * 
     */
    public boolean isCalculated() {
        return calculated;
    }

    /**
     * Sets the value of the calculated property.
     * 
     */
    public void setCalculated(boolean value) {
        this.calculated = value;
    }

    /**
     * Gets the value of the createOnly property.
     * 
     */
    public boolean isCreateOnly() {
        return createOnly;
    }

    /**
     * Sets the value of the createOnly property.
     * 
     */
    public void setCreateOnly(boolean value) {
        this.createOnly = value;
    }

    /**
     * Gets the value of the custom property.
     * 
     */
    public boolean isCustom() {
        return custom;
    }

    /**
     * Sets the value of the custom property.
     * 
     */
    public void setCustom(boolean value) {
        this.custom = value;
    }

    /**
     * Gets the value of the defaultValue property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getDefaultValue() {
        return defaultValue;
    }

    /**
     * Sets the value of the defaultValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setDefaultValue(Object value) {
        this.defaultValue = value;
    }

    /**
     * Gets the value of the internal property.
     * 
     */
    public boolean isInternal() {
        return internal;
    }

    /**
     * Sets the value of the internal property.
     * 
     */
    public void setInternal(boolean value) {
        this.internal = value;
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
     * Gets the value of the nullable property.
     * 
     */
    public boolean isNullable() {
        return nullable;
    }

    /**
     * Sets the value of the nullable property.
     * 
     */
    public void setNullable(boolean value) {
        this.nullable = value;
    }

    /**
     * Gets the value of the presentationType property.
     * 
     * @return
     *     possible object is
     *     {@link PresentationType }
     *     
     */
    public PresentationType getPresentationType() {
        return presentationType;
    }

    /**
     * Sets the value of the presentationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PresentationType }
     *     
     */
    public void setPresentationType(PresentationType value) {
        this.presentationType = value;
    }

    /**
     * Gets the value of the system property.
     * 
     */
    public boolean isSystem() {
        return system;
    }

    /**
     * Sets the value of the system property.
     * 
     */
    public void setSystem(boolean value) {
        this.system = value;
    }

    /**
     * Gets the value of the updateable property.
     * 
     */
    public boolean isUpdateable() {
        return updateable;
    }

    /**
     * Sets the value of the updateable property.
     * 
     */
    public void setUpdateable(boolean value) {
        this.updateable = value;
    }

    /**
     * Gets the value of the visible property.
     * 
     */
    public boolean isVisible() {
        return visible;
    }

    /**
     * Sets the value of the visible property.
     * 
     */
    public void setVisible(boolean value) {
        this.visible = value;
    }

    /**
     * Gets the value of the decimalPlaces property.
     * 
     */
    public int getDecimalPlaces() {
        return decimalPlaces;
    }

    /**
     * Sets the value of the decimalPlaces property.
     * 
     */
    public void setDecimalPlaces(int value) {
        this.decimalPlaces = value;
    }

}
