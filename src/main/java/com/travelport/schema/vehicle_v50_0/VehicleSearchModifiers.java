
package com.travelport.schema.vehicle_v50_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.travelport.schema.common_v50_0.BookingSource;
import com.travelport.schema.common_v50_0.LoyaltyCard;
import com.travelport.schema.common_v50_0.SpecialEquipment;
import com.travelport.schema.common_v50_0.TypeKeyword;
import com.travelport.schema.common_v50_0.TypeRateCategory;
import com.travelport.schema.common_v50_0.TypeRateTimePeriod;


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
 *         &lt;element name="PermittedVendors" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://www.travelport.com/schema/vehicle_v50_0}Vendor" maxOccurs="999"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ProhibitedVendors" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://www.travelport.com/schema/vehicle_v50_0}Vendor" maxOccurs="999"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/vehicle_v50_0}VehicleModifier" maxOccurs="999" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/vehicle_v50_0}VehicleType" maxOccurs="999" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/vehicle_v50_0}RateModifiers" maxOccurs="999" minOccurs="0"/&gt;
 *         &lt;element name="RateHostIndicator" type="{http://www.travelport.com/schema/vehicle_v50_0}typeRateHostIndicator" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/common_v50_0}LoyaltyCard" maxOccurs="999" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/common_v50_0}ReferencePoint" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/common_v50_0}BookingSource" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/common_v50_0}SpecialEquipment" maxOccurs="5" minOccurs="0"/&gt;
 *         &lt;element name="SearchDistance" type="{http://www.travelport.com/schema/vehicle_v50_0}typeVehicleSearchDistance" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/vehicle_v50_0}Policy" maxOccurs="999" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/vehicle_v50_0}DriverInfo" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Key" type="{http://www.travelport.com/schema/common_v50_0}typeRef" /&gt;
 *       &lt;attribute name="PreferredCurrency" type="{http://www.travelport.com/schema/common_v50_0}typeCurrency" /&gt;
 *       &lt;attribute name="UnlimitedMileage" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="RateCategory" type="{http://www.travelport.com/schema/common_v50_0}typeRateCategory" /&gt;
 *       &lt;attribute name="RateGuaranteed" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="RatePeriod" type="{http://www.travelport.com/schema/common_v50_0}typeRateTimePeriod" /&gt;
 *       &lt;attribute name="SellableRatesOnly" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="ReturnSourceCurrency" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "permittedVendors",
    "prohibitedVendors",
    "vehicleModifier",
    "vehicleType",
    "rateModifiers",
    "rateHostIndicator",
    "loyaltyCard",
    "referencePoint",
    "bookingSource",
    "specialEquipment",
    "searchDistance",
    "policy",
    "driverInfo"
})
@XmlRootElement(name = "VehicleSearchModifiers")
public class VehicleSearchModifiers {

