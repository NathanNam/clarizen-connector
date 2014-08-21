
package org.mule.modules.clarizen.config;

import javax.annotation.Generated;
import com.clarizen.api.holders.EntityIdExpressionHolder;
import org.mule.modules.clarizen.config.AbstractDefinitionParser.ParseDelegate;
import org.mule.modules.clarizen.processors.LifecycleChangeMessageProcessor;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.xml.ParserContext;
import org.w3c.dom.Element;

@Generated(value = "Mule DevKit Version 3.4.3", date = "2014-08-21T04:41:47-05:00", comments = "Build 3.4.3.1620.30ea288")
public class LifecycleChangeDefinitionParser
    extends AbstractDefinitionParser
{


    public BeanDefinition parse(Element element, ParserContext parserContext) {
        BeanDefinitionBuilder builder = BeanDefinitionBuilder.rootBeanDefinition(LifecycleChangeMessageProcessor.class.getName());
        builder.setScope(BeanDefinition.SCOPE_PROTOTYPE);
        parseConfigRef(element, builder);
        parseListWithDefaultAndSetProperty(element, builder, "entityIdList", "entity-id-list", "entity-id-list", "#[payload]", new ParseDelegate<BeanDefinition>() {


            public BeanDefinition parse(Element element) {
                BeanDefinitionBuilder builder = BeanDefinitionBuilder.rootBeanDefinition(EntityIdExpressionHolder.class);
                parseProperty(builder, element, "typeName", "typeName");
                parseProperty(builder, element, "value", "value");
                return builder.getBeanDefinition();
            }

        }
        );
        parseProperty(builder, element, "operation", "operation");
        parseProperty(builder, element, "recursive", "recursive");
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
