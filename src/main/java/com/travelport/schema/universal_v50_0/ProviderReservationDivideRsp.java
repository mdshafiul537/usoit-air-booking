
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
 *         &lt;element ref="{http://www.travelport.com/schema/universal_v50_0}ParentProviderReservationInfo"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/universal_v50_0}ChildProviderReservationInfo"/&gt;
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
    "parentProviderReservationInfo",
    "childProviderReservationInfo"
})
@XmlRootElement(name = "ProviderReservationDivideRsp")
public class ProviderReservationDivideRsp
    extends BaseRsp
{

    @XmlElement(name = "ParentProviderReservationInfo", required = true)
    protected ParentProviderReservationInfo parentProviderReservationInfo;
    @XmlElement(name = "ChildProviderReservationInfo", required = true)
    protected ChildProviderReservationInfo childProviderReservationInfo;

    /**
     * Gets the value of the parentProviderReservationInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ParentProviderReservationInfo }
     *     
     */
    public ParentProviderReservationInfo getParentProviderReservationInfo() {
        return parentProviderReservationInfo;
    }

    /**
     * Sets the value of the parentProviderReservationInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParentProviderReservationInfo }
     *     
     */
    public void setParentProviderReservationInfo(ParentProviderReservationInfo value) {
        this.parentProviderReservationInfo = value;
    }

    /**
     * Gets the value of the childProviderReservationInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ChildProviderReservationInfo }
     *     
     */
    public ChildProviderReservationInfo getChildProviderReservationInfo() {
        return childProviderReservationInfo;
    }

    /**
     * Sets the value of the childProviderReservationInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChildProviderReservationInfo }
     *     
     */
    public void setChildProviderReservationInfo(ChildProviderReservationInfo value) {
        this.childProviderReservationInfo = value;
    }

}
