
package com.travelport.schema.universal_v50_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.travelport.schema.common_v50_0.BaseReq;


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
 *         &lt;element ref="{http://www.travelport.com/schema/universal_v50_0}SavedTripSearchModifiers" minOccurs="0"/&gt;
 *         &lt;group ref="{http://www.travelport.com/schema/universal_v50_0}SearchCriteriaGroup"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="RecordStatus" type="{http://www.travelport.com/schema/universal_v50_0}typeSavedTripRecordStatus" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "savedTripSearchModifiers",
    "travelerCriteria",
    "searchAgent",
    "airReservationCriteria",
    "hotelReservationCriteria",
    "vehicleReservationCriteria",
    "railReservationCriteria"
})
@XmlRootElement(name = "SavedTripSearchReq")
public class SavedTripSearchReq
    extends BaseReq
{

    @XmlElement(name = "SavedTripSearchModifiers")
    protected SavedTripSearchModifiers savedTripSearchModifiers;
    @XmlElement(name = "TravelerCriteria")
    protected TravelerCriteria travelerCriteria;
    @XmlElement(name = "SearchAgent")
    protected SearchAgent searchAgent;
    @XmlElement(name = "AirReservationCriteria")
    protected AirReservationCriteria airReservationCriteria;
    @XmlElement(name = "HotelReservationCriteria")
    protected HotelReservationCriteria hotelReservationCriteria;
    @XmlElement(name = "VehicleReservationCriteria")
    protected VehicleReservationCriteria vehicleReservationCriteria;
    @XmlElement(name = "RailReservationCriteria")
    protected RailReservationCriteria railReservationCriteria;
    @XmlAttribute(name = "RecordStatus")
    protected TypeSavedTripRecordStatus recordStatus;

    /**
     * Gets the value of the savedTripSearchModifiers property.
     * 
     * @return
     *     possible object is
     *     {@link SavedTripSearchModifiers }
     *     
     */
    public SavedTripSearchModifiers getSavedTripSearchModifiers() {
        return savedTripSearchModifiers;
    }

    /**
     * Sets the value of the savedTripSearchModifiers property.
     * 
     * @param value
     *     allowed object is
     *     {@link SavedTripSearchModifiers }
     *     
     */
    public void setSavedTripSearchModifiers(SavedTripSearchModifiers value) {
        this.savedTripSearchModifiers = value;
    }

    /**
     * Gets the value of the travelerCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link TravelerCriteria }
     *     
     */
    public TravelerCriteria getTravelerCriteria() {
        return travelerCriteria;
    }

    /**
     * Sets the value of the travelerCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link TravelerCriteria }
     *     
     */
    public void setTravelerCriteria(TravelerCriteria value) {
        this.travelerCriteria = value;
    }

    /**
     * Gets the value of the searchAgent property.
     * 
     * @return
     *     possible object is
     *     {@link SearchAgent }
     *     
     */
    public SearchAgent getSearchAgent() {
        return searchAgent;
    }

    /**
     * Sets the value of the searchAgent property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchAgent }
     *     
     */
    public void setSearchAgent(SearchAgent value) {
        this.searchAgent = value;
    }

    /**
     * Gets the value of the airReservationCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link AirReservationCriteria }
     *     
     */
    public AirReservationCriteria getAirReservationCriteria() {
        return airReservationCriteria;
    }

    /**
     * Sets the value of the airReservationCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirReservationCriteria }
     *     
     */
    public void setAirReservationCriteria(AirReservationCriteria value) {
        this.airReservationCriteria = value;
    }

    /**
     * Gets the value of the hotelReservationCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link HotelReservationCriteria }
     *     
     */
    public HotelReservationCriteria getHotelReservationCriteria() {
        return hotelReservationCriteria;
    }

    /**
     * Sets the value of the hotelReservationCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link HotelReservationCriteria }
     *     
     */
    public void setHotelReservationCriteria(HotelReservationCriteria value) {
        this.hotelReservationCriteria = value;
    }

    /**
     * Gets the value of the vehicleReservationCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link VehicleReservationCriteria }
     *     
     */
    public VehicleReservationCriteria getVehicleReservationCriteria() {
        return vehicleReservationCriteria;
    }

    /**
     * Sets the value of the vehicleReservationCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleReservationCriteria }
     *     
     */
    public void setVehicleReservationCriteria(VehicleReservationCriteria value) {
        this.vehicleReservationCriteria = value;
    }

    /**
     * Gets the value of the railReservationCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link RailReservationCriteria }
     *     
     */
    public RailReservationCriteria getRailReservationCriteria() {
        return railReservationCriteria;
    }

    /**
     * Sets the value of the railReservationCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link RailReservationCriteria }
     *     
     */
    public void setRailReservationCriteria(RailReservationCriteria value) {
        this.railReservationCriteria = value;
    }

    /**
     * Gets the value of the recordStatus property.
     * 
     * @return
     *     possible object is
     *     {@link TypeSavedTripRecordStatus }
     *     
     */
    public TypeSavedTripRecordStatus getRecordStatus() {
        return recordStatus;
    }

    /**
     * Sets the value of the recordStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeSavedTripRecordStatus }
     *     
     */
    public void setRecordStatus(TypeSavedTripRecordStatus value) {
        this.recordStatus = value;
    }

}
