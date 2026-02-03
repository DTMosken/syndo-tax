package com.syndo.project.industry.sjsb.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.syndo.common.core.mapper.BaseMapper;
import com.syndo.project.industry.sjsb.domain.EvaluateBaseInfo;
import com.syndo.project.industry.sjsb.domain.EvaluateElectricInfo;
import com.syndo.project.industry.sjsb.domain.EvaluateForm;
import com.syndo.project.industry.sjsb.domain.EvaluateLandInfo;
import com.syndo.project.industry.sjsb.domain.EvaluateWaterInfo;


/**
 * 
 * @ClassName: EvaluateFormService 
 * @Description： 亩产评价表
 * @author ykc
 * @date 2020-8-19
 *
 */
public interface EvaluateFormMapper extends BaseMapper<EvaluateForm> {

	/**
	 * 
	 * @Title: selectBaseInfo
	 * @Description: 查询基础信息
	 * @param @param loginName
	 * @param @return
	 * @return EvaluateBaseInfo
	 * @throws
	 */
	EvaluateBaseInfo selectBaseInfo(String loginName);

	/**
	 *	
	 * @Title: selectEvaluateForm
	 * @Description: 查询评价指标-企业自填
	 * @param @param id
	 * @param @return
	 * @return EvaluateForm
	 * @throws
	 */
	EvaluateForm selectEvaluateForm(@Param(value = "id") String id);

	/**
	 * 
	 * @Title: selectElectricInfo
	 * @Description: 查询用电信息-企业自填
	 * @param @param id
	 * @param @return
	 * @return List<EvaluateElectricInfo>
	 * @throws
	 */
	List<EvaluateElectricInfo> selectElectricInfo(@Param(value = "id") String id);
	
	/**
	 * 
	 * @Title: selectWaterInfo
	 * @Description: 查询用水信息-企业自填
	 * @param @param id
	 * @param @return
	 * @return List<EvaluateWaterInfo>
	 * @throws
	 */
	List<EvaluateWaterInfo> selectWaterInfo(@Param(value = "id") String id);
	
	/**
	 * 
	 * @Title: selectLeaseLand
	 * @Description: 查询出租土地信息
	 * @param @param id
	 * @param @return
	 * @return List<EvaluateLandInfo>
	 * @throws
	 */
	List<EvaluateLandInfo> selectLeaseLand(@Param(value = "id") String id);
	
	/**
	 * 
	 * @Title: selectRentLand
	 * @Description: 查询出租土地信息
	 * @param @param id
	 * @param @return
	 * @return List<EvaluateLandInfo>
	 * @throws
	 */
	List<EvaluateLandInfo> selectRentLand(@Param(value = "id") String id);

	/**
	 * 
	 * @Title: insertBaseInfo
	 * @Description: 增加基础信息
	 * @param @param entity
	 * @param @return
	 * @return int
	 * @throws
	 */
	int insertBaseInfo(EvaluateForm entity);
	
	/**
	 * 
	 * @Title: insertEvaluate
	 * @Description: 增加评价指标
	 * @param @param entity
	 * @param @return
	 * @return int
	 * @throws
	 */
	int insertEvaluate(EvaluateForm entity);
	
	/**
	 * 
	 * @Title: insertElectric
	 * @Description: 增加用电信息
	 * @param @param entity
	 * @param @return
	 * @return int
	 * @throws
	 */
	int insertElectric(EvaluateForm entity);
	
	/**
	 * 
	 * @Title: insertWater
	 * @Description: 增加用水信息
	 * @param @param entity
	 * @param @return
	 * @return int
	 * @throws
	 */
	int insertWater(EvaluateForm entity);
	
	/**
	 * 
	 * @Title: insertLeaseLand
	 * @Description: 增加出租土地信息
	 * @param @param entity
	 * @param @return
	 * @return int
	 * @throws
	 */
	int insertLeaseLand(EvaluateForm entity);

	/**
	 * 
	 * @Title: insertRentLand
	 * @Description: 增加承租土地信息
	 * @param @param entity
	 * @param @return
	 * @return int
	 * @throws
	 */
	int insertRentLand(EvaluateForm entity);
	
	/**
	 * 
	 * @Title: updateBaseInfo
	 * @Description: 修改基础信息
	 * @param @param entity
	 * @param @return
	 * @return int
	 * @throws
	 */
	int updateBaseInfo(EvaluateForm entity);

	/**
	 * 
	 * @Title: deleteEvaluateByPid
	 * @Description: 删除评价指标
	 * @param @param id
	 * @param @return
	 * @return int
	 * @throws
	 */
	int deleteEvaluateByPid(@Param(value = "id") String id);

	/**
	 * 
	 * @Title: deleteElectricByPid
	 * @Description: 删除用电信息
	 * @param @param id
	 * @param @return
	 * @return int
	 * @throws
	 */
	int deleteElectricByPid(@Param(value = "id") String id);

	/**
	 * 
	 * @Title: deleteWaterByPid
	 * @Description: 删除用水信息
	 * @param @param id
	 * @param @return
	 * @return int
	 * @throws
	 */
	int deleteWaterByPid(@Param(value = "id") String id);

	/**
	 * 
	 * @Title: deleteLandByPid
	 * @Description: 删除土地信息
	 * @param @param id
	 * @param @return
	 * @return int
	 * @throws
	 */
	int deleteLandByPid(@Param(value = "id") String id);
	
	/**
	 * 查询全部基础信息
	 * @return
	 */
	List<EvaluateBaseInfo> selectBaseInfoAll();

}
