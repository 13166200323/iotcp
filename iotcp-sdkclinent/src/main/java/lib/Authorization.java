/**
 * Copyright (c) 2017 Ehigh.Co.Ltd. All rights reserved.
 * Authors:
 * Li Zihao<sales@everhigh.com.cn>
 */
package lib;

import java.security.MessageDigest;
import java.util.HashMap;
import java.util.Map;

/**
 * 用户授权管理模块 Authorization.java
 */
public class Authorization {
    private static String module_name = "ModularUser";
    private static String controller_name = "User";

    /*
     * 授权认证
     * @param string auth_username 授权用户名
     * @param string auth_password 授权密码
     * @param string http_api_version HTTP API版本号
     * @return Map
     */
    public static Map login(String auth_username, String auth_password, String http_api_version) {
        Map args = new HashMap();
        args.put("username", auth_username);
        args.put("password", auth_password);
        args.put("http_api_version", http_api_version);
        return Resquest.resquest(module_name, controller_name, Thread.currentThread().getStackTrace()[1].getMethodName(), args);
    }

    public static String getMD5Str(String str) throws SecurityException {
        MessageDigest messageDigest = null;
        try {
            messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.reset();
            messageDigest.update(str.getBytes("UTF-8"));
        } catch (Exception e) {
            throw new SecurityException(e.getMessage());
        }


        byte[] byteArray = messageDigest.digest();

        StringBuffer md5StrBuff = new StringBuffer();

        for (Integer i = 0; i < byteArray.length; i++) {
            if (Integer.toHexString(0xFF & byteArray[i]).length() == 1)
                md5StrBuff.append("0").append(Integer.toHexString(0xFF & byteArray[i]));
            else
                md5StrBuff.append(Integer.toHexString(0xFF & byteArray[i]));
        }
        return md5StrBuff.toString();
    }

    /*
     * 检测是否登录
     * @param
     * @return Map
     */
    public static Map isLogin() {
        return Resquest.resquest(module_name, controller_name, Thread.currentThread().getStackTrace()[1].getMethodName(), new HashMap());
    }

    /*
     * 退出
     * @param
     * @return Map
     */
    public static Map loginOut() {
        return Resquest.resquest(module_name, controller_name, Thread.currentThread().getStackTrace()[1].getMethodName(), new HashMap());
    }

    /*
     * 修改用户信息
     * @param string username 用户名
     * @param string old_password 原密码（必须用MD5做哈希值）
     * @param string new_password 新密码（必须用MD5做哈希值）
     * @param string again_password 再次输入新密码（必须用MD5做哈希值）
     * @return Map
     */
    public static Map checkUserInfo(Object username, String old_password, Object new_password, Object again_password) throws IllegalArgumentException {
        if (username != null && !(username instanceof String))
            throw new IllegalArgumentException("Parameter error:username instanceof String");
        if (new_password != null && !(new_password instanceof String))
            throw new IllegalArgumentException("Parameter error:new_password instanceof String");
        if (again_password != null && !(again_password instanceof String))
            throw new IllegalArgumentException("Parameter error:again_password instanceof String");
        if (!new_password.equals(again_password))
            throw new IllegalArgumentException("New_password is not consistent with again_password");
        Map args = new HashMap();
        args.put("username", username);
        args.put("old_password", old_password);
        args.put("new_password", new_password.toString());
        args.put("again_password", again_password.toString());
        return Resquest.resquest(module_name, controller_name, Thread.currentThread().getStackTrace()[1].getMethodName(), args);
    }

    /**
     * 获取用户名
     * @return Map
     */
    public static Map getUsername() {
        Map args = new HashMap();
        return Resquest.resquest(module_name, controller_name, Thread.currentThread().getStackTrace()[1].getMethodName(), args);
    }
}
