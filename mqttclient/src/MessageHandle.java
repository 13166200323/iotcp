import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.eclipse.paho.client.mqttv3.MqttMessage;

import java.util.Iterator;

public class MessageHandle {
    public void gps_uwb_exchage_tags_handle(String topic, MqttMessage message) throws Exception {
        // subscribe后得到的消息会执行到这里面
        System.out.println("接收消息主题 : " + topic);
        System.out.println("接收消息Qos : " + message.getQos());
        System.out.println(new String(message.getPayload()));
    }

    public void del_card_gps_handle(String topic, MqttMessage message) throws Exception {
        // subscribe后得到的消息会执行到这里面
        System.out.println("接收消息主题 : " + topic);
        System.out.println("接收消息Qos : " + message.getQos());
        System.out.println(new String(message.getPayload()));
    }


    public void card_now_info_gps_handle(String topic, MqttMessage message) throws Exception {
        // subscribe后得到的消息会执行到这里面
        System.out.println("接收消息主题 : " + topic);
        System.out.println("接收消息Qos : " + message.getQos());
        String msg = new String(message.getPayload());
        JSONObject json = JSONObject.fromObject(msg);
        Iterator iterator = json.keys();
        while(iterator.hasNext()){
            String key = (String) iterator.next();
            String card_id = JSONObject.fromObject(json.getString(key)).getString("card_id");
            String card_x = JSONObject.fromObject(json.getString(key)).getString("card_x");
            String card_y = JSONObject.fromObject(json.getString(key)).getString("card_y");
            String card_z = JSONObject.fromObject(json.getString(key)).getString("card_z");
            System.out.println(card_id + "GPS定位信息坐标 x:" + card_x + " y:" + card_y + " z:" + card_z);
        }
    }



    public void card_now_forweb_handle(String topic, MqttMessage message) throws Exception {
        // subscribe后得到的消息会执行到这里面
        System.out.println("接收消息主题 : " + topic);
        System.out.println("接收消息Qos : " + message.getQos());
        String msg = new String(message.getPayload());
        JSONObject json = JSONObject.fromObject(msg);
        Iterator iterator = json.keys();
        while(iterator.hasNext()){
            String key = (String) iterator.next();
            String card_id = JSONObject.fromObject(json.getString(key)).getString("card_id");
            String card_x = JSONObject.fromObject(json.getString(key)).getString("card_x");
            String card_y = JSONObject.fromObject(json.getString(key)).getString("card_y");
            String card_z = JSONObject.fromObject(json.getString(key)).getString("card_z");
            System.out.println(card_id + "定位信息坐标 x:" + card_x + " y:" + card_y + " z:" + card_z);
        }
    }

