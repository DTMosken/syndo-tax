package com.syndo.project.industry.sjsb.domain;

import com.syndo.common.annotation.Excel;
import com.syndo.common.core.domain.BaseEntity;

/**
 * 经济运行状况对象 t_qy_jjyxzk
 * 
 * @author admin
 * @date 2021-01-22
 */
public class TQyJjyxzk extends BaseEntity {
    private static final long serialVersionUID = 1L;

    /** id */
    private String id;

    /** 统一社会信用代码 */
    @Excel(name = "统一社会信用代码")
    private String tyshxydm;

    /** 企业名称 */
    @Excel(name = "企业名称")
    private String qymc;

    /** 企业地址 */
    @Excel(name = "企业地址")
    private String qydz;

    /** 法人代表 */
    @Excel(name = "法人代表")
    private String frdb;

    /** 所属月份 */
    @Excel(name = "所属月份")
    private String ssyf;

    /** 本年 工业总产值[单位: 万元] */
    @Excel(name = "本年工业总产值[单位: 万元]")
    private Long gyzcz;

    /** 本年 销售收入[单位: 万元] */
    @Excel(name = "本年销售收入[单位: 万元]")
    private Long xssr;

    /** 本年 利税[单位: 万元] */
    @Excel(name = "本年利税[单位: 万元]")
    private Long ls;

    /** 去年 工业总产值[单位: 万元] */
    @Excel(name = "去年工业总产值[单位: 万元]")
    private Long lastGyzcz;

    /** 去年 销售收入[单位: 万元] */
    @Excel(name = "去年销售收入[单位: 万元]")
    private Long lastXssr;

    /** 去年 利税[单位: 万元] */
    @Excel(name = "去年利税[单位: 万元]")
    private Long lastLs;

    /** 日期 */
    @Excel(name = "日期")
    private String rq;
    /** 操作用户社会信用代码 */
    private String shxydm;


    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }
    public void setTyshxydm(String tyshxydm) {
        this.tyshxydm = tyshxydm;
    }

    public String getTyshxydm() {
        return tyshxydm;
    }
    public void setQymc(String qymc) {
        this.qymc = qymc;
    }

    public String getQymc() {
        return qymc;
    }
    public void setQydz(String qydz) {
        this.qydz = qydz;
    }

    public String getQydz() {
        return qydz;
    }
    public void setFrdb(String frdb) {
        this.frdb = frdb;
    }

    public String getFrdb() {
        return frdb;
    }
    public void setSsyf(String ssyf) {
        this.ssyf = ssyf;
    }

    public String getSsyf() {
        return ssyf;
    }
    public void setGyzcz(Long gyzcz) {
        this.gyzcz = gyzcz;
    }

    public Long getGyzcz() {
        return gyzcz;
    }
    public void setXssr(Long xssr) {
        this.xssr = xssr;
    }

    public Long getXssr() {
        return xssr;
    }
    public void setLs(Long ls) {
        this.ls = ls;
    }

    public Long getLs() {
        return ls;
    }

    public String getRq() {
        return rq;
    }

    public Long getLastGyzcz() {
        return lastGyzcz;
    }

    public void setLastGyzcz(Long lastGyzcz) {
        this.lastGyzcz = lastGyzcz;
    }

    public Long getLastXssr() {
        return lastXssr;
    }

    public void setLastXssr(Long lastXssr) {
        this.lastXssr = lastXssr;
    }

    public Long getLastLs() {
        return lastLs;
    }

    public void setLastLs(Long lastLs) {
        this.lastLs = lastLs;
    }

    public void setRq(String rq) {
        this.rq = rq;
    }

	public String getShxydm() {
		return shxydm;
	}

	public void setShxydm(String shxydm) {
		this.shxydm = shxydm;
	}

	@Override
	public String toString() {
		return "TQyJjyxzk [id=" + id + ", tyshxydm=" + tyshxydm + ", qymc=" + qymc + ", qydz=" + qydz + ", frdb=" + frdb
				+ ", ssyf=" + ssyf + ", gyzcz=" + gyzcz + ", xssr=" + xssr + ", ls=" + ls + ", lastGyzcz=" + lastGyzcz
				+ ", lastXssr=" + lastXssr + ", lastLs=" + lastLs + ", rq=" + rq + ", shxydm=" + shxydm + "]";
	}

	/*@Override
    public String toString() {
        return "TQyJjyxzk{" +
                "id='" + id + '\'' +
                ", tyshxydm='" + tyshxydm + '\'' +
                ", qymc='" + qymc + '\'' +
                ", qydz='" + qydz + '\'' +
                ", frdb='" + frdb + '\'' +
                ", ssyf='" + ssyf + '\'' +
                ", gyzcz=" + gyzcz +
                ", xssr=" + xssr +
                ", ls=" + ls +
                ", lastGyzcz=" + lastGyzcz +
                ", lastXssr=" + lastXssr +
                ", lastLs=" + lastLs +
                ", rq='" + rq + '\'' +
                '}';
    }*/
}
