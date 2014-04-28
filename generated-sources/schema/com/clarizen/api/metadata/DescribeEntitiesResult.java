
package com.clarizen.api.metadata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.clarizen.api.Result;


/**
 * <p>Java class for DescribeEntitiesResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DescribeEntitiesResult">
 *   &lt;complexContent>
 *     &lt;extension base="{http://clarizen.com/api}Result">
 *       &lt;sequence>
 *         &lt;element name="EntityDescriptions" type="{http://clarizen.com/api/metadata}ArrayOfEntityDescription" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DescribeEntitiesResult", propOrder = {
    "entityDescriptions"
})
public class DescribeEntitiesResult
    extends Result
{

    @XmlElement(name = "EntityDescriptions", nillable = true)
    protected ArrayOfEntityDescription entityDescriptions;

    /**
     * Gets the value of the entityDescriptions property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfEntityDescription }
     *     
     */
    public ArrayOfEntityDescription getEntityDescriptions() {
        return entityDescriptions;
    }

    /**
     * Sets the value of the entityDescriptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfEntityDescription }
     *     
     */
    public void setEntityDescriptions(ArrayOfEntityDescription value) {
        this.entityDescriptions = value;
    }

}
