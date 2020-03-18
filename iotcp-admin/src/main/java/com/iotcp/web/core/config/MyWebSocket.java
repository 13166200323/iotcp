package com.iotcp.web.core.config;

import com.iotcp.web.core.testPOJO.User;
import org.springframework.stereotype.Component;

import javax.websocket.*;
import javax.websocket.server.ServerEndpoint;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@Component
@ServerEndpoint(value = "/websocket")
public class MyWebSocket {
    /***
     * 参考博客：https://blog.csdn.net/u010674346/article/details/79281163
     */
    // 静态变量，用来记录在线人数。
    private static int onlineCount = 0;
    // 与某个客户端的连接会话，需要通过它来给客户端发送数据
    private Session session;

    // concurrent包的线程安全Set，用来存放每个客户端对应的MyWebSocket对象。
    // private static CopyOnWriteArraySet<MyWebSocket> webSocketSet = new CopyOnWriteArraySet<MyWebSocket>();
    // websocket不能通过注解注入一个对象
    /*
     * ApplicationContext ac = new
     * ClassPathXmlApplicationContext("spring/spring-mybatis.xml"); ThscinterImpl
     * thscinterImpl = (ThscinterImpl)ac.getBean("ThscinterImpl");
     */

    /**
     * 连接建立成功调用的方法
     *
     * @param session
     *            可选的参数。session为与某个客户端的连接会话，需要通过它来给客户端发送数据
     * @throws Exception
     */
    @OnOpen
    public void onOpen(Session session) throws Exception {
        addOnlineCount();
        System.out.println("有连接接入，当前连接数：" + getOnlineCount());
        this.session = session;
        WebSocketMapUtil.put(session.getQueryString(), this);

    }
    /**
     * 连接关闭调用的方法
     *
     * @throws Exception
     */
    @OnClose
    public void onClose() throws Exception {
        subOnlineCount();
        System.out.println("有连接断开，当前连接数：" + getOnlineCount());
        // 从map中删除
        WebSocketMapUtil.remove(session.getQueryString());
        map.remove(WebSocketMapUtil.get(session.getQueryString()));
    }
    /**
     * 收到客户端消息后调用的方法
     *
     * @param message
     *            客户端发送过来的消息
     * @param session
     *            可选的参数
     * @throws IOException
     */
    //像前端推送数据
    //是否可以进入定时器的标志
    private static Map<MyWebSocket, User> map=new HashMap<MyWebSocket, User>();
    @OnMessage
    public void onMessage(String message, Session session) throws IOException {
//        boolean flag=true;
//        ScheduledExecutorService service=null;
//        //ThscinterService  thscinterImpl=(ThscinterService) ContextLoader.getCurrentWebApplicationContext().getBean("thscinterService");
//        MyWebSocket myWebSocket = ((MyWebSocket) WebSocketMapUtil.get(session.getQueryString()));
//        if(map.get(myWebSocket)!=null) {
//            if(!message.equals(map.get(myWebSocket).getMessage())) {
//                flag=true;
//                service=map.get(myWebSocket).getService();
//                service.shutdown();
//                map.put(myWebSocket, new Scheduledto(service,message,myWebSocket,message));
//            }else {
//                flag=false;
//            }
//        }else {
//            flag=true;
//            map.put(myWebSocket, new Scheduledto(Executors.newSingleThreadScheduledExecutor(),message,myWebSocket,message));
//            service=map.get(myWebSocket).getService();
//        }
//        // 第二个参数为首次执行的延时时间，第三个参数为定时执行的间隔时间
//        // 第一次执行间隔为10毫秒，随后2000毫秒执行循环
//        if(flag) {
//            // 定时器
//            service.scheduleAtFixedRate(map.get(myWebSocket).getRunnable(), 10, 2000, TimeUnit.MILLISECONDS);
//            flag=false;
//        }
    }

    /**
     * 发生错误时调用
     *
     * @param session
     * @param error
     */
    @OnError
    public void onError(Session session, Throwable error) {
        System.out.println("onError:::id=" + session.getId() + "的用户,连接出错,原因:" + error);
        WebSocketMapUtil.remove(session.getQueryString());
        map.remove(WebSocketMapUtil.get(session.getQueryString()));
    }

    /**
     * 发送消息方法。
     *
     * @param message
     * @throws IOException
     */
    public void sendMessage(String message) throws IOException {
        this.session.getBasicRemote().sendText(message);
    }

    /**
     * 群发消息方法。
     *
     * @param message
     * @throws IOException
     */
    public void sendMessageAll(String message) throws IOException {
        System.out.println("sendMessageAll+++++++");
        for (MyWebSocket myWebSocket : WebSocketMapUtil.getValues()) {
            myWebSocket.sendMessage(message);
        }
    }

    // 返回连接总数
    public static synchronized int getOnlineCount() {
        return onlineCount;
    }

    // 用户量加一
    public static synchronized void addOnlineCount() {
        MyWebSocket.onlineCount++;
    }

    // 用户量减一
    public static synchronized void subOnlineCount() {
        MyWebSocket.onlineCount--;
    }
}
