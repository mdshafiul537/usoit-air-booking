package com.travelport.service.universal_v50_0;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 3.2.1
 * 2021-06-13T20:09:03.886+06:00
 * Generated source version: 3.2.1
 * 
 */
@WebService(targetNamespace = "http://www.travelport.com/service/universal_v50_0", name = "RailCreateReservationPortType")
@XmlSeeAlso({com.travelport.schema.rail_v50_0.ObjectFactory.class, com.travelport.schema.common_v50_0.ObjectFactory.class, com.travelport.schema.vehicle_v50_0.ObjectFactory.class, com.travelport.schema.air_v50_0.ObjectFactory.class, com.travelport.schema.passive_v50_0.ObjectFactory.class, com.travelport.soa.common.security.sessioncontext_v1.ObjectFactory.class, com.travelport.schema.hotel_v50_0.ObjectFactory.class, com.travelport.schema.cruise_v50_0.ObjectFactory.class, com.travelport.schema.universal_v50_0.ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface RailCreateReservationPortType {

    @WebMethod
    @WebResult(name = "RailCreateReservationRsp", targetNamespace = "http://www.travelport.com/schema/universal_v50_0", partName = "result")
    public com.travelport.schema.universal_v50_0.RailCreateReservationRsp service(
        @WebParam(partName = "parameters", name = "RailCreateReservationReq", targetNamespace = "http://www.travelport.com/schema/universal_v50_0")
        com.travelport.schema.universal_v50_0.RailCreateReservationReq parameters
    ) throws RailFaultMessage;
}