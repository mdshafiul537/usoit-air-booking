
package com.travelport.schema.common_v50_0;

import java.math.BigInteger;
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
 *         &lt;element name="TotalPenaltyTaxInfo" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="PenaltyTaxInfo" type="{http://www.travelport.com/schema/common_v50_0}typeTax" maxOccurs="999" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="TotalPenaltyTax" type="{http://www.travelport.com/schema/common_v50_0}typeMoney" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PaidTax" type="{http://www.travelport.com/schema/common_v50_0}typeTax" maxOccurs="999" minOccurs="0"/&gt;
 *         &lt;element name="TicketFeeInfo" maxOccurs="999" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="Base" type="{http://www.travelport.com/schema/common_v50_0}typeMoney" /&gt;
 *                 &lt;attribute name="Tax" type="{http://www.travelport.com/schema/common_v50_0}typeMoney" /&gt;
 *                 &lt;attribute name="Total" type="{http://www.travelport.com/schema/common_v50_0}typeMoney" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Reason" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="999" minOccurs="0"/&gt;
 *         &lt;element name="FeeInfo" type="{http://www.travelport.com/schema/common_v50_0}typeFeeInfo" maxOccurs="999" minOccurs="0"/&gt;
 *         &lt;element name="TaxInfo" type="{http://www.travelport.com/schema/common_v50_0}typeTaxInfo" maxOccurs="999" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="ExchangeAmount" use="required" type="{http://www.travelport.com/schema/common_v50_0}typeMoney" /&gt;
 *       &lt;attribute name="BaseFare" type="{http://www.travelport.com/schema/common_v50_0}typeMoney" /&gt;
 *       &lt;attribute name="EquivalentBaseFare" type="{http://www.travelport.com/schema/common_v50_0}typeMoney" /&gt;
 *       &lt;attribute name="Taxes" type="{http://www.travelport.com/schema/common_v50_0}typeMoney" /&gt;
 *       &lt;attribute name="ChangeFee" type="{http://www.travelport.com/schema/common_v50_0}typeMoney" /&gt;
 *       &lt;attribute name="ForfeitAmount" type="{http://www.travelport.com/schema/common_v50_0}typeMoney" /&gt;
 *       &lt;attribute name="Refundable" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="Exchangeable" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="FirstClassUpgrade" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="TicketByDate" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="PricingTag" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="EquivalentChangeFee" type="{http://www.travelport.com/schema/common_v50_0}typeMoney" /&gt;
 *       &lt;attribute name="EquivalentExchangeAmount" type="{http://www.travelport.com/schema/common_v50_0}typeMoney" /&gt;
 *       &lt;attribute name="AddCollection" type="{http://www.travelport.com/schema/common_v50_0}typeMoney" /&gt;
 *       &lt;attribute name="ResidualValue" type="{http://www.travelport.com/schema/common_v50_0}typeMoney" /&gt;
 *       &lt;attribute name="TotalResidualValue" type="{http://www.travelport.com/schema/common_v50_0}typeMoney" /&gt;
 *       &lt;attribute name="OriginalFlightValue" type="{http://www.travelport.com/schema/common_v50_0}typeMoney" /&gt;
 *       &lt;attribute name="FlownSegmentValue" type="{http://www.travelport.com/schema/common_v50_0}typeMoney" /&gt;
 *       &lt;attribute name="BulkTicketAdvisory" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="FarePull" type="{http://www.travelport.com/schema/common_v50_0}typeFarePull" /&gt;
 *       &lt;attribute name="PassengerTypeCode" type="{http://www.travelport.com/schema/common_v50_0}typePTC" /&gt;
 *       &lt;attribute name="PassengerCount" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *       &lt;attribute name="FormOfRefund" type="{http://www.travelport.com/schema/common_v50_0}typeFormOfRefund" /&gt;
 *       &lt;attribute name="Refund" type="{http://www.travelport.com/schema/common_v50_0}typeMoney" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "totalPenaltyTaxInfo",
    "paidTax",
    "ticketFeeInfo",
    "reason",
    "feeInfo",
    "taxInfo"
})
@XmlRootElement(name = "AirExchangeInfo")
public class AirExchangeInfo {

