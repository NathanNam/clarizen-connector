
package com.clarizen.api;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.clarizen.api.files.DownloadMessage;
import com.clarizen.api.files.UploadMessage;
import com.clarizen.api.metadata.MetadataMessage;
import com.clarizen.api.queries.CountQuery;
import com.clarizen.api.queries.GetTemplateDescriptionsMessage;
import com.clarizen.api.queries.GetWorkItemResourcesMessage;
import com.clarizen.api.queries.Query;


/**
 * Base message description
 * 
 * <p>Java class for BaseMessage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BaseMessage">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseMessage")
@XmlSeeAlso({
    GetCalendarInfoMessage.class,
    AppLoginMessage.class,
    SendEMailMessage.class,
    GetTodayInfoMessage.class,
    DeleteMessage.class,
    LifecycleMessage.class,
    RetrieveMessage.class,
    UpdateMessage.class,
    GetApplicationStatusMessage.class,
    GenerateUniqueIdsMessage.class,
    GetWidgetUrlMessage.class,
    TransactionMessage.class,
    InstallApplicationMessage.class,
    GetMultipleTodayInfoMessage.class,
    GetSessionInfoMessage.class,
    CreateMessage.class,
    RetrieveMultipleMessage.class,
    GetWorkItemResourcesMessage.class,
    CountQuery.class,
    GetTemplateDescriptionsMessage.class,
    Query.class,
    UploadMessage.class,
    DownloadMessage.class,
    MetadataMessage.class
})
public class BaseMessage {


}
