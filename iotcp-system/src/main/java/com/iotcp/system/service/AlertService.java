package com.iotcp.system.service;

import com.iotcp.system.domain.ATS;
import com.iotcp.system.domain.TableList;

import java.util.List;

public interface AlertService {
    /**
     * 加载所有的表数据
     * @return
     */
    public List<TableList> getTableList();

    /**
     * 根据表 读取数据表中的警报变量数据
     * @param ats
     * @return
     */
    public List<ATS> getATS(ATS ats);
    public List<ATS> getATSBak(ATS ats);

    /**
     * 根据区域读取警报变量数据
     * @param ats
     * @return
     */
    public List<ATS> getATSArea(ATS ats);

    /**
     * 根据参数读取警报变量数据
     * @param ats
     * @return
     */
    public List<ATS> getATSPara(ATS ats);

    /**
     * 修改策略
     * @param ats
     * @return
     */
    public int updateStrategy(ATS ats);
}
