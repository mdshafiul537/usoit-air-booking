
package com.travelport.schema.air_v50_0;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ADVType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ADVType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="AdvRsvnOnlyIfTk" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="AdvRsvnAnyTm" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="AdvRsvnHrs" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="AdvRsvnDays" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="AdvRsvnMonths" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="AdvRsvnEarliestTm" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="AdvRsvnLatestTm" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="AdvRsvnWaived" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="AdvRsvnDataExists" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="AdvRsvnEndItem" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="AdvTkEarliestTm" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="AdvTkLatestTm" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="AdvTkRsvnHrs" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="AdvTkRsvnDays" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="AdvTkRsvnMonths" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="AdvTkStartHrs" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="AdvTkStartDays" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="AdvTkStartMonths" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="AdvTkWaived" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="AdvTkAnyTm" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="AdvTkEndItem" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="AdvRsvnTm" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *       &lt;attribute name="AdvTkRsvnTm" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *       &lt;attribute name="AdvTkStartTm" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *       &lt;attribute name="EarliestRsvnDtPresent" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="EarliestTkDtPresent" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="LatestRsvnDtPresent" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="LatestTkDtPresent" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="EarliestRsvnDt" type="{http://www.w3.org/2001/XMLSchema}date" /&gt;
 *       &lt;attribute name="EarliestTkDt" type="{http://www.w3.org/2001/XMLSchema}date" /&gt;
 *       &lt;attribute name="LatestRsvnDt" type="{http://www.w3.org/2001/XMLSchema}date" /&gt;
 *       &lt;attribute name="LatestTkDt" type="{http://www.w3.org/2001/XMLSchema}date" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ADVType")
public class ADVType {

