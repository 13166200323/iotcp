package com.iotcp.web.controller.monitor;

import com.iotcp.common.base.AjaxResult;
import com.iotcp.framework.web.page.TableDataInfo;
import com.iotcp.framework.web.page.TableDataInfoBak;
import com.iotcp.system.domain.ATS;
import com.iotcp.system.domain.TableList;
import com.iotcp.system.service.AlertService;
import com.iotcp.web.core.base.BaseController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 警报管理
 *
 * @author iotcp
 */
@Controller
@RequestMapping("/monitor/alert")
public class AlertController extends BaseController {
    @Autowired
    public AlertService alertService;

    @GetMapping("/alertList")
    @ResponseBody
    public TableDataInfo alertList(){
        startPage();
        List<TableList> tableLists = alertService.getTableList();
        return getDataTable(tableLists);
    }
    @PostMapping("/TableList")
    @ResponseBody
    public TableDataInfoBak TableList(ATS ats){
        List<ATS> atsList = alertService.getATS(ats);
        return getDataTableBak(atsList,alertService.getATSBak(ats));
    }
    @GetMapping("/AreaList")
    @ResponseBody
    public List<ATS> AreaList(ATS ats){
        List<ATS> atsList = alertService.getATSArea(ats);
        return  atsList;
    }
    @GetMapping("/ParaList")
    @ResponseBody
    public List<ATS> ParaList(ATS ats){
        List<ATS> atsList = alertService.getATSPara(ats);
        return  atsList;
    }
    @PostMapping("/updateStrategy")
    @ResponseBody
    public AjaxResult updateStrategy(ATS ats){
        String AlarmStrategy=null;
        if (ats.getAlarmStrategy().indexOf("&gt;")>0){
            AlarmStrategy=ats.getAlarmStrategy().replaceAll("&gt;",">");
            ats.setAlarmStrategy(AlarmStrategy);
        }  if (ats.getAlarmStrategy().indexOf("&lt;")>0){
            AlarmStrategy= ats.getAlarmStrategy().replaceAll("&lt;","<");
            ats.setAlarmStrategy(AlarmStrategy);
        }
        String AlarmDesc=null;
        if (ats.getAlarmDesc().indexOf("&gt;")>0){
            AlarmDesc=ats.getAlarmDesc().replaceAll("&gt;",">");
            ats.setAlarmDesc(AlarmDesc);
        }  if (ats.getAlarmDesc().indexOf("&lt;")>0){
            AlarmDesc= ats.getAlarmDesc().replaceAll("&lt;","<");
            ats.setAlarmDesc(AlarmDesc);
        }


        int resule = alertService.updateStrategy(ats);
        if (resule!=0){
            return  success();
        }else {
            return error();
        }
    }
}
