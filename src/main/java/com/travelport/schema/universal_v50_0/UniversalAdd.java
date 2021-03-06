
package com.travelport.schema.universal_v50_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.travelport.schema.common_v50_0.AccountingRemark;
import com.travelport.schema.common_v50_0.ActionStatus;
import com.travelport.schema.common_v50_0.AgencyContactInfo;
import com.travelport.schema.common_v50_0.BookingTravelerInfo;
import com.travelport.schema.common_v50_0.CommissionRemark;
import com.travelport.schema.common_v50_0.ConsolidatorRemark;
import com.travelport.schema.common_v50_0.CustomerID;
import com.travelport.schema.common_v50_0.FormOfPayment;
import com.travelport.schema.common_v50_0.GeneralRemark;
import com.travelport.schema.common_v50_0.InvoiceRemark;
import com.travelport.schema.common_v50_0.LinkedUniversalRecord;
import com.travelport.schema.common_v50_0.OSI;
import com.travelport.schema.common_v50_0.Postscript;
import com.travelport.schema.common_v50_0.ReviewBooking;
import com.travelport.schema.common_v50_0.ServiceFeeInfo;
import com.travelport.schema.common_v50_0.UnassociatedRemark;
import com.travelport.schema.common_v50_0.XMLRemark;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/common_v50_0}AccountingRemark" maxOccurs="999" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/common_v50_0}GeneralRemark" maxOccurs="999" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/common_v50_0}OSI" maxOccurs="999" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/common_v50_0}UnassociatedRemark" maxOccurs="999" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/common_v50_0}XMLRemark" maxOccurs="999" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/common_v50_0}Postscript" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/common_v50_0}BookingTravelerInfo" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/common_v50_0}ServiceFeeInfo" maxOccurs="999" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/common_v50_0}LinkedUniversalRecord" maxOccurs="999" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/common_v50_0}AgencyContactInfo" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/common_v50_0}CustomerID" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/common_v50_0}CommissionRemark" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/common_v50_0}ConsolidatorRemark" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/common_v50_0}InvoiceRemark" maxOccurs="999" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/common_v50_0}ActionStatus" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/common_v50_0}ReviewBooking" maxOccurs="999" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/common_v50_0}FormOfPayment" maxOccurs="999" minOccurs="0"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "accountingRemark",
    "generalRemark",
    "osi",
    "unassociatedRemark",
    "xmlRemark",
    "postscript",
    "bookingTravelerInfo",
    "serviceFeeInfo",
    "linkedUniversalRecord",
    "agencyContactInfo",
    "customerID",
    "commissionRemark",
    "consolidatorRemark",
    "invoiceRemark",
    "actionStatus",
    "reviewBooking",
    "formOfPayment"
})
@XmlRootElement(name = "UniversalAdd")
public class UniversalAdd {

