package com.hyc.api.member.api;

import com.hyc.api.member.fallback.UserFallBack;
import com.member.model.entity.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author hyc
 * @description
 * @date 2019-05-01 15:20
 */
@FeignClient(value = "hhh-member-service",fallback = UserFallBack.class)
public interface UserService {

    @GetMapping(value = "/api/user/{id}")
    User findById(@PathVariable("id") String id);

    @GetMapping(value = "/ribbon")
    String ribbon();
}
