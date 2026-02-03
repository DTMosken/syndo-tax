package com.syndo.project.zhzs.srfxxt.service.czsrfx;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.syndo.common.core.service.BaseService;
import com.syndo.project.zhzs.srfxxt.domain.czsrfx.Czsrwcqk;
import com.syndo.project.zhzs.srfxxt.mapper.czsrfx.CzsrwcqkMapper;

/**
 * 财政收入完成情况
 * 
 * @author mdz
 *
 */
@Service
public class CzsrwcqkServiceImpl extends BaseService implements ICzsrwcqkService {

	@Autowired
	private CzsrwcqkMapper mapper;

	/**
	 * 财政收入完成情况
	 */
	@Override
	public List<Czsrwcqk> selectList(Czsrwcqk cond) {
		return mapper.selectList(cond);
	}

	@Override
	public List<Map<String, Object>> selectYskm() {
		List<Map<String, Object>> list = mapper.selectYskm();
		//list.stream().filter(map->map.get("key").equals("出口业务退增值税")).forEach(map->map.put("selected", false));
		list.forEach(item->{
			if(item.get("value").equals("出口业务退增值税")){
				item.put("selected", false);
			}else{
				item.put("selected", true);
			}
		});
		return list;
	}
	

}
