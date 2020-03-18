package com.iotcp.system.service.impl;

import com.iotcp.system.domain.ATS;
import com.iotcp.system.domain.TableList;
import com.iotcp.system.service.AlertService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Service
@Configuration
public class AlertServiceImpl implements AlertService {

    @Value("${server.SqlServer.url}")
    private String url;
    @Value("${server.SqlServer.username}")
    private String username;
    @Value("${server.SqlServer.password}")
    private String password;
    @Value("${server.SqlServer.driverClassName}")
    private String driverClassName;


    @Override
    public List<TableList> getTableList() {
        List<TableList> tableLists = new ArrayList<TableList>();
        ResultSet resultSet = null;
        Statement statement = null;
        Connection connection = null;
        try {
            Class.forName(driverClassName);
            connection = DriverManager.getConnection(url,username,password);
            statement = connection.createStatement();
            String sql = "select Kid,TableName,TableType,ReportName,Output,Remark,OutputStyle,OpcPara from TableList";
            resultSet = statement.executeQuery(sql);
            while(resultSet.next()) {
                TableList tableList = new TableList();
                tableList.setKid(resultSet.getInt("Kid"));
                tableList.setTableName(resultSet.getString("TableName"));
                tableList.setTableType(resultSet.getString("TableType"));
                tableList.setReportName(resultSet.getString("ReportName"));
                tableList.setOutput(resultSet.getString("Output"));
                tableList.setRemark(resultSet.getString("Remark"));
                tableList.setOutputStyle(resultSet.getString("OutputStyle"));
                tableList.setOpcPara(resultSet.getString("OpcPara"));
                tableLists.add(tableList);
            }
        } catch(ClassNotFoundException ex) {
            ex.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if(resultSet!=null){
                    resultSet.close();
                    resultSet = null;
                }
                if(statement!=null){
                    statement.close();
                    statement = null;
                }
                if(connection!=null){
                    connection.close();
                    connection = null;
                }
            } catch(SQLException ex) {
                ex.printStackTrace();
            }
        }
        return tableLists;
    }
    /**
     * 根据表 读取数据表中的警报变量数据
     * @param ats
     * @return
     */
    @Override
    public List<ATS> getATS(ATS ats) {
        int pageNum= 0;
        int pageSize = 0;
        if (ats.getPageNum().equals("1")){
            pageNum=1;
            pageSize=10;
        }else {
            pageSize=Integer.valueOf(ats.getPageNum()+"0").intValue();
            pageNum=pageSize-10;
        }
        String sql = "";
        if (ats.getState().equals("全部")){
            sql="select Tid,TagName,TagDesc,TagFormat,TagType,TagClick,TagFormula,AlarmStrategy,AlarmValue,AlarmDesc,AlarmTime,Area,Para, " +
                    "(case WHEN AlarmValue IS NULL THEN '无需警报' WHEN AlarmValue IS NOT NULL THEN '警报' else '异常数据' end)  state," +
                    " '"+ats.getTableName()+"' tableName from (Select *,ROW_NUMBER() OVER(order by Tid ASC) AS RowNumber FROM "+ats.getTableName()+") as b " +
                    "where RowNumber>="+pageNum+" AND RowNumber<="+pageSize+"";
        }else if (ats.getState().equals("警报")){
            sql="select Tid,TagName,TagDesc,TagFormat,TagType,TagClick,TagFormula,AlarmStrategy,AlarmValue,AlarmDesc,AlarmTime,Area,Para," +
                    " '警报' state,'"+ats.getTableName()+"' tableName from (Select *,ROW_NUMBER() OVER(order by Tid ASC) AS RowNumber FROM "+ats.getTableName()+" where AlarmValue  is not null) as b " +
                    "where RowNumber>="+pageNum+" AND RowNumber<="+pageSize+"";
        }else if (ats.getState().equals("无需警报")){
            sql="select Tid,TagName,TagDesc,TagFormat,TagType,TagClick,TagFormula,AlarmStrategy,AlarmValue,AlarmDesc,AlarmTime,Area,Para," +
                    " '无需警报' state,'"+ats.getTableName()+"' tableName from (Select *,ROW_NUMBER() OVER(order by Tid ASC) AS RowNumber FROM "+ats.getTableName()+" where AlarmValue  is null) as b " +
                    "where RowNumber>="+pageNum+" AND RowNumber<="+pageSize+"";
        }
        return AtsSql(sql);
    }
    @Override
    public List<ATS> getATSBak(ATS ats) {
        String sql = "";
        if (ats.getState().equals("全部")){
            sql="select Tid,TagName,TagDesc,TagFormat,TagType,TagClick,TagFormula,AlarmStrategy,AlarmValue,AlarmDesc,AlarmTime,Area,Para, " +
                    "(case WHEN AlarmValue IS NULL THEN '无需警报' WHEN AlarmValue IS NOT NULL THEN '警报' else '异常数据' end)  state," +
                    " '"+ats.getTableName()+"' tableName from "+ats.getTableName()+"";
        }else if (ats.getState().equals("警报")){
            sql="select Tid,TagName,TagDesc,TagFormat,TagType,TagClick,TagFormula,AlarmStrategy,AlarmValue,AlarmDesc,AlarmTime,Area,Para," +
                    " '警报' state,'"+ats.getTableName()+"' tableName from "+ats.getTableName()+" where AlarmValue  is not null ";
        }else if (ats.getState().equals("无需警报")){
            sql="select Tid,TagName,TagDesc,TagFormat,TagType,TagClick,TagFormula,AlarmStrategy,AlarmValue,AlarmDesc,AlarmTime,Area,Para," +
                    " '无需警报' state,'"+ats.getTableName()+"' tableName from "+ats.getTableName()+" where  AlarmValue  is null ";
        }
        return AtsSql(sql);
    }
    /**
     * 根据区域读取警报变量数据
     * @param ats
     * @return
     */
    @Override
    public List<ATS> getATSArea(ATS ats) {
        String sql= "select Tid,TagName,TagDesc,TagFormat,TagType,TagClick,TagFormula,AlarmStrategy,AlarmValue,AlarmDesc,AlarmTime,Area,Para," +
                " (case WHEN AlarmValue IS NULL THEN '无需警报' WHEN AlarmValue IS NOT NULL THEN '警报' else '异常数据' end)  state," +
                " '"+ats.getTableName()+"' tableName from "+ats.getTableName()+" where Area = '"+ats.getArea()+"'";
        return AtsSql(sql);
    }
    /**
     * 根据参数读取警报变量数据
     * @param ats
     * @return
     */
    @Override
    public List<ATS> getATSPara(ATS ats) {
        String sql= "select Tid,TagName,TagDesc,TagFormat,TagType,TagClick,TagFormula,AlarmStrategy,AlarmValue,AlarmDesc,AlarmTime,Area,Para," +
                " (case WHEN AlarmValue IS NULL THEN '无需警报' WHEN AlarmValue IS NOT NULL THEN '警报' else '异常数据' end)  state," +
                " '"+ats.getTableName()+"' tableName from "+ats.getTableName()+" where Para = '"+ats.getPara()+"'";
        return AtsSql(sql);
    }

    @Override
    public int updateStrategy(ATS ats) {
        int update = 0;
        ResultSet resultSet = null;
        Statement statement = null;
        Connection connection = null;
        try {
            Class.forName(driverClassName);
            connection = DriverManager.getConnection(url,username,password);
            statement = connection.createStatement();
            String sql = "update "+ats.getTableName()+"  set AlarmStrategy ='"+ats.getAlarmStrategy()+"',AlarmValue='"+ats.getAlarmValue()+"'," +
                    "AlarmDesc='"+ats.getAlarmDesc()+"',AlarmTime='"+ats.getAlarmTime()+"',Area='"+ats.getArea()+"',Para='"+ats.getPara()+"' where TagName='"+ats.getTagName()+"'";
            update = statement.executeUpdate(sql);
        } catch(ClassNotFoundException ex) {
            ex.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if(resultSet!=null){
                    resultSet.close();
                    resultSet = null;
                }
                if(statement!=null){
                    statement.close();
                    statement = null;
                }
                if(connection!=null){
                    connection.close();
                    connection = null;
                }
            } catch(SQLException ex) {
                ex.printStackTrace();
            }
        }
        return update;
    }

    public List<ATS> AtsSql(String sql){
        int i=0;
        List<ATS> ats1 = new ArrayList<ATS>();
        ResultSet resultSet = null;
        Statement statement = null;
        Connection connection = null;
        try {
            Class.forName(driverClassName);
            connection = DriverManager.getConnection(url,username,password);
            statement = connection.createStatement();
            resultSet = statement.executeQuery(sql);
            while(resultSet.next()) {
                ATS ats = new ATS();
                ats.setTid(resultSet.getInt("Tid"));
                ats.setTagName(resultSet.getString("TagName"));
                ats.setTagDesc(resultSet.getString("TagDesc"));
                ats.setTagFormat(resultSet.getString("TagFormat"));
                ats.setTagType(resultSet.getString("TagType"));
                ats.setTagClick(resultSet.getString("TagClick"));
                ats.setTagFormula(resultSet.getString("TagFormula"));
                ats.setAlarmStrategy(resultSet.getString("AlarmStrategy"));
                ats.setAlarmValue(resultSet.getString("AlarmValue"));
                ats.setAlarmDesc(resultSet.getString("AlarmDesc"));
                ats.setAlarmTime(resultSet.getString("AlarmTime"));
                ats.setArea(resultSet.getString("Area"));
                ats.setPara(resultSet.getString("Para"));
                ats.setState(resultSet.getString("state"));
                ats.setTableName(resultSet.getString("tableName"));
                ats1.add(ats);
            }
        } catch(ClassNotFoundException ex) {
            ex.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if(resultSet!=null){
                    resultSet.close();
                    resultSet = null;
                }
                if(statement!=null){
                    statement.close();
                    statement = null;
                }
                if(connection!=null){
                    connection.close();
                    connection = null;
                }
            } catch(SQLException ex) {
                ex.printStackTrace();
            }
        }
        return  ats1;
    }
}
