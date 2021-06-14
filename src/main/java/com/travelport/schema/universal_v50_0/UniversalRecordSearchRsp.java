
package com.travelport.schema.universal_v50_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
 *         &lt;element ref="{http://www.travelport.com/schema/universal_v50_0}UniversalRecordSearchResult" maxOccurs="999" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="MoreResults" use="required" type="{http://www.travelport.com/schema/common_v50_0}typeMoreResults" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "universalRecordSearchResult"
})
@XmlRootElement(name = "UniversalRecordSearchRsp")
public class UniversalRecordSearchRsp
    extends BaseRsp
{

    @XmlElement(name = "UniversalRecordSearchResult")
    protected List<UniversalRecordSearchResult> universalRecordSearchResult;
    @XmlAttribute(name = "MoreResults", required = true)
    protected boolean moreResults;

    /**
     * Gets the value of the universalRecordSearchResult property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the universalRecordSearchResult property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUniversalRecordSearchResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UniversalRecordSearchResult }
     * 
     * 
     */
    public List<UniversalRecordSearchResult> getUniversalRecordSearchResult() {
        if (universalRecordSearchResult == null) {
            universalRecordSearchResult = new ArrayList<UniversalRecordSearchResult>();
        }
        return this.universalRecordSearchResult;
    }

    /**
     * Gets the value of the moreResults property.
     * 
     */
    public boolean isMoreResults() {
        return moreResults;
    }

    /**
     * Sets the value of the moreResults property.
     * 
     */
    public void setMoreResults(boolean value) {
        this.moreResults = value;
    }

}
