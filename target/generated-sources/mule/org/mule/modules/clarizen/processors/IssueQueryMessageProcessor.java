
package org.mule.modules.clarizen.processors;

import java.util.Arrays;
import java.util.List;
import javax.annotation.Generated;
import com.clarizen.api.queries.Condition;
import org.mule.api.MuleEvent;
import org.mule.api.MuleException;
import org.mule.api.config.ConfigurationException;
import org.mule.api.devkit.ProcessAdapter;
import org.mule.api.devkit.ProcessTemplate;
import org.mule.api.lifecycle.InitialisationException;
import org.mule.api.processor.MessageProcessor;
import org.mule.api.registry.RegistrationException;
import org.mule.common.DefaultResult;
import org.mule.common.FailureType;
import org.mule.common.Result;
import org.mule.common.metadata.ConnectorMetaDataEnabled;
import org.mule.common.metadata.DefaultListMetaDataModel;
import org.mule.common.metadata.DefaultMetaData;
import org.mule.common.metadata.DefaultPojoMetaDataModel;
import org.mule.common.metadata.DefaultSimpleMetaDataModel;
import org.mule.common.metadata.MetaData;
import org.mule.common.metadata.MetaDataKey;
import org.mule.common.metadata.MetaDataModel;
import org.mule.common.metadata.OperationMetaDataEnabled;
import org.mule.common.metadata.datatype.DataType;
import org.mule.common.metadata.datatype.DataTypeFactory;
import org.mule.modules.clarizen.ClarizenConnector;
import org.mule.modules.clarizen.ClarizenSessionTimeoutException;
import org.mule.modules.clarizen.api.model.AllIssueType;
import org.mule.modules.clarizen.api.model.BaseClarizenEntity;
import org.mule.modules.clarizen.connectivity.ClarizenConnectorConnectionManager;
import org.mule.security.oauth.callback.ProcessCallback;


/**
 * IssueQueryMessageProcessor invokes the {@link org.mule.modules.clarizen.ClarizenConnector#issueQuery(java.util.List, org.mule.modules.clarizen.api.model.AllIssueType, com.clarizen.api.queries.Condition, java.lang.Integer, java.lang.Integer)} method in {@link ClarizenConnector }. For each argument there is a field in this processor to match it.  Before invoking the actual method the processor will evaluate and transform where possible to the expected argument type.
 * 
 */
@Generated(value = "Mule DevKit Version 3.5.3", date = "2015-11-11T04:25:00-03:00", comments = "Build UNNAMED.2049.ec39f2b")
public class IssueQueryMessageProcessor
    extends AbstractConnectedProcessor
    implements MessageProcessor, OperationMetaDataEnabled
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

    public IssueQueryMessageProcessor(String operationName) {
        super(operationName);
    }

    /**
     * Obtains the expression manager from the Mule context and initialises the connector. If a target object  has not been set already it will search the Mule registry for a default one.
     * 
     * @throws InitialisationException
     */
    public void initialise()
        throws InitialisationException
    {
    }

    @Override
    public void start()
        throws MuleException
    {
        super.start();
    }

    @Override
    public void stop()
        throws MuleException
    {
        super.stop();
    }

    @Override
    public void dispose() {
        super.dispose();
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
     * @throws Exception
     */
    public MuleEvent doProcess(final MuleEvent event)
        throws Exception
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
            final ProcessTemplate<Object, Object> processTemplate = ((ProcessAdapter<Object> ) moduleObject).getProcessTemplate();
            resultPayload = processTemplate.execute(new ProcessCallback<Object,Object>() {


                public List<Class<? extends Exception>> getManagedExceptions() {
                    return Arrays.asList(((Class<? extends Exception> []) new Class[] {ClarizenSessionTimeoutException.class }));
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
            event.getMessage().setPayload(resultPayload);
            return event;
        } catch (Exception e) {
            throw e;
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

    public Result<MetaData> getGenericMetaData(MetaDataKey metaDataKey) {
        ConnectorMetaDataEnabled connector;
        try {
            connector = ((ConnectorMetaDataEnabled) findOrCreate(ClarizenConnectorConnectionManager.class, true, null));
            try {
                Result<MetaData> metadata = connector.getMetaData(metaDataKey);
                if ((Result.Status.FAILURE).equals(metadata.getStatus())) {
                    return metadata;
                }
                if (metadata.get() == null) {
                    return new DefaultResult<MetaData>(null, (Result.Status.FAILURE), "There was an error processing metadata at ClarizenConnector at issueQuery retrieving was successful but result is null");
                }
                return metadata;
            } catch (Exception e) {
                return new DefaultResult<MetaData>(null, (Result.Status.FAILURE), e.getMessage(), FailureType.UNSPECIFIED, e);
            }
        } catch (ClassCastException cast) {
            return new DefaultResult<MetaData>(null, (Result.Status.FAILURE), "There was an error getting metadata, there was no connection manager available. Maybe you're trying to use metadata from an Oauth connector");
        } catch (ConfigurationException e) {
            return new DefaultResult<MetaData>(null, (Result.Status.FAILURE), e.getMessage(), FailureType.UNSPECIFIED, e);
        } catch (RegistrationException e) {
            return new DefaultResult<MetaData>(null, (Result.Status.FAILURE), e.getMessage(), FailureType.UNSPECIFIED, e);
        } catch (IllegalAccessException e) {
            return new DefaultResult<MetaData>(null, (Result.Status.FAILURE), e.getMessage(), FailureType.UNSPECIFIED, e);
        } catch (InstantiationException e) {
            return new DefaultResult<MetaData>(null, (Result.Status.FAILURE), e.getMessage(), FailureType.UNSPECIFIED, e);
        } catch (Exception e) {
            return new DefaultResult<MetaData>(null, (Result.Status.FAILURE), e.getMessage(), FailureType.UNSPECIFIED, e);
        }
    }

}
