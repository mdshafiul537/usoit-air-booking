
package com.travelport.schema.common_v50_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BaseSearchReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BaseSearchReq"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.travelport.com/schema/common_v50_0}BaseReq"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/common_v50_0}NextResultReference" maxOccurs="999" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseSearchReq", propOrder = {
    "nextResultReference"
})
public class BaseSearchReq
    extends BaseReq
{

    @XmlElement(name = "NextResultReference")
    protected List<NextResultReference> nextResultReference;

    /**
     * Gets the value of the nextResultReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nextResultReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNextResultReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NextResultReference }
     * 
     * 
     */
    public List<NextResultReference> getNextResultReference() {
        if (nextResultReference == null) {
            nextResultReference = new ArrayList<NextResultReference>();
        }
        return this.nextResultReference;
    }

}
