
package com.clarizen.api.queries;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.clarizen.api.queries package. 
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

    private final static QName _BuiltInQuery_QNAME = new QName("http://clarizen.com/api/queries", "BuiltInQuery");
    private final static QName _Order_QNAME = new QName("http://clarizen.com/api/queries", "Order");
    private final static QName _GetWorkItemResourcesResult_QNAME = new QName("http://clarizen.com/api/queries", "GetWorkItemResourcesResult");
    private final static QName _CountQueryResult_QNAME = new QName("http://clarizen.com/api/queries", "CountQueryResult");
    private final static QName _GetTemplateDescriptionsResult_QNAME = new QName("http://clarizen.com/api/queries", "GetTemplateDescriptionsResult");
    private final static QName _Query_QNAME = new QName("http://clarizen.com/api/queries", "Query");
    private final static QName _QueryByExample_QNAME = new QName("http://clarizen.com/api/queries", "QueryByExample");
    private final static QName _WorkItemResources_QNAME = new QName("http://clarizen.com/api/queries", "WorkItemResources");
    private final static QName _WorkItemRecursiveQuery_QNAME = new QName("http://clarizen.com/api/queries", "WorkItemRecursiveQuery");
    private final static QName _Paging_QNAME = new QName("http://clarizen.com/api/queries", "Paging");
    private final static QName _GetWorkItemResourcesMessage_QNAME = new QName("http://clarizen.com/api/queries", "GetWorkItemResourcesMessage");
    private final static QName _And_QNAME = new QName("http://clarizen.com/api/queries", "And");
    private final static QName _EntityIdExpression_QNAME = new QName("http://clarizen.com/api/queries", "EntityIdExpression");
    private final static QName _GetTemplateDescriptionsMessage_QNAME = new QName("http://clarizen.com/api/queries", "GetTemplateDescriptionsMessage");
    private final static QName _ConstantExpression_QNAME = new QName("http://clarizen.com/api/queries", "ConstantExpression");
    private final static QName _Or_QNAME = new QName("http://clarizen.com/api/queries", "Or");
    private final static QName _Expression_QNAME = new QName("http://clarizen.com/api/queries", "Expression");
    private final static QName _EntityQuery_QNAME = new QName("http://clarizen.com/api/queries", "EntityQuery");
    private final static QName _Compare_QNAME = new QName("http://clarizen.com/api/queries", "Compare");
    private final static QName _LogicalCondition_QNAME = new QName("http://clarizen.com/api/queries", "LogicalCondition");
    private final static QName _QueryResult_QNAME = new QName("http://clarizen.com/api/queries", "QueryResult");
    private final static QName _RecursiveQuery_QNAME = new QName("http://clarizen.com/api/queries", "RecursiveQuery");
    private final static QName _QueryExpression_QNAME = new QName("http://clarizen.com/api/queries", "QueryExpression");
    private final static QName _CountQuery_QNAME = new QName("http://clarizen.com/api/queries", "CountQuery");
    private final static QName _Condition_QNAME = new QName("http://clarizen.com/api/queries", "Condition");
    private final static QName _SearchQuery_QNAME = new QName("http://clarizen.com/api/queries", "SearchQuery");
    private final static QName _Operator_QNAME = new QName("http://clarizen.com/api/queries", "Operator");
    private final static QName _FieldExpression_QNAME = new QName("http://clarizen.com/api/queries", "FieldExpression");
    private final static QName _ArrayOfWorkItemResources_QNAME = new QName("http://clarizen.com/api/queries", "ArrayOfWorkItemResources");
    private final static QName _ArrayOfOrderBy_QNAME = new QName("http://clarizen.com/api/queries", "ArrayOfOrderBy");
    private final static QName _OrderBy_QNAME = new QName("http://clarizen.com/api/queries", "OrderBy");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.clarizen.api.queries
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetWorkItemResourcesMessage }
     * 
     */
    public GetWorkItemResourcesMessage createGetWorkItemResourcesMessage() {
        return new GetWorkItemResourcesMessage();
    }

    /**
     * Create an instance of {@link EntityQuery }
     * 
     */
    public EntityQuery createEntityQuery() {
        return new EntityQuery();
    }

    /**
     * Create an instance of {@link Condition }
     * 
     */
    public Condition createCondition() {
        return new Condition();
    }

    /**
     * Create an instance of {@link BuiltInQuery }
     * 
     */
    public BuiltInQuery createBuiltInQuery() {
        return new BuiltInQuery();
    }

    /**
     * Create an instance of {@link And }
     * 
     */
    public And createAnd() {
        return new And();
    }

    /**
     * Create an instance of {@link ArrayOfOrderBy }
     * 
     */
    public ArrayOfOrderBy createArrayOfOrderBy() {
        return new ArrayOfOrderBy();
    }

    /**
     * Create an instance of {@link QueryExpression }
     * 
     */
    public QueryExpression createQueryExpression() {
        return new QueryExpression();
    }

    /**
     * Create an instance of {@link Paging }
     * 
     */
    public Paging createPaging() {
        return new Paging();
    }

    /**
     * Create an instance of {@link RecursiveQuery }
     * 
     */
    public RecursiveQuery createRecursiveQuery() {
        return new RecursiveQuery();
    }

    /**
     * Create an instance of {@link WorkItemRecursiveQuery }
     * 
     */
    public WorkItemRecursiveQuery createWorkItemRecursiveQuery() {
        return new WorkItemRecursiveQuery();
    }

    /**
     * Create an instance of {@link Expression }
     * 
     */
    public Expression createExpression() {
        return new Expression();
    }

    /**
     * Create an instance of {@link CountQuery }
     * 
     */
    public CountQuery createCountQuery() {
        return new CountQuery();
    }

    /**
     * Create an instance of {@link QueryByExample }
     * 
     */
    public QueryByExample createQueryByExample() {
        return new QueryByExample();
    }

    /**
     * Create an instance of {@link CountQueryResult }
     * 
     */
    public CountQueryResult createCountQueryResult() {
        return new CountQueryResult();
    }

    /**
     * Create an instance of {@link GetTemplateDescriptionsResult }
     * 
     */
    public GetTemplateDescriptionsResult createGetTemplateDescriptionsResult() {
        return new GetTemplateDescriptionsResult();
    }

    /**
     * Create an instance of {@link GetWorkItemResourcesResult }
     * 
     */
    public GetWorkItemResourcesResult createGetWorkItemResourcesResult() {
        return new GetWorkItemResourcesResult();
    }

    /**
     * Create an instance of {@link ConstantExpression }
     * 
     */
    public ConstantExpression createConstantExpression() {
        return new ConstantExpression();
    }

    /**
     * Create an instance of {@link Or }
     * 
     */
    public Or createOr() {
        return new Or();
    }

    /**
     * Create an instance of {@link Query }
     * 
     */
    public Query createQuery() {
        return new Query();
    }

    /**
     * Create an instance of {@link EntityIdExpression }
     * 
     */
    public EntityIdExpression createEntityIdExpression() {
        return new EntityIdExpression();
    }

    /**
     * Create an instance of {@link OrderBy }
     * 
     */
    public OrderBy createOrderBy() {
        return new OrderBy();
    }

    /**
     * Create an instance of {@link FieldExpression }
     * 
     */
    public FieldExpression createFieldExpression() {
        return new FieldExpression();
    }

    /**
     * Create an instance of {@link GetTemplateDescriptionsMessage }
     * 
     */
    public GetTemplateDescriptionsMessage createGetTemplateDescriptionsMessage() {
        return new GetTemplateDescriptionsMessage();
    }

    /**
     * Create an instance of {@link WorkItemResources }
     * 
     */
    public WorkItemResources createWorkItemResources() {
        return new WorkItemResources();
    }

    /**
     * Create an instance of {@link LogicalCondition }
     * 
     */
    public LogicalCondition createLogicalCondition() {
        return new LogicalCondition();
    }

    /**
     * Create an instance of {@link SearchQuery }
     * 
     */
    public SearchQuery createSearchQuery() {
        return new SearchQuery();
    }

    /**
     * Create an instance of {@link ArrayOfWorkItemResources }
     * 
     */
    public ArrayOfWorkItemResources createArrayOfWorkItemResources() {
        return new ArrayOfWorkItemResources();
    }

    /**
     * Create an instance of {@link Compare }
     * 
     */
    public Compare createCompare() {
        return new Compare();
    }

    /**
     * Create an instance of {@link QueryResult }
     * 
     */
    public QueryResult createQueryResult() {
        return new QueryResult();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuiltInQuery }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clarizen.com/api/queries", name = "BuiltInQuery")
    public JAXBElement<BuiltInQuery> createBuiltInQuery(BuiltInQuery value) {
        return new JAXBElement<BuiltInQuery>(_BuiltInQuery_QNAME, BuiltInQuery.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Order }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clarizen.com/api/queries", name = "Order")
    public JAXBElement<Order> createOrder(Order value) {
        return new JAXBElement<Order>(_Order_QNAME, Order.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetWorkItemResourcesResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clarizen.com/api/queries", name = "GetWorkItemResourcesResult")
    public JAXBElement<GetWorkItemResourcesResult> createGetWorkItemResourcesResult(GetWorkItemResourcesResult value) {
        return new JAXBElement<GetWorkItemResourcesResult>(_GetWorkItemResourcesResult_QNAME, GetWorkItemResourcesResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CountQueryResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clarizen.com/api/queries", name = "CountQueryResult")
    public JAXBElement<CountQueryResult> createCountQueryResult(CountQueryResult value) {
        return new JAXBElement<CountQueryResult>(_CountQueryResult_QNAME, CountQueryResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTemplateDescriptionsResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clarizen.com/api/queries", name = "GetTemplateDescriptionsResult")
    public JAXBElement<GetTemplateDescriptionsResult> createGetTemplateDescriptionsResult(GetTemplateDescriptionsResult value) {
        return new JAXBElement<GetTemplateDescriptionsResult>(_GetTemplateDescriptionsResult_QNAME, GetTemplateDescriptionsResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Query }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clarizen.com/api/queries", name = "Query")
    public JAXBElement<Query> createQuery(Query value) {
        return new JAXBElement<Query>(_Query_QNAME, Query.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryByExample }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clarizen.com/api/queries", name = "QueryByExample")
    public JAXBElement<QueryByExample> createQueryByExample(QueryByExample value) {
        return new JAXBElement<QueryByExample>(_QueryByExample_QNAME, QueryByExample.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WorkItemResources }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clarizen.com/api/queries", name = "WorkItemResources")
    public JAXBElement<WorkItemResources> createWorkItemResources(WorkItemResources value) {
        return new JAXBElement<WorkItemResources>(_WorkItemResources_QNAME, WorkItemResources.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WorkItemRecursiveQuery }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clarizen.com/api/queries", name = "WorkItemRecursiveQuery")
    public JAXBElement<WorkItemRecursiveQuery> createWorkItemRecursiveQuery(WorkItemRecursiveQuery value) {
        return new JAXBElement<WorkItemRecursiveQuery>(_WorkItemRecursiveQuery_QNAME, WorkItemRecursiveQuery.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Paging }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clarizen.com/api/queries", name = "Paging")
    public JAXBElement<Paging> createPaging(Paging value) {
        return new JAXBElement<Paging>(_Paging_QNAME, Paging.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetWorkItemResourcesMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clarizen.com/api/queries", name = "GetWorkItemResourcesMessage")
    public JAXBElement<GetWorkItemResourcesMessage> createGetWorkItemResourcesMessage(GetWorkItemResourcesMessage value) {
        return new JAXBElement<GetWorkItemResourcesMessage>(_GetWorkItemResourcesMessage_QNAME, GetWorkItemResourcesMessage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link And }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clarizen.com/api/queries", name = "And")
    public JAXBElement<And> createAnd(And value) {
        return new JAXBElement<And>(_And_QNAME, And.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EntityIdExpression }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clarizen.com/api/queries", name = "EntityIdExpression")
    public JAXBElement<EntityIdExpression> createEntityIdExpression(EntityIdExpression value) {
        return new JAXBElement<EntityIdExpression>(_EntityIdExpression_QNAME, EntityIdExpression.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTemplateDescriptionsMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clarizen.com/api/queries", name = "GetTemplateDescriptionsMessage")
    public JAXBElement<GetTemplateDescriptionsMessage> createGetTemplateDescriptionsMessage(GetTemplateDescriptionsMessage value) {
        return new JAXBElement<GetTemplateDescriptionsMessage>(_GetTemplateDescriptionsMessage_QNAME, GetTemplateDescriptionsMessage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConstantExpression }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clarizen.com/api/queries", name = "ConstantExpression")
    public JAXBElement<ConstantExpression> createConstantExpression(ConstantExpression value) {
        return new JAXBElement<ConstantExpression>(_ConstantExpression_QNAME, ConstantExpression.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Or }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clarizen.com/api/queries", name = "Or")
    public JAXBElement<Or> createOr(Or value) {
        return new JAXBElement<Or>(_Or_QNAME, Or.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Expression }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clarizen.com/api/queries", name = "Expression")
    public JAXBElement<Expression> createExpression(Expression value) {
        return new JAXBElement<Expression>(_Expression_QNAME, Expression.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EntityQuery }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clarizen.com/api/queries", name = "EntityQuery")
    public JAXBElement<EntityQuery> createEntityQuery(EntityQuery value) {
        return new JAXBElement<EntityQuery>(_EntityQuery_QNAME, EntityQuery.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Compare }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clarizen.com/api/queries", name = "Compare")
    public JAXBElement<Compare> createCompare(Compare value) {
        return new JAXBElement<Compare>(_Compare_QNAME, Compare.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LogicalCondition }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clarizen.com/api/queries", name = "LogicalCondition")
    public JAXBElement<LogicalCondition> createLogicalCondition(LogicalCondition value) {
        return new JAXBElement<LogicalCondition>(_LogicalCondition_QNAME, LogicalCondition.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clarizen.com/api/queries", name = "QueryResult")
    public JAXBElement<QueryResult> createQueryResult(QueryResult value) {
        return new JAXBElement<QueryResult>(_QueryResult_QNAME, QueryResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RecursiveQuery }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clarizen.com/api/queries", name = "RecursiveQuery")
    public JAXBElement<RecursiveQuery> createRecursiveQuery(RecursiveQuery value) {
        return new JAXBElement<RecursiveQuery>(_RecursiveQuery_QNAME, RecursiveQuery.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryExpression }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clarizen.com/api/queries", name = "QueryExpression")
    public JAXBElement<QueryExpression> createQueryExpression(QueryExpression value) {
        return new JAXBElement<QueryExpression>(_QueryExpression_QNAME, QueryExpression.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CountQuery }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clarizen.com/api/queries", name = "CountQuery")
    public JAXBElement<CountQuery> createCountQuery(CountQuery value) {
        return new JAXBElement<CountQuery>(_CountQuery_QNAME, CountQuery.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Condition }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clarizen.com/api/queries", name = "Condition")
    public JAXBElement<Condition> createCondition(Condition value) {
        return new JAXBElement<Condition>(_Condition_QNAME, Condition.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchQuery }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clarizen.com/api/queries", name = "SearchQuery")
    public JAXBElement<SearchQuery> createSearchQuery(SearchQuery value) {
        return new JAXBElement<SearchQuery>(_SearchQuery_QNAME, SearchQuery.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Operator }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clarizen.com/api/queries", name = "Operator")
    public JAXBElement<Operator> createOperator(Operator value) {
        return new JAXBElement<Operator>(_Operator_QNAME, Operator.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FieldExpression }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clarizen.com/api/queries", name = "FieldExpression")
    public JAXBElement<FieldExpression> createFieldExpression(FieldExpression value) {
        return new JAXBElement<FieldExpression>(_FieldExpression_QNAME, FieldExpression.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfWorkItemResources }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clarizen.com/api/queries", name = "ArrayOfWorkItemResources")
    public JAXBElement<ArrayOfWorkItemResources> createArrayOfWorkItemResources(ArrayOfWorkItemResources value) {
        return new JAXBElement<ArrayOfWorkItemResources>(_ArrayOfWorkItemResources_QNAME, ArrayOfWorkItemResources.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfOrderBy }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clarizen.com/api/queries", name = "ArrayOfOrderBy")
    public JAXBElement<ArrayOfOrderBy> createArrayOfOrderBy(ArrayOfOrderBy value) {
        return new JAXBElement<ArrayOfOrderBy>(_ArrayOfOrderBy_QNAME, ArrayOfOrderBy.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrderBy }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clarizen.com/api/queries", name = "OrderBy")
    public JAXBElement<OrderBy> createOrderBy(OrderBy value) {
        return new JAXBElement<OrderBy>(_OrderBy_QNAME, OrderBy.class, null, value);
    }

}
