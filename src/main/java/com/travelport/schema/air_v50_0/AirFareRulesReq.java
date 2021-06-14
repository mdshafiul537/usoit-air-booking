
package com.travelport.schema.air_v50_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.travelport.schema.common_v50_0.BaseReq;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.travelport.com/schema/common_v50_0}BaseReq"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element name="AirReservationSelector"&gt;
 *             &lt;complexType&gt;
 *               &lt;complexContent&gt;
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                   &lt;sequence&gt;
 *                     &lt;element ref="{http://www.travelport.com/schema/air_v50_0}FareInfoRef" maxOccurs="999" minOccurs="0"/&gt;
 *                   &lt;/sequence&gt;
 *                   &lt;attribute name="AirReservationLocatorCode" use="required" type="{http://www.travelport.com/schema/common_v50_0}typeLocatorCode" /&gt;
 *                 &lt;/restriction&gt;
 *               &lt;/complexContent&gt;
 *             &lt;/complexType&gt;
 *           &lt;/element&gt;
 *           &lt;element ref="{http://www.travelport.com/schema/air_v50_0}FareRuleLookup" minOccurs="0"/&gt;
 *           &lt;element ref="{http://www.travelport.com/schema/air_v50_0}FareRuleKey" maxOccurs="999"/&gt;
 *           &lt;element ref="{http://www.travelport.com/schema/air_v50_0}AirFareDisplayRuleKey"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/air_v50_0}AirFareRulesModifier" minOccurs="0"/&gt;
 *         &lt;element name="FareRulesFilterCategory" maxOccurs="16" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="CategoryCode" type="{http://www.w3.org/2001/XMLSchema}anyType" maxOccurs="35"/&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="FareInfoRef" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="FareRuleType" type="{http://www.travelport.com/schema/air_v50_0}typeFareRuleType" default="long" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "airReservationSelector",
    "fareRuleLookup",
    "fareRuleKey",
    "airFareDisplayRuleKey",
    "airFareRulesModifier",
    "fareRulesFilterCategory"
})
@XmlRootElement(name = "AirFareRulesReq")
public class AirFareRulesReq
    extends BaseReq
{

    @XmlElement(name = "AirReservationSelector")
    protected AirFareRulesReq.AirReservationSelector airReservationSelector;
    @XmlElement(name = "FareRuleLookup")
    protected FareRuleLookup fareRuleLookup;
    @XmlElement(name = "FareRuleKey")
    protected List<FareRuleKey> fareRuleKey;
    @XmlElement(name = "AirFareDisplayRuleKey")
    protected AirFareDisplayRuleKey airFareDisplayRuleKey;
    @XmlElement(name = "AirFareRulesModifier")
    protected AirFareRulesModifier airFareRulesModifier;
    @XmlElement(name = "FareRulesFilterCategory")
    protected List<AirFareRulesReq.FareRulesFilterCategory> fareRulesFilterCategory;
    @XmlAttribute(name = "FareRuleType")
    protected TypeFareRuleType fareRuleType;

    /**
     * Gets the value of the airReservationSelector property.
     * 
     * @return
     *     possible object is
     *     {@link AirFareRulesReq.AirReservationSelector }
     *     
     */
    public AirFareRulesReq.AirReservationSelector getAirReservationSelector() {
        return airReservationSelector;
    }

    /**
     * Sets the value of the airReservationSelector property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirFareRulesReq.AirReservationSelector }
     *     
     */
    public void setAirReservationSelector(AirFareRulesReq.AirReservationSelector value) {
        this.airReservationSelector = value;
    }

    /**
     * Used to look up fare rules based on the origin, destination, and carrier of the air segment, the fare basis code and the provider code.  Providers: 1P, 1J.
     * 
     * @return
     *     possible object is
     *     {@link FareRuleLookup }
     *     
     */
    public FareRuleLookup getFareRuleLookup() {
        return fareRuleLookup;
    }

    /**
     * Sets the value of the fareRuleLookup property.
     * 
     * @param value
     *     allowed object is
     *     {@link FareRuleLookup }
     *     
     */
    public void setFareRuleLookup(FareRuleLookup value) {
        this.fareRuleLookup = value;
    }

    /**
     * Used to look up fare rules based on a fare rule key. Providers: 1G, 1V, 1P, 1J, ACH.Gets the value of the fareRuleKey property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fareRuleKey property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFareRuleKey().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FareRuleKey }
     * 
     * 
     */
    public List<FareRuleKey> getFareRuleKey() {
        if (fareRuleKey == null) {
            fareRuleKey = new ArrayList<FareRuleKey>();
        }
        return this.fareRuleKey;
    }

    /**
     * Provider: 1G,1V,1P,1J.
     * 
     * @return
     *     possible object is
     *     {@link AirFareDisplayRuleKey }
     *     
     */
    public AirFareDisplayRuleKey getAirFareDisplayRuleKey() {
        return airFareDisplayRuleKey;
    }

    /**
     * Sets the value of the airFareDisplayRuleKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirFareDisplayRuleKey }
     *     
     */
    public void setAirFareDisplayRuleKey(AirFareDisplayRuleKey value) {
        this.airFareDisplayRuleKey = value;
    }

    /**
     * Provider: 1G,1V.
     * 
     * @return
     *     possible object is
     *     {@link AirFareRulesModifier }
     *     
     */
    public AirFareRulesModifier getAirFareRulesModifier() {
        return airFareRulesModifier;
    }

    /**
     * Sets the value of the airFareRulesModifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirFareRulesModifier }
     *     
     */
    public void setAirFareRulesModifier(AirFareRulesModifier value) {
        this.airFareRulesModifier = value;
    }

    /**
     * Gets the value of the fareRulesFilterCategory property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fareRulesFilterCategory property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFareRulesFilterCategory().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AirFareRulesReq.FareRulesFilterCategory }
     * 
     * 
     */
    public List<AirFareRulesReq.FareRulesFilterCategory> getFareRulesFilterCategory() {
        if (fareRulesFilterCategory == null) {
            fareRulesFilterCategory = new ArrayList<AirFareRulesReq.FareRulesFilterCategory>();
        }
        return this.fareRulesFilterCategory;
    }

    /**
     * Gets the value of the fareRuleType property.
     * 
     * @return
     *     possible object is
     *     {@link TypeFareRuleType }
     *     
     */
    public TypeFareRuleType getFareRuleType() {
        if (fareRuleType == null) {
            return TypeFareRuleType.LONG;
        } else {
            return fareRuleType;
        }
    }

    /**
     * Sets the value of the fareRuleType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeFareRuleType }
     *     
     */
    public void setFareRuleType(TypeFareRuleType value) {
        this.fareRuleType = value;
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
     *         &lt;element ref="{http://www.travelport.com/schema/air_v50_0}FareInfoRef" maxOccurs="999" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="AirReservationLocatorCode" use="required" type="{http://www.travelport.com/schema/common_v50_0}typeLocatorCode" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "fareInfoRef"
    })
    public static class AirReservationSelector {

        @XmlElement(name = "FareInfoRef")
        protected List<FareInfoRef> fareInfoRef;
        @XmlAttribute(name = "AirReservationLocatorCode", required = true)
        protected String airReservationLocatorCode;

        /**
         * Gets the value of the fareInfoRef property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the fareInfoRef property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFareInfoRef().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link FareInfoRef }
         * 
         * 
         */
        public List<FareInfoRef> getFareInfoRef() {
            if (fareInfoRef == null) {
                fareInfoRef = new ArrayList<FareInfoRef>();
            }
            return this.fareInfoRef;
        }

        /**
         * Gets the value of the airReservationLocatorCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAirReservationLocatorCode() {
            return airReservationLocatorCode;
        }

        /**
         * Sets the value of the airReservationLocatorCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAirReservationLocatorCode(String value) {
            this.airReservationLocatorCode = value;
        }

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
     *         &lt;element name="CategoryCode" type="{http://www.w3.org/2001/XMLSchema}anyType" maxOccurs="35"/&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="FareInfoRef" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "categoryCode"
    })
    public static class FareRulesFilterCategory {

        @XmlElement(name = "CategoryCode", required = true)
        protected List<Object> categoryCode;
        @XmlAttribute(name = "FareInfoRef")
        protected String fareInfoRef;

        /**
         * Gets the value of the categoryCode property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the categoryCode property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCategoryCode().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Object }
         * 
         * 
         */
        public List<Object> getCategoryCode() {
            if (categoryCode == null) {
                categoryCode = new ArrayList<Object>();
            }
            return this.categoryCode;
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

}
