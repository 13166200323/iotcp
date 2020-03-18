package com.iotcp.system.domain;

public class TableList {
    private int Kid;
    private String TableName;
    private String TableType;
    private String ReportName;
    private String Output;
    private String Remark;
    private String OutputStyle;
    private String OpcPara;

    public int getKid() {
        return Kid;
    }

    public void setKid(int kid) {
        Kid = kid;
    }

    public String getTableName() {
        return TableName;
    }

    public void setTableName(String tableName) {
        TableName = tableName;
    }

    public String getTableType() {
        return TableType;
    }

    public void setTableType(String tableType) {
        TableType = tableType;
    }

    public String getReportName() {
        return ReportName;
    }

    public void setReportName(String reportName) {
        ReportName = reportName;
    }

    public String getOutput() {
        return Output;
    }

    public void setOutput(String output) {
        Output = output;
    }

    public String getRemark() {
        return Remark;
    }

    public void setRemark(String remark) {
        Remark = remark;
    }

    public String getOutputStyle() {
        return OutputStyle;
    }

    public void setOutputStyle(String outputStyle) {
        OutputStyle = outputStyle;
    }

    public String getOpcPara() {
        return OpcPara;
    }

    public void setOpcPara(String opcPara) {
        OpcPara = opcPara;
    }

    @Override
    public String toString() {
        return "TableList{" +
                "Kid=" + Kid +
                ", TableName='" + TableName + '\'' +
                ", TableType='" + TableType + '\'' +
                ", ReportName='" + ReportName + '\'' +
                ", Output='" + Output + '\'' +
                ", Remark='" + Remark + '\'' +
                ", OutputStyle='" + OutputStyle + '\'' +
                ", OpcPara='" + OpcPara + '\'' +
                '}';
    }
}
