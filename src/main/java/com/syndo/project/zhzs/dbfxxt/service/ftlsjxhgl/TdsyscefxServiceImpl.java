package com.syndo.project.zhzs.dbfxxt.service.ftlsjxhgl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.syndo.common.core.service.BaseService;
import com.syndo.common.utils.StringUtils;
import com.syndo.project.zhzs.dbfxxt.domain.ftlsjxhgl.Tdsyscefx;
import com.syndo.project.zhzs.dbfxxt.mapper.ftlsjxhgl.TdsyscefxMapper;

/**
 * 土地使用税差额分析
 * 
 * @author xrc
 *
 */
@Service
public class TdsyscefxServiceImpl extends BaseService implements ITdsyscefxService {

	@Autowired
	private TdsyscefxMapper mapper;

	@Override
	public List<Tdsyscefx> selectList(Tdsyscefx cond) {
			String jd = cond.getJd();
			if(StringUtils.isNotEmpty(jd)){
				List<String> jdlist = split2List(jd);
				cond.setJdlist(jdlist);
			}
		return mapper.selectList(cond);
	}

}
