package com.syndo.project.zhzs.dbfxxt.service.syztfx;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.syndo.project.zhzs.dbfxxt.domain.syztfx.Esfjyfx;
import com.syndo.project.zhzs.dbfxxt.mapper.syztfx.EsfjyfxMapper;

@Service
public class EsfjyfxServiceImpl implements IEsfjyfxService {
	@Autowired
	private EsfjyfxMapper mapper;
	
	@Override
    public List<Esfjyfx> selectList(Esfjyfx entity) {
        return mapper.selectList(entity);
    }
}
