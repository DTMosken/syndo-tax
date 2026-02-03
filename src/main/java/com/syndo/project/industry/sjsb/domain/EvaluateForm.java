package com.syndo.project.industry.sjsb.domain;

import java.util.List;

/**
 * 
 * @ClassName: EvaluateForm @Description： 亩产评价表
 * @author ykc
 * @date 2020-8-19
 *
 */
public class EvaluateForm extends EvaluateBaseInfo {

	/**
	 * @Fields serialVersionUID : TODO
	 */
	private static final long serialVersionUID = 1L;

	private String pid; // 父表id
	private String gyzjz; // 统计局-工业增加值（万元）
	private String npjzgrs; // 统计局-年平均职工人数（人）
	private String yfjfzc; // 统计局-研发经费支出（万元）
	private String nzhnh; // 统计局-年综合能耗（吨标煤）
	private String zyywsr; // 税务局-主营业务收入（万元）
	private String sjss; // 企业自填-实缴税收（万元）
	
	private String pfl; // 生态环境局-排放量（吨）
	private String ydl; // 电力公司-用电量（度）
	private String ydhyqk; // 电力公司-用电合用情况（0：是，1：否）
	private String nysl; // 水务公司-年用水量（吨）
	private String yshyqk; // 水务公司-用水合用情况（0：是，1：否）
	private String sjydmj; // 土地-实际用地面积
	private String jzmj; // 土地-建筑面积（无独立产房）
	private String ssmj; // 土地-宿舍面积
	private String yspdjtdzmj; // 土地-已审批、登记土地总面积
	private String swjhdssjss;//税务局核定数-实缴税收（万元）
	private String thjhdsgyzjz;//税务局核定数-工业增加值
	private String thjhdsnpjzgrs;//税务局核定数-年平均职工人数
	private String thjhdsyfjfzc;//税务局核定数-研发经费支出
	private String thjhdsnzhnh;//税务局核定数-年综合能耗
	private String swjhdszyywsr;//税务局核定数-主营业务收入
	private String sthjjpfl;//税务局核定数-生态环境局核定数
	private String gdjhdsydl;//税务局核定数-用电量（度）
	private String gdjhdsydhyqk;//税务局用电合用情况
	private String zrzyjhdhdtdzmj;//自然资源和规划局核定核定土地总面积
	private String szxqshydmj;//实际用地面积
	private String szxqshyspmj;//已审批面积(平方米)
	private String szxqshwspmj;//未审批面积(平方米)
	private String szxqshdcrxm;//调查人签名
	private String szxqshshrxm;//审核人签名
	private List<EvaluateElectricInfo> eeiList; // 用电信息
	private List<EvaluateWaterInfo> ewiList; // 用水信息	
	private List<EvaluateLandInfo> ellList; // 出租土地信息
	private List<EvaluateLandInfo> erlList; // 承租土地信息
	
	
	public String getPid() {
		return pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}
 
	public String getSwjhdssjss() {
		return swjhdssjss;
	}
	public void setSwjhdssjss(String swjhdssjss) {
		this.swjhdssjss = swjhdssjss;
	}
	public String getGyzjz() {
		return gyzjz;
	}
	public void setGyzjz(String gyzjz) {
		this.gyzjz = gyzjz;
	}
	public String getNpjzgrs() {
		return npjzgrs;
	}
	public void setNpjzgrs(String npjzgrs) {
		this.npjzgrs = npjzgrs;
	}
	public String getYfjfzc() {
		return yfjfzc;
	}
	public void setYfjfzc(String yfjfzc) {
		this.yfjfzc = yfjfzc;
	}
	public String getNzhnh() {
		return nzhnh;
	}
	public void setNzhnh(String nzhnh) {
		this.nzhnh = nzhnh;
	}
	public String getZyywsr() {
		return zyywsr;
	}
	public void setZyywsr(String zyywsr) {
		this.zyywsr = zyywsr;
	}
	public String getSjss() {
		return sjss;
	}
	public void setSjss(String sjss) {
		this.sjss = sjss;
	}
	public String getPfl() {
		return pfl;
	}
	public void setPfl(String pfl) {
		this.pfl = pfl;
	}
	public String getYdl() {
		return ydl;
	}
	public void setYdl(String ydl) {
		this.ydl = ydl;
	}
	public String getYdhyqk() {
		return ydhyqk;
	}
	public void setYdhyqk(String ydhyqk) {
		this.ydhyqk = ydhyqk;
	}
	public String getNysl() {
		return nysl;
	}
	public void setNysl(String nysl) {
		this.nysl = nysl;
	}
	public String getYshyqk() {
		return yshyqk;
	}
	public void setYshyqk(String yshyqk) {
		this.yshyqk = yshyqk;
	}
	public String getSjydmj() {
		return sjydmj;
	}
	public void setSjydmj(String sjydmj) {
		this.sjydmj = sjydmj;
	}
	public String getJzmj() {
		return jzmj;
	}
	public void setJzmj(String jzmj) {
		this.jzmj = jzmj;
	}
	public String getSsmj() {
		return ssmj;
	}
	public void setSsmj(String ssmj) {
		this.ssmj = ssmj;
	}
	public String getYspdjtdzmj() {
		return yspdjtdzmj;
	}
	public void setYspdjtdzmj(String yspdjtdzmj) {
		this.yspdjtdzmj = yspdjtdzmj;
	}
	public List<EvaluateElectricInfo> getEeiList() {
		return eeiList;
	}
	public void setEeiList(List<EvaluateElectricInfo> eeiList) {
		this.eeiList = eeiList;
	}
	public List<EvaluateWaterInfo> getEwiList() {
		return ewiList;
	}
	public void setEwiList(List<EvaluateWaterInfo> ewiList) {
		this.ewiList = ewiList;
	}
	public List<EvaluateLandInfo> getEllList() {
		return ellList;
	}
	public void setEllList(List<EvaluateLandInfo> ellList) {
		this.ellList = ellList;
	}
	public List<EvaluateLandInfo> getErlList() {
		return erlList;
	}
	public void setErlList(List<EvaluateLandInfo> erlList) {
		this.erlList = erlList;
	}
	
