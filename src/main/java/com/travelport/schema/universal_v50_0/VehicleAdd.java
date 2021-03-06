
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
import com.travelport.schema.common_v50_0.DriversLicense;
import com.travelport.schema.common_v50_0.Guarantee;
import com.travelport.schema.common_v50_0.LoyaltyCard;
import com.travelport.schema.common_v50_0.SpecialEquipment;
import com.travelport.schema.common_v50_0.ThirdPartyInformation;
import com.travelport.schema.common_v50_0.TravelComplianceData;
import com.travelport.schema.vehicle_v50_0.AssociatedRemark;
import com.travelport.schema.vehicle_v50_0.CollectionAddress;
import com.travelport.schema.vehicle_v50_0.DeliveryAddress;
import com.travelport.schema.vehicle_v50_0.FlightArrivalInformation;
import com.travelport.schema.vehicle_v50_0.PaymentInformation;
import com.travelport.schema.vehicle_v50_0.VehicleSpecialRequest;


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
 *         &lt;element ref="{http://www.travelport.com/schema/common_v50_0}DriversLicense" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/vehicle_v50_0}VehicleSpecialRequest" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/common_v50_0}SpecialEquipment" maxOccurs="5" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/vehicle_v50_0}PaymentInformation" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/common_v50_0}Guarantee" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/common_v50_0}BookingSource" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/vehicle_v50_0}AssociatedRemark" maxOccurs="999" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/vehicle_v50_0}DeliveryAddress" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/vehicle_v50_0}CollectionAddress" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/common_v50_0}ThirdPartyInformation" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/common_v50_0}TravelComplianceData" maxOccurs="999" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/vehicle_v50_0}FlightArrivalInformation" minOccurs="0"/&gt;
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
    "driversLicense",
    "vehicleSpecialRequest",
    "specialEquipment",
    "paymentInformation",
    "guarantee",
    "bookingSource",
    "associatedRemark",
    "deliveryAddress",
    "collectionAddress",
    "thirdPartyInformation",
    "travelComplianceData",
    "flightArrivalInformation"
})
@XmlRootElement(name = "VehicleAdd")
public class VehicleAdd {

    @XmlElement(name = "LoyaltyCard", namespace = "http://www.travelport.com/schema/common_v50_0")
    protected List<LoyaltyCard> loyaltyCard;
    @XmlElement(name = "DriversLicense", namespace = "http://www.travelport.com/schema/common_v50_0")
    protected DriversLicense driversLicense;
    @XmlElement(name = "VehicleSpecialRequest", namespace = "http://www.travelport.com/schema/vehicle_v50_0")
    protected VehicleSpecialRequest vehicleSpecialRequest;
    @XmlElement(name = "SpecialEquipment", namespace = "http://www.travelport.com/schema/common_v50_0")
    protected List<SpecialEquipment> specialEquipment;
    @XmlElement(name = "PaymentInformation", namespace = "http://www.travelport.com/schema/vehicle_v50_0")
    protected PaymentInformation paymentInformation;
    @XmlElement(name = "Guarantee", namespace = "http://www.travelport.com/schema/common_v50_0")
    protected Guarantee guarantee;
    @XmlElement(name = "BookingSource", namespace = "http://www.travelport.com/schema/common_v50_0")
    protected BookingSource bookingSource;
    @XmlElement(name = "AssociatedRemark", namespace = "http://www.travelport.com/schema/vehicle_v50_0")
    protected List<AssociatedRemark> associatedRemark;
    @XmlElement(name = "DeliveryAddress", namespace = "http://www.travelport.com/schema/vehicle_v50_0")
    protected DeliveryAddress deliveryAddress;
    @XmlElement(name = "CollectionAddress", namespace = "http://www.travelport.com/schema/vehicle_v50_0")
    protected CollectionAddress collectionAddress;
    @XmlElement(name = "ThirdPartyInformation", namespace = "http://www.travelport.com/schema/common_v50_0")
    protected ThirdPartyInformation thirdPartyInformation;
    @XmlElement(name = "TravelComplianceData", namespace = "http://www.travelport.com/schema/common_v50_0")
    protected List<TravelComplianceData> travelComplianceData;
    @XmlElement(name = "FlightArrivalInformation", namespace = "http://www.travelport.com/schema/vehicle_v50_0")
    protected FlightArrivalInformation flightArrivalInformation;
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
     * Gets the value of the driversLicense property.
     * 
     * @return
     *     possible object is
     *     {@link DriversLicense }
     *     
     */
    public DriversLicense getDriversLicense() {
        return driversLicense;
    }

    /**
     * Sets the value of the driversLicense property.
     * 
     * @param value
     *     allowed object is
     *     {@link DriversLicense }
     *     
     */
    public void setDriversLicense(DriversLicense value) {
        this.driversLicense = value;
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
     * Gets the value of the deliveryAddress property.
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
     * Gets the value of the collectionAddress property.
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
     * The flight arrival information(airline code and flight number) for the airport/city at which the rental car will be picked up || Addition and Update in UR Modify is currently implemented only for Galileo(1G) and Apollo(1V).
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
