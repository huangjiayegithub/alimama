package com.gq.modules.transportPrice.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

@Configuration
public class WebServletListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        StringBuilder sb = new StringBuilder();
        sb.append("\r\n    Web应用启动，欢迎使用 alimama"+"  -  广东青年干部学院2017届3栋234提供技术支持\r\n");
        System.out.println(sb.toString());
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("Web应用销毁...,再见再见！");
    }
}