/**
 * Copyright (c) 2017 Ehigh.Co.Ltd. All rights reserved.
 * Authors:
 * Li Zihao<sales@everhigh.com.cn>
 */
package lib;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Dynamic {
    private static String module_name = "ModularArea";
    private static String controller_name = "Dynamic";

    /**
     *
     * @param card_id 卡号
     * @param page 页码
     * @param limit 每页数据条数
     * @param is_use 是否启用 0未启用 1启用
     * @return Map
     * @throws IllegalArgumentException
     */
    public static Map getDynamic(Object card_id, Object page, Object limit, Object is_use, Object type) throws IllegalArgumentException {
        if (card_id != null && !(card_id instanceof Integer))
            throw new IllegalArgumentException("Parameter error:card_id instanceof Integer");
        if (page != null && !(page instanceof Integer))
            throw new IllegalArgumentException("Parameter error:page instanceof Integer");
        if (limit != null && !(limit instanceof Integer))
            throw new IllegalArgumentException("Parameter error:limit instanceof Integer");
        if (is_use != null && !(is_use instanceof Integer))
            throw new IllegalArgumentException("Parameter error:is_use instanceof Integer");
        if (type != null && !(type instanceof Integer))
            throw new IllegalArgumentException("Parameter error:type instanceof Integer");
        Map args = new HashMap();
        args.put("card_id", card_id);
        args.put("page", page);
        args.put("limit", limit);
        args.put("is_use", is_use);
        args.put("type", type);
        return Resquest.resquest(module_name, controller_name, Thread.currentThread().getStackTrace()[1].getMethodName(), args);
    }

    /*
     * 修改动态区域
     * @param int id 区域id
     * @param String name 区域名称
     * @param int card_id 卡号id
     * @param float radius 区域半径
     * @param string note 备注
     * @param array alarm_rule_ids 区域规则数组
     * @return Map
     */
    public static Map updateDynamic(int id, Object name, Object card_id, Object radius, Object note, Object alarm_rule_ids, Object is_use, Object alarm_rule_id, Object rule_name, Object type, Object card_all, Object data, Object start_time, Object end_time, Object special_json, Object comment, Object day_json, Object time_json, Object card_ids) throws IllegalArgumentException {
        if (note != null && !(note instanceof String))
            throw new IllegalArgumentException("Parameter error:note instanceof String");
        if (alarm_rule_ids != null && !(alarm_rule_ids instanceof ArrayList))
            throw new IllegalArgumentException("Parameter error:alarm_rule_ids instanceof ArrayList");
        if (is_use != null && !(is_use instanceof Integer))
            throw new IllegalArgumentException("Parameter error:is_use instanceof Integer");
        if (rule_name != null && !(rule_name instanceof String))
            throw new IllegalArgumentException("Parameter error:rule_name instanceof String");
        if (type != null && !(type instanceof Integer))
            throw new IllegalArgumentException("Parameter error:type instanceof Integer");
        if (card_all != null && !(card_all instanceof Integer))
            throw new IllegalArgumentException("Parameter error:card_all instanceof Integer");
        if (data != null && !(data instanceof Float))
            throw new IllegalArgumentException("Parameter error:data instanceof Float");
        if (start_time != null && !(start_time instanceof Long))
            throw new IllegalArgumentException("Parameter error:start_time instanceof Long");
        if (special_json != null && !(special_json instanceof String))
            throw new IllegalArgumentException("Parameter error:special_json instanceof String");
        if (comment != null && !(comment instanceof String))
            throw new IllegalArgumentException("Parameter error:comment instanceof String");
        if (day_json != null && !(day_json instanceof ArrayList))
            throw new IllegalArgumentException("Parameter error:day_json instanceof ArrayList");
        if (time_json != null && !(time_json instanceof ArrayList))
            throw new IllegalArgumentException("Parameter error:time_json instanceof ArrayList");
        if (card_ids != null && !(card_ids instanceof ArrayList))
            throw new IllegalArgumentException("Parameter error:card_ids instanceof ArrayList");
        if (end_time != null && !(end_time instanceof Long))
            throw new IllegalArgumentException("Parameter error:end_time instanceof Long");
        if (alarm_rule_id != null && !(alarm_rule_id instanceof Integer))
            throw new IllegalArgumentException("Parameter error:alarm_rule_id instanceof Integer");
        Map args = new HashMap();
        args.put("id", id);
        args.put("card_id", card_id);
        args.put("name", name);
        args.put("radius", radius);
        args.put("note", note);
        args.put("alarm_rule_ids", alarm_rule_ids);
        args.put("is_use", is_use);
        args.put("alarm_rule_id", alarm_rule_id);
        args.put("rule_name", rule_name);
        args.put("type", type);
        args.put("card_all", card_all);
        args.put("data", data);
        args.put("start_time", start_time);
        args.put("end_time", end_time);
        args.put("special_json", special_json);
        args.put("comment", comment);
        args.put("day_json", day_json);
        args.put("time_json", time_json);
        args.put("card_ids", card_ids);
        return Resquest.resquest(module_name, controller_name, Thread.currentThread().getStackTrace()[1].getMethodName(), args);
    }
    /*
     * 添加动态区域
     * @param String name 区域名称
     * @param int card_id 卡号id
     * @param float radius 区域半径
     * @param string note 备注
     * @param array alarm_rule_ids 区域规则数组
     * @return Map
     */
    public static Map addDynamic(String name, int card_id, Float radius, Object note, Object alarm_rule_ids, Object is_use, Object rule_name, Object type, Object card_all, Object data, Object start_time, Object end_time, Object special_json, Object comment, Object day_json, Object time_json, Object card_ids) throws IllegalArgumentException {
        if (note != null && !(note instanceof String))
            throw new IllegalArgumentException("Parameter error:note instanceof String");
        if (alarm_rule_ids != null && !(alarm_rule_ids instanceof ArrayList))
            throw new IllegalArgumentException("Parameter error:alarm_rule_ids instanceof ArrayList");
        if (is_use != null && !(is_use instanceof Integer))
            throw new IllegalArgumentException("Parameter error:is_use instanceof Integer");
        if (rule_name != null && !(rule_name instanceof String))
            throw new IllegalArgumentException("Parameter error:rule_name instanceof String");
        if (type != null && !(type instanceof Integer))
            throw new IllegalArgumentException("Parameter error:type instanceof Integer");
        if (card_all != null && !(card_all instanceof Integer))
            throw new IllegalArgumentException("Parameter error:card_all instanceof Integer");
        if (data != null && !(data instanceof Float))
            throw new IllegalArgumentException("Parameter error:data instanceof Float");
        if (start_time != null && !(start_time instanceof Long))
            throw new IllegalArgumentException("Parameter error:start_time instanceof Long");
        if (special_json != null && !(special_json instanceof String))
            throw new IllegalArgumentException("Parameter error:special_json instanceof String");
        if (comment != null && !(comment instanceof String))
            throw new IllegalArgumentException("Parameter error:comment instanceof String");
        if (day_json != null && !(day_json instanceof ArrayList))
            throw new IllegalArgumentException("Parameter error:day_json instanceof ArrayList");
        if (time_json != null && !(time_json instanceof ArrayList))
            throw new IllegalArgumentException("Parameter error:time_json instanceof ArrayList");
        if (card_ids != null && !(card_ids instanceof ArrayList))
            throw new IllegalArgumentException("Parameter error:card_ids instanceof ArrayList");
        if (end_time != null && !(end_time instanceof Long))
            throw new IllegalArgumentException("Parameter error:end_time instanceof Long");
        Map args = new HashMap();
        args.put("card_id", card_id);
        args.put("name", name);
        args.put("radius", radius);
        args.put("note", note);
        args.put("alarm_rule_ids", alarm_rule_ids);
        args.put("is_use", is_use);
        args.put("rule_name", rule_name);
        args.put("type", type);
        args.put("card_all", card_all);
        args.put("data", data);
        args.put("start_time", start_time);
        args.put("end_time", end_time);
        args.put("special_json", special_json);
        args.put("comment", comment);
        args.put("day_json", day_json);
        args.put("time_json", time_json);
        args.put("card_ids", card_ids);
        return Resquest.resquest(module_name, controller_name, Thread.currentThread().getStackTrace()[1].getMethodName(), args);
    }
    /*
     * 获取动态区域数量
     * @param int card_id 卡号id
     * @return Map
     */
    public static Map getCount(Object card_id, Object is_use, Object type) throws IllegalArgumentException {
        if (card_id != null && !(card_id instanceof Integer))
            throw new IllegalArgumentException("Parameter error:card_id instanceof Integer");
        if (is_use != null && !(is_use instanceof Integer))
            throw new IllegalArgumentException("Parameter error:is_use instanceof Integer");
        if (type != null && !(type instanceof Integer))
            throw new IllegalArgumentException("Parameter error:type instanceof Integer");
        Map args = new HashMap();
        args.put("card_id", card_id);
        args.put("is_use", is_use);
        args.put("type", type);
        return Resquest.resquest(module_name, controller_name, Thread.currentThread().getStackTrace()[1].getMethodName(), args);
    }
    /*
     * 获取动态区域
     * @param int id 区域信息id
     * @return Map
     */
    public static Map deleteDynamic(int id) throws IllegalArgumentException {
        Map args = new HashMap();
        args.put("id", id);
        return Resquest.resquest(module_name, controller_name, Thread.currentThread().getStackTrace()[1].getMethodName(), args);
    }
}