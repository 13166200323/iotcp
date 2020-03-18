package com.iotcp.web.controller.monitor;

import com.iotcp.common.base.AjaxResult;
import com.iotcp.framework.web.page.TableDataInfo;
import com.iotcp.system.domain.*;
import com.iotcp.system.service.VehicleService;
import com.iotcp.web.core.base.BaseController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/system/Vehicle")
public class VehicleController extends BaseController {
    @Autowired
    private VehicleService vehicleService;


    /**
     * 加载所有入场车辆数据
     * @param objparkinVO
     * @return
     */
    @PostMapping("/vehicleentryList")
    @ResponseBody
    public TableDataInfo vehicleentryList(objparkinVO objparkinVO)
    {
        startPage();
        List<objparkin> list = vehicleService.vehicleentryList(objparkinVO);
        return getDataTable(list);
    }

    /**
     * 加载所有出场车辆数据
     * @param objparkOutVO
     * @return
     */
    @PostMapping("/vehicleexportList")
    @ResponseBody
    public TableDataInfo vehicleexportList(objparkOutVO objparkOutVO)
    {
        startPage();
        List<objparkOut> list = vehicleService.vehicleexportList(objparkOutVO);
        return getDataTable(list);
    }

    /**
     * 加载车辆分类配置数据
     * @return
     */
    @PostMapping("/getVehicleclassifyconfigure")
    @ResponseBody
    public TableDataInfo getVehicleclassifyconfigure(vehicleclassifyconfigure vehicleclassifyconfigure)
    {
        startPage();
        List<vehicleclassifyconfigure> vehicleclassifyconfigureList=vehicleService.getVehicleclassifyconfigure(vehicleclassifyconfigure);
        return  getDataTable(vehicleclassifyconfigureList);
    }
    /**
     * 新增车辆分类配置数据
     * @return
     */
    @PostMapping("/addVehicleclassifyconfigure")
    @ResponseBody
    public AjaxResult addVehicleclassifyconfigure(vehicleclassifyconfigure vehicleclassifyconfigure)
    {
        int result = vehicleService.addVehicleclassifyconfigure(vehicleclassifyconfigure);
        if (result!=0){
           return success("新增成功");
        }else
        {
           return error("新增失败");
        }
    }

    /**
     * 修改车辆分类配置数据
     * @param vehicleclassifyconfigure
     * @return
     */
    @PostMapping("/updateVehicleclassifyconfigure")
    @ResponseBody
    public AjaxResult updateVehicleclassifyconfigure(vehicleclassifyconfigure vehicleclassifyconfigure)
    {
        int result = vehicleService.updateVehicleclassifyconfigure(vehicleclassifyconfigure);
        if (result!=0){
            return success("修改成功");
        }else
        {
            return error("修改失败");
        }
    }

    /**
     * 删除车辆分类配置数据
     * @param id
     * @return
     */
    @PostMapping("/deleteVehicleclassifyconfigure")
    @ResponseBody
    public AjaxResult deleteVehicleclassifyconfigure(String id)
    {
        int result = vehicleService.deleteVehicleclassifyconfigure(id);
        if (result!=0){
            return success("删除成功");
        }else
        {
            return error("删除失败");
        }
    }

    /**
     * 加载车辆配置数据
     * @param vehicleconfigure
     * @return
     */
    @PostMapping("/getVehicleconfigure")
    @ResponseBody
    public TableDataInfo getVehicleconfigure(vehicleconfigure vehicleconfigure)
    {
        startPage();
        List<vehicleconfigureVo> vehicleconfigureList = vehicleService.getVehicleconfigure(vehicleconfigure);
        return getDataTable(vehicleconfigureList);
    }
    /**
     * 新增车辆配置数据
     * @param vehicleconfigure
     * @return
     */
    @PostMapping("/addVehicleconfigure")
    @ResponseBody
    public AjaxResult addVehicleconfigure(vehicleconfigure vehicleconfigure)
    {
        int result = vehicleService.addVehicleconfigure(vehicleconfigure);
        if (result!=0){
            return success("新增成功");
        }else
        {
            return error("新增失败");
        }
    }

    /**
     * 修改车辆配置数据
     * @param vehicleconfigure
     * @return
     */
    @PostMapping("/updateVehicleconfigure")
    @ResponseBody
    public AjaxResult updateVehicleconfigure(vehicleconfigure vehicleconfigure)
    {
        int result = vehicleService.updateVehicleconfigure(vehicleconfigure);
        if (result!=0){
            return success("修改成功");
        }else
        {
            return error("修改失败");
        }
    }

    /**
     * 删除车辆配置数据
     * @param id
     * @return
     */
    @PostMapping("/deleteVehicleconfigure")
    @ResponseBody
    public AjaxResult deleteVehicleconfigure(String id)
    {
        int result = vehicleService.deleteVehicleconfigure(id);
        if (result!=0){
            return success("删除成功");
        }else
        {
            return error("删除失败");
        }
    }

    /**
     * 车辆报表--图标
     * @param time
     * @return
     */
    @PostMapping("/vehicleReport")
    @ResponseBody
    public List<vehicleReport> vehicleReport(String time){
        return vehicleService.vehicleReport(time);
    }
}
