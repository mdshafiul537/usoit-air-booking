
package com.travelport.schema.air_v50_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typeFaresIndicator.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeFaresIndicator"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="PublicFaresOnly"/&gt;
 *     &lt;enumeration value="PrivateFaresOnly"/&gt;
 *     &lt;enumeration value="AgencyPrivateFaresOnly"/&gt;
 *     &lt;enumeration value="AirlinePrivateFaresOnly"/&gt;
 *     &lt;enumeration value="PublicAndPrivateFares"/&gt;
 *     &lt;enumeration value="NetFaresOnly"/&gt;
 *     &lt;enumeration value="AllFares"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "typeFaresIndicator")
@XmlEnum
public enum TypeFaresIndicator {

    @XmlEnumValue("PublicFaresOnly")
    PUBLIC_FARES_ONLY("PublicFaresOnly"),
    @XmlEnumValue("PrivateFaresOnly")
    PRIVATE_FARES_ONLY("PrivateFaresOnly"),
    @XmlEnumValue("AgencyPrivateFaresOnly")
    AGENCY_PRIVATE_FARES_ONLY("AgencyPrivateFaresOnly"),
    @XmlEnumValue("AirlinePrivateFaresOnly")
    AIRLINE_PRIVATE_FARES_ONLY("AirlinePrivateFaresOnly"),
    @XmlEnumValue("PublicAndPrivateFares")
    PUBLIC_AND_PRIVATE_FARES("PublicAndPrivateFares"),
    @XmlEnumValue("NetFaresOnly")
    NET_FARES_ONLY("NetFaresOnly"),

    /**
     * Applicable for 1G/1V air shop only
     * 
     */
    @XmlEnumValue("AllFares")
    ALL_FARES("AllFares");
    private final String value;

    TypeFaresIndicator(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeFaresIndicator fromValue(String v) {
        for (TypeFaresIndicator c: TypeFaresIndicator.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
