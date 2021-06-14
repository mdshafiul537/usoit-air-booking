
package com.travelport.schema.universal_v50_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.travelport.schema.common_v50_0.TypeElementStatus;


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
 *         &lt;choice minOccurs="0"&gt;
 *           &lt;element ref="{http://www.travelport.com/schema/universal_v50_0}ProviderReservationDetails" minOccurs="0"/&gt;
 *           &lt;element ref="{http://www.travelport.com/schema/universal_v50_0}ProviderReservationDisplayDetailsList" minOccurs="0"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/universal_v50_0}ExternalReservationInfo" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.travelport.com/schema/common_v50_0}attrElementKeyResults"/&gt;
 *       &lt;attGroup ref="{http://www.travelport.com/schema/common_v50_0}attrAgentOverride"/&gt;
 *       &lt;attribute name="Key" use="required" type="{http://www.travelport.com/schema/common_v50_0}typeRef" /&gt;
 *       &lt;attribute name="ProviderCode" use="required" type="{http://www.travelport.com/schema/common_v50_0}typeProviderCode" /&gt;
 *       &lt;attribute name="LocatorCode" use="required" type="{http://www.travelport.com/schema/common_v50_0}typeProviderLocatorCode" /&gt;
 *       &lt;attribute name="CreateDate" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *       &lt;attribute name="HostCreateDate" type="{http://www.w3.org/2001/XMLSchema}date" /&gt;
 *       &lt;attribute name="HostCreateTime" type="{http://www.w3.org/2001/XMLSchema}time" /&gt;
 *       &lt;attribute name="ModifiedDate" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *       &lt;attribute name="Imported" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="TicketingModifiersRef" type="{http://www.travelport.com/schema/common_v50_0}typeRef" /&gt;
 *       &lt;attribute name="InQueueMode" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="GroupRef" type="{http://www.travelport.com/schema/common_v50_0}typeRef" /&gt;
 *       &lt;attribute name="OwningPCC" type="{http://www.travelport.com/schema/common_v50_0}typePCC" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "providerReservationDetails",
    "providerReservationDisplayDetailsList",
    "externalReservationInfo"
})
@XmlRootElement(name = "ProviderReservationInfo")
public class ProviderReservationInfo {

