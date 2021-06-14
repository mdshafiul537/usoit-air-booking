
package com.travelport.schema.air_v50_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.travelport.schema.common_v50_0.TypeSegmentRef;


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
 *         &lt;element ref="{http://www.travelport.com/schema/air_v50_0}PriceRange" maxOccurs="5" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/air_v50_0}Text" maxOccurs="99" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/air_v50_0}Title" maxOccurs="2" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/air_v50_0}ImageLocation" maxOccurs="3" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/air_v50_0}ServiceGroup" minOccurs="0"/&gt;
 *         &lt;element name="AirSegmentRef" type="{http://www.travelport.com/schema/common_v50_0}typeSegmentRef" maxOccurs="99"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Key" type="{http://www.travelport.com/schema/common_v50_0}typeRef" /&gt;
 *       &lt;attribute name="ServiceSubCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="ExternalServiceName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="ServiceType" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="CommercialName" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Chargeable" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "priceRange",
    "text",
    "title",
    "imageLocation",
    "serviceGroup",
    "airSegmentRef"
})
@XmlRootElement(name = "BrandingInfo")
public class BrandingInfo {

    @XmlElement(name = "PriceRange")
    protected List<PriceRange> priceRange;
    @XmlElement(name = "Text")
    protected List<TypeTextElement> text;
    @XmlElement(name = "Title")
    protected List<TypeTextElement> title;
    @XmlElement(name = "ImageLocation")
    protected List<ImageLocation> imageLocation;
    @XmlElement(name = "ServiceGroup")
    protected ServiceGroup serviceGroup;
    @XmlElement(name = "AirSegmentRef", required = true)
    protected List<TypeSegmentRef> airSegmentRef;
    @XmlAttribute(name = "Key")
    protected String key;
    @XmlAttribute(name = "ServiceSubCode")
    protected String serviceSubCode;
    @XmlAttribute(name = "ExternalServiceName")
    protected String externalServiceName;
    @XmlAttribute(name = "ServiceType")
    protected String serviceType;
    @XmlAttribute(name = "CommercialName", required = true)
    protected String commercialName;
    @XmlAttribute(name = "Chargeable")
    protected String chargeable;

    /**
     * The price range of the Ancillary Service.  Providers: 1G, 1V, 1P, 1J, ACH Gets the value of the priceRange property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the priceRange property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPriceRange().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PriceRange }
     * 
     * 
     */
    public List<PriceRange> getPriceRange() {
        if (priceRange == null) {
            priceRange = new ArrayList<PriceRange>();
        }
        return this.priceRange;
    }

    /**
     * Gets the value of the text property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the text property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getText().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeTextElement }
     * 
     * 
     */
    public List<TypeTextElement> getText() {
        if (text == null) {
            text = new ArrayList<TypeTextElement>();
        }
        return this.text;
    }

    /**
     * The additional titles associated to the brand or optional service. Providers: ACH, 1G, 1V, 1P, 1J Gets the value of the title property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the title property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTitle().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeTextElement }
     * 
     * 
     */
    public List<TypeTextElement> getTitle() {
        if (title == null) {
            title = new ArrayList<TypeTextElement>();
        }
        return this.title;
    }

    /**
     * Gets the value of the imageLocation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the imageLocation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getImageLocation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ImageLocation }
     * 
     * 
     */
    public List<ImageLocation> getImageLocation() {
        if (imageLocation == null) {
            imageLocation = new ArrayList<ImageLocation>();
        }
        return this.imageLocation;
    }

    /**
     * Gets the value of the serviceGroup property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceGroup }
     *     
     */
    public ServiceGroup getServiceGroup() {
        return serviceGroup;
    }

    /**
     * Sets the value of the serviceGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceGroup }
     *     
     */
    public void setServiceGroup(ServiceGroup value) {
        this.serviceGroup = value;
    }

    /**
     * Gets the value of the airSegmentRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the airSegmentRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAirSegmentRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeSegmentRef }
     * 
     * 
     */
    public List<TypeSegmentRef> getAirSegmentRef() {
        if (airSegmentRef == null) {
            airSegmentRef = new ArrayList<TypeSegmentRef>();
        }
        return this.airSegmentRef;
    }

    /**
     * Gets the value of the key property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKey() {
        return key;
    }

    /**
     * Sets the value of the key property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKey(String value) {
        this.key = value;
    }

    /**
     * Gets the value of the serviceSubCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceSubCode() {
        return serviceSubCode;
    }

    /**
     * Sets the value of the serviceSubCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceSubCode(String value) {
        this.serviceSubCode = value;
    }

    /**
     * Gets the value of the externalServiceName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalServiceName() {
        return externalServiceName;
    }

    /**
     * Sets the value of the externalServiceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalServiceName(String value) {
        this.externalServiceName = value;
    }

    /**
     * Gets the value of the serviceType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceType() {
        return serviceType;
    }

    /**
     * Sets the value of the serviceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceType(String value) {
        this.serviceType = value;
    }

    /**
     * Gets the value of the commercialName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommercialName() {
        return commercialName;
    }

    /**
     * Sets the value of the commercialName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommercialName(String value) {
        this.commercialName = value;
    }

    /**
     * Gets the value of the chargeable property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChargeable() {
        return chargeable;
    }

    /**
     * Sets the value of the chargeable property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChargeable(String value) {
        this.chargeable = value;
    }

}
