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
 * 2021-06-13T20:08:58.637+06:00
 * Generated source version: 3.2.1
 * 
 */
@WebServiceClient(name = "ScheduleChangeService", 
                  wsdlLocation = "file:/I:/Web%20Project/usoit-air-booking/src/main/resources/wsdl/universal_v50_0/UniversalRecord.wsdl",
                  targetNamespace = "http://www.travelport.com/service/universal_v50_0") 
public class ScheduleChangeService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://www.travelport.com/service/universal_v50_0", "ScheduleChangeService");
    public final static QName AckScheduleChangeServicePort = new QName("http://www.travelport.com/service/universal_v50_0", "AckScheduleChangeServicePort");
    static {
        URL url = null;
        try {
            url = new URL("file:/I:/Web%20Project/usoit-air-booking/src/main/resources/wsdl/universal_v50_0/UniversalRecord.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(ScheduleChangeService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/I:/Web%20Project/usoit-air-booking/src/main/resources/wsdl/universal_v50_0/UniversalRecord.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public ScheduleChangeService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public ScheduleChangeService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ScheduleChangeService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    public ScheduleChangeService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public ScheduleChangeService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public ScheduleChangeService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    




    /**
     *
     * @return
     *     returns AckScheduleChangeServicePortType
     */
    @WebEndpoint(name = "AckScheduleChangeServicePort")
    public AckScheduleChangeServicePortType getAckScheduleChangeServicePort() {
        return super.getPort(AckScheduleChangeServicePort, AckScheduleChangeServicePortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns AckScheduleChangeServicePortType
     */
    @WebEndpoint(name = "AckScheduleChangeServicePort")
    public AckScheduleChangeServicePortType getAckScheduleChangeServicePort(WebServiceFeature... features) {
        return super.getPort(AckScheduleChangeServicePort, AckScheduleChangeServicePortType.class, features);
    }

}
