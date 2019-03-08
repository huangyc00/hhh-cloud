package com.hyc.admin.controller;

import com.hyc.user.api.entity.User;
import com.hyc.user.api.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

}
