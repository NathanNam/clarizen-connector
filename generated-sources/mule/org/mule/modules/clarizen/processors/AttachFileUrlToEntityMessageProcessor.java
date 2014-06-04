
package org.mule.modules.clarizen.processors;

import java.util.Arrays;
import java.util.List;
import javax.annotation.Generated;
import com.clarizen.api.EntityId;
import org.mule.api.MessagingException;
import org.mule.api.MuleContext;
import org.mule.api.MuleEvent;
import org.mule.api.MuleException;
import org.mule.api.construct.FlowConstruct;
import org.mule.api.lifecycle.Disposable;
import org.mule.api.lifecycle.Initialisable;
import org.mule.api.lifecycle.InitialisationException;
import org.mule.api.lifecycle.Startable;
import org.mule.api.lifecycle.Stoppable;
import org.mule.api.processor.MessageProcessor;
import org.mule.config.i18n.CoreMessages;
import org.mule.modules.clarizen.ClarizenConnector;
import org.mule.modules.clarizen.ClarizenSessionTimeoutException;
import org.mule.modules.clarizen.connectivity.ClarizenConnectorConnectionManager;
import org.mule.modules.clarizen.process.ProcessAdapter;
import org.mule.modules.clarizen.process.ProcessCallback;
import org.mule.modules.clarizen.process.ProcessTemplate;


/**
 * AttachFileUrlToEntityMessageProcessor invokes the {@link org.mule.modules.clarizen.ClarizenConnector#attachFileUrlToEntity(com.clarizen.api.EntityId, java.lang.String, java.lang.String)} method in {@link ClarizenConnector }. For each argument there is a field in this processor to match it.  Before invoking the actual method the processor will evaluate and transform where possible to the expected argument type.
 * 
 */
@Generated(value = "Mule DevKit Version 3.4.3", date = "2014-06-04T12:20:43-05:00", comments = "Build 3.4.3.1620.30ea288")
public class AttachFileUrlToEntityMessageProcessor
    extends AbstractMessageProcessor<Object>
    implements Disposable, Initialisable, Startable, Stoppable, MessageProcessor
{

    protected Object entityId;
    protected EntityId _entityIdType;
    protected Object attachmentUrl;
    protected String _attachmentUrlType;
    protected Object attachmentFilename;
    protected String _attachmentFilenameType;

    /**
     * Obtains the expression manager from the Mule context and initialises the connector. If a target object  has not been set already it will search the Mule registry for a default one.
     * 
     * @throws InitialisationException
     */
    public void initialise()
        throws InitialisationException
    {
    }

    public void start()
        throws MuleException
    {
    }

    public void stop()
        throws MuleException
    {
    }

    public void dispose() {
    }

    /**
     * Set the Mule context
     * 
     * @param context Mule context to set
     */
    public void setMuleContext(MuleContext context) {
        super.setMuleContext(context);
    }

    /**
     * Sets flow construct
     * 
     * @param flowConstruct Flow construct to set
     */
    public void setFlowConstruct(FlowConstruct flowConstruct) {
        super.setFlowConstruct(flowConstruct);
    }

    /**
     * Sets attachmentFilename
     * 
     * @param value Value to set
     */
    public void setAttachmentFilename(Object value) {
        this.attachmentFilename = value;
    }

    /**
     * Sets entityId
     * 
     * @param value Value to set
     */
    public void setEntityId(Object value) {
        this.entityId = value;
    }

    /**
     * Sets attachmentUrl
     * 
     * @param value Value to set
     */
    public void setAttachmentUrl(Object value) {
        this.attachmentUrl = value;
    }

    /**
     * Invokes the MessageProcessor.
     * 
     * @param event MuleEvent to be processed
     * @throws MuleException
     */
    public MuleEvent process(final MuleEvent event)
        throws MuleException
    {
        Object moduleObject = null;
        try {
            moduleObject = findOrCreate(ClarizenConnectorConnectionManager.class, true, event);
            final EntityId _transformedEntityId = ((EntityId) evaluateAndTransform(getMuleContext(), event, AttachFileUrlToEntityMessageProcessor.class.getDeclaredField("_entityIdType").getGenericType(), null, entityId));
            final String _transformedAttachmentUrl = ((String) evaluateAndTransform(getMuleContext(), event, AttachFileUrlToEntityMessageProcessor.class.getDeclaredField("_attachmentUrlType").getGenericType(), null, attachmentUrl));
            final String _transformedAttachmentFilename = ((String) evaluateAndTransform(getMuleContext(), event, AttachFileUrlToEntityMessageProcessor.class.getDeclaredField("_attachmentFilenameType").getGenericType(), null, attachmentFilename));
            Object resultPayload;
            ProcessTemplate<Object, Object> processTemplate = ((ProcessAdapter<Object> ) moduleObject).getProcessTemplate();
            resultPayload = processTemplate.execute(new ProcessCallback<Object,Object>() {


                public List<Class> getManagedExceptions() {
                    return Arrays.asList(new Class[] {ClarizenSessionTimeoutException.class });
                }

                public boolean isProtected() {
                    return false;
                }

                public Object process(Object object)
                    throws Exception
                {
                    return ((ClarizenConnector) object).attachFileUrlToEntity(_transformedEntityId, _transformedAttachmentUrl, _transformedAttachmentFilename);
                }

            }
            , this, event);
            overwritePayload(event, resultPayload);
            return event;
        } catch (MessagingException messagingException) {
            messagingException.setProcessedEvent(event);
            throw messagingException;
        } catch (Exception e) {
            throw new MessagingException(CoreMessages.failedToInvoke("attachFileUrlToEntity"), event, e);
        }
    }

}
