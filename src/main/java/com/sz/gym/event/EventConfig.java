package com.sz.gym.event;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import java.awt.*;

/**
 * @ClassNameEventConfig
 * @Description TODO
 * @Author zhen.zhen
 * @Date 2020/2/139:52
 * @Version 1.0
 */
@Component
@Slf4j
public class EventConfig {
    @EventListener
    public void listen(Event_xx event_xx){
      log.info("监听到了该事件");
    }
}
