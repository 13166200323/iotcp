package com.iotcp.system.domain;

import java.util.Objects;

public class vehicleReport {
    private String countNumber;
    private String vehiclecType;
    private String vehicleInOut;

    public vehicleReport(String countNumber, String vehiclecType, String vehicleInOut) {
        this.countNumber = countNumber;
        this.vehiclecType = vehiclecType;
        this.vehicleInOut = vehicleInOut;
    }

    public String getCountNumber() {
        return countNumber;
    }

    public void setCountNumber(String countNumber) {
        this.countNumber = countNumber;
    }

    public String getVehiclecType() {
        return vehiclecType;
    }

    public void setVehiclecType(String vehiclecType) {
        this.vehiclecType = vehiclecType;
    }

    public String getVehicleInOut() {
        return vehicleInOut;
    }

    public void setVehicleInOut(String vehicleInOut) {
        this.vehicleInOut = vehicleInOut;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof vehicleReport)) return false;
        vehicleReport that = (vehicleReport) o;
        return getCountNumber().equals(that.getCountNumber()) &&
                getVehiclecType().equals(that.getVehiclecType()) &&
                getVehicleInOut().equals(that.getVehicleInOut());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCountNumber(), getVehiclecType(), getVehicleInOut());
    }

    @Override
    public String toString() {
        return "vehicleReport{" +
                "countNumber='" + countNumber + '\'' +
                ", vehiclecType='" + vehiclecType + '\'' +
                ", vehicleInOut='" + vehicleInOut + '\'' +
                '}';
    }

    public vehicleReport() {

    }
}
