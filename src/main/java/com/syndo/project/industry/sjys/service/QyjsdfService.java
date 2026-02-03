package com.syndo.project.industry.sjys.service;

import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.apache.commons.jexl2.Expression;
import org.apache.commons.jexl2.JexlContext;
import org.apache.commons.jexl2.JexlEngine;
import org.apache.commons.jexl2.MapContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;

import com.alibaba.druid.util.StringUtils;
import com.syndo.common.core.service.BaseService;
import com.syndo.project.industry.sjsb.domain.EvaluateBaseInfo;
import com.syndo.project.industry.sjsb.domain.EvaluateForm;
import com.syndo.project.industry.sjsb.service.EvaluateFormService;
import com.syndo.project.industry.sjys.domain.Qydfjs;
import com.syndo.project.industry.sjys.mapper.QyjsdfMapper;
import com.syndo.project.industry.wstb.domain.Wstb_zhxx;
import com.syndo.project.industry.zbgzjs.domain.Zbkwh;

/**
 * 企业得分计算
 * 
 * @author hry
 *
 */
@Service
public class QyjsdfService extends BaseService implements IQyjsdfService {
	String IP4 = "[\\+\\-\\*\\/\\(\\)\\%]";

	@Autowired
	private QyjsdfMapper mapper;
	@Autowired
	private EvaluateFormService evaluateservice;

	@Override
	public List<Qydfjs> GetQyjsdf() {
		// TODO Auto-generated method stub
		return mapper.GetQyjsdf();
	}

	/**
	 * 获取所有指标
	 */
	@Override
	public List<Zbkwh> GetZbkzbmc() {
		// TODO Auto-generated method stub
		return mapper.GetZbkzbmc();
	}

	@Override
	public List<Wstb_zhxx> GetMcxys() {
		// TODO Auto-generated method stub
		return mapper.GetMcxys();
	}

