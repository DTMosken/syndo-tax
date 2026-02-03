package com.syndo.project.zhzs.dbfxxt.service.syztfx;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.syndo.common.core.service.BaseService;
import com.syndo.project.zhzs.dbfxxt.domain.syztfx.Tdsysqsfx;
import com.syndo.project.zhzs.dbfxxt.mapper.syztfx.TdsysqsfxMapper;

/**
 * 土地使用税趋势分析
 */
@Service
public class TdsysqsfxServiceImpl extends BaseService implements ITdsysqsfxService {

    @Autowired
    private TdsysqsfxMapper mapper;
    
    @Override
    public List<Tdsysqsfx> selectList(Tdsysqsfx entity) {
        return mapper.selectList(entity);
    }

	@Override
	public List<Tdsysqsfx> selectListNianjd(Tdsysqsfx entity) {
		return mapper.selectListNianjd(entity);
	}

}
