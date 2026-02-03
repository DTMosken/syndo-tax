package com.syndo.project.zhzs.xxgxxt.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.syndo.common.core.service.BaseService;
import com.syndo.project.zhzs.xxgxxt.domain.Fenshu;
import com.syndo.project.zhzs.xxgxxt.domain.Zhibiao;
import com.syndo.project.zhzs.xxgxxt.mapper.JxglMapper;

/**
 * 绩效管理
 * 
 * @author wq
 *
 */
@Service
public class JxglServiceImpl extends BaseService implements IJxglService {

	public static List<Zhibiao> l = new ArrayList<Zhibiao>();
	Zhibiao z = new Zhibiao();

	@Autowired
	private JxglMapper mapper;

	@Override
	public List<Zhibiao> query(Zhibiao cond) {
		Date ydate = null;
		Date sjdate = null;
		Integer sjc;// 时间差
		try {
			List<Zhibiao> list = mapper.query(cond);
			for (Zhibiao zb : list) {
				if (zb.getSjscsj() != null && !"".equals(zb.getSjscsj())) {
					if (zb.getSjscsj().length() > 10) {
						zb.setSjdf(20);
						zb.setSjscsj(zb.getSjscsj().substring(0, 10));
						/*ydate = getdateParse(zb.getYscsj());
						sjdate = getdateParse(zb.getSjscsj());
						if (sjdate!=null && ydate!=null && sjdate.getTime() > ydate.getTime()) {
							sjc = differentDaysByMillisecond(sjdate, ydate);
							// 减分
							zb.setSjdf(zb.getSjdf() - Math.abs(sjc));
							if (zb.getSjdf() < 0) {
								zb.setSjdf(0);
							} else {
								// 不减分
							}
						}*/
						LocalDate startDate = LocalDate.parse(zb.getSjscsj());
						LocalDate endDate = LocalDate.parse(zb.getYscsj());
						int lastDayInt = (int) (endDate.toEpochDay() - startDate.toEpochDay());
						if(lastDayInt < 0){
							zb.setSjdf( (zb.getSjdf() + lastDayInt)<0?0:(zb.getSjdf() + lastDayInt) );
						}
					}
				} else {
					zb.setSjdf(0);
				}
			}
			z.setDept(cond.getDept());
			z.setYscsj(cond.getYscsj());
			if (l != null) {
				l.clear();
			}
			l.addAll(list);
			return list;
		} catch (Exception e) {
			e.printStackTrace();
			return l;
		}
	}

	/**
	 * 返回总分数
	 * 
	 * @return
	 */
	@Override
	public Map<String, Integer> getjsfs() {
		Map<String, Integer> map = new HashMap<String, Integer>();
		Integer fscount = 0;
		for (Zhibiao z : l) {
			fscount += z.getSjdf();
		}
		if (fscount != 0 && l != null) {
			fscount = fscount / l.size();
		}
		map.put("pjfs", fscount);
		Fenshu f = mapper.getfen(z);
		if (f != null) {
			map.put("fs1", f.getFs1());
			map.put("fs2", f.getFs2());
			map.put("fs3", f.getFs3());
			map.put("fs4", f.getFs4());
			map.put("fs5", f.getFs5());
			map.put("fs6", f.getFs6());
		} else {
			map.put("fs1", 0);
			map.put("fs2", 0);
			map.put("fs3", 0);
			map.put("fs4", 0);
			map.put("fs5", 0);
			map.put("fs6", 0);
		}
		return map;
	}

	public static Date getdateParse(String strDate) throws ParseException {
		return (strDate!=null && strDate.trim().length()>0)?new SimpleDateFormat("yyyy-MM-dd").parse(strDate):null;
	}

	// 获得两个时间差
	/**
	 * 
	 * @param 实际时间date1
	 * @param 应该时间date2
	 * @return
	 */
	public static int differentDaysByMillisecond(Date date1, Date date2) {
		int days = (int) ((date2.getTime() - date1.getTime()) / (1000 * 3600 * 24));
		return days;
	}

	@Override
	public int save(Fenshu f) {
		if (this.getFenshu(f).size() >= 1) {
			return mapper.updatefenshu(f);
		} else {
			return mapper.insertfenshu(f);
		}
	}

	@Override
	public List<Fenshu> getFenshu(Fenshu f) {
		return mapper.getFenshu(f);
	}

	@Override
	public List<Fenshu> getpmFenshu(Fenshu f) {
		return mapper.getpmFenshu(f);
	}

}
