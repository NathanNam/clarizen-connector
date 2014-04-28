
package com.clarizen.api.metadata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PickupEntityDescription complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PickupEntityDescription">
 *   &lt;complexContent>
 *     &lt;extension base="{http://clarizen.com/api/metadata}EntityDescription">
 *       &lt;sequence>
 *         &lt;element name="Pickups" type="{http://clarizen.com/api/metadata}ArrayOfPickupDescription" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PickupEntityDescription", propOrder = {
    "pickups"
})
public class PickupEntityDescription
    extends EntityDescription
{

    @XmlElement(name = "Pickups", nillable = true)
    protected ArrayOfPickupDescription pickups;

    /**
     * Gets the value of the pickups property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPickupDescription }
     *     
     */
    public ArrayOfPickupDescription getPickups() {
        return pickups;
    }

    /**
     * Sets the value of the pickups property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPickupDescription }
     *     
     */
    public void setPickups(ArrayOfPickupDescription value) {
        this.pickups = value;
    }

}
