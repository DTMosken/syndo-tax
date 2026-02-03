package com.syndo.project.zhzs.dbfxxt.domain.ts;

import com.syndo.common.core.domain.BaseEntity;

public class TsBase extends BaseEntity {
//    // 推送ID delete
//    private String tsid;
//    // 推送状态 delete
//	private String tszt;
	// 反馈id
	private String fkid;
	// 状态 0待推送 1待反馈 2已反馈
    private String zt;
//	// 反馈类型
//	private String fklx;

//    // 推送方式，0自选推送，1抽样推送，2全量推送
//    private String tsfs = "0";
//    // 抽样数量
//    private int cysl = 0;

    public String getFkid() {
        return fkid;
    }

    public void setFkid(String fkid) {
        this.fkid = fkid;
    }

    public String getZt() {
        return zt;
    }

    public void setZt(String zt) {
        this.zt = zt;
    }

//    public String getTsfs() {
//        return tsfs;
//    }
//    public void setTsfs(String tsfs) {
//        this.tsfs = tsfs;
//    }
//    public int getCysl() {
//        return cysl;
//    }
//    public void setCysl(int cysl) {
//        this.cysl = cysl;
//    }
//    public String getTsid() {
//        return tsid;
//    }
//    public void setTsid(String tsid) {
//        this.tsid = tsid;
//    }
//    public String getTszt() {
//		return tszt;
//	}
//	public void setTszt(String tszt) {
//		this.tszt = tszt;
//	}
//	public String getFklx() {
//		return fklx;
//	}
//	public void setFklx(String fklx) {
//		this.fklx = fklx;
//	}

    /**
     * 状态名称 0待推送 1待反馈 2已反馈
     */
	public String getZtmc() {
		return Lczt.getName(zt);
    }
//    /**
//     * 推送状态：0未推送，1已推送，2已撤回推送,3已反馈，4已撤回反馈
//     */
//    public String getTsztmc() {
//        if(tszt==null) {
//            return "未推送";
//        } else if("0".equals(tszt)){
//            return "未推送";
//        } else if("1".equals(tszt)){
//            return "已推送";
//        } else if("2".equals(tszt)){
//            return "已撤回推送";
//        } else if("3".equals(tszt)){
//            return "已反馈";
//        } else if("4".equals(tszt)){
//            return "已撤回反馈";
//        } else {
//            return "";
//        }
//    }
//    /**
//    * 反馈类型：0无风险反馈，1未整改反馈，2已整改反馈
//    */
//    public String getFklxmc() {
//        if(fklx == null) {
//            return null;
//        } else if("0".equals(fklx)) {
//            return "无风险反馈";
//        } else if("1".equals(fklx)) {
//            return "未整改反馈";
//        } else if("2".equals(fklx)) {
//            return "已整改反馈";
//        } else {
//            return "";
//        }
//    }
    
}
