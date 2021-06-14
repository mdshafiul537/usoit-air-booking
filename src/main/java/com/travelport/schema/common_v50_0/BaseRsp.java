
package com.travelport.schema.common_v50_0;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.travelport.schema.universal_v50_0.AckScheduleChangeRsp;
import com.travelport.schema.universal_v50_0.AirCancelRsp;
import com.travelport.schema.universal_v50_0.AirCreateReservationRsp;
import com.travelport.schema.universal_v50_0.AirMerchandisingFulfillmentRsp;
import com.travelport.schema.universal_v50_0.HotelCancelRsp;
import com.travelport.schema.universal_v50_0.HotelCreateReservationRsp;
import com.travelport.schema.universal_v50_0.PassiveCancelRsp;
import com.travelport.schema.universal_v50_0.PassiveCreateReservationRsp;
import com.travelport.schema.universal_v50_0.ProviderReservationDisplayDetailsRsp;
import com.travelport.schema.universal_v50_0.ProviderReservationDivideRsp;
import com.travelport.schema.universal_v50_0.SavedTripCreateRsp;
import com.travelport.schema.universal_v50_0.SavedTripDeleteRsp;
import com.travelport.schema.universal_v50_0.SavedTripModifyRsp;
import com.travelport.schema.universal_v50_0.SavedTripRetrieveRsp;
import com.travelport.schema.universal_v50_0.SavedTripSearchRsp;
import com.travelport.schema.universal_v50_0.TypeRailCreateReservationRsp;
import com.travelport.schema.universal_v50_0.UniversalRecordCancelRsp;
import com.travelport.schema.universal_v50_0.UniversalRecordHistorySearchRsp;
import com.travelport.schema.universal_v50_0.UniversalRecordImportRsp;
import com.travelport.schema.universal_v50_0.UniversalRecordModifyRsp;
import com.travelport.schema.universal_v50_0.UniversalRecordRetrieveRsp;
import com.travelport.schema.universal_v50_0.UniversalRecordSearchRsp;
import com.travelport.schema.universal_v50_0.VehicleCancelRsp;
import com.travelport.schema.universal_v50_0.VehicleCreateReservationRsp;


/**
 * The base type for all responses.
 * 
 * <p>Java class for BaseRsp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BaseRsp"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/common_v50_0}ResponseMessage" maxOccurs="999" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="TraceId" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="TransactionId" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="ResponseTime" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *       &lt;attribute name="CommandHistory" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseRsp", propOrder = {
    "responseMessage"
})
@XmlSeeAlso({
    BaseSearchRsp.class,
    PassiveCancelRsp.class,
    PassiveCreateReservationRsp.class,
    AirMerchandisingFulfillmentRsp.class,
    AirCancelRsp.class,
    AirCreateReservationRsp.class,
    TypeRailCreateReservationRsp.class,
    HotelCancelRsp.class,
    HotelCreateReservationRsp.class,
    VehicleCancelRsp.class,
    VehicleCreateReservationRsp.class,
    SavedTripSearchRsp.class,
    SavedTripRetrieveRsp.class,
    SavedTripModifyRsp.class,
    SavedTripCreateRsp.class,
    ProviderReservationDisplayDetailsRsp.class,
    SavedTripDeleteRsp.class,
    UniversalRecordSearchRsp.class,
    UniversalRecordHistorySearchRsp.class,
    UniversalRecordModifyRsp.class,
    UniversalRecordImportRsp.class,
    AckScheduleChangeRsp.class,
    UniversalRecordCancelRsp.class,
    ProviderReservationDivideRsp.class,
    UniversalRecordRetrieveRsp.class
})
public class BaseRsp {

    @XmlElement(name = "ResponseMessage")
    protected List<ResponseMessage> responseMessage;
    @XmlAttribute(name = "TraceId")
    protected String traceId;
    @XmlAttribute(name = "TransactionId")
    protected String transactionId;
    @XmlAttribute(name = "ResponseTime")
    protected BigInteger responseTime;
    @XmlAttribute(name = "CommandHistory")
    protected String commandHistory;

    /**
     * Gets the value of the responseMessage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the responseMessage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResponseMessage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ResponseMessage }
     * 
     * 
     */
    public List<ResponseMessage> getResponseMessage() {
        if (responseMessage == null) {
            responseMessage = new ArrayList<ResponseMessage>();
        }
        return this.responseMessage;
    }

    /**
     * Gets the value of the traceId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTraceId() {
        return traceId;
    }

    /**
     * Sets the value of the traceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTraceId(String value) {
        this.traceId = value;
    }

    /**
     * Gets the value of the transactionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionId() {
        return transactionId;
    }

    /**
     * Sets the value of the transactionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionId(String value) {
        this.transactionId = value;
    }

    /**
     * Gets the value of the responseTime property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getResponseTime() {
        return responseTime;
    }

    /**
     * Sets the value of the responseTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setResponseTime(BigInteger value) {
        this.responseTime = value;
    }

    /**
     * Gets the value of the commandHistory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommandHistory() {
        return commandHistory;
    }

    /**
     * Sets the value of the commandHistory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommandHistory(String value) {
        this.commandHistory = value;
    }

}
