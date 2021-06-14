
package com.travelport.schema.air_v50_0;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.travelport.schema.common_v50_0.Remark;
import com.travelport.schema.common_v50_0.ServiceData;
import com.travelport.schema.common_v50_0.ServiceInfo;
import com.travelport.schema.common_v50_0.TypeElementStatus;
import com.travelport.schema.common_v50_0.TypeFeeInfo;
import com.travelport.schema.common_v50_0.TypePurchaseWindow;
import com.travelport.schema.common_v50_0.TypeTaxInfo;


/**
 * Describes a merchandising service of a
 *                     given type (e.g. Seat) that can be purchased for the indicated
 *                     amount. If this service is for only a given passenger or segment
 *                     the references will indicate the restrictions. If this service
 *                     applies to all passenger or the entire itinerary, the references
 *                     will not be present.
 * 
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/common_v50_0}ServiceData" maxOccurs="999" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/common_v50_0}ServiceInfo" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/common_v50_0}Remark" maxOccurs="999" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/air_v50_0}TaxInfo" maxOccurs="999" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/air_v50_0}FeeInfo" maxOccurs="999" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/air_v50_0}EMD" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/air_v50_0}BundledServices" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/air_v50_0}AdditionalInfo" maxOccurs="16" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/air_v50_0}FeeApplication" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/air_v50_0}Text" maxOccurs="4" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/air_v50_0}PriceRange" maxOccurs="5" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/air_v50_0}TourCode" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/air_v50_0}BrandingInfo" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/air_v50_0}Title" maxOccurs="2" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.travelport.com/schema/common_v50_0}attrProviderSupplier"/&gt;
 *       &lt;attGroup ref="{http://www.travelport.com/schema/common_v50_0}attrElementKeyResults"/&gt;
 *       &lt;attGroup ref="{http://www.travelport.com/schema/common_v50_0}attrPrices"/&gt;
 *       &lt;attribute name="OptionalServicesRuleRef" type="{http://www.travelport.com/schema/common_v50_0}typeRef" /&gt;
 *       &lt;attribute name="Type" use="required" type="{http://www.travelport.com/schema/common_v50_0}typeMerchandisingService" /&gt;
 *       &lt;attribute name="Confirmation" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="SecondaryType" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="PurchaseWindow" type="{http://www.travelport.com/schema/common_v50_0}typePurchaseWindow" /&gt;
 *       &lt;attribute name="Priority" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *       &lt;attribute name="Available" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="Entitled" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="PerTraveler" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" /&gt;
 *       &lt;attribute name="CreateDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *       &lt;attribute name="PaymentRef" type="{http://www.travelport.com/schema/common_v50_0}typeRef" /&gt;
 *       &lt;attribute name="ServiceStatus" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Quantity" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *       &lt;attribute name="SequenceNumber" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *       &lt;attribute name="ServiceSubCode"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;maxLength value="3"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="SSRCode" type="{http://www.travelport.com/schema/common_v50_0}typeSSRCode" /&gt;
 *       &lt;attribute name="IssuanceReason"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;minLength value="1"/&gt;
 *             &lt;maxLength value="1"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="ProviderDefinedType"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;minLength value="1"/&gt;
 *             &lt;maxLength value="16"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="Key" type="{http://www.travelport.com/schema/common_v50_0}typeRef" /&gt;
 *       &lt;attribute name="AssessIndicator" type="{http://www.travelport.com/schema/air_v50_0}typeAssessIndicator" /&gt;
 *       &lt;attribute name="Mileage" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *       &lt;attribute name="ApplicableFFLevel"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&gt;
 *             &lt;minInclusive value="0"/&gt;
 *             &lt;maxInclusive value="9"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="Private" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="SSRFreeText" type="{http://www.travelport.com/schema/common_v50_0}typeSSRFreeText" /&gt;
 *       &lt;attribute name="IsPricingApproximate" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="Chargeable" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="InclusiveOfTax" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="InterlineSettlementAllowed" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="GeographySpecification" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="ExcessWeightRate" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Source" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="ViewableOnly" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="DisplayText" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="WeightInExcess" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="TotalWeight" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="BaggageUnitPrice" type="{http://www.travelport.com/schema/common_v50_0}typeMoney" /&gt;
 *       &lt;attribute name="FirstPiece" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="LastPiece" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="Restricted" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="IsRepriceRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="BookedQuantity" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Group" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="PseudoCityCode" type="{http://www.travelport.com/schema/common_v50_0}typePCC" /&gt;
 *       &lt;attribute name="Tag"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;minLength value="1"/&gt;
 *             &lt;maxLength value="256"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="DisplayOrder"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&gt;
 *             &lt;minInclusive value="0"/&gt;
 *             &lt;maxInclusive value="999"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "serviceData",
    "serviceInfo",
    "remark",
    "taxInfo",
    "feeInfo",
    "emd",
    "bundledServices",
    "additionalInfo",
    "feeApplication",
    "text",
    "priceRange",
    "tourCode",
    "brandingInfo",
    "title"
})
@XmlRootElement(name = "OptionalService")
public class OptionalService {

    @XmlElement(name = "ServiceData", namespace = "http://www.travelport.com/schema/common_v50_0")
    protected List<ServiceData> serviceData;
    @XmlElement(name = "ServiceInfo", namespace = "http://www.travelport.com/schema/common_v50_0")
    protected ServiceInfo serviceInfo;
    @XmlElement(name = "Remark", namespace = "http://www.travelport.com/schema/common_v50_0")
    protected List<Remark> remark;
    @XmlElement(name = "TaxInfo")
    protected List<TypeTaxInfo> taxInfo;
    @XmlElement(name = "FeeInfo")
    protected List<TypeFeeInfo> feeInfo;
    @XmlElement(name = "EMD")
    protected EMD emd;
    @XmlElement(name = "BundledServices")
    protected BundledServices bundledServices;
    @XmlElement(name = "AdditionalInfo")
    protected List<AdditionalInfo> additionalInfo;
    @XmlElement(name = "FeeApplication")
    protected FeeApplication feeApplication;
    @XmlElement(name = "Text")
    protected List<TypeTextElement> text;
    @XmlElement(name = "PriceRange")
    protected List<PriceRange> priceRange;
    @XmlElement(name = "TourCode")
    protected TourCode tourCode;
    @XmlElement(name = "BrandingInfo")
    protected BrandingInfo brandingInfo;
    @XmlElement(name = "Title")
    protected List<TypeTextElement> title;
    @XmlAttribute(name = "OptionalServicesRuleRef")
    protected String optionalServicesRuleRef;
    @XmlAttribute(name = "Type", required = true)
    protected String type;
    @XmlAttribute(name = "Confirmation")
    protected String confirmation;
    @XmlAttribute(name = "SecondaryType")
    protected String secondaryType;
    @XmlAttribute(name = "PurchaseWindow")
    protected TypePurchaseWindow purchaseWindow;
    @XmlAttribute(name = "Priority")
    protected BigInteger priority;
    @XmlAttribute(name = "Available")
    protected Boolean available;
    @XmlAttribute(name = "Entitled")
    protected Boolean entitled;
    @XmlAttribute(name = "PerTraveler")
    protected Boolean perTraveler;
    @XmlAttribute(name = "CreateDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createDate;
    @XmlAttribute(name = "PaymentRef")
    protected String paymentRef;
    @XmlAttribute(name = "ServiceStatus")
    protected String serviceStatus;
    @XmlAttribute(name = "Quantity")
    protected BigInteger quantity;
    @XmlAttribute(name = "SequenceNumber")
    protected BigInteger sequenceNumber;
    @XmlAttribute(name = "ServiceSubCode")
    protected String serviceSubCode;
    @XmlAttribute(name = "SSRCode")
    protected String ssrCode;
    @XmlAttribute(name = "IssuanceReason")
    protected String issuanceReason;
    @XmlAttribute(name = "ProviderDefinedType")
    protected String providerDefinedType;
    @XmlAttribute(name = "Key")
    protected String key;
    @XmlAttribute(name = "AssessIndicator")
    protected TypeAssessIndicator assessIndicator;
    @XmlAttribute(name = "Mileage")
    protected BigInteger mileage;
    @XmlAttribute(name = "ApplicableFFLevel")
    protected Integer applicableFFLevel;
    @XmlAttribute(name = "Private")
    protected Boolean _private;
    @XmlAttribute(name = "SSRFreeText")
    protected String ssrFreeText;
    @XmlAttribute(name = "IsPricingApproximate")
    protected Boolean isPricingApproximate;
    @XmlAttribute(name = "Chargeable")
    protected String chargeable;
    @XmlAttribute(name = "InclusiveOfTax")
    protected Boolean inclusiveOfTax;
    @XmlAttribute(name = "InterlineSettlementAllowed")
    protected Boolean interlineSettlementAllowed;
    @XmlAttribute(name = "GeographySpecification")
    protected String geographySpecification;
    @XmlAttribute(name = "ExcessWeightRate")
    protected String excessWeightRate;
    @XmlAttribute(name = "Source")
    protected String source;
    @XmlAttribute(name = "ViewableOnly")
    protected Boolean viewableOnly;
    @XmlAttribute(name = "DisplayText")
    protected String displayText;
    @XmlAttribute(name = "WeightInExcess")
    protected String weightInExcess;
    @XmlAttribute(name = "TotalWeight")
    protected String totalWeight;
    @XmlAttribute(name = "BaggageUnitPrice")
    protected String baggageUnitPrice;
    @XmlAttribute(name = "FirstPiece")
    protected Integer firstPiece;
    @XmlAttribute(name = "LastPiece")
    protected Integer lastPiece;
    @XmlAttribute(name = "Restricted")
    protected Boolean restricted;
    @XmlAttribute(name = "IsRepriceRequired")
    protected Boolean isRepriceRequired;
    @XmlAttribute(name = "BookedQuantity")
    protected String bookedQuantity;
    @XmlAttribute(name = "Group")
    protected String group;
    @XmlAttribute(name = "PseudoCityCode")
    protected String pseudoCityCode;
    @XmlAttribute(name = "Tag")
    protected String tag;
    @XmlAttribute(name = "DisplayOrder")
    protected Integer displayOrder;
    @XmlAttribute(name = "ProviderCode")
    protected String providerCode;
    @XmlAttribute(name = "SupplierCode")
    protected String supplierCode;
    @XmlAttribute(name = "ElStat")
    protected TypeElementStatus elStat;
    @XmlAttribute(name = "KeyOverride")
    protected Boolean keyOverride;
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
     * Gets the value of the serviceData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serviceData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServiceData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServiceData }
     * 
     * 
     */
    public List<ServiceData> getServiceData() {
        if (serviceData == null) {
            serviceData = new ArrayList<ServiceData>();
        }
        return this.serviceData;
    }

    /**
     * Gets the value of the serviceInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceInfo }
     *     
     */
    public ServiceInfo getServiceInfo() {
        return serviceInfo;
    }

    /**
     * Sets the value of the serviceInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceInfo }
     *     
     */
    public void setServiceInfo(ServiceInfo value) {
        this.serviceInfo = value;
    }

    /**
     * Information regarding any specific
     *                             for this service.Gets the value of the remark property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the remark property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRemark().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Remark }
     * 
     * 
     */
    public List<Remark> getRemark() {
        if (remark == null) {
            remark = new ArrayList<Remark>();
        }
        return this.remark;
    }

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
     * Gets the value of the emd property.
     * 
     * @return
     *     possible object is
     *     {@link EMD }
     *     
     */
    public EMD getEMD() {
        return emd;
    }

    /**
     * Sets the value of the emd property.
     * 
     * @param value
     *     allowed object is
     *     {@link EMD }
     *     
     */
    public void setEMD(EMD value) {
        this.emd = value;
    }

    /**
     * Gets the value of the bundledServices property.
     * 
     * @return
     *     possible object is
     *     {@link BundledServices }
     *     
     */
    public BundledServices getBundledServices() {
        return bundledServices;
    }

    /**
     * Sets the value of the bundledServices property.
     * 
     * @param value
     *     allowed object is
     *     {@link BundledServices }
     *     
     */
    public void setBundledServices(BundledServices value) {
        this.bundledServices = value;
    }

    /**
     * Gets the value of the additionalInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the additionalInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdditionalInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalInfo }
     * 
     * 
     */
    public List<AdditionalInfo> getAdditionalInfo() {
        if (additionalInfo == null) {
            additionalInfo = new ArrayList<AdditionalInfo>();
        }
        return this.additionalInfo;
    }

    /**
     * Specifies how the Optional Service fee is to be applied.  The choices are Per One Way, Per Round Trip, Per Item (Per Piece), Per Travel, Per Ticket, Per 1 Kilo, Per 5 Kilos.  Provider: 1G, 1V, 1P, 1J
     * 
     * @return
     *     possible object is
     *     {@link FeeApplication }
     *     
     */
    public FeeApplication getFeeApplication() {
        return feeApplication;
    }

    /**
     * Sets the value of the feeApplication property.
     * 
     * @param value
     *     allowed object is
     *     {@link FeeApplication }
     *     
     */
    public void setFeeApplication(FeeApplication value) {
        this.feeApplication = value;
    }

    /**
     * Gets the value of the text property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the text property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getText().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeTextElement }
     * 
     * 
     */
    public List<TypeTextElement> getText() {
        if (text == null) {
            text = new ArrayList<TypeTextElement>();
        }
        return this.text;
    }

    /**
     * Gets the value of the priceRange property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the priceRange property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPriceRange().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PriceRange }
     * 
     * 
     */
    public List<PriceRange> getPriceRange() {
        if (priceRange == null) {
            priceRange = new ArrayList<PriceRange>();
        }
        return this.priceRange;
    }

    /**
     * Gets the value of the tourCode property.
     * 
     * @return
     *     possible object is
     *     {@link TourCode }
     *     
     */
    public TourCode getTourCode() {
        return tourCode;
    }

    /**
     * Sets the value of the tourCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link TourCode }
     *     
     */
    public void setTourCode(TourCode value) {
        this.tourCode = value;
    }

    /**
     * Gets the value of the brandingInfo property.
     * 
     * @return
     *     possible object is
     *     {@link BrandingInfo }
     *     
     */
    public BrandingInfo getBrandingInfo() {
        return brandingInfo;
    }

    /**
     * Sets the value of the brandingInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BrandingInfo }
     *     
     */
    public void setBrandingInfo(BrandingInfo value) {
        this.brandingInfo = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the title property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTitle().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeTextElement }
     * 
     * 
     */
    public List<TypeTextElement> getTitle() {
        if (title == null) {
            title = new ArrayList<TypeTextElement>();
        }
        return this.title;
    }

    /**
     * Gets the value of the optionalServicesRuleRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOptionalServicesRuleRef() {
        return optionalServicesRuleRef;
    }

    /**
     * Sets the value of the optionalServicesRuleRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOptionalServicesRuleRef(String value) {
        this.optionalServicesRuleRef = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the confirmation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConfirmation() {
        return confirmation;
    }

    /**
     * Sets the value of the confirmation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConfirmation(String value) {
        this.confirmation = value;
    }

    /**
     * Gets the value of the secondaryType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecondaryType() {
        return secondaryType;
    }

    /**
     * Sets the value of the secondaryType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecondaryType(String value) {
        this.secondaryType = value;
    }

    /**
     * Gets the value of the purchaseWindow property.
     * 
     * @return
     *     possible object is
     *     {@link TypePurchaseWindow }
     *     
     */
    public TypePurchaseWindow getPurchaseWindow() {
        return purchaseWindow;
    }

    /**
     * Sets the value of the purchaseWindow property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypePurchaseWindow }
     *     
     */
    public void setPurchaseWindow(TypePurchaseWindow value) {
        this.purchaseWindow = value;
    }

    /**
     * Gets the value of the priority property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPriority() {
        return priority;
    }

    /**
     * Sets the value of the priority property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPriority(BigInteger value) {
        this.priority = value;
    }

    /**
     * Gets the value of the available property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAvailable() {
        return available;
    }

    /**
     * Sets the value of the available property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAvailable(Boolean value) {
        this.available = value;
    }

    /**
     * Gets the value of the entitled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEntitled() {
        return entitled;
    }

    /**
     * Sets the value of the entitled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEntitled(Boolean value) {
        this.entitled = value;
    }

    /**
     * Gets the value of the perTraveler property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isPerTraveler() {
        if (perTraveler == null) {
            return true;
        } else {
            return perTraveler;
        }
    }

    /**
     * Sets the value of the perTraveler property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPerTraveler(Boolean value) {
        this.perTraveler = value;
    }

    /**
     * Gets the value of the createDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreateDate() {
        return createDate;
    }

    /**
     * Sets the value of the createDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreateDate(XMLGregorianCalendar value) {
        this.createDate = value;
    }

    /**
     * Gets the value of the paymentRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentRef() {
        return paymentRef;
    }

    /**
     * Sets the value of the paymentRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentRef(String value) {
        this.paymentRef = value;
    }

    /**
     * Gets the value of the serviceStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceStatus() {
        return serviceStatus;
    }

    /**
     * Sets the value of the serviceStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceStatus(String value) {
        this.serviceStatus = value;
    }

    /**
     * Gets the value of the quantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setQuantity(BigInteger value) {
        this.quantity = value;
    }

    /**
     * Gets the value of the sequenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSequenceNumber() {
        return sequenceNumber;
    }

    /**
     * Sets the value of the sequenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSequenceNumber(BigInteger value) {
        this.sequenceNumber = value;
    }

    /**
     * Gets the value of the serviceSubCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceSubCode() {
        return serviceSubCode;
    }

    /**
     * Sets the value of the serviceSubCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceSubCode(String value) {
        this.serviceSubCode = value;
    }

    /**
     * Gets the value of the ssrCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSSRCode() {
        return ssrCode;
    }

    /**
     * Sets the value of the ssrCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSSRCode(String value) {
        this.ssrCode = value;
    }

    /**
     * Gets the value of the issuanceReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssuanceReason() {
        return issuanceReason;
    }

    /**
     * Sets the value of the issuanceReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssuanceReason(String value) {
        this.issuanceReason = value;
    }

    /**
     * Gets the value of the providerDefinedType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProviderDefinedType() {
        return providerDefinedType;
    }

    /**
     * Sets the value of the providerDefinedType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProviderDefinedType(String value) {
        this.providerDefinedType = value;
    }

    /**
     * Gets the value of the key property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKey() {
        return key;
    }

    /**
     * Sets the value of the key property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKey(String value) {
        this.key = value;
    }

    /**
     * Gets the value of the assessIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link TypeAssessIndicator }
     *     
     */
    public TypeAssessIndicator getAssessIndicator() {
        return assessIndicator;
    }

    /**
     * Sets the value of the assessIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeAssessIndicator }
     *     
     */
    public void setAssessIndicator(TypeAssessIndicator value) {
        this.assessIndicator = value;
    }

    /**
     * Gets the value of the mileage property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMileage() {
        return mileage;
    }

    /**
     * Sets the value of the mileage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMileage(BigInteger value) {
        this.mileage = value;
    }

    /**
     * Gets the value of the applicableFFLevel property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getApplicableFFLevel() {
        return applicableFFLevel;
    }

    /**
     * Sets the value of the applicableFFLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setApplicableFFLevel(Integer value) {
        this.applicableFFLevel = value;
    }

    /**
     * Gets the value of the private property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPrivate() {
        return _private;
    }

    /**
     * Sets the value of the private property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPrivate(Boolean value) {
        this._private = value;
    }

    /**
     * Gets the value of the ssrFreeText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSSRFreeText() {
        return ssrFreeText;
    }

    /**
     * Sets the value of the ssrFreeText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSSRFreeText(String value) {
        this.ssrFreeText = value;
    }

    /**
     * Gets the value of the isPricingApproximate property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsPricingApproximate() {
        return isPricingApproximate;
    }

    /**
     * Sets the value of the isPricingApproximate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsPricingApproximate(Boolean value) {
        this.isPricingApproximate = value;
    }

    /**
     * Gets the value of the chargeable property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChargeable() {
        return chargeable;
    }

    /**
     * Sets the value of the chargeable property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChargeable(String value) {
        this.chargeable = value;
    }

    /**
     * Gets the value of the inclusiveOfTax property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInclusiveOfTax() {
        return inclusiveOfTax;
    }

    /**
     * Sets the value of the inclusiveOfTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInclusiveOfTax(Boolean value) {
        this.inclusiveOfTax = value;
    }

    /**
     * Gets the value of the interlineSettlementAllowed property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInterlineSettlementAllowed() {
        return interlineSettlementAllowed;
    }

    /**
     * Sets the value of the interlineSettlementAllowed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInterlineSettlementAllowed(Boolean value) {
        this.interlineSettlementAllowed = value;
    }

    /**
     * Gets the value of the geographySpecification property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGeographySpecification() {
        return geographySpecification;
    }

    /**
     * Sets the value of the geographySpecification property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGeographySpecification(String value) {
        this.geographySpecification = value;
    }

    /**
     * Gets the value of the excessWeightRate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExcessWeightRate() {
        return excessWeightRate;
    }

    /**
     * Sets the value of the excessWeightRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExcessWeightRate(String value) {
        this.excessWeightRate = value;
    }

    /**
     * Gets the value of the source property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSource() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSource(String value) {
        this.source = value;
    }

    /**
     * Gets the value of the viewableOnly property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isViewableOnly() {
        return viewableOnly;
    }

    /**
     * Sets the value of the viewableOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setViewableOnly(Boolean value) {
        this.viewableOnly = value;
    }

    /**
     * Gets the value of the displayText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayText() {
        return displayText;
    }

    /**
     * Sets the value of the displayText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayText(String value) {
        this.displayText = value;
    }

    /**
     * Gets the value of the weightInExcess property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWeightInExcess() {
        return weightInExcess;
    }

    /**
     * Sets the value of the weightInExcess property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWeightInExcess(String value) {
        this.weightInExcess = value;
    }

    /**
     * Gets the value of the totalWeight property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalWeight() {
        return totalWeight;
    }

    /**
     * Sets the value of the totalWeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalWeight(String value) {
        this.totalWeight = value;
    }

    /**
     * Gets the value of the baggageUnitPrice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaggageUnitPrice() {
        return baggageUnitPrice;
    }

    /**
     * Sets the value of the baggageUnitPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaggageUnitPrice(String value) {
        this.baggageUnitPrice = value;
    }

    /**
     * Gets the value of the firstPiece property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFirstPiece() {
        return firstPiece;
    }

    /**
     * Sets the value of the firstPiece property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFirstPiece(Integer value) {
        this.firstPiece = value;
    }

    /**
     * Gets the value of the lastPiece property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLastPiece() {
        return lastPiece;
    }

    /**
     * Sets the value of the lastPiece property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLastPiece(Integer value) {
        this.lastPiece = value;
    }

    /**
     * Gets the value of the restricted property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isRestricted() {
        if (restricted == null) {
            return false;
        } else {
            return restricted;
        }
    }

    /**
     * Sets the value of the restricted property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRestricted(Boolean value) {
        this.restricted = value;
    }

    /**
     * Gets the value of the isRepriceRequired property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isIsRepriceRequired() {
        if (isRepriceRequired == null) {
            return false;
        } else {
            return isRepriceRequired;
        }
    }

    /**
     * Sets the value of the isRepriceRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsRepriceRequired(Boolean value) {
        this.isRepriceRequired = value;
    }

    /**
     * Gets the value of the bookedQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBookedQuantity() {
        return bookedQuantity;
    }

    /**
     * Sets the value of the bookedQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBookedQuantity(String value) {
        this.bookedQuantity = value;
    }

    /**
     * Gets the value of the group property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroup() {
        return group;
    }

    /**
     * Sets the value of the group property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroup(String value) {
        this.group = value;
    }

    /**
     * Gets the value of the pseudoCityCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPseudoCityCode() {
        return pseudoCityCode;
    }

    /**
     * Sets the value of the pseudoCityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPseudoCityCode(String value) {
        this.pseudoCityCode = value;
    }

    /**
     * Gets the value of the tag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTag() {
        return tag;
    }

    /**
     * Sets the value of the tag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTag(String value) {
        this.tag = value;
    }

    /**
     * Gets the value of the displayOrder property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDisplayOrder() {
        return displayOrder;
    }

    /**
     * Sets the value of the displayOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDisplayOrder(Integer value) {
        this.displayOrder = value;
    }

    /**
     * Gets the value of the providerCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProviderCode() {
        return providerCode;
    }

    /**
     * Sets the value of the providerCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProviderCode(String value) {
        this.providerCode = value;
    }

    /**
     * Gets the value of the supplierCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupplierCode() {
        return supplierCode;
    }

    /**
     * Sets the value of the supplierCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupplierCode(String value) {
        this.supplierCode = value;
    }

    /**
     * Gets the value of the elStat property.
     * 
     * @return
     *     possible object is
     *     {@link TypeElementStatus }
     *     
     */
    public TypeElementStatus getElStat() {
        return elStat;
    }

    /**
     * Sets the value of the elStat property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeElementStatus }
     *     
     */
    public void setElStat(TypeElementStatus value) {
        this.elStat = value;
    }

    /**
     * Gets the value of the keyOverride property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isKeyOverride() {
        return keyOverride;
    }

    /**
     * Sets the value of the keyOverride property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setKeyOverride(Boolean value) {
        this.keyOverride = value;
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
