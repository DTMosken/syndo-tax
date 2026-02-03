package com.syndo.project.zhzs.dbfxxt.service.ts;

import com.syndo.common.config.ServerConfig;
import com.syndo.common.core.domain.AjaxResult;
import com.syndo.common.core.service.BaseService;
import com.syndo.common.utils.security.ShiroUtils;
import com.syndo.project.zhzs.dbfxxt.domain.ts.*;
import com.syndo.project.zhzs.dbfxxt.mapper.ts.DbrwMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service("dbrw")
public class DbrwService extends BaseService {
    @Autowired
    private DbrwMapper mapper;
    @Autowired
    private ZbxxService zbxxService;
    @Autowired
    private ServerConfig serverConfig;

    public List<Dbrw> selectList(Dbrw entity) {
        entity.setFkr(ShiroUtils.getUserId());
        return mapper.selectList(entity);
    }

    public boolean isFkxz() {
        String userId = ShiroUtils.getUserId();
        int cnt = mapper.checkIsFkxz(userId);
        return cnt>0;
    }

    public Rwsh initRwfk(String id) {
        Rwsh rwfk = mapper.selectFkbById(id);
        if(rwfk != null) {
            Zbxx zbxx = zbxxService.selectByZbdm(rwfk.getZbdm());
            if (zbxx != null) {
                rwfk.setZbmc(zbxx.getZbmc());
                List<Map<String, String>> colsList = new ArrayList<>();
                String cols = zbxx.getCols();
                if (cols != null) {
                    List<String> split1s = split2List(cols);
                    if (split1s != null && !split1s.isEmpty()) {
                        for (String splist1 : split1s) {
                            if (splist1 != null) {
                                List<String> split2s = split2List(splist1, ":");
                                if (split2s != null && split2s.size() == 2) {
                                    Map<String, String> m = new HashMap<>(2);
                                    m.put("column", split2s.get(1));
                                    m.put("label", split2s.get(0));
                                    colsList.add(m);
                                }
                            }
                        }
                    }
                    rwfk.setCols(colsList);
                }
            }
            List<Map<String,String>> rows = new ArrayList<>();
            Map<String,String> row = new HashMap<>();
            List<Rwfk> fkmxList = mapper.selectFkmxByFkid(id);
            if(fkmxList != null && !fkmxList.isEmpty()){
                row.put("id", fkmxList.get(0).getFkid());
                row.put("zbmc", rwfk.getZbmc());
                for(Rwfk tmp: fkmxList) {
                    row.put(tmp.getMxkey(), tmp.getMxvalue());
                }
            }
            rows.add(row);
            rwfk.setRows(rows);

            //处理反馈图片
            List<Map<String,String>> fktps = new ArrayList<>();
            if (rwfk.getFktp() != null) {
                List<String> list = split2List(rwfk.getFktp(), ";");
                if (list != null && !list.isEmpty()) {
                    for (String s : list) {
                        Map<String, String> m = new HashMap<>(2);
                        m.put("fileName", s);
                        m.put("url", serverConfig.getUrl() + s);
                        fktps.add(m);
                    }
                }
            }
            rwfk.setFktps(fktps);
        }
        return rwfk;
    }

    public Rwfk initPlrwfk(String ids) {
        List<String> idList = this.split2List(ids,"a");
        Rwfk rwfk = mapper.selectFkbById(idList.get(0));
        if(rwfk != null) {
            Zbxx zbxx = zbxxService.selectByZbdm(rwfk.getZbdm());
            if (zbxx != null) {
                rwfk.setZbmc(zbxx.getZbmc());
                List<Map<String, String>> colsList = new ArrayList<>();
                String cols = zbxx.getCols();
                if (cols != null) {
                    List<String> split1s = split2List(cols);
                    if (split1s != null && !split1s.isEmpty()) {
                        for (String splist1 : split1s) {
                            if (splist1 != null) {
                                List<String> split2s = split2List(splist1, ":");
                                if (split2s != null && split2s.size() == 2) {
                                    Map<String, String> m = new HashMap<>(2);
                                    m.put("column", split2s.get(1));
                                    m.put("label", split2s.get(0));
                                    colsList.add(m);
                                }
                            }
                        }
                    }
                    rwfk.setCols(colsList);
                }
            }
            List<Map<String,String>> rows = new ArrayList<>();
            for(String id: idList) {
                Map<String, String> row = new HashMap<>();
                List<Rwfk> fkmxList = mapper.selectFkmxByFkid(id);
                if (fkmxList != null && !fkmxList.isEmpty()) {
                    row.put("id", fkmxList.get(0).getFkid());
                    row.put("zbdm", rwfk.getZbdm());
                    row.put("zbmc", rwfk.getZbmc());
                    for (Rwfk tmp : fkmxList) {
                        row.put(tmp.getMxkey(), tmp.getMxvalue());
                    }
                }
                rows.add(row);
            }
            rwfk.setRows(rows);

            //处理反馈图片
            List<Map<String,String>> fktps = new ArrayList<>();
            rwfk.setFktps(fktps);
        }
        return rwfk;
    }
    
