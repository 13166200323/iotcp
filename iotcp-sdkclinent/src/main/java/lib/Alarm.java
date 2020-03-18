/**
 * Copyright (c) 2017 Ehigh.Co.Ltd. All rights reserved.
 * Authors:
 * Li Zihao<sales@everhigh.com.cn>
 */
package lib;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 *
 */
public class Alarm {
    private static String module_name = "ModularAlarm";
    private static String controller_name = "Alarm";

    /*
     * 返回一个月内统计的未处理的报警 求救 欠压总次数
     * @param
     * @return Map
     */
    public static Map getAllCount() {
        return Resquest.resquest(module_name, controller_name, Thread.currentThread().getStackTrace()[1].getMethodName(), new HashMap());
    }


    /**
     *
     * @param type 报警类型 	1欠压2越界3多卡4强拆8黑名单9区域消失10区域聚众11区域不动12区域超时
     * @param status 报警状态
     * @param start 开始时间
     * @param end 结束时间
     * @param page 页数
     * @param limit 每页数据条数
     * @param card_id 卡号
     * @return Map
     */
    public static Map getAlarm(Object type,Object status,Object start,Object end,Object page,Object limit,Object card_id,Object area_id,Object dynamic_area_id,Object id) throws IllegalArgumentException{
        if (type != null){
            if (!(type instanceof ArrayList) && !(type instanceof Integer)){
                throw new IllegalArgumentException("Parameter error:type instanceof ArrayList/Integer");
            }
        }
        if (status != null && !(status instanceof Integer)) {
            throw new IllegalArgumentException("Parameter error:status instanceof Integer");
        }
        if (start != null && !(start instanceof Long)) {
            throw new IllegalArgumentException("Parameter error:start instanceof Long");
        }
        if (end != null && !(end instanceof Long)) {
            throw new IllegalArgumentException("Parameter error:end instanceof Long");
        }
        if (page != null && !(page instanceof Integer)) {
            throw new IllegalArgumentException("Parameter error:page instanceof Integer");
        }
        if (limit != null && !(limit instanceof Integer)) {
            throw new IllegalArgumentException("Parameter error:limit instanceof Integer");
        }
        if (card_id != null && !(card_id instanceof Integer)) {
            throw new IllegalArgumentException("Parameter error:card_id instanceof Integer");
        }
        if (area_id != null && !(area_id instanceof Integer)) {
            throw new IllegalArgumentException("Parameter error:area_id instanceof Integer");
        }
        if (dynamic_area_id != null && !(dynamic_area_id instanceof Integer)) {
            throw new IllegalArgumentException("Parameter error:dynamic_area_id instanceof Integer");
        }
        if (id != null && !(id instanceof Integer)) {
            throw new IllegalArgumentException("Parameter error:id instanceof Integer");
        }
        Map args = new HashMap();
        args.put("id", id);
        args.put("type", type);
        args.put("status", status);
        args.put("start", start);
        args.put("end", end);
        args.put("page", page);
        args.put("limit", limit);
        args.put("card_id", card_id);
        args.put("area_id", area_id);
        args.put("dynamic_area_id", dynamic_area_id);
        return Resquest.resquest(module_name, controller_name, Thread.currentThread().getStackTrace()[1].getMethodName(), args);
    }


