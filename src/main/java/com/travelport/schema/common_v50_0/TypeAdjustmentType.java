
package com.travelport.schema.common_v50_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typeAdjustmentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeAdjustmentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Amount"/&gt;
 *     &lt;enumeration value="Percentage"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "typeAdjustmentType")
@XmlEnum
public enum TypeAdjustmentType {

    @XmlEnumValue("Amount")
    AMOUNT("Amount"),
    @XmlEnumValue("Percentage")
    PERCENTAGE("Percentage");
    private final String value;

    TypeAdjustmentType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeAdjustmentType fromValue(String v) {
        for (TypeAdjustmentType c: TypeAdjustmentType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
