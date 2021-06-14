
package com.travelport.schema.common_v50_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typeItineraryCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeItineraryCode"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="International"/&gt;
 *     &lt;enumeration value="Domestic"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "typeItineraryCode")
@XmlEnum
public enum TypeItineraryCode {


    /**
     * Indicates the itinerary is International
     * 
     */
    @XmlEnumValue("International")
    INTERNATIONAL("International"),

    /**
     * Indicates the itinerary is domestic
     * 
     */
    @XmlEnumValue("Domestic")
    DOMESTIC("Domestic");
    private final String value;

    TypeItineraryCode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeItineraryCode fromValue(String v) {
        for (TypeItineraryCode c: TypeItineraryCode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
