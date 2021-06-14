
package com.travelport.schema.vehicle_v50_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.travelport.schema.common_v50_0.TypeVehicleLocation;
import com.travelport.schema.common_v50_0.TypeVendorLocation;


/**
 * <p>Java class for typeVehicleVendorLocation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="typeVehicleVendorLocation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.travelport.com/schema/common_v50_0}typeVendorLocation"&gt;
 *       &lt;attGroup ref="{http://www.travelport.com/schema/vehicle_v50_0}attrVehicleVendorLocation"/&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "typeVehicleVendorLocation")
@XmlSeeAlso({
    com.travelport.schema.vehicle_v50_0.VehicleDateLocation.VendorLocation.class
})
public class TypeVehicleVendorLocation
    extends TypeVendorLocation
{

    @XmlAttribute(name = "LocationType")
    protected TypeVehicleLocation locationType;
    @XmlAttribute(name = "LocationCode")
    protected String locationCode;
    @XmlAttribute(name = "Type")
    protected String type;

    /**
     * Gets the value of the locationType property.
     * 
     * @return
     *     possible object is
     *     {@link TypeVehicleLocation }
     *     
     */
    public TypeVehicleLocation getLocationType() {
        return locationType;
    }

    /**
     * Sets the value of the locationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeVehicleLocation }
     *     
     */
    public void setLocationType(TypeVehicleLocation value) {
        this.locationType = value;
    }

    /**
     * Gets the value of the locationCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationCode() {
        return locationCode;
    }

    /**
     * Sets the value of the locationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationCode(String value) {
        this.locationCode = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

}
