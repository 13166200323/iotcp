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
 * GPS 历史信息模块 HistoryGPS.java
 */
public class HistoryGPS {
    private static String module_name = "ModularHistory";
    private static String controller_name = "GPSHistory";

    /**
     *
     * @param start_time 开始时间
     * @param end_time 结束时间
     * @param area_xy 区域坐标:[x最小值，x最大值，y最小值，y最大值]
     * @param card_ids 卡号id 多个卡号以逗号隔开
     * @param area_ids 区域id 多个区域以逗号隔开
     * @return Map
     * @throws IllegalArgumentException
     */
    public static Map getCardHistory(Long start_time, Object end_time, Object area_xy, Object card_ids, Object area_ids) throws IllegalArgumentException {
        if (end_time != null && !(end_time instanceof Long)) {
            throw new IllegalArgumentException("Parameter error:end_time instanceof Long");
        }
        if (card_ids != null && !(card_ids instanceof String)) {
            throw new IllegalArgumentException("Parameter error:card_ids instanceof String");
        }
        if (area_ids != null && !(area_ids instanceof String)) {
            throw new IllegalArgumentException("Parameter error:area_ids instanceof String");
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
    public static Map getCardFloorDataTime(int card_id, Long start_time, Object end_time) throws IllegalArgumentException {
        if (end_time != null && !(end_time instanceof Long)) {
            throw new IllegalArgumentException("Parameter error:end_time instanceof Long");
        }
        Map args = new HashMap();
        args.put("start_time", start_time);
        args.put("end_time", end_time);
        args.put("card_id", card_id);
        return Resquest.resquest(module_name, controller_name, Thread.currentThread().getStackTrace()[1].getMethodName(), args);
    }
}
