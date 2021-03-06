
package com.travelport.service.universal_v50_0;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.2.1
 * 2021-06-13T20:09:03.755+06:00
 * Generated source version: 3.2.1
 */

@WebFault(name = "AvailabilityErrorInfo", targetNamespace = "http://www.travelport.com/schema/air_v50_0")
public class AvailabilityFaultMessage extends Exception {
    
    private com.travelport.schema.air_v50_0.AvailabilityErrorInfo availabilityErrorInfo;

    public AvailabilityFaultMessage() {
        super();
    }
    
    public AvailabilityFaultMessage(String message) {
        super(message);
    }
    
    public AvailabilityFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public AvailabilityFaultMessage(String message, com.travelport.schema.air_v50_0.AvailabilityErrorInfo availabilityErrorInfo) {
        super(message);
        this.availabilityErrorInfo = availabilityErrorInfo;
    }

    public AvailabilityFaultMessage(String message, com.travelport.schema.air_v50_0.AvailabilityErrorInfo availabilityErrorInfo, Throwable cause) {
        super(message, cause);
        this.availabilityErrorInfo = availabilityErrorInfo;
    }

    public com.travelport.schema.air_v50_0.AvailabilityErrorInfo getFaultInfo() {
        return this.availabilityErrorInfo;
    }
}
