
package org.mule.modules.clarizen.config;

import javax.annotation.Generated;
import org.mule.config.PoolingProfile;
import org.mule.modules.clarizen.connectivity.ClarizenConnectorConnectionManager;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.xml.ParserContext;
import org.springframework.util.xml.DomUtils;
import org.w3c.dom.Element;

@Generated(value = "Mule DevKit Version 3.4.3", date = "2014-04-28T12:59:10-05:00", comments = "Build 3.4.3.1620.30ea288")
public class ClarizenConnectorConfigDefinitionParser
    extends AbstractDefinitionParser
{


    public BeanDefinition parse(Element element, ParserContext parserContext) {
        parseConfigName(element);
        BeanDefinitionBuilder builder = BeanDefinitionBuilder.rootBeanDefinition(ClarizenConnectorConnectionManager.class.getName());
        builder.setScope(BeanDefinition.SCOPE_SINGLETON);
        setInitMethodIfNeeded(builder, ClarizenConnectorConnectionManager.class);
        setDestroyMethodIfNeeded(builder, ClarizenConnectorConnectionManager.class);
        parseProperty(builder, element, "connectionUser", "connectionUser");
        parseProperty(builder, element, "connectionPassword", "connectionPassword");
        parseProperty(builder, element, "applicationId", "applicationId");
        parseProperty(builder, element, "partnerId", "partnerId");
        BeanDefinitionBuilder connectionPoolingProfileBuilder = BeanDefinitionBuilder.rootBeanDefinition(PoolingProfile.class.getName());
        Element connectionPoolingProfileElement = DomUtils.getChildElementByTagName(element, "connection-pooling-profile");
        if (connectionPoolingProfileElement!= null) {
            parseProperty(connectionPoolingProfileBuilder, connectionPoolingProfileElement, "maxActive");
            parseProperty(connectionPoolingProfileBuilder, connectionPoolingProfileElement, "maxIdle");
            parseProperty(connectionPoolingProfileBuilder, connectionPoolingProfileElement, "maxWait");
            if (hasAttribute(connectionPoolingProfileElement, "exhaustedAction")) {
                connectionPoolingProfileBuilder.addPropertyValue("exhaustedAction", PoolingProfile.POOL_EXHAUSTED_ACTIONS.get(connectionPoolingProfileElement.getAttribute("exhaustedAction")));
            }
            if (hasAttribute(connectionPoolingProfileElement, "initialisationPolicy")) {
                connectionPoolingProfileBuilder.addPropertyValue("initialisationPolicy", PoolingProfile.POOL_INITIALISATION_POLICIES.get(connectionPoolingProfileElement.getAttribute("initialisationPolicy")));
            }
            if (hasAttribute(connectionPoolingProfileElement, "evictionCheckIntervalMillis")) {
                parseProperty(connectionPoolingProfileBuilder, connectionPoolingProfileElement, "evictionCheckIntervalMillis");
            }
            if (hasAttribute(connectionPoolingProfileElement, "minEvictionMillis")) {
                parseProperty(connectionPoolingProfileBuilder, connectionPoolingProfileElement, "minEvictionMillis");
            }
            builder.addPropertyValue("connectionPoolingProfile", connectionPoolingProfileBuilder.getBeanDefinition());
        }
        BeanDefinition definition = builder.getBeanDefinition();
        setNoRecurseOnDefinition(definition);
        parseRetryPolicyTemplate("reconnect", element, parserContext, builder, definition);
        parseRetryPolicyTemplate("reconnect-forever", element, parserContext, builder, definition);
        parseRetryPolicyTemplate("reconnect-custom-strategy", element, parserContext, builder, definition);
        return definition;
    }

}
