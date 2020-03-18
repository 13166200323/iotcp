package com.iotcp.web.webservice.publish.hug;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import java.util.List;

@WebService
public interface BusinessDataQuerySoap {
    /**
     * 添加计划作业
     * @param json
     * @return
     */
    @WebResult(name = "AddPlanWorkingResult")
    boolean AddPlanWorking(@WebParam(name = "json", targetNamespace = "http://hug.publish.webservice.egb.com/") String json);

    /**
     * 报警接口
     * @param json
     * @return
     */
    @WebResult(name = "LevelOneAlarmResult")
    boolean LevelOneAlarm(@WebParam(name = "json", targetNamespace = "http://hug.publish.webservice.egb.com/") String json);

    /**
     * 现场情况上报
     * @param json
     * @return
     */
    @WebResult(name = "AddSiteReportResult")
    boolean AddSiteReport(@WebParam(name = "json", targetNamespace = "http://hug.publish.webservice.egb.com/") String json);
}