    /*
     * 返回统计的报警次数
     * @param int card_id 卡号
     * @return Map
     */
    public static Map getCount(Object type,Object status,Object start,Object end,Object card_id,Object area_id,Object dynamic_area_id,Object id) throws IllegalArgumentException{
        if (type != null){
            if (!(type instanceof ArrayList) && !(type instanceof Integer)){
                throw new IllegalArgumentException("Parameter error:type instanceof ArrayList/Integer");
            }
        }
        if (id != null && !(id instanceof Integer)) {
            throw new IllegalArgumentException("Parameter error:id instanceof Integer");
        }
        if (status != null && !(status instanceof Integer)) {
            throw new IllegalArgumentException("Parameter error:status instanceof Integer");
        }
        if (start != null && !(start instanceof Long)) {
            throw new IllegalArgumentException("Parameter error:start instanceof Long");
        }
        if (end != null && !(end instanceof Long)) {
            throw new IllegalArgumentException("Parameter error:end instanceof Long");
        }
        if (card_id != null && !(card_id instanceof Integer)) {
            throw new IllegalArgumentException("Parameter error:card_id instanceof Integer");
        }
        if (area_id != null && !(area_id instanceof Integer)) {
            throw new IllegalArgumentException("Parameter error:area_id instanceof Integer");
        }
        if (dynamic_area_id != null && !(dynamic_area_id instanceof Integer)) {
            throw new IllegalArgumentException("Parameter error:dynamic_area_id instanceof Integer");
        }
        Map args = new HashMap();
        args.put("id", id);
        args.put("type", type);
        args.put("status", status);
        args.put("start", start);
        args.put("end", end);
        args.put("card_id", card_id);
        args.put("area_id", area_id);
        args.put("dynamic_area_id", dynamic_area_id);
        return Resquest.resquest(module_name, controller_name, Thread.currentThread().getStackTrace()[1].getMethodName(), args);
    }

    /*
     * 删除报警信息
     * @param int identification 数据id
     * @return Map
     */
    public static Map deleteAlarm(int identification) {
        Map args = new HashMap();
        args.put("id", identification);
        return Resquest.resquest(module_name, controller_name, Thread.currentThread().getStackTrace()[1].getMethodName(), args);
    }

    /*
     * 批量删除报警信息
     * @param ArrayList identification 数据id
     * @return Map
     */
    public static Map deleteAlarm(ArrayList<Integer> ids) {
        Map args = new HashMap();
        args.put("id", ids);
        return Resquest.resquest(module_name, controller_name, Thread.currentThread().getStackTrace()[1].getMethodName(), args);
    }

    /*
     * 修改报警信息
     * @param int identification 数据id
     * @param int status 状态:1已处理 0未处理
     * @param string comment 备注
     * @return Map
     */
    public static Map updateAlarm(int identification, Object status, Object comment) throws IllegalArgumentException {

        if (status != null && !(status instanceof Integer)) {
            throw new IllegalArgumentException("Parameter error:status instanceof Integer");
        }

        if (comment != null && !(comment instanceof String)) {
            throw new IllegalArgumentException("Parameter error:comment instanceof String");
        }

        Map args = new HashMap();
        args.put("id", identification);
        args.put("status", status);
        args.put("comment", comment);
        return Resquest.resquest(module_name, controller_name, Thread.currentThread().getStackTrace()[1].getMethodName(), args);
    }

    /*
     * 批量修改报警信息
     * @param ArrayList identification 数据id
     * @param int status 状态:1已处理 0未处理
     * @param string comment 备注
     * @return Map
     */
    public static Map updateAlarm(ArrayList<Integer> identification, Object status, Object comment) throws IllegalArgumentException {

        if (status != null && !(status instanceof Integer)) {
            throw new IllegalArgumentException("Parameter error:status instanceof Integer");
        }

        if (comment != null && !(comment instanceof String)) {
            throw new IllegalArgumentException("Parameter error:comment instanceof String");
        }

        Map args = new HashMap();
        args.put("id", identification);
        args.put("status", status);
        args.put("comment", comment);
        return Resquest.resquest(module_name, controller_name, Thread.currentThread().getStackTrace()[1].getMethodName(), args);
    }


