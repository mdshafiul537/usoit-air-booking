
package com.travelport.schema.universal_v50_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
 *       &lt;attGroup ref="{http://www.travelport.com/schema/universal_v50_0}providerReservation"/&gt;
 *       &lt;attGroup ref="{http://www.travelport.com/schema/universal_v50_0}attrProviderReservationDetails"/&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "ProviderReservationDisplayDetailsReq")
public class ProviderReservationDisplayDetailsReq
    extends BaseReq
{

    @XmlAttribute(name = "ProviderCode", required = true)
    protected String providerCode;
    @XmlAttribute(name = "ProviderLocatorCode", required = true)
    protected String providerLocatorCode;
    @XmlAttribute(name = "ProviderReservationDetail")
    protected Boolean providerReservationDetail;
    @XmlAttribute(name = "CustomCheck")
    protected Boolean customCheck;
    @XmlAttribute(name = "ProviderProfile")
    protected Boolean providerProfile;
    @XmlAttribute(name = "DivideDetails")
    protected Boolean divideDetails;
    @XmlAttribute(name = "EnhancedItinModifiers")
    protected Boolean enhancedItinModifiers;
    @XmlAttribute(name = "IntegratedContent")
    protected Boolean integratedContent;
    @XmlAttribute(name = "Cruise")
    protected Boolean cruise;
    @XmlAttribute(name = "RailSegment")
    protected Boolean railSegment;

    /**
     * Gets the value of the providerCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProviderCode() {
        return providerCode;
    }

    /**
     * Sets the value of the providerCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProviderCode(String value) {
        this.providerCode = value;
    }

    /**
     * Gets the value of the providerLocatorCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProviderLocatorCode() {
        return providerLocatorCode;
    }

    /**
     * Sets the value of the providerLocatorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProviderLocatorCode(String value) {
        this.providerLocatorCode = value;
    }

    /**
     * Gets the value of the providerReservationDetail property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isProviderReservationDetail() {
        return providerReservationDetail;
    }

    /**
     * Sets the value of the providerReservationDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setProviderReservationDetail(Boolean value) {
        this.providerReservationDetail = value;
    }

    /**
     * Gets the value of the customCheck property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCustomCheck() {
        return customCheck;
    }

    /**
     * Sets the value of the customCheck property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCustomCheck(Boolean value) {
        this.customCheck = value;
    }

    /**
     * Gets the value of the providerProfile property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isProviderProfile() {
        return providerProfile;
    }

    /**
     * Sets the value of the providerProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setProviderProfile(Boolean value) {
        this.providerProfile = value;
    }

    /**
     * Gets the value of the divideDetails property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDivideDetails() {
        return divideDetails;
    }

    /**
     * Sets the value of the divideDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDivideDetails(Boolean value) {
        this.divideDetails = value;
    }

    /**
     * Gets the value of the enhancedItinModifiers property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnhancedItinModifiers() {
        return enhancedItinModifiers;
    }

    /**
     * Sets the value of the enhancedItinModifiers property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnhancedItinModifiers(Boolean value) {
        this.enhancedItinModifiers = value;
    }

    /**
     * Gets the value of the integratedContent property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIntegratedContent() {
        return integratedContent;
    }

    /**
     * Sets the value of the integratedContent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIntegratedContent(Boolean value) {
        this.integratedContent = value;
    }

    /**
     * Gets the value of the cruise property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCruise() {
        return cruise;
    }

    /**
     * Sets the value of the cruise property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCruise(Boolean value) {
        this.cruise = value;
    }

    /**
     * Gets the value of the railSegment property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRailSegment() {
        return railSegment;
    }

    /**
     * Sets the value of the railSegment property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRailSegment(Boolean value) {
        this.railSegment = value;
    }

}
