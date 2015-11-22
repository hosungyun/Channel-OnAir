package com.example.kt.cha_on.domain;

/**
 * Created by kt on 2015-11-22.
 */
public class User {
    private String userId;
    private String userName;
    private String preferenceChannel;
    private String ipTv;

    public User(){}

    public User(String userId,String userName, String preferenceChannel , String ipTv){

        this.userId = userId;
        this.userName= userName;
        this.preferenceChannel = preferenceChannel;
        this.ipTv = ipTv;

    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPreferenceChannel() {
        return preferenceChannel;
    }

    public void setPreferenceChannel(String preferenceChannel) {
        this.preferenceChannel = preferenceChannel;
    }

    public String getIpTv() {
        return ipTv;
    }

    public void setIpTv(String ipTv) {
        this.ipTv = ipTv;
    }
}

