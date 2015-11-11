
package com.clarizen.api;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SendEMailMessage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SendEMailMessage">
 *   &lt;complexContent>
 *     &lt;extension base="{http://clarizen.com/api}BaseMessage">
 *       &lt;sequence>
 *         &lt;element name="AccessType" type="{http://clarizen.com/api}AccessType" minOccurs="0"/>
 *         &lt;element name="Body" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Recipients" type="{http://clarizen.com/api}ArrayOfRecipient" minOccurs="0"/>
 *         &lt;element name="RelatedEntity" type="{http://clarizen.com/api}EntityId" minOccurs="0"/>
 *         &lt;element name="Subject" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SendEMailMessage", propOrder = {
    "accessType",
    "body",
    "recipients",
    "relatedEntity",
    "subject"
})
public class SendEMailMessage
    extends BaseMessage
{

    @XmlElement(name = "AccessType")
    protected AccessType accessType;
    @XmlElement(name = "Body", nillable = true)
    protected String body;
    @XmlElement(name = "Recipients", nillable = true)
    protected ArrayOfRecipient recipients;
    @XmlElement(name = "RelatedEntity", nillable = true)
    protected EntityId relatedEntity;
    @XmlElement(name = "Subject", nillable = true)
    protected String subject;

    /**
     * Gets the value of the accessType property.
     * 
     * @return
     *     possible object is
     *     {@link AccessType }
     *     
     */
    public AccessType getAccessType() {
        return accessType;
    }

    /**
     * Sets the value of the accessType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccessType }
     *     
     */
    public void setAccessType(AccessType value) {
        this.accessType = value;
    }

    /**
     * Gets the value of the body property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBody() {
        return body;
    }

    /**
     * Sets the value of the body property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBody(String value) {
        this.body = value;
    }

    /**
     * Gets the value of the recipients property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRecipient }
     *     
     */
    public ArrayOfRecipient getRecipients() {
        return recipients;
    }

    /**
     * Sets the value of the recipients property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRecipient }
     *     
     */
    public void setRecipients(ArrayOfRecipient value) {
        this.recipients = value;
    }

    /**
     * Gets the value of the relatedEntity property.
     * 
     * @return
     *     possible object is
     *     {@link EntityId }
     *     
     */
    public EntityId getRelatedEntity() {
        return relatedEntity;
    }

    /**
     * Sets the value of the relatedEntity property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityId }
     *     
     */
    public void setRelatedEntity(EntityId value) {
        this.relatedEntity = value;
    }

    /**
     * Gets the value of the subject property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubject() {
        return subject;
    }

    /**
     * Sets the value of the subject property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubject(String value) {
        this.subject = value;
    }

}
