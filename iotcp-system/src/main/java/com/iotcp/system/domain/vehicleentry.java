package com.iotcp.system.domain;

import com.iotcp.common.base.BaseEntity;

/**
 * 入场实体
 */
public class vehicleentry extends BaseEntity {
    private int id;
    private String vehicleType;
    private String vehicleOwner;
    private String parkingLot;
    private String licensePlate;
    private String accessTunnel;
    private String begruchangTime;
    private String endruchangTime;
    private String operator;
    private String operationTime;
    private String operationType;
    private String vehicleImg;
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

    public String getParkingLot() {
        return parkingLot;
    }

    public void setParkingLot(String parkingLot) {
        this.parkingLot = parkingLot;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public String getAccessTunnel() {
        return accessTunnel;
    }

    public void setAccessTunnel(String accessTunnel) {
        this.accessTunnel = accessTunnel;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public String getOperationTime() {
        return operationTime;
    }

    public void setOperationTime(String operationTime) {
        this.operationTime = operationTime;
    }

    public String getOperationType() {
        return operationType;
    }

    public void setOperationType(String operationType) {
        this.operationType = operationType;
    }

    public String getVehicleImg() {
        return vehicleImg;
    }

    public void setVehicleImg(String vehicleImg) {
        this.vehicleImg = vehicleImg;
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

    @Override
    public String toString() {
        return "vehicleentry{" +
                "id=" + id +
                ", vehicleType='" + vehicleType + '\'' +
                ", vehicleOwner='" + vehicleOwner + '\'' +
                ", parkingLot='" + parkingLot + '\'' +
                ", licensePlate='" + licensePlate + '\'' +
                ", accessTunnel='" + accessTunnel + '\'' +
                ", begruchangTime='" + begruchangTime + '\'' +
                ", endruchangTime='" + endruchangTime + '\'' +
                ", operator='" + operator + '\'' +
                ", operationTime='" + operationTime + '\'' +
                ", operationType='" + operationType + '\'' +
                ", vehicleImg='" + vehicleImg + '\'' +
                '}';
    }
}
