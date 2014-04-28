
package com.clarizen.api;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CreateMessage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreateMessage">
 *   &lt;complexContent>
 *     &lt;extension base="{http://clarizen.com/api}BaseMessage">
 *       &lt;sequence>
 *         &lt;element name="Entity" type="{http://clarizen.com/api}BaseEntity" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreateMessage", propOrder = {
    "entity"
})
@XmlSeeAlso({
    CreateFromTemplateMessage.class,
    CreateAndRetrieveMessage.class
})
public class CreateMessage
    extends BaseMessage
{

    @XmlElement(name = "Entity", nillable = true)
    protected BaseEntity entity;

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

}
