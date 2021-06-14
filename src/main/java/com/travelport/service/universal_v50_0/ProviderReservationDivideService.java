package com.travelport.service.universal_v50_0;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.2.1
 * 2021-06-13T20:08:58.720+06:00
 * Generated source version: 3.2.1
 * 
 */
@WebServiceClient(name = "ProviderReservationDivideService", 
                  wsdlLocation = "file:/I:/Web%20Project/usoit-air-booking/src/main/resources/wsdl/universal_v50_0/UniversalRecord.wsdl",
                  targetNamespace = "http://www.travelport.com/service/universal_v50_0") 
public class ProviderReservationDivideService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://www.travelport.com/service/universal_v50_0", "ProviderReservationDivideService");
    public final static QName ProviderReservationDivideServicePort = new QName("http://www.travelport.com/service/universal_v50_0", "ProviderReservationDivideServicePort");
    static {
        URL url = null;
        try {
            url = new URL("file:/I:/Web%20Project/usoit-air-booking/src/main/resources/wsdl/universal_v50_0/UniversalRecord.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(ProviderReservationDivideService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/I:/Web%20Project/usoit-air-booking/src/main/resources/wsdl/universal_v50_0/UniversalRecord.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public ProviderReservationDivideService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public ProviderReservationDivideService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ProviderReservationDivideService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    public ProviderReservationDivideService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public ProviderReservationDivideService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public ProviderReservationDivideService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    




    /**
     *
     * @return
     *     returns ProviderReservationDivideServicePortType
     */
    @WebEndpoint(name = "ProviderReservationDivideServicePort")
    public ProviderReservationDivideServicePortType getProviderReservationDivideServicePort() {
        return super.getPort(ProviderReservationDivideServicePort, ProviderReservationDivideServicePortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ProviderReservationDivideServicePortType
     */
    @WebEndpoint(name = "ProviderReservationDivideServicePort")
    public ProviderReservationDivideServicePortType getProviderReservationDivideServicePort(WebServiceFeature... features) {
        return super.getPort(ProviderReservationDivideServicePort, ProviderReservationDivideServicePortType.class, features);
    }

}
