package com.syndo.project.zhzs.dbfxxt.service.ftlsjxhgl;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.syndo.common.utils.StringUtils;
import com.syndo.project.zhzs.dbfxxt.domain.ftlsjxhgl.Fcscefx;
import com.syndo.project.zhzs.dbfxxt.mapper.ftlsjxhgl.FcscefxMapper;
/**
 * @author gxg
 * 房产税差额分析  服务层实现
 */
@Service
public class FcscefxServiceImpl implements IFcscefxService {
	@Autowired
	private FcscefxMapper mapper;

	/**
     * 查询房产税差额分析列表
     * 
     * @param Fcscefx 房产税差额分析信息
     * @return 房产税差额分析集合
     */
	@Override
    public List<Fcscefx> selectList(Fcscefx entity) {
    	String jd = entity.getJd();
		if(StringUtils.isNotEmpty(jd)){
			List<String> jdList = Arrays.asList(jd.split(","));
			entity.setJdlist(jdList);
		}
        return mapper.selectList(entity);
    }
}
