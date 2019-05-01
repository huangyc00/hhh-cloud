package com.hyc.user.api.fallback;

import com.hyc.user.api.service.UserService;
import com.user.model.entity.User;

public class UserServiceFallBack implements UserService {


    @Override
    public User findById(String id) {
        return null;
    }

    @Override
    public String sendUserMsg(User user) {
        return null;
    }


}
