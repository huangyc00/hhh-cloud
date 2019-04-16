//package com.hyc.admin.listener;
//
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.cloud.stream.annotation.StreamListener;
//import org.springframework.stereotype.Component;
//
///**
// * @author hyc
// * @description
// * @date 2019-04-15 20:44
// */
//@Slf4j
//@Component
//public class TestListener {
//
//    @StreamListener(TestTopic.INPUT)
//    public void receive(String payload) {
//        log.error("Received: " + payload);
////        throw new RuntimeException("BOOM!");
//    }
//
//}
