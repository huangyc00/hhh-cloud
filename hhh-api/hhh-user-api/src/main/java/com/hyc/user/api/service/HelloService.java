package com.hyc.user.api.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author hyc
 * @description
 * @date 2019-04-22 14:15
 */
@FeignClient(value = "hhh-provider-user")
public interface HelloService {

    @GetMapping(value = "/sayHello")
    String sayHello();

    @GetMapping("/foo")
    String foo(@RequestParam(required = false) String foo);
}
