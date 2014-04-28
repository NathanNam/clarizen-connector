
package com.clarizen.api.queries;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.clarizen.api.Result;
import com.clarizen.api.StringList;


/**
 * <p>Java class for GetTemplateDescriptionsResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetTemplateDescriptionsResult">
 *   &lt;complexContent>
 *     &lt;extension base="{http://clarizen.com/api}Result">
 *       &lt;sequence>
 *         &lt;element name="Templates" type="{http://clarizen.com/api}stringList" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetTemplateDescriptionsResult", propOrder = {
    "templates"
})
public class GetTemplateDescriptionsResult
    extends Result
{

    @XmlElement(name = "Templates", nillable = true)
    protected StringList templates;

    /**
     * Gets the value of the templates property.
     * 
     * @return
     *     possible object is
     *     {@link StringList }
     *     
     */
    public StringList getTemplates() {
        return templates;
    }

    /**
     * Sets the value of the templates property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringList }
     *     
     */
    public void setTemplates(StringList value) {
        this.templates = value;
    }

}
