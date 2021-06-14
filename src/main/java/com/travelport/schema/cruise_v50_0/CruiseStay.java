
package com.travelport.schema.cruise_v50_0;

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
 *         &lt;element name="Package" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="Name" type="{http://www.travelport.com/schema/common_v50_0}StringLength1to30" /&gt;
 *                 &lt;attribute name="Identifier"&gt;
 *                   &lt;simpleType&gt;
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                       &lt;maxLength value="30"/&gt;
 *                     &lt;/restriction&gt;
 *                   &lt;/simpleType&gt;
 *                 &lt;/attribute&gt;
 *                 &lt;attribute name="PassengerCount" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *                 &lt;attribute name="PackageIdentifier" type="{http://www.travelport.com/schema/common_v50_0}StringLength1to14" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/cruise_v50_0}CabinInfo" minOccurs="0"/&gt;
 *         &lt;element name="DiningInfo" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="Seating" type="{http://www.travelport.com/schema/common_v50_0}StringLength1" /&gt;
 *                 &lt;attribute name="Status" type="{http://www.travelport.com/schema/common_v50_0}typeStatusCode" /&gt;
 *                 &lt;attribute name="TableSize" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="ShipName" type="{http://www.travelport.com/schema/common_v50_0}StringLength1to25" /&gt;
 *       &lt;attribute name="DurationOfStay" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *       &lt;attribute name="UnitOfStay" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="BookingDate" type="{http://www.w3.org/2001/XMLSchema}date" /&gt;
 *       &lt;attribute name="BookingAgent" type="{http://www.travelport.com/schema/common_v50_0}StringLength1to12" /&gt;
 *       &lt;attribute name="BookingCredit" type="{http://www.travelport.com/schema/common_v50_0}StringLength1to10" /&gt;
 *       &lt;attribute name="OtherPartyConfNbr" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *       &lt;attribute name="PassengerOrigin" type="{http://www.travelport.com/schema/common_v50_0}StringLength1to5" /&gt;
 *       &lt;attribute name="ConfirmationNumber" type="{http://www.travelport.com/schema/common_v50_0}StringLength1to16" /&gt;
 *       &lt;attribute name="LinkedConfNumber" type="{http://www.travelport.com/schema/common_v50_0}StringLength1to16" /&gt;
 *       &lt;attribute name="CancellationNumber" type="{http://www.travelport.com/schema/common_v50_0}StringLength1to16" /&gt;
 *       &lt;attribute name="CancellationDate" type="{http://www.w3.org/2001/XMLSchema}date" /&gt;
 *       &lt;attribute name="CancellationTime" type="{http://www.w3.org/2001/XMLSchema}time" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "_package",
    "cabinInfo",
    "diningInfo"
})
@XmlRootElement(name = "CruiseStay")
public class CruiseStay {

