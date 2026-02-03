package com.syndo.project.zhzs.sjkshxt.service;

import com.syndo.project.zhzs.sjkshxt.domain.*;
import com.syndo.project.zhzs.sjkshxt.mapper.SjkshxtMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class SjkshxtServiceImpl implements ISjkshxtService {

    @Autowired(required = false)
    private SjkshxtMapper sjkshxtMapper;

    /**
     * 获取各级次收入占比
     */
    @Override
    public List<Jcsr> getLeftChart1() {
        List<Jcsr> lists = sjkshxtMapper.getLeftChart1();
        return lists;
    }

    /**
     * 获取收入趋势中地方收入与总收入数据
     */
    @Override
    public Map<String,Object> getLeftChart2() {
        Map<String,Object> lists = sjkshxtMapper.getLeftChart2();
        return lists;
    }

    /**
     * 获取重点行业税收数据
     */
    @Override
    public Map<String,Object> getLeftChart3() {
        Map<String,Object> lists = sjkshxtMapper.getLeftChart3();
        return lists;
    }


    /**
     * 获取centerTop1数据
     */
    @Override
    public Map<String,Object> getCenterTop1() {
        Map<String,Object> lists = sjkshxtMapper.getCenterTop1();
        return lists;
    }


    /**
     * 获取企业街道收入增速---centerBottom1数据
     */
    @Override
    public  Map<String,Object> getCenterBottom1() {
        List<Jdxzsrmx> lists = sjkshxtMapper.getCenterBottom1();
        StringBuffer jdxz = new StringBuffer();
        StringBuffer jdzjl = new StringBuffer();
        StringBuffer jdzsr = new StringBuffer();
        for (int i = 0; i < lists.size(); i++) {
            if(lists.size() > 1 && i < lists.size()-1){
                jdxz.append(lists.get(i).getJdxz()).append(",");
                jdzjl.append(lists.get(i).getJdzjl()).append(",");
                jdzsr.append(lists.get(i).getJdzsr()).append(",");
            }else{
                jdxz.append(lists.get(i).getJdxz());
                jdzjl.append(lists.get(i).getJdzjl());
                jdzsr.append(lists.get(i).getJdzsr());
            }

        }
        Map<String,Object> map =new HashMap<String,Object>();
        map.put("jdxz",jdxz);
        map.put("jdzjl",jdzjl);
        map.put("jdzsr",jdzsr);
        return map;
    }


    /**
     * 获取map地图数据并封装成前端所需的数据格式
     * @return
     */
    @Override
    public Map<String,Object> getCenterMapData() {
        List<Jdxzsrmx> lists = sjkshxtMapper.getCenterMapData();
        StringBuffer jdxz = new StringBuffer();//街道名称
        StringBuffer sjje = new StringBuffer();//街道总收入
        for (int i = 0; i < lists.size(); i++) {
            if(lists.size() > 1 && i < lists.size()-1){
                jdxz.append(lists.get(i).getJdxz()).append(",");
                sjje.append(lists.get(i).getSjje()).append(",");
            }else{
                jdxz.append(lists.get(i).getJdxz());
                sjje.append(lists.get(i).getSjje());
            }
        }

        /*StringBuffer jdxz = new StringBuffer();//街道名称
        StringBuffer qys = new StringBuffer();//街道企业数
        StringBuffer gts = new StringBuffer();//街道个体数
        StringBuffer zhs = new StringBuffer();//街道总户数
        StringBuffer srzb = new StringBuffer();//街道收入占比
        StringBuffer jdzsr = new StringBuffer();//街道总收入
        StringBuffer jddfsr = new StringBuffer();//街道地方收入

        for (int i = 0; i < lists.size(); i++) {
            if(lists.size() > 1 && i < lists.size()-1){
                jdxz.append(lists.get(i).getJdxz()).append(",");
                jdzsr.append(lists.get(i).getJdzsr()).append(",");
                jddfsr.append(lists.get(i).getJddfsr()).append(",");
                qys.append(lists.get(i).getQys()).append(",");
                gts.append(lists.get(i).getGts()).append(",");
                zhs.append(lists.get(i).getZhs()).append(",");
                srzb.append(lists.get(i).getSrzb()).append(",");
            }else{
                jdxz.append(lists.get(i).getJdxz());
                jdzsr.append(lists.get(i).getJdzsr());
                jddfsr.append(lists.get(i).getJddfsr());
                qys.append(lists.get(i).getQys());
                gts.append(lists.get(i).getGts());
                zhs.append(lists.get(i).getZhs());
                srzb.append(lists.get(i).getSrzb());
            }
        }*/

        Map<String,Object> map =new HashMap<String,Object>();
        map.put("jdxz",jdxz);
        map.put("sjje",sjje);
        return map;
    }

    /**
     * 获取数据采集情况数据
     */
    @Override
    public List<Sjcjqk> getSjcjqkData() {
        List<Sjcjqk> lists = sjkshxtMapper.getSjcjqkData();
        return lists;
    }


    /**
     * 获取税收风险情况数据
     */
    @Override
    public List<Ssfxqk> getSsfxqkData() {
        List<Ssfxqk> lists = sjkshxtMapper.getSsfxqkData();
        return lists;
    }


    /**
     * 获取风险处置情况数据
     * @return
     */
    @Override
    public List<Fxczqk> getFxczqkData() {
        List<Fxczqk> lists = sjkshxtMapper.getFxczqkData();
        return lists;
    }

    @Override
    public List<Ssqsqy> getSsqsqyData() {
        List<Ssqsqy> list = sjkshxtMapper.getSsqsqyData();
        return list;
    }
}
