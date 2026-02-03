package com.syndo.project.jjyx.domain;

import com.syndo.common.core.domain.BaseEntity;

public class JjyxData extends BaseEntity {
    private String name;
    private String key;
    private String value;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
}
