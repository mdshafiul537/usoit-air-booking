
package com.travelport.schema.air_v50_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StructuredFareRulesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StructuredFareRulesType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FareRuleCategoryType" type="{http://www.travelport.com/schema/air_v50_0}FareRuleCategoryTypes" maxOccurs="99" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StructuredFareRulesType", propOrder = {
    "fareRuleCategoryType"
})
public class StructuredFareRulesType {

    @XmlElement(name = "FareRuleCategoryType")
    protected List<FareRuleCategoryTypes> fareRuleCategoryType;

    /**
     * Gets the value of the fareRuleCategoryType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fareRuleCategoryType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFareRuleCategoryType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FareRuleCategoryTypes }
     * 
     * 
     */
    public List<FareRuleCategoryTypes> getFareRuleCategoryType() {
        if (fareRuleCategoryType == null) {
            fareRuleCategoryType = new ArrayList<FareRuleCategoryTypes>();
        }
        return this.fareRuleCategoryType;
    }

}
