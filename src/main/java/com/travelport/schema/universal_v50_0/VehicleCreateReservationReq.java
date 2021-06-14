
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
import com.travelport.schema.common_v50_0.PointOfSale;
import com.travelport.schema.common_v50_0.ReservationName;
import com.travelport.schema.common_v50_0.ReviewBooking;
import com.travelport.schema.common_v50_0.SpecialEquipment;
import com.travelport.schema.common_v50_0.ThirdPartyInformation;
import com.travelport.schema.vehicle_v50_0.AssociatedRemark;
import com.travelport.schema.vehicle_v50_0.CollectionAddress;
import com.travelport.schema.vehicle_v50_0.DeliveryAddress;
import com.travelport.schema.vehicle_v50_0.FlightArrivalInformation;
import com.travelport.schema.vehicle_v50_0.PaymentInformation;
import com.travelport.schema.vehicle_v50_0.Vehicle;
import com.travelport.schema.vehicle_v50_0.VehicleDateLocation;
import com.travelport.schema.vehicle_v50_0.VehicleSpecialRequest;


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
 *         &lt;choice&gt;
 *           &lt;sequence&gt;
 *             &lt;element ref="{http://www.travelport.com/schema/common_v50_0}Email" maxOccurs="999" minOccurs="0"/&gt;
 *             &lt;element ref="{http://www.travelport.com/schema/vehicle_v50_0}VehicleDateLocation"/&gt;
 *             &lt;element ref="{http://www.travelport.com/schema/vehicle_v50_0}Vehicle"/&gt;
 *             &lt;element ref="{http://www.travelport.com/schema/common_v50_0}SpecialEquipment" maxOccurs="6" minOccurs="0"/&gt;
 *             &lt;element ref="{http://www.travelport.com/schema/vehicle_v50_0}VehicleSpecialRequest" minOccurs="0"/&gt;
 *             &lt;element ref="{http://www.travelport.com/schema/vehicle_v50_0}PaymentInformation" minOccurs="0"/&gt;
 *           &lt;/sequence&gt;
 *         &lt;/choice&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/common_v50_0}PointOfSale" minOccurs="0"/&gt;
 *         &lt;choice&gt;
 *           &lt;sequence&gt;
 *             &lt;element ref="{http://www.travelport.com/schema/vehicle_v50_0}DeliveryAddress" minOccurs="0"/&gt;
 *             &lt;element ref="{http://www.travelport.com/schema/vehicle_v50_0}CollectionAddress" minOccurs="0"/&gt;
 *             &lt;element ref="{http://www.travelport.com/schema/vehicle_v50_0}FlightArrivalInformation" minOccurs="0"/&gt;
 *           &lt;/sequence&gt;
 *         &lt;/choice&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/common_v50_0}Guarantee" minOccurs="0"/&gt;
 *         &lt;choice&gt;
 *           &lt;element ref="{http://www.travelport.com/schema/vehicle_v50_0}AssociatedRemark" maxOccurs="999" minOccurs="0"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/common_v50_0}BookingSource" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/common_v50_0}ReservationName" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/common_v50_0}ThirdPartyInformation" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/common_v50_0}ActionStatus" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/common_v50_0}ReviewBooking" maxOccurs="999" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="MandatoryRateMatch" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
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
    "vehicleDateLocation",
    "vehicle",
    "specialEquipment",
    "vehicleSpecialRequest",
    "paymentInformation",
    "pointOfSale",
    "deliveryAddress",
    "collectionAddress",
    "flightArrivalInformation",
    "guarantee",
    "associatedRemark",
    "bookingSource",
    "reservationName",
    "thirdPartyInformation",
    "actionStatus",
    "reviewBooking"
})
@XmlRootElement(name = "VehicleCreateReservationReq")
public class VehicleCreateReservationReq
    extends BaseCreateWithFormOfPaymentReq
{

    @XmlElement(name = "Email", namespace = "http://www.travelport.com/schema/common_v50_0")
    protected List<Email> email;
    @XmlElement(name = "VehicleDateLocation", namespace = "http://www.travelport.com/schema/vehicle_v50_0")
    protected VehicleDateLocation vehicleDateLocation;
    @XmlElement(name = "Vehicle", namespace = "http://www.travelport.com/schema/vehicle_v50_0")
    protected Vehicle vehicle;
    @XmlElement(name = "SpecialEquipment", namespace = "http://www.travelport.com/schema/common_v50_0")
    protected List<SpecialEquipment> specialEquipment;
    @XmlElement(name = "VehicleSpecialRequest", namespace = "http://www.travelport.com/schema/vehicle_v50_0")
    protected VehicleSpecialRequest vehicleSpecialRequest;
    @XmlElement(name = "PaymentInformation", namespace = "http://www.travelport.com/schema/vehicle_v50_0")
    protected PaymentInformation paymentInformation;
    @XmlElement(name = "PointOfSale", namespace = "http://www.travelport.com/schema/common_v50_0")
    protected PointOfSale pointOfSale;
    @XmlElement(name = "DeliveryAddress", namespace = "http://www.travelport.com/schema/vehicle_v50_0")
    protected DeliveryAddress deliveryAddress;
    @XmlElement(name = "CollectionAddress", namespace = "http://www.travelport.com/schema/vehicle_v50_0")
    protected CollectionAddress collectionAddress;
    @XmlElement(name = "FlightArrivalInformation", namespace = "http://www.travelport.com/schema/vehicle_v50_0")
    protected FlightArrivalInformation flightArrivalInformation;
    @XmlElement(name = "Guarantee", namespace = "http://www.travelport.com/schema/common_v50_0")
    protected Guarantee guarantee;
    @XmlElement(name = "AssociatedRemark", namespace = "http://www.travelport.com/schema/vehicle_v50_0")
    protected List<AssociatedRemark> associatedRemark;
    @XmlElement(name = "BookingSource", namespace = "http://www.travelport.com/schema/common_v50_0")
    protected BookingSource bookingSource;
    @XmlElement(name = "ReservationName", namespace = "http://www.travelport.com/schema/common_v50_0")
    protected ReservationName reservationName;
    @XmlElement(name = "ThirdPartyInformation", namespace = "http://www.travelport.com/schema/common_v50_0")
    protected ThirdPartyInformation thirdPartyInformation;
    @XmlElement(name = "ActionStatus", namespace = "http://www.travelport.com/schema/common_v50_0")
    protected ActionStatus actionStatus;
    @XmlElement(name = "ReviewBooking", namespace = "http://www.travelport.com/schema/common_v50_0")
    protected List<ReviewBooking> reviewBooking;
    @XmlAttribute(name = "MandatoryRateMatch")
    protected Boolean mandatoryRateMatch;

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
     * Gets the value of the vehicleDateLocation property.
     * 
     * @return
     *     possible object is
     *     {@link VehicleDateLocation }
     *     
     */
    public VehicleDateLocation getVehicleDateLocation() {
        return vehicleDateLocation;
    }

    /**
     * Sets the value of the vehicleDateLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleDateLocation }
     *     
     */
    public void setVehicleDateLocation(VehicleDateLocation value) {
        this.vehicleDateLocation = value;
    }

    /**
     * Gets the value of the vehicle property.
     * 
     * @return
     *     possible object is
     *     {@link Vehicle }
     *     
     */
    public Vehicle getVehicle() {
        return vehicle;
    }

    /**
     * Sets the value of the vehicle property.
     * 
     * @param value
     *     allowed object is
     *     {@link Vehicle }
     *     
     */
    public void setVehicle(Vehicle value) {
        this.vehicle = value;
    }

    /**
     * Gets the value of the specialEquipment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the specialEquipment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpecialEquipment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SpecialEquipment }
     * 
     * 
     */
    public List<SpecialEquipment> getSpecialEquipment() {
        if (specialEquipment == null) {
            specialEquipment = new ArrayList<SpecialEquipment>();
        }
        return this.specialEquipment;
    }

    /**
     * Gets the value of the vehicleSpecialRequest property.
     * 
     * @return
     *     possible object is
     *     {@link VehicleSpecialRequest }
     *     
     */
    public VehicleSpecialRequest getVehicleSpecialRequest() {
        return vehicleSpecialRequest;
    }

    /**
     * Sets the value of the vehicleSpecialRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleSpecialRequest }
     *     
     */
    public void setVehicleSpecialRequest(VehicleSpecialRequest value) {
        this.vehicleSpecialRequest = value;
    }

    /**
     * Gets the value of the paymentInformation property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentInformation }
     *     
     */
    public PaymentInformation getPaymentInformation() {
        return paymentInformation;
    }

    /**
     * Sets the value of the paymentInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentInformation }
     *     
     */
    public void setPaymentInformation(PaymentInformation value) {
        this.paymentInformation = value;
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
     * An address to which a rental car should be delivered and a phone number associated with the address.
     * 
     * @return
     *     possible object is
     *     {@link DeliveryAddress }
     *     
     */
    public DeliveryAddress getDeliveryAddress() {
        return deliveryAddress;
    }

    /**
     * Sets the value of the deliveryAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveryAddress }
     *     
     */
    public void setDeliveryAddress(DeliveryAddress value) {
        this.deliveryAddress = value;
    }

    /**
     * An address from which a rental car should be picked up at the end of a rental period and a phone number associated with the address.
     * 
     * @return
     *     possible object is
     *     {@link CollectionAddress }
     *     
     */
    public CollectionAddress getCollectionAddress() {
        return collectionAddress;
    }

    /**
     * Sets the value of the collectionAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollectionAddress }
     *     
     */
    public void setCollectionAddress(CollectionAddress value) {
        this.collectionAddress = value;
    }

    /**
     * 
     *                                             The flight arrival information 
     *                                             (airline code and flight number) for the 
     *                                             airport/city at which the rental car will
     *                                             be picked up
     *                                         
     * 
     * @return
     *     possible object is
     *     {@link FlightArrivalInformation }
     *     
     */
    public FlightArrivalInformation getFlightArrivalInformation() {
        return flightArrivalInformation;
    }

    /**
     * Sets the value of the flightArrivalInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlightArrivalInformation }
     *     
     */
    public void setFlightArrivalInformation(FlightArrivalInformation value) {
        this.flightArrivalInformation = value;
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

}
