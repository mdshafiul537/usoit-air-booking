
package com.travelport.schema.air_v50_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
 *     &lt;extension base="{http://www.travelport.com/schema/air_v50_0}BaseBaggageAllowanceInfo"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/air_v50_0}BagDetails" maxOccurs="999" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="TravelerType" type="{http://www.travelport.com/schema/common_v50_0}typePTC" /&gt;
 *       &lt;attribute name="FareInfoRef" type="{http://www.travelport.com/schema/common_v50_0}typeRef" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "bagDetails"
})
@XmlRootElement(name = "BaggageAllowanceInfo")
public class BaggageAllowanceInfo
    extends BaseBaggageAllowanceInfo
{

    @XmlElement(name = "BagDetails")
    protected List<BagDetails> bagDetails;
    @XmlAttribute(name = "TravelerType")
    protected String travelerType;
    @XmlAttribute(name = "FareInfoRef")
    protected String fareInfoRef;

    /**
     * Gets the value of the bagDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bagDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBagDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BagDetails }
     * 
     * 
     */
    public List<BagDetails> getBagDetails() {
        if (bagDetails == null) {
            bagDetails = new ArrayList<BagDetails>();
        }
        return this.bagDetails;
    }

    /**
     * Gets the value of the travelerType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTravelerType() {
        return travelerType;
    }

    /**
     * Sets the value of the travelerType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTravelerType(String value) {
        this.travelerType = value;
    }

    /**
     * Gets the value of the fareInfoRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFareInfoRef() {
        return fareInfoRef;
    }

    /**
     * Sets the value of the fareInfoRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFareInfoRef(String value) {
        this.fareInfoRef = value;
    }

}
