package com.hyc.user.service.impl;

import com.hyc.user.api.entity.User;
import com.hyc.user.api.service.UserService;
import com.hyc.user.msg.MessageProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserServiceImpl implements UserService {

    @Override
    public User findById(String id) {
//        if("1".equals(id)){
            User user = new User();
            user.setId("hello world");
            return user;
//        }else{
//            throw new RuntimeException("hahahaha");
//        }

    }

    @Autowired
    private MessageProvider messageProvider;

    @Override
    public String sendUserMsg(User user) {
        messageProvider.send(user);
        return "success";
    }

}
