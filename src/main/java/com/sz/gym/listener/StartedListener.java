package com.sz.gym.listener;

import lombok.Data;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Configuration;

import javax.annotation.Resource;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Date;

/**
 * @ClassNameStartedListener
 * @Description TODO
 * @Author zhen.zhen
 * @Date 2020/3/1014:07
 * @Version 1.0
 */
@Slf4j
@Configuration
public class StartedListener implements ApplicationListener<ApplicationStartedEvent> {

    @Resource
    private ApplicationContext applicationContext;

    @SneakyThrows
    @Override
    public void onApplicationEvent(ApplicationStartedEvent applicationStartedEvent) {
        this.startProjectInfo();
    }

    private void startProjectInfo() throws UnknownHostException {
        // Get server port
        String serverPort = applicationContext.getEnvironment().getProperty("server.port", "8080");
        String IP = InetAddress.getLocalHost().getHostAddress();
        String[] names = applicationContext.getBeanDefinitionNames();
        String blogUrl ="http://"+IP+":"+serverPort;
        log.info("本项目spring容器共管理"+names.length+"个类");
//        log.info("类名如下:");
//        for (String name: names) {
//            log.info(name);
//        }
        log.info("welcome to 世界五百强健身房管理系统  颤抖凡人");
        log.info("GYM World started at         {}", blogUrl);
        log.info("启动时间为："+new Date());
    }
}

