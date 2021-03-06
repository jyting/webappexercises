
package webServices.test;

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
@WebServiceClient(name = "ProductServicesService", targetNamespace = "http://webServices/", wsdlLocation = "http://localhost:8080/shoppingCart/soap/productServices?WSDL")
public class ProductServicesService
    extends Service
{

    private final static URL PRODUCTSERVICESSERVICE_WSDL_LOCATION;
    private final static WebServiceException PRODUCTSERVICESSERVICE_EXCEPTION;
    private final static QName PRODUCTSERVICESSERVICE_QNAME = new QName("http://webServices/", "ProductServicesService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/shoppingCart/soap/productServices?WSDL");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        PRODUCTSERVICESSERVICE_WSDL_LOCATION = url;
        PRODUCTSERVICESSERVICE_EXCEPTION = e;
    }

    public ProductServicesService() {
        super(__getWsdlLocation(), PRODUCTSERVICESSERVICE_QNAME);
    }

    public ProductServicesService(WebServiceFeature... features) {
        super(__getWsdlLocation(), PRODUCTSERVICESSERVICE_QNAME, features);
    }

    public ProductServicesService(URL wsdlLocation) {
        super(wsdlLocation, PRODUCTSERVICESSERVICE_QNAME);
    }

    public ProductServicesService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, PRODUCTSERVICESSERVICE_QNAME, features);
    }

    public ProductServicesService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ProductServicesService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns ProductServices
     */
    @WebEndpoint(name = "ProductServicesPort")
    public ProductServices getProductServicesPort() {
        return super.getPort(new QName("http://webServices/", "ProductServicesPort"), ProductServices.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ProductServices
     */
    @WebEndpoint(name = "ProductServicesPort")
    public ProductServices getProductServicesPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://webServices/", "ProductServicesPort"), ProductServices.class, features);
    }

    private static URL __getWsdlLocation() {
        if (PRODUCTSERVICESSERVICE_EXCEPTION!= null) {
            throw PRODUCTSERVICESSERVICE_EXCEPTION;
        }
        return PRODUCTSERVICESSERVICE_WSDL_LOCATION;
    }

}
