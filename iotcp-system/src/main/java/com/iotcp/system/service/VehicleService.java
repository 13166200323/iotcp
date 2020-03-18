package com.iotcp.system.service;

import com.iotcp.system.domain.*;

import java.util.List;

public interface VehicleService {
    /**
     * 加载入场车辆数据
     * @param objparkinVO
     * @return
     */
    public List<objparkin> vehicleentryList(objparkinVO objparkinVO);

    /**
     * 加载出场车辆数据
     * @param objparkOutVO
     * @return
     */
    public List<objparkOut> vehicleexportList(objparkOutVO objparkOutVO);

    /**
     * 加载车辆分类配置数据
     * @param vehicleclassifyconfigure
     * @return
     */
    public List<vehicleclassifyconfigure> getVehicleclassifyconfigure(vehicleclassifyconfigure vehicleclassifyconfigure);

    /**
     * 新增车辆分类配置数据
     * @param vehicleclassifyconfigure
     * @return
     */
    public int addVehicleclassifyconfigure(vehicleclassifyconfigure vehicleclassifyconfigure);

    /**
     * 修改车辆分类配置数据
     * @param vehicleclassifyconfigure
     * @return
     */
    public int updateVehicleclassifyconfigure(vehicleclassifyconfigure vehicleclassifyconfigure);
    /**
     * 删除车辆分类配置数据
     * @param id
     * @return
     */
    public int deleteVehicleclassifyconfigure(String id);
    /**
     * 加载车辆配置数据
     * @param vehicleconfigure
     * @return
     */
    public List<vehicleconfigureVo> getVehicleconfigure(vehicleconfigure vehicleconfigure);

    /**
     * 新增车辆配置数据
     * @param vehicleconfigure
     * @return
     */
    public int addVehicleconfigure(vehicleconfigure vehicleconfigure);

    /**
     * 修改车辆配置数据
     * @param vehicleconfigure
     * @return
     */
    public int updateVehicleconfigure(vehicleconfigure vehicleconfigure);
    /**
     * 删除车辆配置数据
     * @param id
     * @return
     */
    public int deleteVehicleconfigure(String id);

    /**
     * 车辆统计报表--图标
     * @param time
     * @return
     */
    public List<vehicleReport> vehicleReport(String time);
}
