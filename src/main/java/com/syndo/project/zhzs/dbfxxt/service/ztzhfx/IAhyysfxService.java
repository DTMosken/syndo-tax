package com.syndo.project.zhzs.dbfxxt.service.ztzhfx;

import java.util.List;
import java.util.Map;

import com.syndo.project.zhzs.dbfxxt.domain.ztzhfx.Ahyysfx;

public interface IAhyysfxService {

	public List<Ahyysfx> selectList(Ahyysfx entity);

    public Map<String, Ahyysfx> getChartData(Ahyysfx y) ;
}
