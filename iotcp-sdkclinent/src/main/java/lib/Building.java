/**
 * Copyright (c) 2017 Ehigh.Co.Ltd. All rights reserved.
 * Authors:
 * Li Zihao<sales@everhigh.com.cn>
 */
package lib;

import java.util.HashMap;
import java.util.Map;

public class Building {
    private static String module_name = "ModularBuilding";
    private static String controller_name = "Building";

    /**
     *
     * @param scene_id 场景id
     * @param page 页码
     * @param limit 数据条数
     * @return Map
     * @throws IllegalArgumentException
     */
    public static Map getBuilding(Object scene_id,Object page,Object limit) throws IllegalArgumentException {
        if (scene_id != null && !(scene_id instanceof Integer))
            throw new IllegalArgumentException("Parameter error:scene_id instanceof Integer");
        if (page != null && !(page instanceof Integer))
            throw new IllegalArgumentException("Parameter error:page instanceof Integer");
        if (limit != null && !(limit instanceof Integer))
            throw new IllegalArgumentException("Parameter error:limit instanceof Integer");
        Map args = new HashMap();
        args.put("scene_id", scene_id);
        args.put("page", page);
        args.put("limit", limit);
        return Resquest.resquest(module_name, controller_name, Thread.currentThread().getStackTrace()[1].getMethodName(), args);
    }

    /*
     * 新增建筑的信息
     * @param int scene_id 场景id
     * @param string name 建筑名称
     * @param string comment 备注
     * @return Map
     */
    public static Map addBuilding(int scene_id, String name, Object comment) throws IllegalArgumentException {
        if (comment != null && !(comment instanceof String))
            throw new IllegalArgumentException("Parameter error:comment instanceof String");
        Map args = new HashMap();
        args.put("scene_id", scene_id);
        args.put("name", name);
        args.put("comment", comment);
        return Resquest.resquest(module_name, controller_name, Thread.currentThread().getStackTrace()[1].getMethodName(), args);
    }

    /*
     * 删除建筑的信息
     * @param int building_id 建筑id
     * @return Map
     */
    public static Map deleteBuilding(int building_id) {
        Map args = new HashMap();
        args.put("building_id", building_id);
        return Resquest.resquest(module_name, controller_name, Thread.currentThread().getStackTrace()[1].getMethodName(), args);
    }

    /*
     * 修改建筑的信息
     * @param int building_id 建筑id
     * @param int scene_id 场景id
     * @param string name 建筑名称
     * @param string comment 备注
     * @return Map
     */
    public static Map updateBuilding(int building_id, Object scene_id, Object name, Object comment) throws IllegalArgumentException {
        if (scene_id != null && !(scene_id instanceof Integer))
            throw new IllegalArgumentException("Parameter error:scene_id instanceof Integer");
        if (name != null && !(name instanceof String))
            throw new IllegalArgumentException("Parameter error:name instanceof String");
        if (comment != null && !(comment instanceof String))
            throw new IllegalArgumentException("Parameter error:comment instanceof String");
        Map args = new HashMap();
        args.put("building_id", building_id);
        args.put("scene_id", scene_id);
        args.put("name", name);
        args.put("comment", comment);
        return Resquest.resquest(module_name, controller_name, Thread.currentThread().getStackTrace()[1].getMethodName(), args);
    }

    /*
     * 查询建筑的总数
     * @param int scene_id 所属场景id
     * @return Map
     */
    public static Map getCount(Object scene_id) throws IllegalArgumentException {
        if (scene_id != null && !(scene_id instanceof Integer))
            throw new IllegalArgumentException("Parameter error:scene_id instanceof Integer");
        Map args = new HashMap();
        args.put("scene_id", scene_id);
        return Resquest.resquest(module_name, controller_name, Thread.currentThread().getStackTrace()[1].getMethodName(), args);
    }

    /*
     * 检测建筑名称是否已经存在
     * @param string building_name 建筑名称
     * @param int scene_id 所属场景id
     * @return Map
     */
    public static Map buildingNameAvailable(String building_name, int scene_id) {
        Map args = new HashMap();
        args.put("name", building_name);
        args.put("scene_id", scene_id);
        return Resquest.resquest(module_name, controller_name, Thread.currentThread().getStackTrace()[1].getMethodName(), args);
    }
}
