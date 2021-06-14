
package com.travelport.schema.universal_v50_0;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.travelport.schema.air_v50_0.AirPricingSolution;
import com.travelport.schema.air_v50_0.AirPricingTicketingModifiers;
import com.travelport.schema.air_v50_0.AssociatedRemark;
import com.travelport.schema.air_v50_0.AutoSeatAssignment;
import com.travelport.schema.air_v50_0.PocketItineraryRemark;
import com.travelport.schema.air_v50_0.SpecificSeatAssignment;
import com.travelport.schema.common_v50_0.ActionStatus;
import com.travelport.schema.common_v50_0.BaseCreateWithFormOfPaymentReq;
import com.travelport.schema.common_v50_0.DeliveryInfo;
import com.travelport.schema.common_v50_0.Payment;
import com.travelport.schema.common_v50_0.PointOfSale;
import com.travelport.schema.common_v50_0.ReviewBooking;
import com.travelport.schema.common_v50_0.SupplierLocator;
import com.travelport.schema.common_v50_0.ThirdPartyInformation;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.travelport.com/schema/common_v50_0}BaseCreateWithFormOfPaymentReq"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/common_v50_0}SupplierLocator" maxOccurs="999" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/common_v50_0}ThirdPartyInformation" maxOccurs="999" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/common_v50_0}PointOfSale" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/air_v50_0}AirPricingSolution" maxOccurs="16"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/common_v50_0}ActionStatus" maxOccurs="999" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/common_v50_0}Payment" maxOccurs="999" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/common_v50_0}DeliveryInfo" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/air_v50_0}AutoSeatAssignment" maxOccurs="999" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/air_v50_0}SpecificSeatAssignment" maxOccurs="999" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/air_v50_0}AssociatedRemark" maxOccurs="999" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/air_v50_0}PocketItineraryRemark" maxOccurs="999" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/common_v50_0}ReviewBooking" maxOccurs="999" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/air_v50_0}AirPricingTicketingModifiers" maxOccurs="99" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="RetainReservation" type="{http://www.travelport.com/schema/universal_v50_0}typeRetainReservation" default="None" /&gt;
 *       &lt;attribute name="Source"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;maxLength value="50"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="OverrideMCT" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="RestrictWaitlist" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="CreatePassiveForHold" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="ChannelId"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;minLength value="2"/&gt;
 *             &lt;maxLength value="4"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="NSCC"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;minLength value="1"/&gt;
 *             &lt;maxLength value="3"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="CheckPriceVarianceType" default="Amount"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="Percentage"/&gt;
 *             &lt;enumeration value="Amount"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="CheckPriceVarianceValue" type="{http://www.w3.org/2001/XMLSchema}decimal" default="0.0" /&gt;
 *       &lt;attribute name="SplitReservation" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="PreferCompleteItinerary" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "supplierLocator",
    "thirdPartyInformation",
    "pointOfSale",
    "airPricingSolution",
    "actionStatus",
    "payment",
    "deliveryInfo",
    "autoSeatAssignment",
    "specificSeatAssignment",
    "associatedRemark",
    "pocketItineraryRemark",
    "reviewBooking",
    "airPricingTicketingModifiers"
})
@XmlRootElement(name = "AirCreateReservationReq")
public class AirCreateReservationReq
    extends BaseCreateWithFormOfPaymentReq
{

    @XmlElement(name = "SupplierLocator", namespace = "http://www.travelport.com/schema/common_v50_0")
    protected List<SupplierLocator> supplierLocator;
    @XmlElement(name = "ThirdPartyInformation", namespace = "http://www.travelport.com/schema/common_v50_0")
    protected List<ThirdPartyInformation> thirdPartyInformation;
    @XmlElement(name = "PointOfSale", namespace = "http://www.travelport.com/schema/common_v50_0")
    protected PointOfSale pointOfSale;
    @XmlElement(name = "AirPricingSolution", namespace = "http://www.travelport.com/schema/air_v50_0", required = true)
    protected List<AirPricingSolution> airPricingSolution;
    @XmlElement(name = "ActionStatus", namespace = "http://www.travelport.com/schema/common_v50_0")
    protected List<ActionStatus> actionStatus;
    @XmlElement(name = "Payment", namespace = "http://www.travelport.com/schema/common_v50_0")
    protected List<Payment> payment;
    @XmlElement(name = "DeliveryInfo", namespace = "http://www.travelport.com/schema/common_v50_0")
    protected DeliveryInfo deliveryInfo;
    @XmlElement(name = "AutoSeatAssignment", namespace = "http://www.travelport.com/schema/air_v50_0")
    protected List<AutoSeatAssignment> autoSeatAssignment;
    @XmlElement(name = "SpecificSeatAssignment", namespace = "http://www.travelport.com/schema/air_v50_0")
    protected List<SpecificSeatAssignment> specificSeatAssignment;
    @XmlElement(name = "AssociatedRemark", namespace = "http://www.travelport.com/schema/air_v50_0")
    protected List<AssociatedRemark> associatedRemark;
    @XmlElement(name = "PocketItineraryRemark", namespace = "http://www.travelport.com/schema/air_v50_0")
    protected List<PocketItineraryRemark> pocketItineraryRemark;
    @XmlElement(name = "ReviewBooking", namespace = "http://www.travelport.com/schema/common_v50_0")
    protected List<ReviewBooking> reviewBooking;
    @XmlElement(name = "AirPricingTicketingModifiers", namespace = "http://www.travelport.com/schema/air_v50_0")
    protected List<AirPricingTicketingModifiers> airPricingTicketingModifiers;
    @XmlAttribute(name = "RetainReservation")
    protected TypeRetainReservation retainReservation;
    @XmlAttribute(name = "Source")
    protected String source;
    @XmlAttribute(name = "OverrideMCT")
    protected Boolean overrideMCT;
    @XmlAttribute(name = "RestrictWaitlist")
    protected Boolean restrictWaitlist;
    @XmlAttribute(name = "CreatePassiveForHold")
    protected Boolean createPassiveForHold;
    @XmlAttribute(name = "ChannelId")
    protected String channelId;
    @XmlAttribute(name = "NSCC")
    protected String nscc;
    @XmlAttribute(name = "CheckPriceVarianceType")
    protected String checkPriceVarianceType;
    @XmlAttribute(name = "CheckPriceVarianceValue")
    protected BigDecimal checkPriceVarianceValue;
    @XmlAttribute(name = "SplitReservation")
    protected Boolean splitReservation;
    @XmlAttribute(name = "PreferCompleteItinerary")
    protected Boolean preferCompleteItinerary;

    /**
     * Provider: 1G,1V,1P,1J,ACH,SDK.Gets the value of the supplierLocator property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the supplierLocator property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSupplierLocator().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SupplierLocator }
     * 
     * 
     */
    public List<SupplierLocator> getSupplierLocator() {
        if (supplierLocator == null) {
            supplierLocator = new ArrayList<SupplierLocator>();
        }
        return this.supplierLocator;
    }

    /**
     * Provider: SDK.Gets the value of the thirdPartyInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the thirdPartyInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getThirdPartyInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ThirdPartyInformation }
     * 
     * 
     */
    public List<ThirdPartyInformation> getThirdPartyInformation() {
        if (thirdPartyInformation == null) {
            thirdPartyInformation = new ArrayList<ThirdPartyInformation>();
        }
        return this.thirdPartyInformation;
    }

    /**
     * Provider: 1G,1V.
     * 
     * @return
     *     possible object is
     *     {@link PointOfSale }
     *     
     */
    public PointOfSale getPointOfSale() {
        return pointOfSale;
    }

    /**
     * Sets the value of the pointOfSale property.
     * 
     * @param value
     *     allowed object is
     *     {@link PointOfSale }
     *     
     */
    public void setPointOfSale(PointOfSale value) {
        this.pointOfSale = value;
    }

    /**
     * Provider: 1G,1V,1P,1J,ACH,SDK. SplitReservation can include up 16 AirPricingSolutions.Gets the value of the airPricingSolution property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the airPricingSolution property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAirPricingSolution().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AirPricingSolution }
     * 
     * 
     */
    public List<AirPricingSolution> getAirPricingSolution() {
        if (airPricingSolution == null) {
            airPricingSolution = new ArrayList<AirPricingSolution>();
        }
        return this.airPricingSolution;
    }

    /**
     * Provider: 1G,1V,1P,1J,ACH,SDK.Gets the value of the actionStatus property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the actionStatus property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getActionStatus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ActionStatus }
     * 
     * 
     */
    public List<ActionStatus> getActionStatus() {
        if (actionStatus == null) {
            actionStatus = new ArrayList<ActionStatus>();
        }
        return this.actionStatus;
    }

    /**
     * Provider: 1G,1V,1P,1J,ACH.Gets the value of the payment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the payment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPayment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Payment }
     * 
     * 
     */
    public List<Payment> getPayment() {
        if (payment == null) {
            payment = new ArrayList<Payment>();
        }
        return this.payment;
    }

    /**
     * Provider: ACH.
     * 
     * @return
     *     possible object is
     *     {@link DeliveryInfo }
     *     
     */
    public DeliveryInfo getDeliveryInfo() {
        return deliveryInfo;
    }

    /**
     * Sets the value of the deliveryInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveryInfo }
     *     
     */
    public void setDeliveryInfo(DeliveryInfo value) {
        this.deliveryInfo = value;
    }

    /**
     * Provider: 1G,1V,1P,1J.Gets the value of the autoSeatAssignment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the autoSeatAssignment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAutoSeatAssignment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AutoSeatAssignment }
     * 
     * 
     */
    public List<AutoSeatAssignment> getAutoSeatAssignment() {
        if (autoSeatAssignment == null) {
            autoSeatAssignment = new ArrayList<AutoSeatAssignment>();
        }
        return this.autoSeatAssignment;
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
     * Provider: 1G,1V,1P,1J,ACH,SDK.Gets the value of the associatedRemark property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the associatedRemark property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAssociatedRemark().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AssociatedRemark }
     * 
     * 
     */
    public List<AssociatedRemark> getAssociatedRemark() {
        if (associatedRemark == null) {
            associatedRemark = new ArrayList<AssociatedRemark>();
        }
        return this.associatedRemark;
    }

    /**
     * Provider: 1P,1J.Gets the value of the pocketItineraryRemark property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pocketItineraryRemark property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPocketItineraryRemark().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PocketItineraryRemark }
     * 
     * 
     */
    public List<PocketItineraryRemark> getPocketItineraryRemark() {
        if (pocketItineraryRemark == null) {
            pocketItineraryRemark = new ArrayList<PocketItineraryRemark>();
        }
        return this.pocketItineraryRemark;
    }

    /**
     * Provider: 1G,1V-Review Booking or Queue Minders is to add the reminders in the Provider Reservation along with the date time and Queue details. On the date time defined in reminders, the message along with the PNR goes to the desired Queue. Gets the value of the reviewBooking property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the reviewBooking property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReviewBooking().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReviewBooking }
     * 
     * 
     */
    public List<ReviewBooking> getReviewBooking() {
        if (reviewBooking == null) {
            reviewBooking = new ArrayList<ReviewBooking>();
        }
        return this.reviewBooking;
    }

    /**
     * AirPricing TicketingModifier information used to associate Ticketing Modifiers with one or more AirPricingInfos/ProviderReservationInfo for 1G,1V,1P,1J Gets the value of the airPricingTicketingModifiers property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the airPricingTicketingModifiers property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAirPricingTicketingModifiers().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AirPricingTicketingModifiers }
     * 
     * 
     */
    public List<AirPricingTicketingModifiers> getAirPricingTicketingModifiers() {
        if (airPricingTicketingModifiers == null) {
            airPricingTicketingModifiers = new ArrayList<AirPricingTicketingModifiers>();
        }
        return this.airPricingTicketingModifiers;
    }

    /**
     * Gets the value of the retainReservation property.
     * 
     * @return
     *     possible object is
     *     {@link TypeRetainReservation }
     *     
     */
    public TypeRetainReservation getRetainReservation() {
        if (retainReservation == null) {
            return TypeRetainReservation.NONE;
        } else {
            return retainReservation;
        }
    }

    /**
     * Sets the value of the retainReservation property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeRetainReservation }
     *     
     */
    public void setRetainReservation(TypeRetainReservation value) {
        this.retainReservation = value;
    }

    /**
     * Gets the value of the source property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSource() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSource(String value) {
        this.source = value;
    }

    /**
     * Gets the value of the overrideMCT property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isOverrideMCT() {
        if (overrideMCT == null) {
            return false;
        } else {
            return overrideMCT;
        }
    }

    /**
     * Sets the value of the overrideMCT property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOverrideMCT(Boolean value) {
        this.overrideMCT = value;
    }

    /**
     * Gets the value of the restrictWaitlist property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isRestrictWaitlist() {
        if (restrictWaitlist == null) {
            return false;
        } else {
            return restrictWaitlist;
        }
    }

    /**
     * Sets the value of the restrictWaitlist property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRestrictWaitlist(Boolean value) {
        this.restrictWaitlist = value;
    }

    /**
     * Gets the value of the createPassiveForHold property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isCreatePassiveForHold() {
        if (createPassiveForHold == null) {
            return false;
        } else {
            return createPassiveForHold;
        }
    }

    /**
     * Sets the value of the createPassiveForHold property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCreatePassiveForHold(Boolean value) {
        this.createPassiveForHold = value;
    }

    /**
     * Gets the value of the channelId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChannelId() {
        return channelId;
    }

    /**
     * Sets the value of the channelId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChannelId(String value) {
        this.channelId = value;
    }

    /**
     * Gets the value of the nscc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNSCC() {
        return nscc;
    }

    /**
     * Sets the value of the nscc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNSCC(String value) {
        this.nscc = value;
    }

    /**
     * Gets the value of the checkPriceVarianceType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCheckPriceVarianceType() {
        if (checkPriceVarianceType == null) {
            return "Amount";
        } else {
            return checkPriceVarianceType;
        }
    }

    /**
     * Sets the value of the checkPriceVarianceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCheckPriceVarianceType(String value) {
        this.checkPriceVarianceType = value;
    }

    /**
     * Gets the value of the checkPriceVarianceValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCheckPriceVarianceValue() {
        if (checkPriceVarianceValue == null) {
            return new BigDecimal("0.0");
        } else {
            return checkPriceVarianceValue;
        }
    }

    /**
     * Sets the value of the checkPriceVarianceValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCheckPriceVarianceValue(BigDecimal value) {
        this.checkPriceVarianceValue = value;
    }

    /**
     * Gets the value of the splitReservation property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isSplitReservation() {
        if (splitReservation == null) {
            return false;
        } else {
            return splitReservation;
        }
    }

    /**
     * Sets the value of the splitReservation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSplitReservation(Boolean value) {
        this.splitReservation = value;
    }

    /**
     * Gets the value of the preferCompleteItinerary property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isPreferCompleteItinerary() {
        if (preferCompleteItinerary == null) {
            return true;
        } else {
            return preferCompleteItinerary;
        }
    }

    /**
     * Sets the value of the preferCompleteItinerary property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPreferCompleteItinerary(Boolean value) {
        this.preferCompleteItinerary = value;
    }

}
