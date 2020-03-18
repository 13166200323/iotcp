package com.iotcp.system.domain;

/**
 * 车辆入场实体类
 */
public class objparkinHistory {
    private int ID;
    private String Region;
    private String InuuID;
    private int CarTypeCode;
    private String CarTypeName;
    private String CarOwner;
    private int CarGroupID;
    private String CarGroup;
    private int CarGroupOver;
    private String InVirtualCardNum;
    private String InCarNum;
    private int InChannelID;
    private String InChannelName;
    private int InType;
    private String InPicMac;
    private String InPic;
    private String InPicMin;
    private String InCarNumColor;
    private int InBookID;
    private double InBookMoney;
    private String InTime;
    private String InOperator;
    private String  InOperationTime;
    private String InOperationType;
    private int  InAccepted;
    private String InRemark;
    private String ContralID;
    private String IsDiscount;
    private String TimeInHistory;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getRegion() {
        return Region;
    }

    public void setRegion(String region) {
        Region = region;
    }

    public String getInuuID() {
        return InuuID;
    }

    public void setInuuID(String inuuID) {
        InuuID = inuuID;
    }

    public int getCarTypeCode() {
        return CarTypeCode;
    }

    public void setCarTypeCode(int carTypeCode) {
        CarTypeCode = carTypeCode;
    }

    public String getCarTypeName() {
        return CarTypeName;
    }

    public void setCarTypeName(String carTypeName) {
        CarTypeName = carTypeName;
    }

    public String getCarOwner() {
        return CarOwner;
    }

    public void setCarOwner(String carOwner) {
        CarOwner = carOwner;
    }

    public int getCarGroupID() {
        return CarGroupID;
    }

    public void setCarGroupID(int carGroupID) {
        CarGroupID = carGroupID;
    }

    public String getCarGroup() {
        return CarGroup;
    }

    public void setCarGroup(String carGroup) {
        CarGroup = carGroup;
    }

    public int getCarGroupOver() {
        return CarGroupOver;
    }

    public void setCarGroupOver(int carGroupOver) {
        CarGroupOver = carGroupOver;
    }

    public String getInVirtualCardNum() {
        return InVirtualCardNum;
    }

    public void setInVirtualCardNum(String inVirtualCardNum) {
        InVirtualCardNum = inVirtualCardNum;
    }

    public String getInCarNum() {
        return InCarNum;
    }

    public void setInCarNum(String inCarNum) {
        InCarNum = inCarNum;
    }

    public int getInChannelID() {
        return InChannelID;
    }

    public void setInChannelID(int inChannelID) {
        InChannelID = inChannelID;
    }

    public String getInChannelName() {
        return InChannelName;
    }

    public void setInChannelName(String inChannelName) {
        InChannelName = inChannelName;
    }

    public int getInType() {
        return InType;
    }

    public void setInType(int inType) {
        InType = inType;
    }

    public String getInPicMac() {
        return InPicMac;
    }

    public void setInPicMac(String inPicMac) {
        InPicMac = inPicMac;
    }

    public String getInPic() {
        return InPic;
    }

    public void setInPic(String inPic) {
        InPic = inPic;
    }

    public String getInPicMin() {
        return InPicMin;
    }

    public void setInPicMin(String inPicMin) {
        InPicMin = inPicMin;
    }

    public String getInCarNumColor() {
        return InCarNumColor;
    }

    public void setInCarNumColor(String inCarNumColor) {
        InCarNumColor = inCarNumColor;
    }

    public int getInBookID() {
        return InBookID;
    }

    public void setInBookID(int inBookID) {
        InBookID = inBookID;
    }

    public double getInBookMoney() {
        return InBookMoney;
    }

    public void setInBookMoney(double inBookMoney) {
        InBookMoney = inBookMoney;
    }

    public String getInTime() {
        return InTime;
    }

    public void setInTime(String inTime) {
        InTime = inTime;
    }

    public String getInOperator() {
        return InOperator;
    }

    public void setInOperator(String inOperator) {
        InOperator = inOperator;
    }

    public String getInOperationTime() {
        return InOperationTime;
    }

