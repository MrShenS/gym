package com.sz.gym.listener;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Configuration;

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
    @Override
    public void onApplicationEvent(ApplicationStartedEvent applicationStartedEvent) {
        log.info("welcome to 世界五百强健身房管理系统  颤抖凡人");
        log.info("启动时间为："+new Date());
    }
}

