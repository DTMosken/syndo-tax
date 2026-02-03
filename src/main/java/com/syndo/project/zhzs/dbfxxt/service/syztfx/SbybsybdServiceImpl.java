package com.syndo.project.zhzs.dbfxxt.service.syztfx;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.syndo.project.zhzs.dbfxxt.domain.syztfx.Sbybsybd;
import com.syndo.project.zhzs.dbfxxt.mapper.syztfx.SbybsybdMapper;

@Service
public class SbybsybdServiceImpl implements ISbybsybdService {
	@Autowired
	private SbybsybdMapper mapper;
	
	@Override
    public List<Sbybsybd> selectList(Sbybsybd entity) {
        return mapper.selectList(entity);
    }
	
	@Override
    public List<Sbybsybd> getTwoList(Sbybsybd entity) {
        return mapper.getTwoList(entity);
	}

	@Override
	public List<Sbybsybd> getThreeList(Sbybsybd entity) {
        return mapper.getThreeList(entity);
	}
}
