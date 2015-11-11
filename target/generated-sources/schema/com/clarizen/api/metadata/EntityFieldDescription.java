
package com.clarizen.api.metadata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.clarizen.api.StringList;


/**
 * <p>Java class for EntityFieldDescription complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EntityFieldDescription">
 *   &lt;complexContent>
 *     &lt;extension base="{http://clarizen.com/api/metadata}FieldDescription">
 *       &lt;sequence>
 *         &lt;element name="ReferencedEntities" type="{http://clarizen.com/api}stringList" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EntityFieldDescription", propOrder = {
    "referencedEntities"
})
public class EntityFieldDescription
    extends FieldDescription
{

    @XmlElement(name = "ReferencedEntities", nillable = true)
    protected StringList referencedEntities;

    /**
     * Gets the value of the referencedEntities property.
     * 
     * @return
     *     possible object is
     *     {@link StringList }
     *     
     */
    public StringList getReferencedEntities() {
        return referencedEntities;
    }

    /**
     * Sets the value of the referencedEntities property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringList }
     *     
     */
    public void setReferencedEntities(StringList value) {
        this.referencedEntities = value;
    }

}
