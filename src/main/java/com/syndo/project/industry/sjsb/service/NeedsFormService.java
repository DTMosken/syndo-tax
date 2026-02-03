package com.syndo.project.industry.sjsb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.syndo.common.core.service.BaseService;
import com.syndo.common.utils.DateUtils;
import com.syndo.common.utils.StringUtils;
import com.syndo.common.utils.security.ShiroUtils;
import com.syndo.project.industry.sjsb.domain.NeedsForm;
import com.syndo.project.industry.sjsb.mapper.NeedsFormMapper;

/**
 * 需求调查表
 *
 * @author ykc
 * @date 2020年7月22日
 */
@Service
public class NeedsFormService extends BaseService {

	@Autowired
	private NeedsFormMapper mapper;

	/**
	 * 
	 * @Title: getNeedsForm
	 * @Description: 查询需求表
	 * @param @return
	 * @return NeedsForm
	 * @throws
	 */
	public NeedsForm getNeedsForm() {
		String loginName = ShiroUtils.getSysUser().getLoginName();
		NeedsForm nf = mapper.selectByLoginName(loginName);
		if (nf == null) {
			nf = new NeedsForm();
			nf.setNd(DateUtils.getYear());
			nf.setTyshxydm(ShiroUtils.getLoginName());
			nf.setQymc(ShiroUtils.getUserName());
		}
		return nf;
	}

	/**
	 * 
	 * @Title: save
	 * @Description: 保存
	 * @param @param entity
	 * @param @return
	 * @return int
	 * @throws
	 */
	public int save(NeedsForm entity) {
		String zycp = StringUtils.join(entity.getZycps(), "|");
		String sczyl = StringUtils.join(entity.getSczyls(), "|");
		String zysc = StringUtils.join(entity.getZyscs(), "|");
		String cpsshy = StringUtils.join(entity.getCpsshys(), "|");
		entity.setZycp(zycp);
		entity.setSczyl(sczyl);
		entity.setZysc(zysc);
		entity.setCpsshy(cpsshy);
		
		// id不为空时，说明已存在，调用修改
		if (StringUtils.isNotEmpty(entity.getId())) {
			return mapper.update(entity);
		}
		return mapper.insert(entity);
	}

}
