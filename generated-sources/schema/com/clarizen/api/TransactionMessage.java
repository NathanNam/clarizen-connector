
package com.clarizen.api;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransactionMessage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TransactionMessage">
 *   &lt;complexContent>
 *     &lt;extension base="{http://clarizen.com/api}BaseMessage">
 *       &lt;sequence>
 *         &lt;element name="Messages" type="{http://clarizen.com/api}ArrayOfBaseMessage" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransactionMessage", propOrder = {
    "messages"
})
public class TransactionMessage
    extends BaseMessage
{

    @XmlElement(name = "Messages", nillable = true)
    protected ArrayOfBaseMessage messages;

    /**
     * Gets the value of the messages property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfBaseMessage }
     *     
     */
    public ArrayOfBaseMessage getMessages() {
        return messages;
    }

    /**
     * Sets the value of the messages property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfBaseMessage }
     *     
     */
    public void setMessages(ArrayOfBaseMessage value) {
        this.messages = value;
    }

}
