
package com.travelport.schema.common_v50_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typePricingType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typePricingType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ClassBooked"/&gt;
 *     &lt;enumeration value="LowestClass"/&gt;
 *     &lt;enumeration value="LowestQuote"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "typePricingType")
@XmlEnum
public enum TypePricingType {

    @XmlEnumValue("ClassBooked")
    CLASS_BOOKED("ClassBooked"),
    @XmlEnumValue("LowestClass")
    LOWEST_CLASS("LowestClass"),
    @XmlEnumValue("LowestQuote")
    LOWEST_QUOTE("LowestQuote");
    private final String value;

    TypePricingType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypePricingType fromValue(String v) {
        for (TypePricingType c: TypePricingType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
