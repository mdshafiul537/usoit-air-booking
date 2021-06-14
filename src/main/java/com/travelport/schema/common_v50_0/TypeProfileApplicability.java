
package com.travelport.schema.common_v50_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typeProfileApplicability.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeProfileApplicability"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Always"/&gt;
 *     &lt;enumeration value="Optional"/&gt;
 *     &lt;enumeration value="Never"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "typeProfileApplicability")
@XmlEnum
public enum TypeProfileApplicability {

    @XmlEnumValue("Always")
    ALWAYS("Always"),
    @XmlEnumValue("Optional")
    OPTIONAL("Optional"),
    @XmlEnumValue("Never")
    NEVER("Never");
    private final String value;

    TypeProfileApplicability(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeProfileApplicability fromValue(String v) {
        for (TypeProfileApplicability c: TypeProfileApplicability.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
