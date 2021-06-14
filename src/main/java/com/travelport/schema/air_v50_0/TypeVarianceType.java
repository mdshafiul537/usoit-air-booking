
package com.travelport.schema.air_v50_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typeVarianceType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeVarianceType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Actual"/&gt;
 *     &lt;enumeration value="Estimated"/&gt;
 *     &lt;enumeration value="Canceled"/&gt;
 *     &lt;enumeration value="Diversion"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "typeVarianceType")
@XmlEnum
public enum TypeVarianceType {

    @XmlEnumValue("Actual")
    ACTUAL("Actual"),
    @XmlEnumValue("Estimated")
    ESTIMATED("Estimated"),
    @XmlEnumValue("Canceled")
    CANCELED("Canceled"),
    @XmlEnumValue("Diversion")
    DIVERSION("Diversion");
    private final String value;

    TypeVarianceType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeVarianceType fromValue(String v) {
        for (TypeVarianceType c: TypeVarianceType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
