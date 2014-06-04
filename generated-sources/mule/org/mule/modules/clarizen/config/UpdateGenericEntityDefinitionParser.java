
package org.mule.modules.clarizen.config;

import javax.annotation.Generated;
import com.clarizen.api.holders.EntityIdExpressionHolder;
import com.clarizen.api.holders.GenericEntityExpressionHolder;
import com.clarizen.api.holders.PermissionsExpressionHolder;
import org.mule.modules.clarizen.processors.UpdateGenericEntityMessageProcessor;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.xml.ParserContext;
import org.springframework.util.xml.DomUtils;
import org.w3c.dom.Element;

@Generated(value = "Mule DevKit Version 3.4.3", date = "2014-06-04T12:20:43-05:00", comments = "Build 3.4.3.1620.30ea288")
public class UpdateGenericEntityDefinitionParser
    extends AbstractDefinitionParser
{


    public BeanDefinition parse(Element element, ParserContext parserContext) {
        BeanDefinitionBuilder builder = BeanDefinitionBuilder.rootBeanDefinition(UpdateGenericEntityMessageProcessor.class.getName());
        builder.setScope(BeanDefinition.SCOPE_PROTOTYPE);
        parseConfigRef(element, builder);
        if (!parseObjectRefWithDefault(element, builder, "entity", "entity", "#[payload]")) {
            BeanDefinitionBuilder entityBuilder = BeanDefinitionBuilder.rootBeanDefinition(GenericEntityExpressionHolder.class.getName());
            Element entityChildElement = DomUtils.getChildElementByTagName(element, "entity");
            if (entityChildElement!= null) {
                if (!parseObjectRef(entityChildElement, entityBuilder, "id", "id")) {
                    BeanDefinitionBuilder __idBuilder = BeanDefinitionBuilder.rootBeanDefinition(EntityIdExpressionHolder.class.getName());
                    Element __idChildElement = DomUtils.getChildElementByTagName(entityChildElement, "id");
                    if (__idChildElement!= null) {
                        parseProperty(__idBuilder, __idChildElement, "typeName", "typeName");
                        parseProperty(__idBuilder, __idChildElement, "value", "value");
                        entityBuilder.addPropertyValue("id", __idBuilder.getBeanDefinition());
                    }
                }
                if (!parseObjectRef(entityChildElement, entityBuilder, "permissions", "permissions")) {
                    BeanDefinitionBuilder _permissionsBuilder = BeanDefinitionBuilder.rootBeanDefinition(PermissionsExpressionHolder.class.getName());
                    Element _permissionsChildElement = DomUtils.getChildElementByTagName(entityChildElement, "permissions");
                    if (_permissionsChildElement!= null) {
                        if (hasAttribute(_permissionsChildElement, "fieldPermissions-ref")) {
                            if (_permissionsChildElement.getAttribute("fieldPermissions-ref").startsWith("#")) {
                                _permissionsBuilder.addPropertyValue("fieldPermissions", _permissionsChildElement.getAttribute("fieldPermissions-ref"));
                            } else {
                                _permissionsBuilder.addPropertyValue("fieldPermissions", (("#[registry:"+ _permissionsChildElement.getAttribute("fieldPermissions-ref"))+"]"));
                            }
                        }
                        if (hasAttribute(_permissionsChildElement, "objectPermissions-ref")) {
                            if (_permissionsChildElement.getAttribute("objectPermissions-ref").startsWith("#")) {
                                _permissionsBuilder.addPropertyValue("objectPermissions", _permissionsChildElement.getAttribute("objectPermissions-ref"));
                            } else {
                                _permissionsBuilder.addPropertyValue("objectPermissions", (("#[registry:"+ _permissionsChildElement.getAttribute("objectPermissions-ref"))+"]"));
                            }
                        }
                        entityBuilder.addPropertyValue("permissions", _permissionsBuilder.getBeanDefinition());
                    }
                }
                if (hasAttribute(entityChildElement, "values-ref")) {
                    if (entityChildElement.getAttribute("values-ref").startsWith("#")) {
                        entityBuilder.addPropertyValue("values", entityChildElement.getAttribute("values-ref"));
                    } else {
                        entityBuilder.addPropertyValue("values", (("#[registry:"+ entityChildElement.getAttribute("values-ref"))+"]"));
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
