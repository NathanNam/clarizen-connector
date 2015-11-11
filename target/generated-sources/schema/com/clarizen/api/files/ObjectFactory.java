
package com.clarizen.api.files;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.clarizen.api.files package. 
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

    private final static QName _Storage_QNAME = new QName("http://clarizen.com/api/files", "Storage");
    private final static QName _FileInformation_QNAME = new QName("http://clarizen.com/api/files", "FileInformation");
    private final static QName _DownloadResult_QNAME = new QName("http://clarizen.com/api/files", "DownloadResult");
    private final static QName _DownloadMessage_QNAME = new QName("http://clarizen.com/api/files", "DownloadMessage");
    private final static QName _UploadMessage_QNAME = new QName("http://clarizen.com/api/files", "UploadMessage");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.clarizen.api.files
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link UploadMessage }
     * 
     */
    public UploadMessage createUploadMessage() {
        return new UploadMessage();
    }

    /**
     * Create an instance of {@link FileInformation }
     * 
     */
    public FileInformation createFileInformation() {
        return new FileInformation();
    }

    /**
     * Create an instance of {@link DownloadMessage }
     * 
     */
    public DownloadMessage createDownloadMessage() {
        return new DownloadMessage();
    }

    /**
     * Create an instance of {@link DownloadResult }
     * 
     */
    public DownloadResult createDownloadResult() {
        return new DownloadResult();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Storage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clarizen.com/api/files", name = "Storage")
    public JAXBElement<Storage> createStorage(Storage value) {
        return new JAXBElement<Storage>(_Storage_QNAME, Storage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FileInformation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clarizen.com/api/files", name = "FileInformation")
    public JAXBElement<FileInformation> createFileInformation(FileInformation value) {
        return new JAXBElement<FileInformation>(_FileInformation_QNAME, FileInformation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DownloadResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clarizen.com/api/files", name = "DownloadResult")
    public JAXBElement<DownloadResult> createDownloadResult(DownloadResult value) {
        return new JAXBElement<DownloadResult>(_DownloadResult_QNAME, DownloadResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DownloadMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clarizen.com/api/files", name = "DownloadMessage")
    public JAXBElement<DownloadMessage> createDownloadMessage(DownloadMessage value) {
        return new JAXBElement<DownloadMessage>(_DownloadMessage_QNAME, DownloadMessage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UploadMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clarizen.com/api/files", name = "UploadMessage")
    public JAXBElement<UploadMessage> createUploadMessage(UploadMessage value) {
        return new JAXBElement<UploadMessage>(_UploadMessage_QNAME, UploadMessage.class, null, value);
    }

}
