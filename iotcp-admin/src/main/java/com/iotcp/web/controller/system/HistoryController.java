package com.iotcp.web.controller.system;

import com.iotcp.system.service.ISysUserService;
import com.iotcp.web.core.testPOJO.cardHistory;
import lib.Building;
import lib.Card;
import lib.Floor;
import lib.History;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * 巡检模块.....  定位轨迹回放.
 */
@Controller
@RequestMapping("/system/history")
public class HistoryController {

    @Autowired
    private ISysUserService iSysUserService;
    /**
     * 查询建筑信息
     * @return
     */
    @GetMapping("/getBuilding")
    @ResponseBody
    public Map<String,String> getBuilding(){
        Map<String,String> map = new HashMap<>();
        map.put("getBuilding", Building.getBuilding(null,null,null).toString());
        return  map;
    }

    /**
     * 查询楼层的信息
     * @return
     */
    @GetMapping("/getFloor")
    @ResponseBody
    public Map<String,String> getFloor(){
        Map<String,String> map = new HashMap<>();
        map.put("getFloor", Floor.getFloor(null,null,null).toString());
        return  map;
    }

    /**
     * 查询轨迹回放记录
     * @return
     */
    @GetMapping("/getCardHistory")
    @ResponseBody
    public Map<String,String> getCardHistory(cardHistory cardHistory){
        Map<String,String> map = new HashMap<>();
        if (cardHistory.getCard_ids()==null && cardHistory.getCard_ids()==""){
            String card = iSysUserService.getSysUserByLoginName(cardHistory.getLoginName());
            if (card!=null&& card!="")
            {
                cardHistory.setCard_ids(card);
            }else {
                map.put("getCardHistory","获取异常,请联系工程师.");
                return map;
            }
        }
        map.put("getCardHistory",  History.getCardFloorDataTime(cardHistory.getCard_ids(), cardHistory.getStart_time(), cardHistory.getEnd_time()).toString());
        return  map;
    }

    /**
     * 查询卡号状态 -- status使用状态 0 未使用 1 使用
     * @return
     */
    public  Map<String,String> getCard(){
        Map<String,String> map = new HashMap<>();
        map.put("getCard", Card.getCard(null, null, null,null,null,null).toString());
        return  map;
    }
}
