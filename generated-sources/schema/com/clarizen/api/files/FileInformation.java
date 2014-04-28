
package com.clarizen.api.files;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FileInformation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FileInformation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Content" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="ExtendedInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FileName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Storage" type="{http://clarizen.com/api/files}Storage"/>
 *         &lt;element name="SubType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Url" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FileInformation", propOrder = {
    "content",
    "extendedInfo",
    "fileName",
    "storage",
    "subType",
    "url"
})
public class FileInformation {

    @XmlElement(name = "Content", nillable = true)
    protected byte[] content;
    @XmlElement(name = "ExtendedInfo", nillable = true)
    protected String extendedInfo;
    @XmlElement(name = "FileName", nillable = true)
    protected String fileName;
    @XmlElement(name = "Storage", required = true)
    protected Storage storage;
    @XmlElement(name = "SubType", nillable = true)
    protected String subType;
    @XmlElement(name = "Url", nillable = true)
    protected String url;

    /**
     * Gets the value of the content property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getContent() {
        return content;
    }

    /**
     * Sets the value of the content property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setContent(byte[] value) {
        this.content = ((byte[]) value);
    }

    /**
     * Gets the value of the extendedInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtendedInfo() {
        return extendedInfo;
    }

    /**
     * Sets the value of the extendedInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtendedInfo(String value) {
        this.extendedInfo = value;
    }

    /**
     * Gets the value of the fileName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileName() {
        return fileName;
    }

    /**
     * Sets the value of the fileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileName(String value) {
        this.fileName = value;
    }

    /**
     * Gets the value of the storage property.
     * 
     * @return
     *     possible object is
     *     {@link Storage }
     *     
     */
    public Storage getStorage() {
        return storage;
    }

    /**
     * Sets the value of the storage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Storage }
     *     
     */
    public void setStorage(Storage value) {
        this.storage = value;
    }

    /**
     * Gets the value of the subType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubType() {
        return subType;
    }

    /**
     * Sets the value of the subType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubType(String value) {
        this.subType = value;
    }

    /**
     * Gets the value of the url property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrl() {
        return url;
    }

    /**
     * Sets the value of the url property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrl(String value) {
        this.url = value;
    }

}
