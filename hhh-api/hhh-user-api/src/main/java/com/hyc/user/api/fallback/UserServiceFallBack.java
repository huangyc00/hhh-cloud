package com.hyc.user.api.fallback;

import com.hyc.user.api.entity.User;
import com.hyc.user.api.service.UserService;
import org.springframework.stereotype.Component;

public class UserServiceFallBack implements UserService {


    @Override
    public User findById(String id) {
        return null;
    }


}
