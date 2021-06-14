
package com.travelport.schema.hotel_v50_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import com.travelport.schema.common_v50_0.TypePolicyCodesList;


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
 *         &lt;element name="PolicyCodesList" type="{http://www.travelport.com/schema/common_v50_0}typePolicyCodesList" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.travelport.com/schema/hotel_v50_0}attrPolicyMarkingMaxMinPolicyCodes"/&gt;
 *       &lt;attribute name="MinimumAmount" type="{http://www.travelport.com/schema/common_v50_0}typeMoney" /&gt;
 *       &lt;attribute name="ApproximateMinimumAmount" type="{http://www.travelport.com/schema/common_v50_0}typeMoney" /&gt;
 *       &lt;attribute name="MinAmountRateChanged" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="MaximumAmount" type="{http://www.travelport.com/schema/common_v50_0}typeMoney" /&gt;
 *       &lt;attribute name="ApproximateMaximumAmount" type="{http://www.travelport.com/schema/common_v50_0}typeMoney" /&gt;
 *       &lt;attribute name="MaxAmountRateChanged" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="MinimumStayAmount" type="{http://www.travelport.com/schema/common_v50_0}typeMoney" /&gt;
 *       &lt;attribute name="ApproximateMinimumStayAmount" type="{http://www.travelport.com/schema/common_v50_0}typeMoney" /&gt;
 *       &lt;attribute name="Commission" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="RateSupplier" type="{http://www.travelport.com/schema/common_v50_0}typeThirdPartySupplier" /&gt;
 *       &lt;attribute name="RateSupplierLogo" type="{http://www.w3.org/2001/XMLSchema}anyURI" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "policyCodesList"
})
@XmlRootElement(name = "RateInfo")
public class RateInfo {

    @XmlElement(name = "PolicyCodesList")
    protected TypePolicyCodesList policyCodesList;
    @XmlAttribute(name = "MinimumAmount")
    protected String minimumAmount;
    @XmlAttribute(name = "ApproximateMinimumAmount")
    protected String approximateMinimumAmount;
    @XmlAttribute(name = "MinAmountRateChanged")
    protected Boolean minAmountRateChanged;
    @XmlAttribute(name = "MaximumAmount")
    protected String maximumAmount;
    @XmlAttribute(name = "ApproximateMaximumAmount")
    protected String approximateMaximumAmount;
    @XmlAttribute(name = "MaxAmountRateChanged")
    protected Boolean maxAmountRateChanged;
    @XmlAttribute(name = "MinimumStayAmount")
    protected String minimumStayAmount;
    @XmlAttribute(name = "ApproximateMinimumStayAmount")
    protected String approximateMinimumStayAmount;
    @XmlAttribute(name = "Commission")
    protected String commission;
    @XmlAttribute(name = "RateSupplier")
    protected String rateSupplier;
    @XmlAttribute(name = "RateSupplierLogo")
    @XmlSchemaType(name = "anyURI")
    protected String rateSupplierLogo;
    @XmlAttribute(name = "MinInPolicy")
    protected Boolean minInPolicy;
    @XmlAttribute(name = "MaxInPolicy")
    protected Boolean maxInPolicy;

    /**
     * Gets the value of the policyCodesList property.
     * 
     * @return
     *     possible object is
     *     {@link TypePolicyCodesList }
     *     
     */
    public TypePolicyCodesList getPolicyCodesList() {
        return policyCodesList;
    }

    /**
     * Sets the value of the policyCodesList property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypePolicyCodesList }
     *     
     */
    public void setPolicyCodesList(TypePolicyCodesList value) {
        this.policyCodesList = value;
    }

    /**
     * Gets the value of the minimumAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMinimumAmount() {
        return minimumAmount;
    }

    /**
     * Sets the value of the minimumAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMinimumAmount(String value) {
        this.minimumAmount = value;
    }

    /**
     * Gets the value of the approximateMinimumAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApproximateMinimumAmount() {
        return approximateMinimumAmount;
    }

    /**
     * Sets the value of the approximateMinimumAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApproximateMinimumAmount(String value) {
        this.approximateMinimumAmount = value;
    }

    /**
     * Gets the value of the minAmountRateChanged property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMinAmountRateChanged() {
        return minAmountRateChanged;
    }

    /**
     * Sets the value of the minAmountRateChanged property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMinAmountRateChanged(Boolean value) {
        this.minAmountRateChanged = value;
    }

    /**
     * Gets the value of the maximumAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaximumAmount() {
        return maximumAmount;
    }

    /**
     * Sets the value of the maximumAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaximumAmount(String value) {
        this.maximumAmount = value;
    }

    /**
     * Gets the value of the approximateMaximumAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApproximateMaximumAmount() {
        return approximateMaximumAmount;
    }

    /**
     * Sets the value of the approximateMaximumAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApproximateMaximumAmount(String value) {
        this.approximateMaximumAmount = value;
    }

    /**
     * Gets the value of the maxAmountRateChanged property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMaxAmountRateChanged() {
        return maxAmountRateChanged;
    }

    /**
     * Sets the value of the maxAmountRateChanged property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMaxAmountRateChanged(Boolean value) {
        this.maxAmountRateChanged = value;
    }

    /**
     * Gets the value of the minimumStayAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMinimumStayAmount() {
        return minimumStayAmount;
    }

    /**
     * Sets the value of the minimumStayAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMinimumStayAmount(String value) {
        this.minimumStayAmount = value;
    }

    /**
     * Gets the value of the approximateMinimumStayAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApproximateMinimumStayAmount() {
        return approximateMinimumStayAmount;
    }

    /**
     * Sets the value of the approximateMinimumStayAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApproximateMinimumStayAmount(String value) {
        this.approximateMinimumStayAmount = value;
    }

    /**
     * Gets the value of the commission property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommission() {
        return commission;
    }

    /**
     * Sets the value of the commission property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommission(String value) {
        this.commission = value;
    }

    /**
     * Gets the value of the rateSupplier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRateSupplier() {
        return rateSupplier;
    }

    /**
     * Sets the value of the rateSupplier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRateSupplier(String value) {
        this.rateSupplier = value;
    }

    /**
     * Gets the value of the rateSupplierLogo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRateSupplierLogo() {
        return rateSupplierLogo;
    }

    /**
     * Sets the value of the rateSupplierLogo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRateSupplierLogo(String value) {
        this.rateSupplierLogo = value;
    }

    /**
     * Gets the value of the minInPolicy property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMinInPolicy() {
        return minInPolicy;
    }

    /**
     * Sets the value of the minInPolicy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMinInPolicy(Boolean value) {
        this.minInPolicy = value;
    }

    /**
     * Gets the value of the maxInPolicy property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMaxInPolicy() {
        return maxInPolicy;
    }

    /**
     * Sets the value of the maxInPolicy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMaxInPolicy(Boolean value) {
        this.maxInPolicy = value;
    }

}
