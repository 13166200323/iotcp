/**
 * Copyright (c) 2017 Ehigh.Co.Ltd. All rights reserved.
 * Authors:
 * Li Zihao<sales@everhigh.com.cn>
 */
package lib;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class HeartRate {
    private static String module_name = "ModularCard";
    private static String controller_name = "HeartRate";

    /**
     *
     * @param card_ids 卡号数组
     * @param page 页数
     * @param limit 每页数据条数
     * @return Map
     * @throws IllegalArgumentException
     */
    public static Map getHeartRate(Object card_ids, Object page, Object limit) throws IllegalArgumentException {
        if (card_ids != null && !(card_ids instanceof ArrayList))
            throw new IllegalArgumentException("Parameter error:card_ids instanceof ArrayList");
        if (page != null && !(page instanceof Integer))
            throw new IllegalArgumentException("Parameter error:page instanceof Integer");
        if (limit != null && !(limit instanceof Integer))
            throw new IllegalArgumentException("Parameter error:limit instanceof Integer");
        Map args = new HashMap();
        args.put("card_ids", card_ids);
        args.put("page", page);
        args.put("limit", limit);
        return Resquest.resquest(module_name, controller_name, Thread.currentThread().getStackTrace()[1].getMethodName(), args);
    }

    /**
     *
     * @param card_ids 卡号数组
     * @return Map
     * @throws IllegalArgumentException
     */
    public static Map getCount(Object card_ids) throws IllegalArgumentException {
        if (card_ids != null && !(card_ids instanceof ArrayList))
            throw new IllegalArgumentException("Parameter error:card_ids instanceof ArrayList");
        Map args = new HashMap();
        args.put("card_ids", card_ids);
        return Resquest.resquest(module_name, controller_name, Thread.currentThread().getStackTrace()[1].getMethodName(), args);
    }

    /**
     *
     * @param card_ids 卡号数组
     * @param maximum_heart_rate 心率上限
     * @param lower_heart_rate 心率下限
     * @return Map
     * @throws IllegalArgumentException
     */
    public static Map updateHeartRate(Object card_ids, float maximum_heart_rate, float lower_heart_rate) throws IllegalArgumentException {
        if (card_ids != null && !(card_ids instanceof ArrayList))
            throw new IllegalArgumentException("Parameter error:card_ids instanceof ArrayList");
        Map args = new HashMap();
        args.put("card_ids", card_ids);
        args.put("maximum_heart_rate", maximum_heart_rate);
        args.put("lower_heart_rate", lower_heart_rate);
        return Resquest.resquest(module_name, controller_name, Thread.currentThread().getStackTrace()[1].getMethodName(), args);
    }

    /**
     *
     * @param card_ids 卡号数组
     * @param start_time 查询开始时间
     * @param end_time 查询结束时间
     * @return Map
     * @throws IllegalArgumentException
     */
    public static Map getHistory(ArrayList card_ids, long start_time, long end_time) throws IllegalArgumentException {
        Map args = new HashMap();
        args.put("card_ids", card_ids);
        args.put("start_time", start_time);
        args.put("end_time", end_time);
        return Resquest.resquest(module_name, controller_name, Thread.currentThread().getStackTrace()[1].getMethodName(), args);
    }

    /**
     *
     * @param card_ids 卡号数组
     * @param date 查询日期
     * @return Map
     * @throws IllegalArgumentException
     */
    public static Map getDistanceStep(Object card_ids, Object date) throws IllegalArgumentException {
        if (card_ids != null && !(card_ids instanceof ArrayList))
            throw new IllegalArgumentException("Parameter error:card_ids instanceof ArrayList");
        if (date != null && !(date instanceof String))
            throw new IllegalArgumentException("Parameter error:date instanceof String");
        Map args = new HashMap();
        args.put("card_ids", card_ids);
        args.put("date", date);
        return Resquest.resquest(module_name, controller_name, Thread.currentThread().getStackTrace()[1].getMethodName(), args);
    }
}