    @XmlElement(name = "Package")
    protected CruiseStay.Package _package;
    @XmlElement(name = "CabinInfo")
    protected CabinInfo cabinInfo;
    @XmlElement(name = "DiningInfo")
    protected CruiseStay.DiningInfo diningInfo;
    @XmlAttribute(name = "ShipName")
    protected String shipName;
    @XmlAttribute(name = "DurationOfStay")
    protected BigInteger durationOfStay;
    @XmlAttribute(name = "UnitOfStay")
    protected String unitOfStay;
    @XmlAttribute(name = "BookingDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar bookingDate;
    @XmlAttribute(name = "BookingAgent")
    protected String bookingAgent;
    @XmlAttribute(name = "BookingCredit")
    protected String bookingCredit;
    @XmlAttribute(name = "OtherPartyConfNbr")
    protected BigInteger otherPartyConfNbr;
    @XmlAttribute(name = "PassengerOrigin")
    protected String passengerOrigin;
    @XmlAttribute(name = "ConfirmationNumber")
    protected String confirmationNumber;
    @XmlAttribute(name = "LinkedConfNumber")
    protected String linkedConfNumber;
    @XmlAttribute(name = "CancellationNumber")
    protected String cancellationNumber;
    @XmlAttribute(name = "CancellationDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar cancellationDate;
    @XmlAttribute(name = "CancellationTime")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar cancellationTime;

    /**
     * Gets the value of the package property.
     * 
     * @return
     *     possible object is
     *     {@link CruiseStay.Package }
     *     
     */
    public CruiseStay.Package getPackage() {
        return _package;
    }

    /**
     * Sets the value of the package property.
     * 
     * @param value
     *     allowed object is
     *     {@link CruiseStay.Package }
     *     
     */
    public void setPackage(CruiseStay.Package value) {
        this._package = value;
    }

    /**
     * Gets the value of the cabinInfo property.
     * 
     * @return
     *     possible object is
     *     {@link CabinInfo }
     *     
     */
    public CabinInfo getCabinInfo() {
        return cabinInfo;
    }

    /**
     * Sets the value of the cabinInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CabinInfo }
     *     
     */
    public void setCabinInfo(CabinInfo value) {
        this.cabinInfo = value;
    }

    /**
     * Gets the value of the diningInfo property.
     * 
     * @return
     *     possible object is
     *     {@link CruiseStay.DiningInfo }
     *     
     */
    public CruiseStay.DiningInfo getDiningInfo() {
        return diningInfo;
    }

    /**
     * Sets the value of the diningInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CruiseStay.DiningInfo }
     *     
     */
    public void setDiningInfo(CruiseStay.DiningInfo value) {
        this.diningInfo = value;
    }

    /**
     * Gets the value of the shipName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipName() {
        return shipName;
    }

    /**
     * Sets the value of the shipName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipName(String value) {
        this.shipName = value;
    }

    /**
     * Gets the value of the durationOfStay property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDurationOfStay() {
        return durationOfStay;
    }

    /**
     * Sets the value of the durationOfStay property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDurationOfStay(BigInteger value) {
        this.durationOfStay = value;
    }

    /**
     * Gets the value of the unitOfStay property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitOfStay() {
        return unitOfStay;
    }

    /**
     * Sets the value of the unitOfStay property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitOfStay(String value) {
        this.unitOfStay = value;
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
     * Gets the value of the bookingAgent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBookingAgent() {
        return bookingAgent;
    }

    /**
     * Sets the value of the bookingAgent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBookingAgent(String value) {
        this.bookingAgent = value;
    }

    /**
     * Gets the value of the bookingCredit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBookingCredit() {
        return bookingCredit;
    }

    /**
     * Sets the value of the bookingCredit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBookingCredit(String value) {
        this.bookingCredit = value;
    }

    /**
     * Gets the value of the otherPartyConfNbr property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOtherPartyConfNbr() {
        return otherPartyConfNbr;
    }

    /**
     * Sets the value of the otherPartyConfNbr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOtherPartyConfNbr(BigInteger value) {
        this.otherPartyConfNbr = value;
    }

    /**
     * Gets the value of the passengerOrigin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassengerOrigin() {
        return passengerOrigin;
    }

    /**
     * Sets the value of the passengerOrigin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassengerOrigin(String value) {
        this.passengerOrigin = value;
    }

    /**
     * Gets the value of the confirmationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConfirmationNumber() {
        return confirmationNumber;
    }

    /**
     * Sets the value of the confirmationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConfirmationNumber(String value) {
        this.confirmationNumber = value;
    }

    /**
     * Gets the value of the linkedConfNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLinkedConfNumber() {
        return linkedConfNumber;
    }

    /**
     * Sets the value of the linkedConfNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLinkedConfNumber(String value) {
        this.linkedConfNumber = value;
    }

    /**
     * Gets the value of the cancellationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCancellationNumber() {
        return cancellationNumber;
    }

    /**
     * Sets the value of the cancellationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCancellationNumber(String value) {
        this.cancellationNumber = value;
    }

    /**
     * Gets the value of the cancellationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCancellationDate() {
        return cancellationDate;
    }

    /**
     * Sets the value of the cancellationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCancellationDate(XMLGregorianCalendar value) {
        this.cancellationDate = value;
    }

    /**
     * Gets the value of the cancellationTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCancellationTime() {
        return cancellationTime;
    }

    /**
     * Sets the value of the cancellationTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCancellationTime(XMLGregorianCalendar value) {
        this.cancellationTime = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;attribute name="Seating" type="{http://www.travelport.com/schema/common_v50_0}StringLength1" /&gt;
     *       &lt;attribute name="Status" type="{http://www.travelport.com/schema/common_v50_0}typeStatusCode" /&gt;
     *       &lt;attribute name="TableSize" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class DiningInfo {

        @XmlAttribute(name = "Seating")
        protected String seating;
        @XmlAttribute(name = "Status")
        protected String status;
        @XmlAttribute(name = "TableSize")
        protected BigInteger tableSize;

        /**
         * Gets the value of the seating property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSeating() {
            return seating;
        }

        /**
         * Sets the value of the seating property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSeating(String value) {
            this.seating = value;
        }

        /**
         * Gets the value of the status property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getStatus() {
            return status;
        }

        /**
         * Sets the value of the status property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setStatus(String value) {
            this.status = value;
        }

        /**
         * Gets the value of the tableSize property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getTableSize() {
            return tableSize;
        }

        /**
         * Sets the value of the tableSize property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setTableSize(BigInteger value) {
            this.tableSize = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;attribute name="Name" type="{http://www.travelport.com/schema/common_v50_0}StringLength1to30" /&gt;
     *       &lt;attribute name="Identifier"&gt;
     *         &lt;simpleType&gt;
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *             &lt;maxLength value="30"/&gt;
     *           &lt;/restriction&gt;
     *         &lt;/simpleType&gt;
     *       &lt;/attribute&gt;
     *       &lt;attribute name="PassengerCount" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
     *       &lt;attribute name="PackageIdentifier" type="{http://www.travelport.com/schema/common_v50_0}StringLength1to14" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Package {

        @XmlAttribute(name = "Name")
        protected String name;
        @XmlAttribute(name = "Identifier")
        protected String identifier;
        @XmlAttribute(name = "PassengerCount")
        protected BigInteger passengerCount;
        @XmlAttribute(name = "PackageIdentifier")
        protected String packageIdentifier;

        /**
         * Gets the value of the name property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getName() {
            return name;
        }

        /**
         * Sets the value of the name property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setName(String value) {
            this.name = value;
        }

        /**
         * Gets the value of the identifier property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIdentifier() {
            return identifier;
        }

        /**
         * Sets the value of the identifier property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIdentifier(String value) {
            this.identifier = value;
        }

        /**
         * Gets the value of the passengerCount property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getPassengerCount() {
            return passengerCount;
        }

        /**
         * Sets the value of the passengerCount property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setPassengerCount(BigInteger value) {
            this.passengerCount = value;
        }

        /**
         * Gets the value of the packageIdentifier property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPackageIdentifier() {
            return packageIdentifier;
        }

        /**
         * Sets the value of the packageIdentifier property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPackageIdentifier(String value) {
            this.packageIdentifier = value;
        }

    }

}
