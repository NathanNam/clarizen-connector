
package org.mule.modules.clarizen.config;

import javax.annotation.Generated;
import org.springframework.beans.factory.xml.NamespaceHandlerSupport;


/**
 * Registers bean definitions parsers for handling elements in <code>http://www.mulesoft.org/schema/mule/clarizen</code>.
 * 
 */
@Generated(value = "Mule DevKit Version 3.4.3", date = "2014-04-28T12:59:10-05:00", comments = "Build 3.4.3.1620.30ea288")
public class ClarizenNamespaceHandler
    extends NamespaceHandlerSupport
{


    /**
     * Invoked by the {@link DefaultBeanDefinitionDocumentReader} after construction but before any custom elements are parsed. 
     * @see NamespaceHandlerSupport#registerBeanDefinitionParser(String, BeanDefinitionParser)
     * 
     */
    public void init() {
        registerBeanDefinitionParser("config", new ClarizenConnectorConfigDefinitionParser());
        registerBeanDefinitionParser("get-work-item-by-id", new GetWorkItemByIdDefinitionParser());
        registerBeanDefinitionParser("create-entity", new CreateEntityDefinitionParser());
        registerBeanDefinitionParser("create-generic-entity", new CreateGenericEntityDefinitionParser());
        registerBeanDefinitionParser("update-entity", new UpdateEntityDefinitionParser());
        registerBeanDefinitionParser("update-generic-entity", new UpdateGenericEntityDefinitionParser());
        registerBeanDefinitionParser("work-items-query", new WorkItemsQueryDefinitionParser());
        registerBeanDefinitionParser("entity-query", new EntityQueryDefinitionParser());
        registerBeanDefinitionParser("issue-query", new IssueQueryDefinitionParser());
        registerBeanDefinitionParser("get-my-work-items", new GetMyWorkItemsDefinitionParser());
        registerBeanDefinitionParser("describe-entities", new DescribeEntitiesDefinitionParser());
        registerBeanDefinitionParser("list-entities", new ListEntitiesDefinitionParser());
        registerBeanDefinitionParser("lifecycle-change", new LifecycleChangeDefinitionParser());
        registerBeanDefinitionParser("delete-entity", new DeleteEntityDefinitionParser());
        registerBeanDefinitionParser("delete-entity-by-id", new DeleteEntityByIdDefinitionParser());
        registerBeanDefinitionParser("get-calendar-information", new GetCalendarInformationDefinitionParser());
        registerBeanDefinitionParser("get-system-settings", new GetSystemSettingsDefinitionParser());
        registerBeanDefinitionParser("create-from-template", new CreateFromTemplateDefinitionParser());
        registerBeanDefinitionParser("download-file-information", new DownloadFileInformationDefinitionParser());
        registerBeanDefinitionParser("send-email", new SendEmailDefinitionParser());
        registerBeanDefinitionParser("attach-file-url-to-entity", new AttachFileUrlToEntityDefinitionParser());
        registerBeanDefinitionParser("download-entity-attachments", new DownloadEntityAttachmentsDefinitionParser());
        registerBeanDefinitionParser("retrieve-work-item-human-resources", new RetrieveWorkItemHumanResourcesDefinitionParser());
    }

}
