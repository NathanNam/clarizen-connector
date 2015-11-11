
package com.clarizen.api.files;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.clarizen.api.Result;


/**
 * <p>Java class for DownloadResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DownloadResult">
 *   &lt;complexContent>
 *     &lt;extension base="{http://clarizen.com/api}Result">
 *       &lt;sequence>
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
@XmlType(name = "DownloadResult", propOrder = {
    "fileInformation"
})
public class DownloadResult
    extends Result
{

    @XmlElement(name = "FileInformation", nillable = true)
    protected FileInformation fileInformation;

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
