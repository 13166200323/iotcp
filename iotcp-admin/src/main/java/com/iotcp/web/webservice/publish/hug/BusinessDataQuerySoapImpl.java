package com.iotcp.web.webservice.publish.hug;

import org.springframework.stereotype.Service;

import javax.jws.WebResult;
import javax.jws.WebService;

@Service
@WebService(serviceName = "BusinessDataQuerySoap", // 与接口中指定的name一致
        targetNamespace = "http://hug.publish.webservice.egb.com/", // 与接口中的命名空间一致,一般是接口的包名倒
        endpointInterface = "com.egb.webservice.publish.hug.BusinessDataQuerySoap" // 接口地址
)
public class BusinessDataQuerySoapImpl implements BusinessDataQuerySoap {
    /**
     * 添加计划作业
     * @param json
     * @return
     */
    @Override
    public boolean AddPlanWorking(String json) {
        return true;
    }
    /**
     * 报警接口
     * @param json
     * @return
     */
    @Override
    public boolean LevelOneAlarm(String json) {
        return true;
    }
    /**
     * 现场情况上报
     * @param json
     * @return
     */
    @Override
    public boolean AddSiteReport(String json) {
        return true;
    }
}
