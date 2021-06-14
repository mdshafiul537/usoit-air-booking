
package com.travelport.schema.air_v50_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typeFareSearchOption.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeFareSearchOption"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Leave"/&gt;
 *     &lt;enumeration value="Return"/&gt;
 *     &lt;enumeration value="Seasonal"/&gt;
 *     &lt;enumeration value="Blackout"/&gt;
 *     &lt;enumeration value="Advance Purchase"/&gt;
 *     &lt;enumeration value="Day-of-week"/&gt;
 *     &lt;enumeration value="Effective Date"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "typeFareSearchOption")
@XmlEnum
public enum TypeFareSearchOption {

    @XmlEnumValue("Leave")
    LEAVE("Leave"),
    @XmlEnumValue("Return")
    RETURN("Return"),
    @XmlEnumValue("Seasonal")
    SEASONAL("Seasonal"),
    @XmlEnumValue("Blackout")
    BLACKOUT("Blackout"),
    @XmlEnumValue("Advance Purchase")
    ADVANCE_PURCHASE("Advance Purchase"),
    @XmlEnumValue("Day-of-week")
    DAY_OF_WEEK("Day-of-week"),
    @XmlEnumValue("Effective Date")
    EFFECTIVE_DATE("Effective Date");
    private final String value;

    TypeFareSearchOption(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeFareSearchOption fromValue(String v) {
        for (TypeFareSearchOption c: TypeFareSearchOption.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
