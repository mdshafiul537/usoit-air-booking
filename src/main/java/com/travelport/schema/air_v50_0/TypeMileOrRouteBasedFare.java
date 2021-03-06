
package com.travelport.schema.air_v50_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typeMileOrRouteBasedFare.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeMileOrRouteBasedFare"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Mile"/&gt;
 *     &lt;enumeration value="Route"/&gt;
 *     &lt;enumeration value="Both"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "typeMileOrRouteBasedFare")
@XmlEnum
public enum TypeMileOrRouteBasedFare {

    @XmlEnumValue("Mile")
    MILE("Mile"),
    @XmlEnumValue("Route")
    ROUTE("Route"),
    @XmlEnumValue("Both")
    BOTH("Both");
    private final String value;

    TypeMileOrRouteBasedFare(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeMileOrRouteBasedFare fromValue(String v) {
        for (TypeMileOrRouteBasedFare c: TypeMileOrRouteBasedFare.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
