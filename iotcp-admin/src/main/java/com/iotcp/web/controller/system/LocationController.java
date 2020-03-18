package com.iotcp.web.controller.system;

import lib.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * 定位--基站掉线警报
 *
 * @author iotcp
 */
@Controller
@RequestMapping("/system/location")
public class LocationController {

    /**
     * 加载当前服务器中的所有场景
     * page 页码   默认可为空
     * limit 每页数据条数   默认可为空
     * @return
     */
    @GetMapping("/getScene")
    @ResponseBody
    public Map<String,String> getScene(){
        Map<String,String> map = new HashMap<>();
        map.put("getScene", Scene.getScene(null,null).toString());
        return  map;
    }

    /**
         * 根据选中的场景 加载 所有的建筑
     * scene_id 场景 id 模块可为空
     * page 页码   默认可为空
     * limit 每页数据条数   默认可为空
     * @return
     */
    @GetMapping("/getBuilding/{sceneId}")
    @ResponseBody
    public Map<String,String> getBuilding(@PathVariable("sceneId") Integer sceneId){
        Map<String,String> map = new HashMap<>();
        map.put("getBuilding", Building.getBuilding(sceneId, null, null).toString());
        return  map;
    }

    /**
     * 根据选中的建筑 加载 所有的楼层
     * building_id 建筑 id 模块可为空
     * page 页码   默认可为空
     * limit 每页数据条数   默认可为空
     * @return
     */
    @GetMapping("/getFloor/{buildingId}")
    @ResponseBody
    public Map<String,String> getFloor(@PathVariable("buildingId") Integer buildingId){
        Map<String,String> map = new HashMap<>();
        map.put("getFloor", Floor.getFloor(buildingId,null,null).toString());
        return  map;
    }

    /**
     * 查询楼层中所有基站信息
     * floor_id 楼层 id 不能为空
     * @return
     */
    @GetMapping("/getAllBaseStationInfo/{floorId}")
    @ResponseBody
    public Map<String,String> getAllBaseStationInfo(@PathVariable("floorId") int floorId)
    {
        Map<String,String> map = new HashMap<>();
        map.put("getAllBaseStationInfo", BaseStation.getAllBaseStationInfo(floorId).toString());
        return  map;
    }

    /**
     *查询报警信息
     * @return
     */
    @GetMapping("/getAlarm")
    @ResponseBody
    public Map<String,String> getAlarm()
    {
        Map<String,String> map = new HashMap<>();
        map.put("getAlarm", Alarm.getAlarm(null,0,null,null,null,null,null,null,null,null).toString());
        return  map;
    }
    /**
     *查询一个月内未处理的报警、求救、欠压信息的次数
     * @return
     */
    @GetMapping("/getAllCount")
    @ResponseBody
    public Map<String,String> getAllCount()
    {
        Map<String,String> map = new HashMap<>();
        map.put("getAllCount", Alarm.getAllCount().toString());
        return  map;
    }
}
