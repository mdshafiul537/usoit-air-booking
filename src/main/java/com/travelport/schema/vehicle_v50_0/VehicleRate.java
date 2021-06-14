
package com.travelport.schema.vehicle_v50_0;

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
import com.travelport.schema.common_v50_0.TypeDistance;
import com.travelport.schema.common_v50_0.TypeRateCategory;
import com.travelport.schema.common_v50_0.TypeRateGuarantee;
import com.travelport.schema.common_v50_0.TypeRateTimePeriod;
import com.travelport.schema.common_v50_0.TypeTrinary;


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
 *         &lt;element ref="{http://www.travelport.com/schema/vehicle_v50_0}SupplierRate" minOccurs="0"/&gt;
 *         &lt;element name="RateVariance" type="{http://www.travelport.com/schema/vehicle_v50_0}typeRateVariance" minOccurs="0"/&gt;
 *         &lt;element name="ApproximateRate" type="{http://www.travelport.com/schema/vehicle_v50_0}typeVehicleRates" minOccurs="0"/&gt;
 *         &lt;element name="VehicleCharge" type="{http://www.travelport.com/schema/vehicle_v50_0}typeVehicleCharge" maxOccurs="999" minOccurs="0"/&gt;
 *         &lt;element name="VehicleRateDescription" type="{http://www.travelport.com/schema/vehicle_v50_0}typeVehicleRateDescription" maxOccurs="99" minOccurs="0"/&gt;
 *         &lt;element name="RateHostIndicator" type="{http://www.travelport.com/schema/vehicle_v50_0}typeRateHostIndicator" minOccurs="0"/&gt;
 *         &lt;element name="HourlyLateCharge" type="{http://www.travelport.com/schema/vehicle_v50_0}typeRateInfo" minOccurs="0"/&gt;
 *         &lt;element name="DailyLateCharge" type="{http://www.travelport.com/schema/vehicle_v50_0}typeRateInfo" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/vehicle_v50_0}PricedEquip" maxOccurs="999" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/vehicle_v50_0}RateInclusions" minOccurs="0"/&gt;
 *         &lt;element name="WeeklyLateCharge" type="{http://www.travelport.com/schema/vehicle_v50_0}typeRateInfo" minOccurs="0"/&gt;
 *         &lt;element name="PrintText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="RatePeriod" type="{http://www.travelport.com/schema/common_v50_0}typeRateTimePeriod" /&gt;
 *       &lt;attribute name="NumberOfPeriods" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="UnlimitedMileage" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="MileageAllowance" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="Units" type="{http://www.travelport.com/schema/common_v50_0}typeDistance" /&gt;
 *       &lt;attribute name="RateSource" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="RateAvailability" type="{http://www.travelport.com/schema/vehicle_v50_0}typeRateAvailability" /&gt;
 *       &lt;attribute name="RequiredCharges" type="{http://www.travelport.com/schema/common_v50_0}typeMoney" /&gt;
 *       &lt;attribute name="RateCode" type="{http://www.travelport.com/schema/common_v50_0}typeRateCode" /&gt;
 *       &lt;attribute name="RequestedRateCodeApplied" type="{http://www.travelport.com/schema/common_v50_0}typeTrinary" /&gt;
 *       &lt;attribute name="RateCategory" type="{http://www.travelport.com/schema/common_v50_0}typeRateCategory" /&gt;
 *       &lt;attribute name="DiscountNumber" type="{http://www.travelport.com/schema/common_v50_0}typeDiscountNumber" /&gt;
 *       &lt;attribute name="DiscountNumberApplied" type="{http://www.travelport.com/schema/common_v50_0}typeTrinary" /&gt;
 *       &lt;attribute name="VendorCode" type="{http://www.travelport.com/schema/common_v50_0}typeSupplierCode" /&gt;
 *       &lt;attribute name="RateGuaranteed" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="RateCodePeriod" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="PromotionalCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="PromotionalCodeApplied" type="{http://www.travelport.com/schema/common_v50_0}typeTrinary" /&gt;
 *       &lt;attribute name="TourCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="TourCodeApplied" type="{http://www.travelport.com/schema/common_v50_0}typeTrinary" /&gt;
 *       &lt;attribute name="RateGuaranteeType" type="{http://www.travelport.com/schema/common_v50_0}typeRateGuarantee" /&gt;
 *       &lt;attribute name="RequiredPayment"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="Guarantee"/&gt;
 *             &lt;enumeration value="Deposit"/&gt;
 *             &lt;enumeration value="PrePayment"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="DropOffChargesIncluded" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="CorporateRate" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="AdvancedBooking" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="RentalRestriction" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="FlightRestriction" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="CardNumber" type="{http://www.travelport.com/schema/common_v50_0}typeCardNumber" /&gt;
 *       &lt;attribute name="CardNumberApplied" type="{http://www.travelport.com/schema/common_v50_0}typeTrinary" /&gt;
 *       &lt;attribute name="RateQualifierInd" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "supplierRate",
    "rateVariance",
    "approximateRate",
    "vehicleCharge",
    "vehicleRateDescription",
    "rateHostIndicator",
    "hourlyLateCharge",
    "dailyLateCharge",
    "pricedEquip",
    "rateInclusions",
    "weeklyLateCharge",
    "printText"
})
@XmlRootElement(name = "VehicleRate")
public class VehicleRate {

    @XmlElement(name = "SupplierRate")
    protected SupplierRate supplierRate;
    @XmlElement(name = "RateVariance")
    protected TypeRateVariance rateVariance;
    @XmlElement(name = "ApproximateRate")
    protected TypeVehicleRates approximateRate;
    @XmlElement(name = "VehicleCharge")
    protected List<TypeVehicleCharge> vehicleCharge;
    @XmlElement(name = "VehicleRateDescription")
    protected List<TypeVehicleRateDescription> vehicleRateDescription;
    @XmlElement(name = "RateHostIndicator")
    protected TypeRateHostIndicator rateHostIndicator;
    @XmlElement(name = "HourlyLateCharge")
    protected TypeRateInfo hourlyLateCharge;
    @XmlElement(name = "DailyLateCharge")
    protected TypeRateInfo dailyLateCharge;
    @XmlElement(name = "PricedEquip")
    protected List<PricedEquip> pricedEquip;
    @XmlElement(name = "RateInclusions")
    protected RateInclusions rateInclusions;
    @XmlElement(name = "WeeklyLateCharge")
    protected TypeRateInfo weeklyLateCharge;
    @XmlElement(name = "PrintText")
    protected String printText;
    @XmlAttribute(name = "RatePeriod")
    protected TypeRateTimePeriod ratePeriod;
    @XmlAttribute(name = "NumberOfPeriods")
    protected Integer numberOfPeriods;
    @XmlAttribute(name = "UnlimitedMileage")
    protected Boolean unlimitedMileage;
    @XmlAttribute(name = "MileageAllowance")
    protected Integer mileageAllowance;
    @XmlAttribute(name = "Units")
    protected TypeDistance units;
    @XmlAttribute(name = "RateSource")
    protected String rateSource;
    @XmlAttribute(name = "RateAvailability")
    protected TypeRateAvailability rateAvailability;
    @XmlAttribute(name = "RequiredCharges")
    protected String requiredCharges;
    @XmlAttribute(name = "RateCode")
    protected String rateCode;
    @XmlAttribute(name = "RequestedRateCodeApplied")
    protected TypeTrinary requestedRateCodeApplied;
    @XmlAttribute(name = "RateCategory")
    protected TypeRateCategory rateCategory;
    @XmlAttribute(name = "DiscountNumber")
    protected String discountNumber;
    @XmlAttribute(name = "DiscountNumberApplied")
    protected TypeTrinary discountNumberApplied;
    @XmlAttribute(name = "VendorCode")
    protected String vendorCode;
    @XmlAttribute(name = "RateGuaranteed")
    protected Boolean rateGuaranteed;
    @XmlAttribute(name = "RateCodePeriod")
    protected String rateCodePeriod;
    @XmlAttribute(name = "PromotionalCode")
    protected String promotionalCode;
    @XmlAttribute(name = "PromotionalCodeApplied")
    protected TypeTrinary promotionalCodeApplied;
    @XmlAttribute(name = "TourCode")
    protected String tourCode;
    @XmlAttribute(name = "TourCodeApplied")
    protected TypeTrinary tourCodeApplied;
    @XmlAttribute(name = "RateGuaranteeType")
    protected TypeRateGuarantee rateGuaranteeType;
    @XmlAttribute(name = "RequiredPayment")
    protected String requiredPayment;
    @XmlAttribute(name = "DropOffChargesIncluded")
    protected Boolean dropOffChargesIncluded;
    @XmlAttribute(name = "CorporateRate")
    protected Boolean corporateRate;
    @XmlAttribute(name = "AdvancedBooking")
    protected String advancedBooking;
    @XmlAttribute(name = "RentalRestriction")
    protected Boolean rentalRestriction;
    @XmlAttribute(name = "FlightRestriction")
    protected Boolean flightRestriction;
    @XmlAttribute(name = "CardNumber")
    protected String cardNumber;
    @XmlAttribute(name = "CardNumberApplied")
    protected TypeTrinary cardNumberApplied;
    @XmlAttribute(name = "RateQualifierInd")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger rateQualifierInd;

    /**
     * Gets the value of the supplierRate property.
     * 
     * @return
     *     possible object is
     *     {@link SupplierRate }
     *     
     */
    public SupplierRate getSupplierRate() {
        return supplierRate;
    }

    /**
     * Sets the value of the supplierRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link SupplierRate }
     *     
     */
    public void setSupplierRate(SupplierRate value) {
        this.supplierRate = value;
    }

    /**
     * Gets the value of the rateVariance property.
     * 
     * @return
     *     possible object is
     *     {@link TypeRateVariance }
     *     
     */
    public TypeRateVariance getRateVariance() {
        return rateVariance;
    }

    /**
     * Sets the value of the rateVariance property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeRateVariance }
     *     
     */
    public void setRateVariance(TypeRateVariance value) {
        this.rateVariance = value;
    }

    /**
     * Gets the value of the approximateRate property.
     * 
     * @return
     *     possible object is
     *     {@link TypeVehicleRates }
     *     
     */
    public TypeVehicleRates getApproximateRate() {
        return approximateRate;
    }

    /**
     * Sets the value of the approximateRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeVehicleRates }
     *     
     */
    public void setApproximateRate(TypeVehicleRates value) {
        this.approximateRate = value;
    }

    /**
     * Gets the value of the vehicleCharge property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vehicleCharge property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVehicleCharge().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeVehicleCharge }
     * 
     * 
     */
    public List<TypeVehicleCharge> getVehicleCharge() {
        if (vehicleCharge == null) {
            vehicleCharge = new ArrayList<TypeVehicleCharge>();
        }
        return this.vehicleCharge;
    }

    /**
     * Gets the value of the vehicleRateDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vehicleRateDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVehicleRateDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeVehicleRateDescription }
     * 
     * 
     */
    public List<TypeVehicleRateDescription> getVehicleRateDescription() {
        if (vehicleRateDescription == null) {
            vehicleRateDescription = new ArrayList<TypeVehicleRateDescription>();
        }
        return this.vehicleRateDescription;
    }

    /**
     * Gets the value of the rateHostIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link TypeRateHostIndicator }
     *     
     */
    public TypeRateHostIndicator getRateHostIndicator() {
        return rateHostIndicator;
    }

    /**
     * Sets the value of the rateHostIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeRateHostIndicator }
     *     
     */
    public void setRateHostIndicator(TypeRateHostIndicator value) {
        this.rateHostIndicator = value;
    }

    /**
     * Gets the value of the hourlyLateCharge property.
     * 
     * @return
     *     possible object is
     *     {@link TypeRateInfo }
     *     
     */
    public TypeRateInfo getHourlyLateCharge() {
        return hourlyLateCharge;
    }

    /**
     * Sets the value of the hourlyLateCharge property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeRateInfo }
     *     
     */
    public void setHourlyLateCharge(TypeRateInfo value) {
        this.hourlyLateCharge = value;
    }

    /**
     * Gets the value of the dailyLateCharge property.
     * 
     * @return
     *     possible object is
     *     {@link TypeRateInfo }
     *     
     */
    public TypeRateInfo getDailyLateCharge() {
        return dailyLateCharge;
    }

    /**
     * Sets the value of the dailyLateCharge property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeRateInfo }
     *     
     */
    public void setDailyLateCharge(TypeRateInfo value) {
        this.dailyLateCharge = value;
    }

    /**
     * Gets the value of the pricedEquip property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pricedEquip property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPricedEquip().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PricedEquip }
     * 
     * 
     */
    public List<PricedEquip> getPricedEquip() {
        if (pricedEquip == null) {
            pricedEquip = new ArrayList<PricedEquip>();
        }
        return this.pricedEquip;
    }

    /**
     * Gets the value of the rateInclusions property.
     * 
     * @return
     *     possible object is
     *     {@link RateInclusions }
     *     
     */
    public RateInclusions getRateInclusions() {
        return rateInclusions;
    }

    /**
     * Sets the value of the rateInclusions property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateInclusions }
     *     
     */
    public void setRateInclusions(RateInclusions value) {
        this.rateInclusions = value;
    }

    /**
     * Gets the value of the weeklyLateCharge property.
     * 
     * @return
     *     possible object is
     *     {@link TypeRateInfo }
     *     
     */
    public TypeRateInfo getWeeklyLateCharge() {
        return weeklyLateCharge;
    }

    /**
     * Sets the value of the weeklyLateCharge property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeRateInfo }
     *     
     */
    public void setWeeklyLateCharge(TypeRateInfo value) {
        this.weeklyLateCharge = value;
    }

    /**
     * Gets the value of the printText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrintText() {
        return printText;
    }

    /**
     * Sets the value of the printText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrintText(String value) {
        this.printText = value;
    }

    /**
     * Gets the value of the ratePeriod property.
     * 
     * @return
     *     possible object is
     *     {@link TypeRateTimePeriod }
     *     
     */
    public TypeRateTimePeriod getRatePeriod() {
        return ratePeriod;
    }

    /**
     * Sets the value of the ratePeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeRateTimePeriod }
     *     
     */
    public void setRatePeriod(TypeRateTimePeriod value) {
        this.ratePeriod = value;
    }

    /**
     * Gets the value of the numberOfPeriods property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberOfPeriods() {
        return numberOfPeriods;
    }

    /**
     * Sets the value of the numberOfPeriods property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberOfPeriods(Integer value) {
        this.numberOfPeriods = value;
    }

    /**
     * Gets the value of the unlimitedMileage property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUnlimitedMileage() {
        return unlimitedMileage;
    }

    /**
     * Sets the value of the unlimitedMileage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUnlimitedMileage(Boolean value) {
        this.unlimitedMileage = value;
    }

    /**
     * Gets the value of the mileageAllowance property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMileageAllowance() {
        return mileageAllowance;
    }

    /**
     * Sets the value of the mileageAllowance property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMileageAllowance(Integer value) {
        this.mileageAllowance = value;
    }

    /**
     * Gets the value of the units property.
     * 
     * @return
     *     possible object is
     *     {@link TypeDistance }
     *     
     */
    public TypeDistance getUnits() {
        return units;
    }

    /**
     * Sets the value of the units property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeDistance }
     *     
     */
    public void setUnits(TypeDistance value) {
        this.units = value;
    }

    /**
     * Gets the value of the rateSource property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRateSource() {
        return rateSource;
    }

    /**
     * Sets the value of the rateSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRateSource(String value) {
        this.rateSource = value;
    }

    /**
     * Gets the value of the rateAvailability property.
     * 
     * @return
     *     possible object is
     *     {@link TypeRateAvailability }
     *     
     */
    public TypeRateAvailability getRateAvailability() {
        return rateAvailability;
    }

    /**
     * Sets the value of the rateAvailability property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeRateAvailability }
     *     
     */
    public void setRateAvailability(TypeRateAvailability value) {
        this.rateAvailability = value;
    }

    /**
     * Gets the value of the requiredCharges property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequiredCharges() {
        return requiredCharges;
    }

    /**
     * Sets the value of the requiredCharges property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequiredCharges(String value) {
        this.requiredCharges = value;
    }

    /**
     * Gets the value of the rateCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRateCode() {
        return rateCode;
    }

    /**
     * Sets the value of the rateCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRateCode(String value) {
        this.rateCode = value;
    }

    /**
     * Gets the value of the requestedRateCodeApplied property.
     * 
     * @return
     *     possible object is
     *     {@link TypeTrinary }
     *     
     */
    public TypeTrinary getRequestedRateCodeApplied() {
        return requestedRateCodeApplied;
    }

    /**
     * Sets the value of the requestedRateCodeApplied property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeTrinary }
     *     
     */
    public void setRequestedRateCodeApplied(TypeTrinary value) {
        this.requestedRateCodeApplied = value;
    }

    /**
     * Gets the value of the rateCategory property.
     * 
     * @return
     *     possible object is
     *     {@link TypeRateCategory }
     *     
     */
    public TypeRateCategory getRateCategory() {
        return rateCategory;
    }

    /**
     * Sets the value of the rateCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeRateCategory }
     *     
     */
    public void setRateCategory(TypeRateCategory value) {
        this.rateCategory = value;
    }

    /**
     * Gets the value of the discountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiscountNumber() {
        return discountNumber;
    }

    /**
     * Sets the value of the discountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiscountNumber(String value) {
        this.discountNumber = value;
    }

    /**
     * Gets the value of the discountNumberApplied property.
     * 
     * @return
     *     possible object is
     *     {@link TypeTrinary }
     *     
     */
    public TypeTrinary getDiscountNumberApplied() {
        return discountNumberApplied;
    }

    /**
     * Sets the value of the discountNumberApplied property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeTrinary }
     *     
     */
    public void setDiscountNumberApplied(TypeTrinary value) {
        this.discountNumberApplied = value;
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
     * Gets the value of the rateGuaranteed property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isRateGuaranteed() {
        if (rateGuaranteed == null) {
            return false;
        } else {
            return rateGuaranteed;
        }
    }

    /**
     * Sets the value of the rateGuaranteed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRateGuaranteed(Boolean value) {
        this.rateGuaranteed = value;
    }

    /**
     * Gets the value of the rateCodePeriod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRateCodePeriod() {
        return rateCodePeriod;
    }

    /**
     * Sets the value of the rateCodePeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRateCodePeriod(String value) {
        this.rateCodePeriod = value;
    }

    /**
     * Gets the value of the promotionalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPromotionalCode() {
        return promotionalCode;
    }

    /**
     * Sets the value of the promotionalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPromotionalCode(String value) {
        this.promotionalCode = value;
    }

    /**
     * Gets the value of the promotionalCodeApplied property.
     * 
     * @return
     *     possible object is
     *     {@link TypeTrinary }
     *     
     */
    public TypeTrinary getPromotionalCodeApplied() {
        return promotionalCodeApplied;
    }

    /**
     * Sets the value of the promotionalCodeApplied property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeTrinary }
     *     
     */
    public void setPromotionalCodeApplied(TypeTrinary value) {
        this.promotionalCodeApplied = value;
    }

    /**
     * Gets the value of the tourCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTourCode() {
        return tourCode;
    }

    /**
     * Sets the value of the tourCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTourCode(String value) {
        this.tourCode = value;
    }

    /**
     * Gets the value of the tourCodeApplied property.
     * 
     * @return
     *     possible object is
     *     {@link TypeTrinary }
     *     
     */
    public TypeTrinary getTourCodeApplied() {
        return tourCodeApplied;
    }

    /**
     * Sets the value of the tourCodeApplied property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeTrinary }
     *     
     */
    public void setTourCodeApplied(TypeTrinary value) {
        this.tourCodeApplied = value;
    }

    /**
     * Gets the value of the rateGuaranteeType property.
     * 
     * @return
     *     possible object is
     *     {@link TypeRateGuarantee }
     *     
     */
    public TypeRateGuarantee getRateGuaranteeType() {
        return rateGuaranteeType;
    }

    /**
     * Sets the value of the rateGuaranteeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeRateGuarantee }
     *     
     */
    public void setRateGuaranteeType(TypeRateGuarantee value) {
        this.rateGuaranteeType = value;
    }

    /**
     * Gets the value of the requiredPayment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequiredPayment() {
        return requiredPayment;
    }

    /**
     * Sets the value of the requiredPayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequiredPayment(String value) {
        this.requiredPayment = value;
    }

    /**
     * Gets the value of the dropOffChargesIncluded property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDropOffChargesIncluded() {
        return dropOffChargesIncluded;
    }

    /**
     * Sets the value of the dropOffChargesIncluded property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDropOffChargesIncluded(Boolean value) {
        this.dropOffChargesIncluded = value;
    }

    /**
     * Gets the value of the corporateRate property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCorporateRate() {
        return corporateRate;
    }

    /**
     * Sets the value of the corporateRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCorporateRate(Boolean value) {
        this.corporateRate = value;
    }

    /**
     * Gets the value of the advancedBooking property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdvancedBooking() {
        return advancedBooking;
    }

    /**
     * Sets the value of the advancedBooking property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdvancedBooking(String value) {
        this.advancedBooking = value;
    }

    /**
     * Gets the value of the rentalRestriction property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRentalRestriction() {
        return rentalRestriction;
    }

    /**
     * Sets the value of the rentalRestriction property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRentalRestriction(Boolean value) {
        this.rentalRestriction = value;
    }

    /**
     * Gets the value of the flightRestriction property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFlightRestriction() {
        return flightRestriction;
    }

    /**
     * Sets the value of the flightRestriction property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFlightRestriction(Boolean value) {
        this.flightRestriction = value;
    }

    /**
     * Gets the value of the cardNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardNumber() {
        return cardNumber;
    }

    /**
     * Sets the value of the cardNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardNumber(String value) {
        this.cardNumber = value;
    }

    /**
     * Gets the value of the cardNumberApplied property.
     * 
     * @return
     *     possible object is
     *     {@link TypeTrinary }
     *     
     */
    public TypeTrinary getCardNumberApplied() {
        return cardNumberApplied;
    }

    /**
     * Sets the value of the cardNumberApplied property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeTrinary }
     *     
     */
    public void setCardNumberApplied(TypeTrinary value) {
        this.cardNumberApplied = value;
    }

    /**
     * Gets the value of the rateQualifierInd property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRateQualifierInd() {
        return rateQualifierInd;
    }

    /**
     * Sets the value of the rateQualifierInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRateQualifierInd(BigInteger value) {
        this.rateQualifierInd = value;
    }

}
