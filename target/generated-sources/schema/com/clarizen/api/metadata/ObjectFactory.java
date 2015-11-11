
package com.clarizen.api.metadata;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.clarizen.api.metadata package. 
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

    private final static QName _DescribeEntitiesMessage_QNAME = new QName("http://clarizen.com/api/metadata", "DescribeEntitiesMessage");
    private final static QName _EntityDescription_QNAME = new QName("http://clarizen.com/api/metadata", "EntityDescription");
    private final static QName _MetadataMessage_QNAME = new QName("http://clarizen.com/api/metadata", "MetadataMessage");
    private final static QName _PickupDescription_QNAME = new QName("http://clarizen.com/api/metadata", "PickupDescription");
    private final static QName _FieldDescription_QNAME = new QName("http://clarizen.com/api/metadata", "FieldDescription");
    private final static QName _FieldType_QNAME = new QName("http://clarizen.com/api/metadata", "FieldType");
    private final static QName _ArrayOfFieldDescription_QNAME = new QName("http://clarizen.com/api/metadata", "ArrayOfFieldDescription");
    private final static QName _PossibleLinkDescription_QNAME = new QName("http://clarizen.com/api/metadata", "PossibleLinkDescription");
    private final static QName _PresentationType_QNAME = new QName("http://clarizen.com/api/metadata", "PresentationType");
    private final static QName _GetSystemSettingsValuesResult_QNAME = new QName("http://clarizen.com/api/metadata", "GetSystemSettingsValuesResult");
    private final static QName _EntityFieldDescription_QNAME = new QName("http://clarizen.com/api/metadata", "EntityFieldDescription");
    private final static QName _ArrayOfPossibleLinkDescription_QNAME = new QName("http://clarizen.com/api/metadata", "ArrayOfPossibleLinkDescription");
    private final static QName _DescribeEntitiesResult_QNAME = new QName("http://clarizen.com/api/metadata", "DescribeEntitiesResult");
    private final static QName _ListEntitiesResult_QNAME = new QName("http://clarizen.com/api/metadata", "ListEntitiesResult");
    private final static QName _PickupEntityDescription_QNAME = new QName("http://clarizen.com/api/metadata", "PickupEntityDescription");
    private final static QName _LinkEntityDescription_QNAME = new QName("http://clarizen.com/api/metadata", "LinkEntityDescription");
    private final static QName _ArrayOfEntityDescription_QNAME = new QName("http://clarizen.com/api/metadata", "ArrayOfEntityDescription");
    private final static QName _ArrayOfPickupDescription_QNAME = new QName("http://clarizen.com/api/metadata", "ArrayOfPickupDescription");
    private final static QName _GetSystemSettingsValuesMessage_QNAME = new QName("http://clarizen.com/api/metadata", "GetSystemSettingsValuesMessage");
    private final static QName _ListEntitiesMessage_QNAME = new QName("http://clarizen.com/api/metadata", "ListEntitiesMessage");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.clarizen.api.metadata
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link MetadataMessage }
     * 
     */
    public MetadataMessage createMetadataMessage() {
        return new MetadataMessage();
    }

    /**
     * Create an instance of {@link GetSystemSettingsValuesResult }
     * 
     */
    public GetSystemSettingsValuesResult createGetSystemSettingsValuesResult() {
        return new GetSystemSettingsValuesResult();
    }

    /**
     * Create an instance of {@link ArrayOfPickupDescription }
     * 
     */
    public ArrayOfPickupDescription createArrayOfPickupDescription() {
        return new ArrayOfPickupDescription();
    }

    /**
     * Create an instance of {@link ListEntitiesResult }
     * 
     */
    public ListEntitiesResult createListEntitiesResult() {
        return new ListEntitiesResult();
    }

    /**
     * Create an instance of {@link FieldDescription }
     * 
     */
    public FieldDescription createFieldDescription() {
        return new FieldDescription();
    }

    /**
     * Create an instance of {@link PossibleLinkDescription }
     * 
     */
    public PossibleLinkDescription createPossibleLinkDescription() {
        return new PossibleLinkDescription();
    }

    /**
     * Create an instance of {@link PickupDescription }
     * 
     */
    public PickupDescription createPickupDescription() {
        return new PickupDescription();
    }

    /**
     * Create an instance of {@link DescribeEntitiesResult }
     * 
     */
    public DescribeEntitiesResult createDescribeEntitiesResult() {
        return new DescribeEntitiesResult();
    }

    /**
     * Create an instance of {@link EntityDescription }
     * 
     */
    public EntityDescription createEntityDescription() {
        return new EntityDescription();
    }

    /**
     * Create an instance of {@link ArrayOfPossibleLinkDescription }
     * 
     */
    public ArrayOfPossibleLinkDescription createArrayOfPossibleLinkDescription() {
        return new ArrayOfPossibleLinkDescription();
    }

    /**
     * Create an instance of {@link EntityFieldDescription }
     * 
     */
    public EntityFieldDescription createEntityFieldDescription() {
        return new EntityFieldDescription();
    }

    /**
     * Create an instance of {@link ListEntitiesMessage }
     * 
     */
    public ListEntitiesMessage createListEntitiesMessage() {
        return new ListEntitiesMessage();
    }

    /**
     * Create an instance of {@link LinkEntityDescription }
     * 
     */
    public LinkEntityDescription createLinkEntityDescription() {
        return new LinkEntityDescription();
    }

    /**
     * Create an instance of {@link GetSystemSettingsValuesMessage }
     * 
     */
    public GetSystemSettingsValuesMessage createGetSystemSettingsValuesMessage() {
        return new GetSystemSettingsValuesMessage();
    }

    /**
     * Create an instance of {@link ArrayOfFieldDescription }
     * 
     */
    public ArrayOfFieldDescription createArrayOfFieldDescription() {
        return new ArrayOfFieldDescription();
    }

    /**
     * Create an instance of {@link ArrayOfEntityDescription }
     * 
     */
    public ArrayOfEntityDescription createArrayOfEntityDescription() {
        return new ArrayOfEntityDescription();
    }

    /**
     * Create an instance of {@link DescribeEntitiesMessage }
     * 
     */
    public DescribeEntitiesMessage createDescribeEntitiesMessage() {
        return new DescribeEntitiesMessage();
    }

    /**
     * Create an instance of {@link PickupEntityDescription }
     * 
     */
    public PickupEntityDescription createPickupEntityDescription() {
        return new PickupEntityDescription();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DescribeEntitiesMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clarizen.com/api/metadata", name = "DescribeEntitiesMessage")
    public JAXBElement<DescribeEntitiesMessage> createDescribeEntitiesMessage(DescribeEntitiesMessage value) {
        return new JAXBElement<DescribeEntitiesMessage>(_DescribeEntitiesMessage_QNAME, DescribeEntitiesMessage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EntityDescription }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clarizen.com/api/metadata", name = "EntityDescription")
    public JAXBElement<EntityDescription> createEntityDescription(EntityDescription value) {
        return new JAXBElement<EntityDescription>(_EntityDescription_QNAME, EntityDescription.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MetadataMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clarizen.com/api/metadata", name = "MetadataMessage")
    public JAXBElement<MetadataMessage> createMetadataMessage(MetadataMessage value) {
        return new JAXBElement<MetadataMessage>(_MetadataMessage_QNAME, MetadataMessage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PickupDescription }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clarizen.com/api/metadata", name = "PickupDescription")
    public JAXBElement<PickupDescription> createPickupDescription(PickupDescription value) {
        return new JAXBElement<PickupDescription>(_PickupDescription_QNAME, PickupDescription.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FieldDescription }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clarizen.com/api/metadata", name = "FieldDescription")
    public JAXBElement<FieldDescription> createFieldDescription(FieldDescription value) {
        return new JAXBElement<FieldDescription>(_FieldDescription_QNAME, FieldDescription.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FieldType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clarizen.com/api/metadata", name = "FieldType")
    public JAXBElement<FieldType> createFieldType(FieldType value) {
        return new JAXBElement<FieldType>(_FieldType_QNAME, FieldType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfFieldDescription }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clarizen.com/api/metadata", name = "ArrayOfFieldDescription")
    public JAXBElement<ArrayOfFieldDescription> createArrayOfFieldDescription(ArrayOfFieldDescription value) {
        return new JAXBElement<ArrayOfFieldDescription>(_ArrayOfFieldDescription_QNAME, ArrayOfFieldDescription.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PossibleLinkDescription }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clarizen.com/api/metadata", name = "PossibleLinkDescription")
    public JAXBElement<PossibleLinkDescription> createPossibleLinkDescription(PossibleLinkDescription value) {
        return new JAXBElement<PossibleLinkDescription>(_PossibleLinkDescription_QNAME, PossibleLinkDescription.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PresentationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clarizen.com/api/metadata", name = "PresentationType")
    public JAXBElement<PresentationType> createPresentationType(PresentationType value) {
        return new JAXBElement<PresentationType>(_PresentationType_QNAME, PresentationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSystemSettingsValuesResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clarizen.com/api/metadata", name = "GetSystemSettingsValuesResult")
    public JAXBElement<GetSystemSettingsValuesResult> createGetSystemSettingsValuesResult(GetSystemSettingsValuesResult value) {
        return new JAXBElement<GetSystemSettingsValuesResult>(_GetSystemSettingsValuesResult_QNAME, GetSystemSettingsValuesResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EntityFieldDescription }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clarizen.com/api/metadata", name = "EntityFieldDescription")
    public JAXBElement<EntityFieldDescription> createEntityFieldDescription(EntityFieldDescription value) {
        return new JAXBElement<EntityFieldDescription>(_EntityFieldDescription_QNAME, EntityFieldDescription.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPossibleLinkDescription }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clarizen.com/api/metadata", name = "ArrayOfPossibleLinkDescription")
    public JAXBElement<ArrayOfPossibleLinkDescription> createArrayOfPossibleLinkDescription(ArrayOfPossibleLinkDescription value) {
        return new JAXBElement<ArrayOfPossibleLinkDescription>(_ArrayOfPossibleLinkDescription_QNAME, ArrayOfPossibleLinkDescription.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DescribeEntitiesResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clarizen.com/api/metadata", name = "DescribeEntitiesResult")
    public JAXBElement<DescribeEntitiesResult> createDescribeEntitiesResult(DescribeEntitiesResult value) {
        return new JAXBElement<DescribeEntitiesResult>(_DescribeEntitiesResult_QNAME, DescribeEntitiesResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListEntitiesResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clarizen.com/api/metadata", name = "ListEntitiesResult")
    public JAXBElement<ListEntitiesResult> createListEntitiesResult(ListEntitiesResult value) {
        return new JAXBElement<ListEntitiesResult>(_ListEntitiesResult_QNAME, ListEntitiesResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PickupEntityDescription }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clarizen.com/api/metadata", name = "PickupEntityDescription")
    public JAXBElement<PickupEntityDescription> createPickupEntityDescription(PickupEntityDescription value) {
        return new JAXBElement<PickupEntityDescription>(_PickupEntityDescription_QNAME, PickupEntityDescription.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LinkEntityDescription }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clarizen.com/api/metadata", name = "LinkEntityDescription")
    public JAXBElement<LinkEntityDescription> createLinkEntityDescription(LinkEntityDescription value) {
        return new JAXBElement<LinkEntityDescription>(_LinkEntityDescription_QNAME, LinkEntityDescription.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfEntityDescription }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clarizen.com/api/metadata", name = "ArrayOfEntityDescription")
    public JAXBElement<ArrayOfEntityDescription> createArrayOfEntityDescription(ArrayOfEntityDescription value) {
        return new JAXBElement<ArrayOfEntityDescription>(_ArrayOfEntityDescription_QNAME, ArrayOfEntityDescription.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPickupDescription }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clarizen.com/api/metadata", name = "ArrayOfPickupDescription")
    public JAXBElement<ArrayOfPickupDescription> createArrayOfPickupDescription(ArrayOfPickupDescription value) {
        return new JAXBElement<ArrayOfPickupDescription>(_ArrayOfPickupDescription_QNAME, ArrayOfPickupDescription.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSystemSettingsValuesMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clarizen.com/api/metadata", name = "GetSystemSettingsValuesMessage")
    public JAXBElement<GetSystemSettingsValuesMessage> createGetSystemSettingsValuesMessage(GetSystemSettingsValuesMessage value) {
        return new JAXBElement<GetSystemSettingsValuesMessage>(_GetSystemSettingsValuesMessage_QNAME, GetSystemSettingsValuesMessage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListEntitiesMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clarizen.com/api/metadata", name = "ListEntitiesMessage")
    public JAXBElement<ListEntitiesMessage> createListEntitiesMessage(ListEntitiesMessage value) {
        return new JAXBElement<ListEntitiesMessage>(_ListEntitiesMessage_QNAME, ListEntitiesMessage.class, null, value);
    }

}
