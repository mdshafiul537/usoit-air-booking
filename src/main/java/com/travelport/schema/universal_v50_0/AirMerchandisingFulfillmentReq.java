
package com.travelport.schema.universal_v50_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.travelport.schema.air_v50_0.AirSolution;
import com.travelport.schema.air_v50_0.HostReservation;
import com.travelport.schema.air_v50_0.MerchandisingPricingModifiers;
import com.travelport.schema.air_v50_0.OptionalServices;
import com.travelport.schema.air_v50_0.SpecificSeatAssignment;
import com.travelport.schema.common_v50_0.AgencySellInfo;
import com.travelport.schema.common_v50_0.BaseReq;
import com.travelport.schema.common_v50_0.CreditCard;
import com.travelport.schema.common_v50_0.GeneralRemark;
import com.travelport.schema.common_v50_0.HostToken;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.travelport.com/schema/common_v50_0}BaseReq"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/common_v50_0}HostToken" maxOccurs="999" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/air_v50_0}HostReservation" maxOccurs="999"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/common_v50_0}AgencySellInfo" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/air_v50_0}AirSolution"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/common_v50_0}CreditCard" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/air_v50_0}OptionalServices" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/air_v50_0}SpecificSeatAssignment" maxOccurs="999" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/common_v50_0}GeneralRemark" maxOccurs="999" minOccurs="0"/&gt;
 *         &lt;element name="ConfirmationEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/air_v50_0}MerchandisingPricingModifiers" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "hostToken",
    "hostReservation",
    "agencySellInfo",
    "airSolution",
    "creditCard",
    "optionalServices",
    "specificSeatAssignment",
    "generalRemark",
    "confirmationEmail",
    "merchandisingPricingModifiers"
})
@XmlRootElement(name = "AirMerchandisingFulfillmentReq")
public class AirMerchandisingFulfillmentReq
    extends BaseReq
{

    @XmlElement(name = "HostToken", namespace = "http://www.travelport.com/schema/common_v50_0")
    protected List<HostToken> hostToken;
    @XmlElement(name = "HostReservation", namespace = "http://www.travelport.com/schema/air_v50_0", required = true)
    protected List<HostReservation> hostReservation;
    @XmlElement(name = "AgencySellInfo", namespace = "http://www.travelport.com/schema/common_v50_0")
    protected AgencySellInfo agencySellInfo;
    @XmlElement(name = "AirSolution", namespace = "http://www.travelport.com/schema/air_v50_0", required = true)
    protected AirSolution airSolution;
    @XmlElement(name = "CreditCard", namespace = "http://www.travelport.com/schema/common_v50_0")
    protected CreditCard creditCard;
    @XmlElement(name = "OptionalServices", namespace = "http://www.travelport.com/schema/air_v50_0")
    protected OptionalServices optionalServices;
    @XmlElement(name = "SpecificSeatAssignment", namespace = "http://www.travelport.com/schema/air_v50_0")
    protected List<SpecificSeatAssignment> specificSeatAssignment;
    @XmlElement(name = "GeneralRemark", namespace = "http://www.travelport.com/schema/common_v50_0")
    protected List<GeneralRemark> generalRemark;
    @XmlElement(name = "ConfirmationEmail")
    protected String confirmationEmail;
    @XmlElement(name = "MerchandisingPricingModifiers", namespace = "http://www.travelport.com/schema/air_v50_0")
    protected MerchandisingPricingModifiers merchandisingPricingModifiers;

    /**
     * Provider: ACH.Gets the value of the hostToken property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hostToken property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHostToken().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HostToken }
     * 
     * 
     */
    public List<HostToken> getHostToken() {
        if (hostToken == null) {
            hostToken = new ArrayList<HostToken>();
        }
        return this.hostToken;
    }

    /**
     * Provider: 1G,1V,1P,1J,ACH.Gets the value of the hostReservation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hostReservation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHostReservation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HostReservation }
     * 
     * 
     */
    public List<HostReservation> getHostReservation() {
        if (hostReservation == null) {
            hostReservation = new ArrayList<HostReservation>();
        }
        return this.hostReservation;
    }

    /**
     * Provider: 1G,1V,1P,1J,ACH.
     * 
     * @return
     *     possible object is
     *     {@link AgencySellInfo }
     *     
     */
    public AgencySellInfo getAgencySellInfo() {
        return agencySellInfo;
    }

    /**
     * Sets the value of the agencySellInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgencySellInfo }
     *     
     */
    public void setAgencySellInfo(AgencySellInfo value) {
        this.agencySellInfo = value;
    }

    /**
     * Provider: 1G,1V,1P,1J,ACH.
     * 
     * @return
     *     possible object is
     *     {@link AirSolution }
     *     
     */
    public AirSolution getAirSolution() {
        return airSolution;
    }

    /**
     * Sets the value of the airSolution property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirSolution }
     *     
     */
    public void setAirSolution(AirSolution value) {
        this.airSolution = value;
    }

    /**
     * Provider: 1G,1V,1P,1J,ACH.
     * 
     * @return
     *     possible object is
     *     {@link CreditCard }
     *     
     */
    public CreditCard getCreditCard() {
        return creditCard;
    }

    /**
     * Sets the value of the creditCard property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditCard }
     *     
     */
    public void setCreditCard(CreditCard value) {
        this.creditCard = value;
    }

    /**
     * Gets the value of the optionalServices property.
     * 
     * @return
     *     possible object is
     *     {@link OptionalServices }
     *     
     */
    public OptionalServices getOptionalServices() {
        return optionalServices;
    }

    /**
     * Sets the value of the optionalServices property.
     * 
     * @param value
     *     allowed object is
     *     {@link OptionalServices }
     *     
     */
    public void setOptionalServices(OptionalServices value) {
        this.optionalServices = value;
    }

    /**
     * Provider: 1G,1V,1P,1J,ACH.Gets the value of the specificSeatAssignment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the specificSeatAssignment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpecificSeatAssignment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SpecificSeatAssignment }
     * 
     * 
     */
    public List<SpecificSeatAssignment> getSpecificSeatAssignment() {
        if (specificSeatAssignment == null) {
            specificSeatAssignment = new ArrayList<SpecificSeatAssignment>();
        }
        return this.specificSeatAssignment;
    }

    /**
     * Provider: 1G,1V,1P,1J,ACH.Gets the value of the generalRemark property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the generalRemark property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGeneralRemark().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GeneralRemark }
     * 
     * 
     */
    public List<GeneralRemark> getGeneralRemark() {
        if (generalRemark == null) {
            generalRemark = new ArrayList<GeneralRemark>();
        }
        return this.generalRemark;
    }

    /**
     * Gets the value of the confirmationEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConfirmationEmail() {
        return confirmationEmail;
    }

    /**
     * Sets the value of the confirmationEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConfirmationEmail(String value) {
        this.confirmationEmail = value;
    }

    /**
     * Used to provide additional pricing modifiers. Provider:ACH.
     * 
     * @return
     *     possible object is
     *     {@link MerchandisingPricingModifiers }
     *     
     */
    public MerchandisingPricingModifiers getMerchandisingPricingModifiers() {
        return merchandisingPricingModifiers;
    }

    /**
     * Sets the value of the merchandisingPricingModifiers property.
     * 
     * @param value
     *     allowed object is
     *     {@link MerchandisingPricingModifiers }
     *     
     */
    public void setMerchandisingPricingModifiers(MerchandisingPricingModifiers value) {
        this.merchandisingPricingModifiers = value;
    }

}
