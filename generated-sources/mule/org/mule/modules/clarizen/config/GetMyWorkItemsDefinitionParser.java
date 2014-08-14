
package org.mule.modules.clarizen.config;

import javax.annotation.Generated;
import org.mule.modules.clarizen.config.AbstractDefinitionParser.ParseDelegate;
import org.mule.modules.clarizen.processors.GetMyWorkItemsMessageProcessor;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.xml.ParserContext;
import org.w3c.dom.Element;

@Generated(value = "Mule DevKit Version 3.4.3", date = "2014-08-14T11:23:00-05:00", comments = "Build 3.4.3.1620.30ea288")
public class GetMyWorkItemsDefinitionParser
    extends AbstractDefinitionParser
{


    public BeanDefinition parse(Element element, ParserContext parserContext) {
        BeanDefinitionBuilder builder = BeanDefinitionBuilder.rootBeanDefinition(GetMyWorkItemsMessageProcessor.class.getName());
        builder.setScope(BeanDefinition.SCOPE_PROTOTYPE);
        parseConfigRef(element, builder);
        parseListWithDefaultAndSetProperty(element, builder, "fieldsToRetrieve", "fields-to-retrieve", "fields-to-retrieve", "#[payload]", new ParseDelegate<String>() {


            public String parse(Element element) {
                return element.getTextContent();
            }

        }
        );
        parseProperty(builder, element, "workItemState", "workItemState");
        parseProperty(builder, element, "workItemType", "workItemType");
        parseProperty(builder, element, "workItemFilter", "workItemFilter");
        parseProperty(builder, element, "pageSize", "pageSize");
        parseProperty(builder, element, "maxNumberOfPages", "maxNumberOfPages");
        parseProperty(builder, element, "connectionUser", "connectionUser");
        parseProperty(builder, element, "connectionPassword", "connectionPassword");
        parseProperty(builder, element, "applicationId", "applicationId");
        parseProperty(builder, element, "partnerId", "partnerId");
        BeanDefinition definition = builder.getBeanDefinition();
        setNoRecurseOnDefinition(definition);
        attachProcessorDefinition(parserContext, definition);
        return definition;
    }

}
