package com.syndo.project.zhzs.srfxxt.service.zjsrfx;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.syndo.common.core.service.BaseService;
import com.syndo.project.zhzs.srfxxt.domain.zjsrfx.Zjsrwcqk;
import com.syndo.project.zhzs.srfxxt.mapper.zjsrfx.ZjsrwcqkMapper;

/**
 * 镇街收入完成情况(全口径)
 */
@Service
public class ZjsrwcqkServiceImpl extends BaseService implements IZjsrwcqkService {

	@Autowired
	private ZjsrwcqkMapper mapper;

	/**
	 * 镇街收入完成情况(全口径)
	 */
	@Override
	public List<Zjsrwcqk> selectList(Zjsrwcqk cond) {
		return mapper.selectList(cond);
	}

	@Override
	public List<Map<String, Object>> selectZsxm() {
		List<Map<String, Object>> list = mapper.selectZsxm();
		list.forEach(item->{
			if(item.get("value").equals("个人所得税") || !item.get("value").toString().endsWith("税")){
				item.put("selected", false);
			}else{
				item.put("selected", true);
			}
		});
		return list;
	}


}
