package com.syndo.web.interceptor;

import com.syndo.common.utils.StringUtils;
import com.syndo.web.common.BaiDuLocationUtil;
import com.syndo.web.domain.system.Nsqs;
import com.syndo.web.domain.system.Zdqynsfx;
import com.syndo.web.domain.system.Zysyqyjcxx;
import com.syndo.web.system.main.service.MainService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.*;

@Component
public class DapingRequestInterceptor implements HandlerInterceptor {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private MainService mainService;


    @Override
    public boolean preHandle(HttpServletRequest req, HttpServletResponse res, Object o) {
        String requestURI = req.getRequestURI();
        if(requestURI.startsWith("/magic-api/zdqynsfx")){
            logger.info("正在检查pathVariable: zdqynsfx");
            List<Zdqynsfx> lists = mainService.selectZdqynsfx();
            if(lists.size() > 0) {
                for (int i = 0; i < lists.size(); i++) {
                    BigDecimal zb = new BigDecimal(lists.get(i).getZdqynsfxse()).divide(new BigDecimal(lists.get(i).getNdznse()),3,RoundingMode.HALF_DOWN).multiply(new BigDecimal(100));
                    lists.get(i).setZb(String.valueOf(zb));
                    for(int j =0;j<lists.size();j++){
                        String zdqynsfxndI = lists.get(i).getZdqynsfxnd();
                        String tempI = String.valueOf(Integer.parseInt(zdqynsfxndI) - 1);
                        if(lists.get(j).getZdqynsfxnd().equals(tempI)){
                            BigDecimal lse = new BigDecimal(lists.get(j).getZdqynsfxse());
                            BigDecimal nse = new BigDecimal(lists.get(i).getZdqynsfxse());
                            if(lse.compareTo(BigDecimal.ZERO)!=0) {
                                BigDecimal zjl = (nse.subtract(lse)).divide(lse,3, RoundingMode.HALF_DOWN).multiply(new BigDecimal(100));
                                lists.get(i).setZjl(String.valueOf(zjl));
                            }else{
                                BigDecimal zjl = (nse.subtract(lse)).divide(new BigDecimal(1),3, RoundingMode.HALF_DOWN).multiply(new BigDecimal(100));
                                lists.get(i).setZjl(String.valueOf(zjl));
                            }
                        }
                    }
                }
                for(int i = 0; i<lists.size();i++){
                    mainService.updateZdqynsfx(lists.get(i));
                }

            }

        }
        if(requestURI.startsWith("/magic-api/nsqs")){
            logger.info("正在检查pathVariable: nsqs");
            List<Nsqs> lists = mainService.selectNsqs();
            if(lists.size() > 0) {
                for(int i=0;i<lists.size();i++){
                    for(int j=0;j<lists.size();j++){
                        String nsqsndI = lists.get(i).getNsqsnd();
                        String tempI = String.valueOf(Integer.parseInt(nsqsndI) - 1);
                        if(lists.get(j).getNsqsnd().equals(tempI)){
                            BigDecimal lse = new BigDecimal(lists.get(j).getNsqsse());
                            BigDecimal nse = new BigDecimal(lists.get(i).getNsqsse());
                            if(lse.compareTo(BigDecimal.ZERO)!=0) {
                                BigDecimal zjl = (nse.subtract(lse)).divide(lse,3, RoundingMode.HALF_DOWN).multiply(new BigDecimal(100));
                                lists.get(i).setZjl(String.valueOf(zjl));
                            }else{
                                BigDecimal zjl = (nse.subtract(lse)).divide(new BigDecimal(1),3, RoundingMode.HALF_DOWN).multiply(new BigDecimal(100));
                                lists.get(i).setZjl(String.valueOf(zjl));
                            }
                        }
                    }
                }
                for(int i = 0; i<lists.size();i++){
                    mainService.updateNsqs(lists.get(i));
                }
            }
        }




        return true;
    }

    @Override
    public void postHandle(HttpServletRequest req, HttpServletResponse res, Object o, ModelAndView mav) {

    }

    @Override
    public void afterCompletion(HttpServletRequest req, HttpServletResponse rep, Object o, Exception e) {

    }
}
