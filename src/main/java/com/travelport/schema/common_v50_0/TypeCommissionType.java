
package com.travelport.schema.common_v50_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typeCommissionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeCommissionType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Flat"/&gt;
 *     &lt;enumeration value="PercentBase"/&gt;
 *     &lt;enumeration value="PercentTotal"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "typeCommissionType")
@XmlEnum
public enum TypeCommissionType {

    @XmlEnumValue("Flat")
    FLAT("Flat"),
    @XmlEnumValue("PercentBase")
    PERCENT_BASE("PercentBase"),
    @XmlEnumValue("PercentTotal")
    PERCENT_TOTAL("PercentTotal");
    private final String value;

    TypeCommissionType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeCommissionType fromValue(String v) {
        for (TypeCommissionType c: TypeCommissionType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
