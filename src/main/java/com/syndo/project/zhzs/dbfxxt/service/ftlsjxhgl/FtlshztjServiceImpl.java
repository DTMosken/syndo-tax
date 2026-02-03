package com.syndo.project.zhzs.dbfxxt.service.ftlsjxhgl;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.syndo.common.utils.StringUtils;
import com.syndo.project.zhzs.dbfxxt.domain.ftlsjxhgl.Ftlshztj;
import com.syndo.project.zhzs.dbfxxt.mapper.ftlsjxhgl.FtlshztjMapper;
/**
 * @author gxg
 * 房土两税汇总统计  服务层实现
 */
@Service
public class FtlshztjServiceImpl implements IFtlshztjService {
	@Autowired
	private FtlshztjMapper mapper;

	/**
     * 查询房土两税汇总统计列表
     * 
     * @param Ftlshztj 房土两税汇总统计信息
     * @return 房土两税汇总统计集合
     */
	@Override
    public List<Ftlshztj> selectList(Ftlshztj entity) {
    	String jd = entity.getJd();
		if(StringUtils.isNotEmpty(jd)){
			List<String> jdList = Arrays.asList(jd.split(","));
			entity.setJdlist(jdList);
		}
        return mapper.selectList(entity);
    }
}
