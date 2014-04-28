
package com.clarizen.api;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="queryExpression" type="{http://clarizen.com/api/queries}Query" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "queryExpression"
})
@XmlRootElement(name = "Query")
public class Query {

    @XmlElement(nillable = true)
    protected com.clarizen.api.queries.Query queryExpression;

    /**
     * Gets the value of the queryExpression property.
     * 
     * @return
     *     possible object is
     *     {@link com.clarizen.api.queries.Query }
     *     
     */
    public com.clarizen.api.queries.Query getQueryExpression() {
        return queryExpression;
    }

    /**
     * Sets the value of the queryExpression property.
     * 
     * @param value
     *     allowed object is
     *     {@link com.clarizen.api.queries.Query }
     *     
     */
    public void setQueryExpression(com.clarizen.api.queries.Query value) {
        this.queryExpression = value;
    }

}
