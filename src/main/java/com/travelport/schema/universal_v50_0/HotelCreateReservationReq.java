
package com.travelport.schema.universal_v50_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.travelport.schema.common_v50_0.ActionStatus;
import com.travelport.schema.common_v50_0.BaseCreateWithFormOfPaymentReq;
import com.travelport.schema.common_v50_0.BookingSource;
import com.travelport.schema.common_v50_0.Email;
import com.travelport.schema.common_v50_0.Guarantee;
import com.travelport.schema.common_v50_0.HostToken;
import com.travelport.schema.common_v50_0.PointOfSale;
import com.travelport.schema.common_v50_0.ReservationName;
import com.travelport.schema.common_v50_0.ReviewBooking;
import com.travelport.schema.common_v50_0.ThirdPartyInformation;
import com.travelport.schema.hotel_v50_0.AssociatedRemark;
import com.travelport.schema.hotel_v50_0.GuestInformation;
import com.travelport.schema.hotel_v50_0.HotelBedding;
import com.travelport.schema.hotel_v50_0.HotelProperty;
import com.travelport.schema.hotel_v50_0.HotelRateDetail;
import com.travelport.schema.hotel_v50_0.HotelStay;
import com.travelport.schema.hotel_v50_0.PromotionCode;


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
 *         &lt;element ref="{http://www.travelport.com/schema/common_v50_0}Email" maxOccurs="999" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/hotel_v50_0}HotelRateDetail" maxOccurs="99"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/hotel_v50_0}HotelProperty"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/common_v50_0}ThirdPartyInformation" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/hotel_v50_0}HotelStay"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/common_v50_0}Guarantee" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/hotel_v50_0}HotelSpecialRequest" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/common_v50_0}PointOfSale" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/hotel_v50_0}PromotionCode" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/common_v50_0}BookingSource" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/hotel_v50_0}HotelBedding" maxOccurs="4" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/hotel_v50_0}GuestInformation" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/hotel_v50_0}AssociatedRemark" maxOccurs="9999" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/common_v50_0}ReservationName" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/common_v50_0}ActionStatus" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/common_v50_0}HostToken" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/common_v50_0}ReviewBooking" maxOccurs="9999" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/hotel_v50_0}HotelCommission" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="UserAcceptance" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="MandatoryRateMatch" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="StatusCode" type="{http://www.travelport.com/schema/common_v50_0}typeStatusCode" /&gt;
 *       &lt;attribute name="BookingConfirmation" type="{http://www.travelport.com/schema/hotel_v50_0}typeHotelConfirmationNumber" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "email",
    "hotelRateDetail",
    "hotelProperty",
    "thirdPartyInformation",
    "hotelStay",
    "guarantee",
    "hotelSpecialRequest",
    "pointOfSale",
    "promotionCode",
    "bookingSource",
    "hotelBedding",
    "guestInformation",
    "associatedRemark",
    "reservationName",
    "actionStatus",
    "hostToken",
    "reviewBooking",
    "hotelCommission"
})
@XmlRootElement(name = "HotelCreateReservationReq")
public class HotelCreateReservationReq
    extends BaseCreateWithFormOfPaymentReq
{

    @XmlElement(name = "Email", namespace = "http://www.travelport.com/schema/common_v50_0")
    protected List<Email> email;
    @XmlElement(name = "HotelRateDetail", namespace = "http://www.travelport.com/schema/hotel_v50_0", required = true)
    protected List<HotelRateDetail> hotelRateDetail;
    @XmlElement(name = "HotelProperty", namespace = "http://www.travelport.com/schema/hotel_v50_0", required = true)
    protected HotelProperty hotelProperty;
    @XmlElement(name = "ThirdPartyInformation", namespace = "http://www.travelport.com/schema/common_v50_0")
    protected ThirdPartyInformation thirdPartyInformation;
    @XmlElement(name = "HotelStay", namespace = "http://www.travelport.com/schema/hotel_v50_0", required = true)
    protected HotelStay hotelStay;
    @XmlElement(name = "Guarantee", namespace = "http://www.travelport.com/schema/common_v50_0")
    protected Guarantee guarantee;
    @XmlElement(name = "HotelSpecialRequest", namespace = "http://www.travelport.com/schema/hotel_v50_0")
    protected String hotelSpecialRequest;
    @XmlElement(name = "PointOfSale", namespace = "http://www.travelport.com/schema/common_v50_0")
    protected PointOfSale pointOfSale;
    @XmlElement(name = "PromotionCode", namespace = "http://www.travelport.com/schema/hotel_v50_0")
    protected PromotionCode promotionCode;
    @XmlElement(name = "BookingSource", namespace = "http://www.travelport.com/schema/common_v50_0")
    protected BookingSource bookingSource;
    @XmlElement(name = "HotelBedding", namespace = "http://www.travelport.com/schema/hotel_v50_0")
    protected List<HotelBedding> hotelBedding;
    @XmlElement(name = "GuestInformation", namespace = "http://www.travelport.com/schema/hotel_v50_0")
    protected GuestInformation guestInformation;
    @XmlElement(name = "AssociatedRemark", namespace = "http://www.travelport.com/schema/hotel_v50_0")
    protected List<AssociatedRemark> associatedRemark;
    @XmlElement(name = "ReservationName", namespace = "http://www.travelport.com/schema/common_v50_0")
    protected ReservationName reservationName;
    @XmlElement(name = "ActionStatus", namespace = "http://www.travelport.com/schema/common_v50_0")
    protected ActionStatus actionStatus;
    @XmlElement(name = "HostToken", namespace = "http://www.travelport.com/schema/common_v50_0")
    protected HostToken hostToken;
    @XmlElement(name = "ReviewBooking", namespace = "http://www.travelport.com/schema/common_v50_0")
    protected List<ReviewBooking> reviewBooking;
    @XmlElement(name = "HotelCommission", namespace = "http://www.travelport.com/schema/hotel_v50_0")
    protected String hotelCommission;
    @XmlAttribute(name = "UserAcceptance")
    protected Boolean userAcceptance;
    @XmlAttribute(name = "MandatoryRateMatch")
    protected Boolean mandatoryRateMatch;
    @XmlAttribute(name = "StatusCode")
    protected String statusCode;
    @XmlAttribute(name = "BookingConfirmation")
    protected String bookingConfirmation;

    /**
     * Gets the value of the email property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the email property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEmail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Email }
     * 
     * 
     */
    public List<Email> getEmail() {
        if (email == null) {
            email = new ArrayList<Email>();
        }
        return this.email;
    }

    /**
     * Gets the value of the hotelRateDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hotelRateDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHotelRateDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HotelRateDetail }
     * 
     * 
     */
    public List<HotelRateDetail> getHotelRateDetail() {
        if (hotelRateDetail == null) {
            hotelRateDetail = new ArrayList<HotelRateDetail>();
        }
        return this.hotelRateDetail;
    }

    /**
     * Gets the value of the hotelProperty property.
     * 
     * @return
     *     possible object is
     *     {@link HotelProperty }
     *     
     */
    public HotelProperty getHotelProperty() {
        return hotelProperty;
    }

    /**
     * Sets the value of the hotelProperty property.
     * 
     * @param value
     *     allowed object is
     *     {@link HotelProperty }
     *     
     */
    public void setHotelProperty(HotelProperty value) {
        this.hotelProperty = value;
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
     * Gets the value of the hotelStay property.
     * 
     * @return
     *     possible object is
     *     {@link HotelStay }
     *     
     */
    public HotelStay getHotelStay() {
        return hotelStay;
    }

    /**
     * Sets the value of the hotelStay property.
     * 
     * @param value
     *     allowed object is
     *     {@link HotelStay }
     *     
     */
    public void setHotelStay(HotelStay value) {
        this.hotelStay = value;
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
     * Gets the value of the pointOfSale property.
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
     * Used to specify promotional code include in the booking
     * 
     * @return
     *     possible object is
     *     {@link PromotionCode }
     *     
     */
    public PromotionCode getPromotionCode() {
        return promotionCode;
    }

    /**
     * Sets the value of the promotionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link PromotionCode }
     *     
     */
    public void setPromotionCode(PromotionCode value) {
        this.promotionCode = value;
    }

    /**
     * Specify alternate booking source
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
     * Gets the value of the hotelBedding property.
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
     * If specified then it will be used for GDS reservation otherwise first booking traveler will be used. 
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
     * Gets the value of the actionStatus property.
     * 
     * @return
     *     possible object is
     *     {@link ActionStatus }
     *     
     */
    public ActionStatus getActionStatus() {
        return actionStatus;
    }

    /**
     * Sets the value of the actionStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActionStatus }
     *     
     */
    public void setActionStatus(ActionStatus value) {
        this.actionStatus = value;
    }

    /**
     * Gets the value of the hostToken property.
     * 
     * @return
     *     possible object is
     *     {@link HostToken }
     *     
     */
    public HostToken getHostToken() {
        return hostToken;
    }

    /**
     * Sets the value of the hostToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostToken }
     *     
     */
    public void setHostToken(HostToken value) {
        this.hostToken = value;
    }

    /**
     * Review Booking or Queue Minders is to add the reminders in the Provider Reservation along with the date time and Queue details. On the date time defined in reminders, the message along with the PNR goes to the desired Queue. Gets the value of the reviewBooking property.
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
     * This element indicates hotel commission applied during hotel booking.  Provider supported 1P and 1J.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHotelCommission() {
        return hotelCommission;
    }

    /**
     * Sets the value of the hotelCommission property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHotelCommission(String value) {
        this.hotelCommission = value;
    }

    /**
     * Gets the value of the userAcceptance property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isUserAcceptance() {
        if (userAcceptance == null) {
            return false;
        } else {
            return userAcceptance;
        }
    }

    /**
     * Sets the value of the userAcceptance property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUserAcceptance(Boolean value) {
        this.userAcceptance = value;
    }

    /**
     * Gets the value of the mandatoryRateMatch property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isMandatoryRateMatch() {
        if (mandatoryRateMatch == null) {
            return false;
        } else {
            return mandatoryRateMatch;
        }
    }

    /**
     * Sets the value of the mandatoryRateMatch property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMandatoryRateMatch(Boolean value) {
        this.mandatoryRateMatch = value;
    }

    /**
     * Gets the value of the statusCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusCode() {
        return statusCode;
    }

    /**
     * Sets the value of the statusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusCode(String value) {
        this.statusCode = value;
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

}
