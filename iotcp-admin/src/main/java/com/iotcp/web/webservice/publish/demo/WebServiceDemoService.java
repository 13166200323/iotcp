package com.iotcp.web.webservice.publish.demo;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
 
/**
 * demo演示
 */
@WebService
public interface WebServiceDemoService {
 
    @WebMethod
    String hello(@WebParam(name = "name", targetNamespace = "http://demo.publish.webservice.egb.com/") String name);
    
}
