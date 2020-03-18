package com.iotcp.system.domain;

import java.util.Objects;

public class objparkOutVO {
    private String begruchangTime; //开始时间
    private String endruchangTime; //结束时间
    private String CarTypeName; //车牌类型名称
    private String InCarNum; //入场车牌号码
    private String InChannelName;//入场通道名称
    private String OutCarNum; //出场车牌号码
    private String OutChannelName;//出场通道名称

    public objparkOutVO(String begruchangTime, String endruchangTime, String carTypeName, String inCarNum, String inChannelName, String outCarNum, String outChannelName) {
        this.begruchangTime = begruchangTime;
        this.endruchangTime = endruchangTime;
        CarTypeName = carTypeName;
        InCarNum = inCarNum;
        InChannelName = inChannelName;
        OutCarNum = outCarNum;
        OutChannelName = outChannelName;
    }

    public String getBegruchangTime() {
        return begruchangTime;
    }

    public void setBegruchangTime(String begruchangTime) {
        this.begruchangTime = begruchangTime;
    }

    public String getEndruchangTime() {
        return endruchangTime;
    }

    public void setEndruchangTime(String endruchangTime) {
        this.endruchangTime = endruchangTime;
    }

    public String getCarTypeName() {
        return CarTypeName;
    }

    public void setCarTypeName(String carTypeName) {
        CarTypeName = carTypeName;
    }

    public String getInCarNum() {
        return InCarNum;
    }

    public void setInCarNum(String inCarNum) {
        InCarNum = inCarNum;
    }

    public String getInChannelName() {
        return InChannelName;
    }

    public void setInChannelName(String inChannelName) {
        InChannelName = inChannelName;
    }

    public String getOutCarNum() {
        return OutCarNum;
    }

    public void setOutCarNum(String outCarNum) {
        OutCarNum = outCarNum;
    }

    public String getOutChannelName() {
        return OutChannelName;
    }

    public void setOutChannelName(String outChannelName) {
        OutChannelName = outChannelName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof objparkOutVO)) return false;
        objparkOutVO that = (objparkOutVO) o;
        return getBegruchangTime().equals(that.getBegruchangTime()) &&
                getEndruchangTime().equals(that.getEndruchangTime()) &&
                getCarTypeName().equals(that.getCarTypeName()) &&
                getInCarNum().equals(that.getInCarNum()) &&
                getInChannelName().equals(that.getInChannelName()) &&
                getOutCarNum().equals(that.getOutCarNum()) &&
                getOutChannelName().equals(that.getOutChannelName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getBegruchangTime(), getEndruchangTime(), getCarTypeName(), getInCarNum(), getInChannelName(), getOutCarNum(), getOutChannelName());
    }

    @Override
    public String toString() {
        return "objparkOutVO{" +
                "begruchangTime='" + begruchangTime + '\'' +
                ", endruchangTime='" + endruchangTime + '\'' +
                ", CarTypeName='" + CarTypeName + '\'' +
                ", InCarNum='" + InCarNum + '\'' +
                ", InChannelName='" + InChannelName + '\'' +
                ", OutCarNum='" + OutCarNum + '\'' +
                ", OutChannelName='" + OutChannelName + '\'' +
                '}';
    }

    public objparkOutVO() {
    }
}
