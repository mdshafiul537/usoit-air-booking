
package com.travelport.schema.air_v50_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.travelport.schema.common_v50_0.ResponseMessage;


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
 *         &lt;element name="ApplicableSegment" maxOccurs="999"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;choice&gt;
 *                   &lt;element ref="{http://www.travelport.com/schema/common_v50_0}ResponseMessage" minOccurs="0"/&gt;
 *                   &lt;element ref="{http://www.travelport.com/schema/air_v50_0}OptionalServiceRef" minOccurs="0"/&gt;
 *                 &lt;/choice&gt;
 *                 &lt;attribute name="Key" type="{http://www.travelport.com/schema/common_v50_0}typeRef" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "applicableSegment"
})
@XmlRootElement(name = "ServiceAssociations")
public class ServiceAssociations {

    @XmlElement(name = "ApplicableSegment", required = true)
    protected List<ServiceAssociations.ApplicableSegment> applicableSegment;

    /**
     * Gets the value of the applicableSegment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the applicableSegment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getApplicableSegment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServiceAssociations.ApplicableSegment }
     * 
     * 
     */
    public List<ServiceAssociations.ApplicableSegment> getApplicableSegment() {
        if (applicableSegment == null) {
            applicableSegment = new ArrayList<ServiceAssociations.ApplicableSegment>();
        }
        return this.applicableSegment;
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
     *       &lt;choice&gt;
     *         &lt;element ref="{http://www.travelport.com/schema/common_v50_0}ResponseMessage" minOccurs="0"/&gt;
     *         &lt;element ref="{http://www.travelport.com/schema/air_v50_0}OptionalServiceRef" minOccurs="0"/&gt;
     *       &lt;/choice&gt;
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
        "responseMessage",
        "optionalServiceRef"
    })
    public static class ApplicableSegment {

        @XmlElement(name = "ResponseMessage", namespace = "http://www.travelport.com/schema/common_v50_0")
        protected ResponseMessage responseMessage;
        @XmlElement(name = "OptionalServiceRef")
        protected String optionalServiceRef;
        @XmlAttribute(name = "Key")
        protected String key;

        /**
         * Gets the value of the responseMessage property.
         * 
         * @return
         *     possible object is
         *     {@link ResponseMessage }
         *     
         */
        public ResponseMessage getResponseMessage() {
            return responseMessage;
        }

        /**
         * Sets the value of the responseMessage property.
         * 
         * @param value
         *     allowed object is
         *     {@link ResponseMessage }
         *     
         */
        public void setResponseMessage(ResponseMessage value) {
            this.responseMessage = value;
        }

        /**
         * Gets the value of the optionalServiceRef property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOptionalServiceRef() {
            return optionalServiceRef;
        }

        /**
         * Sets the value of the optionalServiceRef property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOptionalServiceRef(String value) {
            this.optionalServiceRef = value;
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

}
