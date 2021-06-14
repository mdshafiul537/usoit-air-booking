
package com.travelport.schema.air_v50_0;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


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
 *         &lt;element name="DaysOfOperation" type="{http://www.travelport.com/schema/air_v50_0}typeDaysOfOperation" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/air_v50_0}Connection" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Key" use="required" type="{http://www.travelport.com/schema/common_v50_0}typeRef" /&gt;
 *       &lt;attribute name="VendorCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="FlightNumber" type="{http://www.travelport.com/schema/common_v50_0}typeFlightNumber" /&gt;
 *       &lt;attribute name="Origin" type="{http://www.travelport.com/schema/common_v50_0}typeAirport" /&gt;
 *       &lt;attribute name="Destination" type="{http://www.travelport.com/schema/common_v50_0}typeAirport" /&gt;
 *       &lt;attribute name="DepartureTime" type="{http://www.w3.org/2001/XMLSchema}time" /&gt;
 *       &lt;attribute name="ArrivalTime" type="{http://www.w3.org/2001/XMLSchema}time" /&gt;
 *       &lt;attribute name="StopCount" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *       &lt;attribute name="Equipment" type="{http://www.travelport.com/schema/air_v50_0}typeEquipment" /&gt;
 *       &lt;attribute name="ScheduleStartDate" type="{http://www.w3.org/2001/XMLSchema}date" /&gt;
 *       &lt;attribute name="ScheduleEndDate" type="{http://www.w3.org/2001/XMLSchema}date" /&gt;
 *       &lt;attribute name="DisplayOption" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="OnTimePerformance" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *       &lt;attribute name="DayChange" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *       &lt;attribute name="JourneyTime" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *       &lt;attribute name="FlightTime" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *       &lt;attribute name="StartTerminal" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="EndTerminal" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="FirstIntermediateStop" type="{http://www.travelport.com/schema/common_v50_0}typeIATACode" /&gt;
 *       &lt;attribute name="LastIntermediateStop" type="{http://www.travelport.com/schema/common_v50_0}typeIATACode" /&gt;
 *       &lt;attribute name="InsideAvailability"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;minLength value="1"/&gt;
 *             &lt;maxLength value="1"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="SecureSell"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;minLength value="0"/&gt;
 *             &lt;maxLength value="2"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="AvailabilitySource" type="{http://www.travelport.com/schema/air_v50_0}typeAvailabilitySource" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "daysOfOperation",
    "connection"
})
@XmlRootElement(name = "FlightTimeDetail")
public class FlightTimeDetail {

