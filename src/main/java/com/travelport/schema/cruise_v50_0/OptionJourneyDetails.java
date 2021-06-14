
package com.travelport.schema.cruise_v50_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
 *       &lt;attribute name="PickUpLocation" type="{http://www.travelport.com/schema/common_v50_0}StringLength1to5" /&gt;
 *       &lt;attribute name="PickUpTime" type="{http://www.w3.org/2001/XMLSchema}time" /&gt;
 *       &lt;attribute name="PickUpDescription" type="{http://www.travelport.com/schema/common_v50_0}StringLength1to30" /&gt;
 *       &lt;attribute name="PickUpCarrier" type="{http://www.travelport.com/schema/common_v50_0}typeCarrier" /&gt;
 *       &lt;attribute name="PickUpFlightNumber" type="{http://www.travelport.com/schema/common_v50_0}typeFlightNumber" /&gt;
 *       &lt;attribute name="ReturnLocation" type="{http://www.travelport.com/schema/common_v50_0}StringLength1to5" /&gt;
 *       &lt;attribute name="ReturnTime" type="{http://www.w3.org/2001/XMLSchema}time" /&gt;
 *       &lt;attribute name="ReturnDescription" type="{http://www.travelport.com/schema/common_v50_0}StringLength1to30" /&gt;
 *       &lt;attribute name="ReturnCarrier" type="{http://www.travelport.com/schema/common_v50_0}typeCarrier" /&gt;
 *       &lt;attribute name="ReturnFlightNumber" type="{http://www.travelport.com/schema/common_v50_0}typeFlightNumber" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "OptionJourneyDetails")
public class OptionJourneyDetails {

    @XmlAttribute(name = "PickUpLocation")
    protected String pickUpLocation;
    @XmlAttribute(name = "PickUpTime")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar pickUpTime;
    @XmlAttribute(name = "PickUpDescription")
    protected String pickUpDescription;
    @XmlAttribute(name = "PickUpCarrier")
    protected String pickUpCarrier;
    @XmlAttribute(name = "PickUpFlightNumber")
    protected String pickUpFlightNumber;
    @XmlAttribute(name = "ReturnLocation")
    protected String returnLocation;
    @XmlAttribute(name = "ReturnTime")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar returnTime;
    @XmlAttribute(name = "ReturnDescription")
    protected String returnDescription;
    @XmlAttribute(name = "ReturnCarrier")
    protected String returnCarrier;
    @XmlAttribute(name = "ReturnFlightNumber")
    protected String returnFlightNumber;

    /**
     * Gets the value of the pickUpLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPickUpLocation() {
        return pickUpLocation;
    }

    /**
     * Sets the value of the pickUpLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPickUpLocation(String value) {
        this.pickUpLocation = value;
    }

    /**
     * Gets the value of the pickUpTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPickUpTime() {
        return pickUpTime;
    }

    /**
     * Sets the value of the pickUpTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPickUpTime(XMLGregorianCalendar value) {
        this.pickUpTime = value;
    }

    /**
     * Gets the value of the pickUpDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPickUpDescription() {
        return pickUpDescription;
    }

    /**
     * Sets the value of the pickUpDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPickUpDescription(String value) {
        this.pickUpDescription = value;
    }

    /**
     * Gets the value of the pickUpCarrier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPickUpCarrier() {
        return pickUpCarrier;
    }

    /**
     * Sets the value of the pickUpCarrier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPickUpCarrier(String value) {
        this.pickUpCarrier = value;
    }

    /**
     * Gets the value of the pickUpFlightNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPickUpFlightNumber() {
        return pickUpFlightNumber;
    }

    /**
     * Sets the value of the pickUpFlightNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPickUpFlightNumber(String value) {
        this.pickUpFlightNumber = value;
    }

    /**
     * Gets the value of the returnLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnLocation() {
        return returnLocation;
    }

    /**
     * Sets the value of the returnLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnLocation(String value) {
        this.returnLocation = value;
    }

    /**
     * Gets the value of the returnTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReturnTime() {
        return returnTime;
    }

    /**
     * Sets the value of the returnTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReturnTime(XMLGregorianCalendar value) {
        this.returnTime = value;
    }

    /**
     * Gets the value of the returnDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnDescription() {
        return returnDescription;
    }

    /**
     * Sets the value of the returnDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnDescription(String value) {
        this.returnDescription = value;
    }

    /**
     * Gets the value of the returnCarrier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnCarrier() {
        return returnCarrier;
    }

    /**
     * Sets the value of the returnCarrier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnCarrier(String value) {
        this.returnCarrier = value;
    }

    /**
     * Gets the value of the returnFlightNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnFlightNumber() {
        return returnFlightNumber;
    }

    /**
     * Sets the value of the returnFlightNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnFlightNumber(String value) {
        this.returnFlightNumber = value;
    }

}