    public void setInOperationTime(String inOperationTime) {
        InOperationTime = inOperationTime;
    }

    public String getInOperationType() {
        return InOperationType;
    }

    public void setInOperationType(String inOperationType) {
        InOperationType = inOperationType;
    }

    public int getInAccepted() {
        return InAccepted;
    }

    public void setInAccepted(int inAccepted) {
        InAccepted = inAccepted;
    }

    public String getInRemark() {
        return InRemark;
    }

    public void setInRemark(String inRemark) {
        InRemark = inRemark;
    }

    public String getContralID() {
        return ContralID;
    }

    public void setContralID(String contralID) {
        ContralID = contralID;
    }

    public String getIsDiscount() {
        return IsDiscount;
    }

    public void setIsDiscount(String isDiscount) {
        IsDiscount = isDiscount;
    }

    public String getTimeInHistory() {
        return TimeInHistory;
    }

    public void setTimeInHistory(String timeInHistory) {
        TimeInHistory = timeInHistory;
    }

    public objparkinHistory() {
        super();
    }

    public objparkinHistory(int ID, String region, String inuuID, int carTypeCode, String carTypeName, String carOwner, int carGroupID, String carGroup, int carGroupOver, String inVirtualCardNum, String inCarNum, int inChannelID, String inChannelName, int inType, String inPicMac, String inPic, String inPicMin, String inCarNumColor, int inBookID, double inBookMoney, String inTime, String inOperator, String inOperationTime, String inOperationType, int inAccepted, String inRemark, String contralID, String isDiscount, String timeInHistory) {
        this.ID = ID;
        Region = region;
        InuuID = inuuID;
        CarTypeCode = carTypeCode;
        CarTypeName = carTypeName;
        CarOwner = carOwner;
        CarGroupID = carGroupID;
        CarGroup = carGroup;
        CarGroupOver = carGroupOver;
        InVirtualCardNum = inVirtualCardNum;
        InCarNum = inCarNum;
        InChannelID = inChannelID;
        InChannelName = inChannelName;
        InType = inType;
        InPicMac = inPicMac;
        InPic = inPic;
        InPicMin = inPicMin;
        InCarNumColor = inCarNumColor;
        InBookID = inBookID;
        InBookMoney = inBookMoney;
        InTime = inTime;
        InOperator = inOperator;
        InOperationTime = inOperationTime;
        InOperationType = inOperationType;
        InAccepted = inAccepted;
        InRemark = inRemark;
        ContralID = contralID;
        IsDiscount = isDiscount;
        TimeInHistory = timeInHistory;
    }

    @Override
    public String toString() {
        return "objparkinHistory{" +
                "ID=" + ID +
                ", Region='" + Region + '\'' +
                ", InuuID='" + InuuID + '\'' +
                ", CarTypeCode=" + CarTypeCode +
                ", CarTypeName='" + CarTypeName + '\'' +
                ", CarOwner='" + CarOwner + '\'' +
                ", CarGroupID=" + CarGroupID +
                ", CarGroup='" + CarGroup + '\'' +
                ", CarGroupOver=" + CarGroupOver +
                ", InVirtualCardNum='" + InVirtualCardNum + '\'' +
                ", InCarNum='" + InCarNum + '\'' +
                ", InChannelID=" + InChannelID +
                ", InChannelName='" + InChannelName + '\'' +
                ", InType=" + InType +
                ", InPicMac='" + InPicMac + '\'' +
                ", InPic='" + InPic + '\'' +
                ", InPicMin='" + InPicMin + '\'' +
                ", InCarNumColor='" + InCarNumColor + '\'' +
                ", InBookID=" + InBookID +
                ", InBookMoney=" + InBookMoney +
                ", InTime=" + InTime +
                ", InOperator='" + InOperator + '\'' +
                ", InOperationTime=" + InOperationTime +
                ", InOperationType='" + InOperationType + '\'' +
                ", InAccepted=" + InAccepted +
                ", InRemark='" + InRemark + '\'' +
                ", ContralID='" + ContralID + '\'' +
                ", IsDiscount='" + IsDiscount + '\'' +
                ", TimeInHistory='" + TimeInHistory + '\'' +
                '}';
    }
}
