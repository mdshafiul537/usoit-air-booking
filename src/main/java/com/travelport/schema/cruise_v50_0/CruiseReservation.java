
package com.travelport.schema.cruise_v50_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.travelport.schema.common_v50_0.BaseReservation;
import com.travelport.schema.common_v50_0.BookingTravelerRef;
import com.travelport.schema.common_v50_0.Payment;
import com.travelport.schema.common_v50_0.ProviderReservationInfoRef;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.travelport.com/schema/common_v50_0}BaseReservation"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/cruise_v50_0}CruiseSegment" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/cruise_v50_0}CruiseItinerary" maxOccurs="999" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/cruise_v50_0}CruisePricingInfo" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/cruise_v50_0}OptionalService" maxOccurs="999" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/common_v50_0}BookingTravelerRef" maxOccurs="999"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/common_v50_0}ProviderReservationInfoRef" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/common_v50_0}Payment" maxOccurs="999" minOccurs="0"/&gt;
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
    "cruiseSegment",
    "cruiseItinerary",
    "cruisePricingInfo",
    "optionalService",
    "bookingTravelerRef",
    "providerReservationInfoRef",
    "payment"
})
@XmlRootElement(name = "CruiseReservation")
public class CruiseReservation
    extends BaseReservation
{

    @XmlElement(name = "CruiseSegment")
    protected CruiseSegment cruiseSegment;
    @XmlElement(name = "CruiseItinerary")
    protected List<CruiseItinerary> cruiseItinerary;
    @XmlElement(name = "CruisePricingInfo")
    protected CruisePricingInfo cruisePricingInfo;
    @XmlElement(name = "OptionalService")
    protected List<OptionalService> optionalService;
    @XmlElement(name = "BookingTravelerRef", namespace = "http://www.travelport.com/schema/common_v50_0", required = true)
    protected List<BookingTravelerRef> bookingTravelerRef;
    @XmlElement(name = "ProviderReservationInfoRef", namespace = "http://www.travelport.com/schema/common_v50_0")
    protected ProviderReservationInfoRef providerReservationInfoRef;
    @XmlElement(name = "Payment", namespace = "http://www.travelport.com/schema/common_v50_0")
    protected List<Payment> payment;

    /**
     * Gets the value of the cruiseSegment property.
     * 
     * @return
     *     possible object is
     *     {@link CruiseSegment }
     *     
     */
    public CruiseSegment getCruiseSegment() {
        return cruiseSegment;
    }

    /**
     * Sets the value of the cruiseSegment property.
     * 
     * @param value
     *     allowed object is
     *     {@link CruiseSegment }
     *     
     */
    public void setCruiseSegment(CruiseSegment value) {
        this.cruiseSegment = value;
    }

    /**
     * Gets the value of the cruiseItinerary property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cruiseItinerary property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCruiseItinerary().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CruiseItinerary }
     * 
     * 
     */
    public List<CruiseItinerary> getCruiseItinerary() {
        if (cruiseItinerary == null) {
            cruiseItinerary = new ArrayList<CruiseItinerary>();
        }
        return this.cruiseItinerary;
    }

    /**
     * Cruise pricing Information. Contains all	related pricing data for travelers.
     * 
     * @return
     *     possible object is
     *     {@link CruisePricingInfo }
     *     
     */
    public CruisePricingInfo getCruisePricingInfo() {
        return cruisePricingInfo;
    }

    /**
     * Sets the value of the cruisePricingInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CruisePricingInfo }
     *     
     */
    public void setCruisePricingInfo(CruisePricingInfo value) {
        this.cruisePricingInfo = value;
    }

    /**
     * Gets the value of the optionalService property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the optionalService property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOptionalService().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OptionalService }
     * 
     * 
     */
    public List<OptionalService> getOptionalService() {
        if (optionalService == null) {
            optionalService = new ArrayList<OptionalService>();
        }
        return this.optionalService;
    }

    /**
     * Gets the value of the bookingTravelerRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bookingTravelerRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBookingTravelerRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BookingTravelerRef }
     * 
     * 
     */
    public List<BookingTravelerRef> getBookingTravelerRef() {
        if (bookingTravelerRef == null) {
            bookingTravelerRef = new ArrayList<BookingTravelerRef>();
        }
        return this.bookingTravelerRef;
    }

    /**
     * Gets the value of the providerReservationInfoRef property.
     * 
     * @return
     *     possible object is
     *     {@link ProviderReservationInfoRef }
     *     
     */
    public ProviderReservationInfoRef getProviderReservationInfoRef() {
        return providerReservationInfoRef;
    }

    /**
     * Sets the value of the providerReservationInfoRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProviderReservationInfoRef }
     *     
     */
    public void setProviderReservationInfoRef(ProviderReservationInfoRef value) {
        this.providerReservationInfoRef = value;
    }

    /**
     * Gets the value of the payment property.
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

}
