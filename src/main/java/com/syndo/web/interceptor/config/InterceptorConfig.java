package com.syndo.web.interceptor.config;

import com.syndo.web.interceptor.DapingRequestInterceptor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class InterceptorConfig implements WebMvcConfigurer {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private DapingRequestInterceptor dapingRequestInterceptor;

    @Override   //拦截器配置
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(dapingRequestInterceptor) //拦截器注册对象
                .addPathPatterns("/magic-api/zdqynsfx") //指定要拦截的请求
                .addPathPatterns("/magic-api/nsqs");

    }

  /*  @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(this.localeChangeInterceptor());
        registry.addInterceptor(dapingRequestInterceptor).addPathPatterns("/magic-api/zdqynsfx");
        super.addInterceptors(registry);
    }*/

}