
package com.travelport.schema.vehicle_v50_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.travelport.schema.common_v50_0.Distance;
import com.travelport.schema.common_v50_0.TypeVehicleLocation;


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
 *         &lt;element name="VendorLocation" maxOccurs="999" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{http://www.travelport.com/schema/vehicle_v50_0}typeVehicleVendorLocation"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://www.travelport.com/schema/common_v50_0}Distance" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/extension&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="PickupDateTime" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="PickupLocation" type="{http://www.travelport.com/schema/common_v50_0}typeIATACode" /&gt;
 *       &lt;attribute name="ReturnDateTime" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="ReturnLocation" type="{http://www.travelport.com/schema/common_v50_0}typeIATACode" /&gt;
 *       &lt;attribute name="PickupLocationType" type="{http://www.travelport.com/schema/common_v50_0}typeVehicleLocation" /&gt;
 *       &lt;attribute name="ReturnLocationType" type="{http://www.travelport.com/schema/common_v50_0}typeVehicleLocation" /&gt;
 *       &lt;attribute name="PickupLocationNumber" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="ReturnLocationNumber" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Key" type="{http://www.travelport.com/schema/common_v50_0}typeRef" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "vendorLocation"
})
@XmlRootElement(name = "VehicleDateLocation")
public class VehicleDateLocation {

    @XmlElement(name = "VendorLocation")
    protected List<VehicleDateLocation.VendorLocation> vendorLocation;
    @XmlAttribute(name = "PickupDateTime", required = true)
    protected String pickupDateTime;
    @XmlAttribute(name = "PickupLocation")
    protected String pickupLocation;
    @XmlAttribute(name = "ReturnDateTime", required = true)
    protected String returnDateTime;
    @XmlAttribute(name = "ReturnLocation")
    protected String returnLocation;
    @XmlAttribute(name = "PickupLocationType")
    protected TypeVehicleLocation pickupLocationType;
    @XmlAttribute(name = "ReturnLocationType")
    protected TypeVehicleLocation returnLocationType;
    @XmlAttribute(name = "PickupLocationNumber")
    protected String pickupLocationNumber;
    @XmlAttribute(name = "ReturnLocationNumber")
    protected String returnLocationNumber;
    @XmlAttribute(name = "Key")
    protected String key;

    /**
     * Gets the value of the vendorLocation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vendorLocation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVendorLocation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VehicleDateLocation.VendorLocation }
     * 
     * 
     */
    public List<VehicleDateLocation.VendorLocation> getVendorLocation() {
        if (vendorLocation == null) {
            vendorLocation = new ArrayList<VehicleDateLocation.VendorLocation>();
        }
        return this.vendorLocation;
    }

    /**
     * Gets the value of the pickupDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPickupDateTime() {
        return pickupDateTime;
    }

    /**
     * Sets the value of the pickupDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPickupDateTime(String value) {
        this.pickupDateTime = value;
    }

    /**
     * Gets the value of the pickupLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPickupLocation() {
        return pickupLocation;
    }

    /**
     * Sets the value of the pickupLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPickupLocation(String value) {
        this.pickupLocation = value;
    }

    /**
     * Gets the value of the returnDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnDateTime() {
        return returnDateTime;
    }

    /**
     * Sets the value of the returnDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnDateTime(String value) {
        this.returnDateTime = value;
    }

    /**
     * Gets the value of the returnLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnLocation() {
        return returnLocation;
    }

    /**
     * Sets the value of the returnLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnLocation(String value) {
        this.returnLocation = value;
    }

    /**
     * Gets the value of the pickupLocationType property.
     * 
     * @return
     *     possible object is
     *     {@link TypeVehicleLocation }
     *     
     */
    public TypeVehicleLocation getPickupLocationType() {
        return pickupLocationType;
    }

    /**
     * Sets the value of the pickupLocationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeVehicleLocation }
     *     
     */
    public void setPickupLocationType(TypeVehicleLocation value) {
        this.pickupLocationType = value;
    }

    /**
     * Gets the value of the returnLocationType property.
     * 
     * @return
     *     possible object is
     *     {@link TypeVehicleLocation }
     *     
     */
    public TypeVehicleLocation getReturnLocationType() {
        return returnLocationType;
    }

    /**
     * Sets the value of the returnLocationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeVehicleLocation }
     *     
     */
    public void setReturnLocationType(TypeVehicleLocation value) {
        this.returnLocationType = value;
    }

    /**
     * Gets the value of the pickupLocationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPickupLocationNumber() {
        return pickupLocationNumber;
    }

    /**
     * Sets the value of the pickupLocationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPickupLocationNumber(String value) {
        this.pickupLocationNumber = value;
    }

    /**
     * Gets the value of the returnLocationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnLocationNumber() {
        return returnLocationNumber;
    }

    /**
     * Sets the value of the returnLocationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnLocationNumber(String value) {
        this.returnLocationNumber = value;
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
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;extension base="{http://www.travelport.com/schema/vehicle_v50_0}typeVehicleVendorLocation"&gt;
     *       &lt;sequence&gt;
     *         &lt;element ref="{http://www.travelport.com/schema/common_v50_0}Distance" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/extension&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "distance"
    })
    public static class VendorLocation
        extends TypeVehicleVendorLocation
    {

        @XmlElement(name = "Distance", namespace = "http://www.travelport.com/schema/common_v50_0")
        protected Distance distance;

        /**
         * Gets the value of the distance property.
         * 
         * @return
         *     possible object is
         *     {@link Distance }
         *     
         */
        public Distance getDistance() {
            return distance;
        }

        /**
         * Sets the value of the distance property.
         * 
         * @param value
         *     allowed object is
         *     {@link Distance }
         *     
         */
        public void setDistance(Distance value) {
            this.distance = value;
        }

    }

}
