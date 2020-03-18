package com.iotcp.web.controller.monitor;

import com.iotcp.common.annotation.Log;
import com.iotcp.common.base.AjaxResult;
import com.iotcp.common.enums.BusinessType;
import com.iotcp.common.utils.ExcelUtil;
import com.iotcp.framework.web.page.TableDataInfo;
import com.iotcp.system.domain.SysLogininfor;
import com.iotcp.system.domain.SysLogininforVo;
import com.iotcp.system.service.ISysLogininforService;
import com.iotcp.web.core.base.BaseController;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * 系统访问记录
 * 
 * @author iotcp
 */
@Controller
@RequestMapping("/monitor/logininfor")
public class LogininforController extends BaseController
{
    private String prefix = "monitor/logininfor";

    @Autowired
    private ISysLogininforService logininforService;

    @RequiresPermissions("monitor:logininfor:view")
    @GetMapping()
    public String logininfor()
    {
        return prefix + "/logininfor";
    }

//    @RequiresPermissions("monitor:logininfor:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(SysLogininfor logininfor)
    {
        startPage();
        List<SysLogininfor> list = logininforService.selectLogininforList(logininfor);
        return getDataTable(list);
    }

    @Log(title = "登陆日志", businessType = BusinessType.EXPORT)
//    @RequiresPermissions("monitor:logininfor:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(SysLogininfor logininfor)
    {
        List<SysLogininfor> list = logininforService.selectLogininforList(logininfor);
        ExcelUtil<SysLogininfor> util = new ExcelUtil<SysLogininfor>(SysLogininfor.class);
        return util.exportExcel(list, "logininfor");
    }

//    @RequiresPermissions("monitor:logininfor:remove")
    @Log(title = "登陆日志", businessType = BusinessType.DELETE)
    @PostMapping("/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(logininforService.deleteLogininforByIds(ids));
    }
    
//    @RequiresPermissions("monitor:logininfor:remove")
    @Log(title = "登陆日志", businessType = BusinessType.CLEAN)
    @PostMapping("/clean")
    @ResponseBody
    public AjaxResult clean()
    {
        logininforService.cleanLogininfor();
        return success();
    }

    /**
     * 统计七天的登录数
     * @return
     */
    @GetMapping("/totalLogin")
    @ResponseBody
    public TableDataInfo totalLogin(){
        List<SysLogininforVo> sysLogininforList = logininforService.getTotalLogin();
        return getDataTable(sysLogininforList);
    }
}
