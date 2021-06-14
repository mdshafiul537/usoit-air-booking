
package com.travelport.schema.universal_v50_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.travelport.schema.air_v50_0.AirSolutionChangedInfo;
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
 *         &lt;element ref="{http://www.travelport.com/schema/air_v50_0}AirSolutionChangedInfo" maxOccurs="999" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/universal_v50_0}UniversalModifyFailureInfo" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="QueueSessionToken" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
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
    "airSolutionChangedInfo",
    "universalModifyFailureInfo"
})
@XmlRootElement(name = "UniversalRecordModifyRsp")
public class UniversalRecordModifyRsp
    extends BaseRsp
{

    @XmlElement(name = "UniversalRecord")
    protected UniversalRecord universalRecord;
    @XmlElement(name = "AirSolutionChangedInfo", namespace = "http://www.travelport.com/schema/air_v50_0")
    protected List<AirSolutionChangedInfo> airSolutionChangedInfo;
    @XmlElement(name = "UniversalModifyFailureInfo")
    protected UniversalModifyFailureInfo universalModifyFailureInfo;
    @XmlAttribute(name = "QueueSessionToken")
    protected String queueSessionToken;

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
     * Gets the value of the airSolutionChangedInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the airSolutionChangedInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAirSolutionChangedInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AirSolutionChangedInfo }
     * 
     * 
     */
    public List<AirSolutionChangedInfo> getAirSolutionChangedInfo() {
        if (airSolutionChangedInfo == null) {
            airSolutionChangedInfo = new ArrayList<AirSolutionChangedInfo>();
        }
        return this.airSolutionChangedInfo;
    }

    /**
     * Gets the value of the universalModifyFailureInfo property.
     * 
     * @return
     *     possible object is
     *     {@link UniversalModifyFailureInfo }
     *     
     */
    public UniversalModifyFailureInfo getUniversalModifyFailureInfo() {
        return universalModifyFailureInfo;
    }

    /**
     * Sets the value of the universalModifyFailureInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link UniversalModifyFailureInfo }
     *     
     */
    public void setUniversalModifyFailureInfo(UniversalModifyFailureInfo value) {
        this.universalModifyFailureInfo = value;
    }

    /**
     * Gets the value of the queueSessionToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQueueSessionToken() {
        return queueSessionToken;
    }

    /**
     * Sets the value of the queueSessionToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQueueSessionToken(String value) {
        this.queueSessionToken = value;
    }

}
