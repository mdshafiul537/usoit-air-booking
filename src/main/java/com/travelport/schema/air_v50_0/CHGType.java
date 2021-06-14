
package com.travelport.schema.air_v50_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 *  PenFee list will be populated 
 * 			
 * 
 * <p>Java class for CHGType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CHGType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PenFee" type="{http://www.travelport.com/schema/air_v50_0}PenFeeType" maxOccurs="2" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CHGType", propOrder = {
    "penFee"
})
public class CHGType {

    @XmlElement(name = "PenFee")
    protected List<PenFeeType> penFee;

    /**
     * Gets the value of the penFee property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the penFee property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPenFee().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PenFeeType }
     * 
     * 
     */
    public List<PenFeeType> getPenFee() {
        if (penFee == null) {
            penFee = new ArrayList<PenFeeType>();
        }
        return this.penFee;
    }

}
