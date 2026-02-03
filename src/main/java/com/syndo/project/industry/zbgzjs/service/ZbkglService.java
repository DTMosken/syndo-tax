package com.syndo.project.industry.zbgzjs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.syndo.common.core.service.BaseService;
import com.syndo.project.industry.zbgzjs.domain.Zbfl;
import com.syndo.project.industry.zbgzjs.mapper.ZbkglMapper;



/**
 * 指标库管理
 * @author 46406
 *
 */
@Service
public class ZbkglService extends BaseService implements IZbkglService {
	@Autowired
	private ZbkglMapper mapper;
//	/**
//	 * 获取指标库指标分类
//	 */
//	@Override
//	public List<Zbfl> GetZbkZbfm() {
//		// TODO Auto-generated method stub
//		return mapper.GetZbkZbfm();
//	}
//	
//	/**
//	 * 指标分类 新增
//	 */
//	@Override
//	public void saveFileDirectory(Zbfl zb) {
//		// TODO Auto-generated method stub
//		  mapper.saveFileDirectory(zb);
//	}
//
//	@Override
//	public void updateFileDirectory(Zbfl zb) {
//		// TODO Auto-generated method stub
//		 mapper.updateFileDirectory(zb);
//	}
//
//	@Override
//	public void delFileDirectory(String id) {
//		// TODO Auto-generated method stub
//		mapper.delFileDirectory(id);
//	}

}
