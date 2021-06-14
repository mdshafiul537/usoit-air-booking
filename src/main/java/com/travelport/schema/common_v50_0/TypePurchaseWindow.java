
package com.travelport.schema.common_v50_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typePurchaseWindow.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typePurchaseWindow"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="BookingOnly"/&gt;
 *     &lt;enumeration value="TicketingOnly"/&gt;
 *     &lt;enumeration value="CheckInOnly"/&gt;
 *     &lt;enumeration value="Anytime"/&gt;
 *     &lt;enumeration value="PostTicketing"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "typePurchaseWindow")
@XmlEnum
public enum TypePurchaseWindow {

    @XmlEnumValue("BookingOnly")
    BOOKING_ONLY("BookingOnly"),
    @XmlEnumValue("TicketingOnly")
    TICKETING_ONLY("TicketingOnly"),
    @XmlEnumValue("CheckInOnly")
    CHECK_IN_ONLY("CheckInOnly"),
    @XmlEnumValue("Anytime")
    ANYTIME("Anytime"),
    @XmlEnumValue("PostTicketing")
    POST_TICKETING("PostTicketing");
    private final String value;

    TypePurchaseWindow(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypePurchaseWindow fromValue(String v) {
        for (TypePurchaseWindow c: TypePurchaseWindow.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
