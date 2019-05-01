package com.hyc.user.api.service;

import com.user.model.entity.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(value = "hhh-provider-user")
public interface UserService {

    @GetMapping(value = "/api/user/{id}")
    User findById(@PathVariable("id") String id);

    @PostMapping(value = "/sendUserMsg")
    String sendUserMsg(@RequestBody User user);
}