    @Transactional(rollbackFor = Exception.class)
    public AjaxResult rwfk(Rwfk rwfk) {
    	int cnt = mapper.checkFkIsNeeded(rwfk.getId());
    	if(cnt != 1) {
    		return AjaxResult.error("当前任务不可反馈，请检查该任务状态！");
    	}
        if(rwfk.getFksj() == null || "".equals(rwfk.getFksj())) {
            rwfk.setFkr(ShiroUtils.getUserId());
        } else {
            rwfk.setXgfkr(ShiroUtils.getUserId());
        }
        int result = mapper.rwfk(rwfk);
        Lzxx lzxx = getLzxx(rwfk, Lcjd.FAN_KUI.getCode(), Lczx.TI_JIAO.getCode());
        if(lzxx != null) {
            mapper.saveLzxx(lzxx);
        }
        return result > 0 ? AjaxResult.success() : AjaxResult.error();
    }

    @Transactional(rollbackFor = Exception.class)
    public AjaxResult rwfkpl(Rwfk rwfk) {
        rwfk.setFkr(ShiroUtils.getUserId());

        String ids = rwfk.getIds();
        List<String> idList = split2List(ids,"a");
        for(String id: idList){
        	int cnt = mapper.checkFkIsNeeded(id);
        	if(cnt != 1) {
        		return AjaxResult.error("当前任务["+id+"]不可反馈，请检查该任务状态！");
        	}
            rwfk.setId(id);
            int result = mapper.rwfk(rwfk);
            Lzxx lzxx = getLzxx(rwfk, Lcjd.FAN_KUI.getCode(), Lczx.TI_JIAO.getCode());
            if(lzxx != null) {
                mapper.saveLzxx(lzxx);
            }
            if(result == 0) {
                return AjaxResult.error();
            }
        }
        return AjaxResult.success();
    }

	@Transactional(rollbackFor = Exception.class)
	public AjaxResult rwfk2(Rwfk rwfk) {
		int cnt = mapper.checkCancelfkIsNeeded(rwfk.getId());
    	if(cnt != 1) {
    		return AjaxResult.error("当前任务不可撤回反馈，请检查该任务状态！");
    	}
    	int result = mapper.cancelfk(rwfk);
    	Lzxx lzxx = getLzxx(rwfk, Lcjd.FAN_KUI.getCode(), Lczx.CHE_HUI.getCode());
        if(lzxx != null) {
            mapper.saveLzxx(lzxx);
        }
        return result > 0 ? AjaxResult.success() : AjaxResult.error();
	}
	
	@Transactional(rollbackFor = Exception.class)
	public AjaxResult rwfkpl2(Rwfk rwfk) {
		rwfk.setFkr(ShiroUtils.getUserId());

        String ids = rwfk.getIds();
        List<String> idList = split2List(ids,"a");
        for(String id: idList){
        	int cnt = mapper.checkCancelfkIsNeeded(id);
        	if(cnt != 1) {
        		return AjaxResult.error("当前任务["+id+"]不可撤回反馈，请检查该任务状态！");
        	}
            rwfk.setId(id);
            int result = mapper.cancelfk(rwfk);
            
            Lzxx lzxx = getLzxx(rwfk, Lcjd.FAN_KUI.getCode(), Lczx.CHE_HUI.getCode());
            if(lzxx != null) {
                mapper.saveLzxx(lzxx);
            }
            if(result == 0) {
                return AjaxResult.error();
            }
        }
        return AjaxResult.success();
	}

