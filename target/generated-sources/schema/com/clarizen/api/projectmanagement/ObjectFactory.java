
package com.clarizen.api.projectmanagement;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.clarizen.api.projectmanagement package. 
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

    private final static QName _WorkItemFilter_QNAME = new QName("http://clarizen.com/api/projectManagement", "WorkItemFilter");
    private final static QName _TimesheetViewQuery_QNAME = new QName("http://clarizen.com/api/projectManagement", "TimesheetViewQuery");
    private final static QName _CommentVisibility_QNAME = new QName("http://clarizen.com/api/projectManagement", "CommentVisibility");
    private final static QName _CommentType_QNAME = new QName("http://clarizen.com/api/projectManagement", "CommentType");
    private final static QName _WorkItemsQuery_QNAME = new QName("http://clarizen.com/api/projectManagement", "WorkItemsQuery");
    private final static QName _WorkItemType_QNAME = new QName("http://clarizen.com/api/projectManagement", "WorkItemType");
    private final static QName _WorkItemsByFileNameQuery_QNAME = new QName("http://clarizen.com/api/projectManagement", "WorkItemsByFileNameQuery");
    private final static QName _DocumentsQuery_QNAME = new QName("http://clarizen.com/api/projectManagement", "DocumentsQuery");
    private final static QName _CommentsQuery_QNAME = new QName("http://clarizen.com/api/projectManagement", "CommentsQuery");
    private final static QName _MyWorkItemsQuery_QNAME = new QName("http://clarizen.com/api/projectManagement", "MyWorkItemsQuery");
    private final static QName _ExpenseQuery_QNAME = new QName("http://clarizen.com/api/projectManagement", "ExpenseQuery");
    private final static QName _IssuesQuery_QNAME = new QName("http://clarizen.com/api/projectManagement", "IssuesQuery");
    private final static QName _TimesheetQuery_QNAME = new QName("http://clarizen.com/api/projectManagement", "TimesheetQuery");
    private final static QName _WorkItemState_QNAME = new QName("http://clarizen.com/api/projectManagement", "WorkItemState");
    private final static QName _ProjectIssuesQuery_QNAME = new QName("http://clarizen.com/api/projectManagement", "ProjectIssuesQuery");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.clarizen.api.projectmanagement
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link MyWorkItemsQuery }
     * 
     */
    public MyWorkItemsQuery createMyWorkItemsQuery() {
        return new MyWorkItemsQuery();
    }

    /**
     * Create an instance of {@link TimesheetViewQuery }
     * 
     */
    public TimesheetViewQuery createTimesheetViewQuery() {
        return new TimesheetViewQuery();
    }

    /**
     * Create an instance of {@link WorkItemsByFileNameQuery }
     * 
     */
    public WorkItemsByFileNameQuery createWorkItemsByFileNameQuery() {
        return new WorkItemsByFileNameQuery();
    }

    /**
     * Create an instance of {@link IssuesQuery }
     * 
     */
    public IssuesQuery createIssuesQuery() {
        return new IssuesQuery();
    }

    /**
     * Create an instance of {@link ExpenseQuery }
     * 
     */
    public ExpenseQuery createExpenseQuery() {
        return new ExpenseQuery();
    }

    /**
     * Create an instance of {@link DocumentsQuery }
     * 
     */
    public DocumentsQuery createDocumentsQuery() {
        return new DocumentsQuery();
    }

    /**
     * Create an instance of {@link WorkItemsQuery }
     * 
     */
    public WorkItemsQuery createWorkItemsQuery() {
        return new WorkItemsQuery();
    }

    /**
     * Create an instance of {@link CommentsQuery }
     * 
     */
    public CommentsQuery createCommentsQuery() {
        return new CommentsQuery();
    }

    /**
     * Create an instance of {@link ProjectIssuesQuery }
     * 
     */
    public ProjectIssuesQuery createProjectIssuesQuery() {
        return new ProjectIssuesQuery();
    }

    /**
     * Create an instance of {@link TimesheetQuery }
     * 
     */
    public TimesheetQuery createTimesheetQuery() {
        return new TimesheetQuery();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WorkItemFilter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clarizen.com/api/projectManagement", name = "WorkItemFilter")
    public JAXBElement<WorkItemFilter> createWorkItemFilter(WorkItemFilter value) {
        return new JAXBElement<WorkItemFilter>(_WorkItemFilter_QNAME, WorkItemFilter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TimesheetViewQuery }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clarizen.com/api/projectManagement", name = "TimesheetViewQuery")
    public JAXBElement<TimesheetViewQuery> createTimesheetViewQuery(TimesheetViewQuery value) {
        return new JAXBElement<TimesheetViewQuery>(_TimesheetViewQuery_QNAME, TimesheetViewQuery.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CommentVisibility }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clarizen.com/api/projectManagement", name = "CommentVisibility")
    public JAXBElement<CommentVisibility> createCommentVisibility(CommentVisibility value) {
        return new JAXBElement<CommentVisibility>(_CommentVisibility_QNAME, CommentVisibility.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CommentType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clarizen.com/api/projectManagement", name = "CommentType")
    public JAXBElement<CommentType> createCommentType(CommentType value) {
        return new JAXBElement<CommentType>(_CommentType_QNAME, CommentType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WorkItemsQuery }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clarizen.com/api/projectManagement", name = "WorkItemsQuery")
    public JAXBElement<WorkItemsQuery> createWorkItemsQuery(WorkItemsQuery value) {
        return new JAXBElement<WorkItemsQuery>(_WorkItemsQuery_QNAME, WorkItemsQuery.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WorkItemType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clarizen.com/api/projectManagement", name = "WorkItemType")
    public JAXBElement<WorkItemType> createWorkItemType(WorkItemType value) {
        return new JAXBElement<WorkItemType>(_WorkItemType_QNAME, WorkItemType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WorkItemsByFileNameQuery }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clarizen.com/api/projectManagement", name = "WorkItemsByFileNameQuery")
    public JAXBElement<WorkItemsByFileNameQuery> createWorkItemsByFileNameQuery(WorkItemsByFileNameQuery value) {
        return new JAXBElement<WorkItemsByFileNameQuery>(_WorkItemsByFileNameQuery_QNAME, WorkItemsByFileNameQuery.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentsQuery }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clarizen.com/api/projectManagement", name = "DocumentsQuery")
    public JAXBElement<DocumentsQuery> createDocumentsQuery(DocumentsQuery value) {
        return new JAXBElement<DocumentsQuery>(_DocumentsQuery_QNAME, DocumentsQuery.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CommentsQuery }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clarizen.com/api/projectManagement", name = "CommentsQuery")
    public JAXBElement<CommentsQuery> createCommentsQuery(CommentsQuery value) {
        return new JAXBElement<CommentsQuery>(_CommentsQuery_QNAME, CommentsQuery.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MyWorkItemsQuery }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clarizen.com/api/projectManagement", name = "MyWorkItemsQuery")
    public JAXBElement<MyWorkItemsQuery> createMyWorkItemsQuery(MyWorkItemsQuery value) {
        return new JAXBElement<MyWorkItemsQuery>(_MyWorkItemsQuery_QNAME, MyWorkItemsQuery.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExpenseQuery }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clarizen.com/api/projectManagement", name = "ExpenseQuery")
    public JAXBElement<ExpenseQuery> createExpenseQuery(ExpenseQuery value) {
        return new JAXBElement<ExpenseQuery>(_ExpenseQuery_QNAME, ExpenseQuery.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IssuesQuery }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clarizen.com/api/projectManagement", name = "IssuesQuery")
    public JAXBElement<IssuesQuery> createIssuesQuery(IssuesQuery value) {
        return new JAXBElement<IssuesQuery>(_IssuesQuery_QNAME, IssuesQuery.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TimesheetQuery }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clarizen.com/api/projectManagement", name = "TimesheetQuery")
    public JAXBElement<TimesheetQuery> createTimesheetQuery(TimesheetQuery value) {
        return new JAXBElement<TimesheetQuery>(_TimesheetQuery_QNAME, TimesheetQuery.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WorkItemState }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clarizen.com/api/projectManagement", name = "WorkItemState")
    public JAXBElement<WorkItemState> createWorkItemState(WorkItemState value) {
        return new JAXBElement<WorkItemState>(_WorkItemState_QNAME, WorkItemState.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProjectIssuesQuery }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clarizen.com/api/projectManagement", name = "ProjectIssuesQuery")
    public JAXBElement<ProjectIssuesQuery> createProjectIssuesQuery(ProjectIssuesQuery value) {
        return new JAXBElement<ProjectIssuesQuery>(_ProjectIssuesQuery_QNAME, ProjectIssuesQuery.class, null, value);
    }

}
