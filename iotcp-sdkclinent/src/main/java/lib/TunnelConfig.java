/**
 * Copyright (c) 2017 Ehigh.Co.Ltd. All rights reserved.
 * Authors:
 * Li Zihao<sales@everhigh.com.cn>
 */
package lib;

import java.util.HashMap;
import java.util.Map;

public class TunnelConfig {
    private static String module_name = "ModularConfiguration";
    private static String controller_name = "TunnelConfig";

    /**
     * 获取所有配置信息（HGTunnel配置）
     * @return Map
     * @throws IllegalArgumentException
     */
    public static Map getConfiguration() throws IllegalArgumentException{
        Map args = new HashMap();
        return Resquest.resquest(module_name, controller_name, Thread.currentThread().getStackTrace()[1].getMethodName(), args);
    }

    /*
     * 添加配置信息（HGTunnel配置）
     * @param string target_address 内网的穿透地址
     * @param string master_address HGTunnel内部通信的Master地址
     * @return Map
     */
    public static Map addConfiguration(String target_address, int master_port, int customer_port, Object process_num) {
        if (process_num != null && !(process_num instanceof Integer))
            throw new IllegalArgumentException("Parameter error:process_num instanceof Integer");
        Map args = new HashMap();
        args.put("target_address", target_address);
        args.put("master_address", master_port);
        args.put("customer_port", customer_port);
        args.put("process_num", process_num);
        return Resquest.resquest(module_name, controller_name, Thread.currentThread().getStackTrace()[1].getMethodName(), args);
    }
    /*
     * 修改配置信息（HGTunnel配置）
     * @param int id 配置信息id
     * @param string target_address 内网的穿透地址
     * @param string master_address HGTunnel内部通信的Master地址
     * @return Map
     */
    public static Map setConfiguration(int id, Object target_address, Object master_port, Object customer_port, Object process_num) {
        if (target_address != null && !(target_address instanceof String))
            throw new IllegalArgumentException("Parameter error:target_address instanceof String");
        if (master_port != null && !(master_port instanceof Integer))
            throw new IllegalArgumentException("Parameter error:master_port instanceof Integer");
        if (customer_port != null && !(customer_port instanceof Integer))
            throw new IllegalArgumentException("Parameter error:customer_port instanceof Integer");
        if (process_num != null && !(process_num instanceof Integer))
            throw new IllegalArgumentException("Parameter error:process_num instanceof Integer");
        Map args = new HashMap();
        args.put("id", id);
        args.put("target_address", target_address);
        args.put("master_port", master_port);
        args.put("customer_port", customer_port);
        args.put("process_num", process_num);
        return Resquest.resquest(module_name, controller_name, Thread.currentThread().getStackTrace()[1].getMethodName(), args);
    }
    /*
     * 删除配置信息（HGTunnel配置）
     * @param int id 配置信息id
     * @return Map
     */
    public static Map deleteConfiguration(int id) {
        Map args = new HashMap();
        args.put("id", id);
        return Resquest.resquest(module_name, controller_name, Thread.currentThread().getStackTrace()[1].getMethodName(), args);
    }
}
