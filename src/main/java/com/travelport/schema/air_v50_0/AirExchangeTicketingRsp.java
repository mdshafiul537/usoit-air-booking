
package com.travelport.schema.air_v50_0;

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
 *       &lt;choice&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/air_v50_0}AirSolutionChangedInfo" minOccurs="0"/&gt;
 *         &lt;sequence&gt;
 *           &lt;element ref="{http://www.travelport.com/schema/air_v50_0}ETR" minOccurs="0"/&gt;
 *           &lt;element ref="{http://www.travelport.com/schema/air_v50_0}TicketFailureInfo" minOccurs="0"/&gt;
 *           &lt;element ref="{http://www.travelport.com/schema/air_v50_0}DetailedBillingInformation" minOccurs="0"/&gt;
 *         &lt;/sequence&gt;
 *       &lt;/choice&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "airSolutionChangedInfo",
    "etr",
    "ticketFailureInfo",
    "detailedBillingInformation"
})
@XmlRootElement(name = "AirExchangeTicketingRsp")
public class AirExchangeTicketingRsp
    extends BaseRsp
{

    @XmlElement(name = "AirSolutionChangedInfo")
    protected AirSolutionChangedInfo airSolutionChangedInfo;
    @XmlElement(name = "ETR")
    protected ETR etr;
    @XmlElement(name = "TicketFailureInfo")
    protected TicketFailureInfo ticketFailureInfo;
    @XmlElement(name = "DetailedBillingInformation")
    protected DetailedBillingInformation detailedBillingInformation;

    /**
     * Gets the value of the airSolutionChangedInfo property.
     * 
     * @return
     *     possible object is
     *     {@link AirSolutionChangedInfo }
     *     
     */
    public AirSolutionChangedInfo getAirSolutionChangedInfo() {
        return airSolutionChangedInfo;
    }

    /**
     * Sets the value of the airSolutionChangedInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirSolutionChangedInfo }
     *     
     */
    public void setAirSolutionChangedInfo(AirSolutionChangedInfo value) {
        this.airSolutionChangedInfo = value;
    }

    /**
     * Provider 1G, 1V, 1P.
     * 
     * @return
     *     possible object is
     *     {@link ETR }
     *     
     */
    public ETR getETR() {
        return etr;
    }

    /**
     * Sets the value of the etr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ETR }
     *     
     */
    public void setETR(ETR value) {
        this.etr = value;
    }

    /**
     * Provider 1G, 1V, 1P.
     * 
     * @return
     *     possible object is
     *     {@link TicketFailureInfo }
     *     
     */
    public TicketFailureInfo getTicketFailureInfo() {
        return ticketFailureInfo;
    }

    /**
     * Sets the value of the ticketFailureInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link TicketFailureInfo }
     *     
     */
    public void setTicketFailureInfo(TicketFailureInfo value) {
        this.ticketFailureInfo = value;
    }

    /**
     * Providers 1G, 1V, 1P.
     * 
     * @return
     *     possible object is
     *     {@link DetailedBillingInformation }
     *     
     */
    public DetailedBillingInformation getDetailedBillingInformation() {
        return detailedBillingInformation;
    }

    /**
     * Sets the value of the detailedBillingInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link DetailedBillingInformation }
     *     
     */
    public void setDetailedBillingInformation(DetailedBillingInformation value) {
        this.detailedBillingInformation = value;
    }

}
