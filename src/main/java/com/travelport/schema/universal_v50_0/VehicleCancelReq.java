
package com.travelport.schema.universal_v50_0;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.travelport.schema.common_v50_0.BaseReq;
import com.travelport.schema.common_v50_0.FileFinishingInfo;
import com.travelport.schema.vehicle_v50_0.Vehicle;
import com.travelport.schema.vehicle_v50_0.VehicleDateLocation;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.travelport.com/schema/common_v50_0}BaseReq"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/vehicle_v50_0}VehicleDateLocation" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/vehicle_v50_0}Vehicle" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/common_v50_0}FileFinishingInfo" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.travelport.com/schema/universal_v50_0}providerReservation"/&gt;
 *       &lt;attribute name="SupplierCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="SupplierLocatorCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Version" use="required" type="{http://www.travelport.com/schema/common_v50_0}typeURVersion" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "vehicleDateLocation",
    "vehicle",
    "fileFinishingInfo"
})
@XmlRootElement(name = "VehicleCancelReq")
public class VehicleCancelReq
    extends BaseReq
{

    @XmlElement(name = "VehicleDateLocation", namespace = "http://www.travelport.com/schema/vehicle_v50_0")
    protected VehicleDateLocation vehicleDateLocation;
    @XmlElement(name = "Vehicle", namespace = "http://www.travelport.com/schema/vehicle_v50_0")
    protected Vehicle vehicle;
    @XmlElement(name = "FileFinishingInfo", namespace = "http://www.travelport.com/schema/common_v50_0")
    protected FileFinishingInfo fileFinishingInfo;
    @XmlAttribute(name = "SupplierCode")
    protected String supplierCode;
    @XmlAttribute(name = "SupplierLocatorCode")
    protected String supplierLocatorCode;
    @XmlAttribute(name = "Version", required = true)
    protected BigInteger version;
    @XmlAttribute(name = "ProviderCode", required = true)
    protected String providerCode;
    @XmlAttribute(name = "ProviderLocatorCode", required = true)
    protected String providerLocatorCode;

    /**
     * Gets the value of the vehicleDateLocation property.
     * 
     * @return
     *     possible object is
     *     {@link VehicleDateLocation }
     *     
     */
    public VehicleDateLocation getVehicleDateLocation() {
        return vehicleDateLocation;
    }

    /**
     * Sets the value of the vehicleDateLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleDateLocation }
     *     
     */
    public void setVehicleDateLocation(VehicleDateLocation value) {
        this.vehicleDateLocation = value;
    }

    /**
     * Gets the value of the vehicle property.
     * 
     * @return
     *     possible object is
     *     {@link Vehicle }
     *     
     */
    public Vehicle getVehicle() {
        return vehicle;
    }

    /**
     * Sets the value of the vehicle property.
     * 
     * @param value
     *     allowed object is
     *     {@link Vehicle }
     *     
     */
    public void setVehicle(Vehicle value) {
        this.vehicle = value;
    }

    /**
     * Gets the value of the fileFinishingInfo property.
     * 
     * @return
     *     possible object is
     *     {@link FileFinishingInfo }
     *     
     */
    public FileFinishingInfo getFileFinishingInfo() {
        return fileFinishingInfo;
    }

    /**
     * Sets the value of the fileFinishingInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link FileFinishingInfo }
     *     
     */
    public void setFileFinishingInfo(FileFinishingInfo value) {
        this.fileFinishingInfo = value;
    }

    /**
     * Gets the value of the supplierCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupplierCode() {
        return supplierCode;
    }

    /**
     * Sets the value of the supplierCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupplierCode(String value) {
        this.supplierCode = value;
    }

    /**
     * Gets the value of the supplierLocatorCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupplierLocatorCode() {
        return supplierLocatorCode;
    }

    /**
     * Sets the value of the supplierLocatorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupplierLocatorCode(String value) {
        this.supplierLocatorCode = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setVersion(BigInteger value) {
        this.version = value;
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

}
