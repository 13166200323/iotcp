/**
 * Copyright (c) 2017 Ehigh.Co.Ltd. All rights reserved.
 * Authors:
 * Li Zihao<sales@everhigh.com.cn>
 */
package lib;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class NowInfoGPS {
    private static String module_name = "ModularNowInfo";
    private static String controller_name = "NowInfoGPS";

    /*
     * 撤离临时划定区域
     * @param ArrayList area 划定的区域坐标信息
     * @return Map
     */
    public static Map evacuateTmpAreaGPS(ArrayList<String> area) {
        Map args = new HashMap();
        args.put("area", area);
        return Resquest.resquest(module_name, controller_name, Thread.currentThread().getStackTrace()[1].getMethodName(), args);
    }

    /*
     * 撤离临时划定区域
     * @param ArrayList area_id_str 区域id数组
     * @return Map
     */
    public static Map evacuateAreaGPS(ArrayList<Integer> area_id_str) {
        Map args = new HashMap();
        args.put("area_id_str", area_id_str);
        return Resquest.resquest(module_name, controller_name, Thread.currentThread().getStackTrace()[1].getMethodName(), args);
    }

    /**
     * 获取所有卡的实时定位信息
     * @param card_id 卡号id
     * @return Map
     */
    public static Map getAllCardNowPosGPS(Object card_id) {
        Map args = new HashMap();
        args.put("card_id", card_id);
        return Resquest.resquest(module_name, controller_name, Thread.currentThread().getStackTrace()[1].getMethodName(), args);
    }

    /*
     * 查询所有区域中卡号
     * @param int area_id 区域id
     * @param int page 页数
     * @param int limit 每页数据条数
     * @return Map
     */
    public static Map getNowInfoGPS(Object area_id, Object page, Object limit) throws IllegalArgumentException {
        if (area_id != null && !(area_id instanceof Integer))
            throw new IllegalArgumentException("Parameter error:area_id instanceof Integer");
        if (page != null && !(page instanceof Integer))
            throw new IllegalArgumentException("Parameter error:page instanceof Integer");
        if (limit != null && !(limit instanceof Integer))
            throw new IllegalArgumentException("Parameter error:limit instanceof Integer");
        Map args = new HashMap();
        args.put("area_id", area_id);
        args.put("page", page);
        args.put("limit", limit);
        return Resquest.resquest(module_name, controller_name, Thread.currentThread().getStackTrace()[1].getMethodName(), args);
    }

    /*
     * 获取区域中的卡号
     * @param ArrayList area_ids 区域id数组
     * @return Map
     */
    public static Map getCardByAreaGPS(Object area_ids,Object online) throws IllegalArgumentException {
        if (area_ids != null && !(area_ids instanceof ArrayList))
            throw new IllegalArgumentException("Parameter error:area_ids instanceof ArrayList");
        if (online != null && !(online instanceof Integer))
            throw new IllegalArgumentException("Parameter error:online instanceof Integer");
        Map args = new HashMap();
        args.put("area_ids", area_ids);
        args.put("online", online);
        return Resquest.resquest(module_name, controller_name, Thread.currentThread().getStackTrace()[1].getMethodName(), args);
    }

    public static Map getAreaCardGPS(ArrayList<Map<String,Object>> area_parameters_list) throws IllegalArgumentException {
        Map args = new HashMap();
        args.put("area_parameters_list", area_parameters_list);
        return Resquest.resquest(module_name, controller_name, Thread.currentThread().getStackTrace()[1].getMethodName(), args);
    }
}
