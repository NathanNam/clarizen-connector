
package com.clarizen.api.metadata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LinkEntityDescription complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LinkEntityDescription">
 *   &lt;complexContent>
 *     &lt;extension base="{http://clarizen.com/api/metadata}EntityDescription">
 *       &lt;sequence>
 *         &lt;element name="PossibleLinks" type="{http://clarizen.com/api/metadata}ArrayOfPossibleLinkDescription" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LinkEntityDescription", propOrder = {
    "possibleLinks"
})
public class LinkEntityDescription
    extends EntityDescription
{

    @XmlElement(name = "PossibleLinks", nillable = true)
    protected ArrayOfPossibleLinkDescription possibleLinks;

    /**
     * Gets the value of the possibleLinks property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPossibleLinkDescription }
     *     
     */
    public ArrayOfPossibleLinkDescription getPossibleLinks() {
        return possibleLinks;
    }

    /**
     * Sets the value of the possibleLinks property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPossibleLinkDescription }
     *     
     */
    public void setPossibleLinks(ArrayOfPossibleLinkDescription value) {
        this.possibleLinks = value;
    }

}
