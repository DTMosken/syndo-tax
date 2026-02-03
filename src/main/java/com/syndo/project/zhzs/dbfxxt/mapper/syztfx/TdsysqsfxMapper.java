package com.syndo.project.zhzs.dbfxxt.mapper.syztfx;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.syndo.common.core.mapper.BaseMapper;
import com.syndo.project.zhzs.dbfxxt.domain.syztfx.Tdsysqsfx;
/**
 * 土地使用税趋势分析
 */
@Repository
public interface TdsysqsfxMapper extends BaseMapper<Tdsysqsfx> {
	
	public List<Tdsysqsfx> selectListNianjd(Tdsysqsfx entity);
}
