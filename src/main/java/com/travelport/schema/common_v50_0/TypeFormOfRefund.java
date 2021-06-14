
package com.travelport.schema.common_v50_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typeFormOfRefund.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeFormOfRefund"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="MCO"/&gt;
 *     &lt;enumeration value="FormOfPayment"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "typeFormOfRefund")
@XmlEnum
public enum TypeFormOfRefund {

    MCO("MCO"),
    @XmlEnumValue("FormOfPayment")
    FORM_OF_PAYMENT("FormOfPayment");
    private final String value;

    TypeFormOfRefund(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeFormOfRefund fromValue(String v) {
        for (TypeFormOfRefund c: TypeFormOfRefund.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
