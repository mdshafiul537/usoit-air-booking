
package com.travelport.schema.universal_v50_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.travelport.schema.common_v50_0.FormOfPayment;
import com.travelport.schema.common_v50_0.Payment;


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
 *         &lt;element name="BookingAction"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://www.travelport.com/schema/common_v50_0}FormOfPayment" minOccurs="0"/&gt;
 *                   &lt;element ref="{http://www.travelport.com/schema/common_v50_0}Payment" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="Type" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="ReservationLocatorCode" use="required" type="{http://www.travelport.com/schema/common_v50_0}typeLocatorCode" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "bookingAction"
})
@XmlRootElement(name = "RailUpdate")
public class RailUpdate {

    @XmlElement(name = "BookingAction", required = true)
    protected RailUpdate.BookingAction bookingAction;
    @XmlAttribute(name = "ReservationLocatorCode", required = true)
    protected String reservationLocatorCode;

    /**
     * Gets the value of the bookingAction property.
     * 
     * @return
     *     possible object is
     *     {@link RailUpdate.BookingAction }
     *     
     */
    public RailUpdate.BookingAction getBookingAction() {
        return bookingAction;
    }

    /**
     * Sets the value of the bookingAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link RailUpdate.BookingAction }
     *     
     */
    public void setBookingAction(RailUpdate.BookingAction value) {
        this.bookingAction = value;
    }

    /**
     * Gets the value of the reservationLocatorCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReservationLocatorCode() {
        return reservationLocatorCode;
    }

    /**
     * Sets the value of the reservationLocatorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReservationLocatorCode(String value) {
        this.reservationLocatorCode = value;
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
     *         &lt;element ref="{http://www.travelport.com/schema/common_v50_0}FormOfPayment" minOccurs="0"/&gt;
     *         &lt;element ref="{http://www.travelport.com/schema/common_v50_0}Payment" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="Type" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "formOfPayment",
        "payment"
    })
    public static class BookingAction {

        @XmlElement(name = "FormOfPayment", namespace = "http://www.travelport.com/schema/common_v50_0")
        protected FormOfPayment formOfPayment;
        @XmlElement(name = "Payment", namespace = "http://www.travelport.com/schema/common_v50_0")
        protected Payment payment;
        @XmlAttribute(name = "Type", required = true)
        protected String type;

        /**
         * Gets the value of the formOfPayment property.
         * 
         * @return
         *     possible object is
         *     {@link FormOfPayment }
         *     
         */
        public FormOfPayment getFormOfPayment() {
            return formOfPayment;
        }

        /**
         * Sets the value of the formOfPayment property.
         * 
         * @param value
         *     allowed object is
         *     {@link FormOfPayment }
         *     
         */
        public void setFormOfPayment(FormOfPayment value) {
            this.formOfPayment = value;
        }

        /**
         * Gets the value of the payment property.
         * 
         * @return
         *     possible object is
         *     {@link Payment }
         *     
         */
        public Payment getPayment() {
            return payment;
        }

        /**
         * Sets the value of the payment property.
         * 
         * @param value
         *     allowed object is
         *     {@link Payment }
         *     
         */
        public void setPayment(Payment value) {
            this.payment = value;
        }

        /**
         * Gets the value of the type property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getType() {
            return type;
        }

        /**
         * Sets the value of the type property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setType(String value) {
            this.type = value;
        }

    }

}
