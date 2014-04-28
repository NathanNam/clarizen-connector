
package com.clarizen.api;

import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.clarizen.api package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _TransactionResult_QNAME = new QName("http://clarizen.com/api", "TransactionResult");
    private final static QName _AccessType_QNAME = new QName("http://clarizen.com/api", "AccessType");
    private final static QName _ArrayOfFieldPermission_QNAME = new QName("http://clarizen.com/api", "ArrayOfFieldPermission");
    private final static QName _FindCustomerQuery_QNAME = new QName("http://clarizen.com/api", "FindCustomerQuery");
    private final static QName _GetSessionInfoExtendedResult_QNAME = new QName("http://clarizen.com/api", "GetSessionInfoExtendedResult");
    private final static QName _Info_QNAME = new QName("http://clarizen.com/api", "Info");
    private final static QName _RetrieveMultipleMessage_QNAME = new QName("http://clarizen.com/api", "RetrieveMultipleMessage");
    private final static QName _CreateAndRetrieveMessage_QNAME = new QName("http://clarizen.com/api", "CreateAndRetrieveMessage");
    private final static QName _LicenseType_QNAME = new QName("http://clarizen.com/api", "LicenseType");
    private final static QName _ArrayOfGetTodayInfoResult_QNAME = new QName("http://clarizen.com/api", "ArrayOfGetTodayInfoResult");
    private final static QName _ConditionList_QNAME = new QName("http://clarizen.com/api", "ConditionList");
    private final static QName _GetSessionInfoMessage_QNAME = new QName("http://clarizen.com/api", "GetSessionInfoMessage");
    private final static QName _SessionHeader_QNAME = new QName("http://clarizen.com/api", "SessionHeader");
    private final static QName _ArrayOfEntityId_QNAME = new QName("http://clarizen.com/api", "ArrayOfEntityId");
    private final static QName _Error_QNAME = new QName("http://clarizen.com/api", "Error");
    private final static QName _GetCalendarInfoResult_QNAME = new QName("http://clarizen.com/api", "GetCalendarInfoResult");
    private final static QName _FieldPermissions_QNAME = new QName("http://clarizen.com/api", "FieldPermissions");
    private final static QName _ArrayOfBaseMessage_QNAME = new QName("http://clarizen.com/api", "ArrayOfBaseMessage");
    private final static QName _CallOptions_QNAME = new QName("http://clarizen.com/api", "CallOptions");
    private final static QName _GetMultipleTodayInfoMessage_QNAME = new QName("http://clarizen.com/api", "GetMultipleTodayInfoMessage");
    private final static QName _Duration_QNAME = new QName("http://clarizen.com/api", "Duration");
    private final static QName _PermissionOptions_QNAME = new QName("http://clarizen.com/api", "PermissionOptions");
    private final static QName _CreateFromTemplateMessage_QNAME = new QName("http://clarizen.com/api", "CreateFromTemplateMessage");
    private final static QName _RetrieveMultipleResult_QNAME = new QName("http://clarizen.com/api", "RetrieveMultipleResult");
    private final static QName _ExtendedLoginResult_QNAME = new QName("http://clarizen.com/api", "ExtendedLoginResult");
    private final static QName _ArrayOfBaseEntity_QNAME = new QName("http://clarizen.com/api", "ArrayOfBaseEntity");
    private final static QName _TimesheetState_QNAME = new QName("http://clarizen.com/api", "TimesheetState");
    private final static QName _Day_QNAME = new QName("http://clarizen.com/api", "Day");
    private final static QName _GetSessionInfoResult_QNAME = new QName("http://clarizen.com/api", "GetSessionInfoResult");
    private final static QName _ClientVersionInfo_QNAME = new QName("http://clarizen.com/api", "ClientVersionInfo");
    private final static QName _WidgetFormat_QNAME = new QName("http://clarizen.com/api", "WidgetFormat");
    private final static QName _DurationUnit_QNAME = new QName("http://clarizen.com/api", "DurationUnit");
    private final static QName _ArrayOfTodayInfoItem_QNAME = new QName("http://clarizen.com/api", "ArrayOfTodayInfoItem");
    private final static QName _ExtendedLoginOptions_QNAME = new QName("http://clarizen.com/api", "ExtendedLoginOptions");
    private final static QName _EntityId_QNAME = new QName("http://clarizen.com/api", "EntityId");
    private final static QName _GenerateUniqueIdsResult_QNAME = new QName("http://clarizen.com/api", "GenerateUniqueIdsResult");
    private final static QName _TodayInfoItem_QNAME = new QName("http://clarizen.com/api", "TodayInfoItem");
    private final static QName _ArrayOfResult_QNAME = new QName("http://clarizen.com/api", "ArrayOfResult");
    private final static QName _InstallApplicationMessage_QNAME = new QName("http://clarizen.com/api", "InstallApplicationMessage");
    private final static QName _GetWidgetUrlResult_QNAME = new QName("http://clarizen.com/api", "GetWidgetUrlResult");
    private final static QName _ArrayOfDayInformation_QNAME = new QName("http://clarizen.com/api", "ArrayOfDayInformation");
    private final static QName _ArrayOfFieldValue_QNAME = new QName("http://clarizen.com/api", "ArrayOfFieldValue");
    private final static QName _Permissions_QNAME = new QName("http://clarizen.com/api", "Permissions");
    private final static QName _FieldValue_QNAME = new QName("http://clarizen.com/api", "FieldValue");
    private final static QName _AnyTypeList_QNAME = new QName("http://clarizen.com/api", "anyTypeList");
    private final static QName _ArrayOfObjectPermissions_QNAME = new QName("http://clarizen.com/api", "ArrayOfObjectPermissions");
    private final static QName _Session_QNAME = new QName("http://clarizen.com/api", "Session");
    private final static QName _TransactionMessage_QNAME = new QName("http://clarizen.com/api", "TransactionMessage");
    private final static QName _Recipient_QNAME = new QName("http://clarizen.com/api", "Recipient");
    private final static QName _ErrorValue_QNAME = new QName("http://clarizen.com/api", "ErrorValue");
    private final static QName _GenericEntity_QNAME = new QName("http://clarizen.com/api", "GenericEntity");
    private final static QName _GetWidgetUrlMessage_QNAME = new QName("http://clarizen.com/api", "GetWidgetUrlMessage");
    private final static QName _GenerateUniqueIdsMessage_QNAME = new QName("http://clarizen.com/api", "GenerateUniqueIdsMessage");
    private final static QName _RetrieveResult_QNAME = new QName("http://clarizen.com/api", "RetrieveResult");
    private final static QName _RecipientType_QNAME = new QName("http://clarizen.com/api", "RecipientType");
    private final static QName _ObjectPermissions_QNAME = new QName("http://clarizen.com/api", "ObjectPermissions");
    private final static QName _DurationType_QNAME = new QName("http://clarizen.com/api", "DurationType");
    private final static QName _Money_QNAME = new QName("http://clarizen.com/api", "Money");
    private final static QName _ArrayOfRecipient_QNAME = new QName("http://clarizen.com/api", "ArrayOfRecipient");
    private final static QName _GetServerDefinitionResult_QNAME = new QName("http://clarizen.com/api", "GetServerDefinitionResult");
    private final static QName _CreateMessage_QNAME = new QName("http://clarizen.com/api", "CreateMessage");
    private final static QName _BaseEntity_QNAME = new QName("http://clarizen.com/api", "BaseEntity");
    private final static QName _FieldPermission_QNAME = new QName("http://clarizen.com/api", "FieldPermission");
    private final static QName _AppLoginResult_QNAME = new QName("http://clarizen.com/api", "AppLoginResult");
    private final static QName _Options_QNAME = new QName("http://clarizen.com/api", "Options");
    private final static QName _ResetValue_QNAME = new QName("http://clarizen.com/api", "ResetValue");
    private final static QName _CreateResult_QNAME = new QName("http://clarizen.com/api", "CreateResult");
    private final static QName _UpdateMessage_QNAME = new QName("http://clarizen.com/api", "UpdateMessage");
    private final static QName _StringList_QNAME = new QName("http://clarizen.com/api", "stringList");
    private final static QName _GetApplicationStatusMessage_QNAME = new QName("http://clarizen.com/api", "GetApplicationStatusMessage");
    private final static QName _LifecycleMessage_QNAME = new QName("http://clarizen.com/api", "LifecycleMessage");
    private final static QName _RetrieveMessage_QNAME = new QName("http://clarizen.com/api", "RetrieveMessage");
    private final static QName _DayInformation_QNAME = new QName("http://clarizen.com/api", "DayInformation");
    private final static QName _GetApplicationStatusResult_QNAME = new QName("http://clarizen.com/api", "GetApplicationStatusResult");
    private final static QName _TodayQuery_QNAME = new QName("http://clarizen.com/api", "TodayQuery");
    private final static QName _BaseMessage_QNAME = new QName("http://clarizen.com/api", "BaseMessage");
    private final static QName _ErrorCode_QNAME = new QName("http://clarizen.com/api", "ErrorCode");
    private final static QName _Result_QNAME = new QName("http://clarizen.com/api", "Result");
    private final static QName _DeleteMessage_QNAME = new QName("http://clarizen.com/api", "DeleteMessage");
    private final static QName _ArrayOfRetrieveResult_QNAME = new QName("http://clarizen.com/api", "ArrayOfRetrieveResult");
    private final static QName _LoginOptions_QNAME = new QName("http://clarizen.com/api", "LoginOptions");
    private final static QName _GetTodayInfoMessage_QNAME = new QName("http://clarizen.com/api", "GetTodayInfoMessage");
    private final static QName _GetMultipleTodayInfoResult_QNAME = new QName("http://clarizen.com/api", "GetMultipleTodayInfoResult");
    private final static QName _Currency_QNAME = new QName("http://clarizen.com/api", "Currency");
    private final static QName _FindUserQuery_QNAME = new QName("http://clarizen.com/api", "FindUserQuery");
    private final static QName _GetCalendarInfoMessage_QNAME = new QName("http://clarizen.com/api", "GetCalendarInfoMessage");
    private final static QName _CallInfo_QNAME = new QName("http://clarizen.com/api", "CallInfo");
    private final static QName _LoginResult_QNAME = new QName("http://clarizen.com/api", "LoginResult");
    private final static QName _GetTodayInfoResult_QNAME = new QName("http://clarizen.com/api", "GetTodayInfoResult");
    private final static QName _SendEMailMessage_QNAME = new QName("http://clarizen.com/api", "SendEMailMessage");
    private final static QName _AppLoginMessage_QNAME = new QName("http://clarizen.com/api", "AppLoginMessage");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.clarizen.api
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link InstallApplicationMessage }
     * 
     */
    public InstallApplicationMessage createInstallApplicationMessage() {
        return new InstallApplicationMessage();
    }

    /**
     * Create an instance of {@link ArrayOfRecipient }
     * 
     */
    public ArrayOfRecipient createArrayOfRecipient() {
        return new ArrayOfRecipient();
    }

    /**
     * Create an instance of {@link TodayQuery }
     * 
     */
    public TodayQuery createTodayQuery() {
        return new TodayQuery();
    }

    /**
     * Create an instance of {@link FindCustomerQuery }
     * 
     */
    public FindCustomerQuery createFindCustomerQuery() {
        return new FindCustomerQuery();
    }

    /**
     * Create an instance of {@link CreateFromTemplateMessage }
     * 
     */
    public CreateFromTemplateMessage createCreateFromTemplateMessage() {
        return new CreateFromTemplateMessage();
    }

    /**
     * Create an instance of {@link GetServerDefinitionResult }
     * 
     */
    public GetServerDefinitionResult createGetServerDefinitionResult() {
        return new GetServerDefinitionResult();
    }

    /**
     * Create an instance of {@link Result }
     * 
     */
    public Result createResult() {
        return new Result();
    }

    /**
     * Create an instance of {@link ArrayOfEntityId }
     * 
     */
    public ArrayOfEntityId createArrayOfEntityId() {
        return new ArrayOfEntityId();
    }

    /**
     * Create an instance of {@link GenericEntity }
     * 
     */
    public GenericEntity createGenericEntity() {
        return new GenericEntity();
    }

    /**
     * Create an instance of {@link ArrayOfBaseEntity }
     * 
     */
    public ArrayOfBaseEntity createArrayOfBaseEntity() {
        return new ArrayOfBaseEntity();
    }

    /**
     * Create an instance of {@link AppLoginResult }
     * 
     */
    public AppLoginResult createAppLoginResult() {
        return new AppLoginResult();
    }

    /**
     * Create an instance of {@link Execute }
     * 
     */
    public Execute createExecute() {
        return new Execute();
    }

    /**
     * Create an instance of {@link QueryResponse }
     * 
     */
    public QueryResponse createQueryResponse() {
        return new QueryResponse();
    }

    /**
     * Create an instance of {@link ExecuteResponse }
     * 
     */
    public ExecuteResponse createExecuteResponse() {
        return new ExecuteResponse();
    }

    /**
     * Create an instance of {@link GetSessionInfoResult }
     * 
     */
    public GetSessionInfoResult createGetSessionInfoResult() {
        return new GetSessionInfoResult();
    }

    /**
     * Create an instance of {@link ArrayOfObjectPermissions }
     * 
     */
    public ArrayOfObjectPermissions createArrayOfObjectPermissions() {
        return new ArrayOfObjectPermissions();
    }

    /**
     * Create an instance of {@link RetrieveMessage }
     * 
     */
    public RetrieveMessage createRetrieveMessage() {
        return new RetrieveMessage();
    }

    /**
     * Create an instance of {@link ArrayOfFieldPermission }
     * 
     */
    public ArrayOfFieldPermission createArrayOfFieldPermission() {
        return new ArrayOfFieldPermission();
    }

    /**
     * Create an instance of {@link FieldValue }
     * 
     */
    public FieldValue createFieldValue() {
        return new FieldValue();
    }

    /**
     * Create an instance of {@link Permissions }
     * 
     */
    public Permissions createPermissions() {
        return new Permissions();
    }

    /**
     * Create an instance of {@link ClientVersionInfo }
     * 
     */
    public ClientVersionInfo createClientVersionInfo() {
        return new ClientVersionInfo();
    }

    /**
     * Create an instance of {@link FindUserQuery }
     * 
     */
    public FindUserQuery createFindUserQuery() {
        return new FindUserQuery();
    }

    /**
     * Create an instance of {@link ArrayOfRetrieveResult }
     * 
     */
    public ArrayOfRetrieveResult createArrayOfRetrieveResult() {
        return new ArrayOfRetrieveResult();
    }

    /**
     * Create an instance of {@link LifecycleMessage }
     * 
     */
    public LifecycleMessage createLifecycleMessage() {
        return new LifecycleMessage();
    }

    /**
     * Create an instance of {@link MetadataResponse }
     * 
     */
    public MetadataResponse createMetadataResponse() {
        return new MetadataResponse();
    }

    /**
     * Create an instance of {@link FieldPermission }
     * 
     */
    public FieldPermission createFieldPermission() {
        return new FieldPermission();
    }

    /**
     * Create an instance of {@link GetTodayInfoMessage }
     * 
     */
    public GetTodayInfoMessage createGetTodayInfoMessage() {
        return new GetTodayInfoMessage();
    }

    /**
     * Create an instance of {@link SessionHeader }
     * 
     */
    public SessionHeader createSessionHeader() {
        return new SessionHeader();
    }

    /**
     * Create an instance of {@link ExtendedLoginOptions }
     * 
     */
    public ExtendedLoginOptions createExtendedLoginOptions() {
        return new ExtendedLoginOptions();
    }

    /**
     * Create an instance of {@link LoginResult }
     * 
     */
    public LoginResult createLoginResult() {
        return new LoginResult();
    }

    /**
     * Create an instance of {@link AppLoginMessage }
     * 
     */
    public AppLoginMessage createAppLoginMessage() {
        return new AppLoginMessage();
    }

    /**
     * Create an instance of {@link TransactionMessage }
     * 
     */
    public TransactionMessage createTransactionMessage() {
        return new TransactionMessage();
    }

    /**
     * Create an instance of {@link ArrayOfDayInformation }
     * 
     */
    public ArrayOfDayInformation createArrayOfDayInformation() {
        return new ArrayOfDayInformation();
    }

    /**
     * Create an instance of {@link LoginResponse }
     * 
     */
    public LoginResponse createLoginResponse() {
        return new LoginResponse();
    }

    /**
     * Create an instance of {@link GenerateUniqueIdsMessage }
     * 
     */
    public GenerateUniqueIdsMessage createGenerateUniqueIdsMessage() {
        return new GenerateUniqueIdsMessage();
    }

    /**
     * Create an instance of {@link GetMultipleTodayInfoResult }
     * 
     */
    public GetMultipleTodayInfoResult createGetMultipleTodayInfoResult() {
        return new GetMultipleTodayInfoResult();
    }

    /**
     * Create an instance of {@link Money }
     * 
     */
    public Money createMoney() {
        return new Money();
    }

    /**
     * Create an instance of {@link ArrayOfBaseMessage }
     * 
     */
    public ArrayOfBaseMessage createArrayOfBaseMessage() {
        return new ArrayOfBaseMessage();
    }

    /**
     * Create an instance of {@link CreateAndRetrieveMessage }
     * 
     */
    public CreateAndRetrieveMessage createCreateAndRetrieveMessage() {
        return new CreateAndRetrieveMessage();
    }

    /**
     * Create an instance of {@link Recipient }
     * 
     */
    public Recipient createRecipient() {
        return new Recipient();
    }

    /**
     * Create an instance of {@link Login }
     * 
     */
    public Login createLogin() {
        return new Login();
    }

    /**
     * Create an instance of {@link GetSessionInfoMessage }
     * 
     */
    public GetSessionInfoMessage createGetSessionInfoMessage() {
        return new GetSessionInfoMessage();
    }

    /**
     * Create an instance of {@link CreateResult }
     * 
     */
    public CreateResult createCreateResult() {
        return new CreateResult();
    }

    /**
     * Create an instance of {@link StringList }
     * 
     */
    public StringList createStringList() {
        return new StringList();
    }

    /**
     * Create an instance of {@link ArrayOfFieldValue }
     * 
     */
    public ArrayOfFieldValue createArrayOfFieldValue() {
        return new ArrayOfFieldValue();
    }

    /**
     * Create an instance of {@link CreateMessage }
     * 
     */
    public CreateMessage createCreateMessage() {
        return new CreateMessage();
    }

    /**
     * Create an instance of {@link GetCalendarInfoMessage }
     * 
     */
    public GetCalendarInfoMessage createGetCalendarInfoMessage() {
        return new GetCalendarInfoMessage();
    }

    /**
     * Create an instance of {@link ArrayOfResult }
     * 
     */
    public ArrayOfResult createArrayOfResult() {
        return new ArrayOfResult();
    }

    /**
     * Create an instance of {@link CallInfo }
     * 
     */
    public CallInfo createCallInfo() {
        return new CallInfo();
    }

    /**
     * Create an instance of {@link RetrieveMultipleMessage }
     * 
     */
    public RetrieveMultipleMessage createRetrieveMultipleMessage() {
        return new RetrieveMultipleMessage();
    }

    /**
     * Create an instance of {@link GetCalendarInfoResult }
     * 
     */
    public GetCalendarInfoResult createGetCalendarInfoResult() {
        return new GetCalendarInfoResult();
    }

    /**
     * Create an instance of {@link ResetValue }
     * 
     */
    public ResetValue createResetValue() {
        return new ResetValue();
    }

    /**
     * Create an instance of {@link CallOptions }
     * 
     */
    public CallOptions createCallOptions() {
        return new CallOptions();
    }

    /**
     * Create an instance of {@link GetApplicationStatusMessage }
     * 
     */
    public GetApplicationStatusMessage createGetApplicationStatusMessage() {
        return new GetApplicationStatusMessage();
    }

    /**
     * Create an instance of {@link ArrayOfGetTodayInfoResult }
     * 
     */
    public ArrayOfGetTodayInfoResult createArrayOfGetTodayInfoResult() {
        return new ArrayOfGetTodayInfoResult();
    }

    /**
     * Create an instance of {@link GetApplicationStatusResult }
     * 
     */
    public GetApplicationStatusResult createGetApplicationStatusResult() {
        return new GetApplicationStatusResult();
    }

    /**
     * Create an instance of {@link GetWidgetUrlResult }
     * 
     */
    public GetWidgetUrlResult createGetWidgetUrlResult() {
        return new GetWidgetUrlResult();
    }

    /**
     * Create an instance of {@link RetrieveMultipleResult }
     * 
     */
    public RetrieveMultipleResult createRetrieveMultipleResult() {
        return new RetrieveMultipleResult();
    }

    /**
     * Create an instance of {@link Error }
     * 
     */
    public Error createError() {
        return new Error();
    }

    /**
     * Create an instance of {@link RetrieveResult }
     * 
     */
    public RetrieveResult createRetrieveResult() {
        return new RetrieveResult();
    }

    /**
     * Create an instance of {@link SendEMailMessage }
     * 
     */
    public SendEMailMessage createSendEMailMessage() {
        return new SendEMailMessage();
    }

    /**
     * Create an instance of {@link AnyTypeList }
     * 
     */
    public AnyTypeList createAnyTypeList() {
        return new AnyTypeList();
    }

    /**
     * Create an instance of {@link GetMultipleTodayInfoMessage }
     * 
     */
    public GetMultipleTodayInfoMessage createGetMultipleTodayInfoMessage() {
        return new GetMultipleTodayInfoMessage();
    }

    /**
     * Create an instance of {@link GetServerDefinition }
     * 
     */
    public GetServerDefinition createGetServerDefinition() {
        return new GetServerDefinition();
    }

    /**
     * Create an instance of {@link ErrorValue }
     * 
     */
    public ErrorValue createErrorValue() {
        return new ErrorValue();
    }

    /**
     * Create an instance of {@link ExtendedLoginResult }
     * 
     */
    public ExtendedLoginResult createExtendedLoginResult() {
        return new ExtendedLoginResult();
    }

    /**
     * Create an instance of {@link Logout }
     * 
     */
    public Logout createLogout() {
        return new Logout();
    }

    /**
     * Create an instance of {@link GetTodayInfoResult }
     * 
     */
    public GetTodayInfoResult createGetTodayInfoResult() {
        return new GetTodayInfoResult();
    }

    /**
     * Create an instance of {@link Duration }
     * 
     */
    public Duration createDuration() {
        return new Duration();
    }

    /**
     * Create an instance of {@link DeleteMessage }
     * 
     */
    public DeleteMessage createDeleteMessage() {
        return new DeleteMessage();
    }

    /**
     * Create an instance of {@link GetWidgetUrlMessage }
     * 
     */
    public GetWidgetUrlMessage createGetWidgetUrlMessage() {
        return new GetWidgetUrlMessage();
    }

    /**
     * Create an instance of {@link GenerateUniqueIdsResult }
     * 
     */
    public GenerateUniqueIdsResult createGenerateUniqueIdsResult() {
        return new GenerateUniqueIdsResult();
    }

    /**
     * Create an instance of {@link GetServerDefinitionResponse }
     * 
     */
    public GetServerDefinitionResponse createGetServerDefinitionResponse() {
        return new GetServerDefinitionResponse();
    }

    /**
     * Create an instance of {@link Query }
     * 
     */
    public Query createQuery() {
        return new Query();
    }

    /**
     * Create an instance of {@link TransactionResult }
     * 
     */
    public TransactionResult createTransactionResult() {
        return new TransactionResult();
    }

    /**
     * Create an instance of {@link BaseEntity }
     * 
     */
    public BaseEntity createBaseEntity() {
        return new BaseEntity();
    }

    /**
     * Create an instance of {@link LoginOptions }
     * 
     */
    public LoginOptions createLoginOptions() {
        return new LoginOptions();
    }

    /**
     * Create an instance of {@link BaseMessage }
     * 
     */
    public BaseMessage createBaseMessage() {
        return new BaseMessage();
    }

    /**
     * Create an instance of {@link Metadata }
     * 
     */
    public Metadata createMetadata() {
        return new Metadata();
    }

    /**
     * Create an instance of {@link EntityId }
     * 
     */
    public EntityId createEntityId() {
        return new EntityId();
    }

    /**
     * Create an instance of {@link UpdateMessage }
     * 
     */
    public UpdateMessage createUpdateMessage() {
        return new UpdateMessage();
    }

    /**
     * Create an instance of {@link ConditionList }
     * 
     */
    public ConditionList createConditionList() {
        return new ConditionList();
    }

    /**
     * Create an instance of {@link GetSessionInfoExtendedResult }
     * 
     */
    public GetSessionInfoExtendedResult createGetSessionInfoExtendedResult() {
        return new GetSessionInfoExtendedResult();
    }

    /**
     * Create an instance of {@link DayInformation }
     * 
     */
    public DayInformation createDayInformation() {
        return new DayInformation();
    }

    /**
     * Create an instance of {@link ArrayOfTodayInfoItem }
     * 
     */
    public ArrayOfTodayInfoItem createArrayOfTodayInfoItem() {
        return new ArrayOfTodayInfoItem();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransactionResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clarizen.com/api", name = "TransactionResult")
    public JAXBElement<TransactionResult> createTransactionResult(TransactionResult value) {
        return new JAXBElement<TransactionResult>(_TransactionResult_QNAME, TransactionResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AccessType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clarizen.com/api", name = "AccessType")
    public JAXBElement<AccessType> createAccessType(AccessType value) {
        return new JAXBElement<AccessType>(_AccessType_QNAME, AccessType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfFieldPermission }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clarizen.com/api", name = "ArrayOfFieldPermission")
    public JAXBElement<ArrayOfFieldPermission> createArrayOfFieldPermission(ArrayOfFieldPermission value) {
        return new JAXBElement<ArrayOfFieldPermission>(_ArrayOfFieldPermission_QNAME, ArrayOfFieldPermission.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindCustomerQuery }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clarizen.com/api", name = "FindCustomerQuery")
    public JAXBElement<FindCustomerQuery> createFindCustomerQuery(FindCustomerQuery value) {
        return new JAXBElement<FindCustomerQuery>(_FindCustomerQuery_QNAME, FindCustomerQuery.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSessionInfoExtendedResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clarizen.com/api", name = "GetSessionInfoExtendedResult")
    public JAXBElement<GetSessionInfoExtendedResult> createGetSessionInfoExtendedResult(GetSessionInfoExtendedResult value) {
        return new JAXBElement<GetSessionInfoExtendedResult>(_GetSessionInfoExtendedResult_QNAME, GetSessionInfoExtendedResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CallInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clarizen.com/api", name = "Info")
    public JAXBElement<CallInfo> createInfo(CallInfo value) {
        return new JAXBElement<CallInfo>(_Info_QNAME, CallInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrieveMultipleMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clarizen.com/api", name = "RetrieveMultipleMessage")
    public JAXBElement<RetrieveMultipleMessage> createRetrieveMultipleMessage(RetrieveMultipleMessage value) {
        return new JAXBElement<RetrieveMultipleMessage>(_RetrieveMultipleMessage_QNAME, RetrieveMultipleMessage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateAndRetrieveMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clarizen.com/api", name = "CreateAndRetrieveMessage")
    public JAXBElement<CreateAndRetrieveMessage> createCreateAndRetrieveMessage(CreateAndRetrieveMessage value) {
        return new JAXBElement<CreateAndRetrieveMessage>(_CreateAndRetrieveMessage_QNAME, CreateAndRetrieveMessage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LicenseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clarizen.com/api", name = "LicenseType")
    public JAXBElement<LicenseType> createLicenseType(LicenseType value) {
        return new JAXBElement<LicenseType>(_LicenseType_QNAME, LicenseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfGetTodayInfoResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clarizen.com/api", name = "ArrayOfGetTodayInfoResult")
    public JAXBElement<ArrayOfGetTodayInfoResult> createArrayOfGetTodayInfoResult(ArrayOfGetTodayInfoResult value) {
        return new JAXBElement<ArrayOfGetTodayInfoResult>(_ArrayOfGetTodayInfoResult_QNAME, ArrayOfGetTodayInfoResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConditionList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clarizen.com/api", name = "ConditionList")
    public JAXBElement<ConditionList> createConditionList(ConditionList value) {
        return new JAXBElement<ConditionList>(_ConditionList_QNAME, ConditionList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSessionInfoMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clarizen.com/api", name = "GetSessionInfoMessage")
    public JAXBElement<GetSessionInfoMessage> createGetSessionInfoMessage(GetSessionInfoMessage value) {
        return new JAXBElement<GetSessionInfoMessage>(_GetSessionInfoMessage_QNAME, GetSessionInfoMessage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SessionHeader }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clarizen.com/api", name = "SessionHeader")
    public JAXBElement<SessionHeader> createSessionHeader(SessionHeader value) {
        return new JAXBElement<SessionHeader>(_SessionHeader_QNAME, SessionHeader.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfEntityId }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clarizen.com/api", name = "ArrayOfEntityId")
    public JAXBElement<ArrayOfEntityId> createArrayOfEntityId(ArrayOfEntityId value) {
        return new JAXBElement<ArrayOfEntityId>(_ArrayOfEntityId_QNAME, ArrayOfEntityId.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Error }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clarizen.com/api", name = "Error")
    public JAXBElement<Error> createError(Error value) {
        return new JAXBElement<Error>(_Error_QNAME, Error.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCalendarInfoResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clarizen.com/api", name = "GetCalendarInfoResult")
    public JAXBElement<GetCalendarInfoResult> createGetCalendarInfoResult(GetCalendarInfoResult value) {
        return new JAXBElement<GetCalendarInfoResult>(_GetCalendarInfoResult_QNAME, GetCalendarInfoResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FieldPermissions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clarizen.com/api", name = "FieldPermissions")
    public JAXBElement<FieldPermissions> createFieldPermissions(FieldPermissions value) {
        return new JAXBElement<FieldPermissions>(_FieldPermissions_QNAME, FieldPermissions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfBaseMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clarizen.com/api", name = "ArrayOfBaseMessage")
    public JAXBElement<ArrayOfBaseMessage> createArrayOfBaseMessage(ArrayOfBaseMessage value) {
        return new JAXBElement<ArrayOfBaseMessage>(_ArrayOfBaseMessage_QNAME, ArrayOfBaseMessage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CallOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clarizen.com/api", name = "CallOptions")
    public JAXBElement<CallOptions> createCallOptions(CallOptions value) {
        return new JAXBElement<CallOptions>(_CallOptions_QNAME, CallOptions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMultipleTodayInfoMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clarizen.com/api", name = "GetMultipleTodayInfoMessage")
    public JAXBElement<GetMultipleTodayInfoMessage> createGetMultipleTodayInfoMessage(GetMultipleTodayInfoMessage value) {
        return new JAXBElement<GetMultipleTodayInfoMessage>(_GetMultipleTodayInfoMessage_QNAME, GetMultipleTodayInfoMessage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Duration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clarizen.com/api", name = "Duration")
    public JAXBElement<Duration> createDuration(Duration value) {
        return new JAXBElement<Duration>(_Duration_QNAME, Duration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PermissionOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clarizen.com/api", name = "PermissionOptions")
    public JAXBElement<PermissionOptions> createPermissionOptions(PermissionOptions value) {
        return new JAXBElement<PermissionOptions>(_PermissionOptions_QNAME, PermissionOptions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateFromTemplateMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clarizen.com/api", name = "CreateFromTemplateMessage")
    public JAXBElement<CreateFromTemplateMessage> createCreateFromTemplateMessage(CreateFromTemplateMessage value) {
        return new JAXBElement<CreateFromTemplateMessage>(_CreateFromTemplateMessage_QNAME, CreateFromTemplateMessage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrieveMultipleResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clarizen.com/api", name = "RetrieveMultipleResult")
    public JAXBElement<RetrieveMultipleResult> createRetrieveMultipleResult(RetrieveMultipleResult value) {
        return new JAXBElement<RetrieveMultipleResult>(_RetrieveMultipleResult_QNAME, RetrieveMultipleResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExtendedLoginResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clarizen.com/api", name = "ExtendedLoginResult")
    public JAXBElement<ExtendedLoginResult> createExtendedLoginResult(ExtendedLoginResult value) {
        return new JAXBElement<ExtendedLoginResult>(_ExtendedLoginResult_QNAME, ExtendedLoginResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfBaseEntity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clarizen.com/api", name = "ArrayOfBaseEntity")
    public JAXBElement<ArrayOfBaseEntity> createArrayOfBaseEntity(ArrayOfBaseEntity value) {
        return new JAXBElement<ArrayOfBaseEntity>(_ArrayOfBaseEntity_QNAME, ArrayOfBaseEntity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link String }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clarizen.com/api", name = "TimesheetState")
    public JAXBElement<List<String>> createTimesheetState(List<String> value) {
        return new JAXBElement<List<String>>(_TimesheetState_QNAME, ((Class) List.class), null, ((List<String> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Day }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clarizen.com/api", name = "Day")
    public JAXBElement<Day> createDay(Day value) {
        return new JAXBElement<Day>(_Day_QNAME, Day.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSessionInfoResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clarizen.com/api", name = "GetSessionInfoResult")
    public JAXBElement<GetSessionInfoResult> createGetSessionInfoResult(GetSessionInfoResult value) {
        return new JAXBElement<GetSessionInfoResult>(_GetSessionInfoResult_QNAME, GetSessionInfoResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClientVersionInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clarizen.com/api", name = "ClientVersionInfo")
    public JAXBElement<ClientVersionInfo> createClientVersionInfo(ClientVersionInfo value) {
        return new JAXBElement<ClientVersionInfo>(_ClientVersionInfo_QNAME, ClientVersionInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WidgetFormat }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clarizen.com/api", name = "WidgetFormat")
    public JAXBElement<WidgetFormat> createWidgetFormat(WidgetFormat value) {
        return new JAXBElement<WidgetFormat>(_WidgetFormat_QNAME, WidgetFormat.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DurationUnit }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clarizen.com/api", name = "DurationUnit")
    public JAXBElement<DurationUnit> createDurationUnit(DurationUnit value) {
        return new JAXBElement<DurationUnit>(_DurationUnit_QNAME, DurationUnit.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfTodayInfoItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clarizen.com/api", name = "ArrayOfTodayInfoItem")
    public JAXBElement<ArrayOfTodayInfoItem> createArrayOfTodayInfoItem(ArrayOfTodayInfoItem value) {
        return new JAXBElement<ArrayOfTodayInfoItem>(_ArrayOfTodayInfoItem_QNAME, ArrayOfTodayInfoItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExtendedLoginOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clarizen.com/api", name = "ExtendedLoginOptions")
    public JAXBElement<ExtendedLoginOptions> createExtendedLoginOptions(ExtendedLoginOptions value) {
        return new JAXBElement<ExtendedLoginOptions>(_ExtendedLoginOptions_QNAME, ExtendedLoginOptions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EntityId }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clarizen.com/api", name = "EntityId")
    public JAXBElement<EntityId> createEntityId(EntityId value) {
        return new JAXBElement<EntityId>(_EntityId_QNAME, EntityId.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GenerateUniqueIdsResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clarizen.com/api", name = "GenerateUniqueIdsResult")
    public JAXBElement<GenerateUniqueIdsResult> createGenerateUniqueIdsResult(GenerateUniqueIdsResult value) {
        return new JAXBElement<GenerateUniqueIdsResult>(_GenerateUniqueIdsResult_QNAME, GenerateUniqueIdsResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TodayInfoItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clarizen.com/api", name = "TodayInfoItem")
    public JAXBElement<TodayInfoItem> createTodayInfoItem(TodayInfoItem value) {
        return new JAXBElement<TodayInfoItem>(_TodayInfoItem_QNAME, TodayInfoItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clarizen.com/api", name = "ArrayOfResult")
    public JAXBElement<ArrayOfResult> createArrayOfResult(ArrayOfResult value) {
        return new JAXBElement<ArrayOfResult>(_ArrayOfResult_QNAME, ArrayOfResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InstallApplicationMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clarizen.com/api", name = "InstallApplicationMessage")
    public JAXBElement<InstallApplicationMessage> createInstallApplicationMessage(InstallApplicationMessage value) {
        return new JAXBElement<InstallApplicationMessage>(_InstallApplicationMessage_QNAME, InstallApplicationMessage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetWidgetUrlResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clarizen.com/api", name = "GetWidgetUrlResult")
    public JAXBElement<GetWidgetUrlResult> createGetWidgetUrlResult(GetWidgetUrlResult value) {
        return new JAXBElement<GetWidgetUrlResult>(_GetWidgetUrlResult_QNAME, GetWidgetUrlResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDayInformation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clarizen.com/api", name = "ArrayOfDayInformation")
    public JAXBElement<ArrayOfDayInformation> createArrayOfDayInformation(ArrayOfDayInformation value) {
        return new JAXBElement<ArrayOfDayInformation>(_ArrayOfDayInformation_QNAME, ArrayOfDayInformation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfFieldValue }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clarizen.com/api", name = "ArrayOfFieldValue")
    public JAXBElement<ArrayOfFieldValue> createArrayOfFieldValue(ArrayOfFieldValue value) {
        return new JAXBElement<ArrayOfFieldValue>(_ArrayOfFieldValue_QNAME, ArrayOfFieldValue.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Permissions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clarizen.com/api", name = "Permissions")
    public JAXBElement<Permissions> createPermissions(Permissions value) {
        return new JAXBElement<Permissions>(_Permissions_QNAME, Permissions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FieldValue }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clarizen.com/api", name = "FieldValue")
    public JAXBElement<FieldValue> createFieldValue(FieldValue value) {
        return new JAXBElement<FieldValue>(_FieldValue_QNAME, FieldValue.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AnyTypeList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clarizen.com/api", name = "anyTypeList")
    public JAXBElement<AnyTypeList> createAnyTypeList(AnyTypeList value) {
        return new JAXBElement<AnyTypeList>(_AnyTypeList_QNAME, AnyTypeList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfObjectPermissions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clarizen.com/api", name = "ArrayOfObjectPermissions")
    public JAXBElement<ArrayOfObjectPermissions> createArrayOfObjectPermissions(ArrayOfObjectPermissions value) {
        return new JAXBElement<ArrayOfObjectPermissions>(_ArrayOfObjectPermissions_QNAME, ArrayOfObjectPermissions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SessionHeader }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clarizen.com/api", name = "Session")
    public JAXBElement<SessionHeader> createSession(SessionHeader value) {
        return new JAXBElement<SessionHeader>(_Session_QNAME, SessionHeader.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransactionMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clarizen.com/api", name = "TransactionMessage")
    public JAXBElement<TransactionMessage> createTransactionMessage(TransactionMessage value) {
        return new JAXBElement<TransactionMessage>(_TransactionMessage_QNAME, TransactionMessage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Recipient }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clarizen.com/api", name = "Recipient")
    public JAXBElement<Recipient> createRecipient(Recipient value) {
        return new JAXBElement<Recipient>(_Recipient_QNAME, Recipient.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ErrorValue }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clarizen.com/api", name = "ErrorValue")
    public JAXBElement<ErrorValue> createErrorValue(ErrorValue value) {
        return new JAXBElement<ErrorValue>(_ErrorValue_QNAME, ErrorValue.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GenericEntity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clarizen.com/api", name = "GenericEntity")
    public JAXBElement<GenericEntity> createGenericEntity(GenericEntity value) {
        return new JAXBElement<GenericEntity>(_GenericEntity_QNAME, GenericEntity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetWidgetUrlMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clarizen.com/api", name = "GetWidgetUrlMessage")
    public JAXBElement<GetWidgetUrlMessage> createGetWidgetUrlMessage(GetWidgetUrlMessage value) {
        return new JAXBElement<GetWidgetUrlMessage>(_GetWidgetUrlMessage_QNAME, GetWidgetUrlMessage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GenerateUniqueIdsMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clarizen.com/api", name = "GenerateUniqueIdsMessage")
    public JAXBElement<GenerateUniqueIdsMessage> createGenerateUniqueIdsMessage(GenerateUniqueIdsMessage value) {
        return new JAXBElement<GenerateUniqueIdsMessage>(_GenerateUniqueIdsMessage_QNAME, GenerateUniqueIdsMessage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrieveResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clarizen.com/api", name = "RetrieveResult")
    public JAXBElement<RetrieveResult> createRetrieveResult(RetrieveResult value) {
        return new JAXBElement<RetrieveResult>(_RetrieveResult_QNAME, RetrieveResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RecipientType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clarizen.com/api", name = "RecipientType")
    public JAXBElement<RecipientType> createRecipientType(RecipientType value) {
        return new JAXBElement<RecipientType>(_RecipientType_QNAME, RecipientType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObjectPermissions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clarizen.com/api", name = "ObjectPermissions")
    public JAXBElement<ObjectPermissions> createObjectPermissions(ObjectPermissions value) {
        return new JAXBElement<ObjectPermissions>(_ObjectPermissions_QNAME, ObjectPermissions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DurationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clarizen.com/api", name = "DurationType")
    public JAXBElement<DurationType> createDurationType(DurationType value) {
        return new JAXBElement<DurationType>(_DurationType_QNAME, DurationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Money }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clarizen.com/api", name = "Money")
    public JAXBElement<Money> createMoney(Money value) {
        return new JAXBElement<Money>(_Money_QNAME, Money.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfRecipient }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clarizen.com/api", name = "ArrayOfRecipient")
    public JAXBElement<ArrayOfRecipient> createArrayOfRecipient(ArrayOfRecipient value) {
        return new JAXBElement<ArrayOfRecipient>(_ArrayOfRecipient_QNAME, ArrayOfRecipient.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetServerDefinitionResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clarizen.com/api", name = "GetServerDefinitionResult")
    public JAXBElement<GetServerDefinitionResult> createGetServerDefinitionResult(GetServerDefinitionResult value) {
        return new JAXBElement<GetServerDefinitionResult>(_GetServerDefinitionResult_QNAME, GetServerDefinitionResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clarizen.com/api", name = "CreateMessage")
    public JAXBElement<CreateMessage> createCreateMessage(CreateMessage value) {
        return new JAXBElement<CreateMessage>(_CreateMessage_QNAME, CreateMessage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BaseEntity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clarizen.com/api", name = "BaseEntity")
    public JAXBElement<BaseEntity> createBaseEntity(BaseEntity value) {
        return new JAXBElement<BaseEntity>(_BaseEntity_QNAME, BaseEntity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FieldPermission }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clarizen.com/api", name = "FieldPermission")
    public JAXBElement<FieldPermission> createFieldPermission(FieldPermission value) {
        return new JAXBElement<FieldPermission>(_FieldPermission_QNAME, FieldPermission.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AppLoginResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clarizen.com/api", name = "AppLoginResult")
    public JAXBElement<AppLoginResult> createAppLoginResult(AppLoginResult value) {
        return new JAXBElement<AppLoginResult>(_AppLoginResult_QNAME, AppLoginResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CallOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clarizen.com/api", name = "Options")
    public JAXBElement<CallOptions> createOptions(CallOptions value) {
        return new JAXBElement<CallOptions>(_Options_QNAME, CallOptions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResetValue }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clarizen.com/api", name = "ResetValue")
    public JAXBElement<ResetValue> createResetValue(ResetValue value) {
        return new JAXBElement<ResetValue>(_ResetValue_QNAME, ResetValue.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clarizen.com/api", name = "CreateResult")
    public JAXBElement<CreateResult> createCreateResult(CreateResult value) {
        return new JAXBElement<CreateResult>(_CreateResult_QNAME, CreateResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clarizen.com/api", name = "UpdateMessage")
    public JAXBElement<UpdateMessage> createUpdateMessage(UpdateMessage value) {
        return new JAXBElement<UpdateMessage>(_UpdateMessage_QNAME, UpdateMessage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StringList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clarizen.com/api", name = "stringList")
    public JAXBElement<StringList> createStringList(StringList value) {
        return new JAXBElement<StringList>(_StringList_QNAME, StringList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetApplicationStatusMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clarizen.com/api", name = "GetApplicationStatusMessage")
    public JAXBElement<GetApplicationStatusMessage> createGetApplicationStatusMessage(GetApplicationStatusMessage value) {
        return new JAXBElement<GetApplicationStatusMessage>(_GetApplicationStatusMessage_QNAME, GetApplicationStatusMessage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LifecycleMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clarizen.com/api", name = "LifecycleMessage")
    public JAXBElement<LifecycleMessage> createLifecycleMessage(LifecycleMessage value) {
        return new JAXBElement<LifecycleMessage>(_LifecycleMessage_QNAME, LifecycleMessage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrieveMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clarizen.com/api", name = "RetrieveMessage")
    public JAXBElement<RetrieveMessage> createRetrieveMessage(RetrieveMessage value) {
        return new JAXBElement<RetrieveMessage>(_RetrieveMessage_QNAME, RetrieveMessage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DayInformation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clarizen.com/api", name = "DayInformation")
    public JAXBElement<DayInformation> createDayInformation(DayInformation value) {
        return new JAXBElement<DayInformation>(_DayInformation_QNAME, DayInformation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetApplicationStatusResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clarizen.com/api", name = "GetApplicationStatusResult")
    public JAXBElement<GetApplicationStatusResult> createGetApplicationStatusResult(GetApplicationStatusResult value) {
        return new JAXBElement<GetApplicationStatusResult>(_GetApplicationStatusResult_QNAME, GetApplicationStatusResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TodayQuery }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clarizen.com/api", name = "TodayQuery")
    public JAXBElement<TodayQuery> createTodayQuery(TodayQuery value) {
        return new JAXBElement<TodayQuery>(_TodayQuery_QNAME, TodayQuery.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BaseMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clarizen.com/api", name = "BaseMessage")
    public JAXBElement<BaseMessage> createBaseMessage(BaseMessage value) {
        return new JAXBElement<BaseMessage>(_BaseMessage_QNAME, BaseMessage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ErrorCode }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clarizen.com/api", name = "ErrorCode")
    public JAXBElement<ErrorCode> createErrorCode(ErrorCode value) {
        return new JAXBElement<ErrorCode>(_ErrorCode_QNAME, ErrorCode.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Result }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clarizen.com/api", name = "Result")
    public JAXBElement<Result> createResult(Result value) {
        return new JAXBElement<Result>(_Result_QNAME, Result.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clarizen.com/api", name = "DeleteMessage")
    public JAXBElement<DeleteMessage> createDeleteMessage(DeleteMessage value) {
        return new JAXBElement<DeleteMessage>(_DeleteMessage_QNAME, DeleteMessage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfRetrieveResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clarizen.com/api", name = "ArrayOfRetrieveResult")
    public JAXBElement<ArrayOfRetrieveResult> createArrayOfRetrieveResult(ArrayOfRetrieveResult value) {
        return new JAXBElement<ArrayOfRetrieveResult>(_ArrayOfRetrieveResult_QNAME, ArrayOfRetrieveResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoginOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clarizen.com/api", name = "LoginOptions")
    public JAXBElement<LoginOptions> createLoginOptions(LoginOptions value) {
        return new JAXBElement<LoginOptions>(_LoginOptions_QNAME, LoginOptions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTodayInfoMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clarizen.com/api", name = "GetTodayInfoMessage")
    public JAXBElement<GetTodayInfoMessage> createGetTodayInfoMessage(GetTodayInfoMessage value) {
        return new JAXBElement<GetTodayInfoMessage>(_GetTodayInfoMessage_QNAME, GetTodayInfoMessage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMultipleTodayInfoResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clarizen.com/api", name = "GetMultipleTodayInfoResult")
    public JAXBElement<GetMultipleTodayInfoResult> createGetMultipleTodayInfoResult(GetMultipleTodayInfoResult value) {
        return new JAXBElement<GetMultipleTodayInfoResult>(_GetMultipleTodayInfoResult_QNAME, GetMultipleTodayInfoResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Currency }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clarizen.com/api", name = "Currency")
    public JAXBElement<Currency> createCurrency(Currency value) {
        return new JAXBElement<Currency>(_Currency_QNAME, Currency.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindUserQuery }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clarizen.com/api", name = "FindUserQuery")
    public JAXBElement<FindUserQuery> createFindUserQuery(FindUserQuery value) {
        return new JAXBElement<FindUserQuery>(_FindUserQuery_QNAME, FindUserQuery.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCalendarInfoMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clarizen.com/api", name = "GetCalendarInfoMessage")
    public JAXBElement<GetCalendarInfoMessage> createGetCalendarInfoMessage(GetCalendarInfoMessage value) {
        return new JAXBElement<GetCalendarInfoMessage>(_GetCalendarInfoMessage_QNAME, GetCalendarInfoMessage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CallInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clarizen.com/api", name = "CallInfo")
    public JAXBElement<CallInfo> createCallInfo(CallInfo value) {
        return new JAXBElement<CallInfo>(_CallInfo_QNAME, CallInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoginResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clarizen.com/api", name = "LoginResult")
    public JAXBElement<LoginResult> createLoginResult(LoginResult value) {
        return new JAXBElement<LoginResult>(_LoginResult_QNAME, LoginResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTodayInfoResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clarizen.com/api", name = "GetTodayInfoResult")
    public JAXBElement<GetTodayInfoResult> createGetTodayInfoResult(GetTodayInfoResult value) {
        return new JAXBElement<GetTodayInfoResult>(_GetTodayInfoResult_QNAME, GetTodayInfoResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendEMailMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clarizen.com/api", name = "SendEMailMessage")
    public JAXBElement<SendEMailMessage> createSendEMailMessage(SendEMailMessage value) {
        return new JAXBElement<SendEMailMessage>(_SendEMailMessage_QNAME, SendEMailMessage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AppLoginMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clarizen.com/api", name = "AppLoginMessage")
    public JAXBElement<AppLoginMessage> createAppLoginMessage(AppLoginMessage value) {
        return new JAXBElement<AppLoginMessage>(_AppLoginMessage_QNAME, AppLoginMessage.class, null, value);
    }

}
