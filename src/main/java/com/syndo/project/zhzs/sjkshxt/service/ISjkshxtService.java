package com.syndo.project.zhzs.sjkshxt.service;

import com.syndo.project.zhzs.sjkshxt.domain.*;

import java.util.List;
import java.util.Map;

public interface ISjkshxtService {
    /**
     * 获取各级次收入占比
     */
    List<Jcsr> getLeftChart1();

    /**
     * 获取收入趋势中地方收入与总收入数据
     */
    Map<String,Object> getLeftChart2();

    /**
     * 获取重点行业税收数据
     * @return
     */
    Map<String, Object> getLeftChart3();

    /**
     * 获取企业街道收入---centerTop1数据
     * @return
     */
    Map<String, Object> getCenterTop1();

    /**
     * 获取企业街道收入增速---centerBottom1数据
     * @return
     */
    Map<String,Object> getCenterBottom1();

    /**
     * 获取map地图数据
     * @return
     */
    Map<String,Object> getCenterMapData();

    /**
     * 获取数据采集情况数据
     * @return
     */
    List<Sjcjqk> getSjcjqkData();

    /**
     * 获取税收风险情况数据
     * @return
     */
    List<Ssfxqk> getSsfxqkData();

    /**
     * 获取风险处置情况数据
     * @return
     */
    List<Fxczqk> getFxczqkData();

    List<Ssqsqy> getSsqsqyData();
}
