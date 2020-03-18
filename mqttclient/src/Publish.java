import net.sf.json.JSONObject;
import org.eclipse.paho.client.mqttv3.MqttClient;
import org.eclipse.paho.client.mqttv3.MqttConnectOptions;
import org.eclipse.paho.client.mqttv3.MqttException;
import org.eclipse.paho.client.mqttv3.MqttMessage;
import org.eclipse.paho.client.mqttv3.persist.MemoryPersistence;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Publish用户向MQTT服务端发布消息
 */
public class Publish {
    public static void main(String[] args) {

        String topic        = "/pos_business/alarm_inform";
        String content      = "";
        Map mapping = new HashMap();
        List array = new ArrayList();
        Map json = new HashMap();
        int qos             = 0;
        //MQTT服务端地址，可以修改ip和端口号，默认ip为本机，默认端口号为1883
        String broker       = "tcp://192.168.71.172:1883";
        String clientId     = "publish";
        String userName = "admin";    //非必须
        String passWord = "admin";  //非必须
        MemoryPersistence persistence = new MemoryPersistence();

        try {
            MqttClient sampleClient = new MqttClient(broker, clientId, persistence);
            MqttConnectOptions connOpts = new MqttConnectOptions();
            connOpts.setCleanSession(true);
            // 设置连接的用户名
            connOpts.setUserName(userName);
            // 设置连接的密码
            connOpts.setPassword(passWord.toCharArray());
            sampleClient.connect(connOpts);
            //进入区域越界报警
            mapping.put("out_time",0);
            mapping.put("area_id",2);
            mapping.put("uuid",0);
            mapping.put("utype",0);
            mapping.put("floor_id",1);
            mapping.put("card_id",6217);
            mapping.put("scene_id",1);
            mapping.put("time",1522217156);
            mapping.put("alarm_info","进入test");
            mapping.put("building_id",1);
            mapping.put("type",13);
            mapping.put("id",33);
            mapping.put("name",null);
            mapping.put("pos","11,3.07457450241,0.0");
            array.add(mapping);
            json.put("13",array);
            content = JSONObject.fromObject(json).toString();
            System.out.println("发布进入区域越界报警 => ");
            System.out.println(content);
            MqttMessage message = new MqttMessage(content.getBytes());
            message.setQos(qos);
            sampleClient.publish(topic, message);
            mapping = new HashMap();
            array = new ArrayList();
            json = new HashMap();


            //离开区域越界报警
            mapping.put("out_time",0);
            mapping.put("area_id",3);
            mapping.put("uuid",0);
            mapping.put("utype",0);
            mapping.put("floor_id",1);
            mapping.put("card_id",395);
            mapping.put("scene_id",1);
            mapping.put("time",1522219436);
            mapping.put("alarm_info","离开111111");
            mapping.put("building_id",1);
            mapping.put("type",14);
            mapping.put("id",94);
            mapping.put("name",null);
            mapping.put("pos","11,3.07457450241,0.0");
            array.add(mapping);
            json.put("14",array);
            content = JSONObject.fromObject(json).toString();
            System.out.println("发布离开区域越界报警 => ");
            System.out.println(content);
            message = new MqttMessage(content.getBytes());
            message.setQos(qos);
            sampleClient.publish(topic, message);
            mapping = new HashMap();
            array = new ArrayList();
            json = new HashMap();


            //危险源报警
            mapping.put("dynamic_area_id",1);
            mapping.put("out_time",0);
            mapping.put("uuid",0);
            mapping.put("utype",0);
            mapping.put("floor_id",1);
            mapping.put("card_id",6151);
            mapping.put("scene_id",1);
            mapping.put("time",1522219728);
            mapping.put("alarm_info","靠近危险");
            mapping.put("building_id",1);
            mapping.put("type",15);
            mapping.put("id",108);
            mapping.put("name",null);
            mapping.put("pos","11,3.07457450241,0.0");
            array.add(mapping);
            json.put("15",array);
            content = JSONObject.fromObject(json).toString();
            System.out.println("发布危险源报警 => ");
            System.out.println(content);
            message = new MqttMessage(content.getBytes());
            message.setQos(qos);
            sampleClient.publish(topic, message);
            mapping = new HashMap();
            array = new ArrayList();
            json = new HashMap();


            //呼叫卡号
            mapping.put("status",1);
            mapping.put("out_time",2);
            mapping.put("uuid",7);
            mapping.put("utype",1);
            mapping.put("floor_id",1);
            mapping.put("card_id",395);
            mapping.put("scene_id",1);
            mapping.put("time",1522220133);
            mapping.put("alarm_info","呼叫成功");
            mapping.put("building_id",1);
            mapping.put("type",5);
            mapping.put("id",3);
            mapping.put("name","赵六");
            mapping.put("pos","11,3.07457450241,0.0");
            array.add(mapping);
            json.put("5",array);
            content = JSONObject.fromObject(json).toString();
            System.out.println("发布呼叫卡号 => ");
            System.out.println(content);
            message = new MqttMessage(content.getBytes());
            message.setQos(qos);
            sampleClient.publish(topic, message);
            mapping = new HashMap();
            array = new ArrayList();
            json = new HashMap();


            //求救报警
            mapping.put("out_time",60);
            mapping.put("uuid",7);
            mapping.put("utype",1);
            mapping.put("floor_id",1);
            mapping.put("card_id",395);
            mapping.put("scene_id",1);
            mapping.put("time",1522220241);
            mapping.put("alarm_info","求救");
            mapping.put("building_id",1);
            mapping.put("type",6);
            mapping.put("id",4);
            mapping.put("name","赵六");
            mapping.put("pos","11,3.07457450241,0.0");
            array.add(mapping);
            json.put("6",array);
            content = JSONObject.fromObject(json).toString();
            System.out.println("发布求救报警 => ");
            System.out.println(content);
            message = new MqttMessage(content.getBytes());
            message.setQos(qos);
            sampleClient.publish(topic, message);
            mapping = new HashMap();
            array = new ArrayList();
            json = new HashMap();


            //撤离报警
            mapping.put("status",1);
            mapping.put("out_time",2);
            mapping.put("uuid",7);
            mapping.put("utype",1);
            mapping.put("floor_id",1);
            mapping.put("card_id",395);
            mapping.put("scene_id",1);
            mapping.put("time",1522220397);
            mapping.put("alarm_info","撤离成功");
            mapping.put("building_id",1);
            mapping.put("type",7);
            mapping.put("id",5);
            mapping.put("name","赵六");
            mapping.put("pos","11,3.07457450241,0.0");
            array.add(mapping);
            json.put("7",array);
            content = JSONObject.fromObject(json).toString();
            System.out.println("发布撤离报警 => ");
            System.out.println(content);
            message = new MqttMessage(content.getBytes());
            message.setQos(qos);
            sampleClient.publish(topic, message);
            mapping = new HashMap();
            array = new ArrayList();
            json = new HashMap();


            //信号消失报警
            mapping.put("alarm_info","信号消失");
            mapping.put("type",9);
            mapping.put("card_id",28790);
            mapping.put("time",1506137020);
            mapping.put("uuid",0);
            mapping.put("utype",0);
            mapping.put("id",18281);
            mapping.put("out_time",5);
            mapping.put("pos","11,3.07457450241,0.0");
            array.add(mapping);
            json.put("9",array);
            content = JSONObject.fromObject(json).toString();
            System.out.println("发布信号消失报警 => ");
            System.out.println(content);
            message = new MqttMessage(content.getBytes());
            message.setQos(qos);
            sampleClient.publish(topic, message);
            mapping = new HashMap();
            array = new ArrayList();
            json = new HashMap();


            //聚众报警
            Map center_point = new HashMap();
            center_point.put("y",3.3020000000000005);
            center_point.put("x",45.099999999999966);
            center_point.put("floor_id",2);
            center_point.put("z",11.5);
            mapping.put("center_point",center_point);
            mapping.put("area_id",5);
            List card_ids = new ArrayList();
            card_ids.add(262);
            card_ids.add(266);
            card_ids.add(252);
            card_ids.add(353);
            card_ids.add(251);
            mapping.put("card_ids",card_ids);
            mapping.put("floor_id",1);
            mapping.put("scene_id",1);
            mapping.put("time",1522221935);
            mapping.put("alarm_info","在聚众聚众5人,卡号有:262,266,252,353,251");
            mapping.put("building_id",1);
            mapping.put("type",10);
            mapping.put("id",64);
            mapping.put("pos","3.3020000000000005,45.099999999999966,11.5");
            array.add(mapping);
            json.put("10",array);
            content = JSONObject.fromObject(json).toString();
            System.out.println("发布聚众报警 => ");
            System.out.println(content);
            message = new MqttMessage(content.getBytes());
            message.setQos(qos);
            sampleClient.publish(topic, message);
            mapping = new HashMap();
            array = new ArrayList();
            json = new HashMap();


            //超时不动报警
            mapping.put("out_time",0);
            mapping.put("area_id",4);
            mapping.put("uuid",0);
            mapping.put("utype",0);
            mapping.put("floor_id",1);
            mapping.put("card_id",6671);
            mapping.put("scene_id",1);
            mapping.put("time",1522222102);
            mapping.put("alarm_info","在聚众超时不动");
            mapping.put("building_id",1);
            mapping.put("type",11);
            mapping.put("id",205);
            mapping.put("name",null);
            mapping.put("pos","11,3.07457450241,0.0");
            array.add(mapping);
            json.put("11",array);
            content = JSONObject.fromObject(json).toString();
            System.out.println("发布超时不动报警 => ");
            System.out.println(content);
            message = new MqttMessage(content.getBytes());
            message.setQos(qos);
            sampleClient.publish(topic, message);
            mapping = new HashMap();
            array = new ArrayList();
            json = new HashMap();


            //区域超时报警
            mapping.put("out_time",0);
            mapping.put("area_id",4);
            mapping.put("uuid",0);
            mapping.put("utype",0);
            mapping.put("floor_id",1);
            mapping.put("card_id",6791);
            mapping.put("scene_id",1);
            mapping.put("time",1522222210);
            mapping.put("alarm_info","在聚众超时未离开");
            mapping.put("building_id",1);
            mapping.put("type",12);
            mapping.put("id",212);
            mapping.put("name",null);
            mapping.put("pos","11,3.07457450241,0.0");
            array.add(mapping);
            json.put("12",array);
            content = JSONObject.fromObject(json).toString();
            System.out.println("发布区域超时报警 => ");
            System.out.println(content);
            message = new MqttMessage(content.getBytes());
            message.setQos(qos);
            sampleClient.publish(topic, message);
            mapping = new HashMap();
            array = new ArrayList();
            json = new HashMap();


            //欠压报警
            mapping.put("card_id",4);
            mapping.put("time",1506139084);
            mapping.put("alarm_info","欠压");
            mapping.put("type",1);
            mapping.put("uuid",0);
            mapping.put("utype",0);
            mapping.put("id",18285);
            mapping.put("out_time",5);
            array.add(mapping);
            json.put("1",array);
            content = JSONObject.fromObject(json).toString();
            System.out.println("发布欠压报警 => ");
            System.out.println(content);
            message = new MqttMessage(content.getBytes());
            message.setQos(qos);
            sampleClient.publish(topic, message);
            mapping = new HashMap();
            array = new ArrayList();
            json = new HashMap();


            //强拆报警
            mapping.put("out_time",60);
            mapping.put("uuid",0);
            mapping.put("utype",0);
            mapping.put("floor_id",1);
            mapping.put("card_id",14);
            mapping.put("scene_id",1);
            mapping.put("time",1524187927);
            mapping.put("alarm_info","强拆");
            mapping.put("building_id",14);
            mapping.put("type",4);
            mapping.put("id",11412);
            mapping.put("name",null);
            mapping.put("pos","11,3.07457450241,0.0");
            array.add(mapping);
            json.put("4",array);
            content = JSONObject.fromObject(json).toString();
            System.out.println("发布强拆报警 => ");
            System.out.println(content);
            message = new MqttMessage(content.getBytes());
            message.setQos(qos);
            sampleClient.publish(topic, message);
            mapping = new HashMap();
            array = new ArrayList();
            json = new HashMap();


            //陪同报警
            mapping.put("out_time",0);
            mapping.put("uuid",0);
            mapping.put("utype",0);
            mapping.put("floor_id",1);
            mapping.put("card_id",100);
            mapping.put("scene_id",1);
            mapping.put("time",1524627254);
            mapping.put("alarm_info","无人陪同");
            mapping.put("building_id",1);
            mapping.put("type",19);
            mapping.put("id",11416);
            mapping.put("name",null);
            mapping.put("pos","11,3.07457450241,0.0");
            array.add(mapping);
            json.put("19",array);
            content = JSONObject.fromObject(json).toString();
            System.out.println("发布陪同报警 => ");
            System.out.println(content);
            message = new MqttMessage(content.getBytes());
            message.setQos(qos);
            sampleClient.publish(topic, message);
            mapping = new HashMap();
            array = new ArrayList();
            json = new HashMap();


            //离群报警
            mapping.put("out_time",0);
            mapping.put("name",null);
            mapping.put("stray_id",1);
            mapping.put("time",1524626718);
            mapping.put("alarm_info","test有人离开");
            mapping.put("type",20);
            mapping.put("id",11414);
            mapping.put("pos","11,3.07457450241,0.0");
            array.add(mapping);
            json.put("20",array);
            content = JSONObject.fromObject(json).toString();
            System.out.println("发布离群报警 => ");
            System.out.println(content);
            message = new MqttMessage(content.getBytes());
            message.setQos(qos);
            sampleClient.publish(topic, message);
            mapping = new HashMap();
            array = new ArrayList();
            json = new HashMap();


            //跌倒报警
            mapping.put("utype",0);
            mapping.put("scene_id",1);
            mapping.put("building_id",0);
            mapping.put("card_id",1);
            mapping.put("uuid",0);
            mapping.put("name",null);
            mapping.put("floor_id",1);
            mapping.put("time",1528194465);
            mapping.put("alarm_info","test有人离开");
            mapping.put("type",21);
            mapping.put("id",11414);
            mapping.put("pos","11,3.07457450241,0.0");
            array.add(mapping);
            json.put("21",array);
            content = JSONObject.fromObject(json).toString();
            System.out.println("发布跌倒报警 => ");
            System.out.println(content);
            message = new MqttMessage(content.getBytes());
            message.setQos(qos);
            sampleClient.publish(topic, message);
            mapping = new HashMap();
            array = new ArrayList();
            json = new HashMap();


            //无卡报警
            mapping.put("out_time",5);
            mapping.put("camera_id",1);
            mapping.put("time",1539065449);
            mapping.put("alarm_info","摄像头HIKVISION DS-2DY3320IW-D4出现无卡警报");
            mapping.put("type",23);
            mapping.put("id",27);
            array.add(mapping);
            json.put("23",array);
            content = JSONObject.fromObject(json).toString();
            System.out.println("发布无卡报警 => ");
            System.out.println(content);
            message = new MqttMessage(content.getBytes());
            message.setQos(qos);
            sampleClient.publish(topic, message);
            mapping = new HashMap();
            array = new ArrayList();
            json = new HashMap();


            sampleClient.disconnect();
            System.out.println("Disconnected");
            System.exit(0);
        } catch(MqttException me) {
            System.out.println("reason "+me.getReasonCode());
            System.out.println("msg "+me.getMessage());
            System.out.println("loc "+me.getLocalizedMessage());
            System.out.println("cause "+me.getCause());
            System.out.println("excep "+me);
            me.printStackTrace();
        }
    }
}