    /**
     *
     * @param type 类型:5呼叫 6求救 7撤离
     * @param status 状态:1已处理 0未处理
     * @param start 开始时间
     * @param end 结束时间
     * @param page 页码
     * @param limit 每页数据条数
     * @param card_id 卡号
     * @return Map
     * @throws IllegalArgumentException
     */
    public static Map getHelp(Object type, Object status, Object start, Object end, Object page, Object limit, Object card_id) throws IllegalArgumentException {
        if (type != null && !(type instanceof Integer)) {
            throw new IllegalArgumentException("Parameter error:type instanceof Integer");
        }
        if (status != null && !(status instanceof Integer)) {
            throw new IllegalArgumentException("Parameter error:status instanceof Integer");
        }
        if (start != null && !(start instanceof Long)) {
            throw new IllegalArgumentException("Parameter error:start instanceof Long");
        }
        if (end != null && !(end instanceof Long)) {
            throw new IllegalArgumentException("Parameter error:end instanceof Long");
        }
        if (start != null && end != null && (Long) end - (Long) start < 0) {
            throw new IllegalArgumentException("Parameter error:The end time must not be less than the start time");
        }
        if (page != null && !(page instanceof Integer)) {
            throw new IllegalArgumentException("Parameter error:page instanceof Integer");
        }
        if (limit != null && !(limit instanceof Integer)) {
            throw new IllegalArgumentException("Parameter error:limit instanceof Integer");
        }
        if (card_id != null && !(card_id instanceof Integer)) {
            throw new IllegalArgumentException("Parameter error:card_id instanceof Integer");
        }
        Map args = new HashMap();
        args.put("type", type);
        args.put("status", status);
        args.put("start", start);
        args.put("end", end);
        args.put("page", page);
        args.put("limit", limit);
        args.put("card_id", card_id);
        return Resquest.resquest(module_name, controller_name, Thread.currentThread().getStackTrace()[1].getMethodName(), args);
    }

    /*
     * 返回求救次数
     * @param int $type 类型:5呼叫 6求救 7撤离
     * @param int status 状态:1已处理 0未处理
     * @param Long start 开始时间
     * @param Long end  结束时间
     * @param int card_id 卡号
     * @return Map
     */
    public static Map getHelpCount(Object type, Object status, Object start, Object end, Object card_id) throws IllegalArgumentException {
        if (type != null && !(type instanceof Integer)) {
            throw new IllegalArgumentException("Parameter error:type instanceof Integer");
        }
        if (status != null && !(status instanceof Integer)) {
            throw new IllegalArgumentException("Parameter error:status instanceof Integer");
        }
        if (start != null && !(start instanceof Long)) {
            throw new IllegalArgumentException("Parameter error:start instanceof Long");
        }
        if (end != null && !(end instanceof Long)) {
            throw new IllegalArgumentException("Parameter error:end instanceof Long");
        }
        if (start != null && end != null && (Long) end - (Long) start < 0) {
            throw new IllegalArgumentException("Parameter error:The end time must not be less than the start time");
        }
        if (card_id != null && !(card_id instanceof Integer)) {
            throw new IllegalArgumentException("Parameter error:card_id instanceof Integer");
        }
        Map args = new HashMap();
        args.put("type", type);
        args.put("status", status);
        args.put("start", start);
        args.put("end", end);
        args.put("card_id", card_id);
        return Resquest.resquest(module_name, controller_name, Thread.currentThread().getStackTrace()[1].getMethodName(), args);
    }

    /*
     * 删除求救信息
     * @param int identification 数据id
     * @return Map
     */
    public static Map deleteHelp(int identification) {
        Map args = new HashMap();
        args.put("id", identification);
        return Resquest.resquest(module_name, controller_name, Thread.currentThread().getStackTrace()[1].getMethodName(), args);
    }

    /*
     * 批量删除求救信息
     * @param ArrayList identification 数据id
     * @return Map
     */
    public static Map deleteHelp(ArrayList<Integer> identification) {
        Map args = new HashMap();
        args.put("id", identification);
        return Resquest.resquest(module_name, controller_name, Thread.currentThread().getStackTrace()[1].getMethodName(), args);
    }

    /*
     * 修改求救信息
     * @param int identification 数据id
     * @param int status 状态:1已处理 0未处理
     * @param string comment 备注
     * @return Map
     */
    public static Map updateHelp(int identification, Object status, Object comment) throws IllegalArgumentException {
        if (status != null && !(status instanceof Integer)) {
            throw new IllegalArgumentException("Parameter error:status instanceof Integer");
        }

        if (comment != null && !(comment instanceof String)) {
            throw new IllegalArgumentException("Parameter error:comment instanceof String");
        }
        Map args = new HashMap();
        args.put("id", identification);
        args.put("status", status);
        args.put("comment", comment);
        return Resquest.resquest(module_name, controller_name, Thread.currentThread().getStackTrace()[1].getMethodName(), args);
    }

