package com.hyc.user.service.impl;

import com.hyc.user.api.service.UserService;
import com.user.model.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;

@RestController
public class UserServiceImpl implements UserService {

    @Autowired
    private HttpServletRequest request;

    @Override
    public User findById(@PathVariable("id") String id) {
        if(id.equals("error")){
            throw new RuntimeException(id);
        }
        User user = new User();
        user.setId(id);
        user.setName(id + request.getServerPort() + new Date());
        return user;
    }

    @Override
    public String ribbon() {
        return "hello ribbon,port:" + request.getServerPort();
    }


}