    public void alarm_inform_handle(String topic, MqttMessage message) throws Exception {
        // subscribe后得到的消息会执行到这里面
        System.out.println("接收消息主题 : " + topic);
        System.out.println("接收消息Qos : " + message.getQos());
        String msg = new String(message.getPayload());
        JSONObject json = JSONObject.fromObject(msg);
        Iterator iterator = json.keys();
        while(iterator.hasNext()){
            String key = (String) iterator.next();
            JSONArray value = json.getJSONArray(key);
            if (key.equals("13")){
                if(value.size()>0){
                    for(int i=0;i<value.size();i++){
                        JSONObject job = value.getJSONObject(i);
                        System.out.println("卡号" + job.getString("card_id") + "进入区域id为" + job.getString("area_id") + "的区域，报警信息:" + job.getString("alarm_info"));
                    }
                }
            }else if (key.equals("14")){
                if(value.size()>0){
                    for(int i=0;i<value.size();i++){
                        JSONObject job = value.getJSONObject(i);
                        System.out.println("卡号" + job.getString("card_id") + "离开区域id为" + job.getString("area_id") + "的区域，报警信息:" + job.getString("alarm_info"));
                    }
                }
            }else if (key.equals("15")){
                if(value.size()>0){
                    for(int i=0;i<value.size();i++){
                        JSONObject job = value.getJSONObject(i);
                        System.out.println("id为" + job.getString("dynamic_area_id") + "的危险源有报警信息，报警信息:" + job.getString("alarm_info"));
                    }
                }
            }else if (key.equals("6")){
                if(value.size()>0){
                    for(int i=0;i<value.size();i++){
                        JSONObject job = value.getJSONObject(i);
                        System.out.println("卡号" + job.getString("card_id") + "发出求救，报警信息:" + job.getString("alarm_info"));
                    }
                }
            }else if (key.equals("9")){
                if(value.size()>0){
                    for(int i=0;i<value.size();i++){
                        JSONObject job = value.getJSONObject(i);
                        System.out.println("卡号" + job.getString("card_id") + "信号消失");
                    }
                }
            }else if (key.equals("10")){
                if(value.size()>0){
                    for(int i=0;i<value.size();i++){
                        JSONObject job = value.getJSONObject(i);
                        System.out.println("区域id为" + job.getString("area_id") + "的区域有聚众报警，报警信息:" + job.getString("alarm_info"));
                    }
                }
            }else if (key.equals("11")){
                if(value.size()>0){
                    for(int i=0;i<value.size();i++){
                        JSONObject job = value.getJSONObject(i);
                        System.out.println("卡号" + job.getString("card_id") + "在区域id为" + job.getString("area_id") + "的区域超时不动，报警信息:" + job.getString("alarm_info"));
                    }
                }
            }else if (key.equals("12")){
                if(value.size()>0){
                    for(int i=0;i<value.size();i++){
                        JSONObject job = value.getJSONObject(i);
                        System.out.println("卡号" + job.getString("card_id") + "在区域id为" + job.getString("area_id") + "的区域超时未离开，报警信息:" + job.getString("alarm_info"));
                    }
                }
            }else if (key.equals("1")){
                if(value.size()>0){
                    for(int i=0;i<value.size();i++){
                        JSONObject job = value.getJSONObject(i);
                        System.out.println("卡号" + job.getString("card_id") + "欠压报警，报警信息:" + job.getString("alarm_info"));
                    }
                }
            }else if (key.equals("4")){
                if(value.size()>0){
                    for(int i=0;i<value.size();i++){
                        JSONObject job = value.getJSONObject(i);
                        System.out.println("卡号" + job.getString("card_id") + "强拆报警，报警信息:" + job.getString("alarm_info"));
                    }
                }
            }else if (key.equals("19")){
                if(value.size()>0){
                    for(int i=0;i<value.size();i++){
                        JSONObject job = value.getJSONObject(i);
                        System.out.println("卡号" + job.getString("card_id") + "无人陪同，报警信息:" + job.getString("alarm_info"));
                    }
                }
            }else if (key.equals("20")){
                if(value.size()>0){
                    for(int i=0;i<value.size();i++){
                        JSONObject job = value.getJSONObject(i);
                        System.out.println("离群规则id为" + job.getString("stray_id") + "有人离群，报警信息:" + job.getString("alarm_info"));
                    }
                }
            }else if (key.equals("21")){
                if(value.size()>0){
                    for(int i=0;i<value.size();i++){
                        JSONObject job = value.getJSONObject(i);
                        System.out.println("卡号" + job.getString("card_id") + "跌倒报警");
                    }
                }
            }else if (key.equals("22")){
                if(value.size()>0){
                    for(int i=0;i<value.size();i++){
                        JSONObject job = value.getJSONObject(i);
                        System.out.println(job.getString("alarm_info"));
                    }
                }
            }else if (key.equals("23")){
                if(value.size()>0){
                    for(int i=0;i<value.size();i++){
                        JSONObject job = value.getJSONObject(i);
                        System.out.println(job.getString("alarm_info"));
                    }
                }
            }else if (key.equals("24")){
                if(value.size()>0){
                    for(int i=0;i<value.size();i++){
                        JSONObject job = value.getJSONObject(i);
                        System.out.println("卡号" + job.getString("card_id") + "心率异常，心率：" + job.getString("abnormal_heart_rate"));
                    }
                }
            }
        }
    }

