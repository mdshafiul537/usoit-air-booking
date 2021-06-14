
package com.travelport.schema.vehicle_v50_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for vehicleRateModifiers.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="vehicleRateModifiers"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="G"/&gt;
 *     &lt;enumeration value="Q"/&gt;
 *     &lt;enumeration value="T"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "vehicleRateModifiers")
@XmlEnum
public enum VehicleRateModifiers {

    G,
    Q,
    T;

    public String value() {
        return name();
    }

    public static VehicleRateModifiers fromValue(String v) {
        return valueOf(v);
    }

}
