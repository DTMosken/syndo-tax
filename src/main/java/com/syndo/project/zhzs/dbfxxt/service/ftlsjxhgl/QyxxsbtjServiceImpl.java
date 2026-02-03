package com.syndo.project.zhzs.dbfxxt.service.ftlsjxhgl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.syndo.project.zhzs.dbfxxt.domain.ftlsjxhgl.Qyxxsbtj;
import com.syndo.project.zhzs.dbfxxt.mapper.ftlsjxhgl.QyxxsbtjMapper;
/**
 * @author gxg
 * 企业信息上报信息  服务层实现
 */
@Service
public class QyxxsbtjServiceImpl implements IQyxxsbtjService {
	@Autowired
	private QyxxsbtjMapper mapper;

	/**
     * 查询企业信息上报信息列表
     * 
     * @param Qyxxsbtj 企业信息上报信息信息
     * @return 企业信息上报信息集合
     */
	@Override
    public List<Qyxxsbtj> selectList(Qyxxsbtj entity) {
        return mapper.selectList(entity);
    }
}
