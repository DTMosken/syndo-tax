package com.syndo.project.zhzs.dbfxxt.service.ts;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.syndo.common.core.domain.entity.User;
import com.syndo.common.core.service.BaseService;
import com.syndo.common.utils.DateUtils;
import com.syndo.common.utils.security.ShiroUtils;
import com.syndo.project.zhzs.dbfxxt.domain.ts.TsForm;
import com.syndo.project.zhzs.dbfxxt.domain.ts.Zbxx;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TsService extends BaseService {

    @Autowired
    private ZbxxService zbxxService;

    private TsForm getTsForm(String zbdm) {
        TsForm entity = new TsForm();
        entity.setZbdm(zbdm);
        Zbxx zbxx = zbxxService.selectByZbdm(zbdm);
        if (zbxx != null) {
            entity.setZbmc(zbxx.getZbmc());

            List<Map<String,String>> colsList = new ArrayList<>();
            String cols = zbxx.getCols();
            if (cols != null) {
                List<String> split1s = split2List(cols);
                if (split1s != null && split1s.size() > 0) {
                    for (String splist1 : split1s) {
                        if (splist1 != null) {
                            List<String> split2s = split2List(splist1, ":");
                            if (split2s != null && split2s.size() == 2) {
                                Map<String,String> m = new HashMap<>();
                                m.put("column", split2s.get(1));
                                m.put("label", split2s.get(0));
                                colsList.add(m);
                            }
                        }
                    }
                }
                entity.setCols(colsList);
            }
        }

        User user = ShiroUtils.getSysUser();
        if (user != null) {
            entity.setTsrmc(user.getUserName());
        }

        entity.setTssj(DateUtils.getDate());
        return entity;
    }

    public TsForm getZxtsForm(String zbdm) {
        return getTsForm(zbdm);
    }

    public TsForm getCytsForm(String zbdm) {
        return getTsForm(zbdm);
    }

}
