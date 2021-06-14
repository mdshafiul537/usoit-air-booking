
package com.travelport.schema.air_v50_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typeConnectionIndicator.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeConnectionIndicator"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="AvailabilityAndPricing"/&gt;
 *     &lt;enumeration value="TurnAround"/&gt;
 *     &lt;enumeration value="Stopover"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "typeConnectionIndicator")
@XmlEnum
public enum TypeConnectionIndicator {

    @XmlEnumValue("AvailabilityAndPricing")
    AVAILABILITY_AND_PRICING("AvailabilityAndPricing"),
    @XmlEnumValue("TurnAround")
    TURN_AROUND("TurnAround"),
    @XmlEnumValue("Stopover")
    STOPOVER("Stopover");
    private final String value;

    TypeConnectionIndicator(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeConnectionIndicator fromValue(String v) {
        for (TypeConnectionIndicator c: TypeConnectionIndicator.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
