
package com.travelport.schema.air_v50_0;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MAXType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MAXType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="HoursMax" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="DaysMax" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="MonthsMax" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="OccurIndMax" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="SameDayMax" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="StartIndMax" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="CompletionInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="TmDOWMax" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *       &lt;attribute name="NumOccurMax" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MAXType")
public class MAXType {

    @XmlAttribute(name = "HoursMax")
    protected Boolean hoursMax;
    @XmlAttribute(name = "DaysMax")
    protected Boolean daysMax;
    @XmlAttribute(name = "MonthsMax")
    protected Boolean monthsMax;
    @XmlAttribute(name = "OccurIndMax")
    protected Boolean occurIndMax;
    @XmlAttribute(name = "SameDayMax")
    protected Boolean sameDayMax;
    @XmlAttribute(name = "StartIndMax")
    protected Boolean startIndMax;
    @XmlAttribute(name = "CompletionInd")
    protected Boolean completionInd;
    @XmlAttribute(name = "TmDOWMax")
    protected BigInteger tmDOWMax;
    @XmlAttribute(name = "NumOccurMax")
    protected BigInteger numOccurMax;

    /**
     * Gets the value of the hoursMax property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHoursMax() {
        return hoursMax;
    }

    /**
     * Sets the value of the hoursMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHoursMax(Boolean value) {
        this.hoursMax = value;
    }

    /**
     * Gets the value of the daysMax property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDaysMax() {
        return daysMax;
    }

    /**
     * Sets the value of the daysMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDaysMax(Boolean value) {
        this.daysMax = value;
    }

    /**
     * Gets the value of the monthsMax property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMonthsMax() {
        return monthsMax;
    }

    /**
     * Sets the value of the monthsMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMonthsMax(Boolean value) {
        this.monthsMax = value;
    }

    /**
     * Gets the value of the occurIndMax property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOccurIndMax() {
        return occurIndMax;
    }

    /**
     * Sets the value of the occurIndMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOccurIndMax(Boolean value) {
        this.occurIndMax = value;
    }

    /**
     * Gets the value of the sameDayMax property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSameDayMax() {
        return sameDayMax;
    }

    /**
     * Sets the value of the sameDayMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSameDayMax(Boolean value) {
        this.sameDayMax = value;
    }

    /**
     * Gets the value of the startIndMax property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStartIndMax() {
        return startIndMax;
    }

    /**
     * Sets the value of the startIndMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStartIndMax(Boolean value) {
        this.startIndMax = value;
    }

    /**
     * Gets the value of the completionInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCompletionInd() {
        return completionInd;
    }

    /**
     * Sets the value of the completionInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCompletionInd(Boolean value) {
        this.completionInd = value;
    }

    /**
     * Gets the value of the tmDOWMax property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTmDOWMax() {
        return tmDOWMax;
    }

    /**
     * Sets the value of the tmDOWMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTmDOWMax(BigInteger value) {
        this.tmDOWMax = value;
    }

    /**
     * Gets the value of the numOccurMax property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumOccurMax() {
        return numOccurMax;
    }

    /**
     * Sets the value of the numOccurMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumOccurMax(BigInteger value) {
        this.numOccurMax = value;
    }

}