	/**
	 * 重新计算
	 */
	@Override
	public void calculation() {
		// TODO Auto-generated method stub
		// 获取所有 亩产效益评价表 Wstb_zhxx
		List<ModelMap> getMcxys = evaluateservice.ottenereAll();
		Calendar date = Calendar.getInstance();
		if (null == getMcxys) {
			return;
		}
		double qyldscl = 0;
		double dwydss = 0;
		double yfjftrqd = 0;
		double wzywrwpf = 0;
		double dwnhxssr = 0;
		for (ModelMap mt : getMcxys) {
			List<Zbkwh> getZbkzbmc = GetZbkzbmc();
			EvaluateForm t = (EvaluateForm) mt.get("entity");
			EvaluateBaseInfo b = (EvaluateBaseInfo) mt.get("baseInfo");
			for (Zbkwh zbkwh : getZbkzbmc) {
				// 取到计算公式
				String jsgs = zbkwh.getJSGS();

				JexlEngine engine = new JexlEngine();// 创建表达式引擎对象
				JexlContext context = new MapContext();// 创建Context设值对象
				String par = "";

				String[] split = jsgs.split(IP4);
				for (String str : split) {
					par = splitParamter(t.toString(), b.toString(), str);
					if (!StringUtils.isEmpty(par) && par != null && !par.equals("null")) {
						context.set(str, par);
					}
				}

				Expression expression = engine.createExpression(jsgs);// 使用引擎创建表达式对象
				String fs = "";
				try {
					if (!context.toString().contains("null")) {

						Object o = expression.evaluate(context);// 使用表达式对象开始计算
						fs = String.valueOf(o);
						String ysstr = "";
						// 如果是除法,按照jexl的规则不保留 小数. 以下处理是通过余数得出小数
						if (jsgs.contains("/")) {
							String replace = jsgs.replace("/", "%");
							Expression createExpression = engine.createExpression(replace);
							Object wewq1 = createExpression.evaluate(context);
							double ys = Double.parseDouble(wewq1.toString());
							String getStrdivision = GetStrdivision(jsgs);
							double cs = Double.parseDouble((splitParamter(t.toString(), b.toString(), getStrdivision)));
							ysstr = String.valueOf(ys / cs);
							fs = (String.valueOf(o) + ysstr).replace("0.", ".");
						}
					}
				} catch (Exception e) {
					// TODO: handle exception
					int i = 0;
					i++;
				}

				double fsd = Double.parseDouble(fs);

				switch (zbkwh.getZBSM()) {
				case "QYLDSCL":
					qyldscl = fsd;
					break;
				case "DWYDSS":
					dwydss = fsd;
					break;
				case "YFJFTRQD":
					yfjftrqd = fsd;
					break;
				case "WRWPFSR":
					wzywrwpf = fsd;
					break;
				case "DWNHXSSR":
					dwnhxssr = fsd;
					break;
				default:
					break;
				}
				// System.out.println(fs);
			}

			// 企业综合评价得分=∑（企业各指标值÷指标基准值）×指标权重+加分-扣分项

			// 指标基准值 参照上年度该指标本区县平均值的2倍左右确定。
			double collectdwydss = 0;
			double collectdwnhxssr = 0;
			double collectwrwpfsr = 0;
			double collectyfjftrqd = 0;
			double collectqyldscl = 0;

			int lastyear = date.get(Calendar.YEAR) - 1;
			double sumzb = 0;
			// 找去年的数据
			List<Qydfjs> getQyjsdfYear = mapper.GetQyjsdfYear(String.valueOf(lastyear));
			if (null == getQyjsdfYear || getQyjsdfYear.size() <= 1) {
				// 若无去年数据 则取当年
				getQyjsdfYear = mapper.GetQyjsdfYear(String.valueOf(lastyear + 1));
			}
			if (null != getQyjsdfYear && getQyjsdfYear.size() > 0) {
				collectdwydss = (getQyjsdfYear.stream().collect(Collectors.summingDouble(Qydfjs::getDWYDSS))
						/ getQyjsdfYear.size()) * 2;
				collectdwnhxssr = (getQyjsdfYear.stream().collect(Collectors.summingDouble(Qydfjs::getDWNHXSSR))
						/ getQyjsdfYear.size()) * 2;
				collectwrwpfsr = (getQyjsdfYear.stream().collect(Collectors.summingDouble(Qydfjs::getWRWPFSR))
						/ getQyjsdfYear.size()) * 2;
				collectyfjftrqd = (getQyjsdfYear.stream().collect(Collectors.summingDouble(Qydfjs::getYFJFTRQD))
						/ getQyjsdfYear.size()) * 2;
				collectqyldscl = (getQyjsdfYear.stream().collect(Collectors.summingDouble(Qydfjs::getQYLDSCL))
						/ getQyjsdfYear.size()) * 2;

				// ∑（企业各指标值÷指标基准值）×指标权重 [权重暂时写死,加分减分不考虑]
				sumzb = qyldscl / collectqyldscl * 0.4 + dwydss / collectdwydss * 0.06
						+ yfjftrqd / collectyfjftrqd * 0.3 + wzywrwpf / collectwrwpfsr * 0.04
						+ dwnhxssr / collectdwnhxssr * 0.5;
			}
			// 分类评价
			// 存储实体
			Qydfjs qydf = new Qydfjs();
			qydf.setZF(Double.parseDouble(String.format("%.5f", sumzb)));// 总分
			qydf.setPJDJ(""); // 评价等级
			qydf.setID(getUUID());
			qydf.setTYSHXYBM(t.getTyshxydm());// 统一社会信用编码
			qydf.setQYMC(t.getQymc());// 企业名称
			qydf.setSSHY(t.getSshy());// 所属行业
			qydf.setSSXZ(t.getQydz());// 企业地址

			qydf.setQYLDSCL(qyldscl);// 全员劳动生产率
			qydf.setDWYDSS(dwydss);// 单位用地税收
			qydf.setYFJFTRQD(yfjftrqd);// 研发经费投入强度
			qydf.setWRWPFSR(wzywrwpf);// 单位主要污染物排放销售收入
			qydf.setDWNHXSSR(dwnhxssr);// 单位能耗销售收入
			qydf.setSSSJGX(Double.parseDouble(t.getSwjhdssjss() == null ? "0" : t.getSwjhdssjss()));// 税收实际贡献
			qydf.setYDMJ(Double.parseDouble(t.getSjydmj() == null ? "0" : t.getSjydmj()));// 实际面积
			qydf.setXSSR(Double.parseDouble(t.getZyywsr() == null ? "0" : t.getZyywsr()));// 销售收入
			qydf.setZNH(Double.parseDouble(t.getNzhnh() == null ? "0" : t.getNzhnh()));// 总能耗
			qydf.setZYWRWPFZDL(Double.parseDouble(t.getPfl() == null ? "0" : t.getPfl()));// 排放量
			qydf.setYFJFZC(Double.parseDouble(t.getYfjfzc() == null ? "0" : t.getYfjfzc()));// 研发经费支出
			qydf.setGYZVZ(Double.parseDouble(t.getGyzcz() == null ? "0" : t.getGyzcz()));
			qydf.setNNPJZGRS(t.getNpjzgrs());
			qydf.setPJNF(String.valueOf(date.get(Calendar.YEAR)));
			insertQydfjs(qydf);
		}

		// 数据生成后再计算 评价等级
		// 1 查出得分计算表 并按照得分排序
		List<Qydfjs> list = GetQyjsdf();
		if (null == list || list.size() < 1) {
			return;
		}
		// 排序
		Collections.sort(list, new Comparator<Qydfjs>() {
			@Override
			public int compare(Qydfjs o1, Qydfjs o2) {
				// TODO Auto-generated method stub
				if (o1.getZF() > o2.getZF()) {
					return -1;
				} else if (o1.getZF() == o2.getZF()) {
					return 0;
				}
				return 1;
			}
		});

		Map m = new HashMap();

		// 2 根据排序 获得各个评价等级数量
		int aqy = (int) (list.size() * 0.2);
		for (int j = 0; j < aqy; j++) {
			// list.get(j).setPJDJ("A");
			m.put("PJDJ", "A");
			m.put("TYSHXYBM", list.get(j).getTYSHXYBM());
			UpdaePjdj(m);
		}

		int bqy = (int) ((list.size() - aqy) * 0.4);
		for (int j = 0; j < bqy; j++) {
			m.put("PJDJ", "B");
			m.put("TYSHXYBM", list.get(j + aqy).getTYSHXYBM());
			UpdaePjdj(m);
		}

		int cqy = (int) ((list.size() - aqy - bqy) * 0.35);
		for (int j = 0; j < cqy; j++) {
			m.put("PJDJ", "C");
			m.put("TYSHXYBM", list.get(j + aqy + bqy).getTYSHXYBM());
			UpdaePjdj(m);
		}
		int dqy = list.size() - aqy - bqy - cqy;
		for (int j = 0; j < dqy; j++) {
			m.put("PJDJ", "D");
			m.put("TYSHXYBM", list.get(j + aqy + bqy + cqy).getTYSHXYBM());
			UpdaePjdj(m);
		}

	}

