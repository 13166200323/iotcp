/**
 * Copyright (c) 2017 Ehigh.Co.Ltd. All rights reserved.
 * Authors:
 * Li Zihao<sales@everhigh.com.cn>
 */
package lib;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Area {
    private static String module_name = "ModularArea";
    private static String controller_name = "Area";

    /**
     *
     * @param id 区域id
     * @param name 区域名称
     * @param type 区域类型
     * @param subnet_id 小区id
     * @param floor_id 楼层id
     * @param is_use 是否启用 0未启用 1启用
     * @param is_show 是否显示 0不显示 1显示
     * @param page 页码
     * @param limit 每页数据条数
     * @return Map
     * @throws IllegalArgumentException
     */
    public static Map getArea(Object id, Object name, Object type, Object subnet_id, Object floor_id, Object is_use, Object is_show, Object page, Object limit) throws IllegalArgumentException {
        if (floor_id != null && !(floor_id instanceof Integer))
            throw new IllegalArgumentException("Parameter error:floor_id instanceof Integer");
        if (name != null && !(name instanceof String))
            throw new IllegalArgumentException("Parameter error:name instanceof String");
        if (type != null && !(type instanceof Integer))
            throw new IllegalArgumentException("Parameter error:type instanceof Integer");
        if (subnet_id != null && !(subnet_id instanceof Integer))
            throw new IllegalArgumentException("Parameter error:subnet_id instanceof Integer");
        if (id != null && !(id instanceof Integer))
            throw new IllegalArgumentException("Parameter error:id instanceof Integer");
        if (is_use != null && !(is_use instanceof Integer))
            throw new IllegalArgumentException("Parameter error:is_use instanceof Integer");
        if (is_show != null && !(is_show instanceof Integer))
            throw new IllegalArgumentException("Parameter error:is_show instanceof Integer");
        if (page != null && !(page instanceof Integer))
            throw new IllegalArgumentException("Parameter error:page instanceof Integer");
        if (limit != null && !(limit instanceof Integer))
            throw new IllegalArgumentException("Parameter error:limit instanceof Integer");
        Map args = new HashMap();
        args.put("id", id);
        args.put("name", name);
        args.put("floor_id", floor_id);
        args.put("type", type);
        args.put("subnet_id", subnet_id);
        args.put("is_use", is_use);
        args.put("is_show", is_show);
        args.put("page", page);
        args.put("limit", limit);
        return Resquest.resquest(module_name, controller_name, Thread.currentThread().getStackTrace()[1].getMethodName(), args);
    }


    /*
     * 查询区域总数
     * @param int id 区域id
     * @param String name 区域名称
     * @param int type 区域类型
     * @param int subnet_id 小区id
     * @param int floor_id 楼层id
     * @param int is_use 是否启用
     * @param int is_show 是否显示
     * @return Map
     */
    public static Map getCount(Object id, Object name, Object type, Object subnet_id, Object floor_id, Object is_use, Object is_show) throws IllegalArgumentException {
        if (floor_id != null && !(floor_id instanceof Integer))
            throw new IllegalArgumentException("Parameter error:floor_id instanceof Integer");
        if (name != null && !(name instanceof String))
            throw new IllegalArgumentException("Parameter error:name instanceof String");
        if (type != null && !(type instanceof Integer))
            throw new IllegalArgumentException("Parameter error:type instanceof Integer");
        if (subnet_id != null && !(subnet_id instanceof Integer))
            throw new IllegalArgumentException("Parameter error:subnet_id instanceof Integer");
        if (id != null && !(id instanceof Integer))
            throw new IllegalArgumentException("Parameter error:id instanceof Integer");
        if (is_use != null && !(is_use instanceof Integer))
            throw new IllegalArgumentException("Parameter error:is_use instanceof Integer");
        if (is_show != null && !(is_show instanceof Integer))
            throw new IllegalArgumentException("Parameter error:is_show instanceof Integer");
        Map args = new HashMap();
        args.put("id", id);
        args.put("name", name);
        args.put("floor_id", floor_id);
        args.put("type", type);
        args.put("subnet_id", subnet_id);
        args.put("is_use", is_use);
        args.put("is_show", is_show);
        return Resquest.resquest(module_name, controller_name, Thread.currentThread().getStackTrace()[1].getMethodName(), args);
    }

    /*
     * 添加区域
     * @param int floor_id 楼层id
     * @param int type 区域类型
     * @param float z_start 区域起始高度
     * @param float z_end 区域终止高度
     * @param string name 区域名称
     * @param int is_use 是否启用
     * @param int is_show 是否显示
     * @param int subnet_id 小区id
     * @param string area 区域坐标信息
     * @param string zoom_area 模糊区域坐标信息
     * @param float zoom_len 模糊区域高度
     * @param string line_style 区域线条颜色
     * @param string area_style 区域填充颜色
     * @param array alarm_rule_ids 区域规则id数组
     * @param float relative_start 相对起始高度
     * @param float relative_end 相对终止高度
     * @param int is_gps 是否为gps楼层 0uwb楼层 1gps楼层
     * @return Map
     */
    public static Map addArea(int floor_id, int type, Object z_start, Object z_end, String name, Object is_use, Object is_show, Object subnet_id, Object area, Object zoom_area, Object zoom_len, Object line_style, Object area_style, Object alarm_rule_ids, Object relative_start, Object relative_end, Object is_gps) {
        if (z_start != null && !(z_start instanceof Float))
            throw new IllegalArgumentException("Parameter error:z_start instanceof Float");
        if (z_end != null && !(z_end instanceof Float))
            throw new IllegalArgumentException("Parameter error:z_end instanceof Float");
        if (is_show != null && !(is_show instanceof Integer))
            throw new IllegalArgumentException("Parameter error:is_show instanceof Integer");
        if (is_use != null && !(is_use instanceof Integer))
            throw new IllegalArgumentException("Parameter error:is_use instanceof Integer");
        if (subnet_id != null && !(subnet_id instanceof Integer))
            throw new IllegalArgumentException("Parameter error:subnet_id instanceof Integer");
        if (area != null && !(area instanceof String))
            throw new IllegalArgumentException("Parameter error:area instanceof String");
        if (zoom_area != null && !(zoom_area instanceof String))
            throw new IllegalArgumentException("Parameter error:zoom_area instanceof String");
        if (zoom_len != null && !(zoom_len instanceof Float))
            throw new IllegalArgumentException("Parameter error:zoom_len instanceof Float");
        if (line_style != null && !(line_style instanceof String))
            throw new IllegalArgumentException("Parameter error:line_style instanceof String");
        if (area_style != null && !(area_style instanceof String))
            throw new IllegalArgumentException("Parameter error:area_style instanceof String");
        if (alarm_rule_ids != null && !(alarm_rule_ids instanceof ArrayList))
            throw new IllegalArgumentException("Parameter error:alarm_rule_ids instanceof ArrayList");
        if (relative_start != null && !(relative_start instanceof Float))
            throw new IllegalArgumentException("Parameter error:relative_start instanceof Float");
        if (relative_end != null && !(relative_end instanceof Float))
            throw new IllegalArgumentException("Parameter error:relative_end instanceof Float");
        if (is_gps != null && !(is_gps instanceof Integer))
            throw new IllegalArgumentException("Parameter error:is_gps instanceof Integer");
        Map args = new HashMap();
        args.put("floor_id", floor_id);
        args.put("type", type);
        args.put("z_start", z_start);
        args.put("z_end", z_end);
        args.put("name", name);
        args.put("is_use", is_use);
        args.put("is_show", is_show);
        args.put("subnet_id", subnet_id);
        args.put("area", area);
        args.put("zoom_area", zoom_area);
        args.put("zoom_len", zoom_len);
        args.put("line_style", line_style);
        args.put("area_style", area_style);
        args.put("alarm_rule_ids", alarm_rule_ids);
        args.put("relative_start", relative_start);
        args.put("relative_end", relative_end);
        args.put("is_gps", is_gps);
        return Resquest.resquest(module_name, controller_name, Thread.currentThread().getStackTrace()[1].getMethodName(), args);
    }

    /*
     * 删除区域
     * @param int identification 区域id
     * @return Map
     */
    public static Map deleteArea(int identification) {
        Map args = new HashMap();
        args.put("id", identification);
        return Resquest.resquest(module_name, controller_name, Thread.currentThread().getStackTrace()[1].getMethodName(), args);
    }

    /*
     * 修改区域
     * @param int id 区域id
     * @param int floor_id 楼层id
     * @param int type 区域类型
     * @param float z_start 区域起始高度
     * @param float z_end 区域终止高度
     * @param string name 区域名称
     * @param int is_use 是否启用
     * @param int is_show 是否显示
     * @param int subnet_id 小区id
     * @param string area 区域坐标信息
     * @param string zoom_area 模糊区域坐标信息
     * @param float zoom_len 模糊区域高度
     * @param string line_style 区域线条颜色
     * @param string area_style 区域填充颜色
     * @param array alarm_rule_ids 区域规则id数组
     * @param float relative_start 相对起始高度
     * @param float relative_end 相对终止高度
     * @param float relative_end 相对终止高度
     * @param int is_gps 是否为gps楼层 0uwb楼层 1gps楼层
     * @return Map
     */
    public static Map updateArea(int id, Object floor_id, Object type, Object z_start, Object z_end, Object name, Object is_use, Object is_show, Object subnet_id, Object area, Object zoom_area, Object zoom_len, Object line_style, Object area_style, Object alarm_rule_ids, Object relative_start, Object relative_end, Object is_gps) {
        if (floor_id != null && !(floor_id instanceof Integer))
            throw new IllegalArgumentException("Parameter error:floor_id instanceof Integer");
        if (type != null && !(type instanceof Integer))
            throw new IllegalArgumentException("Parameter error:type instanceof Integer");
        if (z_start != null && !(z_start instanceof Float))
            throw new IllegalArgumentException("Parameter error:z_start instanceof Float");
        if (z_end != null && !(z_end instanceof Float))
            throw new IllegalArgumentException("Parameter error:z_end instanceof Float");
        if (name != null && !(name instanceof String))
            throw new IllegalArgumentException("Parameter error:name instanceof String");
        if (is_show != null && !(is_show instanceof Integer))
            throw new IllegalArgumentException("Parameter error:is_show instanceof Integer");
        if (is_use != null && !(is_use instanceof Integer))
            throw new IllegalArgumentException("Parameter error:is_use instanceof Integer");
        if (subnet_id != null && !(subnet_id instanceof Integer))
            throw new IllegalArgumentException("Parameter error:subnet_id instanceof Integer");
        if (area != null && !(area instanceof Integer))
            throw new IllegalArgumentException("Parameter error:area instanceof String");
        if (zoom_area != null && !(zoom_area instanceof Integer))
            throw new IllegalArgumentException("Parameter error:zoom_area instanceof String");
        if (zoom_len != null && !(zoom_len instanceof Float))
            throw new IllegalArgumentException("Parameter error:zoom_len instanceof Float");
        if (line_style != null && !(line_style instanceof String))
            throw new IllegalArgumentException("Parameter error:line_style instanceof String");
        if (area_style != null && !(area_style instanceof String))
            throw new IllegalArgumentException("Parameter error:area_style instanceof String");
        if (alarm_rule_ids != null && !(alarm_rule_ids instanceof ArrayList))
            throw new IllegalArgumentException("Parameter error:alarm_rule_ids instanceof ArrayList");
        if (relative_start != null && !(relative_start instanceof Float))
            throw new IllegalArgumentException("Parameter error:relative_start instanceof Float");
        if (relative_end != null && !(relative_end instanceof Float))
            throw new IllegalArgumentException("Parameter error:relative_end instanceof Float");
        if (is_gps != null && !(is_gps instanceof Integer))
            throw new IllegalArgumentException("Parameter error:is_gps instanceof Integer");
        Map args = new HashMap();
        args.put("id", id);
        args.put("floor_id", floor_id);
        args.put("type", type);
        args.put("z_start", z_start);
        args.put("z_end", z_end);
        args.put("name", name);
        args.put("is_use", is_use);
        args.put("is_show", is_show);
        args.put("subnet_id", subnet_id);
        args.put("area", area);
        args.put("zoom_area", zoom_area);
        args.put("zoom_len", zoom_len);
        args.put("line_style", line_style);
        args.put("area_style", area_style);
        args.put("alarm_rule_ids", alarm_rule_ids);
        args.put("relative_start", relative_start);
        args.put("relative_end", relative_end);
        args.put("is_gps", is_gps);
        return Resquest.resquest(module_name, controller_name, Thread.currentThread().getStackTrace()[1].getMethodName(), args);
    }
}
