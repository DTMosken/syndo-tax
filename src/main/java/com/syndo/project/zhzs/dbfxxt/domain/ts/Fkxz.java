package com.syndo.project.zhzs.dbfxxt.domain.ts;

import java.util.Date;

import com.syndo.common.annotation.Excel;
import com.syndo.common.core.domain.BaseEntity;

/**
 * 风控小组
 */
public class Fkxz extends FkxzFz {
    private long id ;
    /** 用户名 */
    @Excel(name="登录名称")
    private String userName ;
    /** 名字 */
    @Excel(name="姓名")
    private String name ;
    /** 性别;0男，1女，2未知 */
    @Excel(name="性别",readConverterExp = "0=男,1=女,2=未知")
    private String sex ;
    /** 年龄 */
    private String age ;
    /** 联系电话 */
    private String phone ;
    /** 部门 */
    @Excel(name="部门",readConverterExp = "100=数字经济大数据平台,101=财政局,102=税务局,202=住建局,203=自然资源和规划局,204=发展和改革局,205=公安局,206=交通运输局,207=人社局,208=医保局,209=行政审批局,210=工信局,211=统计局,212=水利局,213=生态环境局,214=教育体育局,215=科技局,216=商务局,217=民政局,218=卫健局,219=文旅局,220=残联,221=综合执法局,222=公路局,223=农业农村局,224=公共资源交易中心,225=供电公司,226=投资促进局,227=人民法院,228=司法局,229=市场监督局,230=金融局,231=人民银行,232=烟草局,233=各乡镇街道,234=审计局,235=交警支队直属五大队,236=各商业银行,237=工行,238=于集乡,239=边临镇,240=义渡口镇,241=前孙镇,242=滋镇,243=郑家寨,244=糜镇,245=宋家镇,246=徽王庄镇,247=神头镇,248=临齐街道,249=丁庄镇,250=工商银行,251=农业银行,252=建设银行,253=农商银行,254=中国银行,255=德州银行,256=安德街道,257=发区")
    private String dept ;
    /** 特长 */
    private String speciality ;
    /** 状态;0作为反馈人，1不作为反馈人 */
    private String status ;
    /** 角色;0组员，1组长 */
    private String role ;
    /** 创建时间 */
    private Date createTime ;
    /** 创建人 */
    private String creator ;
    /** 修改时间 */
    private Date updateTime ;
    /** 修改人 */
    private String modifier ;
    
    private String deptName;
    private String userId;

    @Excel(name="分组")
    private String fzmc;

    public String getSexName() {
        // 0=男,1=女,2=未知
        if(sex == null) {
            return null;
        } else if("0".equals(sex)) {
            return "男";
        } else if("1".equals(sex)) {
            return "女";
        } else if("2".equals(sex)) {
            return "未知";
        } else {
            return sex;
        }
    }

    public String getStatusName() {
        //状态;0作为反馈人，1不作为反馈人
        if(status == null) return null;
        else if(status.equals("0")) return "作为反馈人";
        else if(status.equals("1")) return "不作为反馈人";
        else return status;
    }
    public String getRoleName() {
        //角色;0组员，1组长
        if(role == null) return null;
        else if(role.equals("0")) return "组员";
        else if(role.equals("1")) return "组长";
        else  return role;
    }

    @Override
    public String getFzmc() {
        return fzmc;
    }

    @Override
    public void setFzmc(String fzmc) {
        this.fzmc = fzmc;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getModifier() {
        return modifier;
    }

    public void setModifier(String modifier) {
        this.modifier = modifier;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }    
}
