
package com.travelport.schema.rail_v50_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.travelport.schema.common_v50_0.HostToken;
import com.travelport.schema.common_v50_0.TypeElementStatus;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/rail_v50_0}RailFareNoteRef" maxOccurs="999" minOccurs="0"/&gt;
 *         &lt;choice&gt;
 *           &lt;element ref="{http://www.travelport.com/schema/rail_v50_0}RailFareID" maxOccurs="999" minOccurs="0"/&gt;
 *           &lt;element ref="{http://www.travelport.com/schema/rail_v50_0}RailFareIDRef" maxOccurs="999" minOccurs="0"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/rail_v50_0}FareValidity" maxOccurs="999" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/common_v50_0}HostToken" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/rail_v50_0}FulFillmentType" maxOccurs="999" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/rail_v50_0}RailFareComponent" maxOccurs="99" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.travelport.com/schema/common_v50_0}attrElementKeyResults"/&gt;
 *       &lt;attribute name="Key" use="required" type="{http://www.travelport.com/schema/common_v50_0}typeRef" /&gt;
 *       &lt;attribute name="FareBasis" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="CabinClass" use="required" type="{http://www.travelport.com/schema/common_v50_0}typeRailCabin" /&gt;
 *       &lt;attribute name="PassengerTypeCode" type="{http://www.travelport.com/schema/common_v50_0}typePTC" /&gt;
 *       &lt;attribute name="Origin" type="{http://www.travelport.com/schema/common_v50_0}typeIATACode" /&gt;
 *       &lt;attribute name="Destination" type="{http://www.travelport.com/schema/common_v50_0}typeIATACode" /&gt;
 *       &lt;attribute name="EffectiveDate" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Amount" type="{http://www.travelport.com/schema/common_v50_0}typeMoney" /&gt;
 *       &lt;attribute name="RouteDescription" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="TicketTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="FareReference"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;minLength value="1"/&gt;
 *             &lt;maxLength value="32"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="CrossCityFare" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="OriginStationName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="DestinationStationName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="ReservationRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="JourneyDirection" type="{http://www.travelport.com/schema/rail_v50_0}typeJourneyDirection" /&gt;
 *       &lt;attribute name="RailLocOrigin" type="{http://www.travelport.com/schema/common_v50_0}typeRailLocationCode" /&gt;
 *       &lt;attribute name="RailLocDestination" type="{http://www.travelport.com/schema/common_v50_0}typeRailLocationCode" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "railFareNoteRef",
    "railFareID",
    "railFareIDRef",
    "fareValidity",
    "hostToken",
    "fulFillmentType",
    "railFareComponent"
})
@XmlRootElement(name = "RailFare")
public class RailFare {

