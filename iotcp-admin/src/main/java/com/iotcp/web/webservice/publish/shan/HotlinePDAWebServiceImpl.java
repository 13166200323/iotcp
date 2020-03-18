package com.iotcp.web.webservice.publish.shan;

import org.springframework.stereotype.Service;

import javax.jws.WebService;

@Service
@WebService(serviceName = "HotlinePDAWebService", // 与接口中指定的name一致
        targetNamespace = "http://shan.publish.webservice.egb.com/", // 与接口中的命名空间一致,一般是接口的包名倒
        endpointInterface = "com.iotcp.web.webservice.publish.shan.HotlinePDAWebService" // 接口地址
)
public class HotlinePDAWebServiceImpl implements HotlinePDAWebService {
    @Override
    public String SaveBulletin(String xml) {
        xml = "成功";
        return xml;
    }
}
