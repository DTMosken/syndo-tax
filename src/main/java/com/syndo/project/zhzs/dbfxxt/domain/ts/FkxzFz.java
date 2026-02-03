package com.syndo.project.zhzs.dbfxxt.domain.ts;

import com.syndo.common.annotation.Excel;
import com.syndo.common.core.domain.BaseEntity;

public class FkxzFz extends BaseEntity {
    private String fzid;
    @Excel(name="分组")
    private String fzmc;

    public String getFzid() {
        return fzid;
    }

    public void setFzid(String fzid) {
        this.fzid = fzid;
    }

    public String getFzmc() {
        return fzmc;
    }

    public void setFzmc(String fzmc) {
        this.fzmc = fzmc;
    }
}
