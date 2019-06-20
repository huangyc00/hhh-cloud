//package com.hyc.admin.listener;
//
//import org.springframework.cloud.stream.annotation.Input;
//import org.springframework.cloud.stream.annotation.Output;
//import org.springframework.messaging.MessageChannel;
//import org.springframework.messaging.SubscribableChannel;
//
///**
// * @author hyc
// * @description
// * @date 2019-04-15 20:41
// */
//public interface TestTopic {
//
//    String OUTPUT = "example-topic-output";
//    String INPUT = "example-topic-input";
//
//    @Output(TestTopic.OUTPUT)
//    MessageChannel output();
//
//    @Input(INPUT)
//    SubscribableChannel input();
//}
