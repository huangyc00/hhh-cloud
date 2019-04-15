package com.hyc.admin.listener;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;

/**
 * @author hyc
 * @description
 * @date 2019-04-15 20:18
 */
@Slf4j
@EnableBinding(Sink.class)
public class SinkReceiver {


    @StreamListener(Sink.INPUT)
    public void receive(Object payload) {
        log.info("Received: " + payload);
    }
}
