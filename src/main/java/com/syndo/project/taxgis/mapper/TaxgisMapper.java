package com.syndo.project.taxgis.mapper;

import com.syndo.common.core.domain.entity.User;
import com.syndo.common.core.mapper.BaseMapper;
import com.syndo.project.taxgis.domain.GisGlqy;
import com.syndo.project.taxgis.domain.TaxgisNsrxx;

import com.syndo.project.taxgis.domain.TaxgisXmxx;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface TaxgisMapper extends BaseMapper<TaxgisNsrxx> {

        List<TaxgisNsrxx> getNsrxxBz(TaxgisNsrxx vo);

        List<TaxgisNsrxx> getNsrxxBzByNsrmcs(@Param("nsrmcs") String[] nsrmcs);

        int selectNsrxxBzCnt(TaxgisNsrxx vo);

        int insertNsrxxBz(TaxgisNsrxx vo);

        int updateNsrxxBz(TaxgisNsrxx vo);

        int deleteNsrxxBz(TaxgisNsrxx vo);

        List<Map<String, String>> glqywhTreeData(User u);
        
        List<Map<String, String>> glqyTreeData(User u);

        int selectGlqywhCnt(@Param("id") String id);

        int insertQygl(GisGlqy vo);

        int updateQygl(GisGlqy vo);

        int checkDelGlqywh1(@Param("id") String id);

        int checkDelGlqywh2(@Param("id") String id);

        int delGlqywh(@Param("id") String id);

        List<Map<String, String>> xzqhwhTreeData();

        List<TaxgisXmxx> getXmxxBz(TaxgisXmxx xmxx);

        int selectXmxxBzCnt(TaxgisXmxx vo);

        int insertXmxxBz(TaxgisXmxx vo);

        int updateXmxxBz(TaxgisXmxx vo);

        int delXmxxBz(TaxgisXmxx vo);

        List<Map<String, String>> hyTreeData();

        List<TaxgisNsrxx> hyAnalyze(@Param("hyDm") String hyDm);

        List<Map<String, String>> glqyAnalyze(@Param("polygon") String polygon);

        List<Map<String, String>> hyfx(@Param("polygon") String polygon, @Param("cols") String[] cols);

        List<Map<String, String>> szfx(@Param("polygon") String polygon, @Param("cols") String[] cols);

}
