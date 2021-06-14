
package com.travelport.schema.air_v50_0;

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
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="Comment" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="VariationByTravelDates" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="SeasonalRange1Ind" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="SeasonalRange1StartDate" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="SeasonalRange1EndDate" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="SeasonalRange2Ind" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="SeasonalRange2StartDate" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="SeasonalRange2EndDate" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "FareRestrictionSeasonal")
public class FareRestrictionSeasonal {

    @XmlAttribute(name = "Comment")
    protected String comment;
    @XmlAttribute(name = "VariationByTravelDates")
    protected String variationByTravelDates;
    @XmlAttribute(name = "SeasonalRange1Ind")
    protected String seasonalRange1Ind;
    @XmlAttribute(name = "SeasonalRange1StartDate")
    protected String seasonalRange1StartDate;
    @XmlAttribute(name = "SeasonalRange1EndDate")
    protected String seasonalRange1EndDate;
    @XmlAttribute(name = "SeasonalRange2Ind")
    protected String seasonalRange2Ind;
    @XmlAttribute(name = "SeasonalRange2StartDate")
    protected String seasonalRange2StartDate;
    @XmlAttribute(name = "SeasonalRange2EndDate")
    protected String seasonalRange2EndDate;

    /**
     * Gets the value of the comment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComment() {
        return comment;
    }

    /**
     * Sets the value of the comment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComment(String value) {
        this.comment = value;
    }

    /**
     * Gets the value of the variationByTravelDates property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVariationByTravelDates() {
        return variationByTravelDates;
    }

    /**
     * Sets the value of the variationByTravelDates property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVariationByTravelDates(String value) {
        this.variationByTravelDates = value;
    }

    /**
     * Gets the value of the seasonalRange1Ind property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeasonalRange1Ind() {
        return seasonalRange1Ind;
    }

    /**
     * Sets the value of the seasonalRange1Ind property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeasonalRange1Ind(String value) {
        this.seasonalRange1Ind = value;
    }

    /**
     * Gets the value of the seasonalRange1StartDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeasonalRange1StartDate() {
        return seasonalRange1StartDate;
    }

    /**
     * Sets the value of the seasonalRange1StartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeasonalRange1StartDate(String value) {
        this.seasonalRange1StartDate = value;
    }

    /**
     * Gets the value of the seasonalRange1EndDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeasonalRange1EndDate() {
        return seasonalRange1EndDate;
    }

    /**
     * Sets the value of the seasonalRange1EndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeasonalRange1EndDate(String value) {
        this.seasonalRange1EndDate = value;
    }

    /**
     * Gets the value of the seasonalRange2Ind property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeasonalRange2Ind() {
        return seasonalRange2Ind;
    }

    /**
     * Sets the value of the seasonalRange2Ind property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeasonalRange2Ind(String value) {
        this.seasonalRange2Ind = value;
    }

    /**
     * Gets the value of the seasonalRange2StartDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeasonalRange2StartDate() {
        return seasonalRange2StartDate;
    }

    /**
     * Sets the value of the seasonalRange2StartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeasonalRange2StartDate(String value) {
        this.seasonalRange2StartDate = value;
    }

    /**
     * Gets the value of the seasonalRange2EndDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeasonalRange2EndDate() {
        return seasonalRange2EndDate;
    }

    /**
     * Sets the value of the seasonalRange2EndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeasonalRange2EndDate(String value) {
        this.seasonalRange2EndDate = value;
    }

}
