
package webservices.sei;

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
@WebServiceClient(name = "pizza", targetNamespace = "http://webservices/", wsdlLocation = "http://paisans-macbook-pro.local:8080/pizzacase_2_war_exploded/pizza?wsdl")
public class Pizza_Service
    extends Service
{

    private final static URL PIZZA_WSDL_LOCATION;
    private final static WebServiceException PIZZA_EXCEPTION;
    private final static QName PIZZA_QNAME = new QName("http://webservices/", "pizza");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://paisans-macbook-pro.local:8080/pizzacase_2_war_exploded/pizza?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        PIZZA_WSDL_LOCATION = url;
        PIZZA_EXCEPTION = e;
    }

    public Pizza_Service() {
        super(__getWsdlLocation(), PIZZA_QNAME);
    }

    public Pizza_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), PIZZA_QNAME, features);
    }

    public Pizza_Service(URL wsdlLocation) {
        super(wsdlLocation, PIZZA_QNAME);
    }

    public Pizza_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, PIZZA_QNAME, features);
    }

    public Pizza_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public Pizza_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns PizzaWebService
     */
    @WebEndpoint(name = "PizzaWebServicePort")
    public PizzaWebService getPizzaWebServicePort() {
        return super.getPort(new QName("http://webservices/", "PizzaWebServicePort"), PizzaWebService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns PizzaWebService
     */
    @WebEndpoint(name = "PizzaWebServicePort")
    public PizzaWebService getPizzaWebServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://webservices/", "PizzaWebServicePort"), PizzaWebService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (PIZZA_EXCEPTION!= null) {
            throw PIZZA_EXCEPTION;
        }
        return PIZZA_WSDL_LOCATION;
    }

}
