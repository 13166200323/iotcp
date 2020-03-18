/**
 * Copyright (c) 2017 Ehigh.Co.Ltd. All rights reserved.
 * Authors:
 * Li Zihao<sales@everhigh.com.cn>
 */
package lib;

import java.util.HashMap;
import java.util.Map;

public class Scene {
    private static String module_name = "ModularScene";
    private static String controller_name = "Scene";

    /**
     * 返回所有场景的信息
     * @param page 页码
     * @param limit 每页数据条数
     * @return Map
     */
    public static Map getScene(Object page, Object limit) throws IllegalArgumentException{
        if (page != null && !(page instanceof Integer))
            throw new IllegalArgumentException("Parameter error:page instanceof Integer");
        if (limit != null && !(limit instanceof Integer))
            throw new IllegalArgumentException("Parameter error:limit instanceof Integer");
        Map args = new HashMap();
        args.put("page", page);
        args.put("limit", limit);
        return Resquest.resquest(module_name, controller_name, Thread.currentThread().getStackTrace()[1].getMethodName(), args);
    }

    /*
     * 新增场景的信息
     * @param string name 场景名称
     * @param string comment 备注
     * @return Map
     */
    public static Map addScene(String name, Object comment) throws IllegalArgumentException {
        if (comment != null && !(comment instanceof String))
            throw new IllegalArgumentException("Parameter error:comment instanceof String");
        Map args = new HashMap();
        args.put("name", name);
        args.put("comment", comment);
        return Resquest.resquest(module_name, controller_name, Thread.currentThread().getStackTrace()[1].getMethodName(), args);
    }

    /*
     * 删除场景的信息
     * @param int scene_id 场景id
     * @return Map
     */
    public static Map deleteScene(int scene_id) {
        Map args = new HashMap();
        args.put("scene_id", scene_id);
        return Resquest.resquest(module_name, controller_name, Thread.currentThread().getStackTrace()[1].getMethodName(), args);
    }

    /*
     * 修改场景的信息
     * @param int scene_id 场景id
     * @param int name 场景名称
     * @param int comment 备注
     * @return Map
     */
    public static Map updateScene(int scene_id, Object name, Object comment) throws IllegalArgumentException {
        if (name != null && !(name instanceof String))
            throw new IllegalArgumentException("Parameter error:name instanceof String");
        if (comment != null && !(comment instanceof String))
            throw new IllegalArgumentException("Parameter error:comment instanceof String");
        Map args = new HashMap();
        args.put("scene_id", scene_id);
        args.put("name", name);
        args.put("comment", comment);
        return Resquest.resquest(module_name, controller_name, Thread.currentThread().getStackTrace()[1].getMethodName(), args);
    }

    /*
     * 查询场景的总数
     * @param
     * @return Map
     */
    public static Map getCount() {
        return Resquest.resquest(module_name, controller_name, Thread.currentThread().getStackTrace()[1].getMethodName(), new HashMap());
    }

    /*
     * 检测场景名称是否已经存在
     * @param string scene_name 场景名称
     * @return Map
     */
    public static Map sceneNameAvailable(String scene_name) {
        Map args = new HashMap();
        args.put("name", scene_name);
        return Resquest.resquest(module_name, controller_name, Thread.currentThread().getStackTrace()[1].getMethodName(), args);
    }
}