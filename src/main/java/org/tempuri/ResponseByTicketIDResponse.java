
package org.tempuri;

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
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ResponseByTicketIDResult" type="{http://tempuri.org/}LiveResponse" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "responseByTicketIDResult"
})
@XmlRootElement(name = "ResponseByTicketIDResponse")
public class ResponseByTicketIDResponse {

    @XmlElement(name = "ResponseByTicketIDResult")
    protected LiveResponse responseByTicketIDResult;

    /**
     * Gets the value of the responseByTicketIDResult property.
     * 
     * @return
     *     possible object is
     *     {@link LiveResponse }
     *     
     */
    public LiveResponse getResponseByTicketIDResult() {
        return responseByTicketIDResult;
    }

    /**
     * Sets the value of the responseByTicketIDResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link LiveResponse }
     *     
     */
    public void setResponseByTicketIDResult(LiveResponse value) {
        this.responseByTicketIDResult = value;
    }

}
