//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.02.24 at 01:10:08 PM EST 
//


package com.litle.sdk.generate;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
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
 *       &lt;choice>
 *         &lt;sequence>
 *           &lt;element name="originalAccountInfo" type="{http://www.litle.com/schema}echeckAccountInfoType"/>
 *           &lt;element name="newAccountInfo" type="{http://www.litle.com/schema}echeckAccountInfoType"/>
 *         &lt;/sequence>
 *         &lt;sequence>
 *           &lt;element name="originalTokenInfo" type="{http://www.litle.com/schema}echeckTokenInfoType"/>
 *           &lt;element name="newTokenInfo" type="{http://www.litle.com/schema}echeckTokenInfoType"/>
 *         &lt;/sequence>
 *         &lt;sequence>
 *           &lt;element name="originalCardInfo" type="{http://www.litle.com/schema}cardAccountInfoType"/>
 *           &lt;element name="newCardInfo" type="{http://www.litle.com/schema}cardAccountInfoType"/>
 *           &lt;element name="extendedCardResponse" type="{http://www.litle.com/schema}extendedCardResponseType" minOccurs="0"/>
 *         &lt;/sequence>
 *         &lt;sequence>
 *           &lt;element name="originalCardTokenInfo" type="{http://www.litle.com/schema}cardTokenInfoType"/>
 *           &lt;element name="newCardTokenInfo" type="{http://www.litle.com/schema}cardTokenInfoType"/>
 *           &lt;element name="extendedCardResponse" type="{http://www.litle.com/schema}extendedCardResponseType" minOccurs="0"/>
 *         &lt;/sequence>
 *         &lt;element name="extendedCardResponse" type="{http://www.litle.com/schema}extendedCardResponseType" minOccurs="0"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "content"
})
@XmlRootElement(name = "accountUpdater")
@Generated(value = "com.sun.tools.xjc.Driver", date = "2012-02-24T01:10:07-05:00", comments = "JAXB RI v2.2.5")
public class AccountUpdater {

    @XmlElementRefs({
        @XmlElementRef(name = "originalCardTokenInfo", namespace = "http://www.litle.com/schema", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "originalAccountInfo", namespace = "http://www.litle.com/schema", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "newCardTokenInfo", namespace = "http://www.litle.com/schema", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "newCardInfo", namespace = "http://www.litle.com/schema", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "newTokenInfo", namespace = "http://www.litle.com/schema", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "newAccountInfo", namespace = "http://www.litle.com/schema", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "extendedCardResponse", namespace = "http://www.litle.com/schema", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "originalCardInfo", namespace = "http://www.litle.com/schema", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "originalTokenInfo", namespace = "http://www.litle.com/schema", type = JAXBElement.class, required = false)
    })
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-02-24T01:10:07-05:00", comments = "JAXB RI v2.2.5")
    protected List<JAXBElement<?>> content;

    /**
     * Gets the rest of the content model. 
     * 
     * <p>
     * You are getting this "catch-all" property because of the following reason: 
     * The field name "ExtendedCardResponse" is used by two different parts of a schema. See: 
     * line 1189 of file:/usr/local/litle-home/gdake/workspace-sts-2.8.1.RELEASE/litle-sdk-for-java/xsd/litleTransaction_v8.10.xsd
     * line 1183 of file:/usr/local/litle-home/gdake/workspace-sts-2.8.1.RELEASE/litle-sdk-for-java/xsd/litleTransaction_v8.10.xsd
     * <p>
     * To get rid of this property, apply a property customization to one 
     * of both of the following declarations to change their names: 
     * Gets the value of the content property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the content property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link EcheckAccountInfoType }{@code >}
     * {@link JAXBElement }{@code <}{@link CardTokenInfoType }{@code >}
     * {@link JAXBElement }{@code <}{@link CardTokenInfoType }{@code >}
     * {@link JAXBElement }{@code <}{@link EcheckTokenInfoType }{@code >}
     * {@link JAXBElement }{@code <}{@link CardAccountInfoType }{@code >}
     * {@link JAXBElement }{@code <}{@link EcheckAccountInfoType }{@code >}
     * {@link JAXBElement }{@code <}{@link ExtendedCardResponseType }{@code >}
     * {@link JAXBElement }{@code <}{@link CardAccountInfoType }{@code >}
     * {@link JAXBElement }{@code <}{@link EcheckTokenInfoType }{@code >}
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-02-24T01:10:07-05:00", comments = "JAXB RI v2.2.5")
    public List<JAXBElement<?>> getContent() {
        if (content == null) {
            content = new ArrayList<JAXBElement<?>>();
        }
        return this.content;
    }

}
