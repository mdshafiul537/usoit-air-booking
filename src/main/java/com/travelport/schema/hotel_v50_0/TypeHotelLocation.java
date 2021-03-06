
package com.travelport.schema.hotel_v50_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typeHotelLocation.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeHotelLocation"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="City"/&gt;
 *     &lt;enumeration value="Airport"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "typeHotelLocation")
@XmlEnum
public enum TypeHotelLocation {

    @XmlEnumValue("City")
    CITY("City"),
    @XmlEnumValue("Airport")
    AIRPORT("Airport");
    private final String value;

    TypeHotelLocation(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeHotelLocation fromValue(String v) {
        for (TypeHotelLocation c: TypeHotelLocation.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
