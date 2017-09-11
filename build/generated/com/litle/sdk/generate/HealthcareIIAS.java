//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.09.06 at 01:40:28 PM EDT 
//


package com.litle.sdk.generate;

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
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.litle.com/schema}healthcareAmounts"/>
 *         &lt;element name="IIASFlag" type="{http://www.litle.com/schema}IIASFlagType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "healthcareAmounts",
    "iiasFlag"
})
@XmlRootElement(name = "healthcareIIAS")
public class HealthcareIIAS {

    @XmlElement(required = true)
    protected HealthcareAmounts healthcareAmounts;
    @XmlElement(name = "IIASFlag", required = true)
    protected IIASFlagType iiasFlag;

    /**
     * Gets the value of the healthcareAmounts property.
     * 
     * @return
     *     possible object is
     *     {@link HealthcareAmounts }
     *     
     */
    public HealthcareAmounts getHealthcareAmounts() {
        return healthcareAmounts;
    }

    /**
     * Sets the value of the healthcareAmounts property.
     * 
     * @param value
     *     allowed object is
     *     {@link HealthcareAmounts }
     *     
     */
    public void setHealthcareAmounts(HealthcareAmounts value) {
        this.healthcareAmounts = value;
    }

    /**
     * Gets the value of the iiasFlag property.
     * 
     * @return
     *     possible object is
     *     {@link IIASFlagType }
     *     
     */
    public IIASFlagType getIIASFlag() {
        return iiasFlag;
    }

    /**
     * Sets the value of the iiasFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link IIASFlagType }
     *     
     */
    public void setIIASFlag(IIASFlagType value) {
        this.iiasFlag = value;
    }

}