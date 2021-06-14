package com.travelport.service.air_v50_0;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 3.2.1
 * 2021-06-13T20:08:52.273+06:00
 * Generated source version: 3.2.1
 * 
 */
@WebService(targetNamespace = "http://www.travelport.com/service/air_v50_0", name = "AirUpsellSearchPortType")
@XmlSeeAlso({com.travelport.schema.rail_v50_0.ObjectFactory.class, com.travelport.schema.common_v50_0.ObjectFactory.class, com.travelport.schema.air_v50_0.ObjectFactory.class, com.travelport.soa.common.security.sessioncontext_v1.ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface AirUpsellSearchPortType {

    @WebMethod(action = "http://localhost:8080/kestrel/AirService")
    @WebResult(name = "AirUpsellSearchRsp", targetNamespace = "http://www.travelport.com/schema/air_v50_0", partName = "result")
    public com.travelport.schema.air_v50_0.AirUpsellSearchRsp service(
        @WebParam(partName = "parameters", name = "AirUpsellSearchReq", targetNamespace = "http://www.travelport.com/schema/air_v50_0")
        com.travelport.schema.air_v50_0.AirUpsellSearchReq parameters
    ) throws AirFaultMessage;
}