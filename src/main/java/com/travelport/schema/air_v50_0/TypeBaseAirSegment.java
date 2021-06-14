
package com.travelport.schema.air_v50_0;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.travelport.schema.common_v50_0.Segment;


/**
 * <p>Java class for typeBaseAirSegment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="typeBaseAirSegment"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.travelport.com/schema/common_v50_0}Segment"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/air_v50_0}SponsoredFltInfo" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/air_v50_0}CodeshareInfo" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/air_v50_0}AirAvailInfo" maxOccurs="999" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/air_v50_0}FlightDetails" maxOccurs="999" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/air_v50_0}FlightDetailsRef" maxOccurs="999" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/air_v50_0}AlternateLocationDistanceRef" maxOccurs="999" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/air_v50_0}Connection" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/common_v50_0}SellMessage" maxOccurs="999" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/air_v50_0}RailCoachDetails" maxOccurs="999" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.travelport.com/schema/air_v50_0}attrLinkInfo"/&gt;
 *       &lt;attGroup ref="{http://www.travelport.com/schema/common_v50_0}attrFlightTimes"/&gt;
 *       &lt;attGroup ref="{http://www.travelport.com/schema/common_v50_0}attrProviderSupplier"/&gt;
 *       &lt;attGroup ref="{http://www.travelport.com/schema/common_v50_0}attrOrigDestDepatureInfo"/&gt;
 *       &lt;attribute name="OpenSegment" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="Group" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="Carrier" type="{http://www.travelport.com/schema/common_v50_0}typeCarrier" /&gt;
 *       &lt;attribute name="CabinClass" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="FlightNumber" type="{http://www.travelport.com/schema/common_v50_0}typeFlightNumber" /&gt;
 *       &lt;attribute name="ClassOfService" type="{http://www.travelport.com/schema/common_v50_0}typeClassOfService" /&gt;
 *       &lt;attribute name="ETicketability" type="{http://www.travelport.com/schema/air_v50_0}typeEticketability" /&gt;
 *       &lt;attribute name="Equipment" type="{http://www.travelport.com/schema/air_v50_0}typeEquipment" /&gt;
 *       &lt;attribute name="MarriageGroup" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="NumberOfStops" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="Seamless" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="ChangeOfPlane" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="GuaranteedPaymentCarrier" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="HostTokenRef" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="ProviderReservationInfoRef" type="{http://www.travelport.com/schema/common_v50_0}typeRef" /&gt;
 *       &lt;attribute name="PassiveProviderReservationInfoRef" type="{http://www.travelport.com/schema/common_v50_0}typeRef" /&gt;
 *       &lt;attribute name="OptionalServicesIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="AvailabilitySource" type="{http://www.travelport.com/schema/air_v50_0}typeAvailabilitySource" /&gt;
 *       &lt;attribute name="APISRequirementsRef" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="BlackListed" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="OperationalStatus" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="NumberInParty"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}positiveInteger"&gt;
 *             &lt;minInclusive value="1"/&gt;
 *             &lt;maxInclusive value="99"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="RailCoachNumber"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;maxLength value="4"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="BookingDate" type="{http://www.w3.org/2001/XMLSchema}date" /&gt;
 *       &lt;attribute name="FlownSegment" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="ScheduleChange" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="BrandIndicator" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "typeBaseAirSegment", propOrder = {
    "sponsoredFltInfo",
    "codeshareInfo",
    "airAvailInfo",
    "flightDetails",
    "flightDetailsRef",
    "alternateLocationDistanceRef",
    "connection",
    "sellMessage",
    "railCoachDetails"
})
public class TypeBaseAirSegment
    extends Segment
{

    @XmlElement(name = "SponsoredFltInfo")
    protected SponsoredFltInfo sponsoredFltInfo;
    @XmlElement(name = "CodeshareInfo")
    protected CodeshareInfo codeshareInfo;
    @XmlElement(name = "AirAvailInfo")
    protected List<AirAvailInfo> airAvailInfo;
    @XmlElement(name = "FlightDetails")
    protected List<FlightDetails> flightDetails;
    @XmlElement(name = "FlightDetailsRef")
    protected List<FlightDetailsRef> flightDetailsRef;
    @XmlElement(name = "AlternateLocationDistanceRef")
    protected List<AlternateLocationDistanceRef> alternateLocationDistanceRef;
    @XmlElement(name = "Connection")
    protected Connection connection;
    @XmlElement(name = "SellMessage", namespace = "http://www.travelport.com/schema/common_v50_0")
    protected List<String> sellMessage;
    @XmlElement(name = "RailCoachDetails")
    protected List<RailCoachDetails> railCoachDetails;
    @XmlAttribute(name = "OpenSegment")
    protected Boolean openSegment;
    @XmlAttribute(name = "Group", required = true)
    protected int group;
    @XmlAttribute(name = "Carrier")
    protected String carrier;
    @XmlAttribute(name = "CabinClass")
    protected String cabinClass;
    @XmlAttribute(name = "FlightNumber")
    protected String flightNumber;
    @XmlAttribute(name = "ClassOfService")
    protected String classOfService;
    @XmlAttribute(name = "ETicketability")
    protected TypeEticketability eTicketability;
    @XmlAttribute(name = "Equipment")
    protected String equipment;
    @XmlAttribute(name = "MarriageGroup")
    protected Integer marriageGroup;
    @XmlAttribute(name = "NumberOfStops")
    protected Integer numberOfStops;
    @XmlAttribute(name = "Seamless")
    protected Boolean seamless;
    @XmlAttribute(name = "ChangeOfPlane")
    protected Boolean changeOfPlane;
    @XmlAttribute(name = "GuaranteedPaymentCarrier")
    protected String guaranteedPaymentCarrier;
    @XmlAttribute(name = "HostTokenRef")
    protected String hostTokenRef;
    @XmlAttribute(name = "ProviderReservationInfoRef")
    protected String providerReservationInfoRef;
    @XmlAttribute(name = "PassiveProviderReservationInfoRef")
    protected String passiveProviderReservationInfoRef;
    @XmlAttribute(name = "OptionalServicesIndicator")
    protected Boolean optionalServicesIndicator;
    @XmlAttribute(name = "AvailabilitySource")
    protected String availabilitySource;
    @XmlAttribute(name = "APISRequirementsRef")
    protected String apisRequirementsRef;
    @XmlAttribute(name = "BlackListed")
    protected Boolean blackListed;
    @XmlAttribute(name = "OperationalStatus")
    protected String operationalStatus;
    @XmlAttribute(name = "NumberInParty")
    protected Integer numberInParty;
    @XmlAttribute(name = "RailCoachNumber")
    protected String railCoachNumber;
    @XmlAttribute(name = "BookingDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar bookingDate;
    @XmlAttribute(name = "FlownSegment")
    protected Boolean flownSegment;
    @XmlAttribute(name = "ScheduleChange")
    protected Boolean scheduleChange;
    @XmlAttribute(name = "BrandIndicator")
    protected String brandIndicator;
    @XmlAttribute(name = "ParticipantLevel")
    protected String participantLevel;
    @XmlAttribute(name = "LinkAvailability")
    protected Boolean linkAvailability;
    @XmlAttribute(name = "PolledAvailabilityOption")
    protected String polledAvailabilityOption;
    @XmlAttribute(name = "AvailabilityDisplayType")
    protected String availabilityDisplayType;
    @XmlAttribute(name = "FlightTime")
    protected BigInteger flightTime;
    @XmlAttribute(name = "TravelTime")
    protected BigInteger travelTime;
    @XmlAttribute(name = "Distance")
    protected BigInteger distance;
    @XmlAttribute(name = "ProviderCode")
    protected String providerCode;
    @XmlAttribute(name = "SupplierCode")
    protected String supplierCode;
    @XmlAttribute(name = "Origin", required = true)
    protected String origin;
    @XmlAttribute(name = "Destination", required = true)
    protected String destination;
    @XmlAttribute(name = "DepartureTime")
    protected String departureTime;
    @XmlAttribute(name = "ArrivalTime")
    protected String arrivalTime;

    /**
     * Gets the value of the sponsoredFltInfo property.
     * 
     * @return
     *     possible object is
     *     {@link SponsoredFltInfo }
     *     
     */
    public SponsoredFltInfo getSponsoredFltInfo() {
        return sponsoredFltInfo;
    }

    /**
     * Sets the value of the sponsoredFltInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link SponsoredFltInfo }
     *     
     */
    public void setSponsoredFltInfo(SponsoredFltInfo value) {
        this.sponsoredFltInfo = value;
    }

    /**
     * Gets the value of the codeshareInfo property.
     * 
     * @return
     *     possible object is
     *     {@link CodeshareInfo }
     *     
     */
    public CodeshareInfo getCodeshareInfo() {
        return codeshareInfo;
    }

    /**
     * Sets the value of the codeshareInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeshareInfo }
     *     
     */
    public void setCodeshareInfo(CodeshareInfo value) {
        this.codeshareInfo = value;
    }

    /**
     * Gets the value of the airAvailInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the airAvailInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAirAvailInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AirAvailInfo }
     * 
     * 
     */
    public List<AirAvailInfo> getAirAvailInfo() {
        if (airAvailInfo == null) {
            airAvailInfo = new ArrayList<AirAvailInfo>();
        }
        return this.airAvailInfo;
    }

    /**
     * Gets the value of the flightDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the flightDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFlightDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FlightDetails }
     * 
     * 
     */
    public List<FlightDetails> getFlightDetails() {
        if (flightDetails == null) {
            flightDetails = new ArrayList<FlightDetails>();
        }
        return this.flightDetails;
    }

    /**
     * Gets the value of the flightDetailsRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the flightDetailsRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFlightDetailsRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FlightDetailsRef }
     * 
     * 
     */
    public List<FlightDetailsRef> getFlightDetailsRef() {
        if (flightDetailsRef == null) {
            flightDetailsRef = new ArrayList<FlightDetailsRef>();
        }
        return this.flightDetailsRef;
    }

    /**
     * Gets the value of the alternateLocationDistanceRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the alternateLocationDistanceRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAlternateLocationDistanceRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AlternateLocationDistanceRef }
     * 
     * 
     */
    public List<AlternateLocationDistanceRef> getAlternateLocationDistanceRef() {
        if (alternateLocationDistanceRef == null) {
            alternateLocationDistanceRef = new ArrayList<AlternateLocationDistanceRef>();
        }
        return this.alternateLocationDistanceRef;
    }

    /**
     * Gets the value of the connection property.
     * 
     * @return
     *     possible object is
     *     {@link Connection }
     *     
     */
    public Connection getConnection() {
        return connection;
    }

    /**
     * Sets the value of the connection property.
     * 
     * @param value
     *     allowed object is
     *     {@link Connection }
     *     
     */
    public void setConnection(Connection value) {
        this.connection = value;
    }

    /**
     * Gets the value of the sellMessage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sellMessage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSellMessage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSellMessage() {
        if (sellMessage == null) {
            sellMessage = new ArrayList<String>();
        }
        return this.sellMessage;
    }

    /**
     * Gets the value of the railCoachDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the railCoachDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRailCoachDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RailCoachDetails }
     * 
     * 
     */
    public List<RailCoachDetails> getRailCoachDetails() {
        if (railCoachDetails == null) {
            railCoachDetails = new ArrayList<RailCoachDetails>();
        }
        return this.railCoachDetails;
    }

    /**
     * Gets the value of the openSegment property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOpenSegment() {
        return openSegment;
    }

    /**
     * Sets the value of the openSegment property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOpenSegment(Boolean value) {
        this.openSegment = value;
    }

    /**
     * Gets the value of the group property.
     * 
     */
    public int getGroup() {
        return group;
    }

    /**
     * Sets the value of the group property.
     * 
     */
    public void setGroup(int value) {
        this.group = value;
    }

    /**
     * Gets the value of the carrier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarrier() {
        return carrier;
    }

    /**
     * Sets the value of the carrier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarrier(String value) {
        this.carrier = value;
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
     * Gets the value of the flightNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlightNumber() {
        return flightNumber;
    }

    /**
     * Sets the value of the flightNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlightNumber(String value) {
        this.flightNumber = value;
    }

    /**
     * Gets the value of the classOfService property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClassOfService() {
        return classOfService;
    }

    /**
     * Sets the value of the classOfService property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClassOfService(String value) {
        this.classOfService = value;
    }

    /**
     * Gets the value of the eTicketability property.
     * 
     * @return
     *     possible object is
     *     {@link TypeEticketability }
     *     
     */
    public TypeEticketability getETicketability() {
        return eTicketability;
    }

    /**
     * Sets the value of the eTicketability property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeEticketability }
     *     
     */
    public void setETicketability(TypeEticketability value) {
        this.eTicketability = value;
    }

    /**
     * Gets the value of the equipment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEquipment() {
        return equipment;
    }

    /**
     * Sets the value of the equipment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEquipment(String value) {
        this.equipment = value;
    }

    /**
     * Gets the value of the marriageGroup property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMarriageGroup() {
        return marriageGroup;
    }

    /**
     * Sets the value of the marriageGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMarriageGroup(Integer value) {
        this.marriageGroup = value;
    }

    /**
     * Gets the value of the numberOfStops property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberOfStops() {
        return numberOfStops;
    }

    /**
     * Sets the value of the numberOfStops property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberOfStops(Integer value) {
        this.numberOfStops = value;
    }

    /**
     * Gets the value of the seamless property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSeamless() {
        return seamless;
    }

    /**
     * Sets the value of the seamless property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSeamless(Boolean value) {
        this.seamless = value;
    }

    /**
     * Gets the value of the changeOfPlane property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isChangeOfPlane() {
        if (changeOfPlane == null) {
            return false;
        } else {
            return changeOfPlane;
        }
    }

    /**
     * Sets the value of the changeOfPlane property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setChangeOfPlane(Boolean value) {
        this.changeOfPlane = value;
    }

    /**
     * Gets the value of the guaranteedPaymentCarrier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGuaranteedPaymentCarrier() {
        return guaranteedPaymentCarrier;
    }

    /**
     * Sets the value of the guaranteedPaymentCarrier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGuaranteedPaymentCarrier(String value) {
        this.guaranteedPaymentCarrier = value;
    }

    /**
     * Gets the value of the hostTokenRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHostTokenRef() {
        return hostTokenRef;
    }

    /**
     * Sets the value of the hostTokenRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHostTokenRef(String value) {
        this.hostTokenRef = value;
    }

    /**
     * Gets the value of the providerReservationInfoRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProviderReservationInfoRef() {
        return providerReservationInfoRef;
    }

    /**
     * Sets the value of the providerReservationInfoRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProviderReservationInfoRef(String value) {
        this.providerReservationInfoRef = value;
    }

    /**
     * Gets the value of the passiveProviderReservationInfoRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassiveProviderReservationInfoRef() {
        return passiveProviderReservationInfoRef;
    }

    /**
     * Sets the value of the passiveProviderReservationInfoRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassiveProviderReservationInfoRef(String value) {
        this.passiveProviderReservationInfoRef = value;
    }

    /**
     * Gets the value of the optionalServicesIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOptionalServicesIndicator() {
        return optionalServicesIndicator;
    }

    /**
     * Sets the value of the optionalServicesIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOptionalServicesIndicator(Boolean value) {
        this.optionalServicesIndicator = value;
    }

    /**
     * Gets the value of the availabilitySource property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAvailabilitySource() {
        return availabilitySource;
    }

    /**
     * Sets the value of the availabilitySource property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAvailabilitySource(String value) {
        this.availabilitySource = value;
    }

    /**
     * Gets the value of the apisRequirementsRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPISRequirementsRef() {
        return apisRequirementsRef;
    }

    /**
     * Sets the value of the apisRequirementsRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPISRequirementsRef(String value) {
        this.apisRequirementsRef = value;
    }

    /**
     * Gets the value of the blackListed property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBlackListed() {
        return blackListed;
    }

    /**
     * Sets the value of the blackListed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBlackListed(Boolean value) {
        this.blackListed = value;
    }

    /**
     * Gets the value of the operationalStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperationalStatus() {
        return operationalStatus;
    }

    /**
     * Sets the value of the operationalStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperationalStatus(String value) {
        this.operationalStatus = value;
    }

    /**
     * Gets the value of the numberInParty property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberInParty() {
        return numberInParty;
    }

    /**
     * Sets the value of the numberInParty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberInParty(Integer value) {
        this.numberInParty = value;
    }

    /**
     * Gets the value of the railCoachNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRailCoachNumber() {
        return railCoachNumber;
    }

    /**
     * Sets the value of the railCoachNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRailCoachNumber(String value) {
        this.railCoachNumber = value;
    }

    /**
     * Gets the value of the bookingDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBookingDate() {
        return bookingDate;
    }

    /**
     * Sets the value of the bookingDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBookingDate(XMLGregorianCalendar value) {
        this.bookingDate = value;
    }

    /**
     * Gets the value of the flownSegment property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isFlownSegment() {
        if (flownSegment == null) {
            return false;
        } else {
            return flownSegment;
        }
    }

    /**
     * Sets the value of the flownSegment property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFlownSegment(Boolean value) {
        this.flownSegment = value;
    }

    /**
     * Gets the value of the scheduleChange property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isScheduleChange() {
        if (scheduleChange == null) {
            return false;
        } else {
            return scheduleChange;
        }
    }

    /**
     * Sets the value of the scheduleChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setScheduleChange(Boolean value) {
        this.scheduleChange = value;
    }

    /**
     * Gets the value of the brandIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrandIndicator() {
        return brandIndicator;
    }

    /**
     * Sets the value of the brandIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrandIndicator(String value) {
        this.brandIndicator = value;
    }

    /**
     * Gets the value of the participantLevel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParticipantLevel() {
        return participantLevel;
    }

    /**
     * Sets the value of the participantLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParticipantLevel(String value) {
        this.participantLevel = value;
    }

    /**
     * Gets the value of the linkAvailability property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLinkAvailability() {
        return linkAvailability;
    }

    /**
     * Sets the value of the linkAvailability property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLinkAvailability(Boolean value) {
        this.linkAvailability = value;
    }

    /**
     * Gets the value of the polledAvailabilityOption property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPolledAvailabilityOption() {
        return polledAvailabilityOption;
    }

    /**
     * Sets the value of the polledAvailabilityOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPolledAvailabilityOption(String value) {
        this.polledAvailabilityOption = value;
    }

    /**
     * Gets the value of the availabilityDisplayType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAvailabilityDisplayType() {
        return availabilityDisplayType;
    }

    /**
     * Sets the value of the availabilityDisplayType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAvailabilityDisplayType(String value) {
        this.availabilityDisplayType = value;
    }

    /**
     * Gets the value of the flightTime property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFlightTime() {
        return flightTime;
    }

    /**
     * Sets the value of the flightTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFlightTime(BigInteger value) {
        this.flightTime = value;
    }

    /**
     * Gets the value of the travelTime property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTravelTime() {
        return travelTime;
    }

    /**
     * Sets the value of the travelTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTravelTime(BigInteger value) {
        this.travelTime = value;
    }

    /**
     * Gets the value of the distance property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDistance() {
        return distance;
    }

    /**
     * Sets the value of the distance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDistance(BigInteger value) {
        this.distance = value;
    }

    /**
     * Gets the value of the providerCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProviderCode() {
        return providerCode;
    }

    /**
     * Sets the value of the providerCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProviderCode(String value) {
        this.providerCode = value;
    }

    /**
     * Gets the value of the supplierCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupplierCode() {
        return supplierCode;
    }

    /**
     * Sets the value of the supplierCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupplierCode(String value) {
        this.supplierCode = value;
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
     * Gets the value of the departureTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepartureTime() {
        return departureTime;
    }

    /**
     * Sets the value of the departureTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepartureTime(String value) {
        this.departureTime = value;
    }

    /**
     * Gets the value of the arrivalTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArrivalTime() {
        return arrivalTime;
    }

    /**
     * Sets the value of the arrivalTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArrivalTime(String value) {
        this.arrivalTime = value;
    }

}
