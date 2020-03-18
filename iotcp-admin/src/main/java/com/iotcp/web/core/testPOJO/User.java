package com.iotcp.web.core.testPOJO;

public class User {

    private String id;
    private String username;
    private String password;
    private String Rediskey;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRediskey() {
        return Rediskey;
    }

    public void setRediskey(String rediskey) {
        Rediskey = rediskey;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
