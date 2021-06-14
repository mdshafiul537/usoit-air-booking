
package com.travelport.schema.air_v50_0;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.travelport.schema.common_v50_0.FormOfPayment;
import com.travelport.schema.common_v50_0.SearchPassenger;


/**
 * 
 *             Base Low Fare Search Request
 *         
 * 
 * <p>Java class for BaseLowFareSearchReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BaseLowFareSearchReq"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.travelport.com/schema/air_v50_0}BaseAirSearchReq"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/common_v50_0}SearchPassenger" maxOccurs="18"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/air_v50_0}AirPricingModifiers" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/air_v50_0}Enumeration" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/air_v50_0}AirExchangeModifiers" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/air_v50_0}FlexExploreModifiers" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/air_v50_0}PCC" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/air_v50_0}FareRulesFilterCategory" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/common_v50_0}FormOfPayment" maxOccurs="99" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="EnablePointToPointSearch" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="EnablePointToPointAlternates" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="MaxNumberOfExpertSolutions" type="{http://www.w3.org/2001/XMLSchema}integer" default="0" /&gt;
 *       &lt;attribute name="SolutionResult" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="PreferCompleteItinerary" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" /&gt;
 *       &lt;attribute name="MetaOptionIdentifier"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;minLength value="1"/&gt;
 *             &lt;maxLength value="2"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="ReturnUpsellFare" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="IncludeFareInfoMessages" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="ReturnBrandedFares" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" /&gt;
 *       &lt;attribute name="MultiGDSSearch" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="ReturnMM" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="CheckOBFees" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="NSCC"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;minLength value="1"/&gt;
 *             &lt;maxLength value="3"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="FareInfoRules" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="MostRestrictivePenalties" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseLowFareSearchReq", propOrder = {
    "searchPassenger",
    "airPricingModifiers",
    "enumeration",
    "airExchangeModifiers",
    "flexExploreModifiers",
    "pcc",
    "fareRulesFilterCategory",
    "formOfPayment"
})
@XmlSeeAlso({
    LowFareSearchReq.class
})
public class BaseLowFareSearchReq
    extends BaseAirSearchReq
{

    @XmlElement(name = "SearchPassenger", namespace = "http://www.travelport.com/schema/common_v50_0", required = true)
    protected List<SearchPassenger> searchPassenger;
    @XmlElement(name = "AirPricingModifiers")
    protected AirPricingModifiers airPricingModifiers;
    @XmlElement(name = "Enumeration")
    protected Enumeration enumeration;
    @XmlElement(name = "AirExchangeModifiers")
    protected AirExchangeModifiers airExchangeModifiers;
    @XmlElement(name = "FlexExploreModifiers")
    protected FlexExploreModifiers flexExploreModifiers;
    @XmlElement(name = "PCC")
    protected PCC pcc;
    @XmlElement(name = "FareRulesFilterCategory")
    protected FareRulesFilterCategory fareRulesFilterCategory;
    @XmlElement(name = "FormOfPayment", namespace = "http://www.travelport.com/schema/common_v50_0")
    protected List<FormOfPayment> formOfPayment;
    @XmlAttribute(name = "EnablePointToPointSearch")
    protected Boolean enablePointToPointSearch;
    @XmlAttribute(name = "EnablePointToPointAlternates")
    protected Boolean enablePointToPointAlternates;
    @XmlAttribute(name = "MaxNumberOfExpertSolutions")
    protected BigInteger maxNumberOfExpertSolutions;
    @XmlAttribute(name = "SolutionResult")
    protected Boolean solutionResult;
    @XmlAttribute(name = "PreferCompleteItinerary")
    protected Boolean preferCompleteItinerary;
    @XmlAttribute(name = "MetaOptionIdentifier")
    protected String metaOptionIdentifier;
    @XmlAttribute(name = "ReturnUpsellFare")
    protected Boolean returnUpsellFare;
    @XmlAttribute(name = "IncludeFareInfoMessages")
    protected Boolean includeFareInfoMessages;
    @XmlAttribute(name = "ReturnBrandedFares")
    protected Boolean returnBrandedFares;
    @XmlAttribute(name = "MultiGDSSearch")
    protected Boolean multiGDSSearch;
    @XmlAttribute(name = "ReturnMM")
    protected Boolean returnMM;
    @XmlAttribute(name = "CheckOBFees")
    protected String checkOBFees;
    @XmlAttribute(name = "NSCC")
    protected String nscc;
    @XmlAttribute(name = "FareInfoRules")
    protected Boolean fareInfoRules;
    @XmlAttribute(name = "MostRestrictivePenalties")
    protected Boolean mostRestrictivePenalties;

    /**
     * Provider: 1G,1V,1P,1J,ACH-Maxinumber of passenger increased in to 18 to support 9 INF passenger along with 9 ADT,CHD,INS 					passenger Gets the value of the searchPassenger property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the searchPassenger property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSearchPassenger().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchPassenger }
     * 
     * 
     */
    public List<SearchPassenger> getSearchPassenger() {
        if (searchPassenger == null) {
            searchPassenger = new ArrayList<SearchPassenger>();
        }
        return this.searchPassenger;
    }

    /**
     * Provider: 1G,1V,1P,1J,ACH.
     * 
     * @return
     *     possible object is
     *     {@link AirPricingModifiers }
     *     
     */
    public AirPricingModifiers getAirPricingModifiers() {
        return airPricingModifiers;
    }

    /**
     * Sets the value of the airPricingModifiers property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirPricingModifiers }
     *     
     */
    public void setAirPricingModifiers(AirPricingModifiers value) {
        this.airPricingModifiers = value;
    }

    /**
     * Provider: 1G,1V,1P,1J,ACH.
     * 
     * @return
     *     possible object is
     *     {@link Enumeration }
     *     
     */
    public Enumeration getEnumeration() {
        return enumeration;
    }

    /**
     * Sets the value of the enumeration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Enumeration }
     *     
     */
    public void setEnumeration(Enumeration value) {
        this.enumeration = value;
    }

    /**
     * Provider: ACH.
     * 
     * @return
     *     possible object is
     *     {@link AirExchangeModifiers }
     *     
     */
    public AirExchangeModifiers getAirExchangeModifiers() {
        return airExchangeModifiers;
    }

    /**
     * Sets the value of the airExchangeModifiers property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirExchangeModifiers }
     *     
     */
    public void setAirExchangeModifiers(AirExchangeModifiers value) {
        this.airExchangeModifiers = value;
    }

    /**
     * This is the container for a set of modifiers which allow the user to perform a special kind of low fare search, depicted as flex explore, based on different parameters like Area, Zone, Country, State, Specific locations, Distance around the actual destination of the itinerary. Applicable for providers 1G,1V,1P.
     * 
     * @return
     *     possible object is
     *     {@link FlexExploreModifiers }
     *     
     */
    public FlexExploreModifiers getFlexExploreModifiers() {
        return flexExploreModifiers;
    }

    /**
     * Sets the value of the flexExploreModifiers property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlexExploreModifiers }
     *     
     */
    public void setFlexExploreModifiers(FlexExploreModifiers value) {
        this.flexExploreModifiers = value;
    }

    /**
     * Gets the value of the pcc property.
     * 
     * @return
     *     possible object is
     *     {@link PCC }
     *     
     */
    public PCC getPCC() {
        return pcc;
    }

    /**
     * Sets the value of the pcc property.
     * 
     * @param value
     *     allowed object is
     *     {@link PCC }
     *     
     */
    public void setPCC(PCC value) {
        this.pcc = value;
    }

    /**
     * Gets the value of the fareRulesFilterCategory property.
     * 
     * @return
     *     possible object is
     *     {@link FareRulesFilterCategory }
     *     
     */
    public FareRulesFilterCategory getFareRulesFilterCategory() {
        return fareRulesFilterCategory;
    }

    /**
     * Sets the value of the fareRulesFilterCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link FareRulesFilterCategory }
     *     
     */
    public void setFareRulesFilterCategory(FareRulesFilterCategory value) {
        this.fareRulesFilterCategory = value;
    }

    /**
     * Provider: 1P,1J Gets the value of the formOfPayment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the formOfPayment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFormOfPayment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FormOfPayment }
     * 
     * 
     */
    public List<FormOfPayment> getFormOfPayment() {
        if (formOfPayment == null) {
            formOfPayment = new ArrayList<FormOfPayment>();
        }
        return this.formOfPayment;
    }

    /**
     * Gets the value of the enablePointToPointSearch property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isEnablePointToPointSearch() {
        if (enablePointToPointSearch == null) {
            return false;
        } else {
            return enablePointToPointSearch;
        }
    }

    /**
     * Sets the value of the enablePointToPointSearch property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnablePointToPointSearch(Boolean value) {
        this.enablePointToPointSearch = value;
    }

    /**
     * Gets the value of the enablePointToPointAlternates property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isEnablePointToPointAlternates() {
        if (enablePointToPointAlternates == null) {
            return false;
        } else {
            return enablePointToPointAlternates;
        }
    }

    /**
     * Sets the value of the enablePointToPointAlternates property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnablePointToPointAlternates(Boolean value) {
        this.enablePointToPointAlternates = value;
    }

    /**
     * Gets the value of the maxNumberOfExpertSolutions property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaxNumberOfExpertSolutions() {
        if (maxNumberOfExpertSolutions == null) {
            return new BigInteger("0");
        } else {
            return maxNumberOfExpertSolutions;
        }
    }

    /**
     * Sets the value of the maxNumberOfExpertSolutions property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaxNumberOfExpertSolutions(BigInteger value) {
        this.maxNumberOfExpertSolutions = value;
    }

    /**
     * Gets the value of the solutionResult property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isSolutionResult() {
        if (solutionResult == null) {
            return false;
        } else {
            return solutionResult;
        }
    }

    /**
     * Sets the value of the solutionResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSolutionResult(Boolean value) {
        this.solutionResult = value;
    }

    /**
     * Gets the value of the preferCompleteItinerary property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isPreferCompleteItinerary() {
        if (preferCompleteItinerary == null) {
            return true;
        } else {
            return preferCompleteItinerary;
        }
    }

    /**
     * Sets the value of the preferCompleteItinerary property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPreferCompleteItinerary(Boolean value) {
        this.preferCompleteItinerary = value;
    }

    /**
     * Gets the value of the metaOptionIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMetaOptionIdentifier() {
        return metaOptionIdentifier;
    }

    /**
     * Sets the value of the metaOptionIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMetaOptionIdentifier(String value) {
        this.metaOptionIdentifier = value;
    }

    /**
     * Gets the value of the returnUpsellFare property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isReturnUpsellFare() {
        if (returnUpsellFare == null) {
            return false;
        } else {
            return returnUpsellFare;
        }
    }

    /**
     * Sets the value of the returnUpsellFare property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReturnUpsellFare(Boolean value) {
        this.returnUpsellFare = value;
    }

    /**
     * Gets the value of the includeFareInfoMessages property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isIncludeFareInfoMessages() {
        if (includeFareInfoMessages == null) {
            return false;
        } else {
            return includeFareInfoMessages;
        }
    }

    /**
     * Sets the value of the includeFareInfoMessages property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeFareInfoMessages(Boolean value) {
        this.includeFareInfoMessages = value;
    }

    /**
     * Gets the value of the returnBrandedFares property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isReturnBrandedFares() {
        if (returnBrandedFares == null) {
            return true;
        } else {
            return returnBrandedFares;
        }
    }

    /**
     * Sets the value of the returnBrandedFares property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReturnBrandedFares(Boolean value) {
        this.returnBrandedFares = value;
    }

    /**
     * Gets the value of the multiGDSSearch property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isMultiGDSSearch() {
        if (multiGDSSearch == null) {
            return false;
        } else {
            return multiGDSSearch;
        }
    }

    /**
     * Sets the value of the multiGDSSearch property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMultiGDSSearch(Boolean value) {
        this.multiGDSSearch = value;
    }

    /**
     * Gets the value of the returnMM property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isReturnMM() {
        if (returnMM == null) {
            return false;
        } else {
            return returnMM;
        }
    }

    /**
     * Sets the value of the returnMM property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReturnMM(Boolean value) {
        this.returnMM = value;
    }

    /**
     * Gets the value of the checkOBFees property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCheckOBFees() {
        return checkOBFees;
    }

    /**
     * Sets the value of the checkOBFees property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCheckOBFees(String value) {
        this.checkOBFees = value;
    }

    /**
     * Gets the value of the nscc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNSCC() {
        return nscc;
    }

    /**
     * Sets the value of the nscc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNSCC(String value) {
        this.nscc = value;
    }

    /**
     * Gets the value of the fareInfoRules property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isFareInfoRules() {
        if (fareInfoRules == null) {
            return false;
        } else {
            return fareInfoRules;
        }
    }

    /**
     * Sets the value of the fareInfoRules property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFareInfoRules(Boolean value) {
        this.fareInfoRules = value;
    }

    /**
     * Gets the value of the mostRestrictivePenalties property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isMostRestrictivePenalties() {
        if (mostRestrictivePenalties == null) {
            return false;
        } else {
            return mostRestrictivePenalties;
        }
    }

    /**
     * Sets the value of the mostRestrictivePenalties property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMostRestrictivePenalties(Boolean value) {
        this.mostRestrictivePenalties = value;
    }

}
