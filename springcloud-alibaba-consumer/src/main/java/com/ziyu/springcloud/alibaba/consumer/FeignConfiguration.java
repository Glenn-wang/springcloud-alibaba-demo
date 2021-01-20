package com.ziyu.springcloud.alibaba.consumer;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author ziyu
 */
@Configuration
public class FeignConfiguration {

    @Bean
    public EchoServiceFallbackImpl echoServiceFallback() {
        return new EchoServiceFallbackImpl();
    }
}
