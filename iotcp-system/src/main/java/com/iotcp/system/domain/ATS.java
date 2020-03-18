package com.iotcp.system.domain;

public class ATS {
    private int Tid;
    private String TagName;
    private String TagDesc;
    private String TagFormat;
    private String TagType;
    private String TagClick;
    private String TagFormula;
    private String AlarmStrategy;
    private String AlarmValue;
    private String AlarmDesc;
    private String AlarmTime;
    private String Area;
    private String Para;
    private String state;
    private String tableName;
    private String pageNum;

    public int getTid() {
        return Tid;
    }

    public void setTid(int tid) {
        Tid = tid;
    }

    public String getTagName() {
        return TagName;
    }

    public void setTagName(String tagName) {
        TagName = tagName;
    }

    public String getTagDesc() {
        return TagDesc;
    }

    public void setTagDesc(String tagDesc) {
        TagDesc = tagDesc;
    }

    public String getTagFormat() {
        return TagFormat;
    }

    public void setTagFormat(String tagFormat) {
        TagFormat = tagFormat;
    }

    public String getTagType() {
        return TagType;
    }

    public void setTagType(String tagType) {
        TagType = tagType;
    }

    public String getTagClick() {
        return TagClick;
    }

    public void setTagClick(String tagClick) {
        TagClick = tagClick;
    }

    public String getTagFormula() {
        return TagFormula;
    }

    public void setTagFormula(String tagFormula) {
        TagFormula = tagFormula;
    }

    public String getAlarmStrategy() {
        return AlarmStrategy;
    }

    public void setAlarmStrategy(String alarmStrategy) {
        AlarmStrategy = alarmStrategy;
    }

    public String getAlarmValue() {
        return AlarmValue;
    }

    public void setAlarmValue(String alarmValue) {
        AlarmValue = alarmValue;
    }

    public String getAlarmDesc() {
        return AlarmDesc;
    }

    public void setAlarmDesc(String alarmDesc) {
        AlarmDesc = alarmDesc;
    }

    public String getAlarmTime() {
        return AlarmTime;
    }

    public void setAlarmTime(String alarmTime) {
        AlarmTime = alarmTime;
    }

    public String getArea() {
        return Area;
    }

    public void setArea(String area) {
        Area = area;
    }

    public String getPara() {
        return Para;
    }

    public void setPara(String para) {
        Para = para;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "ATS{" +
                "Tid=" + Tid +
                ", TagName='" + TagName + '\'' +
                ", TagDesc='" + TagDesc + '\'' +
                ", TagFormat='" + TagFormat + '\'' +
                ", TagType='" + TagType + '\'' +
                ", TagClick='" + TagClick + '\'' +
                ", TagFormula='" + TagFormula + '\'' +
                ", AlarmStrategy='" + AlarmStrategy + '\'' +
                ", AlarmValue='" + AlarmValue + '\'' +
                ", AlarmDesc='" + AlarmDesc + '\'' +
                ", AlarmTime='" + AlarmTime + '\'' +
                ", Area='" + Area + '\'' +
                ", Para='" + Para + '\'' +
                ", state='" + state + '\'' +
                '}';
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public String getPageNum() {
        return pageNum;
    }

    public void setPageNum(String pageNum) {
        this.pageNum = pageNum;
    }
}
