package com.syndo.project.zhzs.dbfxxt.domain.ts;

public enum Lczx {
    /*流程走向 1推送，2提交，2.2撤回，3归档，3.1退回，3.2消除, 3.3转稽查*/
    TUI_SONG("1", "推送"),
    TI_JIAO("2", "提交"),
    CHE_HUI("2.2", "撤回"),
    GUI_DANG("3", "归档"),
    XIAO_CHU("3.2", "消除"),
    TUI_HUI("3.1", "退回"),
    ZHUAN_JI_CHA("3.3", "转稽查");
    private final String code;
    private final String name;


    private Lczx(String code, String name) {
        this.code = code;
        this.name = name;
    }

    public static String getName(String code) {
        for (Lczx c : Lczx.values()) {
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
        return "Lcjd{" +
                "code='" + this.code + '\'' +
                ", name='" + this.name + '\'' +
                '}';
    }
}