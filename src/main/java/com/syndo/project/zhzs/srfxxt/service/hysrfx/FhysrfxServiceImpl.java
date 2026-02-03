package com.syndo.project.zhzs.srfxxt.service.hysrfx;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.syndo.common.core.service.BaseService;
import com.syndo.project.zhzs.srfxxt.domain.hysrfx.Fhysrfx;
import com.syndo.project.zhzs.srfxxt.mapper.hysrfx.FhysrfxMapper;

/**
 * 分行业收入分析
 *
 */
@Service
public class FhysrfxServiceImpl extends BaseService implements IFhysrfxService {

	@Autowired
	private FhysrfxMapper mapper;
	
	/**
	 * 全口径
	 * @param cond
	 * @return
	 */
	public List<Fhysrfx> selectHyQkj(Fhysrfx cond){
		return mapper.selectHyQkj(cond);
	}
	/**
	 * 一般预算
	 * @param cond
	 * @return
	 */
	public List<Fhysrfx> selectHyYbys(Fhysrfx cond){
		return mapper.selectHyYbys(cond);
	}
}
