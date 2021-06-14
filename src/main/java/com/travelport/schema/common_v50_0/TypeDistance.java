
package com.travelport.schema.common_v50_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typeDistance.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeDistance"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;length value="2"/&gt;
 *     &lt;enumeration value="MI"/&gt;
 *     &lt;enumeration value="KM"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "typeDistance")
@XmlEnum
public enum TypeDistance {

    MI,
    KM;

    public String value() {
        return name();
    }

    public static TypeDistance fromValue(String v) {
        return valueOf(v);
    }

}
