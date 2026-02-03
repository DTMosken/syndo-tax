package com.syndo.project.zhzs.dbfxxt.domain.ts;

import com.syndo.common.core.domain.BaseEntity;

public class Fxtspz extends BaseEntity {
    private String id;
    private String key;
    private String value;
    private String tsrq;
    private String fksx;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getTsrq() {
        return tsrq;
    }

    public void setTsrq(String tsrq) {
        this.tsrq = tsrq;
    }

    public String getFksx() {
        return fksx;
    }

    public void setFksx(String fksx) {
        this.fksx = fksx;
    }
}
