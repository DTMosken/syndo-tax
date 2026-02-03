package com.syndo.project.industry.zbgzjs.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.syndo.common.core.mapper.BaseMapper;
import com.syndo.project.industry.sjsb.domain.Flml;
import com.syndo.project.industry.sjsb.domain.Hy;
import com.syndo.project.industry.zbgzjs.domain.ZbGzk;
import com.syndo.project.industry.zbgzjs.domain.Zbk;

public interface ZbGzkMapper extends BaseMapper<ZbGzk> {

	List<Flml> selectFlmlList(@Param("lx") String lx);

	List<Hy> selectHyList();

	List<Hy> selectHyDynamicList(@Param("sjhyDm") String sjhyDm);

	List<Hy> selectHyByHydms(String[] hydms);
	
	int insertFlml(Flml vo);

	Flml selectFlmlById(String id);

	int editFlml(Flml vo);

	int deleteFlmlById(String id);

	int changeYxbz(ZbGzk vo);

	List<ZbGzk> selectZbgzkfzList(ZbGzk entity);

	int insertZbGzkfz(ZbGzk vo);

	int updateZbGzkfz(ZbGzk vo);

	ZbGzk selectZbGzkfzByFzid(String fzid);

	int deleteZbgzkfzByFzids(String[] fzid);

	ZbGzk selectZbGzkfzpxInfo(String fzid);

	int zbgzkfzUpDown(ZbGzk vo);

	int selectFlmlidCnt(@Param("id") String id);

	List<ZbGzk> selectZbgzkfzmxList(@Param("fzid") String fzid);

	int insertZbGzkfzmx(ZbGzk vo);

	Object selectZbGzkfzmxById(String id);

	int updateZbGzkfzmx(ZbGzk vo);

	int deleteZbgzkfzmxByIds(String[] split);

	ZbGzk selectZbGzkfzmxpxInfo(String id);

	int zbgzkfzmxUpDown(ZbGzk z2);

	List<Zbk> selectZbkDynamicList(@Param("id") String id);

	int checkZbid(@Param("fzid") String fzid, @Param("zbid") String zbid, @Param("id") String id);

	int checkInsertFlml(Flml vo);
	
}
