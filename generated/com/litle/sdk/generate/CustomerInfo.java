//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.02.24 at 01:10:08 PM EST 
//


package com.litle.sdk.generate;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="ssn" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;pattern value="(\d{5})?\d{4}"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="dob" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="customerRegistrationDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="customerType" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="New"/>
 *               &lt;enumeration value="Existing"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="incomeAmount" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="incomeCurrency" type="{http://www.litle.com/schema}currencyCodeEnum" minOccurs="0"/>
 *         &lt;element name="customerCheckingAccount" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="customerSavingAccount" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="employerName" type="{http://www.litle.com/schema}string20Type" minOccurs="0"/>
 *         &lt;element name="customerWorkTelephone" type="{http://www.litle.com/schema}phoneType" minOccurs="0"/>
 *         &lt;element name="residenceStatus" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="Own"/>
 *               &lt;enumeration value="Rent"/>
 *               &lt;enumeration value="Other"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="yearsAtResidence" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;totalDigits value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="yearsAtEmployer" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;totalDigits value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {

})
@XmlRootElement(name = "customerInfo")
@Generated(value = "com.sun.tools.xjc.Driver", date = "2012-02-24T01:10:07-05:00", comments = "JAXB RI v2.2.5")
public class CustomerInfo {

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-02-24T01:10:07-05:00", comments = "JAXB RI v2.2.5")
    protected String ssn;
    @XmlSchemaType(name = "date")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-02-24T01:10:07-05:00", comments = "JAXB RI v2.2.5")
    protected XMLGregorianCalendar dob;
    @XmlSchemaType(name = "date")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-02-24T01:10:07-05:00", comments = "JAXB RI v2.2.5")
    protected XMLGregorianCalendar customerRegistrationDate;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-02-24T01:10:07-05:00", comments = "JAXB RI v2.2.5")
    protected String customerType;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-02-24T01:10:07-05:00", comments = "JAXB RI v2.2.5")
    protected Long incomeAmount;
    @XmlElement(defaultValue = "USD")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-02-24T01:10:07-05:00", comments = "JAXB RI v2.2.5")
    protected CurrencyCodeEnum incomeCurrency;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-02-24T01:10:07-05:00", comments = "JAXB RI v2.2.5")
    protected Boolean customerCheckingAccount;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-02-24T01:10:07-05:00", comments = "JAXB RI v2.2.5")
    protected Boolean customerSavingAccount;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-02-24T01:10:07-05:00", comments = "JAXB RI v2.2.5")
    protected String employerName;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-02-24T01:10:07-05:00", comments = "JAXB RI v2.2.5")
    protected String customerWorkTelephone;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-02-24T01:10:07-05:00", comments = "JAXB RI v2.2.5")
    protected String residenceStatus;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-02-24T01:10:07-05:00", comments = "JAXB RI v2.2.5")
    protected Integer yearsAtResidence;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-02-24T01:10:07-05:00", comments = "JAXB RI v2.2.5")
    protected Integer yearsAtEmployer;

