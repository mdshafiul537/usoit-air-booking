
package com.travelport.schema.air_v50_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Most Restrictive Penalties
 *             
 * 
 * <p>Java class for typeMostRestrictivePenalties complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="typeMostRestrictivePenalties"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RestrictionType" type="{http://www.travelport.com/schema/air_v50_0}typeRestrictionData" maxOccurs="999" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "typeMostRestrictivePenalties", propOrder = {
    "restrictionType"
})
public class TypeMostRestrictivePenalties {

    @XmlElement(name = "RestrictionType")
    protected List<TypeRestrictionData> restrictionType;

    /**
     * Gets the value of the restrictionType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the restrictionType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRestrictionType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeRestrictionData }
     * 
     * 
     */
    public List<TypeRestrictionData> getRestrictionType() {
        if (restrictionType == null) {
            restrictionType = new ArrayList<TypeRestrictionData>();
        }
        return this.restrictionType;
    }

}
