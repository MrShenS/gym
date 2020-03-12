package com.sz.gym.event;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationEvent;

/**
 * @ClassNameEvent_xx
 * @Description TODO
 * @Author zhen.zhen
 * @Date 2020/2/139:40
 * @Version 1.0
 */
@Slf4j
public class Event_xx extends ApplicationEvent {
    public Event_xx(Object source) {
        super(source);
      log.info("事件出来了");
    }
}
