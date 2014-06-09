
package org.mule.modules.clarizen.config;

import javax.annotation.Generated;
import com.clarizen.api.holders.EntityIdExpressionHolder;
import com.clarizen.api.holders.RecipientExpressionHolder;
import org.mule.modules.clarizen.api.model.holders.BaseClarizenEntityExpressionHolder;
import org.mule.modules.clarizen.config.AbstractDefinitionParser.ParseDelegate;
import org.mule.modules.clarizen.processors.SendEmailMessageProcessor;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.xml.ParserContext;
import org.springframework.util.xml.DomUtils;
import org.w3c.dom.Element;

@Generated(value = "Mule DevKit Version 3.4.3", date = "2014-06-09T03:26:49-05:00", comments = "Build 3.4.3.1620.30ea288")
public class SendEmailDefinitionParser
    extends AbstractDefinitionParser
{


    public BeanDefinition parse(Element element, ParserContext parserContext) {
        BeanDefinitionBuilder builder = BeanDefinitionBuilder.rootBeanDefinition(SendEmailMessageProcessor.class.getName());
        builder.setScope(BeanDefinition.SCOPE_PROTOTYPE);
        parseConfigRef(element, builder);
        parseProperty(builder, element, "accessType", "accessType");
        if (!parseObjectRef(element, builder, "related-entity", "relatedEntity")) {
            BeanDefinitionBuilder relatedEntityBuilder = BeanDefinitionBuilder.rootBeanDefinition(BaseClarizenEntityExpressionHolder.class.getName());
            Element relatedEntityChildElement = DomUtils.getChildElementByTagName(element, "related-entity");
            if (relatedEntityChildElement!= null) {
                if (!parseObjectRef(relatedEntityChildElement, relatedEntityBuilder, "id", "id")) {
                    BeanDefinitionBuilder _idBuilder = BeanDefinitionBuilder.rootBeanDefinition(EntityIdExpressionHolder.class.getName());
                    Element _idChildElement = DomUtils.getChildElementByTagName(relatedEntityChildElement, "id");
                    if (_idChildElement!= null) {
                        parseProperty(_idBuilder, _idChildElement, "typeName", "typeName");
                        parseProperty(_idBuilder, _idChildElement, "value", "value");
                        relatedEntityBuilder.addPropertyValue("id", _idBuilder.getBeanDefinition());
                    }
                }
                parseProperty(relatedEntityBuilder, relatedEntityChildElement, "name", "name");
                if (!parseObjectRef(relatedEntityChildElement, relatedEntityBuilder, "entity-type", "entityType")) {
                    BeanDefinitionBuilder _entityTypeBuilder = BeanDefinitionBuilder.rootBeanDefinition(EntityIdExpressionHolder.class.getName());
                    Element _entityTypeChildElement = DomUtils.getChildElementByTagName(relatedEntityChildElement, "entity-type");
                    if (_entityTypeChildElement!= null) {
                        parseProperty(_entityTypeBuilder, _entityTypeChildElement, "typeName", "typeName");
                        parseProperty(_entityTypeBuilder, _entityTypeChildElement, "value", "value");
                        relatedEntityBuilder.addPropertyValue("entityType", _entityTypeBuilder.getBeanDefinition());
                    }
                }
                builder.addPropertyValue("relatedEntity", relatedEntityBuilder.getBeanDefinition());
            }
        }
        parseProperty(builder, element, "body", "body");
        parseProperty(builder, element, "subject", "subject");
        parseListAndSetProperty(element, builder, "recipients", "recipients", "recipient", new ParseDelegate<BeanDefinition>() {


            public BeanDefinition parse(Element element) {
                BeanDefinitionBuilder builder = BeanDefinitionBuilder.rootBeanDefinition(RecipientExpressionHolder.class);
                parseProperty(builder, element, "eMail", "eMail");
                parseProperty(builder, element, "recipientType", "recipientType");
                if (!parseObjectRef(element, builder, "user", "user")) {
                    BeanDefinitionBuilder _userBuilder = BeanDefinitionBuilder.rootBeanDefinition(EntityIdExpressionHolder.class.getName());
                    Element _userChildElement = DomUtils.getChildElementByTagName(element, "user");
                    if (_userChildElement!= null) {
                        parseProperty(_userBuilder, _userChildElement, "typeName", "typeName");
                        parseProperty(_userBuilder, _userChildElement, "value", "value");
                        builder.addPropertyValue("user", _userBuilder.getBeanDefinition());
                    }
                }
                return builder.getBeanDefinition();
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
