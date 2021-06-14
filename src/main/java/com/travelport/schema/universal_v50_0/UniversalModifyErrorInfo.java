
package com.travelport.schema.universal_v50_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.travelport.schema.air_v50_0.AirSegmentError;
import com.travelport.schema.common_v50_0.TypeErrorInfo;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.travelport.com/schema/common_v50_0}typeErrorInfo"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/universal_v50_0}UniversalModifyCommandError" maxOccurs="999" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/air_v50_0}AirSegmentError" maxOccurs="999" minOccurs="0"/&gt;
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
    "universalModifyCommandError",
    "airSegmentError"
})
@XmlRootElement(name = "UniversalModifyErrorInfo")
public class UniversalModifyErrorInfo
    extends TypeErrorInfo
{

    @XmlElement(name = "UniversalModifyCommandError")
    protected List<UniversalModifyCommandError> universalModifyCommandError;
    @XmlElement(name = "AirSegmentError", namespace = "http://www.travelport.com/schema/air_v50_0")
    protected List<AirSegmentError> airSegmentError;

    /**
     * Gets the value of the universalModifyCommandError property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the universalModifyCommandError property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUniversalModifyCommandError().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UniversalModifyCommandError }
     * 
     * 
     */
    public List<UniversalModifyCommandError> getUniversalModifyCommandError() {
        if (universalModifyCommandError == null) {
            universalModifyCommandError = new ArrayList<UniversalModifyCommandError>();
        }
        return this.universalModifyCommandError;
    }

    /**
     * Gets the value of the airSegmentError property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the airSegmentError property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAirSegmentError().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AirSegmentError }
     * 
     * 
     */
    public List<AirSegmentError> getAirSegmentError() {
        if (airSegmentError == null) {
            airSegmentError = new ArrayList<AirSegmentError>();
        }
        return this.airSegmentError;
    }

}
