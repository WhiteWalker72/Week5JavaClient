
package org.tempuri;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "RegisterService", targetNamespace = "http://tempuri.org/", wsdlLocation = "http://localhost:8733/Design_Time_Addresses/Week5Service/RegisterService/?wsdl")
public class RegisterService
    extends Service
{

    private final static URL REGISTERSERVICE_WSDL_LOCATION;
    private final static WebServiceException REGISTERSERVICE_EXCEPTION;
    private final static QName REGISTERSERVICE_QNAME = new QName("http://tempuri.org/", "RegisterService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8733/Design_Time_Addresses/Week5Service/RegisterService/?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        REGISTERSERVICE_WSDL_LOCATION = url;
        REGISTERSERVICE_EXCEPTION = e;
    }

    public RegisterService() {
        super(__getWsdlLocation(), REGISTERSERVICE_QNAME);
    }

    public RegisterService(WebServiceFeature... features) {
        super(__getWsdlLocation(), REGISTERSERVICE_QNAME, features);
    }

    public RegisterService(URL wsdlLocation) {
        super(wsdlLocation, REGISTERSERVICE_QNAME);
    }

    public RegisterService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, REGISTERSERVICE_QNAME, features);
    }

    public RegisterService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public RegisterService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns IRegisterService
     */
    @WebEndpoint(name = "BasicHttpBinding_IRegisterService")
    public IRegisterService getBasicHttpBindingIRegisterService() {
        return super.getPort(new QName("http://tempuri.org/", "BasicHttpBinding_IRegisterService"), IRegisterService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns IRegisterService
     */
    @WebEndpoint(name = "BasicHttpBinding_IRegisterService")
    public IRegisterService getBasicHttpBindingIRegisterService(WebServiceFeature... features) {
        return super.getPort(new QName("http://tempuri.org/", "BasicHttpBinding_IRegisterService"), IRegisterService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (REGISTERSERVICE_EXCEPTION!= null) {
            throw REGISTERSERVICE_EXCEPTION;
        }
        return REGISTERSERVICE_WSDL_LOCATION;
    }

}