    @XmlElement(name = "AccountingRemark", namespace = "http://www.travelport.com/schema/common_v50_0")
    protected List<AccountingRemark> accountingRemark;
    @XmlElement(name = "GeneralRemark", namespace = "http://www.travelport.com/schema/common_v50_0")
    protected List<GeneralRemark> generalRemark;
    @XmlElement(name = "OSI", namespace = "http://www.travelport.com/schema/common_v50_0")
    protected List<OSI> osi;
    @XmlElement(name = "UnassociatedRemark", namespace = "http://www.travelport.com/schema/common_v50_0")
    protected List<UnassociatedRemark> unassociatedRemark;
    @XmlElement(name = "XMLRemark", namespace = "http://www.travelport.com/schema/common_v50_0")
    protected List<XMLRemark> xmlRemark;
    @XmlElement(name = "Postscript", namespace = "http://www.travelport.com/schema/common_v50_0")
    protected Postscript postscript;
    @XmlElement(name = "BookingTravelerInfo", namespace = "http://www.travelport.com/schema/common_v50_0")
    protected BookingTravelerInfo bookingTravelerInfo;
    @XmlElement(name = "ServiceFeeInfo", namespace = "http://www.travelport.com/schema/common_v50_0")
    protected List<ServiceFeeInfo> serviceFeeInfo;
    @XmlElement(name = "LinkedUniversalRecord", namespace = "http://www.travelport.com/schema/common_v50_0")
    protected List<LinkedUniversalRecord> linkedUniversalRecord;
    @XmlElement(name = "AgencyContactInfo", namespace = "http://www.travelport.com/schema/common_v50_0")
    protected AgencyContactInfo agencyContactInfo;
    @XmlElement(name = "CustomerID", namespace = "http://www.travelport.com/schema/common_v50_0")
    protected CustomerID customerID;
    @XmlElement(name = "CommissionRemark", namespace = "http://www.travelport.com/schema/common_v50_0")
    protected CommissionRemark commissionRemark;
    @XmlElement(name = "ConsolidatorRemark", namespace = "http://www.travelport.com/schema/common_v50_0")
    protected ConsolidatorRemark consolidatorRemark;
    @XmlElement(name = "InvoiceRemark", namespace = "http://www.travelport.com/schema/common_v50_0")
    protected List<InvoiceRemark> invoiceRemark;
    @XmlElement(name = "ActionStatus", namespace = "http://www.travelport.com/schema/common_v50_0")
    protected ActionStatus actionStatus;
    @XmlElement(name = "ReviewBooking", namespace = "http://www.travelport.com/schema/common_v50_0")
    protected List<ReviewBooking> reviewBooking;
    @XmlElement(name = "FormOfPayment", namespace = "http://www.travelport.com/schema/common_v50_0")
    protected List<FormOfPayment> formOfPayment;

    /**
     * Gets the value of the accountingRemark property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the accountingRemark property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccountingRemark().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AccountingRemark }
     * 
     * 
     */
    public List<AccountingRemark> getAccountingRemark() {
        if (accountingRemark == null) {
            accountingRemark = new ArrayList<AccountingRemark>();
        }
        return this.accountingRemark;
    }

    /**
     * Gets the value of the generalRemark property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the generalRemark property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGeneralRemark().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GeneralRemark }
     * 
     * 
     */
    public List<GeneralRemark> getGeneralRemark() {
        if (generalRemark == null) {
            generalRemark = new ArrayList<GeneralRemark>();
        }
        return this.generalRemark;
    }

    /**
     * Gets the value of the osi property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the osi property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOSI().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OSI }
     * 
     * 
     */
    public List<OSI> getOSI() {
        if (osi == null) {
            osi = new ArrayList<OSI>();
        }
        return this.osi;
    }

    /**
     * Gets the value of the unassociatedRemark property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the unassociatedRemark property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUnassociatedRemark().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UnassociatedRemark }
     * 
     * 
     */
    public List<UnassociatedRemark> getUnassociatedRemark() {
        if (unassociatedRemark == null) {
            unassociatedRemark = new ArrayList<UnassociatedRemark>();
        }
        return this.unassociatedRemark;
    }

    /**
     * Gets the value of the xmlRemark property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the xmlRemark property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getXMLRemark().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link XMLRemark }
     * 
     * 
     */
    public List<XMLRemark> getXMLRemark() {
        if (xmlRemark == null) {
            xmlRemark = new ArrayList<XMLRemark>();
        }
        return this.xmlRemark;
    }

    /**
     * Gets the value of the postscript property.
     * 
     * @return
     *     possible object is
     *     {@link Postscript }
     *     
     */
    public Postscript getPostscript() {
        return postscript;
    }

    /**
     * Sets the value of the postscript property.
     * 
     * @param value
     *     allowed object is
     *     {@link Postscript }
     *     
     */
    public void setPostscript(Postscript value) {
        this.postscript = value;
    }

    /**
     * Gets the value of the bookingTravelerInfo property.
     * 
     * @return
     *     possible object is
     *     {@link BookingTravelerInfo }
     *     
     */
    public BookingTravelerInfo getBookingTravelerInfo() {
        return bookingTravelerInfo;
    }

