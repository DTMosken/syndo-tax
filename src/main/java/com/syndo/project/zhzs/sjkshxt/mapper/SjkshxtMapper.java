package com.syndo.project.zhzs.sjkshxt.mapper;

import com.syndo.common.core.mapper.BaseMapper;
import com.syndo.project.zhzs.sjkshxt.domain.*;

import java.util.List;
import java.util.Map;

public interface SjkshxtMapper extends BaseMapper<Jcsr> {

    /**
     * 获取各级次收入占比
     * @author zyc
     * @date
     * @return
     */
    public List<Jcsr> getLeftChart1();

    /**
     * 获取收入趋势中地方收入与总收入数据
     * @return
     */
    Map<String,Object> getLeftChart2();

    /**
     * 获取重点行业税收数据
     * @return
     */
    Map<String, Object> getLeftChart3();


    /**
     * 获取centerTop1数据
     * @return
     */
    Map<String, Object> getCenterTop1();


    /**
     * 获取企业街道收入增速---centerBottom1数据
     * @return
     */
    List<Jdxzsrmx> getCenterBottom1();

    /**
     * 获取map地图数据
     * @return
     */
    List<Jdxzsrmx> getCenterMapData();


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

    /*
    * 税收前十企业
    * */
    List<Ssqsqy> getSsqsqyData();
}
