
package org.mule.modules.clarizen.processors;

import java.util.Arrays;
import java.util.List;
import javax.annotation.Generated;
import com.clarizen.api.AccessType;
import com.clarizen.api.Recipient;
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
import org.mule.common.DefaultResult;
import org.mule.common.Result;
import org.mule.common.metadata.DefaultMetaData;
import org.mule.common.metadata.DefaultPojoMetaDataModel;
import org.mule.common.metadata.DefaultSimpleMetaDataModel;
import org.mule.common.metadata.MetaData;
import org.mule.common.metadata.MetaDataModel;
import org.mule.common.metadata.OperationMetaDataEnabled;
import org.mule.common.metadata.datatype.DataType;
import org.mule.common.metadata.datatype.DataTypeFactory;
import org.mule.config.i18n.CoreMessages;
import org.mule.modules.clarizen.ClarizenConnector;
import org.mule.modules.clarizen.ClarizenSessionTimeoutException;
import org.mule.modules.clarizen.api.model.BaseClarizenEntity;
import org.mule.modules.clarizen.connectivity.ClarizenConnectorConnectionManager;
import org.mule.modules.clarizen.process.ProcessAdapter;
import org.mule.modules.clarizen.process.ProcessCallback;
import org.mule.modules.clarizen.process.ProcessTemplate;


/**
 * SendEmailMessageProcessor invokes the {@link org.mule.modules.clarizen.ClarizenConnector#sendEmail(com.clarizen.api.AccessType, org.mule.modules.clarizen.api.model.BaseClarizenEntity, java.lang.String, java.lang.String, java.util.List)} method in {@link ClarizenConnector }. For each argument there is a field in this processor to match it.  Before invoking the actual method the processor will evaluate and transform where possible to the expected argument type.
 * 
 */
@Generated(value = "Mule DevKit Version 3.4.3", date = "2014-08-14T11:23:00-05:00", comments = "Build 3.4.3.1620.30ea288")
public class SendEmailMessageProcessor
    extends AbstractMessageProcessor<Object>
    implements Disposable, Initialisable, Startable, Stoppable, MessageProcessor, OperationMetaDataEnabled
{

    protected Object accessType;
    protected AccessType _accessTypeType;
    protected Object relatedEntity;
    protected BaseClarizenEntity _relatedEntityType;
    protected Object body;
    protected String _bodyType;
    protected Object subject;
    protected String _subjectType;
    protected Object recipients;
    protected List<Recipient> _recipientsType;

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
     * Sets body
     * 
     * @param value Value to set
     */
    public void setBody(Object value) {
        this.body = value;
    }

    /**
     * Sets relatedEntity
     * 
     * @param value Value to set
     */
    public void setRelatedEntity(Object value) {
        this.relatedEntity = value;
    }

    /**
     * Sets recipients
     * 
     * @param value Value to set
     */
    public void setRecipients(Object value) {
        this.recipients = value;
    }

    /**
     * Sets subject
     * 
     * @param value Value to set
     */
    public void setSubject(Object value) {
        this.subject = value;
    }

    /**
     * Sets accessType
     * 
     * @param value Value to set
     */
    public void setAccessType(Object value) {
        this.accessType = value;
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
            final AccessType _transformedAccessType = ((AccessType) evaluateAndTransform(getMuleContext(), event, SendEmailMessageProcessor.class.getDeclaredField("_accessTypeType").getGenericType(), null, accessType));
            final BaseClarizenEntity _transformedRelatedEntity = ((BaseClarizenEntity) evaluateAndTransform(getMuleContext(), event, SendEmailMessageProcessor.class.getDeclaredField("_relatedEntityType").getGenericType(), null, relatedEntity));
            final String _transformedBody = ((String) evaluateAndTransform(getMuleContext(), event, SendEmailMessageProcessor.class.getDeclaredField("_bodyType").getGenericType(), null, body));
            final String _transformedSubject = ((String) evaluateAndTransform(getMuleContext(), event, SendEmailMessageProcessor.class.getDeclaredField("_subjectType").getGenericType(), null, subject));
            final List<Recipient> _transformedRecipients = ((List<Recipient> ) evaluateAndTransform(getMuleContext(), event, SendEmailMessageProcessor.class.getDeclaredField("_recipientsType").getGenericType(), null, recipients));
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
                    return ((ClarizenConnector) object).sendEmail(_transformedAccessType, _transformedRelatedEntity, _transformedBody, _transformedSubject, _transformedRecipients);
                }

            }
            , this, event);
            overwritePayload(event, resultPayload);
            return event;
        } catch (MessagingException messagingException) {
            messagingException.setProcessedEvent(event);
            throw messagingException;
        } catch (Exception e) {
            throw new MessagingException(CoreMessages.failedToInvoke("sendEmail"), event, e);
        }
    }

    @Override
    public Result<MetaData> getInputMetaData() {
        return new DefaultResult<MetaData>(null, (Result.Status.SUCCESS));
    }

    @Override
    public Result<MetaData> getOutputMetaData(MetaData inputMetadata) {
        return new DefaultResult<MetaData>(new DefaultMetaData(getPojoOrSimpleModel(Boolean.class)));
    }

    private MetaDataModel getPojoOrSimpleModel(Class clazz) {
        DataType dataType = DataTypeFactory.getInstance().getDataType(clazz);
        if (DataType.POJO.equals(dataType)) {
            return new DefaultPojoMetaDataModel(clazz);
        } else {
            return new DefaultSimpleMetaDataModel(dataType);
        }
    }

}