    @XmlElement(name = "ProviderReservationDetails")
    protected ProviderReservationDetails providerReservationDetails;
    @XmlElement(name = "ProviderReservationDisplayDetailsList")
    protected ProviderReservationDisplayDetailsList providerReservationDisplayDetailsList;
    @XmlElement(name = "ExternalReservationInfo")
    protected ExternalReservationInfo externalReservationInfo;
    @XmlAttribute(name = "Key", required = true)
    protected String key;
    @XmlAttribute(name = "ProviderCode", required = true)
    protected String providerCode;
    @XmlAttribute(name = "LocatorCode", required = true)
    protected String locatorCode;
    @XmlAttribute(name = "CreateDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createDate;
    @XmlAttribute(name = "HostCreateDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar hostCreateDate;
    @XmlAttribute(name = "HostCreateTime")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar hostCreateTime;
    @XmlAttribute(name = "ModifiedDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar modifiedDate;
    @XmlAttribute(name = "Imported")
    protected Boolean imported;
    @XmlAttribute(name = "TicketingModifiersRef")
    protected String ticketingModifiersRef;
    @XmlAttribute(name = "InQueueMode")
    protected Boolean inQueueMode;
    @XmlAttribute(name = "GroupRef")
    protected String groupRef;
    @XmlAttribute(name = "OwningPCC")
    protected String owningPCC;
    @XmlAttribute(name = "ElStat")
    protected TypeElementStatus elStat;
    @XmlAttribute(name = "KeyOverride")
    protected Boolean keyOverride;
    @XmlAttribute(name = "AgentOverride")
    protected String agentOverride;

    /**
     * Gets the value of the providerReservationDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ProviderReservationDetails }
     *     
     */
    public ProviderReservationDetails getProviderReservationDetails() {
        return providerReservationDetails;
    }

    /**
     * Sets the value of the providerReservationDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProviderReservationDetails }
     *     
     */
    public void setProviderReservationDetails(ProviderReservationDetails value) {
        this.providerReservationDetails = value;
    }

    /**
     * Gets the value of the providerReservationDisplayDetailsList property.
     * 
     * @return
     *     possible object is
     *     {@link ProviderReservationDisplayDetailsList }
     *     
     */
    public ProviderReservationDisplayDetailsList getProviderReservationDisplayDetailsList() {
        return providerReservationDisplayDetailsList;
    }

    /**
     * Sets the value of the providerReservationDisplayDetailsList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProviderReservationDisplayDetailsList }
     *     
     */
    public void setProviderReservationDisplayDetailsList(ProviderReservationDisplayDetailsList value) {
        this.providerReservationDisplayDetailsList = value;
    }

    /**
     * Gets the value of the externalReservationInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ExternalReservationInfo }
     *     
     */
    public ExternalReservationInfo getExternalReservationInfo() {
        return externalReservationInfo;
    }

    /**
     * Sets the value of the externalReservationInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExternalReservationInfo }
     *     
     */
    public void setExternalReservationInfo(ExternalReservationInfo value) {
        this.externalReservationInfo = value;
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
     * Gets the value of the locatorCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocatorCode() {
        return locatorCode;
    }

    /**
     * Sets the value of the locatorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocatorCode(String value) {
        this.locatorCode = value;
    }

    /**
     * Gets the value of the createDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreateDate() {
        return createDate;
    }

    /**
     * Sets the value of the createDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreateDate(XMLGregorianCalendar value) {
        this.createDate = value;
    }

    /**
     * Gets the value of the hostCreateDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getHostCreateDate() {
        return hostCreateDate;
    }

    /**
     * Sets the value of the hostCreateDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setHostCreateDate(XMLGregorianCalendar value) {
        this.hostCreateDate = value;
    }

    /**
     * Gets the value of the hostCreateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getHostCreateTime() {
        return hostCreateTime;
    }

    /**
     * Sets the value of the hostCreateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setHostCreateTime(XMLGregorianCalendar value) {
        this.hostCreateTime = value;
    }

    /**
     * Gets the value of the modifiedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getModifiedDate() {
        return modifiedDate;
    }

    /**
     * Sets the value of the modifiedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setModifiedDate(XMLGregorianCalendar value) {
        this.modifiedDate = value;
    }

    /**
     * Gets the value of the imported property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isImported() {
        return imported;
    }

    /**
     * Sets the value of the imported property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setImported(Boolean value) {
        this.imported = value;
    }

    /**
     * Gets the value of the ticketingModifiersRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTicketingModifiersRef() {
        return ticketingModifiersRef;
    }

    /**
     * Sets the value of the ticketingModifiersRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTicketingModifiersRef(String value) {
        this.ticketingModifiersRef = value;
    }

    /**
     * Gets the value of the inQueueMode property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInQueueMode() {
        return inQueueMode;
    }

    /**
     * Sets the value of the inQueueMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInQueueMode(Boolean value) {
        this.inQueueMode = value;
    }

    /**
     * Gets the value of the groupRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupRef() {
        return groupRef;
    }

    /**
     * Sets the value of the groupRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupRef(String value) {
        this.groupRef = value;
    }

    /**
     * Gets the value of the owningPCC property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwningPCC() {
        return owningPCC;
    }

    /**
     * Sets the value of the owningPCC property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwningPCC(String value) {
        this.owningPCC = value;
    }

    /**
     * Gets the value of the elStat property.
     * 
     * @return
     *     possible object is
     *     {@link TypeElementStatus }
     *     
     */
    public TypeElementStatus getElStat() {
        return elStat;
    }

    /**
     * Sets the value of the elStat property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeElementStatus }
     *     
     */
    public void setElStat(TypeElementStatus value) {
        this.elStat = value;
    }

    /**
     * Gets the value of the keyOverride property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isKeyOverride() {
        return keyOverride;
    }

    /**
     * Sets the value of the keyOverride property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setKeyOverride(Boolean value) {
        this.keyOverride = value;
    }

    /**
     * Gets the value of the agentOverride property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgentOverride() {
        return agentOverride;
    }

    /**
     * Sets the value of the agentOverride property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgentOverride(String value) {
        this.agentOverride = value;
    }

}
