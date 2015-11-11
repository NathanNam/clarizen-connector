
package com.clarizen.api.metadata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.clarizen.api.StringList;


/**
 * <p>Java class for GetSystemSettingsValuesMessage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetSystemSettingsValuesMessage">
 *   &lt;complexContent>
 *     &lt;extension base="{http://clarizen.com/api/metadata}MetadataMessage">
 *       &lt;sequence>
 *         &lt;element name="Settings" type="{http://clarizen.com/api}stringList" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetSystemSettingsValuesMessage", propOrder = {
    "settings"
})
public class GetSystemSettingsValuesMessage
    extends MetadataMessage
{

    @XmlElement(name = "Settings", nillable = true)
    protected StringList settings;

    /**
     * Gets the value of the settings property.
     * 
     * @return
     *     possible object is
     *     {@link StringList }
     *     
     */
    public StringList getSettings() {
        return settings;
    }

    /**
     * Sets the value of the settings property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringList }
     *     
     */
    public void setSettings(StringList value) {
        this.settings = value;
    }

}
