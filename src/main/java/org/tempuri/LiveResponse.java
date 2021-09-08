
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LiveResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LiveResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GetXMLReport" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="GetPDFStream" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/&gt;
 *         &lt;element name="OnError" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LiveResponse", propOrder = {
    "getXMLReport",
    "getPDFStream",
    "onError"
})
public class LiveResponse {

    @XmlElement(name = "GetXMLReport")
    protected String getXMLReport;
    @XmlElement(name = "GetPDFStream")
    protected byte[] getPDFStream;
    @XmlElement(name = "OnError")
    protected int onError;

    /**
     * Gets the value of the getXMLReport property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGetXMLReport() {
        return getXMLReport;
    }

    /**
     * Sets the value of the getXMLReport property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGetXMLReport(String value) {
        this.getXMLReport = value;
    }

    /**
     * Gets the value of the getPDFStream property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getGetPDFStream() {
        return getPDFStream;
    }

    /**
     * Sets the value of the getPDFStream property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setGetPDFStream(byte[] value) {
        this.getPDFStream = value;
    }

    /**
     * Gets the value of the onError property.
     * 
     */
    public int getOnError() {
        return onError;
    }

    /**
     * Sets the value of the onError property.
     * 
     */
    public void setOnError(int value) {
        this.onError = value;
    }

}