    @XmlElement(name = "PermittedVendors")
    protected VehicleSearchModifiers.PermittedVendors permittedVendors;
    @XmlElement(name = "ProhibitedVendors")
    protected VehicleSearchModifiers.ProhibitedVendors prohibitedVendors;
    @XmlElement(name = "VehicleModifier")
    protected List<VehicleModifier> vehicleModifier;
    @XmlElement(name = "VehicleType")
    protected List<VehicleType> vehicleType;
    @XmlElement(name = "RateModifiers")
    protected List<RateModifiers> rateModifiers;
    @XmlElement(name = "RateHostIndicator")
    protected TypeRateHostIndicator rateHostIndicator;
    @XmlElement(name = "LoyaltyCard", namespace = "http://www.travelport.com/schema/common_v50_0")
    protected List<LoyaltyCard> loyaltyCard;
    @XmlElement(name = "ReferencePoint", namespace = "http://www.travelport.com/schema/common_v50_0")
    protected String referencePoint;
    @XmlElement(name = "BookingSource", namespace = "http://www.travelport.com/schema/common_v50_0")
    protected BookingSource bookingSource;
    @XmlElement(name = "SpecialEquipment", namespace = "http://www.travelport.com/schema/common_v50_0")
    protected List<SpecialEquipment> specialEquipment;
    @XmlElement(name = "SearchDistance")
    protected TypeVehicleSearchDistance searchDistance;
    @XmlElement(name = "Policy")
    protected List<TypeKeyword> policy;
    @XmlElement(name = "DriverInfo")
    protected DriverInfo driverInfo;
    @XmlAttribute(name = "Key")
    protected String key;
    @XmlAttribute(name = "PreferredCurrency")
    protected String preferredCurrency;
    @XmlAttribute(name = "UnlimitedMileage")
    protected Boolean unlimitedMileage;
    @XmlAttribute(name = "RateCategory")
    protected TypeRateCategory rateCategory;
    @XmlAttribute(name = "RateGuaranteed")
    protected Boolean rateGuaranteed;
    @XmlAttribute(name = "RatePeriod")
    protected TypeRateTimePeriod ratePeriod;
    @XmlAttribute(name = "SellableRatesOnly")
    protected Boolean sellableRatesOnly;
    @XmlAttribute(name = "ReturnSourceCurrency")
    protected Boolean returnSourceCurrency;

    /**
     * Gets the value of the permittedVendors property.
     * 
     * @return
     *     possible object is
     *     {@link VehicleSearchModifiers.PermittedVendors }
     *     
     */
    public VehicleSearchModifiers.PermittedVendors getPermittedVendors() {
        return permittedVendors;
    }

    /**
     * Sets the value of the permittedVendors property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleSearchModifiers.PermittedVendors }
     *     
     */
    public void setPermittedVendors(VehicleSearchModifiers.PermittedVendors value) {
        this.permittedVendors = value;
    }

    /**
     * Gets the value of the prohibitedVendors property.
     * 
     * @return
     *     possible object is
     *     {@link VehicleSearchModifiers.ProhibitedVendors }
     *     
     */
    public VehicleSearchModifiers.ProhibitedVendors getProhibitedVendors() {
        return prohibitedVendors;
    }

    /**
     * Sets the value of the prohibitedVendors property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleSearchModifiers.ProhibitedVendors }
     *     
     */
    public void setProhibitedVendors(VehicleSearchModifiers.ProhibitedVendors value) {
        this.prohibitedVendors = value;
    }

    /**
     * Gets the value of the vehicleModifier property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vehicleModifier property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVehicleModifier().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VehicleModifier }
     * 
     * 
     */
    public List<VehicleModifier> getVehicleModifier() {
        if (vehicleModifier == null) {
            vehicleModifier = new ArrayList<VehicleModifier>();
        }
        return this.vehicleModifier;
    }

    /**
     * Gets the value of the vehicleType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vehicleType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVehicleType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VehicleType }
     * 
     * 
     */
    public List<VehicleType> getVehicleType() {
        if (vehicleType == null) {
            vehicleType = new ArrayList<VehicleType>();
        }
        return this.vehicleType;
    }

    /**
     * Gets the value of the rateModifiers property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rateModifiers property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRateModifiers().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RateModifiers }
     * 
     * 
     */
    public List<RateModifiers> getRateModifiers() {
        if (rateModifiers == null) {
            rateModifiers = new ArrayList<RateModifiers>();
        }
        return this.rateModifiers;
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
     * Gets the value of the loyaltyCard property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the loyaltyCard property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLoyaltyCard().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LoyaltyCard }
     * 
     * 
     */
    public List<LoyaltyCard> getLoyaltyCard() {
        if (loyaltyCard == null) {
            loyaltyCard = new ArrayList<LoyaltyCard>();
        }
        return this.loyaltyCard;
    }

    /**
     * Search Car by reference point
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferencePoint() {
        return referencePoint;
    }

    /**
     * Sets the value of the referencePoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferencePoint(String value) {
        this.referencePoint = value;
    }

    /**
     * Supported Providers: 1P/1J. Only type IataNumber is valid.
     * 
     * @return
     *     possible object is
     *     {@link BookingSource }
     *     
     */
    public BookingSource getBookingSource() {
        return bookingSource;
    }

