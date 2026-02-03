package com.syndo.project.zhzs.dbfxxt.domain.ts;

public enum Lcjd {
    /*'流程节点 0指标运行，1反馈，2审核，3归档，3.0自动消除，3.2消除无风险疑点，3.3稽查'*/
    ZHI_BIAO_YUN_XING("0", "指标运行"),
    FAN_KUI("1", "反馈"),
    SHEN_HE("2", "审核"),
    GUI_DANG("3", "归档"),
    ZI_DONG_XIAO_CHU("3.0", "自动消除"),
    QU_XIAO_FENG_XIAN("3.2", "消除无风险疑点"),
    ZHUAN_JI_CHA("3.3", "稽查");

    private final String code;
    private final String name;

    private Lcjd(String code, String name) {
        this.code = code;
        this.name = name;
    }

    public static String getName(String code) {
        for (Lcjd c : Lcjd.values()) {
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