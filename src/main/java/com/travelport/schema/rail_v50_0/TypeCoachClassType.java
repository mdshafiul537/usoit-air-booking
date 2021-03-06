
package com.travelport.schema.rail_v50_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typeCoachClassType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeCoachClassType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="First Class"/&gt;
 *     &lt;enumeration value="Standard Class"/&gt;
 *     &lt;enumeration value="First and Standard Class"/&gt;
 *     &lt;enumeration value="Other"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "typeCoachClassType")
@XmlEnum
public enum TypeCoachClassType {

    @XmlEnumValue("First Class")
    FIRST_CLASS("First Class"),
    @XmlEnumValue("Standard Class")
    STANDARD_CLASS("Standard Class"),
    @XmlEnumValue("First and Standard Class")
    FIRST_AND_STANDARD_CLASS("First and Standard Class"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    TypeCoachClassType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeCoachClassType fromValue(String v) {
        for (TypeCoachClassType c: TypeCoachClassType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
