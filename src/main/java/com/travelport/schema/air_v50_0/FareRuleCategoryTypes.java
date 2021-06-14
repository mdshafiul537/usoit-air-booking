
package com.travelport.schema.air_v50_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FareRuleCategoryTypes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FareRuleCategoryTypes"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CategoryDetails" type="{http://www.travelport.com/schema/air_v50_0}ValueDetails" maxOccurs="99" minOccurs="0"/&gt;
 *         &lt;element name="VariableCategoryDetails" type="{http://www.travelport.com/schema/air_v50_0}VariableCategoryType" maxOccurs="99" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Value" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FareRuleCategoryTypes", propOrder = {
    "categoryDetails",
    "variableCategoryDetails"
})
public class FareRuleCategoryTypes {

    @XmlElement(name = "CategoryDetails")
    protected List<ValueDetails> categoryDetails;
    @XmlElement(name = "VariableCategoryDetails")
    protected List<VariableCategoryType> variableCategoryDetails;
    @XmlAttribute(name = "Value", required = true)
    protected String value;

    /**
     * Gets the value of the categoryDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the categoryDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCategoryDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ValueDetails }
     * 
     * 
     */
    public List<ValueDetails> getCategoryDetails() {
        if (categoryDetails == null) {
            categoryDetails = new ArrayList<ValueDetails>();
        }
        return this.categoryDetails;
    }

    /**
     * Gets the value of the variableCategoryDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the variableCategoryDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVariableCategoryDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VariableCategoryType }
     * 
     * 
     */
    public List<VariableCategoryType> getVariableCategoryDetails() {
        if (variableCategoryDetails == null) {
            variableCategoryDetails = new ArrayList<VariableCategoryType>();
        }
        return this.variableCategoryDetails;
    }

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
