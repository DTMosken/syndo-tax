package com.syndo.project.zhzs.srfxxt.service.xtwh;

import com.syndo.common.core.service.BaseService;
import com.syndo.common.utils.StringUtils;
import com.syndo.project.zhzs.srfxxt.domain.xtwh.Srqkwh;
import com.syndo.project.zhzs.srfxxt.mapper.xtwh.SrqkwhMapper;
import com.syndo.system.domain.Config;
import com.syndo.system.service.IConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SrqkwhService extends BaseService {
    private static final String configKey = "sys.sy_ss_sjy";
    @Autowired
    private SrqkwhMapper mapper;
    @Autowired
    private IConfigService configService;

    public List<Srqkwh> selectList(Srqkwh vo){
        return mapper.selectList(vo);
    }

    public Srqkwh selectSrqkwhById(String id) {
        return mapper.selectById(id);
    }

    /**
     * 获取首页数据源配置
     * @return srxx/rkxx
     */
    public String getSy_ss_sjy(){
        String sy_ss_sjy = configService.selectConfigByKey(configKey);
        if (sy_ss_sjy != null && sy_ss_sjy.trim().equalsIgnoreCase("srxx")) {
            // 收入信息表
            return "srxx";
        } else {
            // 税务入库信息
            return "rkxx";
        }
    }

    public int setSjy(String sjy) {
        Config config = new Config();
        config.setConfigName("首页收入数据源");
        config.setConfigKey(configKey);
        config.setConfigValue(sjy);
        config.setConfigType("Y");
        if (configService.checkConfigKeyUnique(config).equals("0")) {
            return configService.insertConfig(config);
        } else {
            Config param = new Config();
            param.setConfigKey(configKey);
            List<Config> list = configService.selectConfigList(param);
            if(list!=null && !list.isEmpty()) {
                config.setConfigId(list.get(0).getConfigId());
                return configService.updateConfig(config);
            }
            return 0;
        }
    }

    public int insert(Srqkwh srqkwh) {
        return mapper.insert(srqkwh);
    }

    public int update(Srqkwh srqkwh) {
        return mapper.update(srqkwh);
    }

    public int delete(String ids) {
        if(ids != null) {
            String[] list = StringUtils.split(ids, ",");
            return mapper.deleteByIds(list);
        }
        return 0;
    }

    public Srqkwh getBySsq(Srqkwh srqkwh) {
        return mapper.getBySsq(srqkwh);
    }
}
