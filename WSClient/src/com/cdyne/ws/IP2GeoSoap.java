
package com.cdyne.ws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "IP2GeoSoap", targetNamespace = "http://ws.cdyne.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface IP2GeoSoap {


    /**
     * Use a License Key of 0 for Testing
     * 
     * @param licenseKey
     * @param ipAddress
     * @return
     *     returns com.cdyne.ws.IPInformation
     */
    @WebMethod(operationName = "ResolveIP", action = "http://ws.cdyne.com/ResolveIP")
    @WebResult(name = "ResolveIPResult", targetNamespace = "http://ws.cdyne.com/")
    @RequestWrapper(localName = "ResolveIP", targetNamespace = "http://ws.cdyne.com/", className = "com.cdyne.ws.ResolveIP")
    @ResponseWrapper(localName = "ResolveIPResponse", targetNamespace = "http://ws.cdyne.com/", className = "com.cdyne.ws.ResolveIPResponse")
    public IPInformation resolveIP(
        @WebParam(name = "ipAddress", targetNamespace = "http://ws.cdyne.com/")
        String ipAddress,
        @WebParam(name = "licenseKey", targetNamespace = "http://ws.cdyne.com/")
        String licenseKey);

}
