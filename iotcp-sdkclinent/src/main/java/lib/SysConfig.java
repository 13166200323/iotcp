/**
 * Copyright (c) 2017 Ehigh.Co.Ltd. All rights reserved.
 * Authors:
 * Li Zihao<sales@everhigh.com.cn>
 */
package lib;

import java.util.HashMap;
import java.util.Map;

public class SysConfig {
    private static String module_name = "ModularConfiguration";
    private static String controller_name = "SysConfig";

    /**
     * 获取所有配置信息（系统服务端配置）
     * @return Map
     */
    public static Map getSysConfig(Object name,Object page,Object limit) {
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
     * 设置配置信息（系统服务端配置）
     * @param string name 配置项名称
     * 目前可配置项的name支持如下
     * CARD_OUT_TIME 定位卡信号消失的过期时间（时间戳） 默认10秒
     * OPTIMAL_FLAG  优化坐标是否开启，0关闭1开启
     * OPTIMAL_DIS 优化坐标距离（实时显示不动距离） 默认0.3米
     * OPTIMAL_WEIGHT 优化权重，规定时间内小于距离的点除以总点数(0到1之间) 默认0.6
     * OPTIMAL_TIME 判断优化时间 默认3秒
     * JUDGE_AREA_TIME 区域进出判断最大时间 默认12秒
     * IN_OUT_AREA_NUM 进出区域判断生效的点个数 5个
     * AREA_CLEAR_TIME 信号消失判断点离开区域的时间戳 默认1800秒
     * AREA_INIT_TIME 区域历史重启时重载数据时间戳 默认43200秒
     * HIS_OUT_AREA_TIME 历史区域记录结束的时间戳（正常离开区域，超过设定时间记录结束） 默认1800秒
     * HIS_OUT_AREA_MAX_TIME 历史区域记录过期的最大时间戳 默认43200秒
     * STATIC_LEN 不动报警距离 默认2米
     * ALARM_DIS_TIME 默认报警间隔时间设置（最短5s） 默认5秒
     * CAMERA_TIMEOUT_VIDEO 用户录制视频的最长时间（秒）
     * CAMERA_TIMEOUT_FILE 一定时间后删除录制的视频文件（天）
     * CAMERA_DATA_MAX_SIZE 视频文件占用空间超过该大小后发出警告（MB）
     * CAMERA_TIMEOUT_TASK 报警时录制视频长度（秒）
     * CAMERA_ALARM_WIDTH 报警时录制视频的宽
     * CAMERA_ALARM_HEIGHT 报警时录制视频的高
     * CAMERA_USER_WIDTH 观看时录制视频的宽
     * CAMERA_USER_HEIGHT 观看时录制视频的高
     * @param string/int/float value 配置项的值
     * @return Map
     */
    public static Map setSysConfig(String name, String value) {
        Map args = new HashMap();
        args.put("name", name);
        args.put("value", value);
        return Resquest.resquest(module_name, controller_name, Thread.currentThread().getStackTrace()[1].getMethodName(), args);
    }
    public static Map resetConfiguration() {
        Map args = new HashMap();
        return Resquest.resquest(module_name, controller_name, Thread.currentThread().getStackTrace()[1].getMethodName(), args);
    }
}
