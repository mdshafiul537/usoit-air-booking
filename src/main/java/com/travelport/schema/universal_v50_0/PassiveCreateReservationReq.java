
package com.travelport.schema.universal_v50_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.travelport.schema.common_v50_0.ActionStatus;
import com.travelport.schema.common_v50_0.BaseCreateReservationReq;
import com.travelport.schema.common_v50_0.ReviewBooking;
import com.travelport.schema.common_v50_0.SupplierLocator;
import com.travelport.schema.common_v50_0.ThirdPartyInformation;
import com.travelport.schema.passive_v50_0.AssociatedRemark;
import com.travelport.schema.passive_v50_0.PassiveRemark;
import com.travelport.schema.passive_v50_0.PassiveSegment;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.travelport.com/schema/common_v50_0}BaseCreateReservationReq"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/common_v50_0}SupplierLocator" maxOccurs="999" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/common_v50_0}ThirdPartyInformation" maxOccurs="999" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/passive_v50_0}PassiveSegment" maxOccurs="999"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/passive_v50_0}PassiveRemark" maxOccurs="999" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/passive_v50_0}AssociatedRemark" maxOccurs="999" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/common_v50_0}ActionStatus" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/common_v50_0}ReviewBooking" maxOccurs="999" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "supplierLocator",
    "thirdPartyInformation",
    "passiveSegment",
    "passiveRemark",
    "associatedRemark",
    "actionStatus",
    "reviewBooking"
})
@XmlRootElement(name = "PassiveCreateReservationReq")
public class PassiveCreateReservationReq
    extends BaseCreateReservationReq
{

    @XmlElement(name = "SupplierLocator", namespace = "http://www.travelport.com/schema/common_v50_0")
    protected List<SupplierLocator> supplierLocator;
    @XmlElement(name = "ThirdPartyInformation", namespace = "http://www.travelport.com/schema/common_v50_0")
    protected List<ThirdPartyInformation> thirdPartyInformation;
    @XmlElement(name = "PassiveSegment", namespace = "http://www.travelport.com/schema/passive_v50_0", required = true)
    protected List<PassiveSegment> passiveSegment;
    @XmlElement(name = "PassiveRemark", namespace = "http://www.travelport.com/schema/passive_v50_0")
    protected List<PassiveRemark> passiveRemark;
    @XmlElement(name = "AssociatedRemark", namespace = "http://www.travelport.com/schema/passive_v50_0")
    protected List<AssociatedRemark> associatedRemark;
    @XmlElement(name = "ActionStatus", namespace = "http://www.travelport.com/schema/common_v50_0")
    protected ActionStatus actionStatus;
    @XmlElement(name = "ReviewBooking", namespace = "http://www.travelport.com/schema/common_v50_0")
    protected List<ReviewBooking> reviewBooking;

    /**
     * Gets the value of the supplierLocator property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the supplierLocator property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSupplierLocator().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SupplierLocator }
     * 
     * 
     */
    public List<SupplierLocator> getSupplierLocator() {
        if (supplierLocator == null) {
            supplierLocator = new ArrayList<SupplierLocator>();
        }
        return this.supplierLocator;
    }

    /**
     * Gets the value of the thirdPartyInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the thirdPartyInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getThirdPartyInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ThirdPartyInformation }
     * 
     * 
     */
    public List<ThirdPartyInformation> getThirdPartyInformation() {
        if (thirdPartyInformation == null) {
            thirdPartyInformation = new ArrayList<ThirdPartyInformation>();
        }
        return this.thirdPartyInformation;
    }

    /**
     * Gets the value of the passiveSegment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the passiveSegment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPassiveSegment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PassiveSegment }
     * 
     * 
     */
    public List<PassiveSegment> getPassiveSegment() {
        if (passiveSegment == null) {
            passiveSegment = new ArrayList<PassiveSegment>();
        }
        return this.passiveSegment;
    }

    /**
     * Gets the value of the passiveRemark property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the passiveRemark property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPassiveRemark().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PassiveRemark }
     * 
     * 
     */
    public List<PassiveRemark> getPassiveRemark() {
        if (passiveRemark == null) {
            passiveRemark = new ArrayList<PassiveRemark>();
        }
        return this.passiveRemark;
    }

    /**
     * Gets the value of the associatedRemark property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the associatedRemark property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAssociatedRemark().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AssociatedRemark }
     * 
     * 
     */
    public List<AssociatedRemark> getAssociatedRemark() {
        if (associatedRemark == null) {
            associatedRemark = new ArrayList<AssociatedRemark>();
        }
        return this.associatedRemark;
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
     * Review Booking or Queue Minders is to add the reminders in the Provider Reservation along with the date time and Queue details. On the date time defined in reminders, the message along with the PNR goes to the desired Queue. Gets the value of the reviewBooking property.
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

}
