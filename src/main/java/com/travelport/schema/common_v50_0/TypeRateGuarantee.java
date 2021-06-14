
package com.travelport.schema.common_v50_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typeRateGuarantee.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeRateGuarantee"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Rate Guaranteed"/&gt;
 *     &lt;enumeration value="Rate Quoted"/&gt;
 *     &lt;enumeration value="Agent Entered"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "typeRateGuarantee")
@XmlEnum
public enum TypeRateGuarantee {

    @XmlEnumValue("Rate Guaranteed")
    RATE_GUARANTEED("Rate Guaranteed"),
    @XmlEnumValue("Rate Quoted")
    RATE_QUOTED("Rate Quoted"),
    @XmlEnumValue("Agent Entered")
    AGENT_ENTERED("Agent Entered");
    private final String value;

    TypeRateGuarantee(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeRateGuarantee fromValue(String v) {
        for (TypeRateGuarantee c: TypeRateGuarantee.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
