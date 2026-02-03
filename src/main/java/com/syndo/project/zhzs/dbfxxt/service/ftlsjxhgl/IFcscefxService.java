package com.syndo.project.zhzs.dbfxxt.service.ftlsjxhgl;

import java.util.List;

import com.syndo.project.zhzs.dbfxxt.domain.ftlsjxhgl.Fcscefx;
/**
 * 房产税差额分析 服务层
 * @author gxg
 *
 */
public interface IFcscefxService {
	/**
     * 查询房产税差额分析列表
     * 
     * @param Fcscefx 房产税差额分析信息
     * @return 房产税差额分析集合
     */
	public List<Fcscefx> selectList(Fcscefx entity);
}
