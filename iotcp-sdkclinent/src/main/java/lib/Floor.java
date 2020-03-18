/**
 * Copyright (c) 2017 Ehigh.Co.Ltd. All rights reserved.
 * Authors:
 * Li Zihao<sales@everhigh.com.cn>
 */
package lib;

import java.util.HashMap;
import java.util.Map;

/**
 * 楼层模块 Floor.java
 */
public class Floor {
    private static String module_name = "ModularFloor";
    private static String controller_name = "Floor";

    /**
     *
     * @param building_id 建筑id
     * @param page 页码
     * @param limit 每页数据条数
     * @return Map
     * @throws IllegalArgumentException
     */
    public static Map getFloor(Object building_id,Object page,Object limit) throws IllegalArgumentException {
        if (building_id != null && !(building_id instanceof Integer))
            throw new IllegalArgumentException("Parameter error:building_id instanceof Integer");
        if (page != null && !(page instanceof Integer))
            throw new IllegalArgumentException("Parameter error:page instanceof Integer");
        if (limit != null && !(limit instanceof Integer))
            throw new IllegalArgumentException("Parameter error:limit instanceof Integer");
        Map args = new HashMap();
        args.put("building_id", building_id);
        args.put("page", page);
        args.put("limit", limit);
        return Resquest.resquest(module_name, controller_name, Thread.currentThread().getStackTrace()[1].getMethodName(), args);
    }

    /*
     * 检测楼层名称是否已经存在
     * @param string floor_name 楼层名称
     * @param int building_id 所属建筑id
     * @return Map
     */
    public static Map floorNameAvailable(String floor_name, int building_id) {
        Map args = new HashMap();
        args.put("name", floor_name);
        args.put("building_id", building_id);
        return Resquest.resquest(module_name, controller_name, Thread.currentThread().getStackTrace()[1].getMethodName(), args);
    }

    /*
     * 添加楼层
     * @param   string floor_name 楼层名称
     * @param   float start 起始高度
     * @param   float height 层高
     * @param   int building_id 建筑id
     * @param   float floor_scaling_ratio 2d楼层文件缩放比
     * @param   float origin_x 原点x坐标
     * @param   float origin_y 原点y坐标
     * @param   float drop_multiple 地图拖拽倍数
     * @return Map
     */
    public static Map addFloor(String floor_name, Object start, Object height, int building_id, Object floor_scaling_ratio, Object origin_x, Object origin_y, Object drop_multiple) throws IllegalArgumentException {
        if (start != null && !(start instanceof Float))
            throw new IllegalArgumentException("Parameter error:start instanceof Float");
        if (height != null && !(height instanceof Float))
            throw new IllegalArgumentException("Parameter error:height instanceof Float");
        if (floor_scaling_ratio != null && !(floor_scaling_ratio instanceof Float))
            throw new IllegalArgumentException("Parameter error:floor_scaling_ratio instanceof Float");
        if (origin_x != null && !(origin_x instanceof Float))
            throw new IllegalArgumentException("Parameter error:origin_x instanceof Float");
        if (origin_y != null && !(origin_y instanceof Float))
            throw new IllegalArgumentException("Parameter error:origin_y instanceof Float");
        if (drop_multiple != null && !(drop_multiple instanceof Float))
            throw new IllegalArgumentException("Parameter error:drop_multiple instanceof Float");
        Map args = new HashMap();
        args.put("floor_name", floor_name);
        args.put("start", start);
        args.put("height", height);
        args.put("building_id", building_id);
        args.put("floor_scaling_ratio", floor_scaling_ratio);
        args.put("origin_x", origin_x);
        args.put("origin_y", origin_y);
        args.put("drop_multiple", drop_multiple);
        return Resquest.resquest(module_name, controller_name, Thread.currentThread().getStackTrace()[1].getMethodName(), args);
    }

