package com.syndo.project.zhzs.czjbmfg.service.impl;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.syndo.common.annotation.DataScope;
import com.syndo.common.core.domain.AjaxResult;
import com.syndo.common.exception.BusinessException;
import com.syndo.common.utils.StringUtils;
import com.syndo.common.utils.security.ShiroUtils;
import com.syndo.etl.common.constant.EtlConstants;
import com.syndo.etl.dataimp.utils.DataImpUitls;
import com.syndo.etl.meta.domain.MetaData;
import com.syndo.etl.meta.domain.MetaDataItem;
import com.syndo.etl.meta.utils.MetaCacheUtils;
import com.syndo.project.zhzs.czjbmfg.domain.Czglzxkhzjff;
import com.syndo.project.zhzs.czjbmfg.domain.Czzxzjbf;
import com.syndo.project.zhzs.czjbmfg.mapper.CzjbmfgMapper;
import com.syndo.project.zhzs.czjbmfg.service.ICzjbmfgService;
import com.syndo.system.mapper.RoleMapper;
import org.apache.poi.hssf.usermodel.HSSFRichTextString;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.xssf.streaming.SXSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFRichTextString;
import org.checkerframework.checker.units.qual.C;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class CzjbmfgServiceImpl implements ICzjbmfgService {

    //财政各类考核资金发放
    @Autowired(required = false)
    private CzjbmfgMapper czjbmfgMapper;

    @Autowired
    private MetaCacheUtils mateCache;

    @Override
    @DataScope(userAlias = "u",deptAlias = "d")
    public List<Czglzxkhzjff> selectList(Czglzxkhzjff czglzxkhzjff) {
        List<Czglzxkhzjff> lists = czjbmfgMapper.selectList(czglzxkhzjff);
        return lists;
    }

    @Override
    public int insertCzglzxkhzjff(Czglzxkhzjff czglzxkhzjff) {
        int i = czjbmfgMapper.insertCzglzxkhzjff(czglzxkhzjff);
        return i;
    }

    @Override
    public Czglzxkhzjff selectCzglzxkhzjffById(String khid) {
        return czjbmfgMapper.selectCzglzxkhzjffById(khid);
    }

    @Override
    public Integer updateCzglzxkhzjff(Czglzxkhzjff cz) {
        return czjbmfgMapper.updateCzglzxkhzjff(cz);
    }

    @Override
    public Integer deleteKhzjffByIds(String[] split) {
        return czjbmfgMapper.deleteKhzjffByIds(split);
    }


    //财政专项资金拨付
    @DataScope(userAlias = "u",deptAlias = "d")
    @Override
    public List<Czzxzjbf> selectCzzxzjbfList(Czzxzjbf czzxzjbf) {
        return czjbmfgMapper.selectCzzxzjbfList(czzxzjbf);
    }

    @Override
    public int insertCzzxzjbf(Czzxzjbf czzxzjbf) {
        return czjbmfgMapper.insertCzzxzjbf(czzxzjbf);
    }

    @Override
    public Czzxzjbf selectCzzxzjbfById(String khid) {
        return czjbmfgMapper.selectCzzxzjbfById(khid);
    }

    @Override
    public Integer updateCzzxzjbf(Czzxzjbf cz) {
        return czjbmfgMapper.updateCzzxzjbf(cz);
    }

    @Override
    public Integer deleteCzzxzjbfByIds(String[] split) {
        return czjbmfgMapper.deleteCzzxzjbfByIds(split);
    }

}
