
package com.travelport.schema.vehicle_v50_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.travelport.schema.common_v50_0.TypeDoorCount;
import com.travelport.schema.common_v50_0.TypeFuel;
import com.travelport.schema.common_v50_0.TypePolicyCodesList;
import com.travelport.schema.common_v50_0.TypeVehicleCategory;
import com.travelport.schema.common_v50_0.TypeVehicleClass;
import com.travelport.schema.common_v50_0.TypeVehicleTransmission;


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
 *         &lt;element name="PolicyCodesList" type="{http://www.travelport.com/schema/common_v50_0}typePolicyCodesList" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/vehicle_v50_0}VehicleRate" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.travelport.com/schema/common_v50_0}attrPolicyMarking"/&gt;
 *       &lt;attribute name="VendorCode" use="required" type="{http://www.travelport.com/schema/common_v50_0}typeSupplierCode" /&gt;
 *       &lt;attribute name="AirConditioning" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="TransmissionType" use="required" type="{http://www.travelport.com/schema/common_v50_0}typeVehicleTransmission" /&gt;
 *       &lt;attribute name="VehicleClass" use="required" type="{http://www.travelport.com/schema/common_v50_0}typeVehicleClass" /&gt;
 *       &lt;attribute name="Category" use="required" type="{http://www.travelport.com/schema/common_v50_0}typeVehicleCategory" /&gt;
 *       &lt;attribute name="Description" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="DoorCount" type="{http://www.travelport.com/schema/common_v50_0}typeDoorCount" /&gt;
 *       &lt;attribute name="Location" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="CounterLocationCode"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;minLength value="4"/&gt;
 *             &lt;maxLength value="4"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="VendorLocationKey" type="{http://www.travelport.com/schema/common_v50_0}typeRef" /&gt;
 *       &lt;attribute name="VendorName"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;maxLength value="20"/&gt;
 *             &lt;minLength value="1"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="AlternateVendor" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="FuelType" type="{http://www.travelport.com/schema/common_v50_0}typeFuel" /&gt;
 *       &lt;attribute name="AcrissVehicleCode"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;maxLength value="4"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="Key" type="{http://www.travelport.com/schema/common_v50_0}typeRef" /&gt;
 *       &lt;attribute name="ReturnAtPickup" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "policyCodesList",
    "vehicleRate"
})
@XmlRootElement(name = "Vehicle")
public class Vehicle {

    @XmlElement(name = "PolicyCodesList")
    protected TypePolicyCodesList policyCodesList;
    @XmlElement(name = "VehicleRate")
    protected VehicleRate vehicleRate;
    @XmlAttribute(name = "VendorCode", required = true)
    protected String vendorCode;
    @XmlAttribute(name = "AirConditioning", required = true)
    protected boolean airConditioning;
    @XmlAttribute(name = "TransmissionType", required = true)
    protected TypeVehicleTransmission transmissionType;
    @XmlAttribute(name = "VehicleClass", required = true)
    protected TypeVehicleClass vehicleClass;
    @XmlAttribute(name = "Category", required = true)
    protected TypeVehicleCategory category;
    @XmlAttribute(name = "Description")
    protected String description;
    @XmlAttribute(name = "DoorCount")
    protected TypeDoorCount doorCount;
    @XmlAttribute(name = "Location")
    protected String location;
    @XmlAttribute(name = "CounterLocationCode")
    protected String counterLocationCode;
    @XmlAttribute(name = "VendorLocationKey")
    protected String vendorLocationKey;
    @XmlAttribute(name = "VendorName")
    protected String vendorName;
    @XmlAttribute(name = "AlternateVendor")
    protected String alternateVendor;
    @XmlAttribute(name = "FuelType")
    protected TypeFuel fuelType;
    @XmlAttribute(name = "AcrissVehicleCode")
    protected String acrissVehicleCode;
    @XmlAttribute(name = "Key")
    protected String key;
    @XmlAttribute(name = "ReturnAtPickup")
    protected Boolean returnAtPickup;
    @XmlAttribute(name = "InPolicy")
    protected Boolean inPolicy;
    @XmlAttribute(name = "PolicyCode")
    protected Integer policyCode;
    @XmlAttribute(name = "PreferredOption")
    protected Boolean preferredOption;

    /**
     * Gets the value of the policyCodesList property.
     * 
     * @return
     *     possible object is
     *     {@link TypePolicyCodesList }
     *     
     */
    public TypePolicyCodesList getPolicyCodesList() {
        return policyCodesList;
    }

    /**
     * Sets the value of the policyCodesList property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypePolicyCodesList }
     *     
     */
    public void setPolicyCodesList(TypePolicyCodesList value) {
        this.policyCodesList = value;
    }

