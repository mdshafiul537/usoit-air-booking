
package com.travelport.schema.vehicle_v50_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.travelport.schema.common_v50_0.PhoneNumber;
import com.travelport.schema.common_v50_0.TypeStructuredAddress;


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
 *         &lt;element ref="{http://www.travelport.com/schema/common_v50_0}LocationAddress" maxOccurs="5" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/common_v50_0}PhoneNumber" maxOccurs="5" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/vehicle_v50_0}OperationTime" maxOccurs="999" minOccurs="0"/&gt;
 *         &lt;element name="ShuttleInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="CounterLocation" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="PreferredOption" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "locationAddress",
    "phoneNumber",
    "operationTime",
    "shuttleInfo"
})
@XmlRootElement(name = "LocationInfo")
public class LocationInfo {

    @XmlElement(name = "LocationAddress", namespace = "http://www.travelport.com/schema/common_v50_0")
    protected List<TypeStructuredAddress> locationAddress;
    @XmlElement(name = "PhoneNumber", namespace = "http://www.travelport.com/schema/common_v50_0")
    protected List<PhoneNumber> phoneNumber;
    @XmlElement(name = "OperationTime")
    protected List<String> operationTime;
    @XmlElement(name = "ShuttleInfo")
    protected String shuttleInfo;
    @XmlAttribute(name = "Name", required = true)
    protected String name;
    @XmlAttribute(name = "CounterLocation")
    protected String counterLocation;
    @XmlAttribute(name = "PreferredOption")
    protected Boolean preferredOption;

    /**
     * Gets the value of the locationAddress property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the locationAddress property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocationAddress().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeStructuredAddress }
     * 
     * 
     */
    public List<TypeStructuredAddress> getLocationAddress() {
        if (locationAddress == null) {
            locationAddress = new ArrayList<TypeStructuredAddress>();
        }
        return this.locationAddress;
    }

    /**
     * Gets the value of the phoneNumber property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the phoneNumber property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPhoneNumber().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PhoneNumber }
     * 
     * 
     */
    public List<PhoneNumber> getPhoneNumber() {
        if (phoneNumber == null) {
            phoneNumber = new ArrayList<PhoneNumber>();
        }
        return this.phoneNumber;
    }

    /**
     * Gets the value of the operationTime property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the operationTime property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOperationTime().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getOperationTime() {
        if (operationTime == null) {
            operationTime = new ArrayList<String>();
        }
        return this.operationTime;
    }

    /**
     * Gets the value of the shuttleInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShuttleInfo() {
        return shuttleInfo;
    }

    /**
     * Sets the value of the shuttleInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShuttleInfo(String value) {
        this.shuttleInfo = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the counterLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCounterLocation() {
        return counterLocation;
    }

    /**
     * Sets the value of the counterLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCounterLocation(String value) {
        this.counterLocation = value;
    }

    /**
     * Gets the value of the preferredOption property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPreferredOption() {
        return preferredOption;
    }

    /**
     * Sets the value of the preferredOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPreferredOption(Boolean value) {
        this.preferredOption = value;
    }

}
