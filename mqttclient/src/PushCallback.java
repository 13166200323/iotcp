import org.eclipse.paho.client.mqttv3.IMqttDeliveryToken;
import org.eclipse.paho.client.mqttv3.MqttCallback;
import org.eclipse.paho.client.mqttv3.MqttMessage;

public class PushCallback implements MqttCallback {
//    public PushCallback() {}
    Subscribe service;
    public PushCallback(Subscribe service) {
        this.service = service;
    }
    @Override
    public void connectionLost(Throwable cause) {
        // 连接丢失后，一般在这里面进行重连
        System.out.println("连接断开，可以做重连");
        System.out.println(cause);

        while (true){
            try {//如果没有发生异常说明连接成功，如果发生异常，则死循环
                Thread.sleep(1000);
                service.connect(200);
                break;
            }catch (Exception e){
                continue;
            }
        }
    }
    @Override
    public void deliveryComplete(IMqttDeliveryToken token) {
        System.out.println("完成认证" + token.isComplete());
    }
    @Override
    public void messageArrived(String topic, MqttMessage message) throws Exception {
        // subscribe后得到的消息会执行到这里面
        MessageHandle handle = new MessageHandle();
        if (topic.contains("/pos_business/card_now_forweb/"))
            handle.card_now_forweb_handle(topic,message);
        else if (topic.equals("/pos_business/alarm_inform"))
            handle.alarm_inform_handle(topic,message);
        else if (topic.equals("/think_php/init_area"))
            handle.init_area_handle(topic,message);
        else if (topic.equals("/pos_business/del_card"))
            handle.del_card_handle(topic,message);
        else if (topic.equals("/pos_business/del_3d_card"))
            handle.del_3d_card_handle(topic,message);
        else if (topic.equals("/pos_business/card_now_floor_num"))
            handle.card_now_floor_num_handle(topic,message);
        else if (topic.equals("/pos_business/card_now_num"))
            handle.card_now_num_handle(topic,message);
        else if (topic.equals("/pos_business/inarea"))
            handle.inarea_handle(topic,message);
        else if (topic.equals("/pos_business/outarea"))
            handle.outarea_handle(topic,message);
        else if (topic.equals("/pos_business/camera_alarm"))
            handle.camera_alarm_handle(topic,message);
        else if (topic.equals("/pos_business/camera_video_size"))
            handle.camera_video_size_handle(topic,message);
        else if (topic.equals("/think_php/area_attributes_change"))
            handle.area_attributes_change_handle(topic,message);
        else if (topic.equals("/pos_business/alarm_inform_timely"))
            handle.alarm_inform_timely_handle(topic,message);
        else if (topic.equals("/pos_business/now_area_card"))
            handle.now_area_card_handle(topic,message);
        else if (topic.contains("/pos_business/card_now_info_gps/"))
            handle.card_now_info_gps_handle(topic,message);
        else if (topic.equals("/pos_business/del_card_gps"))
            handle.del_card_gps_handle(topic,message);
        else if (topic.contains("/GPSAndUWBExchageTags/"))
            handle.gps_uwb_exchage_tags_handle(topic,message);
    }
}