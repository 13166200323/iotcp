package test; /**
 * Copyright (c) 2017 Ehigh.Co.Ltd. All rights reserved.
 * Authors:
 * Li Zihao<sales@everhigh.com.cn>
 */


/**
 * 如果计算机上有JDK6及以上版本的程序可以在Command中执行 java -jar sdkclient.jar 命令进行接口测试。
 * 用户第一次执行Example示例文件时，项目的根目录会生成config.properties配置文件，用户按需求配置config.properties文件后，就可以进行接口访问和测试。
 */

import lib.*;
import net.sf.json.JSONArray;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Example {
    public static void main(String[] args) {
        //查询所有报警信息
        System.out.println("调用接口 => Alarm.getAlarm()");
        System.out.println("接口返回 => " + Alarm.getAlarm(new ArrayList<Integer>(){{add(3);}},0,0L,1539595592L,1,2,2720,null,null,null));
        //查询求救的信息
        System.out.println("调用接口 => Alarm.getHelp()");
        System.out.println("接口返回 => " + Alarm.getHelp(null, null, null, null,null,null,null));
        //查询所有的欠压信息
        System.out.println("调用接口 => Alarm.getPower()");
        System.out.println("接口返回 => " + Alarm.getPower(null,null,null,null));
        //查询一个月内未处理的报警、求救、欠压信息的次数
        System.out.println("调用接口 => Alarm.getAllCount()");
        System.out.println("接口返回 => " + Alarm.getAllCount());
        //查询统计的报警次数
        System.out.println("调用接口 => Alarm.getCount()");
        System.out.println("接口返回 => " + Alarm.getCount(null,null,null,null,null,null,null,null));
        //查询欠压信息总数
        System.out.println("调用接口 => Alarm.getPowerCount()");
        System.out.println("接口返回 => " + Alarm.getPowerCount(null,null));
        //查询求救信息的总数
        System.out.println("调用接口 => Alarm.getHelpCount()");
        System.out.println("接口返回 => " + Alarm.getHelpCount(null, null, null, null,null));
        //批量修改欠压信息
        System.out.println("调用接口 => Alarm.updatePowerBatch()");
        System.out.println("接口返回 => " + Alarm.updatePowerBatch(new ArrayList<Integer>(){{add(1);add(2);}}, 1, "power"));
        //修改欠压信息
        System.out.println("调用接口 => Alarm.updatePower()");
        System.out.println("接口返回 => " + Alarm.updatePower(1, 0, "power"));
        //修改求救信息支持批量修改
        System.out.println("调用接口 => Alarm.updateHelp()");
        System.out.println("接口返回 => " + Alarm.updateHelp(new ArrayList<Integer>(){{add(1);add(2);}}, 1, "help"));
        //删除报警信息支持批量删除
        System.out.println("调用接口 => Alarm.updateAlarm()");
        System.out.println("接口返回 => " + Alarm.updateAlarm(new ArrayList<Integer>(){{add(1);add(2);}}, 1, "alarm"));
        //查询所有报警信息
        System.out.println("调用接口 => Alarm.deleteAlarm()");
        System.out.println("接口返回 => " + Alarm.deleteAlarm(1));
        //删除求救信息支持批量删除
        System.out.println("调用接口 => Alarm.deleteHelp()");
        System.out.println("接口返回 => " + Alarm.deleteHelp(1));


        //查询楼层中所有基站信息
        System.out.println("调用接口 => BaseStation.getAllBaseStationInfo()");
        System.out.println("接口返回 => " + BaseStation.getAllBaseStationInfo(1));


        //查询卡的历史信息
        System.out.println("调用接口 => History.getCardHistory()");
        System.out.println("接口返回 => " + History.getCardHistory(1509604624000L,null,  null, "1,2", "1,2", 1));
        //查询有历史消息的时间段
        System.out.println("调用接口 => History.getCardHistoryDataTime()");
        System.out.println("接口返回 => " + History.getCardHistoryDataTime(1508342400L, 1508428800L, new ArrayList<Integer>(){{add(1);add(2);}}, 1));
        //查询卡在区域中停留时长的历史信息
        System.out.println("调用接口 => History.getAreaCardRecord()");
        System.out.println("接口返回 => " + History.getAreaCardRecord(1508342400L, 1508428800L, 1, 1, 1, 1, 25));
        //指定卡号查询该卡号有数据的时间段和所在楼层
        System.out.println("调用接口 => History.getCardFloorDataTime()");
        System.out.println("接口返回 => " + History.getCardFloorDataTime(1, 1508342400L, null));


        //查询统计日志的次数
        System.out.println("调用接口 => Journal.getCount()");
        System.out.println("接口返回 => " + Journal.getCount(null, null));
        //查询日志的信息
        System.out.println("调用接口 => Journal.getLog()");
        System.out.println("接口返回 => " + Journal.getLog(null, null));



        //新增场景信息
        System.out.println("调用接口 => Scene.addScene()");
        Map result = Scene.addScene("scene1", "scene1");
        int scene_id = Integer.parseInt(result.get("data").toString());
        System.out.println("接口返回 => " + result);
        //查询场景信息
        System.out.println("调用接口 => Scene.getScene()");
        System.out.println("接口返回 => " + Scene.getScene(null,null));

        //修改场景信息
        System.out.println("调用接口 => Scene.updateScene()");
        System.out.println("接口返回 => " + Scene.updateScene(scene_id, null, "scene"));
        //查询场景总数
        System.out.println("调用接口 => Scene.getCount()");
        System.out.println("接口返回 => " + Scene.getCount());
        //检测场景名称是否已经存在
        System.out.println("调用接口 => Scene.sceneNameAvailable()");
        System.out.println("接口返回 => " + Scene.sceneNameAvailable("scene1"));


        //新增建筑信息
        System.out.println("调用接口 => Building.addBuilding()");
        result = Building.addBuilding(scene_id, "building1", "building1");
        int building_id = Integer.parseInt(result.get("data").toString());
        System.out.println("接口返回 => " + result);
        //查询建筑信息
        System.out.println("调用接口 => Building.getBuilding()");
        System.out.println("接口返回 => " + Building.getBuilding(null,null,null));

        //修改建筑信息
        System.out.println("调用接口 => Building.updateBuilding()");
        System.out.println("接口返回 => " + Building.updateBuilding(building_id, scene_id, "building2", "building"));
        //查询建筑总数
        System.out.println("调用接口 => Building.getCount()");
        System.out.println("接口返回 => " + Building.getCount(null));
        //检测建筑名称是否已经存在
        System.out.println("调用接口 => Building.BuildingNameAvailable()");
        System.out.println("接口返回 => " + Building.buildingNameAvailable("building1", scene_id));


        //添加楼层
        System.out.println("调用接口 => Floor.addFloor()");
        result = Floor.addFloor("floor1", 1.0f, 10.0f, building_id, 25.0f, 0.5f, 0.5f, 2f);
        int floor_id = Integer.parseInt(result.get("data").toString());
        System.out.println("接口返回 => " + result);
        //查询楼层的数量
        System.out.println("调用接口 => Floor.getCount()");
        System.out.println("接口返回 => " + Floor.getCount(null));
        //查询楼层的信息
        System.out.println("调用接口 => Floor.getFloor()");
        System.out.println("接口返回 => " + Floor.getFloor(null,null,null));

        //根据场景建筑楼层的层次结构关系获取所有楼层信息
        System.out.println("调用接口 => Floor.getAllFloorInfo()");
        System.out.println("接口返回 => " + Floor.getAllFloorInfo(null,null));
        //修改楼层基础信息
        System.out.println("调用接口 => Floor.updateFloor()");
        System.out.println("接口返回 => " + Floor.updateFloor(floor_id, "floor1", 2.0f, 15.0f, 25.0f, 0.5f, 0.5f, 2f));


        //检测楼层名称是否已经存在
        System.out.println("调用接口 => Floor.floorNameAvailable()");
        System.out.println("接口返回 => " + Floor.floorNameAvailable("floor1", building_id));
        //查询楼层中的区域总数
        System.out.println("调用接口 => Floor.getFloorAreaCount()");
        System.out.println("接口返回 => " + Floor.getFloorAreaCount(1));
        //根据楼层id获取场景建筑信息
        System.out.println("调用接口 => Floor.getOtherIdByFloorId()");
        System.out.println("接口返回 => " + Floor.getOtherIdByFloorId(1));


        //新增卡号信息
        System.out.println("调用接口 => Card.addCard()");
        result = Card.addCard(1, "card123");
        int id = Integer.parseInt(result.get("data").toString());
        System.out.println("接口返回 => " + result);
        //查询卡号信息
        System.out.println("调用接口 => Card.getCard()");
        System.out.println("接口返回 => " + Card.getCard(null, null, null,null,null,null));
        //查询卡的数量
        System.out.println("调用接口 => Card.getCount()");
        System.out.println("接口返回 => " + Card.getCount(null,null,null,null));
        //修改卡号信息
        System.out.println("调用接口 => Card.updateCard()");
        System.out.println("接口返回 => " + Card.updateCard(1, 99999, "card"));
        //检测卡号是否已经在使用
        System.out.println("调用接口 => Card.checkCard()");
        System.out.println("接口返回 => " + Card.checkCard(99999));
        //删除卡号信息
        System.out.println("调用接口 => Card.deleteCard()");
        System.out.println("接口返回 => " + Card.deleteCard(id));


        //新增电子围栏信息
        System.out.println("调用接口 => Area.addArea()");
        result = Area.addArea(floor_id,1,0f,10.0f,"test",1,1,1,"-1.3996037894014197,-1.315627562037335 1.604879011846963,-1.315627562037335 1.604879011846963,1.4275958651894491 -1.3996037894014197,1.4275958651894491 -1.3996037894014197,-1.315627562037335","-1.3996037894014197,-1.315627562037335 1.604879011846963,-1.315627562037335 1.604879011846963,1.4275958651894491 -1.3996037894014197,1.4275958651894491 -1.3996037894014197,-1.315627562037335",null,"rgba(52, 64, 255, 0.5)","rgba(52, 64, 255, 0.5)",null,null,null,null);
        int area_id = Integer.parseInt(result.get("data").toString());
        System.out.println("接口返回 => " + result);
        //查询电子围栏的数量
        System.out.println("调用接口 => Area.getCount()");
        System.out.println("接口返回 => " + Area.getCount(null,null,null,null,null,null,null));
        //查询电子围栏信息
        System.out.println("调用接口 => Area.getArea()");
        System.out.println("接口返回 => " + Area.getArea(null, null,null,null,null,null,null,null,null));

        //修改电子围栏信息
        System.out.println("调用接口 => Area.updateArea()");
        System.out.println("接口返回 => " + Area.updateArea(area_id,null,2,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null));

        //查询楼层与小区id的对应关系
        System.out.println("调用接口 => SubnetFloor.getSubnetFloorRelationship()");
        System.out.println("接口返回 => " + SubnetFloor.getSubnetFloorRelationship(null,null));



        //授权认证
        System.out.println("调用接口 => Authorization.login()");
        System.out.println("接口返回 => " + Authorization.login("admin", Authorization.getMD5Str("admin"), "1.2.0"));
        //获取当前用户名
        System.out.println("调用接口 => Authorization.getUsername()");
        System.out.println("接口返回 => " + Authorization.getUsername());
        //检测是否登录
        System.out.println("调用接口 => Authorization.isLogin()");
        System.out.println("接口返回 => " + Authorization.isLogin());
        //修改用户信息
        System.out.println("调用接口 => Authorization.checkUserInfo()");
        System.out.println("接口返回 => " + Authorization.checkUserInfo("admin", Authorization.getMD5Str("admin"), Authorization.getMD5Str("admin"), Authorization.getMD5Str("admin")));
        //退出
        System.out.println("调用接口 => Authorization.loginOut()");
        System.out.println("接口返回 => " + Authorization.loginOut());


        //查询所有配置项（主动发送数据给第三方接口的服务）
        System.out.println("调用接口 => Configuration.getConfiguration()");
        System.out.println("接口返回 => " + Configuration.getConfiguration(null,null,null));
        //查询所有配置项（系统服务）
        System.out.println("调用接口 => SysConfig.getSysConfig()");
        System.out.println("接口返回 => " + SysConfig.getSysConfig(null,null,null));


        //生成障碍物活动区域合并图片
        System.out.println("调用接口 => NowInfo.creatObstacleAreaPic()");
        System.out.println("接口返回 => " + NowInfo.creatObstacleAreaPic(1));
        //获取临时划定区域中存在的卡号
        ArrayList<Map<String,Object>> area_parameters_list = new ArrayList<Map<String,Object>>();
        Map map1 = new HashMap();
        map1.put("floor_id",1);
        map1.put("area","22.446551581241515,5.670037154391187 38.033844732264484,5.670037154391187 38.033844732264484,14.886502042053266 22.446551581241515,14.886502042053266 22.446551581241515,5.670037154391187");
        map1.put("z_start",0);
        map1.put("z_end",10);
        Map map2 = new HashMap();
        map2.put("floor_id",1);
        map2.put("area","31.302002867313142,-0.12741656526721812 38.479802710699744,-0.12741656526721812 38.479802710699744,3.7375525811717196 31.302002867313142,3.7375525811717196 31.302002867313142,-0.12741656526721812");
        map2.put("z_start",0);
        map2.put("z_end",10);
        area_parameters_list.add(map1);
        area_parameters_list.add(map2);
        System.out.println("调用接口 => NowInfo.getAreaCard()");
        System.out.println("接口返回 => " + NowInfo.getAreaCard(area_parameters_list));
        //获取包含不动列表的卡号
        System.out.println("调用接口 => NowInfo.getStaticList()");
        System.out.println("接口返回 => " + NowInfo.getStaticList(1));
        //撤离已有区域
        System.out.println("调用接口 => NowInfo.evacuateArea()");
        System.out.println("接口返回 => " + NowInfo.evacuateArea(new ArrayList<Integer>(){{add(1);}}));
        //撤离临时划定区域
        System.out.println("调用接口 => NowInfo.evacuateTmpArea()");
        System.out.println("接口返回 => " + NowInfo.evacuateTmpArea(1, new ArrayList<String>(){{add("-4.511389547837268,1.0357068041562343 -3.4010372082454694,1.0357068041562343 -3.4010372082454694,1.623540395704822 -4.511389547837268,1.623540395704822 -4.511389547837268,1.0357068041562343");}}, 0, 50));
        //呼叫卡号
        System.out.println("调用接口 => NowInfo.callCardList()");
        System.out.println("接口返回 => " + NowInfo.callCardList(new ArrayList<Integer>(){{add(1);add(2);}}));
        //获取所有卡的实时定位信息
        System.out.println("调用接口 => NowInfo.getAllCardNowPos()");
        System.out.println("接口返回 => " + NowInfo.getAllCardNowPos(null,null));
        //查询所有区域中卡的数量
        System.out.println("调用接口 => NowInfo.getAllAreaCardNum()");
        System.out.println("接口返回 => " + NowInfo.getAllAreaCardNum());
        //查询所有区域中卡号
        System.out.println("调用接口 => NowInfo.getAllAreaCardID()");
        System.out.println("接口返回 => " + NowInfo.getAllAreaCardID());
        //查询当前所有卡的信息及所在区域
        System.out.println("调用接口 => NowInfo.getNowInfo()");
        System.out.println("接口返回 => " + NowInfo.getNowInfo(null, null, null, null, null));
        //获得指定卡号所在的区域
        System.out.println("调用接口 => NowInfo.getAreaByCard()");
        System.out.println("接口返回 => " + NowInfo.getAreaByCard(new ArrayList<Integer>(){{add(1);add(2);}}));
        //获得指定区域中的卡号
        System.out.println("调用接口 => NowInfo.getCardByArea()");
        System.out.println("接口返回 => " + NowInfo.getCardByArea(new ArrayList<Integer>(){{add(1);add(2);}},null));
        //坐标转换
        ArrayList<ArrayList<Float>> coordinates = new ArrayList<ArrayList<Float>>();
        ArrayList<Float> coordinate1 = new ArrayList<Float>(){{add(0F);add(0F);}};
        ArrayList<Float> coordinate2 = new ArrayList<Float>(){{add(1F);add(1F);}};
        coordinates.add(coordinate1);
        coordinates.add(coordinate2);
        System.out.println("调用接口 => NowInfo.coordinateConvert()");
        System.out.println("接口返回 => " + NowInfo.coordinateConvert(coordinates,coordinates,coordinates));
        System.out.println("调用接口 => NowInfo.cardWarning()");
        System.out.println("接口返回 => " + NowInfo.cardWarning(1,new ArrayList<Integer>(){{add(100);}}));
        System.out.println("调用接口 => NowInfo.getCardFunction()");
        System.out.println("接口返回 => " + NowInfo.getCardFunction(new ArrayList<Integer>(){{add(1);}}));

        //新增动态围栏信息
        System.out.println("调用接口 => Dynamic.addDynamic()");
        result = Dynamic.addDynamic("test",638,12.0f,"a",new ArrayList<Integer>(){{add(6);add(43);}},1,null,null,null,null,null,null,null,null,null,null,null);
        int dynamic_id = Integer.parseInt(result.get("data").toString());
        System.out.println("接口返回 => " + result);
        //查询动态围栏的数量
        System.out.println("调用接口 => Dynamic.getCount()");
        System.out.println("接口返回 => " + Dynamic.getCount(null,null,null));
        //查询动态围栏信息
        System.out.println("调用接口 => Dynamic.getDynamic()");
        System.out.println("接口返回 => " + Dynamic.getDynamic(null,null,null,null,null));

        //修改动态围栏信息
        System.out.println("调用接口 => Dynamic.updateDynamic()");
        System.out.println("接口返回 => " + Dynamic.updateDynamic(dynamic_id,"testDynamic",null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null));
        //删除动态围栏信息
        System.out.println("调用接口 => Dynamic.deleteDynamic()");
        System.out.println("接口返回 => " + Dynamic.deleteDynamic(dynamic_id));


        ArrayList<Integer> day_json = new ArrayList<Integer>();
        day_json.add(0);day_json.add(1);day_json.add(2);day_json.add(3);day_json.add(4);day_json.add(5);day_json.add(6);
        ArrayList<ArrayList> time_json = new ArrayList<ArrayList>();
        ArrayList<Integer> item1 = new ArrayList<Integer>();
        item1.add(0);item1.add(23400);
        ArrayList<Integer> item2 = new ArrayList<Integer>();
        item2.add(31200);item2.add(39000);
        time_json.add(item1);time_json.add(item2);
        ArrayList<Integer> card_ids = new ArrayList<Integer>();
        card_ids.add(100);card_ids.add(101);card_ids.add(102);
        //新增规则信息
        System.out.println("调用接口 => AlarmRule.addAlarmRule()");
        result = AlarmRule.addAlarmRule("test",1,1,1,null,0l,0l, day_json, time_json, "test",card_ids,null);
        int rule_id = Integer.parseInt(result.get("data").toString());
        System.out.println("接口返回 => " + result);
        //查询规则的数量
        System.out.println("调用接口 => Dynamic.getCount()");
        System.out.println("接口返回 => " + AlarmRule.getCount(null,null,null,null,null,null,null,null));
        //查询规则信息
        System.out.println("调用接口 => AlarmRule.getAlarmRule()");
        System.out.println("接口返回 => " + AlarmRule.getAlarmRule(null,null,null,null,null,null,null,null,null,null));

        //修改规则信息
        System.out.println("调用接口 => AlarmRule.updateAlarmRule()");
        System.out.println("接口返回 => " + AlarmRule.updateAlarmRule(rule_id,"testRule",null,null,null,null,null,null,null,null, null, null,null));
        //获取指定卡号相关的报警规则信息
        System.out.println("调用接口 => AlarmRule.getAlarmRuleByCard()");
        System.out.println("接口返回 => " + AlarmRule.getAlarmRuleByCard(rule_id));
        //删除规则信息
        System.out.println("调用接口 => AlarmRule.deleteAlarmRule()");
        System.out.println("接口返回 => " + AlarmRule.deleteAlarmRule(rule_id));


        //新增摄像头信息
        System.out.println("调用接口 => Equip.addEquip()");
        result = Equip.addEquip("test","rtsp://",1,-3.15f,7.65f,1.5f,"12.988323165645188,-0.14929107086948434 25.939323563573,-0.14929107086948434 25.939323563573,11.94328566955879 12.988323165645188,11.94328566955879 12.988323165645188,-0.14929107086948434","rgba(52, 64, 158, 0.5)",0f,10f,1,1,1,null,null,null,null,null,"test","test");
        int equip_id = Integer.parseInt(result.get("data").toString());
        System.out.println("接口返回 => " + result);
        //查询摄像头的数量
        System.out.println("调用接口 => Equip.getCount()");
        System.out.println("接口返回 => " + Equip.getCount(null,null,null));
        //查询摄像头信息
        System.out.println("调用接口 => Equip.getEquip()");
        System.out.println("接口返回 => " + Equip.getEquip(null,null,null,null,null));

        //修改摄像头信息
        System.out.println("调用接口 => Equip.updateEquip()");
        System.out.println("接口返回 => " + Equip.updateEquip(equip_id,"testEquip",null,null,null,null,null,null,null,null,null,1,1,1,null,null,null,null,null,"test","test"));
        //删除摄像头信息
        System.out.println("调用接口 => Equip.deleteEquip()");
        System.out.println("接口返回 => " + Equip.deleteEquip(equip_id));

        boolean flag = false;
        try
        {
            equip_id = Integer.parseInt(((JSONArray) Equip.getEquip(null,null,null,null,null).get("data")).getJSONObject(0).getString("id"));
            flag = true;
        }
        catch (Exception e)
        {
            flag = false;
        }

        if (flag){
            result = Equip.startVideo(equip_id);
            if (result.get("data") instanceof Long){
                //开始录像
                System.out.println("调用接口 => Equip.startVideo()");
                Long event_id = (Long)result.get("data");
                System.out.println("接口返回 => " + result);
                //结束录像
                System.out.println("调用接口 => Equip.stopVideo()");
                System.out.println("接口返回 => " + Equip.stopVideo(equip_id,event_id));
            }
        }


        //新增离群报警
        System.out.println("调用接口 => EscortStray.addStray()");
        result = EscortStray.addStray("test",1,10.0f, "test", null, null, day_json, time_json, card_ids);
        int es_rule_id = Integer.parseInt(result.get("data").toString());
        System.out.println("接口返回 => " + result);
        //获取陪同离群报警规则信息
        System.out.println("调用接口 => EscortStray.getEscortStray()");
        System.out.println("接口返回 => " + EscortStray.getEscortStray(null,null,null, null, null, null, null));

        //获取陪同离群报警规则信息数量
        System.out.println("调用接口 => EscortStray.getCount()");
        System.out.println("接口返回 => " + EscortStray.getCount(null,null,null,null,null));
        //修改离群报警
        System.out.println("调用接口 => EscortStray.updateStray()");
        System.out.println("接口返回 => " + EscortStray.updateStray(es_rule_id,null,0,null, null, null, null, null,null,null));
        //删除陪同离群规则
        System.out.println("调用接口 => EscortStray.deleteEscortStray()");
        System.out.println("接口返回 => " + EscortStray.deleteEscortStray(es_rule_id));
        //新增陪同报警
        System.out.println("调用接口 => EscortStray.addEscort()");
        ArrayList<Integer> passive_card_ids = new ArrayList<Integer>();
        passive_card_ids.add(200);passive_card_ids.add(201);passive_card_ids.add(202);
        result = EscortStray.addEscort("test",1,10.0f, "test", null, null, day_json, time_json, card_ids,passive_card_ids);
        es_rule_id = Integer.parseInt(result.get("data").toString());
        System.out.println("接口返回 => " + result);

        //修改陪同报警
        System.out.println("调用接口 => EscortStray.updateEscort()");
        System.out.println("接口返回 => " + EscortStray.updateEscort(es_rule_id,null,0,null, null, null, null, null,null,null,null));
        EscortStray.deleteEscortStray(es_rule_id);


        //新增障碍物区域
        System.out.println("调用接口 => Obstacle.addArea()");
        result = Obstacle.addArea(floor_id,1,0f,10.0f,"test",1,1,1,"-1.3996037894014197,-1.315627562037335 1.604879011846963,-1.315627562037335 1.604879011846963,1.4275958651894491 -1.3996037894014197,1.4275958651894491 -1.3996037894014197,-1.315627562037335","-1.3996037894014197,-1.315627562037335 1.604879011846963,-1.315627562037335 1.604879011846963,1.4275958651894491 -1.3996037894014197,1.4275958651894491 -1.3996037894014197,-1.315627562037335",null,"rgba(52, 64, 255, 0.5)","rgba(52, 64, 255, 0.5)",null,null);
        int obstacle_id = Integer.parseInt(result.get("data").toString());
        System.out.println("接口返回 => " + result);
        //查询障碍物区域的数量
        System.out.println("调用接口 => Obstacle.getCount()");
        System.out.println("接口返回 => " + Obstacle.getCount(null,null,null,null,null,null,null));
        //查询障碍物区域信息
        System.out.println("调用接口 => Obstacle.getArea()");
        System.out.println("接口返回 => " + Obstacle.getArea(null, null,null,null,null,null,null,null,null));

        //修改障碍物区域信息
        System.out.println("调用接口 => Obstacle.updateArea()");
        System.out.println("接口返回 => " + Obstacle.updateArea(obstacle_id,null,2,null,null,null,null,null,null,null,null,null,null,null,null,null));
        //删除障碍物信息
        System.out.println("调用接口 => Obstacle.deleteArea()");
        System.out.println("接口返回 => " + Obstacle.deleteArea(obstacle_id));


        //删除电子围栏信息
        System.out.println("调用接口 => Area.deleteArea()");
        System.out.println("接口返回 => " + Area.deleteArea(area_id));
        //删除楼层
        System.out.println("调用接口 => Floor.deleteFloor()");
        System.out.println("接口返回 => " + Floor.deleteFloor(floor_id));
        //删除建筑信息
        System.out.println("调用接口 => Building.deleteBuilding()");
        System.out.println("接口返回 => " + Building.deleteBuilding(building_id));
        //删除场景信息
        System.out.println("调用接口 => Scene.deleteScene()");
        System.out.println("接口返回 => " + Scene.deleteScene(scene_id));

        //获取心率信息
        System.out.println("调用接口 => HeartRate.getHeartRate()");
        result = HeartRate.getHeartRate(null,null,null);
        System.out.println("接口返回 => " + result);
        //获取心率信息总数
        System.out.println("调用接口 => HeartRate.getCount()");
        System.out.println("接口返回 => " + HeartRate.getCount(null));
        //修改指定卡号的心率上下限
        System.out.println("调用接口 => HeartRate.updateHeartRate()");
        ArrayList<Integer> heartRate_card_ids = new ArrayList<Integer>();
        heartRate_card_ids.add(111111);
        System.out.println("接口返回 => " + HeartRate.updateHeartRate(heartRate_card_ids, 140,50));
        //获取指定卡号的心率历史信息
        System.out.println("调用接口 => HeartRate.getHistory()");
        System.out.println("接口返回 => " + HeartRate.getHistory(heartRate_card_ids,0l,1545979659l));
        //获取卡号的历史步数与移动距离
        System.out.println("调用接口 => HeartRate.getDistanceStep()");
        System.out.println("接口返回 => " + HeartRate.getDistanceStep(heartRate_card_ids,"2018-12-28"));


        //获取心率异常信息
        System.out.println("调用接口 => Abnormal.getAbnormal()");
        result = Abnormal.getAbnormal(null,null,null,null,null,null,null);
        System.out.println("接口返回 => " + result);
        //获取心率异常信息总数
        System.out.println("调用接口 => Abnormal.getCount()");
        System.out.println("接口返回 => " + Abnormal.getCount(null,null,null,null,null));
        //修改心率异常信息状态
        System.out.println("调用接口 => Abnormal.updateAbnormal()");
        System.out.println("接口返回 => " + Abnormal.updateAbnormal(heartRate_card_ids, 0));

        //获取GPS坐标映射信息
        System.out.println("调用接口 => GPS.query()");
        System.out.println("接口返回 => " + GPS.query());
        //设置GPS坐标映射关系
        System.out.println("调用接口 => GPS.set()");
        System.out.println("接口返回 => " + GPS.set(null,1,null,null));


        //查询卡的GPS历史信息
        System.out.println("调用接口 => HistoryGPS.getCardHistory()");
        System.out.println("接口返回 => " + HistoryGPS.getCardHistory(1509604624000L,null, null, null, "1,2"));
        //指定卡号查询该卡号有GPS数据的时间段
        System.out.println("调用接口 => HistoryGPS.getCardFloorDataTime()");
        System.out.println("接口返回 => " + HistoryGPS.getCardFloorDataTime(1, 1508342400L, null));


        //撤离已有GPS区域
        System.out.println("调用接口 => NowInfoGPS.evacuateAreaGPS()");
        System.out.println("接口返回 => " + NowInfoGPS.evacuateAreaGPS(new ArrayList<Integer>(){{add(1);}}));
        //撤离临时划定区域
        System.out.println("调用接口 => NowInfoGPS.evacuateTmpAreaGPS()");
        System.out.println("接口返回 => " + NowInfoGPS.evacuateTmpAreaGPS(new ArrayList<String>(){{add("-4.511389547837268,1.0357068041562343 -3.4010372082454694,1.0357068041562343 -3.4010372082454694,1.623540395704822 -4.511389547837268,1.623540395704822 -4.511389547837268,1.0357068041562343");}}));
        //获取卡的实时定位信息
        System.out.println("调用接口 => NowInfoGPS.getNowInfoGPS()");
        System.out.println("接口返回 => " + NowInfoGPS.getNowInfoGPS(1,1,10));
        //获取卡的实时定位信息
        System.out.println("调用接口 => NowInfoGPS.getAllCardNowPosGPS()");
        System.out.println("接口返回 => " + NowInfoGPS.getAllCardNowPosGPS(1));
        //根据GPS区域查询区域中的卡
        System.out.println("调用接口 => NowInfoGPS.getCardByAreaGPS()");
        System.out.println("接口返回 => " + NowInfoGPS.getCardByAreaGPS(new ArrayList<Integer>(){{add(1);}},1));
        //查询GPS区域中的卡
        System.out.println("调用接口 => NowInfoGPS.getAreaCardGPS()");
        ArrayList<Map<String,Object>> par = new ArrayList<Map<String,Object>>();
        Map area = new HashMap();
        area.put("area","-4.511389547837268,1.0357068041562343 -3.4010372082454694,1.0357068041562343 -3.4010372082454694,1.623540395704822 -4.511389547837268,1.623540395704822 -4.511389547837268,1.0357068041562343");
        par.add(area);
        System.out.println("接口返回 => " + NowInfoGPS.getAreaCardGPS(par));








        setConfig("0","1");
    }
    public static void setConfig(String old_flag, String new_flag)
    {
        String data = readToString("config.properties");
        String new_data = data.replace("return_value_flag = "+old_flag,"return_value_flag = "+new_flag);
        FileOutputStream fileOutputStream=null;
        try {
            fileOutputStream = new FileOutputStream("config.properties");
            fileOutputStream.write(new_data.getBytes("UTF-8"));
            fileOutputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static String readToString(String fileName) {
        String encoding = "UTF-8";
        File file = new File(fileName);
        Long filelength = file.length();
        byte[] filecontent = new byte[filelength.intValue()];
        try {
            FileInputStream in = new FileInputStream(file);
            in.read(filecontent);
            in.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            return new String(filecontent, encoding);
        } catch (UnsupportedEncodingException e) {
            System.err.println("The OS does not support " + encoding);
            e.printStackTrace();
            return null;
        }
    }
}
