
package com.clarizen.api.files;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.clarizen.api.BaseMessage;
import com.clarizen.api.EntityId;


/**
 * <p>Java class for UploadMessage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UploadMessage">
 *   &lt;complexContent>
 *     &lt;extension base="{http://clarizen.com/api}BaseMessage">
 *       &lt;sequence>
 *         &lt;element name="DocumentId" type="{http://clarizen.com/api}EntityId" minOccurs="0"/>
 *         &lt;element name="FileInformation" type="{http://clarizen.com/api/files}FileInformation" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UploadMessage", propOrder = {
    "documentId",
    "fileInformation"
})
public class UploadMessage
    extends BaseMessage
{

    @XmlElement(name = "DocumentId", nillable = true)
    protected EntityId documentId;
    @XmlElement(name = "FileInformation", nillable = true)
    protected FileInformation fileInformation;

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

    /**
     * Gets the value of the fileInformation property.
     * 
     * @return
     *     possible object is
     *     {@link FileInformation }
     *     
     */
    public FileInformation getFileInformation() {
        return fileInformation;
    }

    /**
     * Sets the value of the fileInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link FileInformation }
     *     
     */
    public void setFileInformation(FileInformation value) {
        this.fileInformation = value;
    }

}
