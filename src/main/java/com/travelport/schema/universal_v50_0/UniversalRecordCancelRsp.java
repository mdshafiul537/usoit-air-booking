
package com.travelport.schema.universal_v50_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.travelport.schema.common_v50_0.BaseRsp;


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
 *         &lt;element ref="{http://www.travelport.com/schema/universal_v50_0}ProviderReservationStatus" maxOccurs="999" minOccurs="0"/&gt;
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
    "providerReservationStatus"
})
@XmlRootElement(name = "UniversalRecordCancelRsp")
public class UniversalRecordCancelRsp
    extends BaseRsp
{

    @XmlElement(name = "ProviderReservationStatus")
    protected List<ProviderReservationStatus> providerReservationStatus;

    /**
     * Gets the value of the providerReservationStatus property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the providerReservationStatus property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProviderReservationStatus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProviderReservationStatus }
     * 
     * 
     */
    public List<ProviderReservationStatus> getProviderReservationStatus() {
        if (providerReservationStatus == null) {
            providerReservationStatus = new ArrayList<ProviderReservationStatus>();
        }
        return this.providerReservationStatus;
    }

}
