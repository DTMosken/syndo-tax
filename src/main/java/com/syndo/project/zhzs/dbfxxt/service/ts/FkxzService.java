package com.syndo.project.zhzs.dbfxxt.service.ts;

import com.syndo.common.core.domain.AjaxResult;
import com.syndo.common.core.domain.Ztree;
import com.syndo.common.core.domain.entity.Dept;
import com.syndo.common.core.service.BaseService;
import com.syndo.common.exception.BusinessException;
import com.syndo.common.utils.StringUtils;
import com.syndo.common.utils.security.ShiroUtils;
import com.syndo.project.zhzs.dbfxxt.domain.ts.Fkxz;
import com.syndo.project.zhzs.dbfxxt.domain.ts.FkxzFz;
import com.syndo.project.zhzs.dbfxxt.mapper.ts.FkxzMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Service("fkxzService")
public class FkxzService extends BaseService {
    @Autowired
    private FkxzMapper mapper;
    
    public List<Fkxz> selectList(Fkxz vo){
        return mapper.selectList(vo);
    }


    public int checkUserName(Fkxz fkxz) {
        String userId = fkxz.getUserId();
        String userName = fkxz.getUserName();
        // 非选择系统用户
        if(userId != null && userId.trim().length()>0){
            // 检测风控小组表与系统用户表是否存在该登录名
            int cnt = mapper.checkFkxzByUserName(userName);
            if(cnt>0) {
                return 1;
            }
            cnt = mapper.checkSysuserByLoginName(userName);
            return cnt < 2 ? 0 : 2;
        } else {
            // 检测风控小组表是否存在该登录名
            int cnt = mapper.checkFkxzByUserName(userName);
            if (cnt>0) {
                return 1;
            }
            cnt = mapper.checkSysuserByLoginName(userName);
            return cnt < 1 ? 0: 2;
        }
    }

    private static final String ROLE_ZUYUAN = "0";
    private static final String ROLE_ZUZHANG = "1";
    private static final String ROLEKEY_ZUYUAN = "fkxz0";
    private static final String ROLEKEY_ZUZHANG = "fkxz1";
    private static final String STATUS_FKR_YES = "0";

    @Transactional(rollbackFor = Exception.class)
    public int insertFkxz(Fkxz fkxz) {
        String userId = fkxz.getUserId();
        String userName = fkxz.getUserName();
        fkxz.setCreator(ShiroUtils.getUserId());
        int r = 0;
        String role = fkxz.getRole();
        if(role==null) {
            return r;
        }
        else if(ROLE_ZUYUAN.equals(role.trim())){
            // 组员
            String roleId = mapper.selectRoleIdByKey(ROLEKEY_ZUYUAN);
            if(roleId == null || roleId.trim().length() == 0) {
                throw new BusinessException("请先配置组员角色");
            }
            r = mapper.insertFkxz(fkxz);
            // 是否系统用户表有该用户，没有则加上
            List<Fkxz> sysUsers = mapper.selectSysuserByLoginName(userName);
            if(sysUsers != null && sysUsers.size() == 0) {
                mapper.insertSysuser(fkxz);
                userId = fkxz.getUserId();
            }else {
                userId = sysUsers.get(0).getUserId();
            }
            // 重新分配组员角色
            int hasRole = mapper.hasRole(userId, roleId);
            if(hasRole==0) {
                mapper.insertRole(userId, roleId);
            }
        } else if(ROLE_ZUZHANG.equals(role.trim())) {
            // 组长
            String roleId = mapper.selectRoleIdByKey(ROLEKEY_ZUZHANG);
            if(roleId == null || roleId.trim().length() == 0) {
                throw new BusinessException("请先配置组长角色");
            }
            r = mapper.insertFkxz(fkxz);
            // 是否系统用户表有该用户，没有则加上
            List<Fkxz> sysUsers = mapper.selectSysuserByLoginName(userName);
            if(sysUsers != null && sysUsers.size() == 0) {
                mapper.insertSysuser(fkxz);
                userId = fkxz.getUserId();
            }else {
                userId = sysUsers.get(0).getUserId();
            }
            // 重新分配组长角色
            int hasRole = mapper.hasRole(userId, roleId);
            if(hasRole==0) {
                mapper.insertRole(userId, roleId);
            }

            // 若组长的状态是作为反馈人，则需要增加组员角色，不然看不到待办无法反馈
            if(STATUS_FKR_YES.equals(fkxz.getStatus())) {
                // 组员
                roleId = mapper.selectRoleIdByKey(ROLEKEY_ZUYUAN);
                if(roleId == null || roleId.trim().length() == 0) {
                    throw new BusinessException("请先配置组员角色");
                }
                // 重新分配组员角色
                hasRole = mapper.hasRole(userId, roleId);
                if(hasRole==0) {
                    mapper.insertRole(userId, roleId);
                }
            }
        }
        return r;
    }

    @Transactional(rollbackFor = Exception.class)
    public int delete(String ids) {
        String[] var1 = ids.split(",");
        mapper.deleteUserRoleByIds(var1);
        return mapper.deleteByIds(var1);
    }