    /*
     * 批量修改求救信息
     * @param ArrayList identification 数据id
     * @param int status 状态:1已处理 0未处理
     * @param string comment 备注
     * @return Map
     */
    public static Map updateHelp(ArrayList<Integer> identification, Object status, Object comment) throws IllegalArgumentException {
        if (status != null && !(status instanceof Integer)) {
            throw new IllegalArgumentException("Parameter error:status instanceof Integer");
        }

        if (comment != null && !(comment instanceof String)) {
            throw new IllegalArgumentException("Parameter error:comment instanceof String");
        }
        Map args = new HashMap();
        args.put("id", identification);
        args.put("status", status);
        args.put("comment", comment);
        return Resquest.resquest(module_name, controller_name, Thread.currentThread().getStackTrace()[1].getMethodName(), args);
    }

    /**
     * 返回欠压信息
     * @param page 页码
     * @param limit 每页数据条数
     * @param start 查询开始时间
     * @param end 查询结束时间
     * @return Map
     */
    public static Map getPower(Object page, Object limit, Object start, Object end) throws IllegalArgumentException{
        if (page != null && !(page instanceof Integer)) {
            throw new IllegalArgumentException("Parameter error:page instanceof Integer");
        }
        if (limit != null && !(limit instanceof Integer)) {
            throw new IllegalArgumentException("Parameter error:limit instanceof Integer");
        }
        if (start != null && !(start instanceof Long)) {
            throw new IllegalArgumentException("Parameter error:start instanceof Long");
        }
        if (end != null && !(end instanceof Long)) {
            throw new IllegalArgumentException("Parameter error:end instanceof Long");
        }
        Map args = new HashMap();
        args.put("page", page);
        args.put("limit", limit);
        args.put("start", start);
        args.put("end", end);
        return Resquest.resquest(module_name, controller_name, Thread.currentThread().getStackTrace()[1].getMethodName(), args);
    }

    /*
     * 返回统计的欠压次数
     * @param
     * @return Map
     */
    public static Map getPowerCount(Object start, Object end) throws IllegalArgumentException{
        if (start != null && !(start instanceof Long)) {
            throw new IllegalArgumentException("Parameter error:start instanceof Long");
        }
        if (end != null && !(end instanceof Long)) {
            throw new IllegalArgumentException("Parameter error:end instanceof Long");
        }
        Map args = new HashMap();
        args.put("start", start);
        args.put("end", end);
        return Resquest.resquest(module_name, controller_name, Thread.currentThread().getStackTrace()[1].getMethodName(), args);
    }

    /*
     * 修改欠压信息
     * @param int identification 数据id
     * @param int status 状态:1已处理 0未处理
     * @param string comment 备注
     * @return Map
     */
    public static Map updatePower(int identification, Object status, Object comment) throws IllegalArgumentException {
        if (status != null && !(status instanceof Integer)) {
            throw new IllegalArgumentException("Parameter error:status instanceof Integer");
        }

        if (comment != null && !(comment instanceof String)) {
            throw new IllegalArgumentException("Parameter error:comment instanceof String");
        }
        Map args = new HashMap();
        args.put("id", identification);
        args.put("status", status);
        args.put("comment", comment);
        return Resquest.resquest(module_name, controller_name, Thread.currentThread().getStackTrace()[1].getMethodName(), args);
    }

    /*
     * 批量修改欠压信息
     * @param ArrayList identification 数据id
     * @param int status   状态:1已处理 0未处理
     * @param string comment 备注
     * @return Map
     */
    public static Map updatePowerBatch(ArrayList<Integer> identification, Object status, Object comment) throws IllegalArgumentException {
        if (status != null && !(status instanceof Integer)) {
            throw new IllegalArgumentException("Parameter error:status instanceof Integer");
        }

        if (comment != null && !(comment instanceof String)) {
            throw new IllegalArgumentException("Parameter error:comment instanceof String");
        }
        Map args = new HashMap();
        args.put("id", identification);
        args.put("status", status);
        args.put("comment", comment);
        return Resquest.resquest(module_name, controller_name, Thread.currentThread().getStackTrace()[1].getMethodName(), args);
    }
}
