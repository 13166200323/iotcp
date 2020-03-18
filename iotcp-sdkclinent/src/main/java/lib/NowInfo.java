/**
 * Copyright (c) 2017 Ehigh.Co.Ltd. All rights reserved.
 * Authors:
 * Li Zihao<sales@everhigh.com.cn>
 */
package lib;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NowInfo {
    private static String module_name = "ModularNowInfo";
    private static String controller_name = "NowInfo";

    /*
     * 撤离临时划定区域
     * @param int floor_id 楼层id
     * @param ArrayList area 划定的区域坐标信息
     * @param int z_start 开始高度
     * @param int z_end 结束高度
     * @return Map
     */
    public static Map evacuateTmpArea(int floor_id, ArrayList<String> area, float z_start, float z_end) {
        Map args = new HashMap();
        args.put("floor_id", floor_id);
        args.put("area", area);
        args.put("z_start", z_start);
        args.put("z_end", z_end);
        return Resquest.resquest(module_name, controller_name, Thread.currentThread().getStackTrace()[1].getMethodName(), args);
    }

    /*
     * 撤离临时划定区域
     * @param ArrayList area_id_str 区域id数组
     * @return Map
     */
    public static Map evacuateArea(ArrayList<Integer> area_id_str) {
        Map args = new HashMap();
        args.put("area_id_str", area_id_str);
        return Resquest.resquest(module_name, controller_name, Thread.currentThread().getStackTrace()[1].getMethodName(), args);
    }

    /*
     * 呼叫卡号
     * @param ArrayList card_list 卡号id数组
     * @return Map
     */
    public static Map callCardList(ArrayList<Integer> card_list) {
        Map args = new HashMap();
        args.put("card_list", card_list);
        return Resquest.resquest(module_name, controller_name, Thread.currentThread().getStackTrace()[1].getMethodName(), args);
    }

    /**
     * 获取所有卡的实时定位信息
     * @param card_id 卡号id
     * @param floor_id 楼层id
     * @return Map
     */
    public static Map getAllCardNowPos(Object card_id, Object floor_id) throws IllegalArgumentException {
        if (floor_id != null && !(floor_id instanceof Integer))
            throw new IllegalArgumentException("Parameter error:floor_id instanceof Integer");
        Map args = new HashMap();
        args.put("card_id", card_id);
        args.put("floor_id", floor_id);
        return Resquest.resquest(module_name, controller_name, Thread.currentThread().getStackTrace()[1].getMethodName(), args);
    }

    /*
     * 查询所有区域中卡的数量
     * @param
     * @return Map
     */
    public static Map getAllAreaCardNum() {
        return Resquest.resquest(module_name, controller_name, Thread.currentThread().getStackTrace()[1].getMethodName(), new HashMap());
    }

    /*
     * 查询所有区域中卡号
     * @param
     * @return Map
     */
    public static Map getAllAreaCardID() {
        return Resquest.resquest(module_name, controller_name, Thread.currentThread().getStackTrace()[1].getMethodName(), new HashMap());
    }

    /*
     * 查询所有区域中卡号
     * @param int area_id 区域id
     * @param int blind 0 系统中出现过的卡 1信号消失的卡 2 当前有信号的卡
     * @param int floor_id 楼层id
     * @param int page 页数
     * @param int limit 每页数据条数
     * @return Map
     */
    public static Map getNowInfo(Object area_id, Object blind, Object floor_id, Object page, Object limit) throws IllegalArgumentException {
        if (area_id != null && !(area_id instanceof Integer))
            throw new IllegalArgumentException("Parameter error:area_id instanceof Integer");
        if (blind != null && !(blind instanceof Integer))
            throw new IllegalArgumentException("Parameter error:blind instanceof Integer");
        if (floor_id != null && !(floor_id instanceof Integer))
            throw new IllegalArgumentException("Parameter error:floor_id instanceof Integer");
        if (page != null && !(page instanceof Integer))
            throw new IllegalArgumentException("Parameter error:page instanceof Integer");
        if (limit != null && !(limit instanceof Integer))
            throw new IllegalArgumentException("Parameter error:limit instanceof Integer");
        Map args = new HashMap();
        args.put("area_id", area_id);
        args.put("blind", blind);
        args.put("floor_id", floor_id);
        args.put("page", page);
        args.put("limit", limit);
        return Resquest.resquest(module_name, controller_name, Thread.currentThread().getStackTrace()[1].getMethodName(), args);
    }

    /*
     * 获取区域中的卡号
     * @param ArrayList area_ids 区域id数组
     * @return Map
     */
    public static Map getCardByArea(Object area_ids,Object online) throws IllegalArgumentException {
        if (area_ids != null && !(area_ids instanceof ArrayList))
            throw new IllegalArgumentException("Parameter error:area_ids instanceof ArrayList");
        if (online != null && !(online instanceof Integer))
            throw new IllegalArgumentException("Parameter error:online instanceof Integer");
        Map args = new HashMap();
        args.put("area_ids", area_ids);
        args.put("online", online);
        return Resquest.resquest(module_name, controller_name, Thread.currentThread().getStackTrace()[1].getMethodName(), args);
    }

    /*
     * 获取卡号所在的区域
     * @param ArrayList card_ids 卡号数组
     * @return Map
     */
    public static Map getAreaByCard(Object card_ids) throws IllegalArgumentException {
        if (card_ids != null && !(card_ids instanceof ArrayList))
            throw new IllegalArgumentException("Parameter error:card_ids instanceof ArrayList");
        Map args = new HashMap();
        args.put("card_ids", card_ids);
        return Resquest.resquest(module_name, controller_name, Thread.currentThread().getStackTrace()[1].getMethodName(), args);
    }
    public static Map getStaticList(Object floor_id) throws IllegalArgumentException {
        if (floor_id != null && !(floor_id instanceof Integer))
            throw new IllegalArgumentException("Parameter error:floor_id instanceof Integer");
        Map args = new HashMap();
        args.put("floor_id", floor_id);
        return Resquest.resquest(module_name, controller_name, Thread.currentThread().getStackTrace()[1].getMethodName(), args);
    }
    public static Map getAreaCard(ArrayList<Map<String,Object>> area_parameters_list) throws IllegalArgumentException {
        Map args = new HashMap();
        args.put("area_parameters_list", area_parameters_list);
        return Resquest.resquest(module_name, controller_name, Thread.currentThread().getStackTrace()[1].getMethodName(), args);
    }
    public static Map creatObstacleAreaPic(int floor_id) throws IllegalArgumentException {
        Map args = new HashMap();
        args.put("floor_id", floor_id);
        return Resquest.resquest(module_name, controller_name, Thread.currentThread().getStackTrace()[1].getMethodName(), args);
    }
    public static Map coordinateConvert(ArrayList<ArrayList<Float>> bs_coor, ArrayList<ArrayList<Float>> bs_gps, ArrayList<ArrayList<Float>> card_coor) throws IllegalArgumentException {
        Map args = new HashMap();
        args.put("bs_coor", bs_coor);
        args.put("bs_gps", bs_gps);
        args.put("card_coor", card_coor);
        return Resquest.resquest(module_name, controller_name, Thread.currentThread().getStackTrace()[1].getMethodName(), args);
    }
    public static Map cardWarning(int type,ArrayList<Integer> card_list) throws IllegalArgumentException {
        Map args = new HashMap();
        args.put("type", type);
        args.put("card_list", card_list);
        return Resquest.resquest(module_name, controller_name, Thread.currentThread().getStackTrace()[1].getMethodName(), args);
    }

    /**
     *
     * @param card_ids 卡号id数组
     * @return Map
     * @throws IllegalArgumentException
     */
    public static Map getCardFunction(Object card_ids) throws IllegalArgumentException {
        if (card_ids != null && !(card_ids instanceof ArrayList))
            throw new IllegalArgumentException("Parameter error:card_ids instanceof ArrayList");
        Map args = new HashMap();
        args.put("card_ids", card_ids);
        return Resquest.resquest(module_name, controller_name, Thread.currentThread().getStackTrace()[1].getMethodName(), args);
    }
}