    @Transactional(rollbackFor = Exception.class)
    public int updateFkxz(Fkxz fkxz) {
        String userId = fkxz.getUserId();
        String userName = fkxz.getUserName();
        fkxz.setModifier(ShiroUtils.getUserId());
        int r = 0;
        String role = fkxz.getRole();
        if(role==null) {
            return r;
        }
        else if(ROLE_ZUYUAN.equals(role.trim())){
            // 组员
            String roleId0 = mapper.selectRoleIdByKey(ROLEKEY_ZUYUAN);
            if(roleId0 == null || roleId0.trim().length() == 0) {
                throw new BusinessException("请先配置组员角色");
            }
            String roleId1 = mapper.selectRoleIdByKey(ROLEKEY_ZUZHANG);
            if(roleId1 == null || roleId1.trim().length() == 0) {
                throw new BusinessException("请先配置组长角色");
            }
            r = mapper.updateFkxz(fkxz);
            mapper.updateSysuser(fkxz);

            // 分配组员角色
            int hasRole0 = mapper.hasRole(userId, roleId0);
            if(hasRole0==0) {
                mapper.insertRole(userId, roleId0);
            }
            // 移除组长角色（组员变组长加上组长角色，不移除组员角色，方便其处理已分配给他的任务；组长变组员直接移除组长角色并添加组员角色）
            int hasRole1 = mapper.hasRole(userId, roleId1);
            if(hasRole1==1) {
                mapper.removeRole(userId, roleId1);
            }
        } else if(ROLE_ZUZHANG.equals(role.trim())) {
            // 组长
            String roleId1 = mapper.selectRoleIdByKey(ROLEKEY_ZUZHANG);
            if(roleId1 == null || roleId1.trim().length() == 0) {
                throw new BusinessException("请先配置组长角色");
            }
            r = mapper.updateFkxz(fkxz);
            mapper.updateSysuser(fkxz);
            // 分配组长角色
            int hasRole = mapper.hasRole(userId, roleId1);
            if(hasRole==0) {
                mapper.insertRole(userId, roleId1);
            }

            // 若组长的状态是作为反馈人，则需要增加组员角色，不然看不到待办无法反馈
            if(STATUS_FKR_YES.equals(fkxz.getStatus())) {
                // 组员
                String roleId = mapper.selectRoleIdByKey(ROLEKEY_ZUYUAN);
                if(roleId == null || roleId.trim().length() == 0) {
                    throw new BusinessException("请先配置组员角色");
                }
                // 重新分配组员角色
                hasRole = mapper.hasRole(userId, roleId);
                if(hasRole==0) {
                    mapper.insertRole(userId, roleId);
                }
            }
        }
        return r;
    }

    public Fkxz selectFkxzById(String id) {
        return mapper.selectFkxzById(id);
    }

    public List<Fkxz> selectFkxzWithoutId(String id, String isRand) {
        // 1随机 0不随机
        return mapper.selectFkxzWithoutId(id, isRand);
    }