    @XmlElement(name = "RailFareNoteRef")
    protected List<RailFareNoteRef> railFareNoteRef;
    @XmlElement(name = "RailFareID")
    protected List<RailFareID> railFareID;
    @XmlElement(name = "RailFareIDRef")
    protected List<RailFareIDRef> railFareIDRef;
    @XmlElement(name = "FareValidity")
    protected List<FareValidity> fareValidity;
    @XmlElement(name = "HostToken", namespace = "http://www.travelport.com/schema/common_v50_0")
    protected HostToken hostToken;
    @XmlElement(name = "FulFillmentType")
    protected List<String> fulFillmentType;
    @XmlElement(name = "RailFareComponent")
    protected List<RailFareComponent> railFareComponent;
    @XmlAttribute(name = "Key", required = true)
    protected String key;
    @XmlAttribute(name = "FareBasis")
    protected String fareBasis;
    @XmlAttribute(name = "CabinClass", required = true)
    protected String cabinClass;
    @XmlAttribute(name = "PassengerTypeCode")
    protected String passengerTypeCode;
    @XmlAttribute(name = "Origin")
    protected String origin;
    @XmlAttribute(name = "Destination")
    protected String destination;
    @XmlAttribute(name = "EffectiveDate", required = true)
    protected String effectiveDate;
    @XmlAttribute(name = "Amount")
    protected String amount;
    @XmlAttribute(name = "RouteDescription")
    protected String routeDescription;
    @XmlAttribute(name = "TicketTypeCode")
    protected String ticketTypeCode;
    @XmlAttribute(name = "FareReference")
    protected String fareReference;
    @XmlAttribute(name = "CrossCityFare")
    protected Boolean crossCityFare;
    @XmlAttribute(name = "OriginStationName")
    protected String originStationName;
    @XmlAttribute(name = "DestinationStationName")
    protected String destinationStationName;
    @XmlAttribute(name = "ReservationRequired")
    protected Boolean reservationRequired;
    @XmlAttribute(name = "JourneyDirection")
    protected TypeJourneyDirection journeyDirection;
    @XmlAttribute(name = "RailLocOrigin")
    protected String railLocOrigin;
    @XmlAttribute(name = "RailLocDestination")
    protected String railLocDestination;
    @XmlAttribute(name = "ElStat")
    protected TypeElementStatus elStat;
    @XmlAttribute(name = "KeyOverride")
    protected Boolean keyOverride;

    /**
     * Key reference to RailFareNote present in RailFareNotList Gets the value of the railFareNoteRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the railFareNoteRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRailFareNoteRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RailFareNoteRef }
     * 
     * 
     */
    public List<RailFareNoteRef> getRailFareNoteRef() {
        if (railFareNoteRef == null) {
            railFareNoteRef = new ArrayList<RailFareNoteRef>();
        }
        return this.railFareNoteRef;
    }

    /**
     * Gets the value of the railFareID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the railFareID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRailFareID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RailFareID }
     * 
     * 
     */
    public List<RailFareID> getRailFareID() {
        if (railFareID == null) {
            railFareID = new ArrayList<RailFareID>();
        }
        return this.railFareID;
    }

    /**
     * Gets the value of the railFareIDRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the railFareIDRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRailFareIDRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RailFareIDRef }
     * 
     * 
     */
    public List<RailFareIDRef> getRailFareIDRef() {
        if (railFareIDRef == null) {
            railFareIDRef = new ArrayList<RailFareIDRef>();
        }
        return this.railFareIDRef;
    }

