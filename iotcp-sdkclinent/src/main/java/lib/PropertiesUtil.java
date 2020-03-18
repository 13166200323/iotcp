/**
 * Copyright (c) 2017 Ehigh.Co.Ltd. All rights reserved.
 * Authors:
 * Li Zihao<sales@everhigh.com.cn>
 */
package lib;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.Iterator;
import java.util.Properties;

public class PropertiesUtil {
    /*
     * 获取配置信息
     * @param   String key 配置名称
     * @return Object
     */
    public static Object get(String filename, String key) {
        Properties prop = new Properties();
        try {
            //读取属性文件
            InputStream in = new BufferedInputStream(new FileInputStream(filename));
            prop.load(in);     ///加载属性列表
            Iterator<String> it = prop.stringPropertyNames().iterator();
            while (it.hasNext()) {
                String skey = it.next();
                if (skey.equals(key)) {
                    in.close();
                    return prop.getProperty(skey);
                }
            }
            in.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return false;
    }
    /*
     * 设置配置信息
     * @param   String filename 配置文件名称
     * @param   String key 配置名称
     * @param   String value 配置值
     * @return void
     */

    public static void set(String filename, String key, String value) {
        Properties prop = new Properties();
        try {
            ///保存属性到文件
            FileOutputStream oFile = new FileOutputStream(filename, true);//true表示追加打开
            prop.setProperty(key, value);
            prop.store(oFile, "The New properties file");
            oFile.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}