    /**
     * Sets the value of the bookingSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link BookingSource }
     *     
     */
    public void setBookingSource(BookingSource value) {
        this.bookingSource = value;
    }

    /**
     * Allows vehicle search with Special equipment by specifying special equipment type. e.g. “BikeRack”. Not supported by all vendors. 1P/1J only.Gets the value of the specialEquipment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the specialEquipment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpecialEquipment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SpecialEquipment }
     * 
     * 
     */
    public List<SpecialEquipment> getSpecialEquipment() {
        if (specialEquipment == null) {
            specialEquipment = new ArrayList<SpecialEquipment>();
        }
        return this.specialEquipment;
    }

    /**
     * Gets the value of the searchDistance property.
     * 
     * @return
     *     possible object is
     *     {@link TypeVehicleSearchDistance }
     *     
     */
    public TypeVehicleSearchDistance getSearchDistance() {
        return searchDistance;
    }

    /**
     * Sets the value of the searchDistance property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeVehicleSearchDistance }
     *     
     */
    public void setSearchDistance(TypeVehicleSearchDistance value) {
        this.searchDistance = value;
    }

    /**
     * Gets the value of the policy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the policy property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPolicy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeKeyword }
     * 
     * 
     */
    public List<TypeKeyword> getPolicy() {
        if (policy == null) {
            policy = new ArrayList<TypeKeyword>();
        }
        return this.policy;
    }

    /**
     * Use to specify Driver's age. Supported Providers: 1P.
     * 
     * @return
     *     possible object is
     *     {@link DriverInfo }
     *     
     */
    public DriverInfo getDriverInfo() {
        return driverInfo;
    }

    /**
     * Sets the value of the driverInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link DriverInfo }
     *     
     */
    public void setDriverInfo(DriverInfo value) {
        this.driverInfo = value;
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
     * Gets the value of the preferredCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreferredCurrency() {
        return preferredCurrency;
    }

    /**
     * Sets the value of the preferredCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreferredCurrency(String value) {
        this.preferredCurrency = value;
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
     * Gets the value of the sellableRatesOnly property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSellableRatesOnly() {
        return sellableRatesOnly;
    }

    /**
     * Sets the value of the sellableRatesOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSellableRatesOnly(Boolean value) {
        this.sellableRatesOnly = value;
    }

    /**
     * Gets the value of the returnSourceCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isReturnSourceCurrency() {
        if (returnSourceCurrency == null) {
            return false;
        } else {
            return returnSourceCurrency;
        }
    }

    /**
     * Sets the value of the returnSourceCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReturnSourceCurrency(Boolean value) {
        this.returnSourceCurrency = value;
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
     *         &lt;element ref="{http://www.travelport.com/schema/vehicle_v50_0}Vendor" maxOccurs="999"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "vendor"
    })
    public static class PermittedVendors {

        @XmlElement(name = "Vendor", required = true)
        protected List<Vendor> vendor;

        /**
         *  1G/1V max 4 vendors, 1P/1J max 99 vendors Gets the value of the vendor property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the vendor property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getVendor().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Vendor }
         * 
         * 
         */
        public List<Vendor> getVendor() {
            if (vendor == null) {
                vendor = new ArrayList<Vendor>();
            }
            return this.vendor;
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
     *         &lt;element ref="{http://www.travelport.com/schema/vehicle_v50_0}Vendor" maxOccurs="999"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "vendor"
    })
    public static class ProhibitedVendors {

        @XmlElement(name = "Vendor", required = true)
        protected List<Vendor> vendor;

        /**
         * Gets the value of the vendor property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the vendor property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getVendor().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Vendor }
         * 
         * 
         */
        public List<Vendor> getVendor() {
            if (vendor == null) {
                vendor = new ArrayList<Vendor>();
            }
            return this.vendor;
        }

    }

}
