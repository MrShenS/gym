package com.sz.gym.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

/**
 * @ClassNameCorsConfig
 * @Description TODO
 * @Author zhen.zhen
 * @Date 2020/3/2818:06
 * @Version 1.0
 */
@Configuration
public class CorsConfig {

    private CorsConfiguration buildConfig(){
        CorsConfiguration corsConfiguration = new CorsConfiguration();
        //设置可以访问的域名
        corsConfiguration.addAllowedOrigin("*");
        //请求头
        corsConfiguration.addAllowedHeader("*");
        //请求方法
        corsConfiguration.addAllowedMethod("*");
        //预检请求的有效期 单位为秒
        corsConfiguration.setMaxAge(3600L);
        //允许发送Cookie
        corsConfiguration.setAllowCredentials(true);
        return corsConfiguration;
    }


    /*
     * @Author zhen.shen
     * @Description //TODO 跨域过滤器
     * @Date 18:16 2020/3/28
     * @Param
     * @return 返回跨域过滤器
     **/
    @Bean
    public CorsFilter corsFilter(){
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        source.registerCorsConfiguration("/**",buildConfig());
        return new CorsFilter(source);
    }
}
