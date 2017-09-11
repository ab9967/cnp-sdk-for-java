//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.09.06 at 01:40:28 PM EDT 
//


package com.litle.sdk.generate;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for networkFieldNameEnumType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="networkFieldNameEnumType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Transaction Amount"/>
 *     &lt;enumeration value="Settlement Amount"/>
 *     &lt;enumeration value="Cardholder Billing Amount"/>
 *     &lt;enumeration value="Settlement Conversion Rate"/>
 *     &lt;enumeration value="Cardholder Billing Conversion Rate"/>
 *     &lt;enumeration value="Settlement Date"/>
 *     &lt;enumeration value="Authorization Identification Response"/>
 *     &lt;enumeration value="Response Code"/>
 *     &lt;enumeration value="Additional Response Data"/>
 *     &lt;enumeration value="Private Use Additional Data"/>
 *     &lt;enumeration value="Settlement Currency Code"/>
 *     &lt;enumeration value="Cardholder Billing Currency Code"/>
 *     &lt;enumeration value="Additional Amounts"/>
 *     &lt;enumeration value="Reserved Private"/>
 *     &lt;enumeration value="Transaction Description"/>
 *     &lt;enumeration value="Reserved for National Use"/>
 *     &lt;enumeration value="Reserved for Private Use"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "networkFieldNameEnumType")
@XmlEnum
public enum NetworkFieldNameEnumType {

    @XmlEnumValue("Transaction Amount")
    TRANSACTION_AMOUNT("Transaction Amount"),
    @XmlEnumValue("Settlement Amount")
    SETTLEMENT_AMOUNT("Settlement Amount"),
    @XmlEnumValue("Cardholder Billing Amount")
    CARDHOLDER_BILLING_AMOUNT("Cardholder Billing Amount"),
    @XmlEnumValue("Settlement Conversion Rate")
    SETTLEMENT_CONVERSION_RATE("Settlement Conversion Rate"),
    @XmlEnumValue("Cardholder Billing Conversion Rate")
    CARDHOLDER_BILLING_CONVERSION_RATE("Cardholder Billing Conversion Rate"),
    @XmlEnumValue("Settlement Date")
    SETTLEMENT_DATE("Settlement Date"),
    @XmlEnumValue("Authorization Identification Response")
    AUTHORIZATION_IDENTIFICATION_RESPONSE("Authorization Identification Response"),
    @XmlEnumValue("Response Code")
    RESPONSE_CODE("Response Code"),
    @XmlEnumValue("Additional Response Data")
    ADDITIONAL_RESPONSE_DATA("Additional Response Data"),
    @XmlEnumValue("Private Use Additional Data")
    PRIVATE_USE_ADDITIONAL_DATA("Private Use Additional Data"),
    @XmlEnumValue("Settlement Currency Code")
    SETTLEMENT_CURRENCY_CODE("Settlement Currency Code"),
    @XmlEnumValue("Cardholder Billing Currency Code")
    CARDHOLDER_BILLING_CURRENCY_CODE("Cardholder Billing Currency Code"),
    @XmlEnumValue("Additional Amounts")
    ADDITIONAL_AMOUNTS("Additional Amounts"),
    @XmlEnumValue("Reserved Private")
    RESERVED_PRIVATE("Reserved Private"),
    @XmlEnumValue("Transaction Description")
    TRANSACTION_DESCRIPTION("Transaction Description"),
    @XmlEnumValue("Reserved for National Use")
    RESERVED_FOR_NATIONAL_USE("Reserved for National Use"),
    @XmlEnumValue("Reserved for Private Use")
    RESERVED_FOR_PRIVATE_USE("Reserved for Private Use");
    private final String value;

    NetworkFieldNameEnumType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static NetworkFieldNameEnumType fromValue(String v) {
        for (NetworkFieldNameEnumType c: NetworkFieldNameEnumType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}