    @Transactional(rollbackFor = Exception.class)
    public String importData(List<Fkxz> fkxzList, boolean isUpdateSupport) {
        if (fkxzList != null && fkxzList.size() != 0) {
            int successNum = 0;
            int failureNum = 0;
            StringBuilder successMsg = new StringBuilder();
            StringBuilder failureMsg = new StringBuilder();
            String operName = ShiroUtils.getLoginName();
            String password = "123456";
            Iterator<Fkxz> var9 = fkxzList.iterator();

            while(var9.hasNext()) {
                Fkxz fkxz = var9.next();
                fkxz.setStatus("0");
                fkxz.setRole("0");
                // 根据分组名称获取分组ID，若不存在则插入后再获取id
                fkxz.setFzid(getFzidByFzmc(fkxz.getFzmc()));

                int isUnique = checkUserName(fkxz);
                //if(isUnique==1) return error("风控小组设置中已存在该登录名称，请重新指定一个！");
                //if(isUnique==2) return error("系统用户表已存在该登录名，请重新指定一个或者通过选择系统用户方式添加！");

                if(isUnique == 0 ||(isUnique == 2 && isUpdateSupport)){
                    // 风控小组表与系统用户表都不存在
                    fkxz.setCreator(ShiroUtils.getUserId());
                    String roleId = mapper.selectRoleIdByKey("fkxz0");
                    if(roleId == null || roleId.trim().length() == 0) {
                        throw new BusinessException("请先配置组员角色");
                    }
                    mapper.insertFkxz(fkxz);
                    // 是否系统用户表有该用户，没有则加上
                    List<Fkxz> sysUsers = mapper.selectSysuserByLoginName(fkxz.getUserName());
                    String userId = null;
                    if(sysUsers != null && sysUsers.size() == 0) {
                        mapper.insertSysuser(fkxz);
                        userId = fkxz.getUserId();
                    }else {
                        userId = sysUsers.get(0).getUserId();
                    }
                    // 重新分配组员角色
                    int hasRole = mapper.hasRole(userId, roleId);
                    if(hasRole==0) {
                        mapper.insertRole(userId, roleId);
                    }

                    ++successNum;
                    successMsg.append("<br/>" + successNum + "、账号 " + fkxz.getUserName() + " 导入成功");
                } else if(isUnique == 1 && isUpdateSupport) {
                    // 风控小组设置中已存在该登录名称
                    fkxz.setModifier(ShiroUtils.getUserId());

                    Fkxz older = mapper.selectFkxzByUsername(fkxz.getUserName());
                    if(older != null) {
                        fkxz.setId(older.getId());
                        String userId = older.getUserId();
                        fkxz.setUserId(userId);

                        String roleId0 = mapper.selectRoleIdByKey(ROLEKEY_ZUYUAN);
                        if (roleId0 == null || roleId0.trim().length() == 0) {
                            throw new BusinessException("请先配置组员角色");
                        }
                        String roleId1 = mapper.selectRoleIdByKey(ROLEKEY_ZUZHANG);
                        if (roleId1 == null || roleId1.trim().length() == 0) {
                            throw new BusinessException("请先配置组长角色");
                        }
                        mapper.updateFkxz(fkxz);
                        mapper.updateSysuser(fkxz);

                        // 分配组员角色
                        int hasRole0 = mapper.hasRole(userId, roleId0);
                        if (hasRole0 == 0) {
                            mapper.insertRole(userId, roleId0);
                        }
                        // 移除组长角色（组员变组长加上组长角色，不移除组员角色，方便其处理已分配给他的任务；组长变组员直接移除组长角色并添加组员角色）
                        int hasRole1 = mapper.hasRole(userId, roleId1);
                        if (hasRole1 == 0) {
                            mapper.removeRole(userId, roleId1);
                        }

                        ++successNum;
                        successMsg.append("<br/>" + successNum + "、账号 " + fkxz.getUserName() + " 导入成功");
                    } else {
                        ++failureNum;
                        failureMsg.append("<br/>" + failureNum + "、账号 " + fkxz.getUserName() + " 未获取到之前信息");
                    }

                } else if((isUnique == 1 || isUnique == 2) && !isUpdateSupport) {
                    ++failureNum;
                    failureMsg.append("<br/>" + failureNum + "、账号 " + fkxz.getUserName() + " 已存在");
                }

            }

            if (failureNum > 0) {
                failureMsg.insert(0, "很抱歉，导入失败！共 " + failureNum + " 条数异常，错误如下：");
                throw new BusinessException(failureMsg.toString());
            } else {
                successMsg.insert(0, "恭喜您，数据已全部导入成功！共 " + successNum + " 条，数据如下：");
                return successMsg.toString();
            }
        } else {
            throw new BusinessException("导入数据不能为空！");
        }
    }

    public List<Ztree> selectFzTree() {
        List<FkxzFz> fkxzFzs = mapper.selectFkxzFzList();
        List<Ztree> ztrees = initFzZtree(fkxzFzs);
        return ztrees;
    }

    private List<Ztree> initFzZtree(List<FkxzFz> fkxzFzs) {
        List<Ztree> ztrees = new ArrayList();
        Iterator var5 = fkxzFzs.iterator();

        while(var5.hasNext()) {
            FkxzFz fz = (FkxzFz)var5.next();

            Ztree ztree = new Ztree();
            ztree.setId(fz.getFzid());
            ztree.setpId("0");
            ztree.setName(fz.getFzmc());
            ztree.setTitle(fz.getFzmc());

            ztrees.add(ztree);
        }

        return ztrees;
    }

    private String getFzidByFzmc(String fzmc) {
        if (StringUtils.isEmpty(fzmc)) {
            throw new BusinessException("分组列不能为空！");
        }
        FkxzFz fz = mapper.selectFkxzFzByFzmc(fzmc);
        if(fz == null) {
            fz = new FkxzFz();
            fz.setFzmc(fzmc);
            insertFkxzFz(fz);
            fz = mapper.selectFkxzFzByFzmc(fzmc);
        }
        return fz.getFzid();
    }

    public int insertFkxzFz(FkxzFz fz) {
        return mapper.insertFkxzFz(fz);
    }

    public int updateFkxzFz(FkxzFz fz) {
        return mapper.updateFkxzFz(fz);
    }

    public FkxzFz selectFkxzFzByFzid(String fzid) {
        return mapper.selectFkxzFzByFzid(fzid);
    }

    public AjaxResult deleteFz(String fzid) {
        int cnt = mapper.checkDeleteFz(fzid);
        if(cnt > 0) {
            return AjaxResult.error("操作失败，不能删除有成员的分组！");
        }
        int r = mapper.deleteFzByFzid(fzid);
        return r > 0 ? AjaxResult.success() : AjaxResult.error();
    }

    public FkxzFz selectFkxzFzByUserid(String userId) {
        return mapper.selectFkxzFzByUserid(userId);
    }
}
