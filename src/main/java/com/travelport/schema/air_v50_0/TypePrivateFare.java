
package com.travelport.schema.air_v50_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typePrivateFare.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typePrivateFare"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="UnknownType"/&gt;
 *     &lt;enumeration value="PrivateFare"/&gt;
 *     &lt;enumeration value="AgencyPrivateFare"/&gt;
 *     &lt;enumeration value="AirlinePrivateFare"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "typePrivateFare")
@XmlEnum
public enum TypePrivateFare {

    @XmlEnumValue("UnknownType")
    UNKNOWN_TYPE("UnknownType"),
    @XmlEnumValue("PrivateFare")
    PRIVATE_FARE("PrivateFare"),
    @XmlEnumValue("AgencyPrivateFare")
    AGENCY_PRIVATE_FARE("AgencyPrivateFare"),
    @XmlEnumValue("AirlinePrivateFare")
    AIRLINE_PRIVATE_FARE("AirlinePrivateFare");
    private final String value;

    TypePrivateFare(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypePrivateFare fromValue(String v) {
        for (TypePrivateFare c: TypePrivateFare.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
