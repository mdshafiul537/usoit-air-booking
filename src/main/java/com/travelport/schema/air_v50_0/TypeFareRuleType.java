
package com.travelport.schema.air_v50_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typeFareRuleType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeFareRuleType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="none"/&gt;
 *     &lt;enumeration value="short"/&gt;
 *     &lt;enumeration value="long"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "typeFareRuleType")
@XmlEnum
public enum TypeFareRuleType {

    @XmlEnumValue("none")
    NONE("none"),
    @XmlEnumValue("short")
    SHORT("short"),
    @XmlEnumValue("long")
    LONG("long");
    private final String value;

    TypeFareRuleType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeFareRuleType fromValue(String v) {
        for (TypeFareRuleType c: TypeFareRuleType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
