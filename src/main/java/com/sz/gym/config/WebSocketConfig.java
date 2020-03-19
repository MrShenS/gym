package com.sz.gym.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.server.standard.ServerEndpointExporter;

/**
 * @ClassNameWebSocketConfig
 * @Description TODO
 * @Author zhen.zhen
 * @Date 2020/3/1819:58
 * @Version 1.0
 */

@Configuration
public class WebSocketConfig {
    @Bean
    public ServerEndpointExporter serverEndpointExporter(){
        return new ServerEndpointExporter();
    }
}
