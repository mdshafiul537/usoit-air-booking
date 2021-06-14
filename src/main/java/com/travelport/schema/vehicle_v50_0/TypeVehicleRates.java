
package com.travelport.schema.vehicle_v50_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typeVehicleRates complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="typeVehicleRates"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="EstimatedTotalAmount" type="{http://www.travelport.com/schema/common_v50_0}typeMoney" /&gt;
 *       &lt;attribute name="BaseRate" type="{http://www.travelport.com/schema/common_v50_0}typeMoney" /&gt;
 *       &lt;attribute name="RateForPeriod" type="{http://www.travelport.com/schema/common_v50_0}typeMoney" /&gt;
 *       &lt;attribute name="DropOffCharge" type="{http://www.travelport.com/schema/common_v50_0}typeMoney" /&gt;
 *       &lt;attribute name="YoungDriverCharge" type="{http://www.travelport.com/schema/common_v50_0}typeMoney" /&gt;
 *       &lt;attribute name="SeniorDriverCharge" type="{http://www.travelport.com/schema/common_v50_0}typeMoney" /&gt;
 *       &lt;attribute name="FuelSurcharge" type="{http://www.travelport.com/schema/common_v50_0}typeMoney" /&gt;
 *       &lt;attribute name="ExtraMileageCharge" type="{http://www.travelport.com/schema/common_v50_0}typeMoney" /&gt;
 *       &lt;attribute name="PayNow" type="{http://www.travelport.com/schema/common_v50_0}typeMoney" /&gt;
 *       &lt;attribute name="PayLater" type="{http://www.travelport.com/schema/common_v50_0}typeMoney" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "typeVehicleRates")
@XmlSeeAlso({
    SupplierRate.class
})
public class TypeVehicleRates {

    @XmlAttribute(name = "EstimatedTotalAmount")
    protected String estimatedTotalAmount;
    @XmlAttribute(name = "BaseRate")
    protected String baseRate;
    @XmlAttribute(name = "RateForPeriod")
    protected String rateForPeriod;
    @XmlAttribute(name = "DropOffCharge")
    protected String dropOffCharge;
    @XmlAttribute(name = "YoungDriverCharge")
    protected String youngDriverCharge;
    @XmlAttribute(name = "SeniorDriverCharge")
    protected String seniorDriverCharge;
    @XmlAttribute(name = "FuelSurcharge")
    protected String fuelSurcharge;
    @XmlAttribute(name = "ExtraMileageCharge")
    protected String extraMileageCharge;
    @XmlAttribute(name = "PayNow")
    protected String payNow;
    @XmlAttribute(name = "PayLater")
    protected String payLater;

    /**
     * Gets the value of the estimatedTotalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstimatedTotalAmount() {
        return estimatedTotalAmount;
    }

    /**
     * Sets the value of the estimatedTotalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstimatedTotalAmount(String value) {
        this.estimatedTotalAmount = value;
    }

    /**
     * Gets the value of the baseRate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseRate() {
        return baseRate;
    }

    /**
     * Sets the value of the baseRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseRate(String value) {
        this.baseRate = value;
    }

    /**
     * Gets the value of the rateForPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRateForPeriod() {
        return rateForPeriod;
    }

    /**
     * Sets the value of the rateForPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRateForPeriod(String value) {
        this.rateForPeriod = value;
    }

    /**
     * Gets the value of the dropOffCharge property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDropOffCharge() {
        return dropOffCharge;
    }

    /**
     * Sets the value of the dropOffCharge property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDropOffCharge(String value) {
        this.dropOffCharge = value;
    }

    /**
     * Gets the value of the youngDriverCharge property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getYoungDriverCharge() {
        return youngDriverCharge;
    }

    /**
     * Sets the value of the youngDriverCharge property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setYoungDriverCharge(String value) {
        this.youngDriverCharge = value;
    }

    /**
     * Gets the value of the seniorDriverCharge property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeniorDriverCharge() {
        return seniorDriverCharge;
    }

    /**
     * Sets the value of the seniorDriverCharge property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeniorDriverCharge(String value) {
        this.seniorDriverCharge = value;
    }

    /**
     * Gets the value of the fuelSurcharge property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFuelSurcharge() {
        return fuelSurcharge;
    }

    /**
     * Sets the value of the fuelSurcharge property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFuelSurcharge(String value) {
        this.fuelSurcharge = value;
    }

    /**
     * Gets the value of the extraMileageCharge property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtraMileageCharge() {
        return extraMileageCharge;
    }

    /**
     * Sets the value of the extraMileageCharge property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtraMileageCharge(String value) {
        this.extraMileageCharge = value;
    }

    /**
     * Gets the value of the payNow property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayNow() {
        return payNow;
    }

    /**
     * Sets the value of the payNow property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayNow(String value) {
        this.payNow = value;
    }

    /**
     * Gets the value of the payLater property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayLater() {
        return payLater;
    }

    /**
     * Sets the value of the payLater property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayLater(String value) {
        this.payLater = value;
    }

}
