
package com.clarizen.api;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CreateFromTemplateMessage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreateFromTemplateMessage">
 *   &lt;complexContent>
 *     &lt;extension base="{http://clarizen.com/api}CreateMessage">
 *       &lt;sequence>
 *         &lt;element name="ParentId" type="{http://clarizen.com/api}EntityId" minOccurs="0"/>
 *         &lt;element name="TemplateName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreateFromTemplateMessage", propOrder = {
    "parentId",
    "templateName"
})
public class CreateFromTemplateMessage
    extends CreateMessage
{

    @XmlElement(name = "ParentId", nillable = true)
    protected EntityId parentId;
    @XmlElement(name = "TemplateName", nillable = true)
    protected String templateName;

    /**
     * Gets the value of the parentId property.
     * 
     * @return
     *     possible object is
     *     {@link EntityId }
     *     
     */
    public EntityId getParentId() {
        return parentId;
    }

    /**
     * Sets the value of the parentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityId }
     *     
     */
    public void setParentId(EntityId value) {
        this.parentId = value;
    }

    /**
     * Gets the value of the templateName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTemplateName() {
        return templateName;
    }

    /**
     * Sets the value of the templateName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTemplateName(String value) {
        this.templateName = value;
    }

}
