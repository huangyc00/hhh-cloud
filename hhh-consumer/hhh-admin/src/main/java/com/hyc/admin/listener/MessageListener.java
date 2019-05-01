package com.hyc.admin.listener;

import com.user.model.entity.User;
import org.springframework.messaging.Message;

//@Component
//@EnableBinding(DefaultProcess.class)
public class MessageListener {

    //    @StreamListener(DefaultProcess.INPUT)
    public void input(Message<User> message) {
        System.err.println("【*** 消息接收 ***】" + message.getPayload());
    }
}
