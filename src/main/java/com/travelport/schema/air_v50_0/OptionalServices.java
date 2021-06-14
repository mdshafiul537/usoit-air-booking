
package com.travelport.schema.air_v50_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.travelport.schema.common_v50_0.ServiceRuleType;
import com.travelport.schema.common_v50_0.TypeFeeInfo;
import com.travelport.schema.common_v50_0.TypeTaxInfo;


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
 *         &lt;element name="OptionalServicesTotal" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://www.travelport.com/schema/air_v50_0}TaxInfo" maxOccurs="999" minOccurs="0"/&gt;
 *                   &lt;element ref="{http://www.travelport.com/schema/air_v50_0}FeeInfo" maxOccurs="999" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attGroup ref="{http://www.travelport.com/schema/common_v50_0}attrPrices"/&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/air_v50_0}OptionalService" maxOccurs="999"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/air_v50_0}GroupedOptionInfo" maxOccurs="999" minOccurs="0"/&gt;
 *         &lt;element name="OptionalServiceRules" type="{http://www.travelport.com/schema/common_v50_0}ServiceRuleType" maxOccurs="999" minOccurs="0"/&gt;
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
    "optionalServicesTotal",
    "optionalService",
    "groupedOptionInfo",
    "optionalServiceRules"
})
@XmlRootElement(name = "OptionalServices")
public class OptionalServices {

    @XmlElement(name = "OptionalServicesTotal")
    protected OptionalServices.OptionalServicesTotal optionalServicesTotal;
    @XmlElement(name = "OptionalService", required = true)
    protected List<OptionalService> optionalService;
    @XmlElement(name = "GroupedOptionInfo")
    protected List<GroupedOptionInfo> groupedOptionInfo;
    @XmlElement(name = "OptionalServiceRules")
    protected List<ServiceRuleType> optionalServiceRules;

    /**
     * Gets the value of the optionalServicesTotal property.
     * 
     * @return
     *     possible object is
     *     {@link OptionalServices.OptionalServicesTotal }
     *     
     */
    public OptionalServices.OptionalServicesTotal getOptionalServicesTotal() {
        return optionalServicesTotal;
    }

    /**
     * Sets the value of the optionalServicesTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link OptionalServices.OptionalServicesTotal }
     *     
     */
    public void setOptionalServicesTotal(OptionalServices.OptionalServicesTotal value) {
        this.optionalServicesTotal = value;
    }

    /**
     * Gets the value of the optionalService property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the optionalService property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOptionalService().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OptionalService }
     * 
     * 
     */
    public List<OptionalService> getOptionalService() {
        if (optionalService == null) {
            optionalService = new ArrayList<OptionalService>();
        }
        return this.optionalService;
    }

    /**
     * Details about an unselected or "other" option when optional services are grouped together.Gets the value of the groupedOptionInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the groupedOptionInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGroupedOptionInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GroupedOptionInfo }
     * 
     * 
     */
    public List<GroupedOptionInfo> getGroupedOptionInfo() {
        if (groupedOptionInfo == null) {
            groupedOptionInfo = new ArrayList<GroupedOptionInfo>();
        }
        return this.groupedOptionInfo;
    }

