
package com.clarizen.api.faults;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.clarizen.api.faults package. 
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

    private final static QName _LoginFailure_QNAME = new QName("http://clarizen.com/api/faults", "LoginFailure");
    private final static QName _GeneralFault_QNAME = new QName("http://clarizen.com/api/faults", "GeneralFault");
    private final static QName _SessionTimeoutFailure_QNAME = new QName("http://clarizen.com/api/faults", "SessionTimeoutFailure");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.clarizen.api.faults
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GeneralFault }
     * 
     */
    public GeneralFault createGeneralFault() {
        return new GeneralFault();
    }

    /**
     * Create an instance of {@link SessionTimeoutFailure }
     * 
     */
    public SessionTimeoutFailure createSessionTimeoutFailure() {
        return new SessionTimeoutFailure();
    }

    /**
     * Create an instance of {@link LoginFailure }
     * 
     */
    public LoginFailure createLoginFailure() {
        return new LoginFailure();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoginFailure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clarizen.com/api/faults", name = "LoginFailure")
    public JAXBElement<LoginFailure> createLoginFailure(LoginFailure value) {
        return new JAXBElement<LoginFailure>(_LoginFailure_QNAME, LoginFailure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GeneralFault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clarizen.com/api/faults", name = "GeneralFault")
    public JAXBElement<GeneralFault> createGeneralFault(GeneralFault value) {
        return new JAXBElement<GeneralFault>(_GeneralFault_QNAME, GeneralFault.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SessionTimeoutFailure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clarizen.com/api/faults", name = "SessionTimeoutFailure")
    public JAXBElement<SessionTimeoutFailure> createSessionTimeoutFailure(SessionTimeoutFailure value) {
        return new JAXBElement<SessionTimeoutFailure>(_SessionTimeoutFailure_QNAME, SessionTimeoutFailure.class, null, value);
    }

}