	public String getThjhdsgyzjz() {
		return thjhdsgyzjz;
	}
	public void setThjhdsgyzjz(String thjhdsgyzjz) {
		this.thjhdsgyzjz = thjhdsgyzjz;
	}
	public String getThjhdsnpjzgrs() {
		return thjhdsnpjzgrs;
	}
	public void setThjhdsnpjzgrs(String thjhdsnpjzgrs) {
		this.thjhdsnpjzgrs = thjhdsnpjzgrs;
	}
	public String getThjhdsyfjfzc() {
		return thjhdsyfjfzc;
	}
	public void setThjhdsyfjfzc(String thjhdsyfjfzc) {
		this.thjhdsyfjfzc = thjhdsyfjfzc;
	}
	public String getThjhdsnzhnh() {
		return thjhdsnzhnh;
	}
	public void setThjhdsnzhnh(String thjhdsnzhnh) {
		this.thjhdsnzhnh = thjhdsnzhnh;
	}
	public String getSwjhdszyywsr() {
		return swjhdszyywsr;
	}
	public void setSwjhdszyywsr(String swjhdszyywsr) {
		this.swjhdszyywsr = swjhdszyywsr;
	}
	public String getSthjjpfl() {
		return sthjjpfl;
	}
	public void setSthjjpfl(String sthjjpfl) {
		this.sthjjpfl = sthjjpfl;
	}
	public String getGdjhdsydl() {
		return gdjhdsydl;
	}
	public void setGdjhdsydl(String gdjhdsydl) {
		this.gdjhdsydl = gdjhdsydl;
	}
	public String getGdjhdsydhyqk() {
		return gdjhdsydhyqk;
	}
	public void setGdjhdsydhyqk(String gdjhdsydhyqk) {
		this.gdjhdsydhyqk = gdjhdsydhyqk;
	}
	public String getZrzyjhdhdtdzmj() {
		return zrzyjhdhdtdzmj;
	}
	public void setZrzyjhdhdtdzmj(String zrzyjhdhdtdzmj) {
		this.zrzyjhdhdtdzmj = zrzyjhdhdtdzmj;
	}
	public String getSzxqshydmj() {
		return szxqshydmj;
	}
	public void setSzxqshydmj(String szxqshydmj) {
		this.szxqshydmj = szxqshydmj;
	}
	public String getSzxqshyspmj() {
		return szxqshyspmj;
	}
	public void setSzxqshyspmj(String szxqshyspmj) {
		this.szxqshyspmj = szxqshyspmj;
	}
	public String getSzxqshwspmj() {
		return szxqshwspmj;
	}
	public void setSzxqshwspmj(String szxqshwspmj) {
		this.szxqshwspmj = szxqshwspmj;
	}
	public String getSzxqshdcrxm() {
		return szxqshdcrxm;
	}
	public void setSzxqshdcrxm(String szxqshdcrxm) {
		this.szxqshdcrxm = szxqshdcrxm;
	}
	public String getSzxqshshrxm() {
		return szxqshshrxm;
	}
	public void setSzxqshshrxm(String szxqshshrxm) {
		this.szxqshshrxm = szxqshshrxm;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "EvaluateForm [pid=" + pid + ", gyzjz=" + gyzjz + ", npjzgrs=" + npjzgrs + ", yfjfzc=" + yfjfzc
				+ ", nzhnh=" + nzhnh + ", zyywsr=" + zyywsr + ", sjss=" + sjss + ", pfl=" + pfl + ", ydl=" + ydl
				+ ", ydhyqk=" + ydhyqk + ", nysl=" + nysl + ", yshyqk=" + yshyqk + ", sjydmj=" + sjydmj + ", jzmj="
				+ jzmj + ", ssmj=" + ssmj + ", yspdjtdzmj=" + yspdjtdzmj + ", swjhdssjss=" + swjhdssjss + ", eeiList="
				+ eeiList + ", ewiList=" + ewiList + ", ellList=" + ellList + ", erlList=" + erlList + "]";
	}
 
 
	
}
