
package com.travelport.schema.universal_v50_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.travelport.schema.common_v50_0.BaseRsp;
import com.travelport.schema.rail_v50_0.RailSolutionChangedInfo;


/**
 * <p>Java class for typeRailCreateReservationRsp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="typeRailCreateReservationRsp"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.travelport.com/schema/common_v50_0}BaseRsp"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/universal_v50_0}UniversalRecord" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/rail_v50_0}RailSolutionChangedInfo" maxOccurs="999" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "typeRailCreateReservationRsp", propOrder = {
    "universalRecord",
    "railSolutionChangedInfo"
})
@XmlSeeAlso({
    RailCreateReservationRsp.class
})
public abstract class TypeRailCreateReservationRsp
    extends BaseRsp
{

    @XmlElement(name = "UniversalRecord")
    protected UniversalRecord universalRecord;
    @XmlElement(name = "RailSolutionChangedInfo", namespace = "http://www.travelport.com/schema/rail_v50_0")
    protected List<RailSolutionChangedInfo> railSolutionChangedInfo;

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
     * Gets the value of the railSolutionChangedInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the railSolutionChangedInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRailSolutionChangedInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RailSolutionChangedInfo }
     * 
     * 
     */
    public List<RailSolutionChangedInfo> getRailSolutionChangedInfo() {
        if (railSolutionChangedInfo == null) {
            railSolutionChangedInfo = new ArrayList<RailSolutionChangedInfo>();
        }
        return this.railSolutionChangedInfo;
    }

}
