
package org.mule.modules.clarizen.config;

import javax.annotation.Generated;
import com.clarizen.api.holders.EntityIdExpressionHolder;
import org.mule.config.MuleManifest;
import org.mule.modules.clarizen.api.model.holders.BaseClarizenEntityExpressionHolder;
import org.mule.modules.clarizen.processors.UpdateEntityMessageProcessor;
import org.mule.security.oauth.config.AbstractDevkitBasedDefinitionParser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.parsing.BeanDefinitionParsingException;
import org.springframework.beans.factory.parsing.Location;
import org.springframework.beans.factory.parsing.Problem;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.xml.ParserContext;
import org.springframework.util.xml.DomUtils;
import org.w3c.dom.Element;

@Generated(value = "Mule DevKit Version 3.5.3", date = "2015-11-11T04:25:00-03:00", comments = "Build UNNAMED.2049.ec39f2b")
public class UpdateEntityDefinitionParser
    extends AbstractDevkitBasedDefinitionParser
{

    private static Logger logger = LoggerFactory.getLogger(UpdateEntityDefinitionParser.class);

    private BeanDefinitionBuilder getBeanDefinitionBuilder(ParserContext parserContext) {
        try {
            return BeanDefinitionBuilder.rootBeanDefinition(UpdateEntityMessageProcessor.class.getName());
        } catch (NoClassDefFoundError noClassDefFoundError) {
            String muleVersion = "";
            try {
                muleVersion = MuleManifest.getProductVersion();
            } catch (Exception _x) {
                logger.error("Problem while reading mule version");
            }
            logger.error(("Cannot launch the mule app, the @Processor [update-entity] within the connector [clarizen] is not supported in mule "+ muleVersion));
            throw new BeanDefinitionParsingException(new Problem(("Cannot launch the mule app, the @Processor [update-entity] within the connector [clarizen] is not supported in mule "+ muleVersion), new Location(parserContext.getReaderContext().getResource()), null, noClassDefFoundError));
        }
    }

    public BeanDefinition parse(Element element, ParserContext parserContext) {
        BeanDefinitionBuilder builder = getBeanDefinitionBuilder(parserContext);
        builder.addConstructorArgValue("updateEntity");
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
