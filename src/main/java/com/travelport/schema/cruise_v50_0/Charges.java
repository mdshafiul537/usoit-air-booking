
package com.travelport.schema.cruise_v50_0;

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
 *       &lt;attribute name="AirCharge" type="{http://www.travelport.com/schema/common_v50_0}typeMoney" /&gt;
 *       &lt;attribute name="OptionalCharge" type="{http://www.travelport.com/schema/common_v50_0}typeMoney" /&gt;
 *       &lt;attribute name="WaiverCharge" type="{http://www.travelport.com/schema/common_v50_0}typeMoney" /&gt;
 *       &lt;attribute name="WaiverChargeType" type="{http://www.travelport.com/schema/common_v50_0}StringLength1" /&gt;
 *       &lt;attribute name="PortCharge" type="{http://www.travelport.com/schema/common_v50_0}typeMoney" /&gt;
 *       &lt;attribute name="PortChargeDescription" type="{http://www.travelport.com/schema/common_v50_0}StringLength1to13" /&gt;
 *       &lt;attribute name="PenaltyCharge" type="{http://www.travelport.com/schema/common_v50_0}typeMoney" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "Charges")
public class Charges {

    @XmlAttribute(name = "AirCharge")
    protected String airCharge;
    @XmlAttribute(name = "OptionalCharge")
    protected String optionalCharge;
    @XmlAttribute(name = "WaiverCharge")
    protected String waiverCharge;
    @XmlAttribute(name = "WaiverChargeType")
    protected String waiverChargeType;
    @XmlAttribute(name = "PortCharge")
    protected String portCharge;
    @XmlAttribute(name = "PortChargeDescription")
    protected String portChargeDescription;
    @XmlAttribute(name = "PenaltyCharge")
    protected String penaltyCharge;

    /**
     * Gets the value of the airCharge property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAirCharge() {
        return airCharge;
    }

    /**
     * Sets the value of the airCharge property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAirCharge(String value) {
        this.airCharge = value;
    }

    /**
     * Gets the value of the optionalCharge property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOptionalCharge() {
        return optionalCharge;
    }

    /**
     * Sets the value of the optionalCharge property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOptionalCharge(String value) {
        this.optionalCharge = value;
    }

    /**
     * Gets the value of the waiverCharge property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWaiverCharge() {
        return waiverCharge;
    }

    /**
     * Sets the value of the waiverCharge property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWaiverCharge(String value) {
        this.waiverCharge = value;
    }

    /**
     * Gets the value of the waiverChargeType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWaiverChargeType() {
        return waiverChargeType;
    }

    /**
     * Sets the value of the waiverChargeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWaiverChargeType(String value) {
        this.waiverChargeType = value;
    }

    /**
     * Gets the value of the portCharge property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPortCharge() {
        return portCharge;
    }

    /**
     * Sets the value of the portCharge property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPortCharge(String value) {
        this.portCharge = value;
    }

    /**
     * Gets the value of the portChargeDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPortChargeDescription() {
        return portChargeDescription;
    }

    /**
     * Sets the value of the portChargeDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPortChargeDescription(String value) {
        this.portChargeDescription = value;
    }

    /**
     * Gets the value of the penaltyCharge property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPenaltyCharge() {
        return penaltyCharge;
    }

    /**
     * Sets the value of the penaltyCharge property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPenaltyCharge(String value) {
        this.penaltyCharge = value;
    }

}
