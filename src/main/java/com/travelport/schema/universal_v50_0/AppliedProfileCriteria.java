
package com.travelport.schema.universal_v50_0;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="TravelerProfileId"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.travelport.com/schema/common_v50_0}typeProfileID"&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "AppliedProfileCriteria")
public class AppliedProfileCriteria {

    @XmlAttribute(name = "TravelerProfileId")
    protected BigInteger travelerProfileId;

    /**
     * Gets the value of the travelerProfileId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTravelerProfileId() {
        return travelerProfileId;
    }

    /**
     * Sets the value of the travelerProfileId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTravelerProfileId(BigInteger value) {
        this.travelerProfileId = value;
    }

}
