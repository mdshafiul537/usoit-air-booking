
package com.travelport.schema.hotel_v50_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typeRateRuleDetail.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeRateRuleDetail"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="None"/&gt;
 *     &lt;enumeration value="Complete"/&gt;
 *     &lt;enumeration value="RatePlansOnly"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "typeRateRuleDetail")
@XmlEnum
public enum TypeRateRuleDetail {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("Complete")
    COMPLETE("Complete"),
    @XmlEnumValue("RatePlansOnly")
    RATE_PLANS_ONLY("RatePlansOnly");
    private final String value;

    TypeRateRuleDetail(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeRateRuleDetail fromValue(String v) {
        for (TypeRateRuleDetail c: TypeRateRuleDetail.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
