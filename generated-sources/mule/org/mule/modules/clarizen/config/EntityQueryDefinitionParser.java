
package org.mule.modules.clarizen.config;

import javax.annotation.Generated;
import org.mule.modules.clarizen.config.AbstractDefinitionParser.ParseDelegate;
import org.mule.modules.clarizen.processors.EntityQueryMessageProcessor;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.xml.ParserContext;
import org.w3c.dom.Element;

@Generated(value = "Mule DevKit Version 3.4.3", date = "2014-06-04T12:20:43-05:00", comments = "Build 3.4.3.1620.30ea288")
public class EntityQueryDefinitionParser
    extends AbstractDefinitionParser
{


    public BeanDefinition parse(Element element, ParserContext parserContext) {
        BeanDefinitionBuilder builder = BeanDefinitionBuilder.rootBeanDefinition(EntityQueryMessageProcessor.class.getName());
        builder.setScope(BeanDefinition.SCOPE_PROTOTYPE);
        parseConfigRef(element, builder);
        parseListAndSetProperty(element, builder, "fieldsToRetrieve", "fields-to-retrieve", "fields-to-retrieve", new ParseDelegate<String>() {


            public String parse(Element element) {
                return element.getTextContent();
            }

        }
        );
        parseProperty(builder, element, "queryTypeName", "queryTypeName");
        if (hasAttribute(element, "condition-ref")) {
            if (element.getAttribute("condition-ref").startsWith("#")) {
                builder.addPropertyValue("condition", element.getAttribute("condition-ref"));
            } else {
                builder.addPropertyValue("condition", (("#[registry:"+ element.getAttribute("condition-ref"))+"]"));
            }
        }
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
