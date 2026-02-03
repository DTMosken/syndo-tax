package com.syndo.project.zhzs.dbfxxt.service.syztfx;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.syndo.common.core.service.BaseService;
import com.syndo.project.zhzs.dbfxxt.domain.syztfx.Fcsqsfx;
import com.syndo.project.zhzs.dbfxxt.mapper.syztfx.FcsqsfxMapper;

/**
 * 房产税趋势分析
 */
@Service
public class FcsqsfxServiceImpl extends BaseService implements IFcsqsfxService {

    @Autowired
    private FcsqsfxMapper mapper;
    
    @Override
    public List<Fcsqsfx> selectList(Fcsqsfx entity) {
        return mapper.selectList(entity);
    }

	@Override
	public List<Fcsqsfx> selectListByJd(Fcsqsfx entity) {
		return mapper.selectListByJd(entity);
	}

}