    /**
     * Gets the value of the fareValidity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fareValidity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFareValidity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FareValidity }
     * 
     * 
     */
    public List<FareValidity> getFareValidity() {
        if (fareValidity == null) {
            fareValidity = new ArrayList<FareValidity>();
        }
        return this.fareValidity;
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
     * Gets the value of the fulFillmentType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fulFillmentType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFulFillmentType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getFulFillmentType() {
        if (fulFillmentType == null) {
            fulFillmentType = new ArrayList<String>();
        }
        return this.fulFillmentType;
    }

    /**
     * Gets the value of the railFareComponent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the railFareComponent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRailFareComponent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RailFareComponent }
     * 
     * 
     */
    public List<RailFareComponent> getRailFareComponent() {
        if (railFareComponent == null) {
            railFareComponent = new ArrayList<RailFareComponent>();
        }
        return this.railFareComponent;
    }

    /**
     * Gets the value of the key property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKey() {
        return key;
    }

    /**
     * Sets the value of the key property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKey(String value) {
        this.key = value;
    }

    /**
     * Gets the value of the fareBasis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFareBasis() {
        return fareBasis;
    }

    /**
     * Sets the value of the fareBasis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFareBasis(String value) {
        this.fareBasis = value;
    }

    /**
     * Gets the value of the cabinClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCabinClass() {
        return cabinClass;
    }

    /**
     * Sets the value of the cabinClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCabinClass(String value) {
        this.cabinClass = value;
    }

    /**
     * Gets the value of the passengerTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassengerTypeCode() {
        return passengerTypeCode;
    }

    /**
     * Sets the value of the passengerTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassengerTypeCode(String value) {
        this.passengerTypeCode = value;
    }

    /**
     * Gets the value of the origin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrigin() {
        return origin;
    }

    /**
     * Sets the value of the origin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrigin(String value) {
        this.origin = value;
    }

    /**
     * Gets the value of the destination property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestination() {
        return destination;
    }

    /**
     * Sets the value of the destination property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestination(String value) {
        this.destination = value;
    }

    /**
     * Gets the value of the effectiveDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEffectiveDate() {
        return effectiveDate;
    }

    /**
     * Sets the value of the effectiveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEffectiveDate(String value) {
        this.effectiveDate = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAmount(String value) {
        this.amount = value;
    }

    /**
     * Gets the value of the routeDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRouteDescription() {
        return routeDescription;
    }

    /**
     * Sets the value of the routeDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRouteDescription(String value) {
        this.routeDescription = value;
    }

    /**
     * Gets the value of the ticketTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTicketTypeCode() {
        return ticketTypeCode;
    }

    /**
     * Sets the value of the ticketTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTicketTypeCode(String value) {
        this.ticketTypeCode = value;
    }

    /**
     * Gets the value of the fareReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFareReference() {
        return fareReference;
    }

    /**
     * Sets the value of the fareReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFareReference(String value) {
        this.fareReference = value;
    }

    /**
     * Gets the value of the crossCityFare property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isCrossCityFare() {
        if (crossCityFare == null) {
            return false;
        } else {
            return crossCityFare;
        }
    }

    /**
     * Sets the value of the crossCityFare property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCrossCityFare(Boolean value) {
        this.crossCityFare = value;
    }

    /**
     * Gets the value of the originStationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginStationName() {
        return originStationName;
    }

    /**
     * Sets the value of the originStationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginStationName(String value) {
        this.originStationName = value;
    }

    /**
     * Gets the value of the destinationStationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinationStationName() {
        return destinationStationName;
    }

    /**
     * Sets the value of the destinationStationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinationStationName(String value) {
        this.destinationStationName = value;
    }

    /**
     * Gets the value of the reservationRequired property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReservationRequired() {
        return reservationRequired;
    }

    /**
     * Sets the value of the reservationRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReservationRequired(Boolean value) {
        this.reservationRequired = value;
    }

    /**
     * Gets the value of the journeyDirection property.
     * 
     * @return
     *     possible object is
     *     {@link TypeJourneyDirection }
     *     
     */
    public TypeJourneyDirection getJourneyDirection() {
        return journeyDirection;
    }

    /**
     * Sets the value of the journeyDirection property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeJourneyDirection }
     *     
     */
    public void setJourneyDirection(TypeJourneyDirection value) {
        this.journeyDirection = value;
    }

    /**
     * Gets the value of the railLocOrigin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRailLocOrigin() {
        return railLocOrigin;
    }

    /**
     * Sets the value of the railLocOrigin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRailLocOrigin(String value) {
        this.railLocOrigin = value;
    }

    /**
     * Gets the value of the railLocDestination property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRailLocDestination() {
        return railLocDestination;
    }

    /**
     * Sets the value of the railLocDestination property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRailLocDestination(String value) {
        this.railLocDestination = value;
    }

    /**
     * Gets the value of the elStat property.
     * 
     * @return
     *     possible object is
     *     {@link TypeElementStatus }
     *     
     */
    public TypeElementStatus getElStat() {
        return elStat;
    }

    /**
     * Sets the value of the elStat property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeElementStatus }
     *     
     */
    public void setElStat(TypeElementStatus value) {
        this.elStat = value;
    }

    /**
     * Gets the value of the keyOverride property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isKeyOverride() {
        return keyOverride;
    }

    /**
     * Sets the value of the keyOverride property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setKeyOverride(Boolean value) {
        this.keyOverride = value;
    }

}