    /**
     * Gets the value of the ssn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-02-24T01:10:07-05:00", comments = "JAXB RI v2.2.5")
    public String getSsn() {
        return ssn;
    }

    /**
     * Sets the value of the ssn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-02-24T01:10:07-05:00", comments = "JAXB RI v2.2.5")
    public void setSsn(String value) {
        this.ssn = value;
    }

    /**
     * Gets the value of the dob property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-02-24T01:10:07-05:00", comments = "JAXB RI v2.2.5")
    public XMLGregorianCalendar getDob() {
        return dob;
    }

    /**
     * Sets the value of the dob property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-02-24T01:10:07-05:00", comments = "JAXB RI v2.2.5")
    public void setDob(XMLGregorianCalendar value) {
        this.dob = value;
    }

    /**
     * Gets the value of the customerRegistrationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-02-24T01:10:07-05:00", comments = "JAXB RI v2.2.5")
    public XMLGregorianCalendar getCustomerRegistrationDate() {
        return customerRegistrationDate;
    }

    /**
     * Sets the value of the customerRegistrationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-02-24T01:10:07-05:00", comments = "JAXB RI v2.2.5")
    public void setCustomerRegistrationDate(XMLGregorianCalendar value) {
        this.customerRegistrationDate = value;
    }

    /**
     * Gets the value of the customerType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-02-24T01:10:07-05:00", comments = "JAXB RI v2.2.5")
    public String getCustomerType() {
        return customerType;
    }

    /**
     * Sets the value of the customerType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-02-24T01:10:07-05:00", comments = "JAXB RI v2.2.5")
    public void setCustomerType(String value) {
        this.customerType = value;
    }

    /**
     * Gets the value of the incomeAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-02-24T01:10:07-05:00", comments = "JAXB RI v2.2.5")
    public Long getIncomeAmount() {
        return incomeAmount;
    }

    /**
     * Sets the value of the incomeAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-02-24T01:10:07-05:00", comments = "JAXB RI v2.2.5")
    public void setIncomeAmount(Long value) {
        this.incomeAmount = value;
    }

    /**
     * Gets the value of the incomeCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyCodeEnum }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-02-24T01:10:07-05:00", comments = "JAXB RI v2.2.5")
    public CurrencyCodeEnum getIncomeCurrency() {
        return incomeCurrency;
    }

    /**
     * Sets the value of the incomeCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyCodeEnum }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-02-24T01:10:07-05:00", comments = "JAXB RI v2.2.5")
    public void setIncomeCurrency(CurrencyCodeEnum value) {
        this.incomeCurrency = value;
    }

    /**
     * Gets the value of the customerCheckingAccount property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-02-24T01:10:07-05:00", comments = "JAXB RI v2.2.5")
    public Boolean isCustomerCheckingAccount() {
        return customerCheckingAccount;
    }

    /**
     * Sets the value of the customerCheckingAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-02-24T01:10:07-05:00", comments = "JAXB RI v2.2.5")
    public void setCustomerCheckingAccount(Boolean value) {
        this.customerCheckingAccount = value;
    }

    /**
     * Gets the value of the customerSavingAccount property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-02-24T01:10:07-05:00", comments = "JAXB RI v2.2.5")
    public Boolean isCustomerSavingAccount() {
        return customerSavingAccount;
    }

    /**
     * Sets the value of the customerSavingAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-02-24T01:10:07-05:00", comments = "JAXB RI v2.2.5")
    public void setCustomerSavingAccount(Boolean value) {
        this.customerSavingAccount = value;
    }

    /**
     * Gets the value of the employerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-02-24T01:10:07-05:00", comments = "JAXB RI v2.2.5")
    public String getEmployerName() {
        return employerName;
    }

    /**
     * Sets the value of the employerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-02-24T01:10:07-05:00", comments = "JAXB RI v2.2.5")
    public void setEmployerName(String value) {
        this.employerName = value;
    }

    /**
     * Gets the value of the customerWorkTelephone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-02-24T01:10:07-05:00", comments = "JAXB RI v2.2.5")
    public String getCustomerWorkTelephone() {
        return customerWorkTelephone;
    }

    /**
     * Sets the value of the customerWorkTelephone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-02-24T01:10:07-05:00", comments = "JAXB RI v2.2.5")
    public void setCustomerWorkTelephone(String value) {
        this.customerWorkTelephone = value;
    }

    /**
     * Gets the value of the residenceStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-02-24T01:10:07-05:00", comments = "JAXB RI v2.2.5")
    public String getResidenceStatus() {
        return residenceStatus;
    }

    /**
     * Sets the value of the residenceStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-02-24T01:10:07-05:00", comments = "JAXB RI v2.2.5")
    public void setResidenceStatus(String value) {
        this.residenceStatus = value;
    }

    /**
     * Gets the value of the yearsAtResidence property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-02-24T01:10:07-05:00", comments = "JAXB RI v2.2.5")
    public Integer getYearsAtResidence() {
        return yearsAtResidence;
    }

    /**
     * Sets the value of the yearsAtResidence property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-02-24T01:10:07-05:00", comments = "JAXB RI v2.2.5")
    public void setYearsAtResidence(Integer value) {
        this.yearsAtResidence = value;
    }

    /**
     * Gets the value of the yearsAtEmployer property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-02-24T01:10:07-05:00", comments = "JAXB RI v2.2.5")
    public Integer getYearsAtEmployer() {
        return yearsAtEmployer;
    }

    /**
     * Sets the value of the yearsAtEmployer property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-02-24T01:10:07-05:00", comments = "JAXB RI v2.2.5")
    public void setYearsAtEmployer(Integer value) {
        this.yearsAtEmployer = value;
    }

}
