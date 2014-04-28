
package com.clarizen.api;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for GetWidgetUrlMessage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetWidgetUrlMessage">
 *   &lt;complexContent>
 *     &lt;extension base="{http://clarizen.com/api}BaseMessage">
 *       &lt;sequence>
 *         &lt;element name="ExpirationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Format" type="{http://clarizen.com/api}WidgetFormat" minOccurs="0"/>
 *         &lt;element name="Id" type="{http://clarizen.com/api}EntityId" minOccurs="0"/>
 *         &lt;element name="Registered" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetWidgetUrlMessage", propOrder = {
    "expirationDate",
    "format",
    "id",
    "registered"
})
public class GetWidgetUrlMessage
    extends BaseMessage
{

    @XmlElement(name = "ExpirationDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar expirationDate;
    @XmlElement(name = "Format")
    protected WidgetFormat format;
    @XmlElement(name = "Id", nillable = true)
    protected EntityId id;
    @XmlElement(name = "Registered")
    protected Boolean registered;

    /**
     * Gets the value of the expirationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpirationDate() {
        return expirationDate;
    }

    /**
     * Sets the value of the expirationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpirationDate(XMLGregorianCalendar value) {
        this.expirationDate = value;
    }

    /**
     * Gets the value of the format property.
     * 
     * @return
     *     possible object is
     *     {@link WidgetFormat }
     *     
     */
    public WidgetFormat getFormat() {
        return format;
    }

    /**
     * Sets the value of the format property.
     * 
     * @param value
     *     allowed object is
     *     {@link WidgetFormat }
     *     
     */
    public void setFormat(WidgetFormat value) {
        this.format = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link EntityId }
     *     
     */
    public EntityId getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityId }
     *     
     */
    public void setId(EntityId value) {
        this.id = value;
    }

    /**
     * Gets the value of the registered property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRegistered() {
        return registered;
    }

    /**
     * Sets the value of the registered property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRegistered(Boolean value) {
        this.registered = value;
    }

}
