
package com.travelport.schema.vehicle_v50_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
 *     &lt;extension base="{http://www.travelport.com/schema/vehicle_v50_0}typeVehicleRates"&gt;
 *       &lt;attribute name="DiscountAmount" type="{http://www.travelport.com/schema/common_v50_0}typeMoney" /&gt;
 *       &lt;attribute name="MandatoryChargeTotal" type="{http://www.travelport.com/schema/common_v50_0}typeMoney" /&gt;
 *       &lt;attribute name="ApproximateTotal" type="{http://www.travelport.com/schema/common_v50_0}typeMoney" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "SupplierRate")
public class SupplierRate
    extends TypeVehicleRates
{

    @XmlAttribute(name = "DiscountAmount")
    protected String discountAmount;
    @XmlAttribute(name = "MandatoryChargeTotal")
    protected String mandatoryChargeTotal;
    @XmlAttribute(name = "ApproximateTotal")
    protected String approximateTotal;

    /**
     * Gets the value of the discountAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiscountAmount() {
        return discountAmount;
    }

    /**
     * Sets the value of the discountAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiscountAmount(String value) {
        this.discountAmount = value;
    }

    /**
     * Gets the value of the mandatoryChargeTotal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMandatoryChargeTotal() {
        return mandatoryChargeTotal;
    }

    /**
     * Sets the value of the mandatoryChargeTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMandatoryChargeTotal(String value) {
        this.mandatoryChargeTotal = value;
    }

    /**
     * Gets the value of the approximateTotal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApproximateTotal() {
        return approximateTotal;
    }

    /**
     * Sets the value of the approximateTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApproximateTotal(String value) {
        this.approximateTotal = value;
    }

}
