package com.syndo.project.zhzs.dbfxxt.service.ts;

import com.syndo.common.core.service.BaseService;
import com.syndo.project.zhzs.dbfxxt.domain.ts.Fxtspz;
import com.syndo.project.zhzs.dbfxxt.mapper.ts.FxtspzMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class FxtspzService extends BaseService {
    @Autowired
    private FxtspzMapper mapper;
    public Fxtspz getFxtspz() {
        Fxtspz result = new Fxtspz();
        List<Fxtspz> list = mapper.selectFxtspz();
        if(list != null) {
	        for(Fxtspz m: list) {
	            if("tsrq".equals(m.getKey())) {
	                result.setTsrq(m.getValue());
	            } else if("fksx".equals(m.getKey())){
	                result.setFksx(m.getValue());
	            }
	        }
        }
        return result;
    }

    @Transactional(rollbackFor = Exception.class)
    public int save(Fxtspz fkxz) {
        int r = 0;
        r+= mapper.saveTsrq(fkxz);
        r+= mapper.saveFksx(fkxz);
        return r;
    }
}
