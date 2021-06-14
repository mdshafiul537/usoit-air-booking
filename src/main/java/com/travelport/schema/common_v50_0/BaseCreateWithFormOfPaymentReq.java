
package com.travelport.schema.common_v50_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.travelport.schema.universal_v50_0.AirCreateReservationReq;
import com.travelport.schema.universal_v50_0.HotelCreateReservationReq;
import com.travelport.schema.universal_v50_0.RailCreateReservationReq;
import com.travelport.schema.universal_v50_0.VehicleCreateReservationReq;


/**
 * Container for BaseCreateReservation along with Form Of Payment
 * 
 * <p>Java class for BaseCreateWithFormOfPaymentReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BaseCreateWithFormOfPaymentReq"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.travelport.com/schema/common_v50_0}BaseCreateReservationReq"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/common_v50_0}FormOfPayment" maxOccurs="999" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseCreateWithFormOfPaymentReq", propOrder = {
    "formOfPayment"
})
@XmlSeeAlso({
    AirCreateReservationReq.class,
    RailCreateReservationReq.class,
    HotelCreateReservationReq.class,
    VehicleCreateReservationReq.class
})
public class BaseCreateWithFormOfPaymentReq
    extends BaseCreateReservationReq
{

    @XmlElement(name = "FormOfPayment")
    protected List<FormOfPayment> formOfPayment;

    /**
     * Provider:1G,1V,1P,1J,ACH,SDK.Gets the value of the formOfPayment property.
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
