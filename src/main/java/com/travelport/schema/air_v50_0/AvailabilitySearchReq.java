
package com.travelport.schema.air_v50_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.travelport.schema.common_v50_0.PointOfSale;
import com.travelport.schema.common_v50_0.SearchPassenger;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.travelport.com/schema/air_v50_0}AirSearchReq"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/common_v50_0}SearchPassenger" maxOccurs="18" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/common_v50_0}PointOfSale" maxOccurs="5" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="ReturnBrandIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="ChannelId"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;minLength value="2"/&gt;
 *             &lt;maxLength value="4"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="NSCC"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;minLength value="1"/&gt;
 *             &lt;maxLength value="3"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "searchPassenger",
    "pointOfSale"
})
@XmlRootElement(name = "AvailabilitySearchReq")
public class AvailabilitySearchReq
    extends AirSearchReq
{

    @XmlElement(name = "SearchPassenger", namespace = "http://www.travelport.com/schema/common_v50_0")
    protected List<SearchPassenger> searchPassenger;
    @XmlElement(name = "PointOfSale", namespace = "http://www.travelport.com/schema/common_v50_0")
    protected List<PointOfSale> pointOfSale;
    @XmlAttribute(name = "ReturnBrandIndicator")
    protected Boolean returnBrandIndicator;
    @XmlAttribute(name = "ChannelId")
    protected String channelId;
    @XmlAttribute(name = "NSCC")
    protected String nscc;

    /**
     * Provider: 1G,1V,1P,1J,ACH-Maxinumber of passenger increased in to 18 to support 9 INF passenger along with 9 ADT,CHD,INS 						passenger Gets the value of the searchPassenger property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the searchPassenger property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSearchPassenger().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchPassenger }
     * 
     * 
     */
    public List<SearchPassenger> getSearchPassenger() {
        if (searchPassenger == null) {
            searchPassenger = new ArrayList<SearchPassenger>();
        }
        return this.searchPassenger;
    }

    /**
     * Provider: ACH.Gets the value of the pointOfSale property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pointOfSale property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPointOfSale().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PointOfSale }
     * 
     * 
     */
    public List<PointOfSale> getPointOfSale() {
        if (pointOfSale == null) {
            pointOfSale = new ArrayList<PointOfSale>();
        }
        return this.pointOfSale;
    }

    /**
     * Gets the value of the returnBrandIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isReturnBrandIndicator() {
        if (returnBrandIndicator == null) {
            return false;
        } else {
            return returnBrandIndicator;
        }
    }

    /**
     * Sets the value of the returnBrandIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReturnBrandIndicator(Boolean value) {
        this.returnBrandIndicator = value;
    }

    /**
     * Gets the value of the channelId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChannelId() {
        return channelId;
    }

    /**
     * Sets the value of the channelId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChannelId(String value) {
        this.channelId = value;
    }

    /**
     * Gets the value of the nscc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNSCC() {
        return nscc;
    }

    /**
     * Sets the value of the nscc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNSCC(String value) {
        this.nscc = value;
    }

}
