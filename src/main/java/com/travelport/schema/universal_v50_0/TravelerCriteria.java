
package com.travelport.schema.universal_v50_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
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
 *       &lt;choice&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/universal_v50_0}NameCriteria" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/universal_v50_0}AppliedProfileCriteria" minOccurs="0"/&gt;
 *       &lt;/choice&gt;
 *       &lt;attribute name="PhoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="VIPOnly" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "nameCriteria",
    "appliedProfileCriteria"
})
@XmlRootElement(name = "TravelerCriteria")
public class TravelerCriteria {

    @XmlElement(name = "NameCriteria")
    protected NameCriteria nameCriteria;
    @XmlElement(name = "AppliedProfileCriteria")
    protected AppliedProfileCriteria appliedProfileCriteria;
    @XmlAttribute(name = "PhoneNumber")
    protected String phoneNumber;
    @XmlAttribute(name = "VIPOnly")
    protected Boolean vipOnly;

    /**
     * Gets the value of the nameCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link NameCriteria }
     *     
     */
    public NameCriteria getNameCriteria() {
        return nameCriteria;
    }

    /**
     * Sets the value of the nameCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link NameCriteria }
     *     
     */
    public void setNameCriteria(NameCriteria value) {
        this.nameCriteria = value;
    }

    /**
     * Gets the value of the appliedProfileCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link AppliedProfileCriteria }
     *     
     */
    public AppliedProfileCriteria getAppliedProfileCriteria() {
        return appliedProfileCriteria;
    }

    /**
     * Sets the value of the appliedProfileCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link AppliedProfileCriteria }
     *     
     */
    public void setAppliedProfileCriteria(AppliedProfileCriteria value) {
        this.appliedProfileCriteria = value;
    }

    /**
     * Gets the value of the phoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Sets the value of the phoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneNumber(String value) {
        this.phoneNumber = value;
    }

    /**
     * Gets the value of the vipOnly property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVIPOnly() {
        return vipOnly;
    }

    /**
     * Sets the value of the vipOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVIPOnly(Boolean value) {
        this.vipOnly = value;
    }

}
