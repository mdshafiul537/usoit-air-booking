
package com.travelport.schema.common_v50_0;

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
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/common_v50_0}LoyaltyCardRef" maxOccurs="999" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/common_v50_0}DriversLicenseRef" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/common_v50_0}DiscountCardRef" maxOccurs="9" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/common_v50_0}PaymentRef" maxOccurs="3" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Key" type="{http://www.travelport.com/schema/common_v50_0}typeRef" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "loyaltyCardRef",
    "driversLicenseRef",
    "discountCardRef",
    "paymentRef"
})
@XmlRootElement(name = "BookingTravelerRef")
public class BookingTravelerRef {

    @XmlElement(name = "LoyaltyCardRef")
    protected List<LoyaltyCardRef> loyaltyCardRef;
    @XmlElement(name = "DriversLicenseRef")
    protected DriversLicenseRef driversLicenseRef;
    @XmlElement(name = "DiscountCardRef")
    protected List<DiscountCardRef> discountCardRef;
    @XmlElement(name = "PaymentRef")
    protected List<PaymentRef> paymentRef;
    @XmlAttribute(name = "Key")
    protected String key;

    /**
     * Gets the value of the loyaltyCardRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the loyaltyCardRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLoyaltyCardRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LoyaltyCardRef }
     * 
     * 
     */
    public List<LoyaltyCardRef> getLoyaltyCardRef() {
        if (loyaltyCardRef == null) {
            loyaltyCardRef = new ArrayList<LoyaltyCardRef>();
        }
        return this.loyaltyCardRef;
    }

    /**
     * Gets the value of the driversLicenseRef property.
     * 
     * @return
     *     possible object is
     *     {@link DriversLicenseRef }
     *     
     */
    public DriversLicenseRef getDriversLicenseRef() {
        return driversLicenseRef;
    }

    /**
     * Sets the value of the driversLicenseRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link DriversLicenseRef }
     *     
     */
    public void setDriversLicenseRef(DriversLicenseRef value) {
        this.driversLicenseRef = value;
    }

    /**
     * Gets the value of the discountCardRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the discountCardRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDiscountCardRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DiscountCardRef }
     * 
     * 
     */
    public List<DiscountCardRef> getDiscountCardRef() {
        if (discountCardRef == null) {
            discountCardRef = new ArrayList<DiscountCardRef>();
        }
        return this.discountCardRef;
    }

    /**
     * Gets the value of the paymentRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paymentRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaymentRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentRef }
     * 
     * 
     */
    public List<PaymentRef> getPaymentRef() {
        if (paymentRef == null) {
            paymentRef = new ArrayList<PaymentRef>();
        }
        return this.paymentRef;
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

}
