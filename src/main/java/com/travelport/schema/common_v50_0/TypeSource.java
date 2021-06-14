
package com.travelport.schema.common_v50_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typeSource.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeSource"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Agency"/&gt;
 *     &lt;enumeration value="BranchGroup"/&gt;
 *     &lt;enumeration value="Branch"/&gt;
 *     &lt;enumeration value="Agent"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "typeSource")
@XmlEnum
public enum TypeSource {

    @XmlEnumValue("Agency")
    AGENCY("Agency"),
    @XmlEnumValue("BranchGroup")
    BRANCH_GROUP("BranchGroup"),
    @XmlEnumValue("Branch")
    BRANCH("Branch"),
    @XmlEnumValue("Agent")
    AGENT("Agent");
    private final String value;

    TypeSource(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeSource fromValue(String v) {
        for (TypeSource c: TypeSource.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