    @XmlElement(name = "TotalPenaltyTaxInfo")
    protected AirExchangeInfo.TotalPenaltyTaxInfo totalPenaltyTaxInfo;
    @XmlElement(name = "PaidTax")
    protected List<TypeTax> paidTax;
    @XmlElement(name = "TicketFeeInfo")
    protected List<AirExchangeInfo.TicketFeeInfo> ticketFeeInfo;
    @XmlElement(name = "Reason")
    protected List<String> reason;
    @XmlElement(name = "FeeInfo")
    protected List<TypeFeeInfo> feeInfo;
    @XmlElement(name = "TaxInfo")
    protected List<TypeTaxInfo> taxInfo;
    @XmlAttribute(name = "ExchangeAmount", required = true)
    protected String exchangeAmount;
    @XmlAttribute(name = "BaseFare")
    protected String baseFare;
    @XmlAttribute(name = "EquivalentBaseFare")
    protected String equivalentBaseFare;
    @XmlAttribute(name = "Taxes")
    protected String taxes;
    @XmlAttribute(name = "ChangeFee")
    protected String changeFee;
    @XmlAttribute(name = "ForfeitAmount")
    protected String forfeitAmount;
    @XmlAttribute(name = "Refundable")
    protected Boolean refundable;
    @XmlAttribute(name = "Exchangeable")
    protected Boolean exchangeable;
    @XmlAttribute(name = "FirstClassUpgrade")
    protected Boolean firstClassUpgrade;
    @XmlAttribute(name = "TicketByDate")
    protected String ticketByDate;
    @XmlAttribute(name = "PricingTag")
    protected String pricingTag;
    @XmlAttribute(name = "EquivalentChangeFee")
    protected String equivalentChangeFee;
    @XmlAttribute(name = "EquivalentExchangeAmount")
    protected String equivalentExchangeAmount;
    @XmlAttribute(name = "AddCollection")
    protected String addCollection;
    @XmlAttribute(name = "ResidualValue")
    protected String residualValue;
    @XmlAttribute(name = "TotalResidualValue")
    protected String totalResidualValue;
    @XmlAttribute(name = "OriginalFlightValue")
    protected String originalFlightValue;
    @XmlAttribute(name = "FlownSegmentValue")
    protected String flownSegmentValue;
    @XmlAttribute(name = "BulkTicketAdvisory")
    protected Boolean bulkTicketAdvisory;
    @XmlAttribute(name = "FarePull")
    protected TypeFarePull farePull;
    @XmlAttribute(name = "PassengerTypeCode")
    protected String passengerTypeCode;
    @XmlAttribute(name = "PassengerCount")
    protected BigInteger passengerCount;
    @XmlAttribute(name = "FormOfRefund")
    protected TypeFormOfRefund formOfRefund;
    @XmlAttribute(name = "Refund")
    protected String refund;

    /**
     * Gets the value of the totalPenaltyTaxInfo property.
     * 
     * @return
     *     possible object is
     *     {@link AirExchangeInfo.TotalPenaltyTaxInfo }
     *     
     */
    public AirExchangeInfo.TotalPenaltyTaxInfo getTotalPenaltyTaxInfo() {
        return totalPenaltyTaxInfo;
    }

    /**
     * Sets the value of the totalPenaltyTaxInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirExchangeInfo.TotalPenaltyTaxInfo }
     *     
     */
    public void setTotalPenaltyTaxInfo(AirExchangeInfo.TotalPenaltyTaxInfo value) {
        this.totalPenaltyTaxInfo = value;
    }

    /**
     * Gets the value of the paidTax property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paidTax property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaidTax().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeTax }
     * 
     * 
     */
    public List<TypeTax> getPaidTax() {
        if (paidTax == null) {
            paidTax = new ArrayList<TypeTax>();
        }
        return this.paidTax;
    }

    /**
     * Gets the value of the ticketFeeInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ticketFeeInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTicketFeeInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AirExchangeInfo.TicketFeeInfo }
     * 
     * 
     */
    public List<AirExchangeInfo.TicketFeeInfo> getTicketFeeInfo() {
        if (ticketFeeInfo == null) {
            ticketFeeInfo = new ArrayList<AirExchangeInfo.TicketFeeInfo>();
        }
        return this.ticketFeeInfo;
    }

