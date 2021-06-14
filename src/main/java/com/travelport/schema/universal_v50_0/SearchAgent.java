
package com.travelport.schema.universal_v50_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/universal_v50_0}BranchId" maxOccurs="999" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="CreatedByAgent" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="ModifiedByAgent" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="TicketedByAgent" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "branchId"
})
@XmlRootElement(name = "SearchAgent")
public class SearchAgent {

    @XmlElement(name = "BranchId")
    protected List<String> branchId;
    @XmlAttribute(name = "CreatedByAgent")
    protected String createdByAgent;
    @XmlAttribute(name = "ModifiedByAgent")
    protected String modifiedByAgent;
    @XmlAttribute(name = "TicketedByAgent")
    protected String ticketedByAgent;

    /**
     * Gets the value of the branchId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the branchId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBranchId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getBranchId() {
        if (branchId == null) {
            branchId = new ArrayList<String>();
        }
        return this.branchId;
    }

    /**
     * Gets the value of the createdByAgent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreatedByAgent() {
        return createdByAgent;
    }

    /**
     * Sets the value of the createdByAgent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreatedByAgent(String value) {
        this.createdByAgent = value;
    }

    /**
     * Gets the value of the modifiedByAgent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModifiedByAgent() {
        return modifiedByAgent;
    }

    /**
     * Sets the value of the modifiedByAgent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModifiedByAgent(String value) {
        this.modifiedByAgent = value;
    }

    /**
     * Gets the value of the ticketedByAgent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTicketedByAgent() {
        return ticketedByAgent;
    }

    /**
     * Sets the value of the ticketedByAgent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTicketedByAgent(String value) {
        this.ticketedByAgent = value;
    }

}
