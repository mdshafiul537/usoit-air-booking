
package com.travelport.schema.universal_v50_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.travelport.schema.common_v50_0.TypeProduct;


/**
 * Information on the product type and its provider
 *             
 * 
 * <p>Java class for typeSavedTripProductInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="typeSavedTripProductInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="ProductType" use="required" type="{http://www.travelport.com/schema/common_v50_0}typeProduct" /&gt;
 *       &lt;attribute name="VendorCode" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="ProviderCode" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "typeSavedTripProductInfo")
@XmlSeeAlso({
    com.travelport.schema.universal_v50_0.SavedTripSearchResult.ProductInfo.class
})
public class TypeSavedTripProductInfo {

    @XmlAttribute(name = "ProductType", required = true)
    protected TypeProduct productType;
    @XmlAttribute(name = "VendorCode", required = true)
    protected String vendorCode;
    @XmlAttribute(name = "ProviderCode", required = true)
    protected String providerCode;

    /**
     * Gets the value of the productType property.
     * 
     * @return
     *     possible object is
     *     {@link TypeProduct }
     *     
     */
    public TypeProduct getProductType() {
        return productType;
    }

    /**
     * Sets the value of the productType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeProduct }
     *     
     */
    public void setProductType(TypeProduct value) {
        this.productType = value;
    }

    /**
     * Gets the value of the vendorCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVendorCode() {
        return vendorCode;
    }

    /**
     * Sets the value of the vendorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVendorCode(String value) {
        this.vendorCode = value;
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

}
