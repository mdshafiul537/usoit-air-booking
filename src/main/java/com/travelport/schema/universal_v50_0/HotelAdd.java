
package com.travelport.schema.universal_v50_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.travelport.schema.common_v50_0.BookingSource;
import com.travelport.schema.common_v50_0.CorporateDiscountID;
import com.travelport.schema.common_v50_0.Guarantee;
import com.travelport.schema.common_v50_0.LoyaltyCard;
import com.travelport.schema.common_v50_0.ReservationName;
import com.travelport.schema.common_v50_0.ThirdPartyInformation;
import com.travelport.schema.common_v50_0.TravelComplianceData;
import com.travelport.schema.hotel_v50_0.AssociatedRemark;
import com.travelport.schema.hotel_v50_0.GuestInformation;
import com.travelport.schema.hotel_v50_0.HotelBedding;


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
 *         &lt;element ref="{http://www.travelport.com/schema/common_v50_0}LoyaltyCard" maxOccurs="999" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/common_v50_0}Guarantee" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/hotel_v50_0}GuestInformation" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/hotel_v50_0}AssociatedRemark" maxOccurs="999" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/common_v50_0}BookingSource" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/hotel_v50_0}HotelSpecialRequest" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/common_v50_0}CorporateDiscountID" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/common_v50_0}ReservationName" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/common_v50_0}ThirdPartyInformation" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/common_v50_0}TravelComplianceData" maxOccurs="999" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/hotel_v50_0}HotelBedding" maxOccurs="999" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/hotel_v50_0}BookingConfirmation" minOccurs="0"/&gt;
 *       &lt;/choice&gt;
 *       &lt;attribute name="ReservationLocatorCode" use="required" type="{http://www.travelport.com/schema/common_v50_0}typeLocatorCode" /&gt;
 *       &lt;attribute name="BookingTravelerRef" type="{http://www.travelport.com/schema/common_v50_0}typeRef" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "loyaltyCard",
    "guarantee",
    "guestInformation",
    "associatedRemark",
    "bookingSource",
    "hotelSpecialRequest",
    "corporateDiscountID",
    "reservationName",
    "thirdPartyInformation",
    "travelComplianceData",
    "hotelBedding",
    "bookingConfirmation"
})
@XmlRootElement(name = "HotelAdd")
public class HotelAdd {

    @XmlElement(name = "LoyaltyCard", namespace = "http://www.travelport.com/schema/common_v50_0")
    protected List<LoyaltyCard> loyaltyCard;
    @XmlElement(name = "Guarantee", namespace = "http://www.travelport.com/schema/common_v50_0")
    protected Guarantee guarantee;
    @XmlElement(name = "GuestInformation", namespace = "http://www.travelport.com/schema/hotel_v50_0")
    protected GuestInformation guestInformation;
    @XmlElement(name = "AssociatedRemark", namespace = "http://www.travelport.com/schema/hotel_v50_0")
    protected List<AssociatedRemark> associatedRemark;
    @XmlElement(name = "BookingSource", namespace = "http://www.travelport.com/schema/common_v50_0")
    protected BookingSource bookingSource;
    @XmlElement(name = "HotelSpecialRequest", namespace = "http://www.travelport.com/schema/hotel_v50_0")
    protected String hotelSpecialRequest;
    @XmlElement(name = "CorporateDiscountID", namespace = "http://www.travelport.com/schema/common_v50_0")
    protected CorporateDiscountID corporateDiscountID;
    @XmlElement(name = "ReservationName", namespace = "http://www.travelport.com/schema/common_v50_0")
    protected ReservationName reservationName;
    @XmlElement(name = "ThirdPartyInformation", namespace = "http://www.travelport.com/schema/common_v50_0")
    protected ThirdPartyInformation thirdPartyInformation;
    @XmlElement(name = "TravelComplianceData", namespace = "http://www.travelport.com/schema/common_v50_0")
    protected List<TravelComplianceData> travelComplianceData;
    @XmlElement(name = "HotelBedding", namespace = "http://www.travelport.com/schema/hotel_v50_0")
    protected List<HotelBedding> hotelBedding;
    @XmlElement(name = "BookingConfirmation", namespace = "http://www.travelport.com/schema/hotel_v50_0")
    protected String bookingConfirmation;
    @XmlAttribute(name = "ReservationLocatorCode", required = true)
    protected String reservationLocatorCode;
    @XmlAttribute(name = "BookingTravelerRef")
    protected String bookingTravelerRef;

    /**
     * Gets the value of the loyaltyCard property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the loyaltyCard property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLoyaltyCard().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LoyaltyCard }
     * 
     * 
     */
    public List<LoyaltyCard> getLoyaltyCard() {
        if (loyaltyCard == null) {
            loyaltyCard = new ArrayList<LoyaltyCard>();
        }
        return this.loyaltyCard;
    }

