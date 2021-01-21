package com.ziyu.springcloud.alibaba.provider.service;

import com.ziyu.springcloud.alibaba.provider.api.ProviderService;
import org.apache.dubbo.config.annotation.Service;

/**
 * @author ziyu
 */
@Service(
        version = "1.0.0",
        interfaceClass = ProviderService.class,
        cluster = "failfast",
        loadbalance = "roundrobin"
)
public class ProviderServiceImpl implements ProviderService {

    @Override
    public String hello(String name) {
        return "hello, " + name;
    }
}
