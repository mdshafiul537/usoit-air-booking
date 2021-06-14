
package com.travelport.schema.air_v50_0;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MINType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MINType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="HoursMin" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="DaysMin" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="MonthsMin" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="OccurIndMin" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="SameDayMin" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="TmDOWMin" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *       &lt;attribute name="FareComponent" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *       &lt;attribute name="NumOccurMin" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MINType")
public class MINType {

    @XmlAttribute(name = "HoursMin")
    protected Boolean hoursMin;
    @XmlAttribute(name = "DaysMin")
    protected Boolean daysMin;
    @XmlAttribute(name = "MonthsMin")
    protected Boolean monthsMin;
    @XmlAttribute(name = "OccurIndMin")
    protected Boolean occurIndMin;
    @XmlAttribute(name = "SameDayMin")
    protected Boolean sameDayMin;
    @XmlAttribute(name = "TmDOWMin")
    protected BigInteger tmDOWMin;
    @XmlAttribute(name = "FareComponent")
    protected BigInteger fareComponent;
    @XmlAttribute(name = "NumOccurMin")
    protected BigInteger numOccurMin;

    /**
     * Gets the value of the hoursMin property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHoursMin() {
        return hoursMin;
    }

    /**
     * Sets the value of the hoursMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHoursMin(Boolean value) {
        this.hoursMin = value;
    }

    /**
     * Gets the value of the daysMin property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDaysMin() {
        return daysMin;
    }

    /**
     * Sets the value of the daysMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDaysMin(Boolean value) {
        this.daysMin = value;
    }

    /**
     * Gets the value of the monthsMin property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMonthsMin() {
        return monthsMin;
    }

    /**
     * Sets the value of the monthsMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMonthsMin(Boolean value) {
        this.monthsMin = value;
    }

    /**
     * Gets the value of the occurIndMin property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOccurIndMin() {
        return occurIndMin;
    }

    /**
     * Sets the value of the occurIndMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOccurIndMin(Boolean value) {
        this.occurIndMin = value;
    }

    /**
     * Gets the value of the sameDayMin property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSameDayMin() {
        return sameDayMin;
    }

    /**
     * Sets the value of the sameDayMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSameDayMin(Boolean value) {
        this.sameDayMin = value;
    }

    /**
     * Gets the value of the tmDOWMin property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTmDOWMin() {
        return tmDOWMin;
    }

    /**
     * Sets the value of the tmDOWMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTmDOWMin(BigInteger value) {
        this.tmDOWMin = value;
    }

    /**
     * Gets the value of the fareComponent property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFareComponent() {
        return fareComponent;
    }

    /**
     * Sets the value of the fareComponent property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFareComponent(BigInteger value) {
        this.fareComponent = value;
    }

    /**
     * Gets the value of the numOccurMin property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumOccurMin() {
        return numOccurMin;
    }

    /**
     * Sets the value of the numOccurMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumOccurMin(BigInteger value) {
        this.numOccurMin = value;
    }

}
