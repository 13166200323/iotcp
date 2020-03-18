/**
 * Copyright (c) 2017 Ehigh.Co.Ltd. All rights reserved.
 * Authors:
 * Li Zihao<sales@everhigh.com.cn>
 */
package lib;

import lombok.extern.slf4j.Slf4j;
import net.sf.json.JSONObject;
import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
@Slf4j
public class HttpRequestUtils {
    /*
     * 发送http post请求
     * @param String address 请求地址
     * @param Map params 请求参数
     * @return JSONObject
     */
    public static Map httpPost(String address, Map params) {
        Map result = new HashMap();
        try {
            // 创建url资源
            URL url = new URL(address);

            // 建立http连接
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            // 设置允许输出
            conn.setDoOutput(true);

            conn.setDoInput(true);

            // 设置不用缓存
            conn.setUseCaches(false);

            //读取

            File cookie_file = new File("cookie.txt");

            if (cookie_file.exists()) {
                String pathName = "cookie.txt";

                BufferedReader br = new BufferedReader(new FileReader(pathName));
                String line = "";
                String sessid = "";
                while ((line = br.readLine()) != null) {
                    sessid = line;
                }
                br.close();
                if (!"".equals(sessid)) {
                    conn.setRequestProperty("Cookie", sessid);
                }
            }

            // 设置传递方式
            conn.setRequestMethod("POST");
            // 设置文件字符集:
            conn.setRequestProperty("Charset", "UTF-8");
            conn.setRequestProperty("Connection", "Keep-Alive");
            if(PropertiesUtil.get("config.properties","return_value_flag").toString().equals("1"))
                conn.setRequestProperty("return_value_flag", "1");

            //params = JSONObject.fromObject(params);
            //转换为字节数组
            byte[] data = (params.toString()).getBytes();
            // 设置文件长度
            conn.setRequestProperty("Content-Length", String.valueOf(data.length));

            // 开始连接请求
            conn.connect();
            log.info("定位SDK连接成功");
            if (!params.isEmpty()) {

                String content = "";

                Iterator entries = params.entrySet().iterator();

                while (entries.hasNext()) {
                    Map.Entry entry = (Map.Entry) entries.next();
                    if (entry.getValue() instanceof Integer || entry.getValue() instanceof String || entry.getValue() instanceof Long || entry.getValue() instanceof Float){
                        //如果值为整型或者字符串
                        if (content.isEmpty()) {
                            content += URLEncoder.encode(entry.getKey().toString(), "UTF-8") + "=" + URLEncoder.encode(entry.getValue().toString(), "UTF-8");
                        } else {
                            content += "&" + URLEncoder.encode(entry.getKey().toString(), "UTF-8") + "=" + URLEncoder.encode(entry.getValue().toString(), "UTF-8");
                        }
                    }else if (entry.getValue() instanceof Map){
                        //如果值为字典
                        Iterator entrie = ((Map) entry.getValue()).entrySet().iterator();
                        while (entrie.hasNext()) {
                            Map.Entry entr = (Map.Entry) entrie.next();
                            if (entr.getValue() instanceof ArrayList){
                                ArrayList value = (ArrayList) entr.getValue();
                                if (value.isEmpty()){
                                    //如果所传列表为空
                                    if (content.isEmpty()) {
                                        content += URLEncoder.encode(entry.getKey().toString() + "[" + entr.getKey().toString() + "]" , "UTF-8") + "=" + URLEncoder.encode( "","UTF-8");
                                    } else {
                                        content += "&" + URLEncoder.encode(entry.getKey().toString() + "[" + entr.getKey().toString() + "]" , "UTF-8") + "=" + URLEncoder.encode( "","UTF-8");
                                    }
                                }else{
                                    //如果列表不为空
                                    for(int i = 0; i < value.size(); i++){
                                        if (content.isEmpty()) {
                                            content += URLEncoder.encode(entry.getKey().toString() + "[" + entr.getKey().toString() + "]" + "[]", "UTF-8") + "=" + URLEncoder.encode(value.get(i).toString(), "UTF-8");
                                        } else {
                                            content += "&" + URLEncoder.encode(entry.getKey().toString() + "[" + entr.getKey().toString() + "]" + "[]", "UTF-8") + "=" + URLEncoder.encode(value.get(i).toString(), "UTF-8");
                                        }
                                    }
                                }
                            }else{
                                if (content.isEmpty()) {
                                    content += URLEncoder.encode(entry.getKey().toString() + "[" + entr.getKey().toString() + "]", "UTF-8") + "=" + URLEncoder.encode(entr.getValue().toString(), "UTF-8");
                                } else {
                                    content += "&" + URLEncoder.encode(entry.getKey().toString() + "[" + entr.getKey().toString() + "]", "UTF-8") + "=" + URLEncoder.encode(entr.getValue().toString(), "UTF-8");
                                }
                            }
                        }
                    }else if (entry.getValue() instanceof ArrayList){
                        //如果值为数组
                        ArrayList value = (ArrayList) entry.getValue();
                        for(int i = 0; i < value.size(); i++){
                            if (value.get(i) instanceof ArrayList){
                                for(int j = 0; j < ((ArrayList)value.get(i)).size(); j++){
                                    if (content.isEmpty()) {
                                        content += URLEncoder.encode(entry.getKey().toString() + "[" + i + "]" + "[" + j + "]", "UTF-8") + "=" + URLEncoder.encode(((ArrayList)value.get(i)).get(j).toString(), "UTF-8");
                                    } else {
                                        content += "&" + URLEncoder.encode(entry.getKey().toString() + "[" + i + "]" + "[" + j + "]", "UTF-8") + "=" + URLEncoder.encode(((ArrayList)value.get(i)).get(j).toString(), "UTF-8");
                                    }
                                }
                            }
                            else if (value.get(i) instanceof Map)
                            {
                                Iterator entrie = ((Map) value.get(i)).entrySet().iterator();
                                while (entrie.hasNext()) {
                                    Map.Entry entr = (Map.Entry) entrie.next();
                                    if (content.isEmpty()) {
                                        content += URLEncoder.encode(entry.getKey().toString() + "[" + i + "]" + "[" + entr.getKey().toString() + "]", "UTF-8") + "=" + URLEncoder.encode(entr.getValue().toString(), "UTF-8");
                                    } else {
                                        content += "&" + URLEncoder.encode(entry.getKey().toString() + "[" + i + "]" + "[" + entr.getKey().toString() + "]", "UTF-8") + "=" + URLEncoder.encode(entr.getValue().toString(), "UTF-8");
                                    }
                                }
                            }
                            else
                            {
                                if (content.isEmpty()) {
                                    content += URLEncoder.encode(entry.getKey().toString() + "[]", "UTF-8") + "=" + URLEncoder.encode(value.get(i).toString(), "UTF-8");
                                } else {
                                    content += "&" + URLEncoder.encode(entry.getKey().toString() + "[]", "UTF-8") + "=" + URLEncoder.encode(value.get(i).toString(), "UTF-8");
                                }
                            }
                        }
                    }
                }

                OutputStream out = conn.getOutputStream();
                // 写入请求的字符串
                out.write(content.getBytes());
                out.flush();
                out.close();
            }


            // 请求返回的状态
            if (conn.getResponseCode() == 200) {
                String responseCookie = conn.getHeaderField("Set-Cookie");// 取到所用的Cookie
                String sessionIdString = "";
                if (responseCookie != null) {
                    sessionIdString = responseCookie.substring(0, responseCookie.indexOf(";"));
                    File file = new File("cookie.txt");

                    if (!file.exists()) {
                        file.createNewFile();
                    }

                    FileWriter fileWritter = new FileWriter(file.getName());
                    BufferedWriter bufferWritter = new BufferedWriter(fileWritter);
                    bufferWritter.write(sessionIdString);
                    bufferWritter.close();
                }


                // 请求返回的数据

                InputStreamReader in = new InputStreamReader(conn.getInputStream(),"UTF-8");

                BufferedReader br = new BufferedReader(in);

                String res = "";

                String readerLine = null;

                while ((readerLine = br.readLine()) != null) {

                    res += readerLine;

                }

                in.close();
                JSONObject ret = JSONObject.fromObject(res);

                if (ret.get("type").equals(1)) {
                    result.put("type", true);
                    result.put("data", ret.get("result"));
                } else if (ret.get("type").equals(0)) {
                    //auth_username auth_password
                    cookie_file = new File("config.properties");

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


                    String username = PropertiesUtil.get("config.properties", "auth_username").toString();
                    String password = PropertiesUtil.get("config.properties", "auth_password").toString();
                    String http_api_version = PropertiesUtil.get("config.properties", "http_api_version").toString();
                    if (username.isEmpty() || password.isEmpty() || http_api_version.isEmpty()) {
                        result.put("type", false);
                        result.put("data", "Please configure the configuration file");
                    } else {
                        Map re = Authorization.login(username, Authorization.getMD5Str(password), http_api_version);
                        if (re.get("type").equals(false)) {
                            return re;
                        } else {
                            return httpPost(address, params);
                        }

                    }

                } else {
                    result.put("type", false);
                    result.put("data", ret.get("result"));
                }

            } else {
                result.put("type", false);
                result.put("data", "http请求失败:" + conn.getResponseCode());
            }
        } catch (Exception e) {
            log.info("定位地址返回异常信息:"+e.getMessage());
            System.out.println(e);
        }
        log.info("定位基站返回结果信息:"+result);
        return result;
    }
}