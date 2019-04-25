package com.hyc.user.service.impl;

import com.hyc.user.api.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;


@RestController
public class HelloServiceImpl implements HelloService {

    @Autowired
    private HttpServletRequest request;


    @Override
    public String sayHello() {
        return "当前应用的端口号:" + request.getServerPort();
    }

    @Override
    public String foo(@RequestParam(required = false) String foo) {
        return "hello "+foo+"!";
    }
}
