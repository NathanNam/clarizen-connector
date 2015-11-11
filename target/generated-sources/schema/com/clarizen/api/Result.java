
package com.clarizen.api;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.clarizen.api.files.DownloadResult;
import com.clarizen.api.metadata.DescribeEntitiesResult;
import com.clarizen.api.metadata.GetSystemSettingsValuesResult;
import com.clarizen.api.metadata.ListEntitiesResult;
import com.clarizen.api.queries.CountQueryResult;
import com.clarizen.api.queries.GetTemplateDescriptionsResult;
import com.clarizen.api.queries.GetWorkItemResourcesResult;
import com.clarizen.api.queries.QueryResult;


/**
 * <p>Java class for Result complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Result">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Error" type="{http://clarizen.com/api}Error" minOccurs="0"/>
 *         &lt;element name="Success" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Result", propOrder = {
    "error",
    "success"
})
@XmlSeeAlso({
    GetTodayInfoResult.class,
    GetMultipleTodayInfoResult.class,
    GetApplicationStatusResult.class,
    GetServerDefinitionResult.class,
    AppLoginResult.class,
    CreateResult.class,
    RetrieveResult.class,
    GenerateUniqueIdsResult.class,
    GetWidgetUrlResult.class,
    QueryResult.class,
    GetCalendarInfoResult.class,
    RetrieveMultipleResult.class,
    TransactionResult.class,
    LoginResult.class,
    CountQueryResult.class,
    GetTemplateDescriptionsResult.class,
    GetWorkItemResourcesResult.class,
    DownloadResult.class,
    GetSystemSettingsValuesResult.class,
    ListEntitiesResult.class,
    DescribeEntitiesResult.class
})
public class Result {

    @XmlElement(name = "Error", nillable = true)
    protected Error error;
    @XmlElement(name = "Success")
    protected boolean success;

    /**
     * Gets the value of the error property.
     * 
     * @return
     *     possible object is
     *     {@link Error }
     *     
     */
    public Error getError() {
        return error;
    }

    /**
     * Sets the value of the error property.
     * 
     * @param value
     *     allowed object is
     *     {@link Error }
     *     
     */
    public void setError(Error value) {
        this.error = value;
    }

    /**
     * Gets the value of the success property.
     * 
     */
    public boolean isSuccess() {
        return success;
    }

    /**
     * Sets the value of the success property.
     * 
     */
    public void setSuccess(boolean value) {
        this.success = value;
    }

}
