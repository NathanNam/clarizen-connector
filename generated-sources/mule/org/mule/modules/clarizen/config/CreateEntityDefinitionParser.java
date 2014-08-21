
package org.mule.modules.clarizen.config;

import javax.annotation.Generated;
import com.clarizen.api.holders.EntityIdExpressionHolder;
import org.mule.modules.clarizen.api.model.holders.BaseClarizenEntityExpressionHolder;
import org.mule.modules.clarizen.processors.CreateEntityMessageProcessor;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.xml.ParserContext;
import org.springframework.util.xml.DomUtils;
import org.w3c.dom.Element;

@Generated(value = "Mule DevKit Version 3.4.3", date = "2014-08-21T04:41:47-05:00", comments = "Build 3.4.3.1620.30ea288")
public class CreateEntityDefinitionParser
    extends AbstractDefinitionParser
{


    public BeanDefinition parse(Element element, ParserContext parserContext) {
        BeanDefinitionBuilder builder = BeanDefinitionBuilder.rootBeanDefinition(CreateEntityMessageProcessor.class.getName());
        builder.setScope(BeanDefinition.SCOPE_PROTOTYPE);
        parseConfigRef(element, builder);
        if (!parseObjectRefWithDefault(element, builder, "entity", "entity", "#[payload]")) {
            BeanDefinitionBuilder entityBuilder = BeanDefinitionBuilder.rootBeanDefinition(BaseClarizenEntityExpressionHolder.class.getName());
            Element entityChildElement = DomUtils.getChildElementByTagName(element, "entity");
            if (entityChildElement!= null) {
                if (!parseObjectRef(entityChildElement, entityBuilder, "id", "id")) {
                    BeanDefinitionBuilder _idBuilder = BeanDefinitionBuilder.rootBeanDefinition(EntityIdExpressionHolder.class.getName());
                    Element _idChildElement = DomUtils.getChildElementByTagName(entityChildElement, "id");
                    if (_idChildElement!= null) {
                        parseProperty(_idBuilder, _idChildElement, "typeName", "typeName");
                        parseProperty(_idBuilder, _idChildElement, "value", "value");
                        entityBuilder.addPropertyValue("id", _idBuilder.getBeanDefinition());
                    }
                }
                parseProperty(entityBuilder, entityChildElement, "name", "name");
                if (!parseObjectRef(entityChildElement, entityBuilder, "entity-type", "entityType")) {
                    BeanDefinitionBuilder _entityTypeBuilder = BeanDefinitionBuilder.rootBeanDefinition(EntityIdExpressionHolder.class.getName());
                    Element _entityTypeChildElement = DomUtils.getChildElementByTagName(entityChildElement, "entity-type");
                    if (_entityTypeChildElement!= null) {
                        parseProperty(_entityTypeBuilder, _entityTypeChildElement, "typeName", "typeName");
                        parseProperty(_entityTypeBuilder, _entityTypeChildElement, "value", "value");
                        entityBuilder.addPropertyValue("entityType", _entityTypeBuilder.getBeanDefinition());
                    }
                }
                builder.addPropertyValue("entity", entityBuilder.getBeanDefinition());
            }
        }
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
