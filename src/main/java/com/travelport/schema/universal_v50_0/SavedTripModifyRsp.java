
package com.travelport.schema.universal_v50_0;

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
 *         &lt;element ref="{http://www.travelport.com/schema/universal_v50_0}SavedTrip" minOccurs="0"/&gt;
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
    "savedTrip"
})
@XmlRootElement(name = "SavedTripModifyRsp")
public class SavedTripModifyRsp
    extends BaseRsp
{

    @XmlElement(name = "SavedTrip")
    protected SavedTrip savedTrip;

    /**
     * Gets the value of the savedTrip property.
     * 
     * @return
     *     possible object is
     *     {@link SavedTrip }
     *     
     */
    public SavedTrip getSavedTrip() {
        return savedTrip;
    }

    /**
     * Sets the value of the savedTrip property.
     * 
     * @param value
     *     allowed object is
     *     {@link SavedTrip }
     *     
     */
    public void setSavedTrip(SavedTrip value) {
        this.savedTrip = value;
    }

}
