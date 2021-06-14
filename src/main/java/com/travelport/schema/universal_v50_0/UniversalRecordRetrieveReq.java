
package com.travelport.schema.universal_v50_0;

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
 *       &lt;choice&gt;
 *         &lt;element name="UniversalRecordLocatorCode" type="{http://www.travelport.com/schema/common_v50_0}typeLocatorCode"/&gt;
 *         &lt;element name="ProviderReservationInfo"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attGroup ref="{http://www.travelport.com/schema/common_v50_0}ProviderReservation"/&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/choice&gt;
 *       &lt;attribute name="ViewOnlyInd" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="TravelerLastName" type="{http://www.travelport.com/schema/common_v50_0}typeTravelerLastName" /&gt;
 *       &lt;attribute name="TravelerFirstName" type="{http://www.travelport.com/schema/common_v50_0}typeTravelerLastName" /&gt;
 *       &lt;attribute name="ReturnUnmaskedData" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "universalRecordLocatorCode",
    "providerReservationInfo"
})
@XmlRootElement(name = "UniversalRecordRetrieveReq")
public class UniversalRecordRetrieveReq
    extends BaseReq
{

    @XmlElement(name = "UniversalRecordLocatorCode")
    protected String universalRecordLocatorCode;
    @XmlElement(name = "ProviderReservationInfo")
    protected UniversalRecordRetrieveReq.ProviderReservationInfo providerReservationInfo;
    @XmlAttribute(name = "ViewOnlyInd")
    protected Boolean viewOnlyInd;
    @XmlAttribute(name = "TravelerLastName")
    protected String travelerLastName;
    @XmlAttribute(name = "TravelerFirstName")
    protected String travelerFirstName;
    @XmlAttribute(name = "ReturnUnmaskedData")
    protected Boolean returnUnmaskedData;

    /**
     * Gets the value of the universalRecordLocatorCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversalRecordLocatorCode() {
        return universalRecordLocatorCode;
    }

    /**
     * Sets the value of the universalRecordLocatorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversalRecordLocatorCode(String value) {
        this.universalRecordLocatorCode = value;
    }

    /**
     * Gets the value of the providerReservationInfo property.
     * 
     * @return
     *     possible object is
     *     {@link UniversalRecordRetrieveReq.ProviderReservationInfo }
     *     
     */
    public UniversalRecordRetrieveReq.ProviderReservationInfo getProviderReservationInfo() {
        return providerReservationInfo;
    }

    /**
     * Sets the value of the providerReservationInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link UniversalRecordRetrieveReq.ProviderReservationInfo }
     *     
     */
    public void setProviderReservationInfo(UniversalRecordRetrieveReq.ProviderReservationInfo value) {
        this.providerReservationInfo = value;
    }

    /**
     * Gets the value of the viewOnlyInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isViewOnlyInd() {
        if (viewOnlyInd == null) {
            return false;
        } else {
            return viewOnlyInd;
        }
    }

    /**
     * Sets the value of the viewOnlyInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setViewOnlyInd(Boolean value) {
        this.viewOnlyInd = value;
    }

    /**
     * Gets the value of the travelerLastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTravelerLastName() {
        return travelerLastName;
    }

    /**
     * Sets the value of the travelerLastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTravelerLastName(String value) {
        this.travelerLastName = value;
    }

    /**
     * Gets the value of the travelerFirstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTravelerFirstName() {
        return travelerFirstName;
    }

    /**
     * Sets the value of the travelerFirstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTravelerFirstName(String value) {
        this.travelerFirstName = value;
    }

    /**
     * Gets the value of the returnUnmaskedData property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReturnUnmaskedData() {
        return returnUnmaskedData;
    }

    /**
     * Sets the value of the returnUnmaskedData property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReturnUnmaskedData(Boolean value) {
        this.returnUnmaskedData = value;
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
     *       &lt;attGroup ref="{http://www.travelport.com/schema/common_v50_0}ProviderReservation"/&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class ProviderReservationInfo {

        @XmlAttribute(name = "ProviderCode", required = true)
        protected String providerCode;
        @XmlAttribute(name = "ProviderLocatorCode", required = true)
        protected String providerLocatorCode;
        @XmlAttribute(name = "SupplierCode")
        protected String supplierCode;

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
         * Gets the value of the providerLocatorCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getProviderLocatorCode() {
            return providerLocatorCode;
        }

        /**
         * Sets the value of the providerLocatorCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setProviderLocatorCode(String value) {
            this.providerLocatorCode = value;
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

    }

}
