
package com.travelport.schema.air_v50_0;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import com.travelport.schema.common_v50_0.TypeElementStatus;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *       &lt;attGroup ref="{http://www.travelport.com/schema/common_v50_0}attrElementKeyResults"/&gt;
 *       &lt;attribute name="Key" use="required" type="{http://www.travelport.com/schema/common_v50_0}typeRef" /&gt;
 *       &lt;attribute name="Precedence" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *       &lt;attribute name="NoteName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="FareInfoMessageRef" type="{http://www.travelport.com/schema/common_v50_0}typeRef" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "value"
})
@XmlRootElement(name = "FareNote")
public class FareNote {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "Key", required = true)
    protected String key;
    @XmlAttribute(name = "Precedence")
    protected BigInteger precedence;
    @XmlAttribute(name = "NoteName")
    protected String noteName;
    @XmlAttribute(name = "FareInfoMessageRef")
    protected String fareInfoMessageRef;
    @XmlAttribute(name = "ElStat")
    protected TypeElementStatus elStat;
    @XmlAttribute(name = "KeyOverride")
    protected Boolean keyOverride;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the key property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKey() {
        return key;
    }

    /**
     * Sets the value of the key property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKey(String value) {
        this.key = value;
    }

    /**
     * Gets the value of the precedence property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPrecedence() {
        return precedence;
    }

    /**
     * Sets the value of the precedence property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPrecedence(BigInteger value) {
        this.precedence = value;
    }

    /**
     * Gets the value of the noteName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoteName() {
        return noteName;
    }

    /**
     * Sets the value of the noteName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoteName(String value) {
        this.noteName = value;
    }

    /**
     * Gets the value of the fareInfoMessageRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFareInfoMessageRef() {
        return fareInfoMessageRef;
    }

    /**
     * Sets the value of the fareInfoMessageRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFareInfoMessageRef(String value) {
        this.fareInfoMessageRef = value;
    }

    /**
     * Gets the value of the elStat property.
     * 
     * @return
     *     possible object is
     *     {@link TypeElementStatus }
     *     
     */
    public TypeElementStatus getElStat() {
        return elStat;
    }

    /**
     * Sets the value of the elStat property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeElementStatus }
     *     
     */
    public void setElStat(TypeElementStatus value) {
        this.elStat = value;
    }

    /**
     * Gets the value of the keyOverride property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isKeyOverride() {
        return keyOverride;
    }

    /**
     * Sets the value of the keyOverride property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setKeyOverride(Boolean value) {
        this.keyOverride = value;
    }

}
