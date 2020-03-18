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
 * 历史信息模块 History.java
 */
public class History {
    private static String module_name = "ModularHistory";
    private static String controller_name = "History";

    public static Map getHistoryList(Object flag) throws IllegalArgumentException {
        if (flag != null && !(flag instanceof Integer)) {
            throw new IllegalArgumentException("Parameter error:flag instanceof Integer");
        }
        Map args = new HashMap();
        args.put("flag", flag);
        return Resquest.resquest(module_name, controller_name, Thread.currentThread().getStackTrace()[1].getMethodName(), args);
    }
    /**
     *
     * @param start_time 开始时间
     * @param end_time 结束时间
     * @param area_xy 区域坐标:[x最小值，x最大值，y最小值，y最大值]
     * @param card_ids 卡号id 多个卡号以逗号隔开
     * @param area_ids 区域id 多个区域以逗号隔开
     * @param floor_id 楼层id
     * @return Map
     * @throws IllegalArgumentException
     */
    public static Map getCardHistory(Long start_time, Object end_time, Object area_xy, Object card_ids, Object area_ids, Object floor_id) throws IllegalArgumentException {
        if (end_time != null && !(end_time instanceof Long)) {
            throw new IllegalArgumentException("Parameter error:end_time instanceof Long");
        }
        if (card_ids != null && !(card_ids instanceof String)) {
            throw new IllegalArgumentException("Parameter error:card_ids instanceof String");
        }
        if (area_ids != null && !(area_ids instanceof String)) {
            throw new IllegalArgumentException("Parameter error:area_ids instanceof String");
        }
        if (floor_id != null && !(floor_id instanceof Integer)) {
            throw new IllegalArgumentException("Parameter error:floor_id instanceof Integer");
        }
        if (area_xy != null && !(area_xy instanceof ArrayList)) {
            throw new IllegalArgumentException("Parameter error:area_xy instanceof ArrayList");
        }
        Map args = new HashMap();
        args.put("time", start_time);
        args.put("end_time", end_time);
        args.put("area_xy", area_xy);
        args.put("card_ids", card_ids);
        args.put("area_ids", area_ids);
        args.put("floor_id", floor_id);
        return Resquest.resquest(module_name, controller_name, Thread.currentThread().getStackTrace()[1].getMethodName(), args);
    }

    /**
     *
     * @param start_time 开始时间
     * @param end_time 结束时间
     * @param card_ids 卡号id数组
     * @param floor_id 楼层id
     * @return Map
     * @throws IllegalArgumentException
     */
    public static Map getCardHistoryDataTime(Long start_time, Object end_time, Object card_ids, Object floor_id) throws IllegalArgumentException {
        if (end_time != null && !(end_time instanceof Long)) {
            throw new IllegalArgumentException("Parameter error:end_time instanceof Long");
        }
        if (floor_id != null && !(floor_id instanceof Integer)) {
            throw new IllegalArgumentException("Parameter error:floor_id instanceof Integer");
        }
        if (card_ids != null && !(card_ids instanceof ArrayList)) {
            throw new IllegalArgumentException("Parameter error:card_ids instanceof ArrayList");
        }
        Map args = new HashMap();
        args.put("start_time", start_time);
        args.put("end_time", end_time);
        args.put("card_ids", card_ids);
        args.put("floor_id", floor_id);
        return Resquest.resquest(module_name, controller_name, Thread.currentThread().getStackTrace()[1].getMethodName(), args);
    }

    /**
     *
     * @param start_time 开始时间
     * @param end_time 结束时间
     * @param card_id 卡号id
     * @param type 当前考勤状态 0 超时离开 1 正常离开
     * @param area_id 区域id
     * @param page 页数
     * @param limit 每页数据条数
     * @return Map
     * @throws IllegalArgumentException
     */
    public static Map getAreaCardRecord(Object start_time, Object end_time, Object card_id, Object type, Object area_id, Object page, Object limit) throws IllegalArgumentException {
        if (start_time != null && !(start_time instanceof Long)) {
            throw new IllegalArgumentException("Parameter error:start_time instanceof Long");
        }
        if (end_time != null && !(end_time instanceof Long)) {
            throw new IllegalArgumentException("Parameter error:end_time instanceof Long");
        }
        if (card_id != null && !(card_id instanceof Integer)) {
            throw new IllegalArgumentException("Parameter error:card_id instanceof Integer");
        }
        if (type != null && !(type instanceof Integer)) {
            throw new IllegalArgumentException("Parameter error:type instanceof Integer");
        }
        if (area_id != null && !(area_id instanceof Integer)) {
            throw new IllegalArgumentException("Parameter error:area_id instanceof Integer");
        }
        if (page != null && !(page instanceof Integer)) {
            throw new IllegalArgumentException("Parameter error:page instanceof Integer");
        }
        if (limit != null && !(limit instanceof Integer)) {
            throw new IllegalArgumentException("Parameter error:limit instanceof Integer");
        }
        Map args = new HashMap();
        args.put("start_time", start_time);
        args.put("end_time", end_time);
        args.put("card_id", card_id);
        args.put("type", type);
        args.put("area_id", area_id);
        args.put("page", page);
        args.put("limit", limit);
        return Resquest.resquest(module_name, controller_name, Thread.currentThread().getStackTrace()[1].getMethodName(), args);
    }

    /**
     *
     * @param card_id 卡号id
     * @param start_time 开始时间
     * @param end_time 结束时间
     * @return Map
     * @throws IllegalArgumentException
     */
    public static Map getCardFloorDataTime(Object card_id, Object start_time, Object end_time) throws IllegalArgumentException {
//        if (end_time != null && !(end_time instanceof Long)) {
//            throw new IllegalArgumentException("Parameter error:end_time instanceof Long");
//        }
        Map args = new HashMap();
        args.put("start_time", start_time);
        args.put("end_time", end_time);
        args.put("card_id", card_id);
        return Resquest.resquest(module_name, controller_name, Thread.currentThread().getStackTrace()[1].getMethodName(), args);
    }
    public static Map getHistoryHeatMap(Object start_time, Object end_time, Object card_ids, Object uuids, Object area_grid_size, Object floor_id) throws IllegalArgumentException {
        if (start_time != null && !(start_time instanceof Long)) {
            throw new IllegalArgumentException("Parameter error:start_time instanceof Long");
        }
        if (end_time != null && !(end_time instanceof Long)) {
            throw new IllegalArgumentException("Parameter error:end_time instanceof Long");
        }
        if (card_ids != null && !(card_ids instanceof ArrayList)) {
            throw new IllegalArgumentException("Parameter error:card_ids instanceof ArrayList");
        }
        if (uuids != null && !(uuids instanceof ArrayList)) {
            throw new IllegalArgumentException("Parameter error:uuids instanceof ArrayList");
        }
        if (area_grid_size != null && !(area_grid_size instanceof Float)) {
            throw new IllegalArgumentException("Parameter error:area_grid_size instanceof Float");
        }
        if (floor_id != null && !(floor_id instanceof Integer)) {
            throw new IllegalArgumentException("Parameter error:floor_id instanceof Integer");
        }
        Map args = new HashMap();
        args.put("start_time", start_time);
        args.put("end_time", end_time);
        args.put("card_ids", card_ids);
        args.put("uuids", uuids);
        args.put("area_grid_size", area_grid_size);
        args.put("floor_id", floor_id);

        return Resquest.resquest(module_name, controller_name, Thread.currentThread().getStackTrace()[1].getMethodName(), args);
    }
}
