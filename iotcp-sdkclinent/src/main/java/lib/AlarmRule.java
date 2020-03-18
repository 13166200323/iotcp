/**
 * Copyright (c) 2017 Ehigh.Co.Ltd. All rights reserved.
 * Authors:
 * Li Zihao<sales@everhigh.com.cn>
 */
package lib;

import net.sf.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class AlarmRule {
    private static String module_name = "ModularAlarmRule";
    private static String controller_name = "AlarmRule";


    /**
     * 获取规则信息
     * @param id 规则id
     * @param name 规则名称
     * @param type 规则类型 0无判断1仅允许进入2仅拒绝进入3仅允许离开4仅拒绝离开5区域超时6区域不动7区域消失8聚众报警9离开距离报警（监护组）10靠近范围报警（危险源）
     * @param card_all 规则是否对所有卡生效
     * @param is_use 是否开启
     * @param data 报警类型判断的界限值，0为没有使用。目前使用：超时时间戳，不动时间戳，聚众人数个数
     * @param start_time 开始时间
     * @param end_time 结束时间
     * @param page 页码
     * @param limit 每页数据条数
     * @return Map
     * @throws IllegalArgumentException
     */
    public static Map getAlarmRule(Object id, Object name, Object type, Object card_all, Object is_use, Object data, Object start_time, Object end_time, Object page, Object limit) throws IllegalArgumentException {
        if (id != null && !(id instanceof Integer))
            throw new IllegalArgumentException("Parameter error:id instanceof Integer");
        if (name != null && !(name instanceof String))
            throw new IllegalArgumentException("Parameter error:name instanceof String");
        if (type != null && !(type instanceof ArrayList))
            throw new IllegalArgumentException("Parameter error:type instanceof ArrayList");
        if (card_all != null && !(card_all instanceof Integer))
            throw new IllegalArgumentException("Parameter error:card_all instanceof Integer");
        if (is_use != null && !(is_use instanceof Integer))
            throw new IllegalArgumentException("Parameter error:is_use instanceof Integer");
        if (data != null && !(data instanceof Float))
            throw new IllegalArgumentException("Parameter error:data instanceof Float");
        if (start_time != null && !(start_time instanceof Long))
            throw new IllegalArgumentException("Parameter error:start_time instanceof Long");
        if (end_time != null && !(end_time instanceof Long))
            throw new IllegalArgumentException("Parameter error:end_time instanceof Long");
        if (page != null && !(page instanceof Integer))
            throw new IllegalArgumentException("Parameter error:page instanceof Integer");
        if (limit != null && !(limit instanceof Integer))
            throw new IllegalArgumentException("Parameter error:limit instanceof Integer");
        Map args = new HashMap();
        args.put("id", id);
        args.put("name", name);
        args.put("type", type);
        args.put("card_all", card_all);
        args.put("is_use", is_use);
        args.put("data", data);
        args.put("start_time", start_time);
        args.put("end_time", end_time);
        args.put("page", page);
        args.put("limit", limit);
        return Resquest.resquest(module_name, controller_name, Thread.currentThread().getStackTrace()[1].getMethodName(), args);
    }
    /*
     * 获取规则数量
     * @param int id 规则id
     * @param int name 规则名称
     * @param int type 规则类型 0无判断1仅允许进入2仅拒绝进入3仅允许离开4仅拒绝离开5区域超时6区域不动7区域消失8聚众报警9离开距离报警（监护组）10靠近范围报警（危险源）
     * @param int card_all 规则是否对所有卡生效
     * @param int is_use 是否开启
     * @param int data 报警类型判断的界限值，0为没有使用。目前使用：超时时间戳，不动时间戳，聚众人数个数
     * @param int start_time 开始时间
     * @param int end_time 结束时间
     * @return Map
     */
    public static Map getCount(Object id, Object name, Object type, Object card_all, Object is_use, Object data, Object start_time, Object end_time) throws IllegalArgumentException {
        if (id != null && !(id instanceof Integer))
            throw new IllegalArgumentException("Parameter error:id instanceof Integer");
        if (name != null && !(name instanceof String))
            throw new IllegalArgumentException("Parameter error:name instanceof String");
        if (type != null && !(type instanceof ArrayList))
            throw new IllegalArgumentException("Parameter error:type instanceof ArrayList");
        if (card_all != null && !(card_all instanceof Integer))
            throw new IllegalArgumentException("Parameter error:card_all instanceof Integer");
        if (is_use != null && !(is_use instanceof Integer))
            throw new IllegalArgumentException("Parameter error:is_use instanceof Integer");
        if (data != null && !(data instanceof Float))
            throw new IllegalArgumentException("Parameter error:data instanceof Float");
        if (start_time != null && !(start_time instanceof Long))
            throw new IllegalArgumentException("Parameter error:start_time instanceof Long");
        if (end_time != null && !(end_time instanceof Long))
            throw new IllegalArgumentException("Parameter error:end_time instanceof Long");
        Map args = new HashMap();
        args.put("id", id);
        args.put("name", name);
        args.put("type", type);
        args.put("card_all", card_all);
        args.put("is_use", is_use);
        args.put("data", data);
        args.put("start_time", start_time);
        args.put("end_time", end_time);
        return Resquest.resquest(module_name, controller_name, Thread.currentThread().getStackTrace()[1].getMethodName(), args);
    }
    /*
     * 添加规则信息
     * @param String name 规则名称
     * @param int type 规则类型 0无判断1仅允许进入2仅拒绝进入3仅允许离开4仅拒绝离开5区域超时6区域不动7区域消失8聚众报警9离开距离报警（监护组）10靠近范围报警（危险源）
     * @param int card_all 规则是否对所有卡生效
     * @param int is_use 是否开启
     * @param int data 报警类型判断的界限值，0为没有使用。目前使用：超时时间戳，不动时间戳，聚众人数个数
     * @param int start_time 开始时间
     * @param int end_time 结束时间
     * @param ArrayList day_json 循环检测设置星期json 例如星期一到星期天的数据格式：[0,1,2,3,4,5,6]
     * @param ArrayList time_json 时间段json 例如1点到2点：[{3600,7200}]
     * @param int comment 备注
     * @param int card_ids 卡号数组
     * @param string special_json 特殊json字符串
     * @return Map
     */
    public static Map addAlarmRule(String name, int type, Object card_all, Object is_use, Object data, Object start_time, Object end_time, Object day_json, Object time_json, Object comment, Object card_ids, Object special_json) throws IllegalArgumentException {
        if (card_all != null && !(card_all instanceof Integer))
            throw new IllegalArgumentException("Parameter error:card_all instanceof Integer");
        if (is_use != null && !(is_use instanceof Integer))
            throw new IllegalArgumentException("Parameter error:is_use instanceof Integer");
        if (data != null && !(data instanceof Float))
            throw new IllegalArgumentException("Parameter error:data instanceof Float");
        if (start_time != null && !(start_time instanceof Long))
            throw new IllegalArgumentException("Parameter error:start_time instanceof Long");
        if (end_time != null && !(end_time instanceof Long))
            throw new IllegalArgumentException("Parameter error:end_time instanceof Long");
        if (day_json != null && !(day_json instanceof ArrayList))
            throw new IllegalArgumentException("Parameter error:day_json instanceof ArrayList");
        if (time_json != null && !(time_json instanceof ArrayList))
            throw new IllegalArgumentException("Parameter error:time_json instanceof ArrayList");
        if (comment != null && !(comment instanceof String))
            throw new IllegalArgumentException("Parameter error:comment instanceof String");
        if (card_ids != null && !(card_ids instanceof ArrayList))
            throw new IllegalArgumentException("Parameter error:card_ids instanceof ArrayList");
        if (special_json != null && !(special_json instanceof String))
            throw new IllegalArgumentException("Parameter error:special_json instanceof String");
        Map args = new HashMap();
        args.put("name", name);
        args.put("type", type);
        args.put("card_all", card_all);
        args.put("is_use", is_use);
        args.put("data", data);
        args.put("start_time", start_time);
        args.put("end_time", end_time);
        args.put("day_json", day_json);
        args.put("time_json", time_json);
        args.put("comment", comment);
        args.put("card_ids", card_ids);
        args.put("special_json", special_json);
        return Resquest.resquest(module_name, controller_name, Thread.currentThread().getStackTrace()[1].getMethodName(), args);
    }
    /*
     * 修改规则信息
     * @param int id 规则id
     * @param int name 规则名称
     * @param int type 规则类型 0无判断1仅允许进入2仅拒绝进入3仅允许离开4仅拒绝离开5区域超时6区域不动7区域消失8聚众报警9离开距离报警（监护组）10靠近范围报警（危险源）
     * @param int card_all 规则是否对所有卡生效
     * @param int is_use 是否开启
     * @param int data 报警类型判断的界限值，0为没有使用。目前使用：超时时间戳，不动时间戳，聚众人数个数
     * @param int start_time 开始时间
     * @param int end_time 结束时间
     * @param ArrayList day_json 循环检测设置星期json 例如星期一到星期天的数据格式：[0,1,2,3,4,5,6]
     * @param ArrayList time_json 时间段json 例如1点到2点：[{3600,7200}]
     * @param int comment 备注
     * @param int card_ids 卡号数组
     * @param string special_json 特殊json字符串
     * @return Map
     */
    public static Map updateAlarmRule(int id, Object name, Object type, Object card_all, Object is_use, Object data, Object start_time, Object end_time, Object day_json, Object time_json, Object comment, Object card_ids, Object special_json) throws IllegalArgumentException {
        if (name != null && !(name instanceof String))
            throw new IllegalArgumentException("Parameter error:name instanceof String");
        if (type != null && !(type instanceof Integer))
            throw new IllegalArgumentException("Parameter error:type instanceof Integer");
        if (card_all != null && !(card_all instanceof Integer))
            throw new IllegalArgumentException("Parameter error:card_all instanceof Integer");
        if (is_use != null && !(is_use instanceof Integer))
            throw new IllegalArgumentException("Parameter error:is_use instanceof Integer");
        if (data != null && !(data instanceof Float))
            throw new IllegalArgumentException("Parameter error:data instanceof Float");
        if (start_time != null && !(start_time instanceof Long))
            throw new IllegalArgumentException("Parameter error:start_time instanceof Long");
        if (end_time != null && !(end_time instanceof Long))
            throw new IllegalArgumentException("Parameter error:end_time instanceof Long");
        if (day_json != null && !(day_json instanceof ArrayList))
            throw new IllegalArgumentException("Parameter error:day_json instanceof ArrayList");
        if (time_json != null && !(time_json instanceof ArrayList))
            throw new IllegalArgumentException("Parameter error:time_json instanceof ArrayList");
        if (comment != null && !(comment instanceof String))
            throw new IllegalArgumentException("Parameter error:comment instanceof String");
        if (card_ids != null && !(card_ids instanceof ArrayList))
            throw new IllegalArgumentException("Parameter error:card_ids instanceof ArrayList");
        if (special_json != null && !(special_json instanceof String))
            throw new IllegalArgumentException("Parameter error:special_json instanceof String");
        Map args = new HashMap();
        args.put("id", id);
        args.put("name", name);
        args.put("type", type);
        args.put("card_all", card_all);
        args.put("is_use", is_use);
        args.put("data", data);
        args.put("start_time", start_time);
        args.put("end_time", end_time);
        args.put("day_json", day_json);
        args.put("time_json", time_json);
        args.put("comment", comment);
        args.put("card_ids", card_ids);
        args.put("special_json", special_json);
        return Resquest.resquest(module_name, controller_name, Thread.currentThread().getStackTrace()[1].getMethodName(), args);
    }
    /*
     * 删除规则
     * @param int id 规则id
     * @return Map
     */
    public static Map deleteAlarmRule(int id) {
        Map args = new HashMap();
        args.put("id", id);
        return Resquest.resquest(module_name, controller_name, Thread.currentThread().getStackTrace()[1].getMethodName(), args);
    }

    /**
     * 根据卡号查询该卡号相关的所有报警规则
     * @param card_id 卡号
     * @return Map
     */
    public static Map getAlarmRuleByCard(int card_id) {
        Map args = new HashMap();
        args.put("card_id", card_id);
        return Resquest.resquest(module_name, controller_name, Thread.currentThread().getStackTrace()[1].getMethodName(), args);
    }
}