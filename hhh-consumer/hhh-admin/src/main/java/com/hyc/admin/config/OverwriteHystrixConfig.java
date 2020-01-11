//package com.hyc.admin.config;
//
//import UserFallBack;
//import User;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.bind.annotation.PathVariable;
//
///**
// * @author hyc
// * @description
// * @date 2019-05-01 16:18
// */
//@Configuration
//public class OverwriteHystrixConfig {
//
//    @Bean(name = "aaa")
//    public UserFallBack getMyUserFallBack() {
//        return new MyUserFallBack();
//    }
//
//
//
//}
//
//
//class MyUserFallBack extends UserFallBack {
//    @Override
//    public User findById(@PathVariable("id") String id) {
//        throw new RuntimeException("我是重写之后的userFallBack");
//    }
//}
