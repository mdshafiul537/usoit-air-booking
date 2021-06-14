
package com.travelport.schema.universal_v50_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.travelport.schema.common_v50_0.BaseRsp;
import com.travelport.schema.hotel_v50_0.HotelProperty;
import com.travelport.schema.hotel_v50_0.HotelRateDetail;


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
 *         &lt;element ref="{http://www.travelport.com/schema/universal_v50_0}UniversalRecord" minOccurs="0"/&gt;
 *         &lt;element name="HotelRateChangedInfo" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://www.travelport.com/schema/hotel_v50_0}HotelProperty"/&gt;
 *                   &lt;element ref="{http://www.travelport.com/schema/hotel_v50_0}HotelRateDetail" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="Reason" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
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
    "universalRecord",
    "hotelRateChangedInfo"
})
@XmlRootElement(name = "HotelCreateReservationRsp")
public class HotelCreateReservationRsp
    extends BaseRsp
{

    @XmlElement(name = "UniversalRecord")
    protected UniversalRecord universalRecord;
    @XmlElement(name = "HotelRateChangedInfo")
    protected HotelCreateReservationRsp.HotelRateChangedInfo hotelRateChangedInfo;

    /**
     * Gets the value of the universalRecord property.
     * 
     * @return
     *     possible object is
     *     {@link UniversalRecord }
     *     
     */
    public UniversalRecord getUniversalRecord() {
        return universalRecord;
    }

    /**
     * Sets the value of the universalRecord property.
     * 
     * @param value
     *     allowed object is
     *     {@link UniversalRecord }
     *     
     */
    public void setUniversalRecord(UniversalRecord value) {
        this.universalRecord = value;
    }

    /**
     * Gets the value of the hotelRateChangedInfo property.
     * 
     * @return
     *     possible object is
     *     {@link HotelCreateReservationRsp.HotelRateChangedInfo }
     *     
     */
    public HotelCreateReservationRsp.HotelRateChangedInfo getHotelRateChangedInfo() {
        return hotelRateChangedInfo;
    }

    /**
     * Sets the value of the hotelRateChangedInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link HotelCreateReservationRsp.HotelRateChangedInfo }
     *     
     */
    public void setHotelRateChangedInfo(HotelCreateReservationRsp.HotelRateChangedInfo value) {
        this.hotelRateChangedInfo = value;
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
     *         &lt;element ref="{http://www.travelport.com/schema/hotel_v50_0}HotelProperty"/&gt;
     *         &lt;element ref="{http://www.travelport.com/schema/hotel_v50_0}HotelRateDetail" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="Reason" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "hotelProperty",
        "hotelRateDetail"
    })
    public static class HotelRateChangedInfo {

        @XmlElement(name = "HotelProperty", namespace = "http://www.travelport.com/schema/hotel_v50_0", required = true)
        protected HotelProperty hotelProperty;
        @XmlElement(name = "HotelRateDetail", namespace = "http://www.travelport.com/schema/hotel_v50_0")
        protected HotelRateDetail hotelRateDetail;
        @XmlAttribute(name = "Reason")
        protected String reason;

        /**
         * Gets the value of the hotelProperty property.
         * 
         * @return
         *     possible object is
         *     {@link HotelProperty }
         *     
         */
        public HotelProperty getHotelProperty() {
            return hotelProperty;
        }

        /**
         * Sets the value of the hotelProperty property.
         * 
         * @param value
         *     allowed object is
         *     {@link HotelProperty }
         *     
         */
        public void setHotelProperty(HotelProperty value) {
            this.hotelProperty = value;
        }

        /**
         * Gets the value of the hotelRateDetail property.
         * 
         * @return
         *     possible object is
         *     {@link HotelRateDetail }
         *     
         */
        public HotelRateDetail getHotelRateDetail() {
            return hotelRateDetail;
        }

        /**
         * Sets the value of the hotelRateDetail property.
         * 
         * @param value
         *     allowed object is
         *     {@link HotelRateDetail }
         *     
         */
        public void setHotelRateDetail(HotelRateDetail value) {
            this.hotelRateDetail = value;
        }

        /**
         * Gets the value of the reason property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getReason() {
            return reason;
        }

        /**
         * Sets the value of the reason property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setReason(String value) {
            this.reason = value;
        }

    }

}
