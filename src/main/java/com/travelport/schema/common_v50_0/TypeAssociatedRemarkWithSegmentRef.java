
package com.travelport.schema.common_v50_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.travelport.schema.air_v50_0.PocketItineraryRemark;


/**
 * A textual remark container to hold Associated itinerary remarks with segment association
 * 
 * <p>Java class for typeAssociatedRemarkWithSegmentRef complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="typeAssociatedRemarkWithSegmentRef"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.travelport.com/schema/common_v50_0}typeAssociatedRemark"&gt;
 *       &lt;attribute name="SegmentRef" type="{http://www.travelport.com/schema/common_v50_0}typeRef" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "typeAssociatedRemarkWithSegmentRef")
@XmlSeeAlso({
    com.travelport.schema.passive_v50_0.AssociatedRemark.class,
    PocketItineraryRemark.class,
    com.travelport.schema.air_v50_0.AssociatedRemark.class
})
public class TypeAssociatedRemarkWithSegmentRef
    extends TypeAssociatedRemark
{

    @XmlAttribute(name = "SegmentRef")
    protected String segmentRef;

    /**
     * Gets the value of the segmentRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSegmentRef() {
        return segmentRef;
    }

    /**
     * Sets the value of the segmentRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSegmentRef(String value) {
        this.segmentRef = value;
    }

}
