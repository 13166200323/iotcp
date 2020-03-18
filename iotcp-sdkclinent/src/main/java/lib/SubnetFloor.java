/**
 * Copyright (c) 2017 Ehigh.Co.Ltd. All rights reserved.
 * Authors:
 * Li Zihao<sales@everhigh.com.cn>
 */
package lib;

import java.util.HashMap;
import java.util.Map;

public class SubnetFloor {
    private static String module_name = "ModularFloor";
    private static String controller_name = "SubnetFloor";

    /**
     *
     * @param page 页码
     * @param limit 每页数据条数
     * @return Map
     */
    public static Map getSubnetFloorRelationship(Object page, Object limit) throws IllegalArgumentException{
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
     * 删除楼层与小区的对应关系
     * @param int subnet_id 小区id
     * @return Map
     */
    public static Map deleteSubnetFloorRelationship(int subnet_id) {
        Map args = new HashMap();
        args.put("subnet_id", subnet_id);
        return Resquest.resquest(module_name, controller_name, Thread.currentThread().getStackTrace()[1].getMethodName(), args);
    }

    /*
     * 更新楼层与小区id的对应关系
     * @param int subnet_id 小区id
     * @param int floor_id 楼层id
     * @return Map
     */
    public static Map updateSubnetFloorRelationship(int subnet_id, int floor_id) {
        Map args = new HashMap();
        args.put("subnet_id", subnet_id);
        args.put("floor_id", floor_id);
        return Resquest.resquest(module_name, controller_name, Thread.currentThread().getStackTrace()[1].getMethodName(), args);
    }
}