    /**
     * Gets the value of the vehicleRate property.
     * 
     * @return
     *     possible object is
     *     {@link VehicleRate }
     *     
     */
    public VehicleRate getVehicleRate() {
        return vehicleRate;
    }

    /**
     * Sets the value of the vehicleRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleRate }
     *     
     */
    public void setVehicleRate(VehicleRate value) {
        this.vehicleRate = value;
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
     * Gets the value of the airConditioning property.
     * 
     */
    public boolean isAirConditioning() {
        return airConditioning;
    }

    /**
     * Sets the value of the airConditioning property.
     * 
     */
    public void setAirConditioning(boolean value) {
        this.airConditioning = value;
    }

    /**
     * Gets the value of the transmissionType property.
     * 
     * @return
     *     possible object is
     *     {@link TypeVehicleTransmission }
     *     
     */
    public TypeVehicleTransmission getTransmissionType() {
        return transmissionType;
    }

    /**
     * Sets the value of the transmissionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeVehicleTransmission }
     *     
     */
    public void setTransmissionType(TypeVehicleTransmission value) {
        this.transmissionType = value;
    }

    /**
     * Gets the value of the vehicleClass property.
     * 
     * @return
     *     possible object is
     *     {@link TypeVehicleClass }
     *     
     */
    public TypeVehicleClass getVehicleClass() {
        return vehicleClass;
    }

    /**
     * Sets the value of the vehicleClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeVehicleClass }
     *     
     */
    public void setVehicleClass(TypeVehicleClass value) {
        this.vehicleClass = value;
    }

    /**
     * Gets the value of the category property.
     * 
     * @return
     *     possible object is
     *     {@link TypeVehicleCategory }
     *     
     */
    public TypeVehicleCategory getCategory() {
        return category;
    }

    /**
     * Sets the value of the category property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeVehicleCategory }
     *     
     */
    public void setCategory(TypeVehicleCategory value) {
        this.category = value;
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
     * Gets the value of the doorCount property.
     * 
     * @return
     *     possible object is
     *     {@link TypeDoorCount }
     *     
     */
    public TypeDoorCount getDoorCount() {
        return doorCount;
    }

    /**
     * Sets the value of the doorCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeDoorCount }
     *     
     */
    public void setDoorCount(TypeDoorCount value) {
        this.doorCount = value;
    }

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocation(String value) {
        this.location = value;
    }

    /**
     * Gets the value of the counterLocationCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCounterLocationCode() {
        return counterLocationCode;
    }

    /**
     * Sets the value of the counterLocationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCounterLocationCode(String value) {
        this.counterLocationCode = value;
    }

    /**
     * Gets the value of the vendorLocationKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVendorLocationKey() {
        return vendorLocationKey;
    }

    /**
     * Sets the value of the vendorLocationKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVendorLocationKey(String value) {
        this.vendorLocationKey = value;
    }

    /**
     * Gets the value of the vendorName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVendorName() {
        return vendorName;
    }

    /**
     * Sets the value of the vendorName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVendorName(String value) {
        this.vendorName = value;
    }

    /**
     * Gets the value of the alternateVendor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlternateVendor() {
        return alternateVendor;
    }

    /**
     * Sets the value of the alternateVendor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlternateVendor(String value) {
        this.alternateVendor = value;
    }

    /**
     * Gets the value of the fuelType property.
     * 
     * @return
     *     possible object is
     *     {@link TypeFuel }
     *     
     */
    public TypeFuel getFuelType() {
        return fuelType;
    }

    /**
     * Sets the value of the fuelType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeFuel }
     *     
     */
    public void setFuelType(TypeFuel value) {
        this.fuelType = value;
    }

    /**
     * Gets the value of the acrissVehicleCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcrissVehicleCode() {
        return acrissVehicleCode;
    }

    /**
     * Sets the value of the acrissVehicleCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcrissVehicleCode(String value) {
        this.acrissVehicleCode = value;
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
     * Gets the value of the returnAtPickup property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReturnAtPickup() {
        return returnAtPickup;
    }

    /**
     * Sets the value of the returnAtPickup property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReturnAtPickup(Boolean value) {
        this.returnAtPickup = value;
    }

    /**
     * Gets the value of the inPolicy property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInPolicy() {
        return inPolicy;
    }

    /**
     * Sets the value of the inPolicy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInPolicy(Boolean value) {
        this.inPolicy = value;
    }

    /**
     * Gets the value of the policyCode property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPolicyCode() {
        return policyCode;
    }

    /**
     * Sets the value of the policyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPolicyCode(Integer value) {
        this.policyCode = value;
    }

    /**
     * Gets the value of the preferredOption property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPreferredOption() {
        return preferredOption;
    }

    /**
     * Sets the value of the preferredOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPreferredOption(Boolean value) {
        this.preferredOption = value;
    }

}
