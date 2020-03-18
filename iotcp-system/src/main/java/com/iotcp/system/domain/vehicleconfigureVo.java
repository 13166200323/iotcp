package com.iotcp.system.domain;

import java.util.Objects;

public class vehicleconfigureVo {
    private int id;
    private String licensePlate;
    private String licensePlateImg;
    private String WhetherLiftingRod;
    private String effectiveTime;
    private String vehicleUser;
    private String userPhone;
    private int vehiceleType;
    private String CarTypeName;
    private String CarIcon;
    private String IconColor;
    private String endTime;
    private String begTime;

    public vehicleconfigureVo(int id, String licensePlate, String licensePlateImg, String whetherLiftingRod, String effectiveTime, String vehicleUser, String userPhone, int vehiceleType, String carTypeName, String carIcon, String iconColor, String endTime, String begTime) {
        this.id = id;
        this.licensePlate = licensePlate;
        this.licensePlateImg = licensePlateImg;
        WhetherLiftingRod = whetherLiftingRod;
        this.effectiveTime = effectiveTime;
        this.vehicleUser = vehicleUser;
        this.userPhone = userPhone;
        this.vehiceleType = vehiceleType;
        CarTypeName = carTypeName;
        CarIcon = carIcon;
        IconColor = iconColor;
        this.endTime = endTime;
        this.begTime = begTime;
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

    public int getVehiceleType() {
        return vehiceleType;
    }

    public void setVehiceleType(int vehiceleType) {
        this.vehiceleType = vehiceleType;
    }

    public String getCarTypeName() {
        return CarTypeName;
    }

    public void setCarTypeName(String carTypeName) {
        CarTypeName = carTypeName;
    }

    public String getCarIcon() {
        return CarIcon;
    }

    public void setCarIcon(String carIcon) {
        CarIcon = carIcon;
    }

    public String getIconColor() {
        return IconColor;
    }

    public void setIconColor(String iconColor) {
        IconColor = iconColor;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getBegTime() {
        return begTime;
    }

    public void setBegTime(String begTime) {
        this.begTime = begTime;
    }

    @Override
    public String toString() {
        return "vehicleconfigureVo{" +
                "id=" + id +
                ", licensePlate='" + licensePlate + '\'' +
                ", licensePlateImg='" + licensePlateImg + '\'' +
                ", WhetherLiftingRod='" + WhetherLiftingRod + '\'' +
                ", effectiveTime='" + effectiveTime + '\'' +
                ", vehicleUser='" + vehicleUser + '\'' +
                ", userPhone='" + userPhone + '\'' +
                ", vehiceleType=" + vehiceleType +
                ", CarTypeName='" + CarTypeName + '\'' +
                ", CarIcon='" + CarIcon + '\'' +
                ", IconColor='" + IconColor + '\'' +
                ", endTime='" + endTime + '\'' +
                ", begTime='" + begTime + '\'' +
                '}';
    }

    public vehicleconfigureVo() {
        super();
    }
}
