package com.syndo.project.industry.sjsb.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.ModelMap;

import com.syndo.common.core.domain.AjaxResult;
import com.syndo.common.core.domain.entity.User;
import com.syndo.common.core.service.BaseService;
import com.syndo.common.utils.DateUtils;
import com.syndo.common.utils.StringUtils;
import com.syndo.common.utils.security.ShiroUtils;
import com.syndo.project.industry.sjsb.domain.EvaluateBaseInfo;
import com.syndo.project.industry.sjsb.domain.EvaluateElectricInfo;
import com.syndo.project.industry.sjsb.domain.EvaluateForm;
import com.syndo.project.industry.sjsb.domain.EvaluateLandInfo;
import com.syndo.project.industry.sjsb.domain.EvaluateWaterInfo;
import com.syndo.project.industry.sjsb.mapper.EvaluateFormMapper;

/**
 * 
 * @ClassName: EvaluateFormService @Description： 亩产评价表
 * @author ykc
 * @date 2020-8-19
 *
 */
@Service
public class EvaluateFormService extends BaseService {

	@Autowired
	private EvaluateFormMapper mapper;

	/**
	 * 
	 * @Title: getNeedsForm @Description: 初始化亩产评价表 @param @return @return
	 *         EvaluateForm @throws
	 */
	public String initView(ModelMap modelMap, String prefix) {
		User user = ShiroUtils.getSysUser();
		// 基本信息
		EvaluateBaseInfo base = mapper.selectBaseInfo(user.getLoginName());
		if (base == null) {
			base = new EvaluateBaseInfo();
			base.setPjnf(DateUtils.getYear());
			base.setTyshxydm(user.getLoginName());
			base.setQymc(user.getUserName());
		}
		String id = base.getId();
		// 评价指标-企业自填
		EvaluateForm entity = mapper.selectEvaluateForm(id);
		if (entity == null) {
			entity = new EvaluateForm();
		}
		// 评价指标-部门核定
		EvaluateForm deptInfo = new EvaluateForm();
		// 用电信息
		List<EvaluateElectricInfo> eeiList = mapper.selectElectricInfo(id);
		// 用水信息
		List<EvaluateWaterInfo> ewiList = mapper.selectWaterInfo(id);
		// 出租土地信息
		List<EvaluateLandInfo> ellList = mapper.selectLeaseLand(id);
		// 承租土地信息
		List<EvaluateLandInfo> erlList = mapper.selectRentLand(id);

		modelMap.put("baseInfo", base);
		modelMap.put("entity", entity);
		modelMap.put("deptInfo", deptInfo);
		modelMap.put("eeiList", eeiList);
		modelMap.put("ewiList", ewiList);
		modelMap.put("ellList", ellList);
		modelMap.put("erlList", erlList);
		return prefix + "/view";
	}

