
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="strTicketId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="subjectType" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="strUserID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="strPassword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "strTicketId",
    "subjectType",
    "strUserID",
    "strPassword"
})
@XmlRootElement(name = "ResponseByTicketID")
public class ResponseByTicketID {

    protected String strTicketId;
    protected int subjectType;
    protected String strUserID;
    protected String strPassword;

    /**
     * Gets the value of the strTicketId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrTicketId() {
        return strTicketId;
    }

    /**
     * Sets the value of the strTicketId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrTicketId(String value) {
        this.strTicketId = value;
    }

    /**
     * Gets the value of the subjectType property.
     * 
     */
    public int getSubjectType() {
        return subjectType;
    }

    /**
     * Sets the value of the subjectType property.
     * 
     */
    public void setSubjectType(int value) {
        this.subjectType = value;
    }

    /**
     * Gets the value of the strUserID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrUserID() {
        return strUserID;
    }

    /**
     * Sets the value of the strUserID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrUserID(String value) {
        this.strUserID = value;
    }

    /**
     * Gets the value of the strPassword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrPassword() {
        return strPassword;
    }

    /**
     * Sets the value of the strPassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrPassword(String value) {
        this.strPassword = value;
    }

}