    @XmlElement(name = "DaysOfOperation")
    protected TypeDaysOfOperation daysOfOperation;
    @XmlElement(name = "Connection")
    protected Connection connection;
    @XmlAttribute(name = "Key", required = true)
    protected String key;
    @XmlAttribute(name = "VendorCode")
    protected String vendorCode;
    @XmlAttribute(name = "FlightNumber")
    protected String flightNumber;
    @XmlAttribute(name = "Origin")
    protected String origin;
    @XmlAttribute(name = "Destination")
    protected String destination;
    @XmlAttribute(name = "DepartureTime")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar departureTime;
    @XmlAttribute(name = "ArrivalTime")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar arrivalTime;
    @XmlAttribute(name = "StopCount")
    protected BigInteger stopCount;
    @XmlAttribute(name = "Equipment")
    protected String equipment;
    @XmlAttribute(name = "ScheduleStartDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar scheduleStartDate;
    @XmlAttribute(name = "ScheduleEndDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar scheduleEndDate;
    @XmlAttribute(name = "DisplayOption")
    protected Boolean displayOption;
    @XmlAttribute(name = "OnTimePerformance")
    protected BigInteger onTimePerformance;
    @XmlAttribute(name = "DayChange")
    protected BigInteger dayChange;
    @XmlAttribute(name = "JourneyTime")
    protected BigInteger journeyTime;
    @XmlAttribute(name = "FlightTime")
    protected BigInteger flightTime;
    @XmlAttribute(name = "StartTerminal")
    protected String startTerminal;
    @XmlAttribute(name = "EndTerminal")
    protected String endTerminal;
    @XmlAttribute(name = "FirstIntermediateStop")
    protected String firstIntermediateStop;
    @XmlAttribute(name = "LastIntermediateStop")
    protected String lastIntermediateStop;
    @XmlAttribute(name = "InsideAvailability")
    protected String insideAvailability;
    @XmlAttribute(name = "SecureSell")
    protected String secureSell;
    @XmlAttribute(name = "AvailabilitySource")
    protected String availabilitySource;

    /**
     * Gets the value of the daysOfOperation property.
     * 
     * @return
     *     possible object is
     *     {@link TypeDaysOfOperation }
     *     
     */
    public TypeDaysOfOperation getDaysOfOperation() {
        return daysOfOperation;
    }

    /**
     * Sets the value of the daysOfOperation property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeDaysOfOperation }
     *     
     */
    public void setDaysOfOperation(TypeDaysOfOperation value) {
        this.daysOfOperation = value;
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
     * Gets the value of the vendorCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVendorCode() {
        return vendorCode;
    }

    /**
     * Sets the value of the vendorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVendorCode(String value) {
        this.vendorCode = value;
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
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDepartureTime() {
        return departureTime;
    }

    /**
     * Sets the value of the departureTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDepartureTime(XMLGregorianCalendar value) {
        this.departureTime = value;
    }

    /**
     * Gets the value of the arrivalTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getArrivalTime() {
        return arrivalTime;
    }

    /**
     * Sets the value of the arrivalTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setArrivalTime(XMLGregorianCalendar value) {
        this.arrivalTime = value;
    }

    /**
     * Gets the value of the stopCount property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getStopCount() {
        return stopCount;
    }

    /**
     * Sets the value of the stopCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setStopCount(BigInteger value) {
        this.stopCount = value;
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
     * Gets the value of the scheduleStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getScheduleStartDate() {
        return scheduleStartDate;
    }

    /**
     * Sets the value of the scheduleStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setScheduleStartDate(XMLGregorianCalendar value) {
        this.scheduleStartDate = value;
    }

    /**
     * Gets the value of the scheduleEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getScheduleEndDate() {
        return scheduleEndDate;
    }

    /**
     * Sets the value of the scheduleEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setScheduleEndDate(XMLGregorianCalendar value) {
        this.scheduleEndDate = value;
    }

    /**
     * Gets the value of the displayOption property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDisplayOption() {
        return displayOption;
    }

    /**
     * Sets the value of the displayOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDisplayOption(Boolean value) {
        this.displayOption = value;
    }

    /**
     * Gets the value of the onTimePerformance property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOnTimePerformance() {
        return onTimePerformance;
    }

    /**
     * Sets the value of the onTimePerformance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOnTimePerformance(BigInteger value) {
        this.onTimePerformance = value;
    }

    /**
     * Gets the value of the dayChange property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDayChange() {
        return dayChange;
    }

    /**
     * Sets the value of the dayChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDayChange(BigInteger value) {
        this.dayChange = value;
    }

    /**
     * Gets the value of the journeyTime property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getJourneyTime() {
        return journeyTime;
    }

    /**
     * Sets the value of the journeyTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setJourneyTime(BigInteger value) {
        this.journeyTime = value;
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
     * Gets the value of the startTerminal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartTerminal() {
        return startTerminal;
    }

    /**
     * Sets the value of the startTerminal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartTerminal(String value) {
        this.startTerminal = value;
    }

    /**
     * Gets the value of the endTerminal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndTerminal() {
        return endTerminal;
    }

    /**
     * Sets the value of the endTerminal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndTerminal(String value) {
        this.endTerminal = value;
    }

    /**
     * Gets the value of the firstIntermediateStop property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstIntermediateStop() {
        return firstIntermediateStop;
    }

    /**
     * Sets the value of the firstIntermediateStop property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstIntermediateStop(String value) {
        this.firstIntermediateStop = value;
    }

    /**
     * Gets the value of the lastIntermediateStop property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastIntermediateStop() {
        return lastIntermediateStop;
    }

    /**
     * Sets the value of the lastIntermediateStop property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastIntermediateStop(String value) {
        this.lastIntermediateStop = value;
    }

    /**
     * Gets the value of the insideAvailability property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInsideAvailability() {
        return insideAvailability;
    }

    /**
     * Sets the value of the insideAvailability property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInsideAvailability(String value) {
        this.insideAvailability = value;
    }

    /**
     * Gets the value of the secureSell property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecureSell() {
        return secureSell;
    }

    /**
     * Sets the value of the secureSell property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecureSell(String value) {
        this.secureSell = value;
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

}
