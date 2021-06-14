
package com.travelport.schema.air_v50_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.travelport.schema.common_v50_0.BaseRsp;
import com.travelport.schema.common_v50_0.CabinClass;
import com.travelport.schema.common_v50_0.HostToken;
import com.travelport.schema.common_v50_0.PaymentRestriction;
import com.travelport.schema.common_v50_0.Remark;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.travelport.com/schema/common_v50_0}BaseRsp"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/common_v50_0}HostToken" maxOccurs="99" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/common_v50_0}CabinClass" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/air_v50_0}AirSegment" maxOccurs="99" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/air_v50_0}SearchTraveler" maxOccurs="999" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/air_v50_0}OptionalServices" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/common_v50_0}Remark" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/air_v50_0}Rows" maxOccurs="99" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/common_v50_0}PaymentRestriction" maxOccurs="999" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/air_v50_0}SeatInformation" maxOccurs="999" minOccurs="0"/&gt;
 *         &lt;element name="Copyright" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="GroupSeatPrice" type="{http://www.travelport.com/schema/common_v50_0}typeMoney" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "hostToken",
    "cabinClass",
    "airSegment",
    "searchTraveler",
    "optionalServices",
    "remark",
    "rows",
    "paymentRestriction",
    "seatInformation",
    "copyright"
})
@XmlRootElement(name = "SeatMapRsp")
public class SeatMapRsp
    extends BaseRsp
{

    @XmlElement(name = "HostToken", namespace = "http://www.travelport.com/schema/common_v50_0")
    protected List<HostToken> hostToken;
    @XmlElement(name = "CabinClass", namespace = "http://www.travelport.com/schema/common_v50_0")
    protected CabinClass cabinClass;
    @XmlElement(name = "AirSegment")
    protected List<TypeBaseAirSegment> airSegment;
    @XmlElement(name = "SearchTraveler")
    protected List<SearchTraveler> searchTraveler;
    @XmlElement(name = "OptionalServices")
    protected OptionalServices optionalServices;
    @XmlElement(name = "Remark", namespace = "http://www.travelport.com/schema/common_v50_0")
    protected Remark remark;
    @XmlElement(name = "Rows")
    protected List<Rows> rows;
    @XmlElement(name = "PaymentRestriction", namespace = "http://www.travelport.com/schema/common_v50_0")
    protected List<PaymentRestriction> paymentRestriction;
    @XmlElement(name = "SeatInformation")
    protected List<SeatInformation> seatInformation;
    @XmlElement(name = "Copyright")
    protected String copyright;
    @XmlAttribute(name = "GroupSeatPrice")
    protected String groupSeatPrice;

    /**
     * Provider: ACH,MCH.Gets the value of the hostToken property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hostToken property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHostToken().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HostToken }
     * 
     * 
     */
    public List<HostToken> getHostToken() {
        if (hostToken == null) {
            hostToken = new ArrayList<HostToken>();
        }
        return this.hostToken;
    }

    /**
     * Provider: 1G,1V,1P,1J,ACH,MCH.
     * 
     * @return
     *     possible object is
     *     {@link CabinClass }
     *     
     */
    public CabinClass getCabinClass() {
        return cabinClass;
    }

    /**
     * Sets the value of the cabinClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link CabinClass }
     *     
     */
    public void setCabinClass(CabinClass value) {
        this.cabinClass = value;
    }

    /**
     * Provider: ACH,MCH.Gets the value of the airSegment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the airSegment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAirSegment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeBaseAirSegment }
     * 
     * 
     */
    public List<TypeBaseAirSegment> getAirSegment() {
        if (airSegment == null) {
            airSegment = new ArrayList<TypeBaseAirSegment>();
        }
        return this.airSegment;
    }

    /**
     * Provider: ACH,MCH.Gets the value of the searchTraveler property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the searchTraveler property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSearchTraveler().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchTraveler }
     * 
     * 
     */
    public List<SearchTraveler> getSearchTraveler() {
        if (searchTraveler == null) {
            searchTraveler = new ArrayList<SearchTraveler>();
        }
        return this.searchTraveler;
    }

    /**
     * A wrapper for all the information regarding each of the Optional Services.
     *                                 	Provider: 1G,1V,1P,1J,ACH.
     * 
     * @return
     *     possible object is
     *     {@link OptionalServices }
     *     
     */
    public OptionalServices getOptionalServices() {
        return optionalServices;
    }

    /**
     * Sets the value of the optionalServices property.
     * 
     * @param value
     *     allowed object is
     *     {@link OptionalServices }
     *     
     */
    public void setOptionalServices(OptionalServices value) {
        this.optionalServices = value;
    }

    /**
     * Provider: 1G,1V,1P,1J,ACH,MCH.
     * 
     * @return
     *     possible object is
     *     {@link Remark }
     *     
     */
    public Remark getRemark() {
        return remark;
    }

    /**
     * Sets the value of the remark property.
     * 
     * @param value
     *     allowed object is
     *     {@link Remark }
     *     
     */
    public void setRemark(Remark value) {
        this.remark = value;
    }

    /**
     * Gets the value of the rows property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rows property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRows().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Rows }
     * 
     * 
     */
    public List<Rows> getRows() {
        if (rows == null) {
            rows = new ArrayList<Rows>();
        }
        return this.rows;
    }

    /**
     * Provider: MCH-Information regarding valid payment types, if restrictions apply(supplier specific) Gets the value of the paymentRestriction property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paymentRestriction property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaymentRestriction().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentRestriction }
     * 
     * 
     */
    public List<PaymentRestriction> getPaymentRestriction() {
        if (paymentRestriction == null) {
            paymentRestriction = new ArrayList<PaymentRestriction>();
        }
        return this.paymentRestriction;
    }

    /**
     * Gets the value of the seatInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the seatInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSeatInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SeatInformation }
     * 
     * 
     */
    public List<SeatInformation> getSeatInformation() {
        if (seatInformation == null) {
            seatInformation = new ArrayList<SeatInformation>();
        }
        return this.seatInformation;
    }

    /**
     * Gets the value of the copyright property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCopyright() {
        return copyright;
    }

    /**
     * Sets the value of the copyright property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCopyright(String value) {
        this.copyright = value;
    }

    /**
     * Gets the value of the groupSeatPrice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupSeatPrice() {
        return groupSeatPrice;
    }

    /**
     * Sets the value of the groupSeatPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupSeatPrice(String value) {
        this.groupSeatPrice = value;
    }

}
