/**
 * Copyright (c) 2017 Ehigh.Co.Ltd. All rights reserved.
 * Authors:
 * Li Zihao<sales@everhigh.com.cn>
 */
package lib;

import lombok.extern.slf4j.Slf4j;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@Slf4j
public class Resquest {
    public static boolean flag=false;
    public static Map resquest(String moudle_name, String controller_name, String action_name, Map args) {
        File cookie_file = new File("config.properties");
        try {
            if (!cookie_file.exists()) {
                cookie_file.createNewFile();
                FileWriter fileWritter = new FileWriter(cookie_file.getName(), true);
                BufferedWriter bufferWritter = new BufferedWriter(fileWritter);
                bufferWritter.write("#SDK服务端地址" + System.getProperty("line.separator"));
                bufferWritter.write("server_host = localhost" + System.getProperty("line.separator"));
                bufferWritter.write("#SDK服务端端口" + System.getProperty("line.separator"));
                bufferWritter.write("server_port = 80" + System.getProperty("line.separator"));
                bufferWritter.write("#SDK服务端项目文件夹" + System.getProperty("line.separator"));
                bufferWritter.write("project_folder = position_sdk" + System.getProperty("line.separator"));
                bufferWritter.write("#SDK认证的用户名" + System.getProperty("line.separator"));
                bufferWritter.write("auth_username = admin" + System.getProperty("line.separator"));
                bufferWritter.write("#SDK认证的密码" + System.getProperty("line.separator"));
                bufferWritter.write("auth_password = admin" + System.getProperty("line.separator"));
                bufferWritter.write("#HTTP API版本号" + System.getProperty("line.separator"));
                bufferWritter.write("http_api_version = 3.0.0" + System.getProperty("line.separator"));
                bufferWritter.write("#接口返回数据类型 0字符串类型 1数据库原生类型（只对从数据库获取的数据类型进行转换操作，RPC获取的数据不会进行转换操作）" + System.getProperty("line.separator"));
                bufferWritter.write("return_value_flag = 0" + System.getProperty("line.separator"));
                bufferWritter.close();
            }
            if (flag == false){
                String config_path = cookie_file.getCanonicalPath().toString();
                System.out.println("检测到配置文件：" + config_path);
                flag = true;
            }
        } catch (Exception e) {
            System.out.println(e);
        }


        Iterator entries = args.entrySet().iterator();
        while (entries.hasNext()) {

            Map.Entry entry = (Map.Entry) entries.next();

            entry.getKey();

            if (entry.getValue() == null) {
                entries.remove();
            }
        }
        if (PropertiesUtil.get("config.properties", "server_host").toString().isEmpty() || PropertiesUtil.get("config.properties", "server_port").toString().isEmpty()){
            Map result = new HashMap();
            result.put("type", false);
            result.put("data", "Please configure the configuration file");
            return result;
        }
        String url = "";
        if (PropertiesUtil.get("config.properties", "project_folder").toString().isEmpty()){
            url = "http://" + PropertiesUtil.get("config.properties", "server_host").toString() + ":" + PropertiesUtil.get("config.properties", "server_port").toString() + "/" + moudle_name + "/" + controller_name + "/" + action_name;
        }else{
            url = "http://" + PropertiesUtil.get("config.properties", "server_host").toString() + ":" + PropertiesUtil.get("config.properties", "server_port").toString() + "/" + PropertiesUtil.get("config.properties", "project_folder").toString() + "/" + moudle_name + "/" + controller_name + "/" + action_name;
        }
        log.info("定位SDK访问的URL地址:"+url);
        return HttpRequestUtils.httpPost(url, args);

    }
}
