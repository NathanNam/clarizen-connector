
package org.mule.modules.clarizen.config;

import javax.annotation.Generated;
import com.clarizen.api.holders.EntityIdExpressionHolder;
import org.mule.modules.clarizen.config.AbstractDefinitionParser.ParseDelegate;
import org.mule.modules.clarizen.processors.RetrieveWorkItemHumanResourcesMessageProcessor;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.xml.ParserContext;
import org.springframework.util.xml.DomUtils;
import org.w3c.dom.Element;

@Generated(value = "Mule DevKit Version 3.4.3", date = "2014-06-04T12:20:43-05:00", comments = "Build 3.4.3.1620.30ea288")
public class RetrieveWorkItemHumanResourcesDefinitionParser
    extends AbstractDefinitionParser
{


    public BeanDefinition parse(Element element, ParserContext parserContext) {
        BeanDefinitionBuilder builder = BeanDefinitionBuilder.rootBeanDefinition(RetrieveWorkItemHumanResourcesMessageProcessor.class.getName());
        builder.setScope(BeanDefinition.SCOPE_PROTOTYPE);
        parseConfigRef(element, builder);
        if (!parseObjectRef(element, builder, "entity-id", "entityId")) {
            BeanDefinitionBuilder entityIdBuilder = BeanDefinitionBuilder.rootBeanDefinition(EntityIdExpressionHolder.class.getName());
            Element entityIdChildElement = DomUtils.getChildElementByTagName(element, "entity-id");
            if (entityIdChildElement!= null) {
                parseProperty(entityIdBuilder, entityIdChildElement, "typeName", "typeName");
                parseProperty(entityIdBuilder, entityIdChildElement, "value", "value");
                builder.addPropertyValue("entityId", entityIdBuilder.getBeanDefinition());
            }
        }
        parseListAndSetProperty(element, builder, "fieldsToRetrieve", "fields-to-retrieve", "fields-to-retrieve", new ParseDelegate<String>() {


            public String parse(Element element) {
                return element.getTextContent();
            }

        }
        );
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
