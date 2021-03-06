
package com.travelport.schema.vehicle_v50_0;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * Rental period information concerning minimum and max rental periods.
 * 
 * <p>Java class for typeRentalPeriod complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="typeRentalPeriod"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="RentalUnit" use="required"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="Days"/&gt;
 *             &lt;enumeration value="Hours"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="Length" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *       &lt;attribute name="RequirementPassed" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "typeRentalPeriod")
public class TypeRentalPeriod {

    @XmlAttribute(name = "RentalUnit", required = true)
    protected String rentalUnit;
    @XmlAttribute(name = "Length", required = true)
    protected BigInteger length;
    @XmlAttribute(name = "RequirementPassed")
    protected Boolean requirementPassed;

    /**
     * Gets the value of the rentalUnit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRentalUnit() {
        return rentalUnit;
    }

    /**
     * Sets the value of the rentalUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRentalUnit(String value) {
        this.rentalUnit = value;
    }

    /**
     * Gets the value of the length property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLength() {
        return length;
    }

    /**
     * Sets the value of the length property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLength(BigInteger value) {
        this.length = value;
    }

    /**
     * Gets the value of the requirementPassed property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRequirementPassed() {
        return requirementPassed;
    }

    /**
     * Sets the value of the requirementPassed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRequirementPassed(Boolean value) {
        this.requirementPassed = value;
    }

}