    /**
     * Sets the value of the bookingTravelerInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BookingTravelerInfo }
     *     
     */
    public void setBookingTravelerInfo(BookingTravelerInfo value) {
        this.bookingTravelerInfo = value;
    }

    /**
     * Gets the value of the serviceFeeInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serviceFeeInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServiceFeeInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServiceFeeInfo }
     * 
     * 
     */
    public List<ServiceFeeInfo> getServiceFeeInfo() {
        if (serviceFeeInfo == null) {
            serviceFeeInfo = new ArrayList<ServiceFeeInfo>();
        }
        return this.serviceFeeInfo;
    }

    /**
     * Gets the value of the linkedUniversalRecord property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the linkedUniversalRecord property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLinkedUniversalRecord().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LinkedUniversalRecord }
     * 
     * 
     */
    public List<LinkedUniversalRecord> getLinkedUniversalRecord() {
        if (linkedUniversalRecord == null) {
            linkedUniversalRecord = new ArrayList<LinkedUniversalRecord>();
        }
        return this.linkedUniversalRecord;
    }

    /**
     * Gets the value of the agencyContactInfo property.
     * 
     * @return
     *     possible object is
     *     {@link AgencyContactInfo }
     *     
     */
    public AgencyContactInfo getAgencyContactInfo() {
        return agencyContactInfo;
    }

    /**
     * Sets the value of the agencyContactInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgencyContactInfo }
     *     
     */
    public void setAgencyContactInfo(AgencyContactInfo value) {
        this.agencyContactInfo = value;
    }

    /**
     * Gets the value of the customerID property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerID }
     *     
     */
    public CustomerID getCustomerID() {
        return customerID;
    }

    /**
     * Sets the value of the customerID property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerID }
     *     
     */
    public void setCustomerID(CustomerID value) {
        this.customerID = value;
    }

    /**
     * Gets the value of the commissionRemark property.
     * 
     * @return
     *     possible object is
     *     {@link CommissionRemark }
     *     
     */
    public CommissionRemark getCommissionRemark() {
        return commissionRemark;
    }

    /**
     * Sets the value of the commissionRemark property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommissionRemark }
     *     
     */
    public void setCommissionRemark(CommissionRemark value) {
        this.commissionRemark = value;
    }

    /**
     * Gets the value of the consolidatorRemark property.
     * 
     * @return
     *     possible object is
     *     {@link ConsolidatorRemark }
     *     
     */
    public ConsolidatorRemark getConsolidatorRemark() {
        return consolidatorRemark;
    }

    /**
     * Sets the value of the consolidatorRemark property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsolidatorRemark }
     *     
     */
    public void setConsolidatorRemark(ConsolidatorRemark value) {
        this.consolidatorRemark = value;
    }

    /**
     * Gets the value of the invoiceRemark property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the invoiceRemark property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInvoiceRemark().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InvoiceRemark }
     * 
     * 
     */
    public List<InvoiceRemark> getInvoiceRemark() {
        if (invoiceRemark == null) {
            invoiceRemark = new ArrayList<InvoiceRemark>();
        }
        return this.invoiceRemark;
    }

    /**
     * Gets the value of the actionStatus property.
     * 
     * @return
     *     possible object is
     *     {@link ActionStatus }
     *     
     */
    public ActionStatus getActionStatus() {
        return actionStatus;
    }

    /**
     * Sets the value of the actionStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActionStatus }
     *     
     */
    public void setActionStatus(ActionStatus value) {
        this.actionStatus = value;
    }

    /**
     * 
     *                             Element to add Review booking to a PNR .
     *                         Gets the value of the reviewBooking property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the reviewBooking property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReviewBooking().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReviewBooking }
     * 
     * 
     */
    public List<ReviewBooking> getReviewBooking() {
        if (reviewBooking == null) {
            reviewBooking = new ArrayList<ReviewBooking>();
        }
        return this.reviewBooking;
    }

    /**
     * Provider:1G,1V,1P,1J,ACH,SDK.Product:Air,Hotel,Vehicle,Cruise Gets the value of the formOfPayment property.
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

}