    public void alarm_inform_timely_handle(String topic, MqttMessage message) throws Exception {
        // subscribe后得到的消息会执行到这里面
        System.out.println("接收消息主题 : " + topic);
        System.out.println("接收消息Qos : " + message.getQos());
        String msg = new String(message.getPayload());
        JSONObject json = JSONObject.fromObject(msg);
        Iterator iterator = json.keys();
        while(iterator.hasNext()){
            String key = (String) iterator.next();
            JSONArray value = json.getJSONArray(key);
            if (key.equals("5")){
                if(value.size()>0){
                    for(int i=0;i<value.size();i++){
                        JSONObject job = value.getJSONObject(i);
                        System.out.println("实时呼叫卡号:" + job.getString("card_id"));
                    }
                }
            }else if (key.equals("13")){
                if(value.size()>0){
                    for(int i=0;i<value.size();i++){
                        JSONObject job = value.getJSONObject(i);
                        System.out.println("实时卡号" + job.getString("card_id") + "进入区域id为" + job.getString("area_id") + "的区域，报警信息:" + job.getString("alarm_info"));
                    }
                }
            }else if (key.equals("14")){
                if(value.size()>0){
                    for(int i=0;i<value.size();i++){
                        JSONObject job = value.getJSONObject(i);
                        System.out.println("实时卡号" + job.getString("card_id") + "离开区域id为" + job.getString("area_id") + "的区域，报警信息:" + job.getString("alarm_info"));
                    }
                }
            }else if (key.equals("15")){
                if(value.size()>0){
                    for(int i=0;i<value.size();i++){
                        JSONObject job = value.getJSONObject(i);
                        System.out.println("实时id为" + job.getString("dynamic_area_id") + "的危险源有报警信息，报警信息:" + job.getString("alarm_info"));
                    }
                }
            }else if (key.equals("6")){
                if(value.size()>0){
                    for(int i=0;i<value.size();i++){
                        JSONObject job = value.getJSONObject(i);
                        System.out.println("实时卡号" + job.getString("card_id") + "发出求救，报警信息:" + job.getString("alarm_info"));
                    }
                }
            }else if (key.equals("7")){
                if(value.size()>0){
                    for(int i=0;i<value.size();i++){
                        JSONObject job = value.getJSONObject(i);
                        System.out.println("实时卡号" + job.getString("card_id") + "有撤离报警，报警信息:" + job.getString("alarm_info"));
                    }
                }
            }else if (key.equals("9")){
                if(value.size()>0){
                    for(int i=0;i<value.size();i++){
                        JSONObject job = value.getJSONObject(i);
                        System.out.println("实时卡号" + job.getString("card_id") + "信号消失");
                    }
                }
            }else if (key.equals("10")){
                if(value.size()>0){
                    for(int i=0;i<value.size();i++){
                        JSONObject job = value.getJSONObject(i);
                        System.out.println("实时区域id为" + job.getString("area_id") + "的区域有聚众报警，报警信息:" + job.getString("alarm_info"));
                    }
                }
            }else if (key.equals("11")){
                if(value.size()>0){
                    for(int i=0;i<value.size();i++){
                        JSONObject job = value.getJSONObject(i);
                        System.out.println("实时卡号" + job.getString("card_id") + "在区域id为" + job.getString("area_id") + "的区域超时不动，报警信息:" + job.getString("alarm_info"));
                    }
                }
            }else if (key.equals("12")){
                if(value.size()>0){
                    for(int i=0;i<value.size();i++){
                        JSONObject job = value.getJSONObject(i);
                        System.out.println("实时卡号" + job.getString("card_id") + "在区域id为" + job.getString("area_id") + "的区域超时未离开，报警信息:" + job.getString("alarm_info"));
                    }
                }
            }else if (key.equals("1")){
                if(value.size()>0){
                    for(int i=0;i<value.size();i++){
                        JSONObject job = value.getJSONObject(i);
                        System.out.println("实时卡号" + job.getString("card_id") + "欠压报警，报警信息:" + job.getString("alarm_info"));
                    }
                }
            }else if (key.equals("4")){
                if(value.size()>0){
                    for(int i=0;i<value.size();i++){
                        JSONObject job = value.getJSONObject(i);
                        System.out.println("实时卡号" + job.getString("card_id") + "强拆报警，报警信息:" + job.getString("alarm_info"));
                    }
                }
            }else if (key.equals("19")){
                if(value.size()>0){
                    for(int i=0;i<value.size();i++){
                        JSONObject job = value.getJSONObject(i);
                        System.out.println("实时卡号" + job.getString("card_id") + "无人陪同，报警信息:" + job.getString("alarm_info"));
                    }
                }
            }else if (key.equals("20")){
                if(value.size()>0){
                    for(int i=0;i<value.size();i++){
                        JSONObject job = value.getJSONObject(i);
                        System.out.println("实时离群规则id为" + job.getString("stray_id") + "有人离群，报警信息:" + job.getString("alarm_info"));
                    }
                }
            }else if (key.equals("21")){
                if(value.size()>0){
                    for(int i=0;i<value.size();i++){
                        JSONObject job = value.getJSONObject(i);
                        System.out.println("实时卡号" + job.getString("card_id") + "跌倒报警");
                    }
                }
            }else if (key.equals("22")){
                if(value.size()>0){
                    for(int i=0;i<value.size();i++){
                        JSONObject job = value.getJSONObject(i);
                        System.out.println("实时" + job.getString("alarm_info"));
                    }
                }
            }else if (key.equals("23")){
                if(value.size()>0){
                    for(int i=0;i<value.size();i++){
                        JSONObject job = value.getJSONObject(i);
                        System.out.println("实时" + job.getString("alarm_info"));
                    }
                }
            }
        }
    }

