
package org.mule.modules.clarizen.config;

import javax.annotation.Generated;
import com.clarizen.api.holders.EntityIdExpressionHolder;
import org.mule.modules.clarizen.processors.AttachFileUrlToEntityMessageProcessor;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.xml.ParserContext;
import org.springframework.util.xml.DomUtils;
import org.w3c.dom.Element;

@Generated(value = "Mule DevKit Version 3.4.3", date = "2014-08-21T04:41:47-05:00", comments = "Build 3.4.3.1620.30ea288")
public class AttachFileUrlToEntityDefinitionParser
    extends AbstractDefinitionParser
{


    public BeanDefinition parse(Element element, ParserContext parserContext) {
        BeanDefinitionBuilder builder = BeanDefinitionBuilder.rootBeanDefinition(AttachFileUrlToEntityMessageProcessor.class.getName());
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
        parseProperty(builder, element, "attachmentUrl", "attachmentUrl");
        parseProperty(builder, element, "attachmentFilename", "attachmentFilename");
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
