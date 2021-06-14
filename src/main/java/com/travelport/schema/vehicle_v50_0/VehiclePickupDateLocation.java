
package com.travelport.schema.vehicle_v50_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
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
 *       &lt;attribute name="PickupDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *       &lt;attribute name="PickupLocation" type="{http://www.travelport.com/schema/common_v50_0}typeIATACode" /&gt;
 *       &lt;attribute name="PickupLocationType" type="{http://www.travelport.com/schema/common_v50_0}typeVehicleLocation" /&gt;
 *       &lt;attribute name="PickupLocationNumber" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "VehiclePickupDateLocation")
public class VehiclePickupDateLocation {

    @XmlAttribute(name = "PickupDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar pickupDateTime;
    @XmlAttribute(name = "PickupLocation")
    protected String pickupLocation;
    @XmlAttribute(name = "PickupLocationType")
    protected TypeVehicleLocation pickupLocationType;
    @XmlAttribute(name = "PickupLocationNumber")
    protected String pickupLocationNumber;

    /**
     * Gets the value of the pickupDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPickupDateTime() {
        return pickupDateTime;
    }

    /**
     * Sets the value of the pickupDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPickupDateTime(XMLGregorianCalendar value) {
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

}
