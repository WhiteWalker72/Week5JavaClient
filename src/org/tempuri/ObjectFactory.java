
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.tempuri package. 
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

    private final static QName _RegisterPassword_QNAME = new QName("http://tempuri.org/", "password");
    private final static QName _RegisterUsername_QNAME = new QName("http://tempuri.org/", "username");
    private final static QName _GeneratePasswordResponseGeneratePasswordResult_QNAME = new QName("http://tempuri.org/", "GeneratePasswordResult");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.tempuri
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RegisterResponse }
     * 
     */
    public RegisterResponse createRegisterResponse() {
        return new RegisterResponse();
    }

    /**
     * Create an instance of {@link GeneratePassword }
     * 
     */
    public GeneratePassword createGeneratePassword() {
        return new GeneratePassword();
    }

    /**
     * Create an instance of {@link GeneratePasswordResponse }
     * 
     */
    public GeneratePasswordResponse createGeneratePasswordResponse() {
        return new GeneratePasswordResponse();
    }

    /**
     * Create an instance of {@link Register }
     * 
     */
    public Register createRegister() {
        return new Register();
    }

    /**
     * Create an instance of {@link AccountExistsResponse }
     * 
     */
    public AccountExistsResponse createAccountExistsResponse() {
        return new AccountExistsResponse();
    }

    /**
     * Create an instance of {@link AccountExists }
     * 
     */
    public AccountExists createAccountExists() {
        return new AccountExists();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "password", scope = Register.class)
    public JAXBElement<String> createRegisterPassword(String value) {
        return new JAXBElement<String>(_RegisterPassword_QNAME, String.class, Register.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "username", scope = Register.class)
    public JAXBElement<String> createRegisterUsername(String value) {
        return new JAXBElement<String>(_RegisterUsername_QNAME, String.class, Register.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GeneratePasswordResult", scope = GeneratePasswordResponse.class)
    public JAXBElement<String> createGeneratePasswordResponseGeneratePasswordResult(String value) {
        return new JAXBElement<String>(_GeneratePasswordResponseGeneratePasswordResult_QNAME, String.class, GeneratePasswordResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "username", scope = AccountExists.class)
    public JAXBElement<String> createAccountExistsUsername(String value) {
        return new JAXBElement<String>(_RegisterUsername_QNAME, String.class, AccountExists.class, value);
    }

}
