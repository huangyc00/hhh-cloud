package com.hyc.api.member.fallback;

import com.hyc.api.member.api.UserService;
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
        if(id.equals("member")){
            return new User();
        }
        throw new RuntimeException("调用失败");
    }

    @Override
    public String ribbon() {
       throw new RuntimeException("调用失败");
    }


}
