/**
 * Copyright (c) 2017 Ehigh.Co.Ltd. All rights reserved.
 * Authors:
 * Li Zihao<sales@everhigh.com.cn>
 */
package lib;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class GPS {
    private static String module_name = "ModularGPS";
    private static String controller_name = "GPS";

    /**
     * @return Map
     * @throws IllegalArgumentException
     */
    public static Map query() throws IllegalArgumentException {
        Map args = new HashMap();
        return Resquest.resquest(module_name, controller_name, Thread.currentThread().getStackTrace()[1].getMethodName(), args);
    }

    /**
     *
     * @param floor_id 楼层id
     * @param is_use 是否启用 0停用 1启用
     * @param gps gps坐标
     * @param uwb uwb坐标
     * @return Map
     * @throws IllegalArgumentException
     */
    public static Map set(Object floor_id, Object is_use, Object gps, Object uwb) throws IllegalArgumentException {
        if (floor_id != null && !(floor_id instanceof Integer))
            throw new IllegalArgumentException("Parameter error:floor_id instanceof Integer");
        if (is_use != null && !(is_use instanceof Integer))
            throw new IllegalArgumentException("Parameter error:is_use instanceof Integer");
        if (gps != null && !(gps instanceof ArrayList))
            throw new IllegalArgumentException("Parameter error:gps instanceof ArrayList");
        if (uwb != null && !(uwb instanceof ArrayList))
            throw new IllegalArgumentException("Parameter error:uwb instanceof ArrayList");
        Map args = new HashMap();
        args.put("floor_id", floor_id);
        args.put("is_use", is_use);
        args.put("gps", gps);
        args.put("uwb", uwb);
        return Resquest.resquest(module_name, controller_name, Thread.currentThread().getStackTrace()[1].getMethodName(), args);
    }
}
