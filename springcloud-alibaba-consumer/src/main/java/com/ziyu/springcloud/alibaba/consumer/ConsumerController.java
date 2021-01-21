package com.ziyu.springcloud.alibaba.consumer;

import com.ziyu.springcloud.alibaba.provider.api.ProviderService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ziyu
 */
@RestController
public class ConsumerController {

    @Reference(version = "1.0.0",
            interfaceClass = ProviderService.class,
            cluster = "failfast")
    private ProviderService providerService;

    @GetMapping("/meeting/{name}")
    public String meeting(@PathVariable("name") String name) {
        return providerService.hello(name);
    }
}
