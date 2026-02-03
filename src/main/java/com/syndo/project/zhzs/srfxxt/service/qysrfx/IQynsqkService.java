package com.syndo.project.zhzs.srfxxt.service.qysrfx;

import java.util.List;

import com.syndo.project.zhzs.srfxxt.domain.qysrfx.Qynsqk;
import com.syndo.project.zhzs.srfxxt.domain.qysrfx.QynsqkxjlExcel;

/**
 * 企业纳税情况
 *
 */
public interface IQynsqkService {

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
