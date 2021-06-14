
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
 *         &lt;element ref="{http://www.travelport.com/schema/universal_v50_0}UniversalRecord" minOccurs="0"/&gt;
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
    "universalRecord"
})
@XmlRootElement(name = "AirCancelRsp")
public class AirCancelRsp
    extends BaseRsp
{

    @XmlElement(name = "UniversalRecord")
    protected UniversalRecord universalRecord;

    /**
     * Provider: 1G,1V,1P,1J,ACH.
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

}