	/**
	 * 根据字符串取值
	 * 
	 * @param str
	 * @return
	 */
	public String splitParamter(String entity, String base, String sp) {
		int indexOf = entity.indexOf(sp);
		String substring2 = "";
		if (indexOf < 0) {
			// 如果entity中不存在 则中base中寻找
			entity = base;
			indexOf = entity.indexOf(sp);
			if (indexOf < 0) {
				return substring2;
			}
		}
		String substring = entity.substring(indexOf);
		int indexOf2 = substring.indexOf(",");
		substring2 = substring.substring(sp.length() + 1, indexOf2);
		return substring2 == null ? "0" : substring2;
	}

	/**
	 * 获取除数
	 * 
	 * @return
	 */
	public String GetStrdivision(String str) {
		if (StringUtils.isEmpty(str) || !str.contains("/")) {
			return "";
		}
		String substring = "";
		String par = "";
		int indexOf = str.indexOf("/");
		if (indexOf < 0) {
			return substring;
		}
		substring = str.substring(indexOf);
		if (substring.contains("+") || substring.contains("-") || substring.contains("*") || substring.contains("/")
				|| substring.contains("(") || substring.contains(")")) {
			String[] split = substring.split(IP4);

			substring = StringUtils.isEmpty(split[0]) ? split[1] : split[0];
		}
		return substring;
	}

	@Override
	public void insertQydfjs(Qydfjs qydf) {
		// TODO Auto-generated method stub
		mapper.insertQydfjs(qydf);

	}

	@Override
	public void UpdaePjdj(Map m) {
		// TODO Auto-generated method stub
		mapper.UpdaePjdj(m);
	}

}
