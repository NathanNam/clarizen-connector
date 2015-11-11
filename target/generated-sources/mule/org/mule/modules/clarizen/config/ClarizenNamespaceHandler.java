
package org.mule.modules.clarizen.config;

import javax.annotation.Generated;
import org.mule.config.MuleManifest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.FatalBeanException;
import org.springframework.beans.factory.xml.NamespaceHandlerSupport;


/**
 * Registers bean definitions parsers for handling elements in <code>http://www.mulesoft.org/schema/mule/clarizen</code>.
 * 
 */
@Generated(value = "Mule DevKit Version 3.5.3", date = "2015-11-11T04:25:00-03:00", comments = "Build UNNAMED.2049.ec39f2b")
public class ClarizenNamespaceHandler
    extends NamespaceHandlerSupport
{

    private static Logger logger = LoggerFactory.getLogger(ClarizenNamespaceHandler.class);

    private void handleException(String beanName, String beanScope, NoClassDefFoundError noClassDefFoundError) {
        String muleVersion = "";
        try {
            muleVersion = MuleManifest.getProductVersion();
        } catch (Exception _x) {
            logger.error("Problem while reading mule version");
        }
        logger.error(((((("Cannot launch the mule app, the  "+ beanScope)+" [")+ beanName)+"] within the connector [clarizen] is not supported in mule ")+ muleVersion));
        throw new FatalBeanException(((((("Cannot launch the mule app, the  "+ beanScope)+" [")+ beanName)+"] within the connector [clarizen] is not supported in mule ")+ muleVersion), noClassDefFoundError);
    }

    /**
     * Invoked by the {@link DefaultBeanDefinitionDocumentReader} after construction but before any custom elements are parsed. 
     * @see NamespaceHandlerSupport#registerBeanDefinitionParser(String, BeanDefinitionParser)
     * 
     */
    public void init() {
        try {
            this.registerBeanDefinitionParser("config", new ClarizenConnectorConfigDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("config", "@Config", ex);
        }
        try {
            this.registerBeanDefinitionParser("get-work-item-by-id", new GetWorkItemByIdDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("get-work-item-by-id", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("create-entity", new CreateEntityDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("create-entity", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("create-generic-entity", new CreateGenericEntityDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("create-generic-entity", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("update-entity", new UpdateEntityDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("update-entity", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("update-generic-entity", new UpdateGenericEntityDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("update-generic-entity", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("work-items-query", new WorkItemsQueryDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("work-items-query", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("entity-query", new EntityQueryDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("entity-query", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("issue-query", new IssueQueryDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("issue-query", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("get-my-work-items", new GetMyWorkItemsDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("get-my-work-items", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("describe-entities", new DescribeEntitiesDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("describe-entities", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("list-entities", new ListEntitiesDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("list-entities", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("lifecycle-change", new LifecycleChangeDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("lifecycle-change", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("delete-entity", new DeleteEntityDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("delete-entity", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("delete-entity-by-id", new DeleteEntityByIdDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("delete-entity-by-id", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("get-calendar-information", new GetCalendarInformationDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("get-calendar-information", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("get-system-settings", new GetSystemSettingsDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("get-system-settings", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("create-from-template", new CreateFromTemplateDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("create-from-template", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("download-file-information", new DownloadFileInformationDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("download-file-information", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("send-email", new SendEmailDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("send-email", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("attach-file-url-to-entity", new AttachFileUrlToEntityDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("attach-file-url-to-entity", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("download-entity-attachments", new DownloadEntityAttachmentsDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("download-entity-attachments", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("retrieve-work-item-human-resources", new RetrieveWorkItemHumanResourcesDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("retrieve-work-item-human-resources", "@Processor", ex);
        }
    }

}
