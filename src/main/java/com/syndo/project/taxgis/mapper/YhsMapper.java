package com.syndo.project.taxgis.mapper;

import java.util.List;
import java.util.Map;

import com.syndo.project.taxgis.domain.TaxgisNsrxx;

import org.apache.ibatis.annotations.Param;

public interface YhsMapper {

    List<String> getSwdjxxIds(@Param("shxydm") String shxydm);

    List<String> getGsdjxxIds(@Param("shxydm") String shxydm);

    List<Map<String, String>> getTableCols(@Param("gucode") String gucode);

    List<Map<String, String>> getGcxmxx(@Param("dwmc") String dwmc);

}