    /**
     * Gets the value of the reason property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the reason property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReason().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getReason() {
        if (reason == null) {
            reason = new ArrayList<String>();
        }
        return this.reason;
    }

    /**
     * Gets the value of the feeInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the feeInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFeeInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeFeeInfo }
     * 
     * 
     */
    public List<TypeFeeInfo> getFeeInfo() {
        if (feeInfo == null) {
            feeInfo = new ArrayList<TypeFeeInfo>();
        }
        return this.feeInfo;
    }

    /**
     * Gets the value of the taxInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the taxInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTaxInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeTaxInfo }
     * 
     * 
     */
    public List<TypeTaxInfo> getTaxInfo() {
        if (taxInfo == null) {
            taxInfo = new ArrayList<TypeTaxInfo>();
        }
        return this.taxInfo;
    }

    /**
     * Gets the value of the exchangeAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExchangeAmount() {
        return exchangeAmount;
    }

    /**
     * Sets the value of the exchangeAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExchangeAmount(String value) {
        this.exchangeAmount = value;
    }

    /**
     * Gets the value of the baseFare property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseFare() {
        return baseFare;
    }

    /**
     * Sets the value of the baseFare property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseFare(String value) {
        this.baseFare = value;
    }

    /**
     * Gets the value of the equivalentBaseFare property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEquivalentBaseFare() {
        return equivalentBaseFare;
    }

    /**
     * Sets the value of the equivalentBaseFare property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEquivalentBaseFare(String value) {
        this.equivalentBaseFare = value;
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
     * Gets the value of the changeFee property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChangeFee() {
        return changeFee;
    }

    /**
     * Sets the value of the changeFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChangeFee(String value) {
        this.changeFee = value;
    }

    /**
     * Gets the value of the forfeitAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForfeitAmount() {
        return forfeitAmount;
    }

    /**
     * Sets the value of the forfeitAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForfeitAmount(String value) {
        this.forfeitAmount = value;
    }

    /**
     * Gets the value of the refundable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRefundable() {
        return refundable;
    }

    /**
     * Sets the value of the refundable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRefundable(Boolean value) {
        this.refundable = value;
    }

    /**
     * Gets the value of the exchangeable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExchangeable() {
        return exchangeable;
    }

    /**
     * Sets the value of the exchangeable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExchangeable(Boolean value) {
        this.exchangeable = value;
    }

    /**
     * Gets the value of the firstClassUpgrade property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFirstClassUpgrade() {
        return firstClassUpgrade;
    }

    /**
     * Sets the value of the firstClassUpgrade property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFirstClassUpgrade(Boolean value) {
        this.firstClassUpgrade = value;
    }

    /**
     * Gets the value of the ticketByDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTicketByDate() {
        return ticketByDate;
    }

    /**
     * Sets the value of the ticketByDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTicketByDate(String value) {
        this.ticketByDate = value;
    }

    /**
     * Gets the value of the pricingTag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPricingTag() {
        return pricingTag;
    }

    /**
     * Sets the value of the pricingTag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPricingTag(String value) {
        this.pricingTag = value;
    }

    /**
     * Gets the value of the equivalentChangeFee property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEquivalentChangeFee() {
        return equivalentChangeFee;
    }

    /**
     * Sets the value of the equivalentChangeFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEquivalentChangeFee(String value) {
        this.equivalentChangeFee = value;
    }

    /**
     * Gets the value of the equivalentExchangeAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEquivalentExchangeAmount() {
        return equivalentExchangeAmount;
    }

    /**
     * Sets the value of the equivalentExchangeAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEquivalentExchangeAmount(String value) {
        this.equivalentExchangeAmount = value;
    }

    /**
     * Gets the value of the addCollection property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddCollection() {
        return addCollection;
    }

    /**
     * Sets the value of the addCollection property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddCollection(String value) {
        this.addCollection = value;
    }

    /**
     * Gets the value of the residualValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResidualValue() {
        return residualValue;
    }

    /**
     * Sets the value of the residualValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResidualValue(String value) {
        this.residualValue = value;
    }

    /**
     * Gets the value of the totalResidualValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalResidualValue() {
        return totalResidualValue;
    }

    /**
     * Sets the value of the totalResidualValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalResidualValue(String value) {
        this.totalResidualValue = value;
    }

    /**
     * Gets the value of the originalFlightValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginalFlightValue() {
        return originalFlightValue;
    }

    /**
     * Sets the value of the originalFlightValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginalFlightValue(String value) {
        this.originalFlightValue = value;
    }

    /**
     * Gets the value of the flownSegmentValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlownSegmentValue() {
        return flownSegmentValue;
    }

    /**
     * Sets the value of the flownSegmentValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlownSegmentValue(String value) {
        this.flownSegmentValue = value;
    }

    /**
     * Gets the value of the bulkTicketAdvisory property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBulkTicketAdvisory() {
        return bulkTicketAdvisory;
    }

    /**
     * Sets the value of the bulkTicketAdvisory property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBulkTicketAdvisory(Boolean value) {
        this.bulkTicketAdvisory = value;
    }

    /**
     * Gets the value of the farePull property.
     * 
     * @return
     *     possible object is
     *     {@link TypeFarePull }
     *     
     */
    public TypeFarePull getFarePull() {
        return farePull;
    }

