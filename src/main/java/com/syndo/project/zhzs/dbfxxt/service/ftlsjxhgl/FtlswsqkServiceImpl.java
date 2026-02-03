package com.syndo.project.zhzs.dbfxxt.service.ftlsjxhgl;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.syndo.common.core.service.BaseService;
import com.syndo.common.utils.StringUtils;
import com.syndo.common.utils.text.Convert;
import com.syndo.project.zhzs.dbfxxt.domain.ftlsjxhgl.Ftlswsqk;
import com.syndo.project.zhzs.dbfxxt.mapper.ftlsjxhgl.FtlswsqkMapper;
/**
 * 房土两税精细化管理-房土两税完税情况
 */
@Service
public class FtlswsqkServiceImpl extends BaseService implements IFtlswsqkService {

    @Autowired
    private FtlswsqkMapper mapper;
    
    @Override
    public List<Ftlswsqk> selectList(Ftlswsqk entity) {
        String jd = entity.getJd();
        if(StringUtils.isNotEmpty(jd)) {
            String[] jds = Convert.toStrArray(jd);
            entity.setJdlist(Arrays.asList(jds));
        }
        return mapper.selectList(entity);
    }

}
