
package com.travelport.schema.cruise_v50_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element ref="{http://www.travelport.com/schema/cruise_v50_0}Fare" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/cruise_v50_0}Charges" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/cruise_v50_0}Discount" maxOccurs="2" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/cruise_v50_0}Deposit" maxOccurs="2" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/cruise_v50_0}Balance" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/cruise_v50_0}Commission" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/cruise_v50_0}CruiseFees" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/cruise_v50_0}CruiseBookingTravelerRef" maxOccurs="999" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.travelport.com/schema/common_v50_0}attrPrices"/&gt;
 *       &lt;attGroup ref="{http://www.travelport.com/schema/common_v50_0}attrProviderSupplier"/&gt;
 *       &lt;attribute name="NetFare" type="{http://www.travelport.com/schema/common_v50_0}typeMoney" /&gt;
 *       &lt;attribute name="ReceivedAmount" type="{http://www.travelport.com/schema/common_v50_0}typeMoney" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "fare",
    "charges",
    "discount",
    "deposit",
    "balance",
    "commission",
    "cruiseFees",
    "cruiseBookingTravelerRef"
})
@XmlRootElement(name = "CruisePricingInfo")
public class CruisePricingInfo {

    @XmlElement(name = "Fare")
    protected Fare fare;
    @XmlElement(name = "Charges")
    protected Charges charges;
    @XmlElement(name = "Discount")
    protected List<Discount> discount;
    @XmlElement(name = "Deposit")
    protected List<Deposit> deposit;
    @XmlElement(name = "Balance")
    protected Balance balance;
    @XmlElement(name = "Commission")
    protected Commission commission;
    @XmlElement(name = "CruiseFees")
    protected CruiseFees cruiseFees;
    @XmlElement(name = "CruiseBookingTravelerRef")
    protected List<CruiseBookingTravelerRef> cruiseBookingTravelerRef;
    @XmlAttribute(name = "NetFare")
    protected String netFare;
    @XmlAttribute(name = "ReceivedAmount")
    protected String receivedAmount;
    @XmlAttribute(name = "TotalPrice")
    protected String totalPrice;
    @XmlAttribute(name = "BasePrice")
    protected String basePrice;
    @XmlAttribute(name = "ApproximateTotalPrice")
    protected String approximateTotalPrice;
    @XmlAttribute(name = "ApproximateBasePrice")
    protected String approximateBasePrice;
    @XmlAttribute(name = "EquivalentBasePrice")
    protected String equivalentBasePrice;
    @XmlAttribute(name = "Taxes")
    protected String taxes;
    @XmlAttribute(name = "Fees")
    protected String fees;
    @XmlAttribute(name = "Services")
    protected String services;
    @XmlAttribute(name = "ApproximateTaxes")
    protected String approximateTaxes;
    @XmlAttribute(name = "ApproximateFees")
    protected String approximateFees;
    @XmlAttribute(name = "ProviderCode")
    protected String providerCode;
    @XmlAttribute(name = "SupplierCode")
    protected String supplierCode;

    /**
     * Gets the value of the fare property.
     * 
     * @return
     *     possible object is
     *     {@link Fare }
     *     
     */
    public Fare getFare() {
        return fare;
    }

    /**
     * Sets the value of the fare property.
     * 
     * @param value
     *     allowed object is
     *     {@link Fare }
     *     
     */
    public void setFare(Fare value) {
        this.fare = value;
    }

    /**
     * Gets the value of the charges property.
     * 
     * @return
     *     possible object is
     *     {@link Charges }
     *     
     */
    public Charges getCharges() {
        return charges;
    }

    /**
     * Sets the value of the charges property.
     * 
     * @param value
     *     allowed object is
     *     {@link Charges }
     *     
     */
    public void setCharges(Charges value) {
        this.charges = value;
    }

    /**
     * Gets the value of the discount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the discount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDiscount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Discount }
     * 
     * 
     */
    public List<Discount> getDiscount() {
        if (discount == null) {
            discount = new ArrayList<Discount>();
        }
        return this.discount;
    }

    /**
     * Gets the value of the deposit property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the deposit property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDeposit().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Deposit }
     * 
     * 
     */
    public List<Deposit> getDeposit() {
        if (deposit == null) {
            deposit = new ArrayList<Deposit>();
        }
        return this.deposit;
    }

