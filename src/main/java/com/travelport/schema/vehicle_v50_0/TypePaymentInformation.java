
package com.travelport.schema.vehicle_v50_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.travelport.schema.common_v50_0.TypeVoucherInformation;


/**
 * <p>Java class for typePaymentInformation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="typePaymentInformation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Voucher" type="{http://www.travelport.com/schema/common_v50_0}typeVoucherInformation" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="BillingNumber" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="BillingReferenceNumber" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="PrePayment"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;maxLength value="90"/&gt;
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
@XmlType(name = "typePaymentInformation", propOrder = {
    "voucher"
})
@XmlSeeAlso({
    PaymentInformation.class
})
public class TypePaymentInformation {

    @XmlElement(name = "Voucher")
    protected TypeVoucherInformation voucher;
    @XmlAttribute(name = "BillingNumber")
    protected String billingNumber;
    @XmlAttribute(name = "BillingReferenceNumber")
    protected String billingReferenceNumber;
    @XmlAttribute(name = "PrePayment")
    protected String prePayment;

    /**
     * Gets the value of the voucher property.
     * 
     * @return
     *     possible object is
     *     {@link TypeVoucherInformation }
     *     
     */
    public TypeVoucherInformation getVoucher() {
        return voucher;
    }

    /**
     * Sets the value of the voucher property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeVoucherInformation }
     *     
     */
    public void setVoucher(TypeVoucherInformation value) {
        this.voucher = value;
    }

    /**
     * Gets the value of the billingNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillingNumber() {
        return billingNumber;
    }

    /**
     * Sets the value of the billingNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillingNumber(String value) {
        this.billingNumber = value;
    }

    /**
     * Gets the value of the billingReferenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillingReferenceNumber() {
        return billingReferenceNumber;
    }

    /**
     * Sets the value of the billingReferenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillingReferenceNumber(String value) {
        this.billingReferenceNumber = value;
    }

    /**
     * Gets the value of the prePayment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrePayment() {
        return prePayment;
    }

    /**
     * Sets the value of the prePayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrePayment(String value) {
        this.prePayment = value;
    }

}
