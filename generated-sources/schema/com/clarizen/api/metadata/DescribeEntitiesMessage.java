
package com.clarizen.api.metadata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.clarizen.api.StringList;


/**
 * <p>Java class for DescribeEntitiesMessage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DescribeEntitiesMessage">
 *   &lt;complexContent>
 *     &lt;extension base="{http://clarizen.com/api/metadata}MetadataMessage">
 *       &lt;sequence>
 *         &lt;element name="TypeNames" type="{http://clarizen.com/api}stringList" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DescribeEntitiesMessage", propOrder = {
    "typeNames"
})
public class DescribeEntitiesMessage
    extends MetadataMessage
{

    @XmlElement(name = "TypeNames", nillable = true)
    protected StringList typeNames;

    /**
     * Gets the value of the typeNames property.
     * 
     * @return
     *     possible object is
     *     {@link StringList }
     *     
     */
    public StringList getTypeNames() {
        return typeNames;
    }

    /**
     * Sets the value of the typeNames property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringList }
     *     
     */
    public void setTypeNames(StringList value) {
        this.typeNames = value;
    }

}
