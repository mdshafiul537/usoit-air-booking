
package com.travelport.schema.hotel_v50_0;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * The allocation of guests per room assigned by the aggregator or supplier (hotel property). Returned only when the requested guest allocation is different from the provider or supplier’s adapted guest allocation.
 * 
 * <p>Java class for typeAdaptedRoomGuestAllocation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="typeAdaptedRoomGuestAllocation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Child" type="{http://www.travelport.com/schema/hotel_v50_0}typeGuestChildInformation" maxOccurs="6" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="NumberOfAdults" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "typeAdaptedRoomGuestAllocation", propOrder = {
    "child"
})
public class TypeAdaptedRoomGuestAllocation {

    @XmlElement(name = "Child")
    protected List<TypeGuestChildInformation> child;
    @XmlAttribute(name = "NumberOfAdults")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger numberOfAdults;

    /**
     * Gets the value of the child property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the child property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChild().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeGuestChildInformation }
     * 
     * 
     */
    public List<TypeGuestChildInformation> getChild() {
        if (child == null) {
            child = new ArrayList<TypeGuestChildInformation>();
        }
        return this.child;
    }

    /**
     * Gets the value of the numberOfAdults property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfAdults() {
        return numberOfAdults;
    }

    /**
     * Sets the value of the numberOfAdults property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfAdults(BigInteger value) {
        this.numberOfAdults = value;
    }

}
