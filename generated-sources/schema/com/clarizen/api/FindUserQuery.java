
package com.clarizen.api;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.clarizen.api.queries.BuiltInQuery;


/**
 * <p>Java class for FindUserQuery complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FindUserQuery">
 *   &lt;complexContent>
 *     &lt;extension base="{http://clarizen.com/api/queries}BuiltInQuery">
 *       &lt;sequence>
 *         &lt;element name="EMail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FuzzySearchUserName" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IncludeSuspendedUsers" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FindUserQuery", propOrder = {
    "eMail",
    "firstName",
    "lastName",
    "fuzzySearchUserName",
    "includeSuspendedUsers"
})
public class FindUserQuery
    extends BuiltInQuery
{

    @XmlElement(name = "EMail", nillable = true)
    protected String eMail;
    @XmlElement(name = "FirstName", nillable = true)
    protected String firstName;
    @XmlElement(name = "LastName", nillable = true)
    protected String lastName;
    @XmlElement(name = "FuzzySearchUserName")
    protected Boolean fuzzySearchUserName;
    @XmlElement(name = "IncludeSuspendedUsers")
    protected Boolean includeSuspendedUsers;

    /**
     * Gets the value of the eMail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEMail() {
        return eMail;
    }

    /**
     * Sets the value of the eMail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEMail(String value) {
        this.eMail = value;
    }

    /**
     * Gets the value of the firstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the value of the firstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstName(String value) {
        this.firstName = value;
    }

    /**
     * Gets the value of the lastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the value of the lastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastName(String value) {
        this.lastName = value;
    }

    /**
     * Gets the value of the fuzzySearchUserName property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFuzzySearchUserName() {
        return fuzzySearchUserName;
    }

    /**
     * Sets the value of the fuzzySearchUserName property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFuzzySearchUserName(Boolean value) {
        this.fuzzySearchUserName = value;
    }

    /**
     * Gets the value of the includeSuspendedUsers property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeSuspendedUsers() {
        return includeSuspendedUsers;
    }

    /**
     * Sets the value of the includeSuspendedUsers property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeSuspendedUsers(Boolean value) {
        this.includeSuspendedUsers = value;
    }

}
