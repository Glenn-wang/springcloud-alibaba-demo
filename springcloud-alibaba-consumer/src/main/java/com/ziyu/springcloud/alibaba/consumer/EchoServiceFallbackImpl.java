package com.ziyu.springcloud.alibaba.consumer;

import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author ziyu
 */
public class EchoServiceFallbackImpl implements EchoService {

    @Override
    public String echo(@PathVariable("str") String str) {
        return "echo fallback";
    }
}