	/**
	 * 获取全部数据 用于企业得分计算 by - hry
	 * 
	 * @return ModelMap
	 */
	public List<ModelMap> ottenereAll() {
		List<ModelMap> retlst = new ArrayList<ModelMap>();

		User user = ShiroUtils.getSysUser();
		// 基本信息
		List<EvaluateBaseInfo> bases = mapper.selectBaseInfoAll();
		for (EvaluateBaseInfo base : bases) {
			ModelMap modelMap = new ModelMap();
			if (base == null) {
				base = new EvaluateBaseInfo();
				base.setPjnf(DateUtils.getYear());
				base.setTyshxydm(user.getLoginName());
				base.setQymc(user.getUserName());
			}
			String id = base.getId();
			// 评价指标-企业自填
			EvaluateForm entity = mapper.selectEvaluateForm(id);
			if (entity == null) {
				entity = new EvaluateForm();
			}
			// 评价指标-部门核定
			EvaluateForm deptInfo = new EvaluateForm();
			// 用电信息
			List<EvaluateElectricInfo> eeiList = mapper.selectElectricInfo(id);
			// 用水信息
			List<EvaluateWaterInfo> ewiList = mapper.selectWaterInfo(id);
			// 出租土地信息
			List<EvaluateLandInfo> ellList = mapper.selectLeaseLand(id);
			// 承租土地信息
			List<EvaluateLandInfo> erlList = mapper.selectRentLand(id);

			modelMap.put("baseInfo", base);
			entity.setQymc(base.getQymc());
			entity.setTyshxydm(base.getTyshxydm());
			entity.setQydz(base.getQydz());
			entity.setQydzc(base.getQydzc());
			entity.setQydzl(base.getQydzl());
			entity.setQydzh(base.getQydzh());
			entity.setSshy(base.getSshy());
			entity.setHydm(base.getHydm());
			entity.setFrxm(base.getFrxm());
			entity.setFrsjhm(base.getFrsjhm());
			entity.setFrlxdh(base.getFrlxdh());
			entity.setTbrxm(base.getTbrxm());
			entity.setTbrsjhm(base.getTbrsjhm());
			entity.setTbrlxdh(base.getTbrlxdh());
			entity.setTbrlxdh(base.getTbrlxdh());
			entity.setZycp(base.getZycp());
			entity.setSfzjtx(base.getSfzjtx());
			entity.setGyzcz(base.getGyzcz());
			entity.setNpjzg(base.getNpjzg());
			entity.setLrze(base.getLrze());
			entity.setGswz(base.getGswz());
			entity.setPjnf(base.getPjnf());
			entity.setQygm(base.getQygm());
			
			modelMap.put("entity", entity);
			modelMap.put("deptInfo", deptInfo);
			modelMap.put("eeiList", eeiList);
			modelMap.put("ewiList", ewiList);
			modelMap.put("ellList", ellList);
			modelMap.put("erlList", erlList);
			retlst.add(modelMap);
		}
		return retlst;
	}

	/**
	 * 
	 * @Title: save @Description: 保存 @param @param entity @param @return @return
	 *         Object @throws
	 */
	@Transactional(rollbackFor = Exception.class)
	public AjaxResult save(EvaluateForm entity) {
		try {
			String id = entity.getId();

			if (StringUtils.isNotEmpty(id)) {
				mapper.updateBaseInfo(entity);
				/**
				 * 删除附表信息 PS：无主键，默认无附表信息，所以修改不进入删除
				 */
				mapper.deleteEvaluateByPid(id);
				mapper.deleteElectricByPid(id);
				mapper.deleteWaterByPid(id);
				mapper.deleteLandByPid(id);
			} else {
				id = getUUID();
				entity.setId(id);
				mapper.insertBaseInfo(entity);
			}

			// 评价指标信息-企业自填
			mapper.insertEvaluate(entity);
			// 用电信息-企业自填
			List<EvaluateElectricInfo> eeiList = entity.getEeiList();
			if (eeiList != null && eeiList.size() > 0) {
				eeiList = eeiList.stream().filter(v -> v.getYdhm() != null).collect(Collectors.toList());
				entity.setEeiList(eeiList);
				mapper.insertElectric(entity);
			}
			// 用水信息-企业自填
			List<EvaluateWaterInfo> ewiList = entity.getEwiList();
			if (ewiList != null && ewiList.size() > 0) {
				ewiList = ewiList.stream().filter(v -> v.getYshm() != null).collect(Collectors.toList());
				entity.setEwiList(ewiList);
				mapper.insertWater(entity);
			}
			// 出租土地信息-企业自填
			List<EvaluateLandInfo> ellList = entity.getEllList();
			if (ellList != null && ellList.size() > 0) {
				ellList = ellList.stream().filter(v -> v.getTyshxydm() != null).collect(Collectors.toList());
				entity.setEllList(ellList);
				mapper.insertLeaseLand(entity);
			}
			// 承租土地信息-企业自填
			List<EvaluateLandInfo> erlList = entity.getErlList();
			if (erlList != null && erlList.size() > 0) {
				erlList = erlList.stream().filter(v -> v.getTyshxydm() != null).collect(Collectors.toList());
				entity.setErlList(erlList);
				mapper.insertRentLand(entity);
			}

			return AjaxResult.success("成功！");
		} catch (Exception e) {
			return AjaxResult.error(e.getMessage());
		}
	}
 
}
