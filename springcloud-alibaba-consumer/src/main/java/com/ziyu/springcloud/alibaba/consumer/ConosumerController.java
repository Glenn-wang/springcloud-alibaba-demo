package com.ziyu.springcloud.alibaba.consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ziyu
 */
@RestController
public class ConosumerController {

    @Autowired
    private EchoService echoService;

    @GetMapping("/echo/{str}")
    public String getEcho(@PathVariable("str") String str) {
        return echoService.echo(str);
    }
}