    public String getCkmxUrl(String id) throws UnsupportedEncodingException {
        Rwfk rwfk = mapper.selectFkbById(id);
        if(rwfk != null) {
            Zbxx zbxx = zbxxService.selectByZbdm(rwfk.getZbdm());
            if(zbxx != null) {
                return zbxx.getUrl() + "?nsrmc=" + URLEncoder.encode(rwfk.getNsrmc(),"UTF-8");
            }
        }
        return null;
    }

	public List<String> getRoles(String userId) {
		return mapper.getRoles(userId);
	}

	public Rwsh initRwsh(String id) {
		Rwsh rwsh = (Rwsh) initRwfk(id);		
		return rwsh;
	}

	@Transactional(rollbackFor = Exception.class)
	public AjaxResult rwsh(Rwsh rwsh) {
		int cnt = mapper.checkShIsNeeded(rwsh.getId());
    	if(cnt != 1) {
    		return AjaxResult.error("当前任务不可审核，请检查该任务状态！");
    	}
        rwsh.setShr(ShiroUtils.getUserId());
        int result = mapper.rwsh(rwsh);
        Lzxx lzxx = getLzxx(rwsh, Lcjd.SHEN_HE.getCode(), rwsh.getZt());
        if(lzxx != null) {
            mapper.saveLzxx(lzxx);
        }
        return result > 0 ? AjaxResult.success() : AjaxResult.error();
	}
	
	@Transactional(rollbackFor = Exception.class)
	public AjaxResult rwsh2(Rwsh rwsh) {
		int cnt = mapper.checkShIsNeeded(rwsh.getId());
    	if(cnt != 1) {
    		return AjaxResult.error("当前任务不可退回，请检查该任务状态！");
    	}
        rwsh.setShr(ShiroUtils.getUserId());
        int result = mapper.rwshGoback(rwsh);
        Lzxx lzxx = getLzxx(rwsh, Lcjd.SHEN_HE.getCode(), Lczx.TUI_HUI.getCode());
        if(lzxx != null) {
            mapper.saveLzxx(lzxx);
        }
        return result  > 0 ? AjaxResult.success() : AjaxResult.error();
	}

    /**
     * 构建流转信息
     * @param rwfk
     * @param lcjd 当前节点
     * @param zx 走向
     * @return
     */
	private Lzxx getLzxx(Rwfk rwfk, String lcjd, String zx) {
		Lzxx lzxx = new Lzxx();
		lzxx.setFkbid(rwfk.getId());
		lzxx.setLrry(ShiroUtils.getUserId());
		lzxx.setLcjd(lcjd);
		lzxx.setZx(zx);
		if(Lcjd.FAN_KUI.getCode().equals(lcjd)) {
			lzxx.setYj(rwfk.getFknr());
		} else if(Lcjd.SHEN_HE.getCode().equals(lcjd)) {
			Rwsh rwsh = (Rwsh) rwfk;
			lzxx.setYj(rwsh.getShxx());
		} else {
			return null;
		}
		return lzxx;
	}

	public List<Lzxx> selectRwlzList(String id) {
		List<Lzxx> list = mapper.selectRwlzList(id);
		if(list!= null && !list.isEmpty()) {
			Lzxx last = list.get(list.size() - 1);
			if(Lczx.TUI_SONG.getCode().equals(last.getZx()) || Lczx.CHE_HUI.getCode().equals(last.getZx()) || Lczx.TUI_HUI.getCode().equals(last.getZx())) {
			    // 增加反馈行
				Lzxx gd = new Lzxx();
				gd.setLcjd(Lcjd.FAN_KUI.getCode());
				list.add(gd);
			} else if(Lczx.TI_JIAO.getCode().equals(last.getZx())) {
                // 反馈节点，增加审核行
				Lzxx gd = new Lzxx();
				gd.setLcjd(Lcjd.SHEN_HE.getCode());
				list.add(gd);
			} else if(Lcjd.SHEN_HE.getCode().equals(last.getLcjd())) {
				// 增加结束行
				Lzxx gd = new Lzxx();
				gd.setLcjd(last.getZx());
				gd.setZx("-");
				gd.setYj("-");
				gd.setLrry(last.getLrry());
				gd.setLrrymc(last.getLrrymc());
				gd.setLrsj(last.getLrsj());
				list.add(gd);
			}
		}
		return list;
	}
}
