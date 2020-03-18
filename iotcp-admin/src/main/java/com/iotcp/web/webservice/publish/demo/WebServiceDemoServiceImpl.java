package com.iotcp.web.webservice.publish.demo;
import org.springframework.stereotype.Service;
import javax.jws.WebService;
 
@Service
@WebService(serviceName = "WebServiceDemoService", // 与接口中指定的name一致
        targetNamespace = "http://demo.publish.webservice.egb.com/", // 与接口中的命名空间一致,一般是接口的包名倒
        endpointInterface = "com.egb.webservice.publish.demo.WebServiceDemoService" // 接口地址
)
public class WebServiceDemoServiceImpl implements WebServiceDemoService {

    @Override
    public String hello(String name) {
        return "WebService Interface Testing"+name;
    }
 
 
}