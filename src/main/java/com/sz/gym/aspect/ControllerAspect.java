package com.sz.gym.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;

/**
 * @ClassNamecontrollerAspect
 * @Description TODO
 * @Author zhen.zhen
 * @Date 2020/3/1218:01
 * @Version 1.0
 */
@Aspect
@Component
@Slf4j
public class ControllerAspect {

    @Pointcut("execution(*  *..*.*.controller..*.*(..))")
    public void controller() {
    }


    @Before("controller()")//选择指定切点 通过方法名称
    public void logBeforeController(JoinPoint joinPoint){
        RequestAttributes requestAttributes = RequestContextHolder.getRequestAttributes();//获取请求信息
        HttpServletRequest request = ((ServletRequestAttributes) requestAttributes).getRequest();
        // 记录下请求内容
        log.info("访问的URL : " + request.getRequestURL().toString());
        log.info("请求方法 : " + request.getMethod());
        log.info("请求IP地址 : " + request.getRemoteAddr());
        log.info("请求参数 : " + Arrays.toString(joinPoint.getArgs()));

        //下面这个getSignature().getDeclaringTypeName()是获取包+类名的   然后后面的joinPoint.getSignature.getName()获取了方法名
        log.info("################CLASS_METHOD : " + joinPoint.getSignature().getDeclaringTypeName() + "." + joinPoint.getSignature().getName());
        log.info("################TARGET: " + joinPoint.getTarget());//返回的是需要加强的目标类的对象
        log.warn("======================请妥善使用SpringAOP功能================");
        log.info("################THIS: " + joinPoint.getThis());//返回的是经过加强后的代理类的对象
    }

}
