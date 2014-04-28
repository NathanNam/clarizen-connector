
package org.mule.modules.clarizen.processors;

import java.util.Arrays;
import java.util.List;
import javax.annotation.Generated;
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
import org.mule.modules.clarizen.api.model.WorkItemFilter;
import org.mule.modules.clarizen.api.model.WorkItemState;
import org.mule.modules.clarizen.api.model.WorkItemType;
import org.mule.modules.clarizen.connectivity.ClarizenConnectorConnectionManager;
import org.mule.modules.clarizen.process.ProcessAdapter;
import org.mule.modules.clarizen.process.ProcessCallback;
import org.mule.modules.clarizen.process.ProcessTemplate;


/**
 * GetMyWorkItemsMessageProcessor invokes the {@link org.mule.modules.clarizen.ClarizenConnector#getMyWorkItems(java.util.List, org.mule.modules.clarizen.api.model.WorkItemState, org.mule.modules.clarizen.api.model.WorkItemType, org.mule.modules.clarizen.api.model.WorkItemFilter, java.lang.Integer, java.lang.Integer)} method in {@link ClarizenConnector }. For each argument there is a field in this processor to match it.  Before invoking the actual method the processor will evaluate and transform where possible to the expected argument type.
 * 
 */
@Generated(value = "Mule DevKit Version 3.4.3", date = "2014-04-28T12:59:10-05:00", comments = "Build 3.4.3.1620.30ea288")
public class GetMyWorkItemsMessageProcessor
    extends AbstractMessageProcessor<Object>
    implements Disposable, Initialisable, Startable, Stoppable, MessageProcessor
{

    protected Object fieldsToRetrieve;
    protected List<String> _fieldsToRetrieveType;
    protected Object workItemState;
    protected WorkItemState _workItemStateType;
    protected Object workItemType;
    protected WorkItemType _workItemTypeType;
    protected Object workItemFilter;
    protected WorkItemFilter _workItemFilterType;
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
     * Sets workItemFilter
     * 
     * @param value Value to set
     */
    public void setWorkItemFilter(Object value) {
        this.workItemFilter = value;
    }

    /**
     * Sets workItemState
     * 
     * @param value Value to set
     */
    public void setWorkItemState(Object value) {
        this.workItemState = value;
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
     * Sets workItemType
     * 
     * @param value Value to set
     */
    public void setWorkItemType(Object value) {
        this.workItemType = value;
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
            final List<String> _transformedFieldsToRetrieve = ((List<String> ) evaluateAndTransform(getMuleContext(), event, GetMyWorkItemsMessageProcessor.class.getDeclaredField("_fieldsToRetrieveType").getGenericType(), null, fieldsToRetrieve));
            final WorkItemState _transformedWorkItemState = ((WorkItemState) evaluateAndTransform(getMuleContext(), event, GetMyWorkItemsMessageProcessor.class.getDeclaredField("_workItemStateType").getGenericType(), null, workItemState));
            final WorkItemType _transformedWorkItemType = ((WorkItemType) evaluateAndTransform(getMuleContext(), event, GetMyWorkItemsMessageProcessor.class.getDeclaredField("_workItemTypeType").getGenericType(), null, workItemType));
            final WorkItemFilter _transformedWorkItemFilter = ((WorkItemFilter) evaluateAndTransform(getMuleContext(), event, GetMyWorkItemsMessageProcessor.class.getDeclaredField("_workItemFilterType").getGenericType(), null, workItemFilter));
            final Integer _transformedPageSize = ((Integer) evaluateAndTransform(getMuleContext(), event, GetMyWorkItemsMessageProcessor.class.getDeclaredField("_pageSizeType").getGenericType(), null, pageSize));
            final Integer _transformedMaxNumberOfPages = ((Integer) evaluateAndTransform(getMuleContext(), event, GetMyWorkItemsMessageProcessor.class.getDeclaredField("_maxNumberOfPagesType").getGenericType(), null, maxNumberOfPages));
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
                    return ((ClarizenConnector) object).getMyWorkItems(_transformedFieldsToRetrieve, _transformedWorkItemState, _transformedWorkItemType, _transformedWorkItemFilter, _transformedPageSize, _transformedMaxNumberOfPages);
                }

            }
            , this, event);
            overwritePayload(event, resultPayload);
            return event;
        } catch (MessagingException messagingException) {
            messagingException.setProcessedEvent(event);
            throw messagingException;
        } catch (Exception e) {
            throw new MessagingException(CoreMessages.failedToInvoke("getMyWorkItems"), event, e);
        }
    }

}
