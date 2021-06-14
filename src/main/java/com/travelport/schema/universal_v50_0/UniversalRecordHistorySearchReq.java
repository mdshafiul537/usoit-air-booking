
package com.travelport.schema.universal_v50_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.travelport.schema.common_v50_0.BaseReq;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.travelport.com/schema/common_v50_0}BaseReq"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/universal_v50_0}UniversalRecordHistorySearchModifiers" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="UniversalRecordLocatorCode" use="required" type="{http://www.travelport.com/schema/common_v50_0}typeLocatorCode" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "universalRecordHistorySearchModifiers"
})
@XmlRootElement(name = "UniversalRecordHistorySearchReq")
public class UniversalRecordHistorySearchReq
    extends BaseReq
{

    @XmlElement(name = "UniversalRecordHistorySearchModifiers")
    protected UniversalRecordHistorySearchModifiers universalRecordHistorySearchModifiers;
    @XmlAttribute(name = "UniversalRecordLocatorCode", required = true)
    protected String universalRecordLocatorCode;

    /**
     * Gets the value of the universalRecordHistorySearchModifiers property.
     * 
     * @return
     *     possible object is
     *     {@link UniversalRecordHistorySearchModifiers }
     *     
     */
    public UniversalRecordHistorySearchModifiers getUniversalRecordHistorySearchModifiers() {
        return universalRecordHistorySearchModifiers;
    }

    /**
     * Sets the value of the universalRecordHistorySearchModifiers property.
     * 
     * @param value
     *     allowed object is
     *     {@link UniversalRecordHistorySearchModifiers }
     *     
     */
    public void setUniversalRecordHistorySearchModifiers(UniversalRecordHistorySearchModifiers value) {
        this.universalRecordHistorySearchModifiers = value;
    }

    /**
     * Gets the value of the universalRecordLocatorCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversalRecordLocatorCode() {
        return universalRecordLocatorCode;
    }

    /**
     * Sets the value of the universalRecordLocatorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversalRecordLocatorCode(String value) {
        this.universalRecordLocatorCode = value;
    }

}
