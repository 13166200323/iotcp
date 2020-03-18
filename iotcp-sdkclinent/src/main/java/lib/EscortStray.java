/**
 * Copyright (c) 2017 Ehigh.Co.Ltd. All rights reserved.
 * Authors:
 * Li Zihao<sales@everhigh.com.cn>
 */
package lib;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class EscortStray {
    private static String module_name = "ModularArea";
    private static String controller_name = "EscortStray";

    /**
     * 获取陪同离群报警规则信息
     * @param name 规则名称
     * @param type 类型 11陪同报警 12离群报警
     * @param is_use 是否启用 1启用 0停用
     * @param radius 范围半径
     * @param card_id 被陪同的卡号id
     * @param page 页码
     * @param limit 每页数据条数
     * @return Map
     * @throws IllegalArgumentException
     */
    public static Map getEscortStray(Object name, Object type, Object is_use, Object radius, Object card_id, Object page, Object limit) throws IllegalArgumentException {
        if (name != null && !(name instanceof String))
            throw new IllegalArgumentException("Parameter error:name instanceof String");
        if (type != null && !(type instanceof Integer))
            throw new IllegalArgumentException("Parameter error:type instanceof Integer");
        if (is_use != null && !(is_use instanceof Integer))
            throw new IllegalArgumentException("Parameter error:is_use instanceof Integer");
        if (radius != null && !(radius instanceof Float))
            throw new IllegalArgumentException("Parameter error:radius instanceof Float");
        if (card_id != null && !(card_id instanceof Integer))
            throw new IllegalArgumentException("Parameter error:card_id instanceof Integer");
        if (page != null && !(page instanceof Integer))
            throw new IllegalArgumentException("Parameter error:page instanceof Integer");
        if (limit != null && !(limit instanceof Integer))
            throw new IllegalArgumentException("Parameter error:limit instanceof Integer");
        Map args = new HashMap();
        args.put("name", name);
        args.put("type", type);
        args.put("is_use", is_use);
        args.put("radius", radius);
        args.put("card_id", card_id);
        args.put("page", page);
        args.put("limit", limit);
        return Resquest.resquest(module_name, controller_name, Thread.currentThread().getStackTrace()[1].getMethodName(), args);
    }


    /*
     * 新增离群报警
     * @param string name 规则名称
     * @param int is_use 是否启用 1启用 0停用
     * @param float radius 范围半径
     * @param string comment 备注
     * @param Long start_time 开始时间
     * @param Long end_time 结束时间
     * @param ArrayList day_json 循环检测设置星期json 例如星期一到星期天的数据格式：[0,1,2,3,4,5,6]
     * @param ArrayList time_json 时间段json 例如1点到2点：[{3600,7200}]
     * @param ArrayList card_ids 规则关系卡号数组
     * @return Map
     */
    public static Map addStray(String name, Object is_use, Object radius, Object comment, Object start_time, Object end_time, Object day_json, Object time_json, Object card_ids) throws IllegalArgumentException {
        if (is_use != null && !(is_use instanceof Integer))
            throw new IllegalArgumentException("Parameter error:is_use instanceof Integer");
        if (radius != null && !(radius instanceof Float))
            throw new IllegalArgumentException("Parameter error:radius instanceof Float");
        if (comment != null && !(comment instanceof String))
            throw new IllegalArgumentException("Parameter error:comment instanceof String");
        if (start_time != null && !(start_time instanceof Long))
            throw new IllegalArgumentException("Parameter error:start_time instanceof Long");
        if (end_time != null && !(end_time instanceof Long))
            throw new IllegalArgumentException("Parameter error:end_time instanceof Long");
        if (day_json != null && !(day_json instanceof ArrayList))
            throw new IllegalArgumentException("Parameter error:day_json instanceof ArrayList");
        if (time_json != null && !(time_json instanceof ArrayList))
            throw new IllegalArgumentException("Parameter error:time_json instanceof ArrayList");
        if (card_ids != null && !(card_ids instanceof ArrayList))
            throw new IllegalArgumentException("Parameter error:card_ids instanceof ArrayList");
        Map args = new HashMap();
        args.put("name", name);
        args.put("is_use", is_use);
        args.put("radius", radius);
        args.put("comment", comment);
        args.put("start_time", start_time);
        args.put("end_time", end_time);
        args.put("day_json", day_json);
        args.put("time_json", time_json);
        args.put("card_ids", card_ids);
        return Resquest.resquest(module_name, controller_name, Thread.currentThread().getStackTrace()[1].getMethodName(), args);
    }

    /*
     * 新增陪同报警
     * @param string name 规则名称
     * @param int is_use 是否启用 1启用 0停用
     * @param float radius 范围半径
     * @param string comment 备注
     * @param Long start_time 开始时间
     * @param Long end_time 结束时间
     * @param ArrayList day_json 循环检测设置星期json 例如星期一到星期天的数据格式：[0,1,2,3,4,5,6]
     * @param ArrayList time_json 时间段json 例如1点到2点：[{3600,7200}]
     * @param ArrayList card_ids 规则关系卡号数组
     * @param ArrayList passive_card_ids 被陪同卡号数组
     * @return Map
     */
    public static Map addEscort(String name, Object is_use, Object radius, Object comment, Object start_time, Object end_time, Object day_json, Object time_json, Object card_ids, Object passive_card_ids) {
        if (is_use != null && !(is_use instanceof Integer))
            throw new IllegalArgumentException("Parameter error:is_use instanceof Integer");
        if (radius != null && !(radius instanceof Float))
            throw new IllegalArgumentException("Parameter error:radius instanceof Float");
        if (comment != null && !(comment instanceof String))
            throw new IllegalArgumentException("Parameter error:comment instanceof String");
        if (start_time != null && !(start_time instanceof Long))
            throw new IllegalArgumentException("Parameter error:start_time instanceof Long");
        if (end_time != null && !(end_time instanceof Long))
            throw new IllegalArgumentException("Parameter error:end_time instanceof Long");
        if (day_json != null && !(day_json instanceof ArrayList))
            throw new IllegalArgumentException("Parameter error:day_json instanceof ArrayList");
        if (time_json != null && !(time_json instanceof ArrayList))
            throw new IllegalArgumentException("Parameter error:time_json instanceof ArrayList");
        if (card_ids != null && !(card_ids instanceof ArrayList))
            throw new IllegalArgumentException("Parameter error:card_ids instanceof ArrayList");
        if (passive_card_ids != null && !(passive_card_ids instanceof ArrayList))
            throw new IllegalArgumentException("Parameter error:passive_card_ids instanceof ArrayList");
        Map args = new HashMap();
        args.put("name", name);
        args.put("is_use", is_use);
        args.put("radius", radius);
        args.put("comment", comment);
        args.put("start_time", start_time);
        args.put("end_time", end_time);
        args.put("day_json", day_json);
        args.put("time_json", time_json);
        args.put("card_ids", card_ids);
        args.put("passive_card_ids", passive_card_ids);
        return Resquest.resquest(module_name, controller_name, Thread.currentThread().getStackTrace()[1].getMethodName(), args);
    }

    /*
     * 修改离群规则
     * @param int id 规则id
     * @param string name 规则名称
     * @param int is_use 是否启用 1启用 0停用
     * @param float radius 范围半径
     * @param string comment 备注
     * @param Long start_time 开始时间
     * @param Long end_time 结束时间
     * @param ArrayList day_json 循环检测设置星期json 例如星期一到星期天的数据格式：[0,1,2,3,4,5,6]
     * @param ArrayList time_json 时间段json 例如1点到2点：[{3600,7200}]
     * @param ArrayList card_ids 规则关系卡号数组
     * @return Map
     */
    public static Map updateStray(int id, Object name, Object is_use, Object radius, Object comment, Object start_time, Object end_time, Object day_json, Object time_json, Object card_ids) {
        if (name != null && !(name instanceof String))
            throw new IllegalArgumentException("Parameter error:name instanceof String");
        if (is_use != null && !(is_use instanceof Integer))
            throw new IllegalArgumentException("Parameter error:is_use instanceof Integer");
        if (radius != null && !(radius instanceof Float))
            throw new IllegalArgumentException("Parameter error:radius instanceof Float");
        if (comment != null && !(comment instanceof String))
            throw new IllegalArgumentException("Parameter error:comment instanceof String");
        if (start_time != null && !(start_time instanceof Long))
            throw new IllegalArgumentException("Parameter error:start_time instanceof Long");
        if (end_time != null && !(end_time instanceof Long))
            throw new IllegalArgumentException("Parameter error:end_time instanceof Long");
        if (day_json != null && !(day_json instanceof ArrayList))
            throw new IllegalArgumentException("Parameter error:day_json instanceof ArrayList");
        if (time_json != null && !(time_json instanceof ArrayList))
            throw new IllegalArgumentException("Parameter error:time_json instanceof ArrayList");
        if (card_ids != null && !(card_ids instanceof ArrayList))
            throw new IllegalArgumentException("Parameter error:card_ids instanceof ArrayList");
        Map args = new HashMap();
        args.put("id", id);
        args.put("name", name);
        args.put("is_use", is_use);
        args.put("radius", radius);
        args.put("comment", comment);
        args.put("start_time", start_time);
        args.put("end_time", end_time);
        args.put("day_json", day_json);
        args.put("time_json", time_json);
        args.put("card_ids", card_ids);
        return Resquest.resquest(module_name, controller_name, Thread.currentThread().getStackTrace()[1].getMethodName(), args);
    }

    /*
     * 修改陪同规则
     * @param int id 规则id
     * @param string name 规则名称
     * @param int is_use 是否启用 1启用 0停用
     * @param float radius 范围半径
     * @param string comment 备注
     * @param Long start_time 开始时间
     * @param Long end_time 结束时间
     * @param ArrayList day_json 循环检测设置星期json 例如星期一到星期天的数据格式：[0,1,2,3,4,5,6]
     * @param ArrayList time_json 时间段json 例如1点到2点：[{3600,7200}]
     * @param ArrayList card_ids 规则关系卡号数组
     * @param ArrayList passive_card_ids 被陪同卡号数组
     * @return Map
     */
    public static Map updateEscort(int id, Object name, Object is_use, Object radius, Object comment, Object start_time, Object end_time, Object day_json, Object time_json, Object card_ids, Object passive_card_ids) {
        if (name != null && !(name instanceof String))
            throw new IllegalArgumentException("Parameter error:name instanceof String");
        if (is_use != null && !(is_use instanceof Integer))
            throw new IllegalArgumentException("Parameter error:is_use instanceof Integer");
        if (radius != null && !(radius instanceof Float))
            throw new IllegalArgumentException("Parameter error:radius instanceof Float");
        if (comment != null && !(comment instanceof String))
            throw new IllegalArgumentException("Parameter error:comment instanceof String");
        if (start_time != null && !(start_time instanceof Long))
            throw new IllegalArgumentException("Parameter error:start_time instanceof Long");
        if (end_time != null && !(end_time instanceof Long))
            throw new IllegalArgumentException("Parameter error:end_time instanceof Long");
        if (day_json != null && !(day_json instanceof ArrayList))
            throw new IllegalArgumentException("Parameter error:day_json instanceof ArrayList");
        if (time_json != null && !(time_json instanceof ArrayList))
            throw new IllegalArgumentException("Parameter error:time_json instanceof ArrayList");
        if (card_ids != null && !(card_ids instanceof ArrayList))
            throw new IllegalArgumentException("Parameter error:card_ids instanceof ArrayList");
        if (passive_card_ids != null && !(passive_card_ids instanceof ArrayList))
            throw new IllegalArgumentException("Parameter error:passive_card_ids instanceof ArrayList");
        Map args = new HashMap();
        args.put("id", id);
        args.put("name", name);
        args.put("is_use", is_use);
        args.put("radius", radius);
        args.put("comment", comment);
        args.put("start_time", start_time);
        args.put("end_time", end_time);
        args.put("day_json", day_json);
        args.put("time_json", time_json);
        args.put("card_ids", card_ids);
        args.put("passive_card_ids", passive_card_ids);
        return Resquest.resquest(module_name, controller_name, Thread.currentThread().getStackTrace()[1].getMethodName(), args);
    }

    /*
     * 删除陪同离群规则
     * @param int id 规则id
     * @return Map
     */
    public static Map deleteEscortStray(int id) throws IllegalArgumentException {
        Map args = new HashMap();
        args.put("id", id);
        return Resquest.resquest(module_name, controller_name, Thread.currentThread().getStackTrace()[1].getMethodName(), args);
    }

    /*
     * 获取陪同离群报警规则数量
     * @param string name 规则名称
     * @param int type 类型 11陪同报警 12离群报警
     * @param int scard_id 被陪同的卡号id
     * @return Map
     */
    public static Map getCount(Object name, Object type, Object is_use, Object radius, Object card_id) throws IllegalArgumentException {
        if (name != null && !(name instanceof String))
            throw new IllegalArgumentException("Parameter error:name instanceof String");
        if (type != null && !(type instanceof Integer))
            throw new IllegalArgumentException("Parameter error:type instanceof Integer");
        if (card_id != null && !(card_id instanceof Integer))
            throw new IllegalArgumentException("Parameter error:card_id instanceof Integer");
        if (is_use != null && !(is_use instanceof Integer))
            throw new IllegalArgumentException("Parameter error:is_use instanceof Integer");
        if (radius != null && !(radius instanceof Float))
            throw new IllegalArgumentException("Parameter error:radius instanceof Float");
        Map args = new HashMap();
        args.put("name", name);
        args.put("type", type);
        args.put("card_id", card_id);
        args.put("is_use", is_use);
        args.put("radius", radius);
        return Resquest.resquest(module_name, controller_name, Thread.currentThread().getStackTrace()[1].getMethodName(), args);
    }
}
