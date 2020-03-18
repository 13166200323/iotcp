package com.iotcp.system.domain;

import com.iotcp.common.base.BaseEntity;

/**
 * 出场实体
 */
public class vehicleexport extends BaseEntity {
    private int id;
    private String vehicleType;
    private String vehicleOwner;
    private String vehicleGroup;
    private String rlicensePlate;
    private String accessTunnel;
    private String ruchangTime;
    private String operator;
    private String clicensePlate;
    private String exitChannel;
    private String begexitTime;
    private String endexitTime;
    private String exitOperator;
    private String releaseMode;
    private String releaseNotes;
    private String exitImg;
    private String enterImg;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getVehicleOwner() {
        return vehicleOwner;
    }

    public void setVehicleOwner(String vehicleOwner) {
        this.vehicleOwner = vehicleOwner;
    }

    public String getVehicleGroup() {
        return vehicleGroup;
    }

    public void setVehicleGroup(String vehicleGroup) {
        this.vehicleGroup = vehicleGroup;
    }

    public String getRlicensePlate() {
        return rlicensePlate;
    }

    public void setRlicensePlate(String rlicensePlate) {
        this.rlicensePlate = rlicensePlate;
    }

    public String getAccessTunnel() {
        return accessTunnel;
    }

    public void setAccessTunnel(String accessTunnel) {
        this.accessTunnel = accessTunnel;
    }

    public String getRuchangTime() {
        return ruchangTime;
    }

    public void setRuchangTime(String ruchangTime) {
        this.ruchangTime = ruchangTime;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public String getClicensePlate() {
        return clicensePlate;
    }

    public void setClicensePlate(String clicensePlate) {
        this.clicensePlate = clicensePlate;
    }

    public String getExitChannel() {
        return exitChannel;
    }

    public void setExitChannel(String exitChannel) {
        this.exitChannel = exitChannel;
    }



    public String getExitOperator() {
        return exitOperator;
    }

    public void setExitOperator(String exitOperator) {
        this.exitOperator = exitOperator;
    }

    public String getReleaseMode() {
        return releaseMode;
    }

    public void setReleaseMode(String releaseMode) {
        this.releaseMode = releaseMode;
    }

    public String getReleaseNotes() {
        return releaseNotes;
    }

    public void setReleaseNotes(String releaseNotes) {
        this.releaseNotes = releaseNotes;
    }

    public String getExitImg() {
        return exitImg;
    }

    public void setExitImg(String exitImg) {
        this.exitImg = exitImg;
    }



    public String getEnterImg() {
        return enterImg;
    }

    public void setEnterImg(String enterImg) {
        this.enterImg = enterImg;
    }

    public String getBegexitTime() {
        return begexitTime;
    }

    public void setBegexitTime(String begexitTime) {
        this.begexitTime = begexitTime;
    }

    public String getEndexitTime() {
        return endexitTime;
    }

    public void setEndexitTime(String endexitTime) {
        this.endexitTime = endexitTime;
    }

    @Override
    public String toString() {
        return "vehicleexport{" +
                "id=" + id +
                ", vehicleType='" + vehicleType + '\'' +
                ", vehicleOwner='" + vehicleOwner + '\'' +
                ", vehicleGroup='" + vehicleGroup + '\'' +
                ", rlicensePlate='" + rlicensePlate + '\'' +
                ", accessTunnel='" + accessTunnel + '\'' +
                ", ruchangTime='" + ruchangTime + '\'' +
                ", operator='" + operator + '\'' +
                ", clicensePlate='" + clicensePlate + '\'' +
                ", exitChannel='" + exitChannel + '\'' +
                ", begexitTime='" + begexitTime + '\'' +
                ", endexitTime='" + endexitTime + '\'' +
                ", exitOperator='" + exitOperator + '\'' +
                ", releaseMode='" + releaseMode + '\'' +
                ", releaseNotes='" + releaseNotes + '\'' +
                ", exitImg='" + exitImg + '\'' +
                ", enterImg='" + enterImg + '\'' +
                '}';
    }
}