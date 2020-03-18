package com.iotcp.system.domain;

import java.util.Objects;

/**
 * 车辆类型配置实体类
 */
public class vehicleclassifyconfigure {
    private int id;
    private String CarTypeName;
    private String CarIcon;
    private String IconColor;

    public vehicleclassifyconfigure(int id, String carTypeName, String carIcon, String iconColor) {
        this.id = id;
        CarTypeName = carTypeName;
        CarIcon = carIcon;
        IconColor = iconColor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof vehicleclassifyconfigure)) return false;
        vehicleclassifyconfigure that = (vehicleclassifyconfigure) o;
        return getId() == that.getId() &&
                getCarTypeName().equals(that.getCarTypeName()) &&
                getCarIcon().equals(that.getCarIcon()) &&
                getIconColor().equals(that.getIconColor());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getCarTypeName(), getCarIcon(), getIconColor());
    }

    @Override
    public String toString() {
        return "vehicleclassifyconfigure{" +
                "id=" + id +
                ", CarTypeName='" + CarTypeName + '\'' +
                ", CarIcon='" + CarIcon + '\'' +
                ", IconColor='" + IconColor + '\'' +
                '}';
    }

    /**
     * 无参构造
     */
    public vehicleclassifyconfigure() {

    }
}
