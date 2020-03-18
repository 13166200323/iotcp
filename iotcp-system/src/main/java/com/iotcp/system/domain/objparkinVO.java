package com.iotcp.system.domain;

import java.util.Objects;

public class objparkinVO {
    private String CarTypeName; //车牌类型名称
    private String begruchangTime; //开始时间
    private String endruchangTime; //结束时间
    private String InCarNum; //入场车牌号码
    private String InChannelName; //入场通道名称

    public objparkinVO(String carTypeName, String begruchangTime, String endruchangTime, String inCarNum, String inChannelName) {
        CarTypeName = carTypeName;
        this.begruchangTime = begruchangTime;
        this.endruchangTime = endruchangTime;
        InCarNum = inCarNum;
        InChannelName = inChannelName;
    }

    public String getCarTypeName() {
        return CarTypeName;
    }

    public void setCarTypeName(String carTypeName) {
        CarTypeName = carTypeName;
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

    @Override
    public String toString() {
        return "objparkinVO{" +
                "CarTypeName='" + CarTypeName + '\'' +
                ", begruchangTime='" + begruchangTime + '\'' +
                ", endruchangTime='" + endruchangTime + '\'' +
                ", InCarNum='" + InCarNum + '\'' +
                ", InChannelName='" + InChannelName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof objparkinVO)) return false;
        objparkinVO that = (objparkinVO) o;
        return getCarTypeName().equals(that.getCarTypeName()) &&
                getBegruchangTime().equals(that.getBegruchangTime()) &&
                getEndruchangTime().equals(that.getEndruchangTime()) &&
                getInCarNum().equals(that.getInCarNum()) &&
                getInChannelName().equals(that.getInChannelName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCarTypeName(), getBegruchangTime(), getEndruchangTime(), getInCarNum(), getInChannelName());
    }

    public objparkinVO() {
        super();
    }
}
