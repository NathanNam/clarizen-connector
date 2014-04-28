
package com.clarizen.api.queries;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.clarizen.api.ArrayOfBaseEntity;
import com.clarizen.api.Result;


/**
 * <p>Java class for QueryResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QueryResult">
 *   &lt;complexContent>
 *     &lt;extension base="{http://clarizen.com/api}Result">
 *       &lt;sequence>
 *         &lt;element name="Entities" type="{http://clarizen.com/api}ArrayOfBaseEntity" minOccurs="0"/>
 *         &lt;element name="Paging" type="{http://clarizen.com/api/queries}Paging" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryResult", propOrder = {
    "entities",
    "paging"
})
public class QueryResult
    extends Result
{

    @XmlElement(name = "Entities", nillable = true)
    protected ArrayOfBaseEntity entities;
    @XmlElement(name = "Paging", nillable = true)
    protected Paging paging;

    /**
     * Gets the value of the entities property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfBaseEntity }
     *     
     */
    public ArrayOfBaseEntity getEntities() {
        return entities;
    }

    /**
     * Sets the value of the entities property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfBaseEntity }
     *     
     */
    public void setEntities(ArrayOfBaseEntity value) {
        this.entities = value;
    }

    /**
     * Gets the value of the paging property.
     * 
     * @return
     *     possible object is
     *     {@link Paging }
     *     
     */
    public Paging getPaging() {
        return paging;
    }

    /**
     * Sets the value of the paging property.
     * 
     * @param value
     *     allowed object is
     *     {@link Paging }
     *     
     */
    public void setPaging(Paging value) {
        this.paging = value;
    }

}
