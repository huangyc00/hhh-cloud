//package com.hyc.admin.listener;
//
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.cloud.stream.annotation.StreamListener;
//import org.springframework.integration.annotation.ServiceActivator;
//import org.springframework.messaging.Message;
//import org.springframework.messaging.handler.annotation.Header;
//import org.springframework.messaging.support.MessageBuilder;
//import org.springframework.stereotype.Component;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//
///**
// * @author hyc
// * @description
// * @date 2019-04-15 20:43
// */
//@Slf4j
//@RestController
//public class TestController {
//
//    @Autowired
//    private TestTopic testTopic;
//
////    @GetMapping("/sendMessage")
////    public String messageWithMQ(@RequestParam String message) {
////        testTopic.output().send(MessageBuilder.withPayload(message).build());
////        return "ok";
////    }
////
////    /**
////     * 消息生产接口
////     *
////     * @param message
////     * @return
////     */
////    @GetMapping("/sendMessage2")
////    public String message2WithMQ(@RequestParam String message) {
////        testTopic.output().send(MessageBuilder.withPayload(message).setHeader("version", "1.0").build());
////        testTopic.output().send(MessageBuilder.withPayload(message).setHeader("version", "2.0").build());
////        return "ok";
////    }
//
////    /**
////     * 消息生产接口
////     *
////     * @param message
////     * @return
////     */
////    @GetMapping("/sendMessage3")
////    public String message3WithMQ(@RequestParam String message) {
////        log.info("Send: " + message);
////        testTopic.output().send(MessageBuilder.withPayload(message).setHeader("x-delay", 5000).build());
////        return "ok";
////    }
//
//    /**
//     * 消息生产接口
//     * @param message
//     * @return
//     */
//    @GetMapping("/sendMessage4")
//    public String message4WithMQ(@RequestParam String message) {
//        testTopic.output().send(MessageBuilder.withPayload(message).build());
//        return "ok";
//    }
////    /**
////     * 消息消费逻辑
////     */
////    @Slf4j
////    @Component
////    static class TestListener {
////
////        @StreamListener(value = TestTopic.INPUT, condition = "headers['version']=='1.0'")
////        public void receiveV1(String payload, @Header("version") String version) {
////            log.info("Received v1 : " + payload + ", " + version);
////        }
////
////        @StreamListener(value = TestTopic.INPUT, condition = "headers['version']=='2.0'")
////        public void receiveV2(String payload, @Header("version") String version) {
////            log.info("Received v2 : " + payload + ", " + version);
////        }
////    }
//
//    /**
//     * 消息消费逻辑
//     */
//    @Slf4j
//    @Component
//    static class TestListener {
//
//        @StreamListener(TestTopic.INPUT)
//        public void receive(String payload) {
//            log.info("Received: " + payload);
//            throw new RuntimeException("Message consumer failed!");
//        }
//
////        /**
////         * 消息消费失败的降级处理逻辑
////         *
////         * @param message
////         */
////        @ServiceActivator(inputChannel = "test-topic.stream-exception-handlers.errors")
////        public void error(Message<?> message) {
////            log.info("Message consumer failed, call fallback!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
////        }
//
//
//    }
//
////    int counter = 1;
////
////    @StreamListener(TestTopic.INPUT)
////    public void receive(String payload) {
////        log.info("Received: " + payload + ", " + counter);
////        if (counter == 3) {
////            counter = 1;
////            return;
////        } else {
////            counter++;
////            throw new RuntimeException("Message consumer failed!");
////        }
////    }
//}
