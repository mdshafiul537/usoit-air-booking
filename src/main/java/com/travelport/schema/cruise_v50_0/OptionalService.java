
package com.travelport.schema.cruise_v50_0;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.travelport.schema.common_v50_0.BookingTravelerRef;


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
 *         &lt;element ref="{http://www.travelport.com/schema/cruise_v50_0}OptionJourneyDetails" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/common_v50_0}BookingTravelerRef" maxOccurs="5"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="FeatureType" use="required" type="{http://www.travelport.com/schema/common_v50_0}StringLength1" /&gt;
 *       &lt;attribute name="Status" type="{http://www.travelport.com/schema/common_v50_0}typeStatusCode" /&gt;
 *       &lt;attribute name="Quantity" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" /&gt;
 *       &lt;attribute name="ProviderDefinedType" type="{http://www.travelport.com/schema/common_v50_0}StringLength1to10" /&gt;
 *       &lt;attribute name="Description" type="{http://www.travelport.com/schema/common_v50_0}StringLength1to25" /&gt;
 *       &lt;attribute name="StartDate" type="{http://www.w3.org/2001/XMLSchema}date" /&gt;
 *       &lt;attribute name="EndDate" type="{http://www.w3.org/2001/XMLSchema}date" /&gt;
 *       &lt;attribute name="BookingDate" type="{http://www.w3.org/2001/XMLSchema}date" /&gt;
 *       &lt;attribute name="SetIdentifier" type="{http://www.travelport.com/schema/common_v50_0}StringLength1to10" /&gt;
 *       &lt;attribute name="SetName" type="{http://www.travelport.com/schema/common_v50_0}StringLength1to20" /&gt;
 *       &lt;attribute name="TotalPrice" type="{http://www.travelport.com/schema/common_v50_0}typeMoney" /&gt;
 *       &lt;attribute name="TransportIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="AirCityIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="PurchaseIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "optionJourneyDetails",
    "bookingTravelerRef"
})
@XmlRootElement(name = "OptionalService")
public class OptionalService {

    @XmlElement(name = "OptionJourneyDetails")
    protected OptionJourneyDetails optionJourneyDetails;
    @XmlElement(name = "BookingTravelerRef", namespace = "http://www.travelport.com/schema/common_v50_0", required = true)
    protected List<BookingTravelerRef> bookingTravelerRef;
    @XmlAttribute(name = "FeatureType", required = true)
    protected String featureType;
    @XmlAttribute(name = "Status")
    protected String status;
    @XmlAttribute(name = "Quantity")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger quantity;
    @XmlAttribute(name = "ProviderDefinedType")
    protected String providerDefinedType;
    @XmlAttribute(name = "Description")
    protected String description;
    @XmlAttribute(name = "StartDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar startDate;
    @XmlAttribute(name = "EndDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar endDate;
    @XmlAttribute(name = "BookingDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar bookingDate;
    @XmlAttribute(name = "SetIdentifier")
    protected String setIdentifier;
    @XmlAttribute(name = "SetName")
    protected String setName;
    @XmlAttribute(name = "TotalPrice")
    protected String totalPrice;
    @XmlAttribute(name = "TransportIndicator")
    protected Boolean transportIndicator;
    @XmlAttribute(name = "AirCityIndicator")
    protected Boolean airCityIndicator;
    @XmlAttribute(name = "PurchaseIndicator")
    protected Boolean purchaseIndicator;

    /**
     * Contains PickUp Return Details for that Cruise
     * 							Option Service.
     * 
     * @return
     *     possible object is
     *     {@link OptionJourneyDetails }
     *     
     */
    public OptionJourneyDetails getOptionJourneyDetails() {
        return optionJourneyDetails;
    }

    /**
     * Sets the value of the optionJourneyDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link OptionJourneyDetails }
     *     
     */
    public void setOptionJourneyDetails(OptionJourneyDetails value) {
        this.optionJourneyDetails = value;
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
     * Gets the value of the featureType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeatureType() {
        return featureType;
    }

    /**
     * Sets the value of the featureType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeatureType(String value) {
        this.featureType = value;
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
     * Gets the value of the quantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setQuantity(BigInteger value) {
        this.quantity = value;
    }

    /**
     * Gets the value of the providerDefinedType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProviderDefinedType() {
        return providerDefinedType;
    }

    /**
     * Sets the value of the providerDefinedType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProviderDefinedType(String value) {
        this.providerDefinedType = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartDate(XMLGregorianCalendar value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the endDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndDate(XMLGregorianCalendar value) {
        this.endDate = value;
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
     * Gets the value of the setIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSetIdentifier() {
        return setIdentifier;
    }

    /**
     * Sets the value of the setIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSetIdentifier(String value) {
        this.setIdentifier = value;
    }

    /**
     * Gets the value of the setName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSetName() {
        return setName;
    }

    /**
     * Sets the value of the setName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSetName(String value) {
        this.setName = value;
    }

    /**
     * Gets the value of the totalPrice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalPrice() {
        return totalPrice;
    }

    /**
     * Sets the value of the totalPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalPrice(String value) {
        this.totalPrice = value;
    }

    /**
     * Gets the value of the transportIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTransportIndicator() {
        return transportIndicator;
    }

    /**
     * Sets the value of the transportIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTransportIndicator(Boolean value) {
        this.transportIndicator = value;
    }

    /**
     * Gets the value of the airCityIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAirCityIndicator() {
        return airCityIndicator;
    }

    /**
     * Sets the value of the airCityIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAirCityIndicator(Boolean value) {
        this.airCityIndicator = value;
    }

    /**
     * Gets the value of the purchaseIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPurchaseIndicator() {
        return purchaseIndicator;
    }

    /**
     * Sets the value of the purchaseIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPurchaseIndicator(Boolean value) {
        this.purchaseIndicator = value;
    }

}