    public void init_area_handle(String topic, MqttMessage message) throws Exception {
        // subscribe后得到的消息会执行到这里面
        System.out.println("接收消息主题 : " + topic);
        System.out.println("接收消息Qos : " + message.getQos());
        System.out.println(new String(message.getPayload()));
    }

    public void del_card_handle(String topic, MqttMessage message) throws Exception {
        // subscribe后得到的消息会执行到这里面
        System.out.println("接收消息主题 : " + topic);
        System.out.println("接收消息Qos : " + message.getQos());
        System.out.println(new String(message.getPayload()));
    }

    public void del_3d_card_handle(String topic, MqttMessage message) throws Exception {
        // subscribe后得到的消息会执行到这里面
        System.out.println("接收消息主题 : " + topic);
        System.out.println("接收消息Qos : " + message.getQos());
        System.out.println(new String(message.getPayload()));
    }

    public void card_now_floor_num_handle(String topic, MqttMessage message) throws Exception {
        // subscribe后得到的消息会执行到这里面
        System.out.println("接收消息主题 : " + topic);
        System.out.println("接收消息Qos : " + message.getQos());
        String msg = new String(message.getPayload());
        JSONObject json = JSONObject.fromObject(msg);
        Iterator iterator = json.keys();
        while(iterator.hasNext()){
            String key = (String) iterator.next();
            String value = json.getString(key);
            System.out.println("楼层id为" + key + "的区域有" + value + "张卡");
        }
    }

    public void card_now_num_handle(String topic, MqttMessage message) throws Exception {
        // subscribe后得到的消息会执行到这里面
        System.out.println("接收消息主题 : " + topic);
        System.out.println("接收消息Qos : " + message.getQos());
        String msg = new String(message.getPayload());
        JSONObject json = JSONObject.fromObject(msg);
        Iterator iterator = json.keys();
        while(iterator.hasNext()){
            String key = (String) iterator.next();
            String value = json.getString(key);
            System.out.println("区域id为" + key + "的区域有" + value + "张卡");
        }
    }

