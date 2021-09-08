
package org.tempuri;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.tempuri package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.tempuri
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PostRequest }
     * 
     */
    public PostRequest createPostRequest() {
        return new PostRequest();
    }

    /**
     * Create an instance of {@link PostRequestResponse }
     * 
     */
    public PostRequestResponse createPostRequestResponse() {
        return new PostRequestResponse();
    }

    /**
     * Create an instance of {@link GetXMLResWithPDF }
     * 
     */
    public GetXMLResWithPDF createGetXMLResWithPDF() {
        return new GetXMLResWithPDF();
    }

    /**
     * Create an instance of {@link GetXMLResWithPDFResponse }
     * 
     */
    public GetXMLResWithPDFResponse createGetXMLResWithPDFResponse() {
        return new GetXMLResWithPDFResponse();
    }

    /**
     * Create an instance of {@link LiveResponse }
     * 
     */
    public LiveResponse createLiveResponse() {
        return new LiveResponse();
    }

    /**
     * Create an instance of {@link ResponseByTicketID }
     * 
     */
    public ResponseByTicketID createResponseByTicketID() {
        return new ResponseByTicketID();
    }

    /**
     * Create an instance of {@link ResponseByTicketIDResponse }
     * 
     */
    public ResponseByTicketIDResponse createResponseByTicketIDResponse() {
        return new ResponseByTicketIDResponse();
    }

}
