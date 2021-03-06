
package com.travelport.schema.air_v50_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element ref="{http://www.travelport.com/schema/air_v50_0}TicketEndorsement"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "ticketEndorsement"
})
@XmlRootElement(name = "InvoluntaryChange")
public class InvoluntaryChange {

    @XmlElement(name = "TicketEndorsement", required = true)
    protected TicketEndorsement ticketEndorsement;

    /**
     * Gets the value of the ticketEndorsement property.
     * 
     * @return
     *     possible object is
     *     {@link TicketEndorsement }
     *     
     */
    public TicketEndorsement getTicketEndorsement() {
        return ticketEndorsement;
    }

    /**
     * Sets the value of the ticketEndorsement property.
     * 
     * @param value
     *     allowed object is
     *     {@link TicketEndorsement }
     *     
     */
    public void setTicketEndorsement(TicketEndorsement value) {
        this.ticketEndorsement = value;
    }

}
