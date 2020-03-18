/**
 * Copyright (c) 2017 Ehigh.Co.Ltd. All rights reserved.
 * Authors:
 * Li Zihao<sales@everhigh.com.cn>
 */
package lib;

import java.util.HashMap;
import java.util.Map;

/**
 * 基站模块 BaseStation.java
 */
public class BaseStation {
    private static String module_name = "ModularBaseStation";
    private static String controller_name = "BaseStation";

    /*
     * 返回所有基站的信息
     * @param int floor_id 楼层id
     * @return Map
     */
    public static Map getAllBaseStationInfo(int floor_id) {
        Map args = new HashMap();
        args.put("floor_id", floor_id);
        return Resquest.resquest(module_name, controller_name, Thread.currentThread().getStackTrace()[1].getMethodName(), args);
    }
}
