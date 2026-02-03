package com.syndo.project.zhzs.dbfxxt.domain.ts;

public enum Lczt {
    /*'流程状态 1已推送，2已反馈，3已归档，3.0自动消除，3.1已退回，3.2消除，3.3转稽查'*/
    DAI_TUI_SONG("0", ""),
    YI_TUI_SONG("1", "待反馈"),
    YI_FAN_KUI("2", "待审核"),
    YI_GUI_DANG("3", "已归档"),
    ZI_DONG_XIAO_CHU("3.0", "已自动消除"),
    YI_TUI_HUI("3.1", "已退回"),
    XIAO_CHU("3.2", "已消除"),
    ZHUAN_JI_CHA("3.3", "转稽查");

    private final String code;
    private final String name;

    private Lczt(String code, String name) {
        this.code = code;
        this.name = name;
    }

    public static String getName(String code) {
        for (Lczt c : Lczt.values()) {
            if (c.getCode().equals(code)) {
                return c.name;
            }
        }
        return code;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Lczt{" +
                "code='" + this.code + '\'' +
                ", name='" + this.name + '\'' +
                '}';
    }
}