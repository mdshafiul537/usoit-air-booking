
package com.travelport.schema.common_v50_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typeAgencyProfileLevel.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeAgencyProfileLevel"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Agency"/&gt;
 *     &lt;enumeration value="Branch"/&gt;
 *     &lt;enumeration value="BranchGroup"/&gt;
 *     &lt;enumeration value="Agent"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "typeAgencyProfileLevel")
@XmlEnum
public enum TypeAgencyProfileLevel {

    @XmlEnumValue("Agency")
    AGENCY("Agency"),
    @XmlEnumValue("Branch")
    BRANCH("Branch"),
    @XmlEnumValue("BranchGroup")
    BRANCH_GROUP("BranchGroup"),
    @XmlEnumValue("Agent")
    AGENT("Agent");
    private final String value;

    TypeAgencyProfileLevel(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeAgencyProfileLevel fromValue(String v) {
        for (TypeAgencyProfileLevel c: TypeAgencyProfileLevel.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