    /**
     * Sets the value of the farePull property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeFarePull }
     *     
     */
    public void setFarePull(TypeFarePull value) {
        this.farePull = value;
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
     * Gets the value of the formOfRefund property.
     * 
     * @return
     *     possible object is
     *     {@link TypeFormOfRefund }
     *     
     */
    public TypeFormOfRefund getFormOfRefund() {
        return formOfRefund;
    }

    /**
     * Sets the value of the formOfRefund property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeFormOfRefund }
     *     
     */
    public void setFormOfRefund(TypeFormOfRefund value) {
        this.formOfRefund = value;
    }

    /**
     * Gets the value of the refund property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefund() {
        return refund;
    }

    /**
     * Sets the value of the refund property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefund(String value) {
        this.refund = value;
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
     *       &lt;attribute name="Base" type="{http://www.travelport.com/schema/common_v50_0}typeMoney" /&gt;
     *       &lt;attribute name="Tax" type="{http://www.travelport.com/schema/common_v50_0}typeMoney" /&gt;
     *       &lt;attribute name="Total" type="{http://www.travelport.com/schema/common_v50_0}typeMoney" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class TicketFeeInfo {

        @XmlAttribute(name = "Base")
        protected String base;
        @XmlAttribute(name = "Tax")
        protected String tax;
        @XmlAttribute(name = "Total")
        protected String total;

        /**
         * Gets the value of the base property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBase() {
            return base;
        }

        /**
         * Sets the value of the base property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBase(String value) {
            this.base = value;
        }

        /**
         * Gets the value of the tax property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTax() {
            return tax;
        }

        /**
         * Sets the value of the tax property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTax(String value) {
            this.tax = value;
        }

        /**
         * Gets the value of the total property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTotal() {
            return total;
        }

        /**
         * Sets the value of the total property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTotal(String value) {
            this.total = value;
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
     *       &lt;sequence&gt;
     *         &lt;element name="PenaltyTaxInfo" type="{http://www.travelport.com/schema/common_v50_0}typeTax" maxOccurs="999" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="TotalPenaltyTax" type="{http://www.travelport.com/schema/common_v50_0}typeMoney" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "penaltyTaxInfo"
    })
    public static class TotalPenaltyTaxInfo {

        @XmlElement(name = "PenaltyTaxInfo")
        protected List<TypeTax> penaltyTaxInfo;
        @XmlAttribute(name = "TotalPenaltyTax")
        protected String totalPenaltyTax;

        /**
         * Gets the value of the penaltyTaxInfo property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the penaltyTaxInfo property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPenaltyTaxInfo().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TypeTax }
         * 
         * 
         */
        public List<TypeTax> getPenaltyTaxInfo() {
            if (penaltyTaxInfo == null) {
                penaltyTaxInfo = new ArrayList<TypeTax>();
            }
            return this.penaltyTaxInfo;
        }

        /**
         * Gets the value of the totalPenaltyTax property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTotalPenaltyTax() {
            return totalPenaltyTax;
        }

        /**
         * Sets the value of the totalPenaltyTax property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTotalPenaltyTax(String value) {
            this.totalPenaltyTax = value;
        }

    }

}
