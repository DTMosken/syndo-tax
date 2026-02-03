package com.syndo.project.zhzs.dbfxxt.domain.lzlgfx;

import com.syndo.common.annotation.Excel;
import com.syndo.common.core.domain.BaseEntity;
/**
 * 户籍比对 - 教育局办学机构未在税务注册
 */
public class Jyjbxjg extends BaseEntity {

    private String id;
    @Excel(name = "单位名称")
    private String dwmc;
    private String jgdm;
    private String type;
    private String flag;
    @Excel(name = "对比类型")
    private String info;
    @Excel(name = "处理单位")
    private String cldw;
    /**
     * 新增字段 addDate:20200410
     */
    @Excel(name = "经营地址")
    private String jydz;
    @Excel(name = "核准登记时间")
    private String hzdjsj;
    @Excel(name = "办学许可证号")
    private String bxxkzh;
    @Excel(name = "经营电话")
    private String jydh;
    private String zsbh;
    @Excel(name = "法人")
    private String fr;
    private String frsj;
    private String cwfzr;
    private String cwfzrsj;
    private String sfbz;
    @Excel(name = "经营范围")
    private String jyfw;
    
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getJgdm() {
        return jgdm;
    }
    public void setJgdm(String jgdm) {
        this.jgdm = jgdm;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public String getFlag() {
        return flag;
    }
    public void setFlag(String flag) {
        this.flag = flag;
    }
    public String getDwmc() {
        return dwmc;
    }
    public void setDwmc(String dwmc) {
        this.dwmc = dwmc;
    }
    public String getInfo() {
        return info;
    }
    public void setInfo(String info) {
        this.info = info;
    }
    public String getCldw() {
        return cldw;
    }
    public void setCldw(String cldw) {
        this.cldw = cldw;
    }
    public String getJydz() {
        return jydz;
    }
    public void setJydz(String jydz) {
        this.jydz = jydz;
    }
    public String getBxxkzh() {
        return bxxkzh;
    }
    public void setBxxkzh(String bxxkzh) {
        this.bxxkzh = bxxkzh;
    }
    public String getZsbh() {
        return zsbh;
    }
    public void setZsbh(String zsbh) {
        this.zsbh = zsbh;
    }
    public String getFr() {
        return fr;
    }
    public void setFr(String fr) {
        this.fr = fr;
    }
	public String getHzdjsj() {
		return hzdjsj;
	}
	public void setHzdjsj(String hzdjsj) {
		this.hzdjsj = hzdjsj;
	}
	public String getJydh() {
		return jydh;
	}
	public void setJydh(String jydh) {
		this.jydh = jydh;
	}
	public String getFrsj() {
		return frsj;
	}
	public void setFrsj(String frsj) {
		this.frsj = frsj;
	}
	public String getCwfzr() {
		return cwfzr;
	}
	public void setCwfzr(String cwfzr) {
		this.cwfzr = cwfzr;
	}
	public String getCwfzrsj() {
		return cwfzrsj;
	}
	public void setCwfzrsj(String cwfzrsj) {
		this.cwfzrsj = cwfzrsj;
	}
	public String getSfbz() {
		return sfbz;
	}
	public void setSfbz(String sfbz) {
		this.sfbz = sfbz;
	}
	public String getJyfw() {
		return jyfw;
	}
	public void setJyfw(String jyfw) {
		this.jyfw = jyfw;
	}
    
}
