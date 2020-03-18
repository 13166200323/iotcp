/**
 * Copyright (c) 2017 Ehigh.Co.Ltd. All rights reserved.
 * Authors:
 * Li Zihao<sales@everhigh.com.cn>
 */
package lib;

import java.util.HashMap;
import java.util.Map;

/**
 * 日志查询模块 Journal.java
 */
public class Journal {
    private static String module_name = "ModularLog";
    private static String controller_name = "Log";

    /*
     * 返回统计日志的次数
     * @param   Long start 开始时间
     * @param   Long end 结束时间
     * @return Map
     */
    public static Map getCount(Object start, Object end) throws IllegalArgumentException {
        if (start != null && !(start instanceof Long)) {
            throw new IllegalArgumentException("Parameter error:start instanceof Long");
        }
        if (end != null && !(end instanceof Long)) {
            throw new IllegalArgumentException("Parameter error:end instanceof Long");
        }
        Map args = new HashMap();
        args.put("start", start);
        args.put("end", end);
        return Resquest.resquest(module_name, controller_name, Thread.currentThread().getStackTrace()[1].getMethodName(), args);
    }

    /**
     *
     * @param start 开始时间
     * @param end 结束时间
     * @return Map
     * @throws IllegalArgumentException
     */
    public static Map getLog(Object start, Object end) throws IllegalArgumentException {
        if (start != null && !(start instanceof Long)) {
            throw new IllegalArgumentException("Parameter error:start instanceof Long");
        }
        if (end != null && !(end instanceof Long)) {
            throw new IllegalArgumentException("Parameter error:end instanceof Long");
        }
        Map args = new HashMap();
        args.put("start", start);
        args.put("end", end);
        return Resquest.resquest(module_name, controller_name, Thread.currentThread().getStackTrace()[1].getMethodName(), args);
    }
}
