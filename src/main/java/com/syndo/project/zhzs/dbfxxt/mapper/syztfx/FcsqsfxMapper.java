package com.syndo.project.zhzs.dbfxxt.mapper.syztfx;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.syndo.common.core.mapper.BaseMapper;
import com.syndo.project.zhzs.dbfxxt.domain.syztfx.Fcsqsfx;
/**
 * 房产税趋势分析
 */
@Repository
public interface FcsqsfxMapper extends BaseMapper<Fcsqsfx> {
	public List<Fcsqsfx> selectListByJd(Fcsqsfx entity);
}
