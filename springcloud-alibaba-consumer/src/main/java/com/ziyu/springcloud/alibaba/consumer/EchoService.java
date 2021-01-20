package com.ziyu.springcloud.alibaba.consumer;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author ziyu
 */
@FeignClient(name = "nacos-provider",
        fallback = EchoServiceFallbackImpl.class,
        configuration = FeignConfiguration.class)
public interface EchoService {

    @GetMapping(value = "/echo/{str}")
    String echo(@PathVariable("str") String str);
}
