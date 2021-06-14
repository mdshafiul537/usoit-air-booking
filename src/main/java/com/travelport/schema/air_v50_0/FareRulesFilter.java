
package com.travelport.schema.air_v50_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Refundability" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="Value" use="required" type="{http://www.travelport.com/schema/air_v50_0}typeRefundabilityValue" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LatestTicketingTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="CHG" type="{http://www.travelport.com/schema/air_v50_0}CHGType" minOccurs="0"/&gt;
 *         &lt;element name="MIN" type="{http://www.travelport.com/schema/air_v50_0}MINType" minOccurs="0"/&gt;
 *         &lt;element name="MAX" type="{http://www.travelport.com/schema/air_v50_0}MAXType" minOccurs="0"/&gt;
 *         &lt;element name="ADV" type="{http://www.travelport.com/schema/air_v50_0}ADVType" minOccurs="0"/&gt;
 *         &lt;element name="OTH" type="{http://www.travelport.com/schema/air_v50_0}OTHType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "refundability",
    "latestTicketingTime",
    "chg",
    "min",
    "max",
    "adv",
    "oth"
})
@XmlRootElement(name = "FareRulesFilter")
public class FareRulesFilter {

    @XmlElement(name = "Refundability")
    protected FareRulesFilter.Refundability refundability;
    @XmlElement(name = "LatestTicketingTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar latestTicketingTime;
    @XmlElement(name = "CHG")
    protected CHGType chg;
    @XmlElement(name = "MIN")
    protected MINType min;
    @XmlElement(name = "MAX")
    protected MAXType max;
    @XmlElement(name = "ADV")
    protected ADVType adv;
    @XmlElement(name = "OTH")
    protected OTHType oth;

    /**
     * Gets the value of the refundability property.
     * 
     * @return
     *     possible object is
     *     {@link FareRulesFilter.Refundability }
     *     
     */
    public FareRulesFilter.Refundability getRefundability() {
        return refundability;
    }

    /**
     * Sets the value of the refundability property.
     * 
     * @param value
     *     allowed object is
     *     {@link FareRulesFilter.Refundability }
     *     
     */
    public void setRefundability(FareRulesFilter.Refundability value) {
        this.refundability = value;
    }

    /**
     * Gets the value of the latestTicketingTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLatestTicketingTime() {
        return latestTicketingTime;
    }

    /**
     * Sets the value of the latestTicketingTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLatestTicketingTime(XMLGregorianCalendar value) {
        this.latestTicketingTime = value;
    }

    /**
     * Gets the value of the chg property.
     * 
     * @return
     *     possible object is
     *     {@link CHGType }
     *     
     */
    public CHGType getCHG() {
        return chg;
    }

    /**
     * Sets the value of the chg property.
     * 
     * @param value
     *     allowed object is
     *     {@link CHGType }
     *     
     */
    public void setCHG(CHGType value) {
        this.chg = value;
    }

    /**
     * Gets the value of the min property.
     * 
     * @return
     *     possible object is
     *     {@link MINType }
     *     
     */
    public MINType getMIN() {
        return min;
    }

    /**
     * Sets the value of the min property.
     * 
     * @param value
     *     allowed object is
     *     {@link MINType }
     *     
     */
    public void setMIN(MINType value) {
        this.min = value;
    }

    /**
     * Gets the value of the max property.
     * 
     * @return
     *     possible object is
     *     {@link MAXType }
     *     
     */
    public MAXType getMAX() {
        return max;
    }

    /**
     * Sets the value of the max property.
     * 
     * @param value
     *     allowed object is
     *     {@link MAXType }
     *     
     */
    public void setMAX(MAXType value) {
        this.max = value;
    }

    /**
     * Gets the value of the adv property.
     * 
     * @return
     *     possible object is
     *     {@link ADVType }
     *     
     */
    public ADVType getADV() {
        return adv;
    }

    /**
     * Sets the value of the adv property.
     * 
     * @param value
     *     allowed object is
     *     {@link ADVType }
     *     
     */
    public void setADV(ADVType value) {
        this.adv = value;
    }

    /**
     * Gets the value of the oth property.
     * 
     * @return
     *     possible object is
     *     {@link OTHType }
     *     
     */
    public OTHType getOTH() {
        return oth;
    }

    /**
     * Sets the value of the oth property.
     * 
     * @param value
     *     allowed object is
     *     {@link OTHType }
     *     
     */
    public void setOTH(OTHType value) {
        this.oth = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;attribute name="Value" use="required" type="{http://www.travelport.com/schema/air_v50_0}typeRefundabilityValue" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Refundability {

        @XmlAttribute(name = "Value", required = true)
        protected String value;

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(String value) {
            this.value = value;
        }

    }

}
