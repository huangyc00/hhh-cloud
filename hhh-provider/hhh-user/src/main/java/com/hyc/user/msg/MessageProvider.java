package com.hyc.user.msg;

import com.hyc.stream.DefaultProcess;
import com.hyc.user.api.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;

import javax.annotation.Resource;

public class MessageProvider {

//    @Autowired
    private DefaultProcess defaultProcess; // 消息的发送管道

    public void send(User user) {
        defaultProcess.output().send(MessageBuilder.withPayload(user).build()); // 创建并发送消息
    }

}
