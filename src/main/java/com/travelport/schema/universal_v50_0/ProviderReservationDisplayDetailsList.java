
package com.travelport.schema.universal_v50_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/universal_v50_0}DisplayDetails" maxOccurs="999"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/universal_v50_0}TravelerNameNum" maxOccurs="999" minOccurs="0"/&gt;
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
    "displayDetails",
    "travelerNameNum"
})
@XmlRootElement(name = "ProviderReservationDisplayDetailsList")
public class ProviderReservationDisplayDetailsList {

    @XmlElement(name = "DisplayDetails", required = true)
    protected List<DisplayDetails> displayDetails;
    @XmlElement(name = "TravelerNameNum")
    protected List<TravelerNameNum> travelerNameNum;

    /**
     * Gets the value of the displayDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the displayDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDisplayDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DisplayDetails }
     * 
     * 
     */
    public List<DisplayDetails> getDisplayDetails() {
        if (displayDetails == null) {
            displayDetails = new ArrayList<DisplayDetails>();
        }
        return this.displayDetails;
    }

    /**
     * Gets the value of the travelerNameNum property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the travelerNameNum property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTravelerNameNum().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TravelerNameNum }
     * 
     * 
     */
    public List<TravelerNameNum> getTravelerNameNum() {
        if (travelerNameNum == null) {
            travelerNameNum = new ArrayList<TravelerNameNum>();
        }
        return this.travelerNameNum;
    }

}
