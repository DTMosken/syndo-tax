package com.syndo.project.zhzs.dbfxxt.service.ztzhfx;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.syndo.project.zhzs.dbfxxt.domain.ztzhfx.Ahyysfx;
import com.syndo.project.zhzs.dbfxxt.mapper.ztzhfx.AhyysfxMapper;

@Service
public class AhyysfxServiceImpl implements IAhyysfxService {
	@Autowired
	private AhyysfxMapper mapper;

	@Override
    public List<Ahyysfx> selectList(Ahyysfx entity) {
        return mapper.selectList(entity);
    }
    
    @Override
    public Map<String, Ahyysfx> getChartData(Ahyysfx y) {
        List<Ahyysfx> list = mapper.find(y);
        Map<String, Ahyysfx> map = new HashMap<String, Ahyysfx>();
        for (Ahyysfx y1 : list) {
            map.put(y1.getYf().substring(y1.getYf().indexOf("-") + 1,
                    y1.getYf().length()), y1);
        }
        Ahyysfx nulys = new Ahyysfx("0", "0"); // 一个空的
        if (map.get("01") == null) {
            map.put("01", nulys);
        }
        if (map.get("02") == null) {
            map.put("02", nulys);
        }
        if (map.get("03") == null) {
            map.put("03", nulys);
        }
        if (map.get("04") == null) {
            map.put("04", nulys);
        }
        if (map.get("05") == null) {
            map.put("05", nulys);
        }
        if (map.get("06") == null) {
            map.put("06", nulys);
        }
        if (map.get("07") == null) {
            map.put("07", nulys);
        }
        if (map.get("08") == null) {
            map.put("08", nulys);
        }
        if (map.get("09") == null) {
            map.put("09", nulys);
        }
        if (map.get("10") == null) {
            map.put("10", nulys);
        }
        if (map.get("11") == null) {
            map.put("11", nulys);
        }
        if (map.get("12") == null) {
            map.put("12", nulys);
        }
        return map;
    }
}