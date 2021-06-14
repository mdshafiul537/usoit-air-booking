
package com.travelport.schema.common_v50_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typeLoggingLevel.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeLoggingLevel"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="TRACE"/&gt;
 *     &lt;enumeration value="DEBUG"/&gt;
 *     &lt;enumeration value="INFO"/&gt;
 *     &lt;enumeration value="WARN"/&gt;
 *     &lt;enumeration value="ERROR"/&gt;
 *     &lt;enumeration value="FATAL"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "typeLoggingLevel")
@XmlEnum
public enum TypeLoggingLevel {

    TRACE,
    DEBUG,
    INFO,
    WARN,
    ERROR,
    FATAL;

    public String value() {
        return name();
    }

    public static TypeLoggingLevel fromValue(String v) {
        return valueOf(v);
    }

}
