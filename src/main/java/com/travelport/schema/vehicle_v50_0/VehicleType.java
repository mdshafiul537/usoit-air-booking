
package com.travelport.schema.vehicle_v50_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;http://www.travelport.com/schema/vehicle_v50_0&gt;typeVehicleTypes"&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "value"
})
@XmlRootElement(name = "VehicleType")
public class VehicleType {

    @XmlValue
    protected TypeVehicleTypes value;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link TypeVehicleTypes }
     *     
     */
    public TypeVehicleTypes getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeVehicleTypes }
     *     
     */
    public void setValue(TypeVehicleTypes value) {
        this.value = value;
    }

}
