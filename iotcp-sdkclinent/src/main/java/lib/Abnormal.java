/**
 * Copyright (c) 2017 Ehigh.Co.Ltd. All rights reserved.
 * Authors:
 * Li Zihao<sales@everhigh.com.cn>
 */
package lib;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Abnormal {
    private static String module_name = "ModularCard";
    private static String controller_name = "Abnormal";

    /**
     *
     * @param card_ids 卡号数组
     * @param start_time 开始时间
     * @param end_time 结束时间
     * @param status 是否处理 0未处理 1已处理
     * @param type 异常类型 1过快 2过慢
     * @param page 页码
     * @param limit 每页显示条数
     * @return Map
     * @throws IllegalArgumentException
     */
    public static Map getAbnormal(Object card_ids, Object start_time, Object end_time, Object status, Object type,Object page, Object limit) throws IllegalArgumentException {
        if (card_ids != null && !(card_ids instanceof ArrayList))
            throw new IllegalArgumentException("Parameter error:card_ids instanceof ArrayList");
        if (start_time != null && !(start_time instanceof Long))
            throw new IllegalArgumentException("Parameter error:start_time instanceof Long");
        if (end_time != null && !(end_time instanceof Long))
            throw new IllegalArgumentException("Parameter error:end_time instanceof Long");
        if (status != null && !(status instanceof Integer))
            throw new IllegalArgumentException("Parameter error:status instanceof Integer");
        if (page != null && !(page instanceof Integer))
            throw new IllegalArgumentException("Parameter error:page instanceof Integer");
        if (limit != null && !(limit instanceof Integer))
            throw new IllegalArgumentException("Parameter error:limit instanceof Integer");
        if (type != null && !(type instanceof Integer))
            throw new IllegalArgumentException("Parameter error:type instanceof Integer");
        Map args = new HashMap();
        args.put("card_ids", card_ids);
        args.put("start_time", start_time);
        args.put("end_time", end_time);
        args.put("status", status);
        args.put("type", type);
        args.put("page", page);
        args.put("limit", limit);
        return Resquest.resquest(module_name, controller_name, Thread.currentThread().getStackTrace()[1].getMethodName(), args);
    }

    /**
     *
     * @param card_ids 卡号数组
     * @param start_time 开始时间
     * @param end_time 结束时间
     * @param status 是否处理 0未处理 1已处理
     * @param type 异常类型 1过快 2过慢
     * @return Map
     * @throws IllegalArgumentException
     */
    public static Map getCount(Object card_ids, Object start_time, Object end_time, Object status, Object type) throws IllegalArgumentException {
        if (card_ids != null && !(card_ids instanceof ArrayList))
            throw new IllegalArgumentException("Parameter error:card_ids instanceof ArrayList");
        if (start_time != null && !(start_time instanceof Long))
            throw new IllegalArgumentException("Parameter error:start_time instanceof Long");
        if (end_time != null && !(end_time instanceof Long))
            throw new IllegalArgumentException("Parameter error:end_time instanceof Long");
        if (status != null && !(status instanceof Integer))
            throw new IllegalArgumentException("Parameter error:status instanceof Integer");
        if (type != null && !(type instanceof Integer))
            throw new IllegalArgumentException("Parameter error:type instanceof Integer");
        Map args = new HashMap();
        args.put("card_ids", card_ids);
        args.put("start_time", start_time);
        args.put("end_time", end_time);
        args.put("status", status);
        args.put("type", type);
        return Resquest.resquest(module_name, controller_name, Thread.currentThread().getStackTrace()[1].getMethodName(), args);
    }

    /**
     *
     * @param id 信息id数组
     * @param status 是否处理 0未处理 1已处理
     * @return Map
     * @throws IllegalArgumentException
     */
    public static Map updateAbnormal(Object id, int status) throws IllegalArgumentException {
        if (id != null && !(id instanceof ArrayList))
            throw new IllegalArgumentException("Parameter error:id instanceof ArrayList");
        Map args = new HashMap();
        args.put("id", id);
        args.put("status", status);
        return Resquest.resquest(module_name, controller_name, Thread.currentThread().getStackTrace()[1].getMethodName(), args);
    }

    /**
     *
     * @param id 删除信息的主键数组
     * @return Map
     * @throws IllegalArgumentException
     */
    public static Map deleteAbnormal(ArrayList id) throws IllegalArgumentException {
        Map args = new HashMap();
        args.put("id", id);
        return Resquest.resquest(module_name, controller_name, Thread.currentThread().getStackTrace()[1].getMethodName(), args);
    }
}
