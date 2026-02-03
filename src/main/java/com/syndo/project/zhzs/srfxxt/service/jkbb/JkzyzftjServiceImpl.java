package com.syndo.project.zhzs.srfxxt.service.jkbb;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.syndo.project.zhzs.srfxxt.domain.jkbb.Jkzyzftj;
import com.syndo.project.zhzs.srfxxt.mapper.jkbb.JkzyzftjMapper;
/**
 * @author gxg
 * 金库转移支付统计  服务层实现
 */
@Service
public class JkzyzftjServiceImpl implements IJkzyzftjService {
	@Autowired
	private JkzyzftjMapper mapper;

	/**
     * 查询金库转移支付统计列表
     * 
     * @param Jkzyzftj 金库转移支付统计信息
     * @return 金库转移支付统计集合
     */
	@Override
    public List<Jkzyzftj> selectList(Jkzyzftj entity) {
        return mapper.selectList(entity);
    }
}
