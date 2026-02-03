package com.syndo.project.zhzs.dbfxxt.service.ztzhfx;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;
import com.syndo.project.zhzs.dbfxxt.domain.ztzhfx.Ahyydfx;
import com.syndo.project.zhzs.dbfxxt.mapper.ztzhfx.AhyydfxMapper;

@Service
public class AhyydfxServiceImpl {
	@Autowired
	private AhyydfxMapper mapper;


    public List<Ahyydfx> selectList(Ahyydfx entity) {
        return mapper.selectList(entity);
    }
    public Object getChartData(Ahyydfx y) {
		List<Ahyydfx> list = mapper.find(y);
		return JSON.toJSON(list);
    }
}