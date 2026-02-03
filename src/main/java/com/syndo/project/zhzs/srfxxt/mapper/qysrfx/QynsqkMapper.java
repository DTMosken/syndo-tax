package com.syndo.project.zhzs.srfxxt.mapper.qysrfx;

import java.util.List;

import com.syndo.common.core.mapper.BaseMapper;
import com.syndo.project.zhzs.srfxxt.domain.qysrfx.Qynsqk;
import com.syndo.project.zhzs.srfxxt.domain.qysrfx.QynsqkxjlExcel;

/**
 * 企业纳税情况
 * 
 * @author xrc
 *
 */
public interface QynsqkMapper extends BaseMapper<Qynsqk> {

	/**
	 * 企业纳税增长额排名
	 * 
	 * @param entity
	 * @return
	 */
	List<Qynsqk> selectZze(Qynsqk entity);

	/**
	 * 企业纳税下降额排名
	 * 
	 * @param entity
	 * @return
	 */
	List<QynsqkxjlExcel> selectXje(QynsqkxjlExcel entity);
}
