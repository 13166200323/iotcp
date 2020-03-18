package com.iotcp.system.domain;

import java.util.Objects;

/**
 *车辆配置实体类
 */
public class vehicleconfigure {
    private int id;
    private String licensePlate;
    private String licensePlateImg;
    private String WhetherLiftingRod;
    private String effectiveTime;
    private String vehicleUser;
    private String userPhone;
    private String vehiceleType;

    public vehicleconfigure(int id, String licensePlate, String licensePlateImg, String whetherLiftingRod, String effectiveTime, String vehicleUser, String userPhone, String vehiceleType) {
        this.id = id;
        this.licensePlate = licensePlate;
        this.licensePlateImg = licensePlateImg;
        WhetherLiftingRod = whetherLiftingRod;
        this.effectiveTime = effectiveTime;
        this.vehicleUser = vehicleUser;
        this.userPhone = userPhone;
        this.vehiceleType = vehiceleType;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public String getLicensePlateImg() {
        return licensePlateImg;
    }

    public void setLicensePlateImg(String licensePlateImg) {
        this.licensePlateImg = licensePlateImg;
    }

    public String getWhetherLiftingRod() {
        return WhetherLiftingRod;
    }

    public void setWhetherLiftingRod(String whetherLiftingRod) {
        WhetherLiftingRod = whetherLiftingRod;
    }

    public String getEffectiveTime() {
        return effectiveTime;
    }

    public void setEffectiveTime(String effectiveTime) {
        this.effectiveTime = effectiveTime;
    }

    public String getVehicleUser() {
        return vehicleUser;
    }

    public void setVehicleUser(String vehicleUser) {
        this.vehicleUser = vehicleUser;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public String getVehiceleType() {
        return vehiceleType;
    }

    public void setVehiceleType(String vehiceleType) {
        this.vehiceleType = vehiceleType;
    }

    @Override
    public String toString() {
        return "vehicleconfigure{" +
                "id=" + id +
                ", licensePlate='" + licensePlate + '\'' +
                ", licensePlateImg='" + licensePlateImg + '\'' +
                ", WhetherLiftingRod='" + WhetherLiftingRod + '\'' +
                ", effectiveTime='" + effectiveTime + '\'' +
                ", vehicleUser='" + vehicleUser + '\'' +
                ", userPhone='" + userPhone + '\'' +
                ", vehiceleType=" + vehiceleType +
                '}';
    }

    public vehicleconfigure() {
        super();
    }
}
