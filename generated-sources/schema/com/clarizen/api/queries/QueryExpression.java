
package com.clarizen.api.queries;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QueryExpression complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QueryExpression">
 *   &lt;complexContent>
 *     &lt;extension base="{http://clarizen.com/api/queries}Expression">
 *       &lt;sequence>
 *         &lt;element name="Query" type="{http://clarizen.com/api/queries}Query" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryExpression", propOrder = {
    "query"
})
public class QueryExpression
    extends Expression
{

    @XmlElement(name = "Query", nillable = true)
    protected Query query;

    /**
     * Gets the value of the query property.
     * 
     * @return
     *     possible object is
     *     {@link Query }
     *     
     */
    public Query getQuery() {
        return query;
    }

    /**
     * Sets the value of the query property.
     * 
     * @param value
     *     allowed object is
     *     {@link Query }
     *     
     */
    public void setQuery(Query value) {
        this.query = value;
    }

}
