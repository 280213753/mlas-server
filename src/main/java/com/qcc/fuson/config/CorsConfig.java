package com.qcc.fuson.config;

import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

public class CorsConfig implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**") // 适用于所有路径
                .allowedOrigins("*") // 允许任何域名使用该API
                .allowedMethods("GET", "POST", "PUT", "DELETE") // 允许的HTTP方法
                .allowedHeaders("*") // 允许任何请求头
                .allowCredentials(false) // 不允许证书
                .maxAge(3600); // 预检请求的有效期
    }
}
