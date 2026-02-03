package com.syndo.project.zhzs.dbfxxt.service.syztfx;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.syndo.project.zhzs.dbfxxt.domain.syztfx.Jyzxsnsfx;
import com.syndo.project.zhzs.dbfxxt.mapper.syztfx.JyzxsnsfxMapper;

@Service
public class JyzxsnsfxServiceImpl implements IJyzxsnsfxService {
	@Autowired
	private JyzxsnsfxMapper mapper;
	
	@Override
    public List<Jyzxsnsfx> selectList(Jyzxsnsfx entity) {
        return mapper.selectList(entity);
    }
    
    @Override
    public List<Jyzxsnsfx> getTwoList(Jyzxsnsfx entity) {
        return mapper.getTwoList(entity);
	}
}
