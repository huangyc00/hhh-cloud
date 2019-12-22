package com.hyc.user.api.fallback;

import com.hyc.user.api.service.UserService;
import com.member.model.entity.User;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author hyc
 * @description
 * @date 2019-05-01 15:21
 */
@Component
public class UserFallBack implements UserService {

    @Override
    public User findById(@PathVariable("id") String id) {
//        return null;
        if(id.equals("null")){
            return null;
        }
        if(id.equals("user")){
            return new User();
        }
        throw new RuntimeException("调用失败");
    }

    @Override
    public String ribbon() {
       throw new RuntimeException("调用失败");
    }


}
