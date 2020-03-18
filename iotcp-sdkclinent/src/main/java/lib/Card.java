/**
 * Copyright (c) 2017 Ehigh.Co.Ltd. All rights reserved.
 * Authors:
 * Li Zihao<sales@everhigh.com.cn>
 */
package lib;

import java.util.HashMap;
import java.util.Map;

public class Card {
    private static String module_name = "ModularCard";
    private static String controller_name = "Card";

    /**
     *
     * @param card_id 卡号
     * @param page 页数
     * @param limit 每页数据条数
     * @param mapping_id 映射id
     * @param power 0欠压 1正常
     * @return Map
     * @throws IllegalArgumentException
     */
    public static Map getCard(Object card_id, Object page, Object limit, Object mapping_id, Object power, Object card_type) throws IllegalArgumentException {
        if (card_id != null && !(card_id instanceof Integer))
            throw new IllegalArgumentException("Parameter error:card_id instanceof Integer");
        if (page != null && !(page instanceof Integer))
            throw new IllegalArgumentException("Parameter error:page instanceof Integer");
        if (limit != null && !(limit instanceof Integer))
            throw new IllegalArgumentException("Parameter error:limit instanceof Integer");
        if (mapping_id != null && !(mapping_id instanceof Integer))
            throw new IllegalArgumentException("Parameter error:mapping_id instanceof Integer");
        if (power != null && !(power instanceof Integer))
            throw new IllegalArgumentException("Parameter error:power instanceof Integer");
        if (card_type != null && !(card_type instanceof Integer))
            throw new IllegalArgumentException("Parameter error:card_type instanceof Integer");
        Map args = new HashMap();
        args.put("card_id", card_id);
        args.put("page", page);
        args.put("limit", limit);
        args.put("mapping_id", mapping_id);
        args.put("power", power);
        args.put("card_type", card_type);
        return Resquest.resquest(module_name, controller_name, Thread.currentThread().getStackTrace()[1].getMethodName(), args);
    }

    /*
     * 返回所有卡数量
     * @param int card_id 卡号
     * @param int mapping_id 映射id
     * @param int power 0欠压 1正常
     * @return Map
     */
    public static Map getCount(Object card_id, Object mapping_id, Object power, Object card_type) {
        if (card_id != null && !(card_id instanceof Integer))
            throw new IllegalArgumentException("Parameter error:card_id instanceof Integer");
        if (mapping_id != null && !(mapping_id instanceof Integer))
            throw new IllegalArgumentException("Parameter error:mapping_id instanceof Integer");
        if (power != null && !(power instanceof Integer))
            throw new IllegalArgumentException("Parameter error:power instanceof Integer");
        if (card_type != null && !(card_type instanceof Integer))
            throw new IllegalArgumentException("Parameter error:card_type instanceof Integer");
        Map args = new HashMap();
        args.put("card_id", card_id);
        args.put("mapping_id", mapping_id);
        args.put("power", power);
        args.put("card_type", card_type);
        return Resquest.resquest(module_name, controller_name, Thread.currentThread().getStackTrace()[1].getMethodName(), args);
    }

    /*
     * 新增卡的信息
     * @param int card_id 卡号
     * @param string comment 备注
     * @return Map
     */
    public static Map addCard(int card_id, Object comment) throws IllegalArgumentException {
        if (comment != null && !(comment instanceof String))
            throw new IllegalArgumentException("Parameter error:comment instanceof String");
        Map args = new HashMap();
        args.put("card_id", card_id);
        args.put("comment", comment);
        return Resquest.resquest(module_name, controller_name, Thread.currentThread().getStackTrace()[1].getMethodName(), args);
    }

    /*
     * 更新卡的信息
     * @param int id 信息id
     * @param int card_id 卡号
     * @param string comment 备注
     * @return Map
     */
    public static Map updateCard(int identification, Object card_id, Object comment) throws IllegalArgumentException {
        if (card_id != null && !(card_id instanceof Integer))
            throw new IllegalArgumentException("Parameter error:card_id instanceof Integer");
        if (comment != null && !(comment instanceof String))
            throw new IllegalArgumentException("Parameter error:comment instanceof String");
        Map args = new HashMap();
        args.put("id", identification);
        args.put("card_id", card_id);
        args.put("comment", comment);
        return Resquest.resquest(module_name, controller_name, Thread.currentThread().getStackTrace()[1].getMethodName(), args);
    }

    /*
     * 删除卡的信息
     * @param int identification 信息id
     * @return Map
     */
    public static Map deleteCard(int identification) {
        Map args = new HashMap();
        args.put("id", identification);
        return Resquest.resquest(module_name, controller_name, Thread.currentThread().getStackTrace()[1].getMethodName(), args);
    }

    /*
     * 检测卡号是否已经在使用
     * @param int card_id 卡号
     * @return Map
     */
    public static Map checkCard(int card_id) {
        Map args = new HashMap();
        args.put("card_id", card_id);
        return Resquest.resquest(module_name, controller_name, Thread.currentThread().getStackTrace()[1].getMethodName(), args);
    }
}