    /*
     * 修改楼层
     * @param   int identification 楼层id
     * @param   string name 楼层名称
     * @param   float start 起始高度
     * @param   float height 层高
     * @param   float floor_scaling_ratio 2d楼层文件缩放比
     * @param   float origin_x 原点x坐标
     * @param   float origin_y 原点y坐标
     * @param   float drop_multiple 地图拖拽倍数
     * @return Map
     */
    public static Map updateFloor(int identification, Object name, Object start, Object height, Object floor_scaling_ratio, Object origin_x, Object origin_y, Object drop_multiple) throws IllegalArgumentException {
        if (name != null && !(name instanceof String))
            throw new IllegalArgumentException("Parameter error:name instanceof String");
        if (start != null && !(start instanceof Float))
            throw new IllegalArgumentException("Parameter error:start instanceof Float");
        if (height != null && !(height instanceof Float))
            throw new IllegalArgumentException("Parameter error:height instanceof Float");
        if (floor_scaling_ratio != null && !(floor_scaling_ratio instanceof Float))
            throw new IllegalArgumentException("Parameter error:floor_scaling_ratio instanceof Float");
        if (origin_x != null && !(origin_x instanceof Float))
            throw new IllegalArgumentException("Parameter error:origin_x instanceof Float");
        if (origin_y != null && !(origin_y instanceof Float))
            throw new IllegalArgumentException("Parameter error:origin_y instanceof Float");
        if (drop_multiple != null && !(drop_multiple instanceof Float))
            throw new IllegalArgumentException("Parameter error:drop_multiple instanceof Float");
        Map args = new HashMap();
        args.put("id", identification);
        args.put("name", name);
        args.put("start", start);
        args.put("height", height);
        args.put("floor_scaling_ratio", floor_scaling_ratio);
        args.put("origin_x", origin_x);
        args.put("origin_y", origin_y);
        args.put("drop_multiple", drop_multiple);
        return Resquest.resquest(module_name, controller_name, Thread.currentThread().getStackTrace()[1].getMethodName(), args);
    }

    /*
     * 删除楼层
     * @param   int identification 楼层id
     * @return Map
     */
    public static Map deleteFloor(int identification) {
        Map args = new HashMap();
        args.put("id", identification);
        return Resquest.resquest(module_name, controller_name, Thread.currentThread().getStackTrace()[1].getMethodName(), args);
    }

    /*
     * 返回楼层中的区域总数
     * @param   int identification 楼层id
     * @return Map
     */
    public static Map getFloorAreaCount(int identification) {
        Map args = new HashMap();
        args.put("id", identification);
        return Resquest.resquest(module_name, controller_name, Thread.currentThread().getStackTrace()[1].getMethodName(), args);
    }

    /*
     * 返回楼层的数量
     * @param int building_id 建筑id
     * @return Map
     */
    public static Map getCount(Object building_id) throws IllegalArgumentException {
        if (building_id != null && !(building_id instanceof Integer))
            throw new IllegalArgumentException("Parameter error:building_id instanceof Integer");
        Map args = new HashMap();
        args.put("building_id", building_id);
        return Resquest.resquest(module_name, controller_name, Thread.currentThread().getStackTrace()[1].getMethodName(), args);
    }
    /*
     * 根据楼层ID获取场景ID和建筑ID
     * @param int building_id 建筑id
     * @return Map
     */
    public static Map getOtherIdByFloorId(int floor_id) throws IllegalArgumentException {
        Map args = new HashMap();
        args.put("floor_id", floor_id);
        return Resquest.resquest(module_name, controller_name, Thread.currentThread().getStackTrace()[1].getMethodName(), args);
    }

    /**
     *
     * @param page 页码
     * @param limit 每页数据条数
     * @return Map
     * @throws IllegalArgumentException
     */
    public static Map getAllFloorInfo(Object page, Object limit) throws IllegalArgumentException {
        if (page != null && !(page instanceof Integer))
            throw new IllegalArgumentException("Parameter error:page instanceof Integer");
        if (limit != null && !(limit instanceof Integer))
            throw new IllegalArgumentException("Parameter error:limit instanceof Integer");
        Map args = new HashMap();
        args.put("page", page);
        args.put("limit", limit);
        return Resquest.resquest(module_name, controller_name, Thread.currentThread().getStackTrace()[1].getMethodName(), args);
    }

    public static Map getResolution(){
        return Resquest.resquest(module_name, controller_name, Thread.currentThread().getStackTrace()[1].getMethodName(), new HashMap());
    }
}