    /**
     * Gets the value of the balance property.
     * 
     * @return
     *     possible object is
     *     {@link Balance }
     *     
     */
    public Balance getBalance() {
        return balance;
    }

    /**
     * Sets the value of the balance property.
     * 
     * @param value
     *     allowed object is
     *     {@link Balance }
     *     
     */
    public void setBalance(Balance value) {
        this.balance = value;
    }

    /**
     * Gets the value of the commission property.
     * 
     * @return
     *     possible object is
     *     {@link Commission }
     *     
     */
    public Commission getCommission() {
        return commission;
    }

    /**
     * Sets the value of the commission property.
     * 
     * @param value
     *     allowed object is
     *     {@link Commission }
     *     
     */
    public void setCommission(Commission value) {
        this.commission = value;
    }

    /**
     * Gets the value of the cruiseFees property.
     * 
     * @return
     *     possible object is
     *     {@link CruiseFees }
     *     
     */
    public CruiseFees getCruiseFees() {
        return cruiseFees;
    }

    /**
     * Sets the value of the cruiseFees property.
     * 
     * @param value
     *     allowed object is
     *     {@link CruiseFees }
     *     
     */
    public void setCruiseFees(CruiseFees value) {
        this.cruiseFees = value;
    }

    /**
     * Gets the value of the cruiseBookingTravelerRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cruiseBookingTravelerRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCruiseBookingTravelerRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CruiseBookingTravelerRef }
     * 
     * 
     */
    public List<CruiseBookingTravelerRef> getCruiseBookingTravelerRef() {
        if (cruiseBookingTravelerRef == null) {
            cruiseBookingTravelerRef = new ArrayList<CruiseBookingTravelerRef>();
        }
        return this.cruiseBookingTravelerRef;
    }

    /**
     * Gets the value of the netFare property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNetFare() {
        return netFare;
    }

    /**
     * Sets the value of the netFare property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNetFare(String value) {
        this.netFare = value;
    }

    /**
     * Gets the value of the receivedAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceivedAmount() {
        return receivedAmount;
    }

    /**
     * Sets the value of the receivedAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceivedAmount(String value) {
        this.receivedAmount = value;
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
     * Gets the value of the basePrice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBasePrice() {
        return basePrice;
    }

    /**
     * Sets the value of the basePrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBasePrice(String value) {
        this.basePrice = value;
    }

    /**
     * Gets the value of the approximateTotalPrice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApproximateTotalPrice() {
        return approximateTotalPrice;
    }

    /**
     * Sets the value of the approximateTotalPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApproximateTotalPrice(String value) {
        this.approximateTotalPrice = value;
    }

    /**
     * Gets the value of the approximateBasePrice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApproximateBasePrice() {
        return approximateBasePrice;
    }

    /**
     * Sets the value of the approximateBasePrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApproximateBasePrice(String value) {
        this.approximateBasePrice = value;
    }

    /**
     * Gets the value of the equivalentBasePrice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEquivalentBasePrice() {
        return equivalentBasePrice;
    }

    /**
     * Sets the value of the equivalentBasePrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEquivalentBasePrice(String value) {
        this.equivalentBasePrice = value;
    }

    /**
     * Gets the value of the taxes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxes() {
        return taxes;
    }

    /**
     * Sets the value of the taxes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxes(String value) {
        this.taxes = value;
    }

    /**
     * Gets the value of the fees property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFees() {
        return fees;
    }

    /**
     * Sets the value of the fees property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFees(String value) {
        this.fees = value;
    }

    /**
     * Gets the value of the services property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServices() {
        return services;
    }

    /**
     * Sets the value of the services property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServices(String value) {
        this.services = value;
    }

    /**
     * Gets the value of the approximateTaxes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApproximateTaxes() {
        return approximateTaxes;
    }

    /**
     * Sets the value of the approximateTaxes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApproximateTaxes(String value) {
        this.approximateTaxes = value;
    }

    /**
     * Gets the value of the approximateFees property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApproximateFees() {
        return approximateFees;
    }

    /**
     * Sets the value of the approximateFees property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApproximateFees(String value) {
        this.approximateFees = value;
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

}
