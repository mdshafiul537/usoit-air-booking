
package com.travelport.service.universal_v50_0;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.2.1
 * 2021-06-13T20:09:03.744+06:00
 * Generated source version: 3.2.1
 */

@WebFault(name = "ErrorInfo", targetNamespace = "http://www.travelport.com/schema/common_v50_0")
public class VehicleFaultMessage extends Exception {
    
    private com.travelport.schema.common_v50_0.ErrorInfo errorInfo;

    public VehicleFaultMessage() {
        super();
    }
    
    public VehicleFaultMessage(String message) {
        super(message);
    }
    
    public VehicleFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public VehicleFaultMessage(String message, com.travelport.schema.common_v50_0.ErrorInfo errorInfo) {
        super(message);
        this.errorInfo = errorInfo;
    }

    public VehicleFaultMessage(String message, com.travelport.schema.common_v50_0.ErrorInfo errorInfo, Throwable cause) {
        super(message, cause);
        this.errorInfo = errorInfo;
    }

    public com.travelport.schema.common_v50_0.ErrorInfo getFaultInfo() {
        return this.errorInfo;
    }
}