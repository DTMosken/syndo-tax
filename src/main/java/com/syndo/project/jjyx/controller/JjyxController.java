package com.syndo.project.jjyx.controller;

import com.syndo.common.core.controller.BaseController;
import com.syndo.project.jjyx.domain.JjyxData;
import com.syndo.project.jjyx.domain.Rlt;
import com.syndo.project.jjyx.service.IJjyxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/module/jjyx")
public class JjyxController extends BaseController {

    @Autowired
    private IJjyxService service;

    /**
     * 企业信息热力图，企业
     * @return
     */
    @PostMapping("/qyxxRltQy")
    @ResponseBody
    public List<Rlt> qyxxRltQy() {
        return service.qyxxRltQy();
    }

    /**
     * 企业信息热力图，税收
     * @return
     */
    @PostMapping("/qyxxRltSs")
    @ResponseBody
    public List<Rlt> qyxxRltSs() {
        return service.qyxxRltSs();
    }

    /**
     * 企业信息，增资减资
     * @return
     */
    @PostMapping("/qyxxZzjz")
    @ResponseBody
    public List<JjyxData> qyxxZzjz() {
        return service.qyxxZzjz();
    }

    /**
     * 企业新办、注销情况
     * @return
     */
    @PostMapping("/qyxxXbzxqk")
    @ResponseBody
    public List<JjyxData> qyxxXbzxqk() {
        return service.qyxxXbzxqk();
    }

    /**
     * 企业纳税前10
     * @return
     */
    @PostMapping("/qyxxNs10")
    @ResponseBody
    public List<JjyxData> qyxxNs10() {
        return service.qyxxNs10();
    }

    /**
     * 企业纳税增长率前10
     * @return
     */
    @PostMapping("/qyxxNszzl")
    @ResponseBody
    public List<JjyxData> qyxxNszzl() {
        return service.qyxxNszzl();
    }

    /**
     * 企业纳税增加额前10
     * @return
     */
    @PostMapping("/qyxxNszje")
    @ResponseBody
    public List<JjyxData> qyxxNszje() {
        return service.qyxxNszje();
    }

    /**
     * 行业纳税总额
     * @return
     */
    @PostMapping("/nsqkHynsze")
    @ResponseBody
    public List<JjyxData> nsqkHynsze() {
        return service.nsqkHynsze();
    }

    /**
     * 行业税收占比
     * @return
     */
    @PostMapping("/nsqkHysszb")
    @ResponseBody
    public List<JjyxData> nsqkHysszb() {
        return service.nsqkHysszb();
    }

    /**
     * 重点企业纳税变化
     * @return
     */
    @PostMapping("/nsqkZdqynsbh")
    @ResponseBody
    public List<JjyxData> nsqkZdqynsbh() {
        return service.nsqkZdqynsbh();
    }
    
    /**
     * 镇街税收情况
     * @return
     */
    @PostMapping("/nsqkZjssqk")
    @ResponseBody
    public List<JjyxData> nsqkZjssqk() {
    	return service.nsqkZjssqk();
    }

    /**
     * 房土-不动产登记情况
     * @return
     */
    @PostMapping("/ftBdcdjqk")
    @ResponseBody
    public List<JjyxData> ftBdcdjqk() {
        return service.ftBdcdjqk();
    }
    /**
     * 房土-城市基础设施配套费统计
     * @return
     */
    @PostMapping("/ftCsjcssptftj")
    @ResponseBody
    public List<JjyxData> ftCsjcssptftj() {
        return service.ftCsjcssptftj();
    }
    /**
     * 房土-商品房预售情况
     * @return
     */
    @PostMapping("/ftSpfysqk")
    @ResponseBody
    public List<JjyxData> ftSpfysqk() {
        return service.ftSpfysqk();
    }
    /**
     * 房土-商品房网签情况
     * @return
     */
    @PostMapping("/ftSpfwqqk")
    @ResponseBody
    public List<JjyxData> ftSpfwqqk() {
        return service.ftSpfwqqk();
    }
    /**
     * 房土-土地出让情况
     * @return
     */
    @PostMapping("/ftTdcrqk")
    @ResponseBody
    public List<JjyxData> ftTdcrqk() {
        return service.ftTdcrqk();
    }
    /**
     * 房土-土地转让情况
     * @return
     */
    @PostMapping("/ftTdzrqk")
    @ResponseBody
    public List<JjyxData> ftTdzrqk() {
        return service.ftTdzrqk();
    }
    /**
     * 房土-土地登记情况
     * @return
     */
    @PostMapping("/ftTddjqk")
    @ResponseBody
    public List<JjyxData> ftTddjqk() {
        return service.ftTddjqk();
    }
    /**
     * 房土-建设项目占用林地情况
     * @return
     */
    @PostMapping("/ftJsxmzyldqk")
    @ResponseBody
    public List<JjyxData> ftJsxmzyldqk() {
        return service.ftJsxmzyldqk();
    }
}
