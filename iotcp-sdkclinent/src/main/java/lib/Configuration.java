/**
 * Copyright (c) 2017 Ehigh.Co.Ltd. All rights reserved.
 * Authors:
 * Li Zihao<sales@everhigh.com.cn>
 */
package lib;

import java.util.HashMap;
import java.util.Map;

public class Configuration {
    private static String module_name = "ModularConfiguration";
    private static String controller_name = "Configuration";

    /**
     * 获取所有配置信息（主动发送实时数据给用户的服务）
     * @return Map
     */
    public static Map getConfiguration(Object name,Object page,Object limit) {
        if (name != null && !(name instanceof String))
            throw new IllegalArgumentException("Parameter error:name instanceof String");
        if (page != null && !(page instanceof Integer))
            throw new IllegalArgumentException("Parameter error:page instanceof Integer");
        if (limit != null && !(limit instanceof Integer))
            throw new IllegalArgumentException("Parameter error:limit instanceof Integer");
        Map args = new HashMap();
        args.put("name", name);
        args.put("page", page);
        args.put("limit", limit);
        return Resquest.resquest(module_name, controller_name, Thread.currentThread().getStackTrace()[1].getMethodName(), args);
    }

    /*
     * 设置配置信息（主动发送实时数据给用户的服务）
     * @param string name 配置项名称
     * 目前可配置项的name支持如下
     * SEND_LOCATION_URL 发送定位坐标信息的路径 字符串类型
     * SEND_ALARM_URL 发送报警信息的路径 字符串类型
     * LOCATION_MAX_NUMBER 实时定位数据的最大缓存条数 整型类型
     * LOCATION_SENDING_RATE 定位坐标信息的发送时间间隔 浮点类型 单位为秒
     * ALARM_MAX_NUMBER 报警数据的最大缓存条数 整型类型
     * ALARM_VALIDITY_TIME 报警信息在缓存中的有效时长 浮点类型 单位为秒
     * ALARM_SENDING_RATE 报警信息的发送时间间隔 浮点类型 单位为秒
     * _INIT_AREA_URL 用户接收区域出现变化（增加、删除、修改）通知的HTTP Post路径 字符串类型
     * TOPIC_DEL_CARD_URL 用户接收2D楼层消失卡号通知列表的HTTP Post路径 字符串类型
     * TOPIC_CARD_NOW_FLOOR_NUM_URL 用户接收每个楼层的总人数的HTTP Post路径 字符串类型
     * TOPIC_CARD_NOW_NUM_URL 用户接收每个区域的人数的HTTP Post路径 字符串类型
     * TOPIC_INAREA_URL 用户接收卡进入区域通知的HTTP Post路径 字符串类型
     * TOPIC_OUTAREA_URL 用户接收卡离开区域通知的HTTP Post路径 字符串类型
     * @param string/int/float value 配置项的值
     * @return Map
     */
    public static Map setConfiguration(String name, String value) {
        Map args = new HashMap();
        args.put("name", name);
        args.put("value", value);
        return Resquest.resquest(module_name, controller_name, Thread.currentThread().getStackTrace()[1].getMethodName(), args);
    }
}
