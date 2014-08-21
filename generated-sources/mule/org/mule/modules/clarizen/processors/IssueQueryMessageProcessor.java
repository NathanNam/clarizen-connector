
package org.mule.modules.clarizen.processors;

import java.util.Arrays;
import java.util.List;
import javax.annotation.Generated;
import com.clarizen.api.queries.Condition;
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
import org.mule.common.metadata.DefaultListMetaDataModel;
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
import org.mule.modules.clarizen.api.model.AllIssueType;
import org.mule.modules.clarizen.api.model.BaseClarizenEntity;
import org.mule.modules.clarizen.connectivity.ClarizenConnectorConnectionManager;
import org.mule.modules.clarizen.process.ProcessAdapter;
import org.mule.modules.clarizen.process.ProcessCallback;
import org.mule.modules.clarizen.process.ProcessTemplate;


/**
 * IssueQueryMessageProcessor invokes the {@link org.mule.modules.clarizen.ClarizenConnector#issueQuery(java.util.List, org.mule.modules.clarizen.api.model.AllIssueType, com.clarizen.api.queries.Condition, java.lang.Integer, java.lang.Integer)} method in {@link ClarizenConnector }. For each argument there is a field in this processor to match it.  Before invoking the actual method the processor will evaluate and transform where possible to the expected argument type.
 * 
 */
@Generated(value = "Mule DevKit Version 3.4.3", date = "2014-08-21T04:41:47-05:00", comments = "Build 3.4.3.1620.30ea288")
public class IssueQueryMessageProcessor
    extends AbstractMessageProcessor<Object>
    implements Disposable, Initialisable, Startable, Stoppable, MessageProcessor, OperationMetaDataEnabled
{

    protected Object fieldsToRetrieve;
    protected List<String> _fieldsToRetrieveType;
    protected Object issueType;
    protected AllIssueType _issueTypeType;
    protected Object condition;
    protected Condition _conditionType;
    protected Object pageSize;
    protected Integer _pageSizeType;
    protected Object maxNumberOfPages;
    protected Integer _maxNumberOfPagesType;

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
     * Sets maxNumberOfPages
     * 
     * @param value Value to set
     */
    public void setMaxNumberOfPages(Object value) {
        this.maxNumberOfPages = value;
    }

    /**
     * Sets condition
     * 
     * @param value Value to set
     */
    public void setCondition(Object value) {
        this.condition = value;
    }

    /**
     * Sets issueType
     * 
     * @param value Value to set
     */
    public void setIssueType(Object value) {
        this.issueType = value;
    }

    /**
     * Sets pageSize
     * 
     * @param value Value to set
     */
    public void setPageSize(Object value) {
        this.pageSize = value;
    }

    /**
     * Sets fieldsToRetrieve
     * 
     * @param value Value to set
     */
    public void setFieldsToRetrieve(Object value) {
        this.fieldsToRetrieve = value;
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
            final List<String> _transformedFieldsToRetrieve = ((List<String> ) evaluateAndTransform(getMuleContext(), event, IssueQueryMessageProcessor.class.getDeclaredField("_fieldsToRetrieveType").getGenericType(), null, fieldsToRetrieve));
            final AllIssueType _transformedIssueType = ((AllIssueType) evaluateAndTransform(getMuleContext(), event, IssueQueryMessageProcessor.class.getDeclaredField("_issueTypeType").getGenericType(), null, issueType));
            final Condition _transformedCondition = ((Condition) evaluateAndTransform(getMuleContext(), event, IssueQueryMessageProcessor.class.getDeclaredField("_conditionType").getGenericType(), null, condition));
            final Integer _transformedPageSize = ((Integer) evaluateAndTransform(getMuleContext(), event, IssueQueryMessageProcessor.class.getDeclaredField("_pageSizeType").getGenericType(), null, pageSize));
            final Integer _transformedMaxNumberOfPages = ((Integer) evaluateAndTransform(getMuleContext(), event, IssueQueryMessageProcessor.class.getDeclaredField("_maxNumberOfPagesType").getGenericType(), null, maxNumberOfPages));
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
                    return ((ClarizenConnector) object).issueQuery(_transformedFieldsToRetrieve, _transformedIssueType, _transformedCondition, _transformedPageSize, _transformedMaxNumberOfPages);
                }

            }
            , this, event);
            overwritePayload(event, resultPayload);
            return event;
        } catch (MessagingException messagingException) {
            messagingException.setProcessedEvent(event);
            throw messagingException;
        } catch (Exception e) {
            throw new MessagingException(CoreMessages.failedToInvoke("issueQuery"), event, e);
        }
    }

    @Override
    public Result<MetaData> getInputMetaData() {
        return new DefaultResult<MetaData>(null, (Result.Status.SUCCESS));
    }

    @Override
    public Result<MetaData> getOutputMetaData(MetaData inputMetadata) {
        return new DefaultResult<MetaData>(new DefaultMetaData(new DefaultListMetaDataModel(getPojoOrSimpleModel(BaseClarizenEntity.class))));
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
