package com.travelport.service.air_v50_0;

import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.2.1
 * 2021-06-13T20:08:52.483+06:00
 * Generated source version: 3.2.1
 * 
 */
@WebServiceClient(name = "AirService", 
                  wsdlLocation = "classpath:air_v50_0/Air.wsdl",
                  targetNamespace = "http://www.travelport.com/service/air_v50_0") 
public class AirService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://www.travelport.com/service/air_v50_0", "AirService");
    public final static QName AirRefundTicketPort = new QName("http://www.travelport.com/service/air_v50_0", "AirRefundTicketPort");
    public final static QName AirUpsellSearchPort = new QName("http://www.travelport.com/service/air_v50_0", "AirUpsellSearchPort");
    public final static QName AirScheduleSearchPort = new QName("http://www.travelport.com/service/air_v50_0", "AirScheduleSearchPort");
    public final static QName AirMerchandisingOfferAvailabilityPort = new QName("http://www.travelport.com/service/air_v50_0", "AirMerchandisingOfferAvailabilityPort");
    public final static QName AirFareRulesPort = new QName("http://www.travelport.com/service/air_v50_0", "AirFareRulesPort");
    public final static QName AirRetrieveDocumentBindingPort = new QName("http://www.travelport.com/service/air_v50_0", "AirRetrieveDocumentBindingPort");
    public final static QName AirAvailabilitySearchPort = new QName("http://www.travelport.com/service/air_v50_0", "AirAvailabilitySearchPort");
    public final static QName EMDIssuancePort = new QName("http://www.travelport.com/service/air_v50_0", "EMDIssuancePort");
    public final static QName FlightTimeTablePort = new QName("http://www.travelport.com/service/air_v50_0", "FlightTimeTablePort");
    public final static QName EMDRetrievePort = new QName("http://www.travelport.com/service/air_v50_0", "EMDRetrievePort");
    public final static QName AirExchangeMultiQuotePort = new QName("http://www.travelport.com/service/air_v50_0", "AirExchangeMultiQuotePort");
    public final static QName AirExchangeProcessPort = new QName("http://www.travelport.com/service/air_v50_0", "AirExchangeProcessPort");
    public final static QName AirExchangeTicketingPort = new QName("http://www.travelport.com/service/air_v50_0", "AirExchangeTicketingPort");
    public final static QName AirExchangeEligibilityPort = new QName("http://www.travelport.com/service/air_v50_0", "AirExchangeEligibilityPort");
    public final static QName AirRepriceSearchPort = new QName("http://www.travelport.com/service/air_v50_0", "AirRepriceSearchPort");
    public final static QName AirExchangeQuotePort = new QName("http://www.travelport.com/service/air_v50_0", "AirExchangeQuotePort");
    public final static QName AirRefundQuotePort = new QName("http://www.travelport.com/service/air_v50_0", "AirRefundQuotePort");
    public final static QName AirTicketingPort = new QName("http://www.travelport.com/service/air_v50_0", "AirTicketingPort");
    public final static QName AirLowFareSearchPort = new QName("http://www.travelport.com/service/air_v50_0", "AirLowFareSearchPort");
    public final static QName AirFareDisplayPort = new QName("http://www.travelport.com/service/air_v50_0", "AirFareDisplayPort");
    public final static QName SeatMapPort = new QName("http://www.travelport.com/service/air_v50_0", "SeatMapPort");
    public final static QName AirPrePayPort = new QName("http://www.travelport.com/service/air_v50_0", "AirPrePayPort");
    public final static QName AirPricePort = new QName("http://www.travelport.com/service/air_v50_0", "AirPricePort");
    public final static QName AirMerchandisingDetailsPort = new QName("http://www.travelport.com/service/air_v50_0", "AirMerchandisingDetailsPort");
    public final static QName AirVoidDocumentPort = new QName("http://www.travelport.com/service/air_v50_0", "AirVoidDocumentPort");
    static {
        URL url = AirService.class.getClassLoader().getResource("air_v50_0/Air.wsdl");
        if (url == null) {
            java.util.logging.Logger.getLogger(AirService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "classpath:air_v50_0/Air.wsdl");
        }       
        WSDL_LOCATION = url;   
    }

    public AirService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public AirService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public AirService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    public AirService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public AirService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public AirService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    




    /**
     *
     * @return
     *     returns AirRefundTicketPortType
     */
    @WebEndpoint(name = "AirRefundTicketPort")
    public AirRefundTicketPortType getAirRefundTicketPort() {
        return super.getPort(AirRefundTicketPort, AirRefundTicketPortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns AirRefundTicketPortType
     */
    @WebEndpoint(name = "AirRefundTicketPort")
    public AirRefundTicketPortType getAirRefundTicketPort(WebServiceFeature... features) {
        return super.getPort(AirRefundTicketPort, AirRefundTicketPortType.class, features);
    }


    /**
     *
     * @return
     *     returns AirUpsellSearchPortType
     */
    @WebEndpoint(name = "AirUpsellSearchPort")
    public AirUpsellSearchPortType getAirUpsellSearchPort() {
        return super.getPort(AirUpsellSearchPort, AirUpsellSearchPortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns AirUpsellSearchPortType
     */
    @WebEndpoint(name = "AirUpsellSearchPort")
    public AirUpsellSearchPortType getAirUpsellSearchPort(WebServiceFeature... features) {
        return super.getPort(AirUpsellSearchPort, AirUpsellSearchPortType.class, features);
    }


    /**
     *
     * @return
     *     returns AirScheduleSearchPortType
     */
    @WebEndpoint(name = "AirScheduleSearchPort")
    public AirScheduleSearchPortType getAirScheduleSearchPort() {
        return super.getPort(AirScheduleSearchPort, AirScheduleSearchPortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns AirScheduleSearchPortType
     */
    @WebEndpoint(name = "AirScheduleSearchPort")
    public AirScheduleSearchPortType getAirScheduleSearchPort(WebServiceFeature... features) {
        return super.getPort(AirScheduleSearchPort, AirScheduleSearchPortType.class, features);
    }


    /**
     *
     * @return
     *     returns AirMerchandisingOfferAvailabilityPortType
     */
    @WebEndpoint(name = "AirMerchandisingOfferAvailabilityPort")
    public AirMerchandisingOfferAvailabilityPortType getAirMerchandisingOfferAvailabilityPort() {
        return super.getPort(AirMerchandisingOfferAvailabilityPort, AirMerchandisingOfferAvailabilityPortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns AirMerchandisingOfferAvailabilityPortType
     */
    @WebEndpoint(name = "AirMerchandisingOfferAvailabilityPort")
    public AirMerchandisingOfferAvailabilityPortType getAirMerchandisingOfferAvailabilityPort(WebServiceFeature... features) {
        return super.getPort(AirMerchandisingOfferAvailabilityPort, AirMerchandisingOfferAvailabilityPortType.class, features);
    }


    /**
     *
     * @return
     *     returns AirFareRulesPortType
     */
    @WebEndpoint(name = "AirFareRulesPort")
    public AirFareRulesPortType getAirFareRulesPort() {
        return super.getPort(AirFareRulesPort, AirFareRulesPortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns AirFareRulesPortType
     */
    @WebEndpoint(name = "AirFareRulesPort")
    public AirFareRulesPortType getAirFareRulesPort(WebServiceFeature... features) {
        return super.getPort(AirFareRulesPort, AirFareRulesPortType.class, features);
    }


    /**
     *
     * @return
     *     returns AirRetrieveDocumentPortType
     */
    @WebEndpoint(name = "AirRetrieveDocumentBindingPort")
    public AirRetrieveDocumentPortType getAirRetrieveDocumentBindingPort() {
        return super.getPort(AirRetrieveDocumentBindingPort, AirRetrieveDocumentPortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns AirRetrieveDocumentPortType
     */
    @WebEndpoint(name = "AirRetrieveDocumentBindingPort")
    public AirRetrieveDocumentPortType getAirRetrieveDocumentBindingPort(WebServiceFeature... features) {
        return super.getPort(AirRetrieveDocumentBindingPort, AirRetrieveDocumentPortType.class, features);
    }


    /**
     *
     * @return
     *     returns AirAvailabilitySearchPortType
     */
    @WebEndpoint(name = "AirAvailabilitySearchPort")
    public AirAvailabilitySearchPortType getAirAvailabilitySearchPort() {
        return super.getPort(AirAvailabilitySearchPort, AirAvailabilitySearchPortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns AirAvailabilitySearchPortType
     */
    @WebEndpoint(name = "AirAvailabilitySearchPort")
    public AirAvailabilitySearchPortType getAirAvailabilitySearchPort(WebServiceFeature... features) {
        return super.getPort(AirAvailabilitySearchPort, AirAvailabilitySearchPortType.class, features);
    }


    /**
     *
     * @return
     *     returns EMDIssuancePortType
     */
    @WebEndpoint(name = "EMDIssuancePort")
    public EMDIssuancePortType getEMDIssuancePort() {
        return super.getPort(EMDIssuancePort, EMDIssuancePortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns EMDIssuancePortType
     */
    @WebEndpoint(name = "EMDIssuancePort")
    public EMDIssuancePortType getEMDIssuancePort(WebServiceFeature... features) {
        return super.getPort(EMDIssuancePort, EMDIssuancePortType.class, features);
    }


    /**
     *
     * @return
     *     returns FlightTimeTablePortType
     */
    @WebEndpoint(name = "FlightTimeTablePort")
    public FlightTimeTablePortType getFlightTimeTablePort() {
        return super.getPort(FlightTimeTablePort, FlightTimeTablePortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns FlightTimeTablePortType
     */
    @WebEndpoint(name = "FlightTimeTablePort")
    public FlightTimeTablePortType getFlightTimeTablePort(WebServiceFeature... features) {
        return super.getPort(FlightTimeTablePort, FlightTimeTablePortType.class, features);
    }


    /**
     *
     * @return
     *     returns EMDRetrievePortType
     */
    @WebEndpoint(name = "EMDRetrievePort")
    public EMDRetrievePortType getEMDRetrievePort() {
        return super.getPort(EMDRetrievePort, EMDRetrievePortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns EMDRetrievePortType
     */
    @WebEndpoint(name = "EMDRetrievePort")
    public EMDRetrievePortType getEMDRetrievePort(WebServiceFeature... features) {
        return super.getPort(EMDRetrievePort, EMDRetrievePortType.class, features);
    }


    /**
     *
     * @return
     *     returns AirExchangeMultiQuotePortType
     */
    @WebEndpoint(name = "AirExchangeMultiQuotePort")
    public AirExchangeMultiQuotePortType getAirExchangeMultiQuotePort() {
        return super.getPort(AirExchangeMultiQuotePort, AirExchangeMultiQuotePortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns AirExchangeMultiQuotePortType
     */
    @WebEndpoint(name = "AirExchangeMultiQuotePort")
    public AirExchangeMultiQuotePortType getAirExchangeMultiQuotePort(WebServiceFeature... features) {
        return super.getPort(AirExchangeMultiQuotePort, AirExchangeMultiQuotePortType.class, features);
    }


    /**
     *
     * @return
     *     returns AirExchangeProcessPortType
     */
    @WebEndpoint(name = "AirExchangeProcessPort")
    public AirExchangeProcessPortType getAirExchangeProcessPort() {
        return super.getPort(AirExchangeProcessPort, AirExchangeProcessPortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns AirExchangeProcessPortType
     */
    @WebEndpoint(name = "AirExchangeProcessPort")
    public AirExchangeProcessPortType getAirExchangeProcessPort(WebServiceFeature... features) {
        return super.getPort(AirExchangeProcessPort, AirExchangeProcessPortType.class, features);
    }


    /**
     *
     * @return
     *     returns AirExchangeTicketingPortType
     */
    @WebEndpoint(name = "AirExchangeTicketingPort")
    public AirExchangeTicketingPortType getAirExchangeTicketingPort() {
        return super.getPort(AirExchangeTicketingPort, AirExchangeTicketingPortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns AirExchangeTicketingPortType
     */
    @WebEndpoint(name = "AirExchangeTicketingPort")
    public AirExchangeTicketingPortType getAirExchangeTicketingPort(WebServiceFeature... features) {
        return super.getPort(AirExchangeTicketingPort, AirExchangeTicketingPortType.class, features);
    }


    /**
     *
     * @return
     *     returns AirExchangeEligibilityPortType
     */
    @WebEndpoint(name = "AirExchangeEligibilityPort")
    public AirExchangeEligibilityPortType getAirExchangeEligibilityPort() {
        return super.getPort(AirExchangeEligibilityPort, AirExchangeEligibilityPortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns AirExchangeEligibilityPortType
     */
    @WebEndpoint(name = "AirExchangeEligibilityPort")
    public AirExchangeEligibilityPortType getAirExchangeEligibilityPort(WebServiceFeature... features) {
        return super.getPort(AirExchangeEligibilityPort, AirExchangeEligibilityPortType.class, features);
    }


    /**
     *
     * @return
     *     returns AirRepriceSearchPortType
     */
    @WebEndpoint(name = "AirRepriceSearchPort")
    public AirRepriceSearchPortType getAirRepriceSearchPort() {
        return super.getPort(AirRepriceSearchPort, AirRepriceSearchPortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns AirRepriceSearchPortType
     */
    @WebEndpoint(name = "AirRepriceSearchPort")
    public AirRepriceSearchPortType getAirRepriceSearchPort(WebServiceFeature... features) {
        return super.getPort(AirRepriceSearchPort, AirRepriceSearchPortType.class, features);
    }


    /**
     *
     * @return
     *     returns AirExchangeQuotePortType
     */
    @WebEndpoint(name = "AirExchangeQuotePort")
    public AirExchangeQuotePortType getAirExchangeQuotePort() {
        return super.getPort(AirExchangeQuotePort, AirExchangeQuotePortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns AirExchangeQuotePortType
     */
    @WebEndpoint(name = "AirExchangeQuotePort")
    public AirExchangeQuotePortType getAirExchangeQuotePort(WebServiceFeature... features) {
        return super.getPort(AirExchangeQuotePort, AirExchangeQuotePortType.class, features);
    }


    /**
     *
     * @return
     *     returns AirRefundQuotePortType
     */
    @WebEndpoint(name = "AirRefundQuotePort")
    public AirRefundQuotePortType getAirRefundQuotePort() {
        return super.getPort(AirRefundQuotePort, AirRefundQuotePortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns AirRefundQuotePortType
     */
    @WebEndpoint(name = "AirRefundQuotePort")
    public AirRefundQuotePortType getAirRefundQuotePort(WebServiceFeature... features) {
        return super.getPort(AirRefundQuotePort, AirRefundQuotePortType.class, features);
    }


    /**
     *
     * @return
     *     returns AirTicketingPortType
     */
    @WebEndpoint(name = "AirTicketingPort")
    public AirTicketingPortType getAirTicketingPort() {
        return super.getPort(AirTicketingPort, AirTicketingPortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns AirTicketingPortType
     */
    @WebEndpoint(name = "AirTicketingPort")
    public AirTicketingPortType getAirTicketingPort(WebServiceFeature... features) {
        return super.getPort(AirTicketingPort, AirTicketingPortType.class, features);
    }


    /**
     *
     * @return
     *     returns AirLowFareSearchPortType
     */
    @WebEndpoint(name = "AirLowFareSearchPort")
    public AirLowFareSearchPortType getAirLowFareSearchPort() {
        return super.getPort(AirLowFareSearchPort, AirLowFareSearchPortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns AirLowFareSearchPortType
     */
    @WebEndpoint(name = "AirLowFareSearchPort")
    public AirLowFareSearchPortType getAirLowFareSearchPort(WebServiceFeature... features) {
        return super.getPort(AirLowFareSearchPort, AirLowFareSearchPortType.class, features);
    }


    /**
     *
     * @return
     *     returns AirFareDisplayPortType
     */
    @WebEndpoint(name = "AirFareDisplayPort")
    public AirFareDisplayPortType getAirFareDisplayPort() {
        return super.getPort(AirFareDisplayPort, AirFareDisplayPortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns AirFareDisplayPortType
     */
    @WebEndpoint(name = "AirFareDisplayPort")
    public AirFareDisplayPortType getAirFareDisplayPort(WebServiceFeature... features) {
        return super.getPort(AirFareDisplayPort, AirFareDisplayPortType.class, features);
    }


    /**
     *
     * @return
     *     returns SeatMapPortType
     */
    @WebEndpoint(name = "SeatMapPort")
    public SeatMapPortType getSeatMapPort() {
        return super.getPort(SeatMapPort, SeatMapPortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns SeatMapPortType
     */
    @WebEndpoint(name = "SeatMapPort")
    public SeatMapPortType getSeatMapPort(WebServiceFeature... features) {
        return super.getPort(SeatMapPort, SeatMapPortType.class, features);
    }


    /**
     *
     * @return
     *     returns AirPrePayPortType
     */
    @WebEndpoint(name = "AirPrePayPort")
    public AirPrePayPortType getAirPrePayPort() {
        return super.getPort(AirPrePayPort, AirPrePayPortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns AirPrePayPortType
     */
    @WebEndpoint(name = "AirPrePayPort")
    public AirPrePayPortType getAirPrePayPort(WebServiceFeature... features) {
        return super.getPort(AirPrePayPort, AirPrePayPortType.class, features);
    }


    /**
     *
     * @return
     *     returns AirPricePortType
     */
    @WebEndpoint(name = "AirPricePort")
    public AirPricePortType getAirPricePort() {
        return super.getPort(AirPricePort, AirPricePortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns AirPricePortType
     */
    @WebEndpoint(name = "AirPricePort")
    public AirPricePortType getAirPricePort(WebServiceFeature... features) {
        return super.getPort(AirPricePort, AirPricePortType.class, features);
    }


    /**
     *
     * @return
     *     returns AirMerchandisingDetailsPortType
     */
    @WebEndpoint(name = "AirMerchandisingDetailsPort")
    public AirMerchandisingDetailsPortType getAirMerchandisingDetailsPort() {
        return super.getPort(AirMerchandisingDetailsPort, AirMerchandisingDetailsPortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns AirMerchandisingDetailsPortType
     */
    @WebEndpoint(name = "AirMerchandisingDetailsPort")
    public AirMerchandisingDetailsPortType getAirMerchandisingDetailsPort(WebServiceFeature... features) {
        return super.getPort(AirMerchandisingDetailsPort, AirMerchandisingDetailsPortType.class, features);
    }


    /**
     *
     * @return
     *     returns AirVoidDocumentPortType
     */
    @WebEndpoint(name = "AirVoidDocumentPort")
    public AirVoidDocumentPortType getAirVoidDocumentPort() {
        return super.getPort(AirVoidDocumentPort, AirVoidDocumentPortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns AirVoidDocumentPortType
     */
    @WebEndpoint(name = "AirVoidDocumentPort")
    public AirVoidDocumentPortType getAirVoidDocumentPort(WebServiceFeature... features) {
        return super.getPort(AirVoidDocumentPort, AirVoidDocumentPortType.class, features);
    }

}
