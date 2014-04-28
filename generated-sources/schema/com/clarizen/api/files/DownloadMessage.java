
package com.clarizen.api.files;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.clarizen.api.BaseMessage;
import com.clarizen.api.EntityId;


/**
 * <p>Java class for DownloadMessage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DownloadMessage">
 *   &lt;complexContent>
 *     &lt;extension base="{http://clarizen.com/api}BaseMessage">
 *       &lt;sequence>
 *         &lt;element name="DocumentId" type="{http://clarizen.com/api}EntityId" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DownloadMessage", propOrder = {
    "documentId"
})
public class DownloadMessage
    extends BaseMessage
{

    @XmlElement(name = "DocumentId", nillable = true)
    protected EntityId documentId;

    /**
     * Gets the value of the documentId property.
     * 
     * @return
     *     possible object is
     *     {@link EntityId }
     *     
     */
    public EntityId getDocumentId() {
        return documentId;
    }

    /**
     * Sets the value of the documentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityId }
     *     
     */
    public void setDocumentId(EntityId value) {
        this.documentId = value;
    }

}
