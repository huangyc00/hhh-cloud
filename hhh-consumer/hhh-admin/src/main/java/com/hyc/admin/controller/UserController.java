package com.hyc.admin.controller;

import com.hyc.user.api.service.UserService;
import com.user.model.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/api/user/v1")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping(value = "/user/{id}")
    public User findById(@PathVariable("id")String id){
        User user = userService.findById(id);
        return user;
    }

    @PostMapping(value = "/test1")
    public String test1(){
        return "test1";
    }


    @Autowired
    RestTemplate restTemplate;

    @GetMapping(value = "/ribbon")
    public String ribbon(){
        return restTemplate.getForObject("hhh-provider-user/ribbon",String.class);
    }

}
