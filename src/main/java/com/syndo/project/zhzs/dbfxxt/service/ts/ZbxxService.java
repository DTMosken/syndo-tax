package com.syndo.project.zhzs.dbfxxt.service.ts;

import com.syndo.common.core.service.BaseService;
import com.syndo.project.zhzs.dbfxxt.domain.ts.Zbxx;
import com.syndo.project.zhzs.dbfxxt.mapper.ts.ZbxxMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("zbxx")
public class ZbxxService extends BaseService {
    @Autowired
    private ZbxxMapper mapper;
    

    public List<Zbxx> selectList(Zbxx vo){
        return mapper.selectList(vo);
    }
    
    public int updateZbxx(Zbxx zbxx) {
    	return mapper.update(zbxx);
    }

    public Zbxx selectByZbdm(String zbdm) {
        return mapper.selectByZbdm(zbdm);
    }

    public List<Zbxx> getALlZbxx() {
        return mapper.selectAllZbxx();
    }
}
