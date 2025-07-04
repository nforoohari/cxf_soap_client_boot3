package ir.digixo.hellows.ws;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.5.3
 * 2025-06-26T13:40:55.419+03:30
 * Generated source version: 3.5.3
 *
 */
@WebServiceClient(name = "HelloWsService",
                  wsdlLocation = "http://localhost:8080/ws/hello?wsdl",
                  targetNamespace = "http://ws.hellows.digixo.ir/")
public class HelloWsService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://ws.hellows.digixo.ir/", "HelloWsService");
    public final static QName HelloWsPort = new QName("http://ws.hellows.digixo.ir/", "HelloWsPort");
    static {
        URL url = null;
        try {
            url = new URL("http://localhost:8080/ws/hello?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(HelloWsService.class.getName())
                .log(java.util.logging.Level.INFO,
                     "Can not initialize the default wsdl from {0}", "http://localhost:8080/ws/hello?wsdl");
        }
        WSDL_LOCATION = url;
    }

    public HelloWsService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public HelloWsService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public HelloWsService() {
        super(WSDL_LOCATION, SERVICE);
    }

    public HelloWsService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public HelloWsService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public HelloWsService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }




    /**
     *
     * @return
     *     returns HelloWs
     */
    @WebEndpoint(name = "HelloWsPort")
    public HelloWs getHelloWsPort() {
        return super.getPort(HelloWsPort, HelloWs.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns HelloWs
     */
    @WebEndpoint(name = "HelloWsPort")
    public HelloWs getHelloWsPort(WebServiceFeature... features) {
        return super.getPort(HelloWsPort, HelloWs.class, features);
    }

}
