
package com.travelport.schema.cruise_v50_0;

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
 *       &lt;attribute name="Category" type="{http://www.travelport.com/schema/common_v50_0}StringLength1to3" /&gt;
 *       &lt;attribute name="Number" type="{http://www.travelport.com/schema/common_v50_0}StringLength1to5" /&gt;
 *       &lt;attribute name="Location" type="{http://www.travelport.com/schema/common_v50_0}StringLength1" /&gt;
 *       &lt;attribute name="RelativeLocation" type="{http://www.travelport.com/schema/common_v50_0}StringLength1to12" /&gt;
 *       &lt;attribute name="DeckName" type="{http://www.travelport.com/schema/common_v50_0}StringLength1to15" /&gt;
 *       &lt;attribute name="BedConfiguration" type="{http://www.travelport.com/schema/common_v50_0}StringLength1to10" /&gt;
 *       &lt;attribute name="SmokingIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "CabinInfo")
public class CabinInfo {

    @XmlAttribute(name = "Category")
    protected String category;
    @XmlAttribute(name = "Number")
    protected String number;
    @XmlAttribute(name = "Location")
    protected String location;
    @XmlAttribute(name = "RelativeLocation")
    protected String relativeLocation;
    @XmlAttribute(name = "DeckName")
    protected String deckName;
    @XmlAttribute(name = "BedConfiguration")
    protected String bedConfiguration;
    @XmlAttribute(name = "SmokingIndicator")
    protected Boolean smokingIndicator;

    /**
     * Gets the value of the category property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategory() {
        return category;
    }

    /**
     * Sets the value of the category property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategory(String value) {
        this.category = value;
    }

    /**
     * Gets the value of the number property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumber() {
        return number;
    }

    /**
     * Sets the value of the number property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumber(String value) {
        this.number = value;
    }

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocation(String value) {
        this.location = value;
    }

    /**
     * Gets the value of the relativeLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelativeLocation() {
        return relativeLocation;
    }

    /**
     * Sets the value of the relativeLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelativeLocation(String value) {
        this.relativeLocation = value;
    }

    /**
     * Gets the value of the deckName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeckName() {
        return deckName;
    }

    /**
     * Sets the value of the deckName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeckName(String value) {
        this.deckName = value;
    }

    /**
     * Gets the value of the bedConfiguration property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBedConfiguration() {
        return bedConfiguration;
    }

    /**
     * Sets the value of the bedConfiguration property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBedConfiguration(String value) {
        this.bedConfiguration = value;
    }

    /**
     * Gets the value of the smokingIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSmokingIndicator() {
        return smokingIndicator;
    }

    /**
     * Sets the value of the smokingIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSmokingIndicator(Boolean value) {
        this.smokingIndicator = value;
    }

}
