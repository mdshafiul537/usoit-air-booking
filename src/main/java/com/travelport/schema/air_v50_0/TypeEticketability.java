
package com.travelport.schema.air_v50_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typeEticketability.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeEticketability"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Yes"/&gt;
 *     &lt;enumeration value="No"/&gt;
 *     &lt;enumeration value="Required"/&gt;
 *     &lt;enumeration value="Ticketless"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "typeEticketability")
@XmlEnum
public enum TypeEticketability {

    @XmlEnumValue("Yes")
    YES("Yes"),
    @XmlEnumValue("No")
    NO("No"),
    @XmlEnumValue("Required")
    REQUIRED("Required"),
    @XmlEnumValue("Ticketless")
    TICKETLESS("Ticketless");
    private final String value;

    TypeEticketability(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeEticketability fromValue(String v) {
        for (TypeEticketability c: TypeEticketability.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
