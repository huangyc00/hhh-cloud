package com.hyc.admin.listener;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author hyc
 * @description
 * @date 2019-04-15 20:43
 */
@Slf4j
@RestController
public class TestController {

    @Autowired
    private TestTopic testTopic;

    @GetMapping("/sendMessage")
    public String messageWithMQ(@RequestParam String message) {
        testTopic.output().send(MessageBuilder.withPayload(message).build());
        return "ok";
    }
}
