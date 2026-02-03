package com.syndo.project.taxgis.config;

import java.util.List;
import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.mitre.dsmiley.httpproxy.ProxyServlet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.ServletContextInitializer;
import org.springframework.stereotype.Component;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;
import java.util.Map;

@Component
public class ProxysInitializer implements ServletContextInitializer {
    @Autowired
    private ProxysConfig proxysConfig;

    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        for (Map<String, String> m : proxysConfig.getList()) {
            ServletRegistration initServlet = servletContext.addServlet(m.get("name"), ProxyServlet.class);
            initServlet.addMapping(m.get("url"));
            initServlet.setInitParameter("targetUri", m.get("targetUrl"));
            initServlet.setInitParameter("log", "false");
        }
    }

}