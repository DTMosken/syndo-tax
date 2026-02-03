package com.syndo.project.zhzs.dbfxxt.service.ftlsjxhgl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.syndo.common.core.service.BaseService;
import com.syndo.project.zhzs.dbfxxt.domain.ftlsjxhgl.Gsgthlgfx;
import com.syndo.project.zhzs.dbfxxt.mapper.ftlsjxhgl.GsgthlgfxMapper;
/**
 * @author gxg
 * 个体工商户漏管分析  服务层实现
 */
@Service
public class GsgthlgfxServiceImpl extends BaseService implements IGsgthlgfxService{
	
	@Autowired
	private GsgthlgfxMapper mapper;

	/**
     * 查询个体工商户漏管分析信息
     * 
     * @param id 个体工商户漏管分析ID
     * @return 个体工商户漏管分析信息
     */
    @Override
	public Gsgthlgfx selectById(String id) {
	    return mapper.selectById(id);
	}
	
	/**
     * 查询个体工商户漏管分析列表
     * 
     * @param Gsgthlgfx 个体工商户漏管分析信息
     * @return 个体工商户漏管分析集合
     */
	@Override
	public List<Gsgthlgfx> selectList(Gsgthlgfx entity) {
	    return mapper.selectList(entity);
	}

}
