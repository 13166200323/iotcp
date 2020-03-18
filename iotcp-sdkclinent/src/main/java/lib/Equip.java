/**
 * Copyright (c) 2017 Ehigh.Co.Ltd. All rights reserved.
 * Authors:
 * Li Zihao<sales@everhigh.com.cn>
 */
package lib;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Equip {
    private static String module_name = "ModularVideo";
    private static String controller_name = "Equip";

    /**
     * 获取摄像头信息
     * @param id 摄像头id
     * @param name 摄像头名称
     * @param floor_id 楼层id
     * @param page 页码
     * @param limit 每页数据条数
     * @return Map
     */
    public static Map getEquip(Object id, Object name, Object floor_id, Object page, Object limit) throws IllegalArgumentException{
        if (id != null && !(id instanceof Integer))
            throw new IllegalArgumentException("Parameter error:id instanceof Integer");
        if (name != null && !(name instanceof String))
            throw new IllegalArgumentException("Parameter error:name instanceof String");
        if (floor_id != null && !(floor_id instanceof Integer))
            throw new IllegalArgumentException("Parameter error:floor_id instanceof Integer");
        if (page != null && !(page instanceof Integer))
            throw new IllegalArgumentException("Parameter error:page instanceof Integer");
        if (limit != null && !(limit instanceof Integer))
            throw new IllegalArgumentException("Parameter error:limit instanceof Integer");
        Map args = new HashMap();
        args.put("id", id);
        args.put("name", name);
        args.put("floor_id", floor_id);
        args.put("page", page);
        args.put("limit", limit);
        return Resquest.resquest(module_name, controller_name, Thread.currentThread().getStackTrace()[1].getMethodName(), args);
    }
    /*
     * 获取摄像头信息数量
     * @param int id 摄像头id
     * @param string name 摄像头名称
     * @param int floor_id 楼层id
     * @return Map
     */
    public static Map getCount(Object id, Object name, Object floor_id) throws IllegalArgumentException{
        if (id != null && !(id instanceof Integer))
            throw new IllegalArgumentException("Parameter error:id instanceof Integer");
        if (name != null && !(name instanceof String))
            throw new IllegalArgumentException("Parameter error:name instanceof String");
        if (floor_id != null && !(floor_id instanceof Integer))
            throw new IllegalArgumentException("Parameter error:floor_id instanceof Integer");
        Map args = new HashMap();
        args.put("id", id);
        args.put("name", name);
        args.put("floor_id", floor_id);
        return Resquest.resquest(module_name, controller_name, Thread.currentThread().getStackTrace()[1].getMethodName(), args);
    }
    /*
     * 添加监控设备
     * @param string name 摄像机名字
     * @param string rtsp_url 摄像机流地址
     * @param string area_style 监测区域颜色
     * @param float place_x 坐标X
     * @param float place_y 坐标X
     * @param float place_z 坐标X
     * @param float z_start 监测区域开始高度
     * @param float z_end 监测区域终止高度
     * @param string real_area 监测区域坐标
     * @param int floor_id 楼层ID
     * @return Map
     */
    public static Map addEquip(String name, String  rtsp_url, int floor_id, float place_x, float place_y, float place_z, Object real_area, String area_style,float z_start, float z_end, int onvif_support, int ptz_support, int move_support, Object ptz_x, Object ptz_y, Object ptz_z, Object ip, Object port, String user, String password) throws IllegalArgumentException{
        if (ptz_x != null && !(ptz_x instanceof Float))
            throw new IllegalArgumentException("Parameter error:ptz_x instanceof Float");
        if (ptz_y != null && !(ptz_y instanceof Float))
            throw new IllegalArgumentException("Parameter error:ptz_y instanceof Float");
        if (ptz_z != null && !(ptz_z instanceof Float))
            throw new IllegalArgumentException("Parameter error:ptz_z instanceof Float");
        if (ip != null && !(ip instanceof String))
            throw new IllegalArgumentException("Parameter error:ip instanceof String");
        if (port != null && !(port instanceof Integer))
            throw new IllegalArgumentException("Parameter error:port instanceof Integer");
        if (real_area != null && !(real_area instanceof String))
            throw new IllegalArgumentException("Parameter error:real_area instanceof String");
        Map args = new HashMap();
        args.put("name", name);
        args.put("rtsp_url", rtsp_url);
        args.put("floor_id", floor_id);
        args.put("place_x", place_x);
        args.put("place_y", place_y);
        args.put("place_z", place_z);
        args.put("z_start", z_start);
        args.put("z_end", z_end);
        args.put("real_area", real_area);
        args.put("area_style", area_style);
        args.put("onvif_support", onvif_support);
        args.put("ptz_support", ptz_support);
        args.put("move_support", move_support);
        args.put("ptz_x", ptz_x);
        args.put("ptz_y", ptz_y);
        args.put("ptz_z", ptz_z);
        args.put("ip", ip);
        args.put("port", port);
        args.put("user", user);
        args.put("password", password);
        return Resquest.resquest(module_name, controller_name, Thread.currentThread().getStackTrace()[1].getMethodName(), args);
    }
    /*
     * 修改监控设备
     * @param int id 摄像机id
     * @param string name 摄像机名字
     * @param string rtsp_url 摄像机流地址
     * @param string area_style 监测区域颜色
     * @param float place_x 坐标X
     * @param float place_y 坐标X
     * @param float place_z 坐标X
     * @param float z_start 监测区域开始高度
     * @param float z_end 监测区域终止高度
     * @param string real_area 监测区域坐标
     * @param int floor_id 楼层ID
     * @return Map
     */
    public static Map updateEquip(int id, Object name, Object  rtsp_url, Object floor_id, Object place_x, Object place_y, Object place_z, Object z_start, Object z_end, Object real_area, Object area_style, int onvif_support, int ptz_support, int move_support, Object ptz_x, Object ptz_y, Object ptz_z, Object ip, Object port, String user,String password) throws IllegalArgumentException{
        if (name != null && !(name instanceof String))
            throw new IllegalArgumentException("Parameter error:name instanceof String");
        if (rtsp_url != null && !(rtsp_url instanceof String))
            throw new IllegalArgumentException("Parameter error:rtsp_url instanceof String");
        if (floor_id != null && !(floor_id instanceof Integer))
            throw new IllegalArgumentException("Parameter error:floor_id instanceof Integer");
        if (place_x != null && !(place_x instanceof Float))
            throw new IllegalArgumentException("Parameter error:place_x instanceof Float");
        if (place_y != null && !(place_y instanceof Float))
            throw new IllegalArgumentException("Parameter error:place_y instanceof Float");
        if (place_z != null && !(place_z instanceof Float))
            throw new IllegalArgumentException("Parameter error:place_z instanceof Float");
        if (z_start != null && !(z_start instanceof Float))
            throw new IllegalArgumentException("Parameter error:z_start instanceof Float");
        if (z_end != null && !(z_end instanceof Float))
            throw new IllegalArgumentException("Parameter error:z_end instanceof Float");
        if (real_area != null && !(real_area instanceof String))
            throw new IllegalArgumentException("Parameter error:real_area instanceof String");
        if (area_style != null && !(area_style instanceof String))
            throw new IllegalArgumentException("Parameter error:area_style instanceof String");
        if (ptz_x != null && !(ptz_x instanceof Float))
            throw new IllegalArgumentException("Parameter error:ptz_x instanceof Float");
        if (ptz_y != null && !(ptz_y instanceof Float))
            throw new IllegalArgumentException("Parameter error:ptz_y instanceof Float");
        if (ptz_z != null && !(ptz_z instanceof Float))
            throw new IllegalArgumentException("Parameter error:ptz_z instanceof Float");
        if (ip != null && !(ip instanceof String))
            throw new IllegalArgumentException("Parameter error:ip instanceof String");
        if (port != null && !(port instanceof Integer))
            throw new IllegalArgumentException("Parameter error:port instanceof Integer");
        Map args = new HashMap();
        args.put("id", id);
        args.put("name", name);
        args.put("rtsp_url", rtsp_url);
        args.put("floor_id", floor_id);
        args.put("place_x", place_x);
        args.put("place_y", place_y);
        args.put("place_z", place_z);
        args.put("z_start", z_start);
        args.put("z_end", z_end);
        args.put("real_area", real_area);
        args.put("area_style", area_style);
        args.put("onvif_support", onvif_support);
        args.put("ptz_support", ptz_support);
        args.put("move_support", move_support);
        args.put("ptz_x", ptz_x);
        args.put("ptz_y", ptz_y);
        args.put("ptz_z", ptz_z);
        args.put("ip", ip);
        args.put("port", port);
        args.put("user", user);
        args.put("password", password);
        return Resquest.resquest(module_name, controller_name, Thread.currentThread().getStackTrace()[1].getMethodName(), args);
    }
    /*
     * 删除监控设备
     * @param int id 摄像机id
     * @return Map
     */
    public static Map deleteEquip(int id) {
        Map args = new HashMap();
        args.put("id", id);
        return Resquest.resquest(module_name, controller_name, Thread.currentThread().getStackTrace()[1].getMethodName(), args);
    }
    /*
     * 获取最新画面
     * @param
     * @return Map
     */
    public static Map getPicture() {
        return Resquest.resquest(module_name, controller_name, Thread.currentThread().getStackTrace()[1].getMethodName(), new HashMap());
    }
    /*
     * 录像
     * @param int camera_id 设备id
     * @return Map
     */
    public static Map startVideo(int camera_id) {
        Map args = new HashMap();
        args.put("camera_id", camera_id);
        return Resquest.resquest(module_name, controller_name, Thread.currentThread().getStackTrace()[1].getMethodName(), args);
    }
    /*
     * 直接结束录像，并下载文件
     * @param int camera_id 设备id
     * @return Map
     */
    public static Map stopVideo(int camera_id, Long event_id) {
        Map args = new HashMap();
        args.put("camera_id", camera_id);
        args.put("event_id", event_id);
        return Resquest.resquest(module_name, controller_name, Thread.currentThread().getStackTrace()[1].getMethodName(), args);
    }
    /*
     * 获取合适的设备
     * @param int floor_id 楼层id
     * @param float x 坐标x
     * @param float y 坐标y
     * @param float z 坐标z
     * @return Map
     */
    public static Map getTheWatcher(int floor_id, float x, float y, float z) {
        Map args = new HashMap();
        args.put("floor_id", floor_id);
        args.put("x", x);
        args.put("y", y);
        args.put("z", z);
        return Resquest.resquest(module_name, controller_name, Thread.currentThread().getStackTrace()[1].getMethodName(), args);
    }

    /*
     * 获取设备的支持信息
     * @param string ip 设备地址
     * @param int port 协议端口
     * @param string user 用户名
     * @param string password 用户密码
     * @return Map
     */
    public static Map getEquipSupport(String ip, int port, String user, String password) {
        Map args = new HashMap();
        args.put("ip", ip);
        args.put("port", port);
        args.put("user", user);
        args.put("password", password);
        return Resquest.resquest(module_name, controller_name, Thread.currentThread().getStackTrace()[1].getMethodName(), args);
    }

    /*
     * 获取设备的云台信息
     * @param string ip 设备地址
     * @param int port 协议端口
     * @param string user 用户名
     * @param string password 用户密码
     * @return Map
     */
    public static Map getEquipPtz(String ip, int port, String user, String password) {
        Map args = new HashMap();
        args.put("ip", ip);
        args.put("port", port);
        args.put("user", user);
        args.put("password", password);
        return Resquest.resquest(module_name, controller_name, Thread.currentThread().getStackTrace()[1].getMethodName(), args);
    }

    /*
     * 保存云台信息
     * @param int camera_id 设备ID
     * @return Map
     */
    public static Map saveEquipPtz(int camera_id) {
        Map args = new HashMap();
        args.put("camera_id", camera_id);
        return Resquest.resquest(module_name, controller_name, Thread.currentThread().getStackTrace()[1].getMethodName(), args);
    }

    /*
     * 转动设备
     * @param int camera_id 设备ID
     * @param string ip 设备地址
     * @param int port 协议端口
     * @param string user 用户名
     * @param string password 用户密码
     * @param float up_speed 设为正值则向上转动，设为负值则向下转动，该数值的绝对值越大则速度越快
     * @param float right_speed 设为正值则向右转动，设为负值则向左转动，该数值的绝对值越大则速度越快
     * @param float far_speed 设为正值则视角变远，设为负值则视角变近，该数值的绝对值越大则速度越快
     * @return Map
     */
    public static Map moveRelative(Object camera_id, Object ip, Object port, Object user, Object password, Object up_speed, Object right_speed, Object far_speed) {
        Map args = new HashMap();
        args.put("camera_id", camera_id);
        args.put("ip", ip);
        args.put("port", port);
        args.put("user", user);
        args.put("password", password);
        args.put("up_speed", up_speed);
        args.put("right_speed", right_speed);
        args.put("far_speed", far_speed);
        return Resquest.resquest(module_name, controller_name, Thread.currentThread().getStackTrace()[1].getMethodName(), args);
    }


    /*
     * 停止转动设备
     * @param int camera_id 设备ID
     * @param string ip 设备地址
     * @param int port 协议端口
     * @param string user 用户名
     * @param string password 用户密码
     * @return Map
     */
    public static Map moveStop(Object camera_id, Object ip, Object port, Object user, Object password) throws IllegalArgumentException{
        if (camera_id != null && !(camera_id instanceof Integer))
            throw new IllegalArgumentException("Parameter error:camera_id instanceof Integer");
        if (ip != null && !(ip instanceof String))
            throw new IllegalArgumentException("Parameter error:ip instanceof String");
        if (port != null && !(port instanceof Integer))
            throw new IllegalArgumentException("Parameter error:port instanceof Integer");
        if (user != null && !(user instanceof String))
            throw new IllegalArgumentException("Parameter error:user instanceof String");
        if (password != null && !(password instanceof String))
            throw new IllegalArgumentException("Parameter error:password instanceof String");
        Map args = new HashMap();
        args.put("camera_id", camera_id);
        args.put("ip", ip);
        args.put("port", port);
        args.put("user", user);
        args.put("password", password);
        return Resquest.resquest(module_name, controller_name, Thread.currentThread().getStackTrace()[1].getMethodName(), args);
    }

    /**
     * 获取宽高
     * @return Map
     */
    public static Map getVideoSize() throws IllegalArgumentException{
        Map args = new HashMap();
        return Resquest.resquest(module_name, controller_name, Thread.currentThread().getStackTrace()[1].getMethodName(), args);
    }

    /*
     * 查询设备搜索结果
     * @param
     * @return Map
     */
    public static Map getSearchList() {
        return Resquest.resquest(module_name, controller_name, Thread.currentThread().getStackTrace()[1].getMethodName(), new HashMap());
    }
    /*
 * 停止转动设备
 * @param int camera_id 设备ID
 * @param string ip 设备地址
 * @param int port 协议端口
 * @param string user 用户名
 * @param string password 用户密码
 * @return Map
 */
    public static Map getNVR(Object id, Object page, Object limit) throws IllegalArgumentException{
        if (id != null && !(id instanceof Integer))
            throw new IllegalArgumentException("Parameter error:id instanceof Integer");
        if (page != null && !(page instanceof Integer))
            throw new IllegalArgumentException("Parameter error:page instanceof Integer");
        if (limit != null && !(limit instanceof Integer))
            throw new IllegalArgumentException("Parameter error:limit instanceof Integer");
        Map args = new HashMap();
        args.put("id", id);
        args.put("page", page);
        args.put("limit", limit);
        return Resquest.resquest(module_name, controller_name, Thread.currentThread().getStackTrace()[1].getMethodName(), args);
    }
    public static Map getNVRCount(Object id) throws IllegalArgumentException{
        if (id != null && !(id instanceof Integer))
            throw new IllegalArgumentException("Parameter error:id instanceof Integer");
        Map args = new HashMap();
        args.put("id", id);
        return Resquest.resquest(module_name, controller_name, Thread.currentThread().getStackTrace()[1].getMethodName(), args);
    }
    public static Map addNVR(String name, String ip, Integer port, String user, String password, Integer type, Object model, Object sn) throws IllegalArgumentException{
        if (model != null && !(model instanceof String))
            throw new IllegalArgumentException("Parameter error:model instanceof String");
        if (sn != null && !(sn instanceof String))
            throw new IllegalArgumentException("Parameter error:sn instanceof String");
        Map args = new HashMap();
        args.put("name", name);
        args.put("ip", ip);
        args.put("port", port);
        args.put("user", user);
        args.put("password", password);
        args.put("type", type);
        args.put("model", model);
        args.put("sn", sn);
        return Resquest.resquest(module_name, controller_name, Thread.currentThread().getStackTrace()[1].getMethodName(), args);
    }

    public static Map editNVR(Integer id, Object name, Object ip, Object port, Object user, Object password, Object type, Object model, Object sn) throws IllegalArgumentException{
        if (name != null && !(name instanceof String))
            throw new IllegalArgumentException("Parameter error:name instanceof String");
        if (ip != null && !(ip instanceof String))
            throw new IllegalArgumentException("Parameter error:ip instanceof String");
        if (port != null && !(port instanceof Integer))
            throw new IllegalArgumentException("Parameter error:port instanceof Integer");
        if (user != null && !(user instanceof String))
            throw new IllegalArgumentException("Parameter error:user instanceof String");
        if (password != null && !(password instanceof String))
            throw new IllegalArgumentException("Parameter error:password instanceof String");
        if (type != null && !(type instanceof Integer))
            throw new IllegalArgumentException("Parameter error:type instanceof Integer");
        if (model != null && !(model instanceof String))
            throw new IllegalArgumentException("Parameter error:model instanceof String");
        if (sn != null && !(sn instanceof String))
            throw new IllegalArgumentException("Parameter error:sn instanceof String");
        Map args = new HashMap();
        args.put("id", id);
        args.put("name", name);
        args.put("ip", ip);
        args.put("port", port);
        args.put("user", user);
        args.put("password", password);
        args.put("type", type);
        args.put("model", model);
        args.put("sn", sn);
        return Resquest.resquest(module_name, controller_name, Thread.currentThread().getStackTrace()[1].getMethodName(), args);
    }
    public static Map deleteNVR(Integer id) throws IllegalArgumentException{
        Map args = new HashMap();
        args.put("id", id);
        return Resquest.resquest(module_name, controller_name, Thread.currentThread().getStackTrace()[1].getMethodName(), args);
    }
    public static Map getNVRInfo(Object id, Object ip, Object port, Object user, Object password, Object type) throws IllegalArgumentException{
        if (id != null && !(id instanceof Integer))
            throw new IllegalArgumentException("Parameter error:id instanceof Integer");
        if (ip != null && !(ip instanceof String))
            throw new IllegalArgumentException("Parameter error:ip instanceof String");
        if (port != null && !(port instanceof Integer))
            throw new IllegalArgumentException("Parameter error:port instanceof Integer");
        if (user != null && !(user instanceof String))
            throw new IllegalArgumentException("Parameter error:user instanceof String");
        if (password != null && !(password instanceof String))
            throw new IllegalArgumentException("Parameter error:password instanceof String");
        if (type != null && !(type instanceof Integer))
            throw new IllegalArgumentException("Parameter error:type instanceof Integer");
        Map args = new HashMap();
        args.put("id", id);
        args.put("ip", ip);
        args.put("port", port);
        args.put("user", user);
        args.put("password", password);
        args.put("type", type);
        return Resquest.resquest(module_name, controller_name, Thread.currentThread().getStackTrace()[1].getMethodName(), args);
    }
    public static Map getNVRChanInfo(Integer id) throws IllegalArgumentException{
        Map args = new HashMap();
        args.put("id", id);
        return Resquest.resquest(module_name, controller_name, Thread.currentThread().getStackTrace()[1].getMethodName(), args);
    }
    public static Map getNVRFile(Integer equip_id, Integer chan_id, Integer time_begin, Integer time_end) throws IllegalArgumentException{
        Map args = new HashMap();
        args.put("equip_id", equip_id);
        args.put("chan_id", chan_id);
        args.put("time_begin", time_begin);
        args.put("time_end", time_end);
        return Resquest.resquest(module_name, controller_name, Thread.currentThread().getStackTrace()[1].getMethodName(), args);
    }
    public static Map getNVRFile(Integer card_id, Integer time_begin, Integer time_end) throws IllegalArgumentException{
        Map args = new HashMap();
        args.put("card_id", card_id);
        args.put("time_begin", time_begin);
        args.put("time_end", time_end);
        return Resquest.resquest(module_name, controller_name, Thread.currentThread().getStackTrace()[1].getMethodName(), args);
    }
    public static Map editNVRCamera(Integer nvr_id, ArrayList data) throws IllegalArgumentException{
        Map args = new HashMap();
        args.put("nvr_id", nvr_id);
        args.put("data", data);
        return Resquest.resquest(module_name, controller_name, Thread.currentThread().getStackTrace()[1].getMethodName(), args);
    }
    public static Map addAllRecordOrder(Integer camera_id,Integer all_ay, Object mon) throws IllegalArgumentException{
        if (mon != null && !(mon instanceof ArrayList)) {
            throw new IllegalArgumentException("Parameter error:mon instanceof ArrayList");
        }
        Map args = new HashMap();
        args.put("camera_id", camera_id);
        args.put("all_ay", all_ay);
        args.put("mon", mon);
        return Resquest.resquest(module_name, controller_name, Thread.currentThread().getStackTrace()[1].getMethodName(), args);
    }
    public static Map delAllRecordOrder(Integer camera_id) throws IllegalArgumentException{
        Map args = new HashMap();
        args.put("camera_id", camera_id);
        return Resquest.resquest(module_name, controller_name, Thread.currentThread().getStackTrace()[1].getMethodName(), args);
    }
    public static Map getAllRecordOrder(Object camera_id) throws IllegalArgumentException{
        if (camera_id != null && !(camera_id instanceof Integer))
            throw new IllegalArgumentException("Parameter error:camera_id instanceof Integer");
        Map args = new HashMap();
        args.put("camera_id", camera_id);
        return Resquest.resquest(module_name, controller_name, Thread.currentThread().getStackTrace()[1].getMethodName(), args);
    }
    public static Map getRecordInfo(Object camera_id, Object begin, Object end) throws IllegalArgumentException{
        if (camera_id != null && !(camera_id instanceof Integer))
            throw new IllegalArgumentException("Parameter error:camera_id instanceof Integer");
        if (begin != null && !(begin instanceof Integer))
            throw new IllegalArgumentException("Parameter error:begin instanceof Integer");
        if (end != null && !(end instanceof Integer))
            throw new IllegalArgumentException("Parameter error:end instanceof Integer");
        Map args = new HashMap();
        args.put("camera_id", camera_id);
        args.put("begin", begin);
        args.put("end", end);
        return Resquest.resquest(module_name, controller_name, Thread.currentThread().getStackTrace()[1].getMethodName(), args);
    }
    public static Map delRecordInfo(Object id,Object camera_id, Object begin, Object end) throws IllegalArgumentException{
        if (id != null && !(id instanceof ArrayList))
            throw new IllegalArgumentException("Parameter error:id instanceof ArrayList");
        if (camera_id != null && !(camera_id instanceof Integer))
            throw new IllegalArgumentException("Parameter error:camera_id instanceof Integer");
        if (begin != null && !(begin instanceof Integer))
            throw new IllegalArgumentException("Parameter error:begin instanceof Integer");
        if (end != null && !(end instanceof Integer))
            throw new IllegalArgumentException("Parameter error:end instanceof Integer");
        Map args = new HashMap();
        args.put("id", id);
        args.put("camera_id", camera_id);
        args.put("begin", begin);
        args.put("end", end);
        return Resquest.resquest(module_name, controller_name, Thread.currentThread().getStackTrace()[1].getMethodName(), args);
    }
    public static Map getDiskInfo() throws IllegalArgumentException{
        Map args = new HashMap();
        return Resquest.resquest(module_name, controller_name, Thread.currentThread().getStackTrace()[1].getMethodName(), args);
    }
    public static Map addVision(int camera_id,String area,String area_style,Object pose_matrix,Object parameter_camera) throws IllegalArgumentException{
        if (pose_matrix != null && !(pose_matrix instanceof Map))
            throw new IllegalArgumentException("Parameter error:pose_matrix instanceof Map");
        if (parameter_camera != null && !(parameter_camera instanceof String))
            throw new IllegalArgumentException("Parameter error:parameter_camera instanceof String");
        Map args = new HashMap();
        args.put("camera_id", camera_id);
        args.put("area", area);
        args.put("area_style", area_style);
        args.put("pose_matrix", pose_matrix);
        args.put("parameter_camera", parameter_camera);
        return Resquest.resquest(module_name, controller_name, Thread.currentThread().getStackTrace()[1].getMethodName(), args);
    }
    public static Map editVision(int id,int camera_id,String area,String area_style,Object pose_matrix,Object parameter_camera) throws IllegalArgumentException{
        if (pose_matrix != null && !(pose_matrix instanceof Map))
            throw new IllegalArgumentException("Parameter error:pose_matrix instanceof Map");
        if (parameter_camera != null && !(parameter_camera instanceof String))
            throw new IllegalArgumentException("Parameter error:parameter_camera instanceof String");
        Map args = new HashMap();
        args.put("id", id);
        args.put("camera_id", camera_id);
        args.put("area", area);
        args.put("area_style", area_style);
        args.put("pose_matrix", pose_matrix);
        args.put("parameter_camera", parameter_camera);
        return Resquest.resquest(module_name, controller_name, Thread.currentThread().getStackTrace()[1].getMethodName(), args);
    }
    public static Map delVision(int id) throws IllegalArgumentException{
        Map args = new HashMap();
        args.put("id", id);
        return Resquest.resquest(module_name, controller_name, Thread.currentThread().getStackTrace()[1].getMethodName(), args);
    }
    public static Map getVision(Object id,Object floor_id,Object page,Object limit) throws IllegalArgumentException{
        Map args = new HashMap();
        args.put("id", id);
        args.put("floor_id", floor_id);
        args.put("page", page);
        args.put("limit", limit);
        return Resquest.resquest(module_name, controller_name, Thread.currentThread().getStackTrace()[1].getMethodName(), args);
    }
    public static Map getVisionCount(Object id,Object floor_id) throws IllegalArgumentException{
        Map args = new HashMap();
        args.put("id", id);
        args.put("floor_id", floor_id);
        return Resquest.resquest(module_name, controller_name, Thread.currentThread().getStackTrace()[1].getMethodName(), args);
    }
    public static Map startVision(int equip_id) throws IllegalArgumentException{
        Map args = new HashMap();
        args.put("equip_id", equip_id);
        return Resquest.resquest(module_name, controller_name, Thread.currentThread().getStackTrace()[1].getMethodName(), args);
    }
    public static Map stopVision(int equip_id) throws IllegalArgumentException{
        Map args = new HashMap();
        args.put("equip_id", equip_id);
        return Resquest.resquest(module_name, controller_name, Thread.currentThread().getStackTrace()[1].getMethodName(), args);
    }
    public static Map getVisionLocation(Object equip_id) throws IllegalArgumentException{
        if (equip_id != null && !(equip_id instanceof Integer))
            throw new IllegalArgumentException("Parameter error:equip_id instanceof Integer");
        Map args = new HashMap();
        args.put("equip_id", equip_id);
        return Resquest.resquest(module_name, controller_name, Thread.currentThread().getStackTrace()[1].getMethodName(), args);
    }
    public static Map setVisionOrigin(int equip_id) throws IllegalArgumentException{
        Map args = new HashMap();
        args.put("equip_id", equip_id);
        return Resquest.resquest(module_name, controller_name, Thread.currentThread().getStackTrace()[1].getMethodName(), args);
    }
}