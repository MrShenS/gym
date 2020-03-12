package com.sz.gym.event;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @ClassNameTEst
 * @Description TODO
 * @Author zhen.zhen
 * @Date 2020/2/139:54
 * @Version 1.0
 */
public class TEst {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(EventConfig.class);
        System.out.println("事件发布");
        context.publishEvent(new Event_xx(""));
        context.close();
        System.out.println("监听事件结束");
    }
}