    public void inarea_handle(String topic, MqttMessage message) throws Exception {
        // subscribe后得到的消息会执行到这里面
        System.out.println("接收消息主题 : " + topic);
        System.out.println("接收消息Qos : " + message.getQos());
        String msg = new String(message.getPayload());
        JSONArray json = JSONArray.fromObject(msg);
        if(json.size()>0){
            for(int i=0;i<json.size();i++){
                JSONObject job = json.getJSONObject(i);
                System.out.println("卡号" + job.getString("card_id") + "进入区域id为" + job.getString("area_id") + "的区域");
            }
        }
    }

    public void outarea_handle(String topic, MqttMessage message) throws Exception {
        // subscribe后得到的消息会执行到这里面
        System.out.println("接收消息主题 : " + topic);
        System.out.println("接收消息Qos : " + message.getQos());
        String msg = new String(message.getPayload());
        JSONArray json = JSONArray.fromObject(msg);
        if(json.size()>0){
            for(int i=0;i<json.size();i++){
                JSONObject job = json.getJSONObject(i);
                System.out.println("卡号" + job.getString("card_id") + "离开区域id为" + job.getString("area_id") + "的区域");
            }
        }
    }

    public void camera_alarm_handle(String topic, MqttMessage message) throws Exception {
        // subscribe后得到的消息会执行到这里面
        System.out.println("接收消息主题 : " + topic);
        System.out.println("接收消息Qos : " + message.getQos());
        String msg = new String(message.getPayload());
        JSONObject json = JSONObject.fromObject(msg);
        Iterator iterator = json.keys();
        while(iterator.hasNext()){
            String key = (String) iterator.next();
            if (key.equals("17")){
                JSONArray value = json.getJSONArray(key);
                if(value.size()>0){
                    for(int i=0;i<value.size();i++){
                        JSONObject job = value.getJSONObject(i);
                        System.out.println("设备id为" + job.getString("camera_id") + "的摄像头有报警，报警信息:" + job.getString("alarm_info"));
                    }
                }
            }
        }
    }

    public void camera_video_size_handle(String topic, MqttMessage message) throws Exception {
        // subscribe后得到的消息会执行到这里面
        System.out.println("接收消息主题 : " + topic);
        System.out.println("接收消息Qos : " + message.getQos());
        String msg = new String(message.getPayload());
        JSONObject json = JSONObject.fromObject(msg);
        Iterator iterator = json.keys();
        while(iterator.hasNext()){
            String key = (String) iterator.next();
            if (key.equals("percent")){
                String value = json.getString(key);
                System.out.println("磁盘已占用" + value);
            }
        }
    }
    public void area_attributes_change_handle(String topic, MqttMessage message) throws Exception {
        // subscribe后得到的消息会执行到这里面
        System.out.println("接收消息主题 : " + topic);
        System.out.println("接收消息Qos : " + message.getQos());
        String msg = new String(message.getPayload());
        JSONArray json_arr = JSONArray.fromObject(msg);
        JSONObject json = JSONObject.fromObject(json_arr.get(0));
        Iterator iterator = json.keys();
        while(iterator.hasNext()){
            String key = (String) iterator.next();
            if (key.equals("add")){
                String value = json.getString(key);
                System.out.println("收到新增区域的消息，新增区域id:" + value);
            }else if (key.equals("del")){
                String value = json.getString(key);
                System.out.println("收到删除区域的消息，删除区域id:" + value);
            }else if (key.equals("update")){
                String value = json.getString(key);
                System.out.println("收到修改区域的消息，修改区域id:" + value);
            }
        }
    }

    public void now_area_card_handle(String topic, MqttMessage message) throws Exception {
        // subscribe后得到的消息会执行到这里面
        System.out.println("接收消息主题 : " + topic);
        System.out.println("接收消息Qos : " + message.getQos());
        String msg = new String(message.getPayload());
        JSONObject json = JSONObject.fromObject(msg);
        Iterator iterator = json.keys();
        while(iterator.hasNext()) {
            String key = (String) iterator.next();
            JSONArray value = json.getJSONArray(key);
            System.out.println("区域id:" + key + "中有卡号" + value.toString());
        }
    }
}