    @XmlAttribute(name = "AdvRsvnOnlyIfTk")
    protected Boolean advRsvnOnlyIfTk;
    @XmlAttribute(name = "AdvRsvnAnyTm")
    protected Boolean advRsvnAnyTm;
    @XmlAttribute(name = "AdvRsvnHrs")
    protected Boolean advRsvnHrs;
    @XmlAttribute(name = "AdvRsvnDays")
    protected Boolean advRsvnDays;
    @XmlAttribute(name = "AdvRsvnMonths")
    protected Boolean advRsvnMonths;
    @XmlAttribute(name = "AdvRsvnEarliestTm")
    protected Boolean advRsvnEarliestTm;
    @XmlAttribute(name = "AdvRsvnLatestTm")
    protected Boolean advRsvnLatestTm;
    @XmlAttribute(name = "AdvRsvnWaived")
    protected Boolean advRsvnWaived;
    @XmlAttribute(name = "AdvRsvnDataExists")
    protected Boolean advRsvnDataExists;
    @XmlAttribute(name = "AdvRsvnEndItem")
    protected Boolean advRsvnEndItem;
    @XmlAttribute(name = "AdvTkEarliestTm")
    protected Boolean advTkEarliestTm;
    @XmlAttribute(name = "AdvTkLatestTm")
    protected Boolean advTkLatestTm;
    @XmlAttribute(name = "AdvTkRsvnHrs")
    protected Boolean advTkRsvnHrs;
    @XmlAttribute(name = "AdvTkRsvnDays")
    protected Boolean advTkRsvnDays;
    @XmlAttribute(name = "AdvTkRsvnMonths")
    protected Boolean advTkRsvnMonths;
    @XmlAttribute(name = "AdvTkStartHrs")
    protected Boolean advTkStartHrs;
    @XmlAttribute(name = "AdvTkStartDays")
    protected Boolean advTkStartDays;
    @XmlAttribute(name = "AdvTkStartMonths")
    protected Boolean advTkStartMonths;
    @XmlAttribute(name = "AdvTkWaived")
    protected Boolean advTkWaived;
    @XmlAttribute(name = "AdvTkAnyTm")
    protected Boolean advTkAnyTm;
    @XmlAttribute(name = "AdvTkEndItem")
    protected Boolean advTkEndItem;
    @XmlAttribute(name = "AdvRsvnTm")
    protected BigInteger advRsvnTm;
    @XmlAttribute(name = "AdvTkRsvnTm")
    protected BigInteger advTkRsvnTm;
    @XmlAttribute(name = "AdvTkStartTm")
    protected BigInteger advTkStartTm;
    @XmlAttribute(name = "EarliestRsvnDtPresent")
    protected Boolean earliestRsvnDtPresent;
    @XmlAttribute(name = "EarliestTkDtPresent")
    protected Boolean earliestTkDtPresent;
    @XmlAttribute(name = "LatestRsvnDtPresent")
    protected Boolean latestRsvnDtPresent;
    @XmlAttribute(name = "LatestTkDtPresent")
    protected Boolean latestTkDtPresent;
    @XmlAttribute(name = "EarliestRsvnDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar earliestRsvnDt;
    @XmlAttribute(name = "EarliestTkDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar earliestTkDt;
    @XmlAttribute(name = "LatestRsvnDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar latestRsvnDt;
    @XmlAttribute(name = "LatestTkDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar latestTkDt;

    /**
     * Gets the value of the advRsvnOnlyIfTk property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAdvRsvnOnlyIfTk() {
        return advRsvnOnlyIfTk;
    }

    /**
     * Sets the value of the advRsvnOnlyIfTk property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAdvRsvnOnlyIfTk(Boolean value) {
        this.advRsvnOnlyIfTk = value;
    }

    /**
     * Gets the value of the advRsvnAnyTm property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAdvRsvnAnyTm() {
        return advRsvnAnyTm;
    }

    /**
     * Sets the value of the advRsvnAnyTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAdvRsvnAnyTm(Boolean value) {
        this.advRsvnAnyTm = value;
    }

    /**
     * Gets the value of the advRsvnHrs property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAdvRsvnHrs() {
        return advRsvnHrs;
    }

    /**
     * Sets the value of the advRsvnHrs property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAdvRsvnHrs(Boolean value) {
        this.advRsvnHrs = value;
    }

    /**
     * Gets the value of the advRsvnDays property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAdvRsvnDays() {
        return advRsvnDays;
    }

    /**
     * Sets the value of the advRsvnDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAdvRsvnDays(Boolean value) {
        this.advRsvnDays = value;
    }

    /**
     * Gets the value of the advRsvnMonths property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAdvRsvnMonths() {
        return advRsvnMonths;
    }

    /**
     * Sets the value of the advRsvnMonths property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAdvRsvnMonths(Boolean value) {
        this.advRsvnMonths = value;
    }

    /**
     * Gets the value of the advRsvnEarliestTm property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAdvRsvnEarliestTm() {
        return advRsvnEarliestTm;
    }

    /**
     * Sets the value of the advRsvnEarliestTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAdvRsvnEarliestTm(Boolean value) {
        this.advRsvnEarliestTm = value;
    }

    /**
     * Gets the value of the advRsvnLatestTm property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAdvRsvnLatestTm() {
        return advRsvnLatestTm;
    }

    /**
     * Sets the value of the advRsvnLatestTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAdvRsvnLatestTm(Boolean value) {
        this.advRsvnLatestTm = value;
    }

    /**
     * Gets the value of the advRsvnWaived property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAdvRsvnWaived() {
        return advRsvnWaived;
    }

    /**
     * Sets the value of the advRsvnWaived property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAdvRsvnWaived(Boolean value) {
        this.advRsvnWaived = value;
    }

    /**
     * Gets the value of the advRsvnDataExists property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAdvRsvnDataExists() {
        return advRsvnDataExists;
    }

    /**
     * Sets the value of the advRsvnDataExists property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAdvRsvnDataExists(Boolean value) {
        this.advRsvnDataExists = value;
    }

    /**
     * Gets the value of the advRsvnEndItem property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAdvRsvnEndItem() {
        return advRsvnEndItem;
    }

    /**
     * Sets the value of the advRsvnEndItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAdvRsvnEndItem(Boolean value) {
        this.advRsvnEndItem = value;
    }

    /**
     * Gets the value of the advTkEarliestTm property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAdvTkEarliestTm() {
        return advTkEarliestTm;
    }

    /**
     * Sets the value of the advTkEarliestTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAdvTkEarliestTm(Boolean value) {
        this.advTkEarliestTm = value;
    }

    /**
     * Gets the value of the advTkLatestTm property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAdvTkLatestTm() {
        return advTkLatestTm;
    }

    /**
     * Sets the value of the advTkLatestTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAdvTkLatestTm(Boolean value) {
        this.advTkLatestTm = value;
    }

    /**
     * Gets the value of the advTkRsvnHrs property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAdvTkRsvnHrs() {
        return advTkRsvnHrs;
    }

    /**
     * Sets the value of the advTkRsvnHrs property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAdvTkRsvnHrs(Boolean value) {
        this.advTkRsvnHrs = value;
    }

    /**
     * Gets the value of the advTkRsvnDays property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAdvTkRsvnDays() {
        return advTkRsvnDays;
    }

    /**
     * Sets the value of the advTkRsvnDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAdvTkRsvnDays(Boolean value) {
        this.advTkRsvnDays = value;
    }

    /**
     * Gets the value of the advTkRsvnMonths property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAdvTkRsvnMonths() {
        return advTkRsvnMonths;
    }

    /**
     * Sets the value of the advTkRsvnMonths property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAdvTkRsvnMonths(Boolean value) {
        this.advTkRsvnMonths = value;
    }

    /**
     * Gets the value of the advTkStartHrs property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAdvTkStartHrs() {
        return advTkStartHrs;
    }

    /**
     * Sets the value of the advTkStartHrs property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAdvTkStartHrs(Boolean value) {
        this.advTkStartHrs = value;
    }

    /**
     * Gets the value of the advTkStartDays property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAdvTkStartDays() {
        return advTkStartDays;
    }

    /**
     * Sets the value of the advTkStartDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAdvTkStartDays(Boolean value) {
        this.advTkStartDays = value;
    }

    /**
     * Gets the value of the advTkStartMonths property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAdvTkStartMonths() {
        return advTkStartMonths;
    }

    /**
     * Sets the value of the advTkStartMonths property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAdvTkStartMonths(Boolean value) {
        this.advTkStartMonths = value;
    }

    /**
     * Gets the value of the advTkWaived property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAdvTkWaived() {
        return advTkWaived;
    }

    /**
     * Sets the value of the advTkWaived property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAdvTkWaived(Boolean value) {
        this.advTkWaived = value;
    }

    /**
     * Gets the value of the advTkAnyTm property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAdvTkAnyTm() {
        return advTkAnyTm;
    }

    /**
     * Sets the value of the advTkAnyTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAdvTkAnyTm(Boolean value) {
        this.advTkAnyTm = value;
    }

    /**
     * Gets the value of the advTkEndItem property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAdvTkEndItem() {
        return advTkEndItem;
    }

    /**
     * Sets the value of the advTkEndItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAdvTkEndItem(Boolean value) {
        this.advTkEndItem = value;
    }

    /**
     * Gets the value of the advRsvnTm property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAdvRsvnTm() {
        return advRsvnTm;
    }

    /**
     * Sets the value of the advRsvnTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAdvRsvnTm(BigInteger value) {
        this.advRsvnTm = value;
    }

    /**
     * Gets the value of the advTkRsvnTm property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAdvTkRsvnTm() {
        return advTkRsvnTm;
    }

    /**
     * Sets the value of the advTkRsvnTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAdvTkRsvnTm(BigInteger value) {
        this.advTkRsvnTm = value;
    }

    /**
     * Gets the value of the advTkStartTm property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAdvTkStartTm() {
        return advTkStartTm;
    }

    /**
     * Sets the value of the advTkStartTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAdvTkStartTm(BigInteger value) {
        this.advTkStartTm = value;
    }

    /**
     * Gets the value of the earliestRsvnDtPresent property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEarliestRsvnDtPresent() {
        return earliestRsvnDtPresent;
    }

    /**
     * Sets the value of the earliestRsvnDtPresent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEarliestRsvnDtPresent(Boolean value) {
        this.earliestRsvnDtPresent = value;
    }

    /**
     * Gets the value of the earliestTkDtPresent property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEarliestTkDtPresent() {
        return earliestTkDtPresent;
    }

    /**
     * Sets the value of the earliestTkDtPresent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEarliestTkDtPresent(Boolean value) {
        this.earliestTkDtPresent = value;
    }

    /**
     * Gets the value of the latestRsvnDtPresent property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLatestRsvnDtPresent() {
        return latestRsvnDtPresent;
    }

    /**
     * Sets the value of the latestRsvnDtPresent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLatestRsvnDtPresent(Boolean value) {
        this.latestRsvnDtPresent = value;
    }

    /**
     * Gets the value of the latestTkDtPresent property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLatestTkDtPresent() {
        return latestTkDtPresent;
    }

    /**
     * Sets the value of the latestTkDtPresent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLatestTkDtPresent(Boolean value) {
        this.latestTkDtPresent = value;
    }

    /**
     * Gets the value of the earliestRsvnDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEarliestRsvnDt() {
        return earliestRsvnDt;
    }

    /**
     * Sets the value of the earliestRsvnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEarliestRsvnDt(XMLGregorianCalendar value) {
        this.earliestRsvnDt = value;
    }

    /**
     * Gets the value of the earliestTkDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEarliestTkDt() {
        return earliestTkDt;
    }

    /**
     * Sets the value of the earliestTkDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEarliestTkDt(XMLGregorianCalendar value) {
        this.earliestTkDt = value;
    }

    /**
     * Gets the value of the latestRsvnDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLatestRsvnDt() {
        return latestRsvnDt;
    }

    /**
     * Sets the value of the latestRsvnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLatestRsvnDt(XMLGregorianCalendar value) {
        this.latestRsvnDt = value;
    }

    /**
     * Gets the value of the latestTkDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLatestTkDt() {
        return latestTkDt;
    }

    /**
     * Sets the value of the latestTkDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLatestTkDt(XMLGregorianCalendar value) {
        this.latestTkDt = value;
    }

}
