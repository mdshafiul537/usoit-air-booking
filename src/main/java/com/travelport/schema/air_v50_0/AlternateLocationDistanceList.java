
package com.travelport.schema.air_v50_0;

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
 *         &lt;element ref="{http://www.travelport.com/schema/air_v50_0}AlternateLocationDistance" maxOccurs="999"/&gt;
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
    "alternateLocationDistance"
})
@XmlRootElement(name = "AlternateLocationDistanceList")
public class AlternateLocationDistanceList {

    @XmlElement(name = "AlternateLocationDistance", required = true)
    protected List<AlternateLocationDistance> alternateLocationDistance;

    /**
     * Gets the value of the alternateLocationDistance property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the alternateLocationDistance property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAlternateLocationDistance().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AlternateLocationDistance }
     * 
     * 
     */
    public List<AlternateLocationDistance> getAlternateLocationDistance() {
        if (alternateLocationDistance == null) {
            alternateLocationDistance = new ArrayList<AlternateLocationDistance>();
        }
        return this.alternateLocationDistance;
    }

}
