package com.iotcp.web.webservice.publish.shan;

import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

@WebService
public interface HotlinePDAWebService {
    /**
     * 添加停水公告
     * @param xml
     * @return
     */
    @WebResult(name = "SaveBulletinResult")
    String SaveBulletin(@WebParam(name = "xml", targetNamespace = "http://shan.publish.webservice.egb.com/") String xml);
}
