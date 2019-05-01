package com.hyc.admin.controller;

import com.hyc.user.api.service.UserService;
import com.user.model.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

}
