package com.sz.gym.web.Filter;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @ClassNameOriginFilter
 * @Description TODO
 * @Author zhen.zhen
 * @Date 2020/3/2818:21
 * @Version 1.0
 */
//@Component
//@WebFilter(urlPatterns = "/api/*", filterName = "authFilter")
@Slf4j
public class OriginFilter implements Filter {

/*
 * @Author zhen.shen
 * @Description //TODO 跨域过滤器
 * @Date 18:24 2020/3/28
 * @Param
 * @return
 **/
    @Override
    public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain)
            throws IOException, ServletException {
        log.debug("*******************************************过滤器生效***************************************");
        HttpServletResponse response = (HttpServletResponse) res;
        response.setHeader("Access-Control-Allow-Origin", "*");
        response.setHeader("Access-Control-Allow-Methods", "POST, GET, OPTIONS, DELETE,PUT");
        response.setHeader("Access-Control-Max-Age", "3600");
        response.setHeader("Access-Control-Allow-Headers", "x-requested-with");
        chain.doFilter(req, res);
    }
}