    /**
     * Gets the value of the optionalServiceRules property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the optionalServiceRules property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOptionalServiceRules().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServiceRuleType }
     * 
     * 
     */
    public List<ServiceRuleType> getOptionalServiceRules() {
        if (optionalServiceRules == null) {
            optionalServiceRules = new ArrayList<ServiceRuleType>();
        }
        return this.optionalServiceRules;
    }


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
     *         &lt;element ref="{http://www.travelport.com/schema/air_v50_0}TaxInfo" maxOccurs="999" minOccurs="0"/&gt;
     *         &lt;element ref="{http://www.travelport.com/schema/air_v50_0}FeeInfo" maxOccurs="999" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *       &lt;attGroup ref="{http://www.travelport.com/schema/common_v50_0}attrPrices"/&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "taxInfo",
        "feeInfo"
    })
    public static class OptionalServicesTotal {

        @XmlElement(name = "TaxInfo")
        protected List<TypeTaxInfo> taxInfo;
        @XmlElement(name = "FeeInfo")
        protected List<TypeFeeInfo> feeInfo;
        @XmlAttribute(name = "TotalPrice")
        protected String totalPrice;
        @XmlAttribute(name = "BasePrice")
        protected String basePrice;
        @XmlAttribute(name = "ApproximateTotalPrice")
        protected String approximateTotalPrice;
        @XmlAttribute(name = "ApproximateBasePrice")
        protected String approximateBasePrice;
        @XmlAttribute(name = "EquivalentBasePrice")
        protected String equivalentBasePrice;
        @XmlAttribute(name = "Taxes")
        protected String taxes;
        @XmlAttribute(name = "Fees")
        protected String fees;
        @XmlAttribute(name = "Services")
        protected String services;
        @XmlAttribute(name = "ApproximateTaxes")
        protected String approximateTaxes;
        @XmlAttribute(name = "ApproximateFees")
        protected String approximateFees;

        /**
         * Gets the value of the taxInfo property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the taxInfo property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTaxInfo().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TypeTaxInfo }
         * 
         * 
         */
        public List<TypeTaxInfo> getTaxInfo() {
            if (taxInfo == null) {
                taxInfo = new ArrayList<TypeTaxInfo>();
            }
            return this.taxInfo;
        }

        /**
         * Gets the value of the feeInfo property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the feeInfo property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFeeInfo().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TypeFeeInfo }
         * 
         * 
         */
        public List<TypeFeeInfo> getFeeInfo() {
            if (feeInfo == null) {
                feeInfo = new ArrayList<TypeFeeInfo>();
            }
            return this.feeInfo;
        }

        /**
         * Gets the value of the totalPrice property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTotalPrice() {
            return totalPrice;
        }

        /**
         * Sets the value of the totalPrice property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTotalPrice(String value) {
            this.totalPrice = value;
        }

        /**
         * Gets the value of the basePrice property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBasePrice() {
            return basePrice;
        }

        /**
         * Sets the value of the basePrice property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBasePrice(String value) {
            this.basePrice = value;
        }

        /**
         * Gets the value of the approximateTotalPrice property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getApproximateTotalPrice() {
            return approximateTotalPrice;
        }

        /**
         * Sets the value of the approximateTotalPrice property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setApproximateTotalPrice(String value) {
            this.approximateTotalPrice = value;
        }

        /**
         * Gets the value of the approximateBasePrice property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getApproximateBasePrice() {
            return approximateBasePrice;
        }

        /**
         * Sets the value of the approximateBasePrice property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setApproximateBasePrice(String value) {
            this.approximateBasePrice = value;
        }

        /**
         * Gets the value of the equivalentBasePrice property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEquivalentBasePrice() {
            return equivalentBasePrice;
        }

        /**
         * Sets the value of the equivalentBasePrice property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEquivalentBasePrice(String value) {
            this.equivalentBasePrice = value;
        }

        /**
         * Gets the value of the taxes property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTaxes() {
            return taxes;
        }

        /**
         * Sets the value of the taxes property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTaxes(String value) {
            this.taxes = value;
        }

        /**
         * Gets the value of the fees property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFees() {
            return fees;
        }

        /**
         * Sets the value of the fees property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFees(String value) {
            this.fees = value;
        }

        /**
         * Gets the value of the services property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getServices() {
            return services;
        }

        /**
         * Sets the value of the services property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setServices(String value) {
            this.services = value;
        }

        /**
         * Gets the value of the approximateTaxes property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getApproximateTaxes() {
            return approximateTaxes;
        }

        /**
         * Sets the value of the approximateTaxes property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setApproximateTaxes(String value) {
            this.approximateTaxes = value;
        }

        /**
         * Gets the value of the approximateFees property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getApproximateFees() {
            return approximateFees;
        }

        /**
         * Sets the value of the approximateFees property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setApproximateFees(String value) {
            this.approximateFees = value;
        }

    }

}
