import org.eclipse.paho.client.mqttv3.MqttClient;
import org.eclipse.paho.client.mqttv3.MqttConnectOptions;
import org.eclipse.paho.client.mqttv3.MqttException;
import org.eclipse.paho.client.mqttv3.persist.MemoryPersistence;

import java.net.InetAddress;
import java.util.concurrent.ScheduledExecutorService;

/**
 * Subscribe用于订阅MQTT服务端 获取消息
 */
public class Subscribe {
    //MQTT服务端地址，可以修改ip和端口号，默认ip为本机，默认端口号为1884
    public static final String HOST = "tcp://192.168.71.172:1884";
    public static final String card_now_forweb_topic = "/pos_business/card_now_forweb/#";
    public static final String alarm_inform_topic = "/pos_business/alarm_inform";
    public static final String init_area_topic = "/think_php/init_area";
    public static final String del_card_topic = "/pos_business/del_card";
    public static final String del_3d_card_topic = "/pos_business/del_3d_card";
    public static final String card_now_floor_num_topic = "/pos_business/card_now_floor_num";
    public static final String card_now_num_topic = "/pos_business/card_now_num";
    public static final String inarea_topic = "/pos_business/inarea";
    public static final String outarea_topic = "/pos_business/outarea";
    public static final String camera_alarm_topic = "/pos_business/camera_alarm";
    public static final String camera_video_size_topic = "/pos_business/camera_video_size";
    public static final String area_attributes_change_topic = "/think_php/area_attributes_change";
    public static final String alarm_inform_timely_topic = "/pos_business/alarm_inform_timely";
    public static final String now_area_card_topic = "/pos_business/now_area_card";
    public static final String card_now_forweb_gps_topic = "/pos_business/card_now_info_gps/#";
    public static final String card_del_gps_topic = "/pos_business/del_card_gps";
    public static final String gps_uwb_exchage_tags_topic = "/GPSAndUWBExchageTags/#";


    private static final String clientid = "mqttclient-java-";
    private MqttClient client;
    private MqttConnectOptions options;
    private String userName = "admin";    //非必须
    private String passWord = "admin";  //非必须
    @SuppressWarnings("unused")
    private ScheduledExecutorService scheduler;

    public void start() throws MqttException{
            if (client == null){
                try{
                    InetAddress addr = InetAddress.getLocalHost();
                    String ip=addr.getHostAddress().toString(); //获取本机ip
                    String hostName=addr.getHostName().toString(); //获取本机计算机名称
                    // host为主机名，clientid即连接MQTT的客户端ID，一般以唯一标识符表示，MemoryPersistence设置clientid的保存形式，默认为以内存保存
                    client = new MqttClient(HOST, clientid+ip+hostName+System.currentTimeMillis(), new MemoryPersistence());
                    // 设置回调
                    client.setCallback(new PushCallback(Subscribe.this));
                }catch(Exception e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }

            // MQTT的连接设置
            options = new MqttConnectOptions();
            // 设置是否清空session,这里如果设置为false表示服务器会保留客户端的连接记录，设置为true表示每次连接到服务器都以新的身份连接
            options.setCleanSession(false);
            // 设置连接的用户名
            options.setUserName(userName);
            // 设置连接的密码
            options.setPassword(passWord.toCharArray());
            // 设置超时时间 单位为秒
            options.setConnectionTimeout(10);
            // 设置会话心跳时间 单位为秒 服务器会每隔1.5*20秒的时间向客户端发送个消息判断客户端是否在线，但这个方法并没有重连的机制
            options.setKeepAliveInterval(20);


            if (!client.isConnected()) {
                client.connect(options);
                System.out.println("连接成功");
            }else {//这里的逻辑是如果连接成功就重新连接
                client.disconnect();
                client.connect(options);
                System.out.println("连接成功");
            }

            //订阅消息
            int[] Qos  = {1,1,1,2,1,1,1,1,1,1,1,1,1,1,1,1,1};
            String[] topics = {gps_uwb_exchage_tags_topic,card_del_gps_topic,card_now_forweb_gps_topic,card_now_forweb_topic,alarm_inform_topic,init_area_topic,del_card_topic,del_3d_card_topic,card_now_floor_num_topic,card_now_num_topic,inarea_topic,outarea_topic,camera_alarm_topic,camera_video_size_topic,area_attributes_change_topic,alarm_inform_timely_topic,now_area_card_topic};
            client.subscribe(topics, Qos);
    }
    public void connect(int num) throws MqttException{
        try {
            for (int i = 0; i < num; i++) {
                try {
                    start();
                } catch (Exception e) {
                    e.printStackTrace();
                    Thread.sleep(5000);
                    System.err.println("连接失败,正在第"+i+"次尝试");
                    continue;
                }
                return;
            }
            throw new RuntimeException("无法连接服务器");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws MqttException {
        Subscribe client = new Subscribe();
        client.connect(10);
    }
}