    /**
     * Gets the value of the guarantee property.
     * 
     * @return
     *     possible object is
     *     {@link Guarantee }
     *     
     */
    public Guarantee getGuarantee() {
        return guarantee;
    }

    /**
     * Sets the value of the guarantee property.
     * 
     * @param value
     *     allowed object is
     *     {@link Guarantee }
     *     
     */
    public void setGuarantee(Guarantee value) {
        this.guarantee = value;
    }

    /**
     * Gets the value of the guestInformation property.
     * 
     * @return
     *     possible object is
     *     {@link GuestInformation }
     *     
     */
    public GuestInformation getGuestInformation() {
        return guestInformation;
    }

    /**
     * Sets the value of the guestInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link GuestInformation }
     *     
     */
    public void setGuestInformation(GuestInformation value) {
        this.guestInformation = value;
    }

    /**
     * Gets the value of the associatedRemark property.
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
     * Gets the value of the bookingSource property.
     * 
     * @return
     *     possible object is
     *     {@link BookingSource }
     *     
     */
    public BookingSource getBookingSource() {
        return bookingSource;
    }

    /**
     * Sets the value of the bookingSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link BookingSource }
     *     
     */
    public void setBookingSource(BookingSource value) {
        this.bookingSource = value;
    }

    /**
     * Gets the value of the hotelSpecialRequest property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHotelSpecialRequest() {
        return hotelSpecialRequest;
    }

    /**
     * Sets the value of the hotelSpecialRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHotelSpecialRequest(String value) {
        this.hotelSpecialRequest = value;
    }

    /**
     * Gets the value of the corporateDiscountID property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateDiscountID }
     *     
     */
    public CorporateDiscountID getCorporateDiscountID() {
        return corporateDiscountID;
    }

    /**
     * Sets the value of the corporateDiscountID property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateDiscountID }
     *     
     */
    public void setCorporateDiscountID(CorporateDiscountID value) {
        this.corporateDiscountID = value;
    }

    /**
     * Gets the value of the reservationName property.
     * 
     * @return
     *     possible object is
     *     {@link ReservationName }
     *     
     */
    public ReservationName getReservationName() {
        return reservationName;
    }

    /**
     * Sets the value of the reservationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReservationName }
     *     
     */
    public void setReservationName(ReservationName value) {
        this.reservationName = value;
    }

    /**
     * Gets the value of the thirdPartyInformation property.
     * 
     * @return
     *     possible object is
     *     {@link ThirdPartyInformation }
     *     
     */
    public ThirdPartyInformation getThirdPartyInformation() {
        return thirdPartyInformation;
    }

    /**
     * Sets the value of the thirdPartyInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ThirdPartyInformation }
     *     
     */
    public void setThirdPartyInformation(ThirdPartyInformation value) {
        this.thirdPartyInformation = value;
    }

    /**
     * Gets the value of the travelComplianceData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the travelComplianceData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTravelComplianceData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TravelComplianceData }
     * 
     * 
     */
    public List<TravelComplianceData> getTravelComplianceData() {
        if (travelComplianceData == null) {
            travelComplianceData = new ArrayList<TravelComplianceData>();
        }
        return this.travelComplianceData;
    }

    /**
     * Specify desired optional bed types. Applicable for optional bed types:RollawayAdult,RollawayChild,or Crib if supported by the hotel supplier. Providers :1G/1V/1P/1J Gets the value of the hotelBedding property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hotelBedding property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHotelBedding().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HotelBedding }
     * 
     * 
     */
    public List<HotelBedding> getHotelBedding() {
        if (hotelBedding == null) {
            hotelBedding = new ArrayList<HotelBedding>();
        }
        return this.hotelBedding;
    }

    /**
     * Gets the value of the bookingConfirmation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBookingConfirmation() {
        return bookingConfirmation;
    }

    /**
     * Sets the value of the bookingConfirmation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBookingConfirmation(String value) {
        this.bookingConfirmation = value;
    }

    /**
     * Gets the value of the reservationLocatorCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReservationLocatorCode() {
        return reservationLocatorCode;
    }

    /**
     * Sets the value of the reservationLocatorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReservationLocatorCode(String value) {
        this.reservationLocatorCode = value;
    }

    /**
     * Gets the value of the bookingTravelerRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBookingTravelerRef() {
        return bookingTravelerRef;
    }

    /**
     * Sets the value of the bookingTravelerRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBookingTravelerRef(String value) {
        this.bookingTravelerRef = value;
    }

}
